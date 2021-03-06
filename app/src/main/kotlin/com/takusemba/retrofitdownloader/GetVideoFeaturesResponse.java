// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/video_feature.proto at 55:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * / ビデオ特集枠の一覧取得レスポンス
 */
public final class GetVideoFeaturesResponse extends Message<GetVideoFeaturesResponse, GetVideoFeaturesResponse.Builder> {
  public static final ProtoAdapter<GetVideoFeaturesResponse> ADAPTER = new ProtoAdapter_GetVideoFeaturesResponse();

  private static final long serialVersionUID = 0L;

  /**
   * / ビデオ特集枠一覧
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.VideoFeature#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<VideoFeature> features;

  public GetVideoFeaturesResponse(List<VideoFeature> features) {
    this(features, ByteString.EMPTY);
  }

  public GetVideoFeaturesResponse(List<VideoFeature> features, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.features = Internal.immutableCopyOf("features", features);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.features = Internal.copyOf("features", features);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetVideoFeaturesResponse)) return false;
    GetVideoFeaturesResponse o = (GetVideoFeaturesResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(features, o.features);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (features != null ? features.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (features != null) builder.append(", features=").append(features);
    return builder.replace(0, 2, "GetVideoFeaturesResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetVideoFeaturesResponse, Builder> {
    public List<VideoFeature> features;

    public Builder() {
      features = Internal.newMutableList();
    }

    /**
     * / ビデオ特集枠一覧
     */
    public Builder features(List<VideoFeature> features) {
      Internal.checkElementsNotNull(features);
      this.features = features;
      return this;
    }

    @Override
    public GetVideoFeaturesResponse build() {
      return new GetVideoFeaturesResponse(features, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetVideoFeaturesResponse extends ProtoAdapter<GetVideoFeaturesResponse> {
    ProtoAdapter_GetVideoFeaturesResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetVideoFeaturesResponse.class);
    }

    @Override
    public int encodedSize(GetVideoFeaturesResponse value) {
      return VideoFeature.ADAPTER.asRepeated().encodedSizeWithTag(1, value.features)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetVideoFeaturesResponse value) throws IOException {
      if (value.features != null) VideoFeature.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.features);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetVideoFeaturesResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.features.add(VideoFeature.ADAPTER.decode(reader)); break;
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
    public GetVideoFeaturesResponse redact(GetVideoFeaturesResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.features, VideoFeature.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
