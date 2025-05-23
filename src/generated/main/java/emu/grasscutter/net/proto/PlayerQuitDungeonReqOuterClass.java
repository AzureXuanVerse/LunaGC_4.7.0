// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerQuitDungeonReq.proto

package emu.grasscutter.net.proto;

public final class PlayerQuitDungeonReqOuterClass {
  private PlayerQuitDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerQuitDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerQuitDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_quit_immediately = 7;</code>
     * @return The isQuitImmediately.
     */
    boolean getIsQuitImmediately();

    /**
     * <code>uint32 point_id = 12;</code>
     * @return The pointId.
     */
    int getPointId();
  }
  /**
   * <pre>
   * CmdId: 4653
   *4.7.0
   * </pre>
   *
   * Protobuf type {@code PlayerQuitDungeonReq}
   */
  public static final class PlayerQuitDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerQuitDungeonReq)
      PlayerQuitDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerQuitDungeonReq.newBuilder() to construct.
    private PlayerQuitDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerQuitDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerQuitDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerQuitDungeonReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 56: {

              isQuitImmediately_ = input.readBool();
              break;
            }
            case 96: {

              pointId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.internal_static_PlayerQuitDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.internal_static_PlayerQuitDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq.class, emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq.Builder.class);
    }

    public static final int IS_QUIT_IMMEDIATELY_FIELD_NUMBER = 7;
    private boolean isQuitImmediately_;
    /**
     * <code>bool is_quit_immediately = 7;</code>
     * @return The isQuitImmediately.
     */
    @java.lang.Override
    public boolean getIsQuitImmediately() {
      return isQuitImmediately_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 12;
    private int pointId_;
    /**
     * <code>uint32 point_id = 12;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
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
      if (isQuitImmediately_ != false) {
        output.writeBool(7, isQuitImmediately_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(12, pointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isQuitImmediately_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isQuitImmediately_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, pointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq other = (emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq) obj;

      if (getIsQuitImmediately()
          != other.getIsQuitImmediately()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_QUIT_IMMEDIATELY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsQuitImmediately());
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq prototype) {
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
     * <pre>
     * CmdId: 4653
     *4.7.0
     * </pre>
     *
     * Protobuf type {@code PlayerQuitDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerQuitDungeonReq)
        emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.internal_static_PlayerQuitDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.internal_static_PlayerQuitDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq.class, emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq.newBuilder()
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
        isQuitImmediately_ = false;

        pointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.internal_static_PlayerQuitDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq build() {
        emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq buildPartial() {
        emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq result = new emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq(this);
        result.isQuitImmediately_ = isQuitImmediately_;
        result.pointId_ = pointId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq other) {
        if (other == emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq.getDefaultInstance()) return this;
        if (other.getIsQuitImmediately() != false) {
          setIsQuitImmediately(other.getIsQuitImmediately());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
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
        emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isQuitImmediately_ ;
      /**
       * <code>bool is_quit_immediately = 7;</code>
       * @return The isQuitImmediately.
       */
      @java.lang.Override
      public boolean getIsQuitImmediately() {
        return isQuitImmediately_;
      }
      /**
       * <code>bool is_quit_immediately = 7;</code>
       * @param value The isQuitImmediately to set.
       * @return This builder for chaining.
       */
      public Builder setIsQuitImmediately(boolean value) {
        
        isQuitImmediately_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_quit_immediately = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsQuitImmediately() {
        
        isQuitImmediately_ = false;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 12;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 12;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerQuitDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerQuitDungeonReq)
    private static final emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq();
    }

    public static emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerQuitDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerQuitDungeonReq>() {
      @java.lang.Override
      public PlayerQuitDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerQuitDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerQuitDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerQuitDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerQuitDungeonReqOuterClass.PlayerQuitDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerQuitDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerQuitDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PlayerQuitDungeonReq.proto\"E\n\024PlayerQu" +
      "itDungeonReq\022\033\n\023is_quit_immediately\030\007 \001(" +
      "\010\022\020\n\010point_id\030\014 \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerQuitDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerQuitDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerQuitDungeonReq_descriptor,
        new java.lang.String[] { "IsQuitImmediately", "PointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
