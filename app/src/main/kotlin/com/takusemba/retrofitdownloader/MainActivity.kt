package com.takusemba.retrofitdownloader

import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.ResponseBody
import timber.log.Timber
import java.io.*
import java.util.regex.Pattern


class MainActivity : AppCompatActivity() {

    /**
     * 5MB downloadable sample file
     */
    //    private val contentUrl = "http://ipv4.download.thinkbroadband.com/5MB.zip"

    /**
     * 100MB downloadable sample file
     */
    //    private val contentUrl = "http://ipv4.download.thinkbroadband.com/100MB.zip"

    /**
     * 1GB downloadable sample file
     */
        private val contentUrl = "http://ipv4.download.thinkbroadband.com/1GB.zip"

    /**
     * 51,758 byte downloadable sample file
     */
//    private val contentUrl = "https://media.amazonwebservices.com/blog/2016/luna_1.jpg"

    private val apiClient = ApiClient()

    private lateinit var fileName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.streaming_download).setOnClickListener {
            val pattern = Pattern.compile("\\.")
            fileName = System.currentTimeMillis().toString() + "." + contentUrl.split(pattern).last()
            apiClient.downloadFileWithStreaming(contentUrl)
                    .map {
                        Timber.d("downloaded size: " + it.contentLength() + " saving to " + fileName)
                        writeResponseBodyToDisk(it)
                    }
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {
                                Timber.d("complete downloading")
                            }
                            ,
                            {
                                Timber.d("error: " + it.message)
                            }
                    )
        }

        findViewById<Button>(R.id.range_download).setOnClickListener {
            val pattern = Pattern.compile("\\.")
            fileName = System.currentTimeMillis().toString() + "." + contentUrl.split(pattern).last()
            Observable.range(1, Int.MAX_VALUE)
                    .flatMap {
                        apiClient.downloadFileWithRange(contentUrl, it)
                    }
                    .takeUntil {
                        it.contentLength() == 0L
                    }
                    .map {
                        Timber.d("downloaded size: " + it.contentLength() + " saving to " + fileName)
                        writeResponseBodyToDisk(it)
                    }
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {
                                Timber.d("complete downloading")
                            }
                            ,
                            {
                                Timber.d("error: " + it.message)
                            }
                    )

        }

    }

    /**
     * write response to local a file
     */
    private fun writeResponseBodyToDisk(body: ResponseBody): Boolean {
        try {

            val file = getPath()
            val inputStream: InputStream = body.byteStream()
            val outputStream: OutputStream = FileOutputStream(file, true)

            try {
                val fileReader = ByteArray(4096)
                val fileSize = body.contentLength()
                var fileSizeDownloaded: Long = 0

                while (true) {
                    val read = inputStream.read(fileReader)
                    if (read == -1) break

                    outputStream.write(fileReader, 0, read)
                    fileSizeDownloaded += read.toLong()

                    Timber.d("file download: $fileSizeDownloaded of $fileSize")
                }
                outputStream.flush()

                return true
            } catch (e: IOException) {
                return false
            } finally {
                inputStream.close()
                outputStream.close()
            }
        } catch (e: IOException) {
            return false
        }

    }

    /**
     * create or find proper path to save files
     */
    private fun getPath(): String {
        var path = ""
        val extStorageDir = Environment.getExternalStorageDirectory()
        if (extStorageDir.canWrite()) {
            val dirPath = File(extStorageDir.path + "/" + "RetrofitDownloader")
            if (!dirPath.exists()) {
                dirPath.mkdirs()
            }
            if (dirPath.canWrite()) {
                path = dirPath.path + "/" + fileName
            }
        }
        return path
    }
}
