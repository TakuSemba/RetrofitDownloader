package com.takusemba.retrofitdownloader

import android.app.Application
import timber.log.Timber

/**
 * Created by takusemba on 2017/05/07.
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
