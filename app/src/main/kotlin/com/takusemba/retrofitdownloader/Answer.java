// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/question.proto at 32:1
package tv.abema.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * / 回答
 */
public final class Answer extends Message<Answer, Answer.Builder> {
  public static final ProtoAdapter<Answer> ADAPTER = new ProtoAdapter_Answer();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_NUMBER = 0;

  /**
   * / 選択肢番号
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer number;

  public Answer(Integer number) {
    this(number, ByteString.EMPTY);
  }

  public Answer(Integer number, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.number = number;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.number = number;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Answer)) return false;
    Answer o = (Answer) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(number, o.number);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (number != null ? number.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (number != null) builder.append(", number=").append(number);
    return builder.replace(0, 2, "Answer{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Answer, Builder> {
    public Integer number;

    public Builder() {
    }

    /**
     * / 選択肢番号
     */
    public Builder number(Integer number) {
      this.number = number;
      return this;
    }

    @Override
    public Answer build() {
      return new Answer(number, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Answer extends ProtoAdapter<Answer> {
    ProtoAdapter_Answer() {
      super(FieldEncoding.LENGTH_DELIMITED, Answer.class);
    }

    @Override
    public int encodedSize(Answer value) {
      return (value.number != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.number) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Answer value) throws IOException {
      if (value.number != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.number);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Answer decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.number(ProtoAdapter.INT32.decode(reader)); break;
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
    public Answer redact(Answer value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
