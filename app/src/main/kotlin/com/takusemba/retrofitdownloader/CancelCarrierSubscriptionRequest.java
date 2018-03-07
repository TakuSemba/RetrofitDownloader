// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/subscription.proto at 93:1
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
import okio.ByteString;

/**
 * / キャリア決済月額課金解約 request
 */
public final class CancelCarrierSubscriptionRequest extends Message<CancelCarrierSubscriptionRequest, CancelCarrierSubscriptionRequest.Builder> {
  public static final ProtoAdapter<CancelCarrierSubscriptionRequest> ADAPTER = new ProtoAdapter_CancelCarrierSubscriptionRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_PRODUCTID = "";

  /**
   * / プロダクトID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String productId;

  public CancelCarrierSubscriptionRequest(String productId) {
    this(productId, ByteString.EMPTY);
  }

  public CancelCarrierSubscriptionRequest(String productId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.productId = productId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.productId = productId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CancelCarrierSubscriptionRequest)) return false;
    CancelCarrierSubscriptionRequest o = (CancelCarrierSubscriptionRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(productId, o.productId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (productId != null ? productId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (productId != null) builder.append(", productId=").append(productId);
    return builder.replace(0, 2, "CancelCarrierSubscriptionRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<CancelCarrierSubscriptionRequest, Builder> {
    public String productId;

    public Builder() {
    }

    /**
     * / プロダクトID
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    @Override
    public CancelCarrierSubscriptionRequest build() {
      return new CancelCarrierSubscriptionRequest(productId, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_CancelCarrierSubscriptionRequest extends ProtoAdapter<CancelCarrierSubscriptionRequest> {
    ProtoAdapter_CancelCarrierSubscriptionRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, CancelCarrierSubscriptionRequest.class);
    }

    @Override
    public int encodedSize(CancelCarrierSubscriptionRequest value) {
      return (value.productId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.productId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, CancelCarrierSubscriptionRequest value) throws IOException {
      if (value.productId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.productId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public CancelCarrierSubscriptionRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.productId(ProtoAdapter.STRING.decode(reader)); break;
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
    public CancelCarrierSubscriptionRequest redact(CancelCarrierSubscriptionRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}