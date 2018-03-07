// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/highlight_popup.proto at 12:1
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
 * / 今日のみどころポップアップ
 */
public final class DailyHighlightPopup extends Message<DailyHighlightPopup, DailyHighlightPopup.Builder> {
  public static final ProtoAdapter<DailyHighlightPopup> ADAPTER = new ProtoAdapter_DailyHighlightPopup();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  public static final String DEFAULT_NAME = "";

  public static final DailyHighlightPopupType DEFAULT_TYPE = DailyHighlightPopupType.SCHEDULED;

  /**
   * / ポップアップID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  /**
   * / ポップアップ名
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * / 放送枠一覧
   */
  @WireField(
      tag = 3,
      adapter = "tv.abema.protos.DailyHighlightPopupSlot#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<DailyHighlightPopupSlot> slots;

  /**
   * / ポップアップタイプ
   */
  @WireField(
      tag = 4,
      adapter = "tv.abema.protos.DailyHighlightPopupType#ADAPTER"
  )
  public final DailyHighlightPopupType type;

  public DailyHighlightPopup(String id, String name, List<DailyHighlightPopupSlot> slots, DailyHighlightPopupType type) {
    this(id, name, slots, type, ByteString.EMPTY);
  }

  public DailyHighlightPopup(String id, String name, List<DailyHighlightPopupSlot> slots, DailyHighlightPopupType type, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.name = name;
    this.slots = Internal.immutableCopyOf("slots", slots);
    this.type = type;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.name = name;
    builder.slots = Internal.copyOf("slots", slots);
    builder.type = type;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DailyHighlightPopup)) return false;
    DailyHighlightPopup o = (DailyHighlightPopup) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(name, o.name)
        && Internal.equals(slots, o.slots)
        && Internal.equals(type, o.type);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (slots != null ? slots.hashCode() : 1);
      result = result * 37 + (type != null ? type.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (name != null) builder.append(", name=").append(name);
    if (slots != null) builder.append(", slots=").append(slots);
    if (type != null) builder.append(", type=").append(type);
    return builder.replace(0, 2, "DailyHighlightPopup{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DailyHighlightPopup, Builder> {
    public String id;

    public String name;

    public List<DailyHighlightPopupSlot> slots;

    public DailyHighlightPopupType type;

    public Builder() {
      slots = Internal.newMutableList();
    }

    /**
     * / ポップアップID
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * / ポップアップ名
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * / 放送枠一覧
     */
    public Builder slots(List<DailyHighlightPopupSlot> slots) {
      Internal.checkElementsNotNull(slots);
      this.slots = slots;
      return this;
    }

    /**
     * / ポップアップタイプ
     */
    public Builder type(DailyHighlightPopupType type) {
      this.type = type;
      return this;
    }

    @Override
    public DailyHighlightPopup build() {
      return new DailyHighlightPopup(id, name, slots, type, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_DailyHighlightPopup extends ProtoAdapter<DailyHighlightPopup> {
    ProtoAdapter_DailyHighlightPopup() {
      super(FieldEncoding.LENGTH_DELIMITED, DailyHighlightPopup.class);
    }

    @Override
    public int encodedSize(DailyHighlightPopup value) {
      return (value.id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) : 0)
          + (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.name) : 0)
          + DailyHighlightPopupSlot.ADAPTER.asRepeated().encodedSizeWithTag(3, value.slots)
          + (value.type != null ? DailyHighlightPopupType.ADAPTER.encodedSizeWithTag(4, value.type) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DailyHighlightPopup value) throws IOException {
      if (value.id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.name);
      if (value.slots != null) DailyHighlightPopupSlot.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.slots);
      if (value.type != null) DailyHighlightPopupType.ADAPTER.encodeWithTag(writer, 4, value.type);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DailyHighlightPopup decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.slots.add(DailyHighlightPopupSlot.ADAPTER.decode(reader)); break;
          case 4: {
            try {
              builder.type(DailyHighlightPopupType.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
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
    public DailyHighlightPopup redact(DailyHighlightPopup value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.slots, DailyHighlightPopupSlot.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}