// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/user.proto at 172:1
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
 * / ワンタイムトークン適用 response
 */
public final class ApplyTokenResponse extends Message<ApplyTokenResponse, ApplyTokenResponse.Builder> {
  public static final ProtoAdapter<ApplyTokenResponse> ADAPTER = new ProtoAdapter_ApplyTokenResponse();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TOKEN = "";

  /**
   * / ユーザープロフィール
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.Profile#ADAPTER"
  )
  public final Profile profile;

  /**
   * / 移管後のJWT認証トークン
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

  public ApplyTokenResponse(Profile profile, String token, List<UserSubscription> subscriptions) {
    this(profile, token, subscriptions, ByteString.EMPTY);
  }

  public ApplyTokenResponse(Profile profile, String token, List<UserSubscription> subscriptions, ByteString unknownFields) {
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
    if (!(other instanceof ApplyTokenResponse)) return false;
    ApplyTokenResponse o = (ApplyTokenResponse) other;
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
    return builder.replace(0, 2, "ApplyTokenResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ApplyTokenResponse, Builder> {
    public Profile profile;

    public String token;

    public List<UserSubscription> subscriptions;

    public Builder() {
      subscriptions = Internal.newMutableList();
    }

    /**
     * / ユーザープロフィール
     */
    public Builder profile(Profile profile) {
      this.profile = profile;
      return this;
    }

    /**
     * / 移管後のJWT認証トークン
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
    public ApplyTokenResponse build() {
      return new ApplyTokenResponse(profile, token, subscriptions, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ApplyTokenResponse extends ProtoAdapter<ApplyTokenResponse> {
    ProtoAdapter_ApplyTokenResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, ApplyTokenResponse.class);
    }

    @Override
    public int encodedSize(ApplyTokenResponse value) {
      return (value.profile != null ? Profile.ADAPTER.encodedSizeWithTag(1, value.profile) : 0)
          + (value.token != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.token) : 0)
          + UserSubscription.ADAPTER.asRepeated().encodedSizeWithTag(3, value.subscriptions)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ApplyTokenResponse value) throws IOException {
      if (value.profile != null) Profile.ADAPTER.encodeWithTag(writer, 1, value.profile);
      if (value.token != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.token);
      if (value.subscriptions != null) UserSubscription.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.subscriptions);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ApplyTokenResponse decode(ProtoReader reader) throws IOException {
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
    public ApplyTokenResponse redact(ApplyTokenResponse value) {
      Builder builder = value.newBuilder();
      if (builder.profile != null) builder.profile = Profile.ADAPTER.redact(builder.profile);
      Internal.redactElements(builder.subscriptions, UserSubscription.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
