// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video_viewing.proto at 27:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * / ビデオ視聴コンテンツTimeshift
 */
public final class VideoViewingContentTimeshift extends Message<VideoViewingContentTimeshift, VideoViewingContentTimeshift.Builder> {
  public static final ProtoAdapter<VideoViewingContentTimeshift> ADAPTER = new ProtoAdapter_VideoViewingContentTimeshift();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  public static final Long DEFAULT_DURATION = 0L;

  public static final String DEFAULT_THUMBIMAGE = "";

  public static final Long DEFAULT_IMAGEUPDATEDAT = 0L;

  public static final String DEFAULT_TITLE = "";

  public static final Long DEFAULT_STARTAT = 0L;

  public static final Long DEFAULT_ENDAT = 0L;

  public static final Long DEFAULT_TIMESHIFTENDAT = 0L;

  public static final Boolean DEFAULT_TIMESHIFTFREE = false;

  public static final String DEFAULT_DISPLAYPROGRAMID = "";

  public static final String DEFAULT_CHANNELID = "";

  public static final Long DEFAULT_TIMESHIFTFREEENDAT = 0L;

  /**
   * / スロットID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  /**
   * / 本編尺（秒）
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long duration;

  /**
   * / サムネイル画像
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String thumbImage;

  /**
   * / シーンサムネイル画像一覧
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> sceneThumbImages;

  /**
   * / 画像最終更新UNIX時間
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long imageUpdatedAt;

  /**
   * / タイトル
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * / 放送開始UNIX時間
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long startAt;

  /**
   * / 放送終了UNIX時間
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long endAt;

  /**
   * / Timeshift公開終了UINX時間
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long timeshiftEndAt;

  /**
   * / Timeshift無料
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean timeshiftFree;

  /**
   * / 代表プログラムID
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String displayProgramId;

  /**
   * / チャンネルID
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String channelId;

  /**
   * / Timeshift無料公開終了UINX時間
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long timeshiftFreeEndAt;

  public VideoViewingContentTimeshift(String id, Long duration, String thumbImage, List<String> sceneThumbImages, Long imageUpdatedAt, String title, Long startAt, Long endAt, Long timeshiftEndAt, Boolean timeshiftFree, String displayProgramId, String channelId, Long timeshiftFreeEndAt) {
    this(id, duration, thumbImage, sceneThumbImages, imageUpdatedAt, title, startAt, endAt, timeshiftEndAt, timeshiftFree, displayProgramId, channelId, timeshiftFreeEndAt, ByteString.EMPTY);
  }

  public VideoViewingContentTimeshift(String id, Long duration, String thumbImage, List<String> sceneThumbImages, Long imageUpdatedAt, String title, Long startAt, Long endAt, Long timeshiftEndAt, Boolean timeshiftFree, String displayProgramId, String channelId, Long timeshiftFreeEndAt, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.duration = duration;
    this.thumbImage = thumbImage;
    this.sceneThumbImages = Internal.immutableCopyOf("sceneThumbImages", sceneThumbImages);
    this.imageUpdatedAt = imageUpdatedAt;
    this.title = title;
    this.startAt = startAt;
    this.endAt = endAt;
    this.timeshiftEndAt = timeshiftEndAt;
    this.timeshiftFree = timeshiftFree;
    this.displayProgramId = displayProgramId;
    this.channelId = channelId;
    this.timeshiftFreeEndAt = timeshiftFreeEndAt;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.duration = duration;
    builder.thumbImage = thumbImage;
    builder.sceneThumbImages = Internal.copyOf("sceneThumbImages", sceneThumbImages);
    builder.imageUpdatedAt = imageUpdatedAt;
    builder.title = title;
    builder.startAt = startAt;
    builder.endAt = endAt;
    builder.timeshiftEndAt = timeshiftEndAt;
    builder.timeshiftFree = timeshiftFree;
    builder.displayProgramId = displayProgramId;
    builder.channelId = channelId;
    builder.timeshiftFreeEndAt = timeshiftFreeEndAt;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoViewingContentTimeshift)) return false;
    VideoViewingContentTimeshift o = (VideoViewingContentTimeshift) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(duration, o.duration)
        && Internal.equals(thumbImage, o.thumbImage)
        && Internal.equals(sceneThumbImages, o.sceneThumbImages)
        && Internal.equals(imageUpdatedAt, o.imageUpdatedAt)
        && Internal.equals(title, o.title)
        && Internal.equals(startAt, o.startAt)
        && Internal.equals(endAt, o.endAt)
        && Internal.equals(timeshiftEndAt, o.timeshiftEndAt)
        && Internal.equals(timeshiftFree, o.timeshiftFree)
        && Internal.equals(displayProgramId, o.displayProgramId)
        && Internal.equals(channelId, o.channelId)
        && Internal.equals(timeshiftFreeEndAt, o.timeshiftFreeEndAt);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (duration != null ? duration.hashCode() : 0);
      result = result * 37 + (thumbImage != null ? thumbImage.hashCode() : 0);
      result = result * 37 + (sceneThumbImages != null ? sceneThumbImages.hashCode() : 1);
      result = result * 37 + (imageUpdatedAt != null ? imageUpdatedAt.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (startAt != null ? startAt.hashCode() : 0);
      result = result * 37 + (endAt != null ? endAt.hashCode() : 0);
      result = result * 37 + (timeshiftEndAt != null ? timeshiftEndAt.hashCode() : 0);
      result = result * 37 + (timeshiftFree != null ? timeshiftFree.hashCode() : 0);
      result = result * 37 + (displayProgramId != null ? displayProgramId.hashCode() : 0);
      result = result * 37 + (channelId != null ? channelId.hashCode() : 0);
      result = result * 37 + (timeshiftFreeEndAt != null ? timeshiftFreeEndAt.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (duration != null) builder.append(", duration=").append(duration);
    if (thumbImage != null) builder.append(", thumbImage=").append(thumbImage);
    if (sceneThumbImages != null) builder.append(", sceneThumbImages=").append(sceneThumbImages);
    if (imageUpdatedAt != null) builder.append(", imageUpdatedAt=").append(imageUpdatedAt);
    if (title != null) builder.append(", title=").append(title);
    if (startAt != null) builder.append(", startAt=").append(startAt);
    if (endAt != null) builder.append(", endAt=").append(endAt);
    if (timeshiftEndAt != null) builder.append(", timeshiftEndAt=").append(timeshiftEndAt);
    if (timeshiftFree != null) builder.append(", timeshiftFree=").append(timeshiftFree);
    if (displayProgramId != null) builder.append(", displayProgramId=").append(displayProgramId);
    if (channelId != null) builder.append(", channelId=").append(channelId);
    if (timeshiftFreeEndAt != null) builder.append(", timeshiftFreeEndAt=").append(timeshiftFreeEndAt);
    return builder.replace(0, 2, "VideoViewingContentTimeshift{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VideoViewingContentTimeshift, Builder> {
    public String id;

    public Long duration;

    public String thumbImage;

    public List<String> sceneThumbImages;

    public Long imageUpdatedAt;

    public String title;

    public Long startAt;

    public Long endAt;

    public Long timeshiftEndAt;

    public Boolean timeshiftFree;

    public String displayProgramId;

    public String channelId;

    public Long timeshiftFreeEndAt;

    public Builder() {
      sceneThumbImages = Internal.newMutableList();
    }

    /**
     * / スロットID
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * / 本編尺（秒）
     */
    public Builder duration(Long duration) {
      this.duration = duration;
      return this;
    }

