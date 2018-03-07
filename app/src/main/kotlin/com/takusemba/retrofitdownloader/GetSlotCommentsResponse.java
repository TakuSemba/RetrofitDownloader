// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/comment.proto at 32:1
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
 * / GetSlotCommentsResponse represents a response of getting published comments about the broadcast slot.
 */
public final class GetSlotCommentsResponse extends Message<GetSlotCommentsResponse, GetSlotCommentsResponse.Builder> {
  public static final ProtoAdapter<GetSlotCommentsResponse> ADAPTER = new ProtoAdapter_GetSlotCommentsResponse();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_COUNT = 0L;

  /**
   * / Comments about the broadcast slot
   */
  @WireField(
      tag = 1,
      adapter = "tv.abema.protos.Comment#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Comment> comments;

  /**
   * / Number of comments
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long count;

  public GetSlotCommentsResponse(List<Comment> comments, Long count) {
    this(comments, count, ByteString.EMPTY);
  }

  public GetSlotCommentsResponse(List<Comment> comments, Long count, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.comments = Internal.immutableCopyOf("comments", comments);
    this.count = count;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.comments = Internal.copyOf("comments", comments);
    builder.count = count;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetSlotCommentsResponse)) return false;
    GetSlotCommentsResponse o = (GetSlotCommentsResponse) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(comments, o.comments)
        && Internal.equals(count, o.count);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (comments != null ? comments.hashCode() : 1);
      result = result * 37 + (count != null ? count.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (comments != null) builder.append(", comments=").append(comments);
    if (count != null) builder.append(", count=").append(count);
    return builder.replace(0, 2, "GetSlotCommentsResponse{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetSlotCommentsResponse, Builder> {
    public List<Comment> comments;

    public Long count;

    public Builder() {
      comments = Internal.newMutableList();
    }

    /**
     * / Comments about the broadcast slot
     */
    public Builder comments(List<Comment> comments) {
      Internal.checkElementsNotNull(comments);
      this.comments = comments;
      return this;
    }

    /**
     * / Number of comments
     */
    public Builder count(Long count) {
      this.count = count;
      return this;
    }

    @Override
    public GetSlotCommentsResponse build() {
      return new GetSlotCommentsResponse(comments, count, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetSlotCommentsResponse extends ProtoAdapter<GetSlotCommentsResponse> {
    ProtoAdapter_GetSlotCommentsResponse() {
      super(FieldEncoding.LENGTH_DELIMITED, GetSlotCommentsResponse.class);
    }

    @Override
    public int encodedSize(GetSlotCommentsResponse value) {
      return Comment.ADAPTER.asRepeated().encodedSizeWithTag(1, value.comments)
          + (value.count != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, value.count) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetSlotCommentsResponse value) throws IOException {
      if (value.comments != null) Comment.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.comments);
      if (value.count != null) ProtoAdapter.INT64.encodeWithTag(writer, 2, value.count);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetSlotCommentsResponse decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.comments.add(Comment.ADAPTER.decode(reader)); break;
          case 2: builder.count(ProtoAdapter.INT64.decode(reader)); break;
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
    public GetSlotCommentsResponse redact(GetSlotCommentsResponse value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.comments, Comment.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}