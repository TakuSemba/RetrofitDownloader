// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/user.proto at 120:1
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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * Represents a request of link twitter account
 */
public final class LinkTwitterRequest extends Message<LinkTwitterRequest, LinkTwitterRequest.Builder> {
  public static final ProtoAdapter<LinkTwitterRequest> ADAPTER = new ProtoAdapter_LinkTwitterRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ACCESSTOKEN = "";

  public static final String DEFAULT_ACCESSTOKENSECRET = "";

  public static final Boolean DEFAULT_OVERWRITE = false;

  /**
   * / Access token from Twitter
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String accessToken;

  /**
   * / Access token secret from Twitter
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String accessTokenSecret;

  /**
   * / Force overwriting
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean overwrite;

  public LinkTwitterRequest(String accessToken, String accessTokenSecret, Boolean overwrite) {
    this(accessToken, accessTokenSecret, overwrite, ByteString.EMPTY);
  }

  public LinkTwitterRequest(String accessToken, String accessTokenSecret, Boolean overwrite, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.accessToken = accessToken;
    this.accessTokenSecret = accessTokenSecret;
    this.overwrite = overwrite;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.accessToken = accessToken;
    builder.accessTokenSecret = accessTokenSecret;
    builder.overwrite = overwrite;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LinkTwitterRequest)) return false;
    LinkTwitterRequest o = (LinkTwitterRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(accessToken, o.accessToken)
        && Internal.equals(accessTokenSecret, o.accessTokenSecret)
        && Internal.equals(overwrite, o.overwrite);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (accessToken != null ? accessToken.hashCode() : 0);
      result = result * 37 + (accessTokenSecret != null ? accessTokenSecret.hashCode() : 0);
      result = result * 37 + (overwrite != null ? overwrite.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (accessToken != null) builder.append(", accessToken=").append(accessToken);
    if (accessTokenSecret != null) builder.append(", accessTokenSecret=").append(accessTokenSecret);
    if (overwrite != null) builder.append(", overwrite=").append(overwrite);
    return builder.replace(0, 2, "LinkTwitterRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<LinkTwitterRequest, Builder> {
    public String accessToken;

    public String accessTokenSecret;

    public Boolean overwrite;

    public Builder() {
    }

    /**
     * / Access token from Twitter
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    /**
     * / Access token secret from Twitter
     */
    public Builder accessTokenSecret(String accessTokenSecret) {
      this.accessTokenSecret = accessTokenSecret;
      return this;
    }

    /**
     * / Force overwriting
     */
    public Builder overwrite(Boolean overwrite) {
      this.overwrite = overwrite;
      return this;
    }

    @Override
    public LinkTwitterRequest build() {
      return new LinkTwitterRequest(accessToken, accessTokenSecret, overwrite, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_LinkTwitterRequest extends ProtoAdapter<LinkTwitterRequest> {
    ProtoAdapter_LinkTwitterRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, LinkTwitterRequest.class);
    }

    @Override
    public int encodedSize(LinkTwitterRequest value) {
      return (value.accessToken != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.accessToken) : 0)
          + (value.accessTokenSecret != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.accessTokenSecret) : 0)
          + (value.overwrite != null ? ProtoAdapter.BOOL.encodedSizeWithTag(3, value.overwrite) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, LinkTwitterRequest value) throws IOException {
      if (value.accessToken != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.accessToken);
      if (value.accessTokenSecret != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.accessTokenSecret);
      if (value.overwrite != null) ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.overwrite);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public LinkTwitterRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.accessToken(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.accessTokenSecret(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.overwrite(ProtoAdapter.BOOL.decode(reader)); break;
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
    public LinkTwitterRequest redact(LinkTwitterRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}