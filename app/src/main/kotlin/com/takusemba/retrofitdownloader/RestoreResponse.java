// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/user.proto at 154:1
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
 * / ユーザー復元 response
 */
public final class RestoreResponse extends Message<RestoreResponse, RestoreResponse.Builder> {
  public static final ProtoAdapter<RestoreResponse> ADAPTER = new ProtoAdapter_RestoreResponse();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TOKEN = "";

  /**
   * / User profile
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.Profile#ADAPTER"
  )
  public final Profile profile;

  /**
   * / Request token
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String token;

  /**
   * / 購読情報
   */
  @WireField(
      tag = 3,
      adapter = "tv.abema.protos.UserSubscription#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<UserSubscription> subscriptions;

  public RestoreResponse(Profile profile, String token, List<UserSubscription> subscriptions) {
    this(profile, token, subscriptions, ByteString.EMPTY);
  }

  public RestoreResponse(Profile profile, String token, List<UserSubscription> subscriptions, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.profile = profile;
    this.token = token;
    this.subscriptions = Internal.immutableCopyOf("subscriptions", subscriptions);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.profile = profile;
    builder.token = token;
    builder.subscriptions = Internal.copyOf("subscriptions", subscriptions);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RestoreResponse)) return false;
    RestoreResponse o = (RestoreResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(profile, o.profile)
        && Internal.equals(token, o.token)
        && Internal.equals(subscriptions, o.subscriptions);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (profile != null ? profile.hashCode() : 0);
      result = result * 37 + (token != null ? token.hashCode() : 0);
      result = result * 37 + (subscriptions != null ? subscriptions.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (profile != null) builder.append(", profile=").append(profile);
    if (token != null) builder.append(", token=").append(token);
    if (subscriptions != null) builder.append(", subscriptions=").append(subscriptions);
    return builder.replace(0, 2, "RestoreResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RestoreResponse, Builder> {
    public Profile profile;

    public String token;

    public List<UserSubscription> subscriptions;

    public Builder() {
      subscriptions = Internal.newMutableList();
    }

    /**
     * / User profile
     */
    public Builder profile(Profile profile) {
      this.profile = profile;
      return this;
    }

    /**
     * / Request token
     */
    public Builder token(String token) {
      this.token = token;
      return this;
    }

    /**
     * / 購読情報
     */
    public Builder subscriptions(List<UserSubscription> subscriptions) {
      Internal.checkElementsNotNull(subscriptions);
      this.subscriptions = subscriptions;
      return this;
    }

    @Override
    public RestoreResponse build() {
      return new RestoreResponse(profile, token, subscriptions, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RestoreResponse extends ProtoAdapter<RestoreResponse> {
    ProtoAdapter_RestoreResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, RestoreResponse.class);
    }

    @Override
    public int encodedSize(RestoreResponse value) {
      return (value.profile != null ? Profile.ADAPTER.encodedSizeWithTag(1, value.profile) : 0)
          + (value.token != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.token) : 0)
          + UserSubscription.ADAPTER.asRepeated().encodedSizeWithTag(3, value.subscriptions)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RestoreResponse value) throws IOException {
      if (value.profile != null) Profile.ADAPTER.encodeWithTag(writer, 1, value.profile);
      if (value.token != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.token);
      if (value.subscriptions != null) UserSubscription.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.subscriptions);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RestoreResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.profile(Profile.ADAPTER.decode(reader)); break;
          case 2: builder.token(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.subscriptions.add(UserSubscription.ADAPTER.decode(reader)); break;
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
    public RestoreResponse redact(RestoreResponse value) {
      Builder builder = value.newBuilder();
      if (builder.profile != null) builder.profile = Profile.ADAPTER.redact(builder.profile);
      Internal.redactElements(builder.subscriptions, UserSubscription.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