    /**
     * / サムネイル画像
     */
    public Builder thumbImage(String thumbImage) {
      this.thumbImage = thumbImage;
      return this;
    }

    /**
     * / シーンサムネイル画像一覧
     */
    public Builder sceneThumbImages(List<String> sceneThumbImages) {
      Internal.checkElementsNotNull(sceneThumbImages);
      this.sceneThumbImages = sceneThumbImages;
      return this;
    }

    /**
     * / 画像最終更新UNIX時間
     */
    public Builder imageUpdatedAt(Long imageUpdatedAt) {
      this.imageUpdatedAt = imageUpdatedAt;
      return this;
    }

    /**
     * / タイトル
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * / 放送開始UNIX時間
     */
    public Builder startAt(Long startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     * / 放送終了UNIX時間
     */
    public Builder endAt(Long endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     * / Timeshift公開終了UINX時間
     */
    public Builder timeshiftEndAt(Long timeshiftEndAt) {
      this.timeshiftEndAt = timeshiftEndAt;
      return this;
    }

    /**
     * / Timeshift無料
     */
    public Builder timeshiftFree(Boolean timeshiftFree) {
      this.timeshiftFree = timeshiftFree;
      return this;
    }

    /**
     * / 代表プログラムID
     */
    public Builder displayProgramId(String displayProgramId) {
      this.displayProgramId = displayProgramId;
      return this;
    }

    /**
     * / チャンネルID
     */
    public Builder channelId(String channelId) {
      this.channelId = channelId;
      return this;
    }

    /**
     * / Timeshift無料公開終了UINX時間
     */
    public Builder timeshiftFreeEndAt(Long timeshiftFreeEndAt) {
      this.timeshiftFreeEndAt = timeshiftFreeEndAt;
      return this;
    }

    @Override
    public VideoViewingContentTimeshift build() {
      return new VideoViewingContentTimeshift(id, duration, thumbImage, sceneThumbImages, imageUpdatedAt, title, startAt, endAt, timeshiftEndAt, timeshiftFree, displayProgramId, channelId, timeshiftFreeEndAt, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VideoViewingContentTimeshift extends ProtoAdapter<VideoViewingContentTimeshift> {
    ProtoAdapter_VideoViewingContentTimeshift() {
      super(FieldEncoding.LENGTH_DELIMITED, VideoViewingContentTimeshift.class);
    }

    @Override
    public int encodedSize(VideoViewingContentTimeshift value) {
      return (value.id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) : 0)
          + (value.duration != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, value.duration) : 0)
          + (value.thumbImage != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.thumbImage) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, value.sceneThumbImages)
          + (value.imageUpdatedAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(5, value.imageUpdatedAt) : 0)
          + (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.title) : 0)
          + (value.startAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(7, value.startAt) : 0)
          + (value.endAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(8, value.endAt) : 0)
          + (value.timeshiftEndAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(9, value.timeshiftEndAt) : 0)
          + (value.timeshiftFree != null ? ProtoAdapter.BOOL.encodedSizeWithTag(10, value.timeshiftFree) : 0)
          + (value.displayProgramId != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.displayProgramId) : 0)
          + (value.channelId != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.channelId) : 0)
          + (value.timeshiftFreeEndAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(13, value.timeshiftFreeEndAt) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, VideoViewingContentTimeshift value) throws IOException {
      if (value.id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
      if (value.duration != null) ProtoAdapter.INT64.encodeWithTag(writer, 2, value.duration);
      if (value.thumbImage != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.thumbImage);
      if (value.sceneThumbImages != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 4, value.sceneThumbImages);
      if (value.imageUpdatedAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.imageUpdatedAt);
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.title);
      if (value.startAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 7, value.startAt);
      if (value.endAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 8, value.endAt);
      if (value.timeshiftEndAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 9, value.timeshiftEndAt);
      if (value.timeshiftFree != null) ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.timeshiftFree);
      if (value.displayProgramId != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.displayProgramId);
      if (value.channelId != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.channelId);
      if (value.timeshiftFreeEndAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 13, value.timeshiftFreeEndAt);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VideoViewingContentTimeshift decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.duration(ProtoAdapter.INT64.decode(reader)); break;
          case 3: builder.thumbImage(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.sceneThumbImages.add(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.imageUpdatedAt(ProtoAdapter.INT64.decode(reader)); break;
          case 6: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.startAt(ProtoAdapter.INT64.decode(reader)); break;
          case 8: builder.endAt(ProtoAdapter.INT64.decode(reader)); break;
          case 9: builder.timeshiftEndAt(ProtoAdapter.INT64.decode(reader)); break;
          case 10: builder.timeshiftFree(ProtoAdapter.BOOL.decode(reader)); break;
          case 11: builder.displayProgramId(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.channelId(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.timeshiftFreeEndAt(ProtoAdapter.INT64.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public VideoViewingContentTimeshift redact(VideoViewingContentTimeshift value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
