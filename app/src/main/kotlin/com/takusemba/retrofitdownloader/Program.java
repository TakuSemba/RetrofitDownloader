// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/media.proto at 19:1
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
 * / 番組情報
 */
public final class Program extends Message<Program, Program.Builder> {
  public static final ProtoAdapter<Program> ADAPTER = new ProtoAdapter_Program();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  public static final String DEFAULT_SERIESID = "";

  /**
   * / 番組ID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  /**
   * / シリーズID
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String seriesId;

  /**
   * / 番組エピソード情報
   */
  @WireField(
      tag = 3,
      adapter = "tv.abema.protos.ProgramEpisode#ADAPTER"
  )
  public final ProgramEpisode episode;

  /**
   * / 番組クレジット情報
   */
  @WireField(
      tag = 4,
      adapter = "tv.abema.protos.ProgramCredit#ADAPTER"
  )
  public final ProgramCredit credit;

  /**
   * / 番組納品情報
   */
  @WireField(
      tag = 5,
      adapter = "tv.abema.protos.ProgramProvidedInfo#ADAPTER"
  )
  public final ProgramProvidedInfo providedInfo;

  public Program(String id, String seriesId, ProgramEpisode episode, ProgramCredit credit, ProgramProvidedInfo providedInfo) {
    this(id, seriesId, episode, credit, providedInfo, ByteString.EMPTY);
  }

  public Program(String id, String seriesId, ProgramEpisode episode, ProgramCredit credit, ProgramProvidedInfo providedInfo, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.seriesId = seriesId;
    this.episode = episode;
    this.credit = credit;
    this.providedInfo = providedInfo;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.seriesId = seriesId;
    builder.episode = episode;
    builder.credit = credit;
    builder.providedInfo = providedInfo;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Program)) return false;
    Program o = (Program) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(seriesId, o.seriesId)
        && Internal.equals(episode, o.episode)
        && Internal.equals(credit, o.credit)
        && Internal.equals(providedInfo, o.providedInfo);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (seriesId != null ? seriesId.hashCode() : 0);
      result = result * 37 + (episode != null ? episode.hashCode() : 0);
      result = result * 37 + (credit != null ? credit.hashCode() : 0);
      result = result * 37 + (providedInfo != null ? providedInfo.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (seriesId != null) builder.append(", seriesId=").append(seriesId);
    if (episode != null) builder.append(", episode=").append(episode);
    if (credit != null) builder.append(", credit=").append(credit);
    if (providedInfo != null) builder.append(", providedInfo=").append(providedInfo);
    return builder.replace(0, 2, "Program{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Program, Builder> {
    public String id;

    public String seriesId;

    public ProgramEpisode episode;

    public ProgramCredit credit;

    public ProgramProvidedInfo providedInfo;

    public Builder() {
    }

    /**
     * / 番組ID
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * / シリーズID
     */
    public Builder seriesId(String seriesId) {
      this.seriesId = seriesId;
      return this;
    }

    /**
     * / 番組エピソード情報
     */
    public Builder episode(ProgramEpisode episode) {
      this.episode = episode;
      return this;
    }

    /**
     * / 番組クレジット情報
     */
    public Builder credit(ProgramCredit credit) {
      this.credit = credit;
      return this;
    }

    /**
     * / 番組納品情報
     */
    public Builder providedInfo(ProgramProvidedInfo providedInfo) {
      this.providedInfo = providedInfo;
      return this;
    }

    @Override
    public Program build() {
      return new Program(id, seriesId, episode, credit, providedInfo, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Program extends ProtoAdapter<Program> {
    ProtoAdapter_Program() {
      super(FieldEncoding.LENGTH_DELIMITED, Program.class);
    }

    @Override
    public int encodedSize(Program value) {
      return (value.id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) : 0)
          + (value.seriesId != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.seriesId) : 0)
          + (value.episode != null ? ProgramEpisode.ADAPTER.encodedSizeWithTag(3, value.episode) : 0)
          + (value.credit != null ? ProgramCredit.ADAPTER.encodedSizeWithTag(4, value.credit) : 0)
          + (value.providedInfo != null ? ProgramProvidedInfo.ADAPTER.encodedSizeWithTag(5, value.providedInfo) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Program value) throws IOException {
      if (value.id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
      if (value.seriesId != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.seriesId);
      if (value.episode != null) ProgramEpisode.ADAPTER.encodeWithTag(writer, 3, value.episode);
      if (value.credit != null) ProgramCredit.ADAPTER.encodeWithTag(writer, 4, value.credit);
      if (value.providedInfo != null) ProgramProvidedInfo.ADAPTER.encodeWithTag(writer, 5, value.providedInfo);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Program decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.seriesId(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.episode(ProgramEpisode.ADAPTER.decode(reader)); break;
          case 4: builder.credit(ProgramCredit.ADAPTER.decode(reader)); break;
          case 5: builder.providedInfo(ProgramProvidedInfo.ADAPTER.decode(reader)); break;
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
    public Program redact(Program value) {
      Builder builder = value.newBuilder();
      if (builder.episode != null) builder.episode = ProgramEpisode.ADAPTER.redact(builder.episode);
      if (builder.credit != null) builder.credit = ProgramCredit.ADAPTER.redact(builder.credit);
      if (builder.providedInfo != null) builder.providedInfo = ProgramProvidedInfo.ADAPTER.redact(builder.providedInfo);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
