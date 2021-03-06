// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/faq.proto at 16:1
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
 * / Category FAQ category
 */
public final class Category extends Message<Category, Category.Builder> {
  public static final ProtoAdapter<Category> ADAPTER = new ProtoAdapter_Category();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TITLE = "";

  /**
   * / category title
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * / question and answers
   */
  @WireField(
      tag = 2,
      adapter = "tv.abema.protos.QuestionAnswer#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<QuestionAnswer> questionAnswers;

  public Category(String title, List<QuestionAnswer> questionAnswers) {
    this(title, questionAnswers, ByteString.EMPTY);
  }

  public Category(String title, List<QuestionAnswer> questionAnswers, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.title = title;
    this.questionAnswers = Internal.immutableCopyOf("questionAnswers", questionAnswers);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.title = title;
    builder.questionAnswers = Internal.copyOf("questionAnswers", questionAnswers);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Category)) return false;
    Category o = (Category) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(title, o.title)
        && Internal.equals(questionAnswers, o.questionAnswers);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (questionAnswers != null ? questionAnswers.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (title != null) builder.append(", title=").append(title);
    if (questionAnswers != null) builder.append(", questionAnswers=").append(questionAnswers);
    return builder.replace(0, 2, "Category{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Category, Builder> {
    public String title;

    public List<QuestionAnswer> questionAnswers;

    public Builder() {
      questionAnswers = Internal.newMutableList();
    }

    /**
     * / category title
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * / question and answers
     */
    public Builder questionAnswers(List<QuestionAnswer> questionAnswers) {
      Internal.checkElementsNotNull(questionAnswers);
      this.questionAnswers = questionAnswers;
      return this;
    }

    @Override
    public Category build() {
      return new Category(title, questionAnswers, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Category extends ProtoAdapter<Category> {
    ProtoAdapter_Category() {
      super(FieldEncoding.LENGTH_DELIMITED, Category.class);
    }

    @Override
    public int encodedSize(Category value) {
      return (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) : 0)
          + QuestionAnswer.ADAPTER.asRepeated().encodedSizeWithTag(2, value.questionAnswers)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Category value) throws IOException {
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
      if (value.questionAnswers != null) QuestionAnswer.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.questionAnswers);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Category decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.questionAnswers.add(QuestionAnswer.ADAPTER.decode(reader)); break;
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
    public Category redact(Category value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.questionAnswers, QuestionAnswer.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
