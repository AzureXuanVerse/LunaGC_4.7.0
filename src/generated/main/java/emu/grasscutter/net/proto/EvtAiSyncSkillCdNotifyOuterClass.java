// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAiSyncSkillCdNotify.proto

package emu.grasscutter.net.proto;

public final class EvtAiSyncSkillCdNotifyOuterClass {
  private EvtAiSyncSkillCdNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAiSyncSkillCdNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAiSyncSkillCdNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */
    int getAiCdMapCount();
    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */
    boolean containsAiCdMap(
        int key);
    /**
     * Use {@link #getAiCdMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>
    getAiCdMap();
    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>
    getAiCdMapMap();
    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */

    emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getAiCdMapOrDefault(
        int key,
        emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo defaultValue);
    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */

    emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getAiCdMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 23435
   *4.7.0
   * </pre>
   *
   * Protobuf type {@code EvtAiSyncSkillCdNotify}
   */
  public static final class EvtAiSyncSkillCdNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAiSyncSkillCdNotify)
      EvtAiSyncSkillCdNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAiSyncSkillCdNotify.newBuilder() to construct.
    private EvtAiSyncSkillCdNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAiSyncSkillCdNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAiSyncSkillCdNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtAiSyncSkillCdNotify(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                aiCdMap_ = com.google.protobuf.MapField.newMapField(
                    AiCdMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>
              aiCdMap__ = input.readMessage(
                  AiCdMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              aiCdMap_.getMutableMap().put(
                  aiCdMap__.getKey(), aiCdMap__.getValue());
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
      return emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.internal_static_EvtAiSyncSkillCdNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetAiCdMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.internal_static_EvtAiSyncSkillCdNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify.class, emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify.Builder.class);
    }

    public static final int AI_CD_MAP_FIELD_NUMBER = 3;
    private static final class AiCdMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.internal_static_EvtAiSyncSkillCdNotify_AiCdMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> aiCdMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>
    internalGetAiCdMap() {
      if (aiCdMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AiCdMapDefaultEntryHolder.defaultEntry);
      }
      return aiCdMap_;
    }

    public int getAiCdMapCount() {
      return internalGetAiCdMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */

    @java.lang.Override
    public boolean containsAiCdMap(
        int key) {
      
      return internalGetAiCdMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAiCdMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> getAiCdMap() {
      return getAiCdMapMap();
    }
    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> getAiCdMapMap() {
      return internalGetAiCdMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getAiCdMapOrDefault(
        int key,
        emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> map =
          internalGetAiCdMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getAiCdMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> map =
          internalGetAiCdMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetAiCdMap(),
          AiCdMapDefaultEntryHolder.defaultEntry,
          3);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> entry
           : internalGetAiCdMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>
        aiCdMap__ = AiCdMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, aiCdMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify other = (emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify) obj;

      if (!internalGetAiCdMap().equals(
          other.internalGetAiCdMap())) return false;
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
      if (!internalGetAiCdMap().getMap().isEmpty()) {
        hash = (37 * hash) + AI_CD_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAiCdMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify prototype) {
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
     * CmdId: 23435
     *4.7.0
     * </pre>
     *
     * Protobuf type {@code EvtAiSyncSkillCdNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAiSyncSkillCdNotify)
        emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.internal_static_EvtAiSyncSkillCdNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetAiCdMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMutableAiCdMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.internal_static_EvtAiSyncSkillCdNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify.class, emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify.newBuilder()
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
        internalGetMutableAiCdMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.internal_static_EvtAiSyncSkillCdNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify build() {
        emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify buildPartial() {
        emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify result = new emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify(this);
        int from_bitField0_ = bitField0_;
        result.aiCdMap_ = internalGetAiCdMap();
        result.aiCdMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify other) {
        if (other == emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify.getDefaultInstance()) return this;
        internalGetMutableAiCdMap().mergeFrom(
            other.internalGetAiCdMap());
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
        emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> aiCdMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>
      internalGetAiCdMap() {
        if (aiCdMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AiCdMapDefaultEntryHolder.defaultEntry);
        }
        return aiCdMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>
      internalGetMutableAiCdMap() {
        onChanged();;
        if (aiCdMap_ == null) {
          aiCdMap_ = com.google.protobuf.MapField.newMapField(
              AiCdMapDefaultEntryHolder.defaultEntry);
        }
        if (!aiCdMap_.isMutable()) {
          aiCdMap_ = aiCdMap_.copy();
        }
        return aiCdMap_;
      }

      public int getAiCdMapCount() {
        return internalGetAiCdMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
       */

      @java.lang.Override
      public boolean containsAiCdMap(
          int key) {
        
        return internalGetAiCdMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAiCdMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> getAiCdMap() {
        return getAiCdMapMap();
      }
      /**
       * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> getAiCdMapMap() {
        return internalGetAiCdMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getAiCdMapOrDefault(
          int key,
          emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> map =
            internalGetAiCdMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getAiCdMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> map =
            internalGetAiCdMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAiCdMap() {
        internalGetMutableAiCdMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
       */

      public Builder removeAiCdMap(
          int key) {
        
        internalGetMutableAiCdMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo>
      getMutableAiCdMap() {
        return internalGetMutableAiCdMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
       */
      public Builder putAiCdMap(
          int key,
          emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableAiCdMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .AiSkillCdInfo&gt; ai_cd_map = 3;</code>
       */

      public Builder putAllAiCdMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo> values) {
        internalGetMutableAiCdMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:EvtAiSyncSkillCdNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAiSyncSkillCdNotify)
    private static final emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify();
    }

    public static emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAiSyncSkillCdNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAiSyncSkillCdNotify>() {
      @java.lang.Override
      public EvtAiSyncSkillCdNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtAiSyncSkillCdNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtAiSyncSkillCdNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAiSyncSkillCdNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtAiSyncSkillCdNotifyOuterClass.EvtAiSyncSkillCdNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAiSyncSkillCdNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAiSyncSkillCdNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAiSyncSkillCdNotify_AiCdMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAiSyncSkillCdNotify_AiCdMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034EvtAiSyncSkillCdNotify.proto\032\023AiSkillC" +
      "dInfo.proto\"\221\001\n\026EvtAiSyncSkillCdNotify\0227" +
      "\n\tai_cd_map\030\003 \003(\0132$.EvtAiSyncSkillCdNoti" +
      "fy.AiCdMapEntry\032>\n\014AiCdMapEntry\022\013\n\003key\030\001" +
      " \001(\r\022\035\n\005value\030\002 \001(\0132\016.AiSkillCdInfo:\0028\001B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.getDescriptor(),
        });
    internal_static_EvtAiSyncSkillCdNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAiSyncSkillCdNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAiSyncSkillCdNotify_descriptor,
        new java.lang.String[] { "AiCdMap", });
    internal_static_EvtAiSyncSkillCdNotify_AiCdMapEntry_descriptor =
      internal_static_EvtAiSyncSkillCdNotify_descriptor.getNestedTypes().get(0);
    internal_static_EvtAiSyncSkillCdNotify_AiCdMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAiSyncSkillCdNotify_AiCdMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
