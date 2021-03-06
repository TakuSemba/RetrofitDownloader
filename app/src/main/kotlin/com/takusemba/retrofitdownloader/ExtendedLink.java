// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/media.proto at 149:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class ExtendedLink extends Message<ExtendedLink, ExtendedLink.Builder> {
  public static final ProtoAdapter<ExtendedLink> ADAPTER = new ProtoAdapter_ExtendedLink();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_VALUE = "";

  public static final ExtendedLinkType DEFAULT_TYPE = ExtendedLinkType.NONE;

  public static final String DEFAULT_TITLE = "";

  /**
   * / リンク
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String value;

  /**
   * / リンク種別
   */
  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.ExtendedLink$ExtendedLinkType#ADAPTER"
  )
  public final ExtendedLinkType type;

  /**
   * / タイトル
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  public ExtendedLink(String value, ExtendedLinkType type, String title) {
    this(value, type, title, ByteString.EMPTY);
  }

  public ExtendedLink(String value, ExtendedLinkType type, String title, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.value = value;
    this.type = type;
    this.title = title;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.value = value;
    builder.type = type;
    builder.title = title;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ExtendedLink)) return false;
    ExtendedLink o = (ExtendedLink) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(value, o.value)
        && Internal.equals(type, o.type)
        && Internal.equals(title, o.title);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (value != null ? value.hashCode() : 0);
      result = result * 37 + (type != null ? type.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (value != null) builder.append(", value=").append(value);
    if (type != null) builder.append(", type=").append(type);
    if (title != null) builder.append(", title=").append(title);
    return builder.replace(0, 2, "ExtendedLink{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ExtendedLink, Builder> {
    public String value;

    public ExtendedLinkType type;

    public String title;

    public Builder() {
    }

    /**
     * / リンク
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * / リンク種別
     */
    public Builder type(ExtendedLinkType type) {
      this.type = type;
      return this;
    }

    /**
     * / タイトル
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    @Override
    public ExtendedLink build() {
      return new ExtendedLink(value, type, title, buildUnknownFields());
    }
  }

  public enum ExtendedLinkType implements WireEnum {
    /**
     * / 未定義
     */
    NONE(0),

    /**
     * / メールアドレス
     */
    MAIL(1),

    /**
     * / URL
     */
    URL(2);

    public static final ProtoAdapter<ExtendedLinkType> ADAPTER = ProtoAdapter.newEnumAdapter(ExtendedLinkType.class);

    private final int value;

    ExtendedLinkType(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static ExtendedLinkType fromValue(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return MAIL;
        case 2: return URL;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  private static final class ProtoAdapter_ExtendedLink extends ProtoAdapter<ExtendedLink> {
    ProtoAdapter_ExtendedLink() {
      super(FieldEncoding.LENGTH_DELIMITED, ExtendedLink.class);
    }

    @Override
    public int encodedSize(ExtendedLink value) {
      return (value.value != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.value) : 0)
          + (value.type != null ? ExtendedLinkType.ADAPTER.encodedSizeWithTag(2, value.type) : 0)
          + (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.title) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ExtendedLink value) throws IOException {
      if (value.value != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.value);
      if (value.type != null) ExtendedLinkType.ADAPTER.encodeWithTag(writer, 2, value.type);
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.title);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ExtendedLink decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.value(ProtoAdapter.STRING.decode(reader)); break;
          case 2: {
            try {
              builder.type(ExtendedLinkType.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 3: builder.title(ProtoAdapter.STRING.decode(reader)); break;
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
    public ExtendedLink redact(ExtendedLink value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
