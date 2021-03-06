// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video.proto at 167:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * 次のエピソード情報
 */
public final class NextProgramInfo extends Message<NextProgramInfo, NextProgramInfo.Builder> {
  public static final ProtoAdapter<NextProgramInfo> ADAPTER = new ProtoAdapter_NextProgramInfo();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_PROGRAMID = "";

  public static final String DEFAULT_TITLE = "";

  public static final String DEFAULT_THUMBIMG = "";

  public static final Long DEFAULT_IMAGEUPDATEDAT = 0L;

  public static final Long DEFAULT_ENDAT = 0L;

  public static final Long DEFAULT_FREEENDAT = 0L;

  /**
   * / 次のプログラムID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String programId;

  /**
   * / タイトル
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * / サムネイル画像
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String thumbImg;

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
   * / サムネイル画像の最終更新UNIX時間
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long imageUpdatedAt;

  /**
   * / 公開終了UINX時間
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long endAt;

  /**
   * / 無料公開終了UINX時間（無料公開期間中に限りセットされる）
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long freeEndAt;

  public NextProgramInfo(String programId, String title, String thumbImg, List<String> sceneThumbImages, Long imageUpdatedAt, Long endAt, Long freeEndAt) {
    this(programId, title, thumbImg, sceneThumbImages, imageUpdatedAt, endAt, freeEndAt, ByteString.EMPTY);
  }

  public NextProgramInfo(String programId, String title, String thumbImg, List<String> sceneThumbImages, Long imageUpdatedAt, Long endAt, Long freeEndAt, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.programId = programId;
    this.title = title;
    this.thumbImg = thumbImg;
    this.sceneThumbImages = Internal.immutableCopyOf("sceneThumbImages", sceneThumbImages);
    this.imageUpdatedAt = imageUpdatedAt;
    this.endAt = endAt;
    this.freeEndAt = freeEndAt;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.programId = programId;
    builder.title = title;
    builder.thumbImg = thumbImg;
    builder.sceneThumbImages = Internal.copyOf("sceneThumbImages", sceneThumbImages);
    builder.imageUpdatedAt = imageUpdatedAt;
    builder.endAt = endAt;
    builder.freeEndAt = freeEndAt;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof NextProgramInfo)) return false;
    NextProgramInfo o = (NextProgramInfo) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(programId, o.programId)
        && Internal.equals(title, o.title)
        && Internal.equals(thumbImg, o.thumbImg)
        && Internal.equals(sceneThumbImages, o.sceneThumbImages)
        && Internal.equals(imageUpdatedAt, o.imageUpdatedAt)
        && Internal.equals(endAt, o.endAt)
        && Internal.equals(freeEndAt, o.freeEndAt);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (programId != null ? programId.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (thumbImg != null ? thumbImg.hashCode() : 0);
      result = result * 37 + (sceneThumbImages != null ? sceneThumbImages.hashCode() : 1);
      result = result * 37 + (imageUpdatedAt != null ? imageUpdatedAt.hashCode() : 0);
      result = result * 37 + (endAt != null ? endAt.hashCode() : 0);
      result = result * 37 + (freeEndAt != null ? freeEndAt.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (programId != null) builder.append(", programId=").append(programId);
    if (title != null) builder.append(", title=").append(title);
    if (thumbImg != null) builder.append(", thumbImg=").append(thumbImg);
    if (sceneThumbImages != null) builder.append(", sceneThumbImages=").append(sceneThumbImages);
    if (imageUpdatedAt != null) builder.append(", imageUpdatedAt=").append(imageUpdatedAt);
    if (endAt != null) builder.append(", endAt=").append(endAt);
    if (freeEndAt != null) builder.append(", freeEndAt=").append(freeEndAt);
    return builder.replace(0, 2, "NextProgramInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<NextProgramInfo, Builder> {
    public String programId;

    public String title;

    public String thumbImg;

    public List<String> sceneThumbImages;

    public Long imageUpdatedAt;

    public Long endAt;

    public Long freeEndAt;

    public Builder() {
      sceneThumbImages = Internal.newMutableList();
    }

    /**
     * / 次のプログラムID
     */
    public Builder programId(String programId) {
      this.programId = programId;
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
     * / サムネイル画像
     */
    public Builder thumbImg(String thumbImg) {
      this.thumbImg = thumbImg;
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
     * / サムネイル画像の最終更新UNIX時間
     */
    public Builder imageUpdatedAt(Long imageUpdatedAt) {
      this.imageUpdatedAt = imageUpdatedAt;
      return this;
    }

    /**
     * / 公開終了UINX時間
     */
    public Builder endAt(Long endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     * / 無料公開終了UINX時間（無料公開期間中に限りセットされる）
     */
    public Builder freeEndAt(Long freeEndAt) {
      this.freeEndAt = freeEndAt;
      return this;
    }

    @Override
    public NextProgramInfo build() {
      return new NextProgramInfo(programId, title, thumbImg, sceneThumbImages, imageUpdatedAt, endAt, freeEndAt, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_NextProgramInfo extends ProtoAdapter<NextProgramInfo> {
    ProtoAdapter_NextProgramInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, NextProgramInfo.class);
    }

    @Override
    public int encodedSize(NextProgramInfo value) {
      return (value.programId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.programId) : 0)
          + (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.title) : 0)
          + (value.thumbImg != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.thumbImg) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, value.sceneThumbImages)
          + (value.imageUpdatedAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(5, value.imageUpdatedAt) : 0)
          + (value.endAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(6, value.endAt) : 0)
          + (value.freeEndAt != null ? ProtoAdapter.INT64.encodedSizeWithTag(7, value.freeEndAt) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, NextProgramInfo value) throws IOException {
      if (value.programId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.programId);
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.title);
      if (value.thumbImg != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.thumbImg);
      if (value.sceneThumbImages != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 4, value.sceneThumbImages);
      if (value.imageUpdatedAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.imageUpdatedAt);
      if (value.endAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 6, value.endAt);
      if (value.freeEndAt != null) ProtoAdapter.INT64.encodeWithTag(writer, 7, value.freeEndAt);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public NextProgramInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.programId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.thumbImg(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.sceneThumbImages.add(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.imageUpdatedAt(ProtoAdapter.INT64.decode(reader)); break;
          case 6: builder.endAt(ProtoAdapter.INT64.decode(reader)); break;
          case 7: builder.freeEndAt(ProtoAdapter.INT64.decode(reader)); break;
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
    public NextProgramInfo redact(NextProgramInfo value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
