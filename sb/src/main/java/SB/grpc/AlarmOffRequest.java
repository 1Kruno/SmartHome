// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: alarm.proto

package SB.grpc;

/**
 * Protobuf type {@code AlarmOffRequest}
 */
public  final class AlarmOffRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AlarmOffRequest)
    AlarmOffRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlarmOffRequest.newBuilder() to construct.
  private AlarmOffRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmOffRequest() {
    alarmoffreqmessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlarmOffRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            alarmoffreqmessage_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SB.grpc.Alarm.internal_static_AlarmOffRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SB.grpc.Alarm.internal_static_AlarmOffRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SB.grpc.AlarmOffRequest.class, SB.grpc.AlarmOffRequest.Builder.class);
  }

  public static final int ALARMOFFREQMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object alarmoffreqmessage_;
  /**
   * <code>string alarmoffreqmessage = 1;</code>
   */
  public java.lang.String getAlarmoffreqmessage() {
    java.lang.Object ref = alarmoffreqmessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alarmoffreqmessage_ = s;
      return s;
    }
  }
  /**
   * <code>string alarmoffreqmessage = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAlarmoffreqmessageBytes() {
    java.lang.Object ref = alarmoffreqmessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alarmoffreqmessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAlarmoffreqmessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, alarmoffreqmessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAlarmoffreqmessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, alarmoffreqmessage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SB.grpc.AlarmOffRequest)) {
      return super.equals(obj);
    }
    SB.grpc.AlarmOffRequest other = (SB.grpc.AlarmOffRequest) obj;

    boolean result = true;
    result = result && getAlarmoffreqmessage()
        .equals(other.getAlarmoffreqmessage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALARMOFFREQMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getAlarmoffreqmessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SB.grpc.AlarmOffRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SB.grpc.AlarmOffRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SB.grpc.AlarmOffRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SB.grpc.AlarmOffRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SB.grpc.AlarmOffRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AlarmOffRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AlarmOffRequest)
      SB.grpc.AlarmOffRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SB.grpc.Alarm.internal_static_AlarmOffRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SB.grpc.Alarm.internal_static_AlarmOffRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SB.grpc.AlarmOffRequest.class, SB.grpc.AlarmOffRequest.Builder.class);
    }

    // Construct using SB.grpc.AlarmOffRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      alarmoffreqmessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SB.grpc.Alarm.internal_static_AlarmOffRequest_descriptor;
    }

    @java.lang.Override
    public SB.grpc.AlarmOffRequest getDefaultInstanceForType() {
      return SB.grpc.AlarmOffRequest.getDefaultInstance();
    }

    @java.lang.Override
    public SB.grpc.AlarmOffRequest build() {
      SB.grpc.AlarmOffRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public SB.grpc.AlarmOffRequest buildPartial() {
      SB.grpc.AlarmOffRequest result = new SB.grpc.AlarmOffRequest(this);
      result.alarmoffreqmessage_ = alarmoffreqmessage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SB.grpc.AlarmOffRequest) {
        return mergeFrom((SB.grpc.AlarmOffRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SB.grpc.AlarmOffRequest other) {
      if (other == SB.grpc.AlarmOffRequest.getDefaultInstance()) return this;
      if (!other.getAlarmoffreqmessage().isEmpty()) {
        alarmoffreqmessage_ = other.alarmoffreqmessage_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      SB.grpc.AlarmOffRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SB.grpc.AlarmOffRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object alarmoffreqmessage_ = "";
    /**
     * <code>string alarmoffreqmessage = 1;</code>
     */
    public java.lang.String getAlarmoffreqmessage() {
      java.lang.Object ref = alarmoffreqmessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alarmoffreqmessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alarmoffreqmessage = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAlarmoffreqmessageBytes() {
      java.lang.Object ref = alarmoffreqmessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alarmoffreqmessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alarmoffreqmessage = 1;</code>
     */
    public Builder setAlarmoffreqmessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alarmoffreqmessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string alarmoffreqmessage = 1;</code>
     */
    public Builder clearAlarmoffreqmessage() {
      
      alarmoffreqmessage_ = getDefaultInstance().getAlarmoffreqmessage();
      onChanged();
      return this;
    }
    /**
     * <code>string alarmoffreqmessage = 1;</code>
     */
    public Builder setAlarmoffreqmessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alarmoffreqmessage_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AlarmOffRequest)
  }

  // @@protoc_insertion_point(class_scope:AlarmOffRequest)
  private static final SB.grpc.AlarmOffRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SB.grpc.AlarmOffRequest();
  }

  public static SB.grpc.AlarmOffRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmOffRequest>
      PARSER = new com.google.protobuf.AbstractParser<AlarmOffRequest>() {
    @java.lang.Override
    public AlarmOffRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlarmOffRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlarmOffRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlarmOffRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public SB.grpc.AlarmOffRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
