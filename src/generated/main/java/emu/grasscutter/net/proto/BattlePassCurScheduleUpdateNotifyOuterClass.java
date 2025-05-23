// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassCurScheduleUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class BattlePassCurScheduleUpdateNotifyOuterClass {
  private BattlePassCurScheduleUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassCurScheduleUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassCurScheduleUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool have_cur_schedule = 3;</code>
     * @return The haveCurSchedule.
     */
    boolean getHaveCurSchedule();

    /**
     * <code>.BattlePassSchedule cur_schedule = 12;</code>
     * @return Whether the curSchedule field is set.
     */
    boolean hasCurSchedule();
    /**
     * <code>.BattlePassSchedule cur_schedule = 12;</code>
     * @return The curSchedule.
     */
    emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule();
    /**
     * <code>.BattlePassSchedule cur_schedule = 12;</code>
     */
    emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 23013
   *4.7.0
   * </pre>
   *
   * Protobuf type {@code BattlePassCurScheduleUpdateNotify}
   */
  public static final class BattlePassCurScheduleUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassCurScheduleUpdateNotify)
      BattlePassCurScheduleUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassCurScheduleUpdateNotify.newBuilder() to construct.
    private BattlePassCurScheduleUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassCurScheduleUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassCurScheduleUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BattlePassCurScheduleUpdateNotify(
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
            case 24: {

              haveCurSchedule_ = input.readBool();
              break;
            }
            case 98: {
              emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder subBuilder = null;
              if (curSchedule_ != null) {
                subBuilder = curSchedule_.toBuilder();
              }
              curSchedule_ = input.readMessage(emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(curSchedule_);
                curSchedule_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.class, emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.Builder.class);
    }

    public static final int HAVE_CUR_SCHEDULE_FIELD_NUMBER = 3;
    private boolean haveCurSchedule_;
    /**
     * <code>bool have_cur_schedule = 3;</code>
     * @return The haveCurSchedule.
     */
    @java.lang.Override
    public boolean getHaveCurSchedule() {
      return haveCurSchedule_;
    }

    public static final int CUR_SCHEDULE_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule curSchedule_;
    /**
     * <code>.BattlePassSchedule cur_schedule = 12;</code>
     * @return Whether the curSchedule field is set.
     */
    @java.lang.Override
    public boolean hasCurSchedule() {
      return curSchedule_ != null;
    }
    /**
     * <code>.BattlePassSchedule cur_schedule = 12;</code>
     * @return The curSchedule.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule() {
      return curSchedule_ == null ? emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : curSchedule_;
    }
    /**
     * <code>.BattlePassSchedule cur_schedule = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder() {
      return getCurSchedule();
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
      if (haveCurSchedule_ != false) {
        output.writeBool(3, haveCurSchedule_);
      }
      if (curSchedule_ != null) {
        output.writeMessage(12, getCurSchedule());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (haveCurSchedule_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, haveCurSchedule_);
      }
      if (curSchedule_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getCurSchedule());
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
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify other = (emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify) obj;

      if (getHaveCurSchedule()
          != other.getHaveCurSchedule()) return false;
      if (hasCurSchedule() != other.hasCurSchedule()) return false;
      if (hasCurSchedule()) {
        if (!getCurSchedule()
            .equals(other.getCurSchedule())) return false;
      }
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
      hash = (37 * hash) + HAVE_CUR_SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHaveCurSchedule());
      if (hasCurSchedule()) {
        hash = (37 * hash) + CUR_SCHEDULE_FIELD_NUMBER;
        hash = (53 * hash) + getCurSchedule().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify prototype) {
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
     * CmdId: 23013
     *4.7.0
     * </pre>
     *
     * Protobuf type {@code BattlePassCurScheduleUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassCurScheduleUpdateNotify)
        emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.class, emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.newBuilder()
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
        haveCurSchedule_ = false;

        if (curScheduleBuilder_ == null) {
          curSchedule_ = null;
        } else {
          curSchedule_ = null;
          curScheduleBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify build() {
        emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify result = new emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify(this);
        result.haveCurSchedule_ = haveCurSchedule_;
        if (curScheduleBuilder_ == null) {
          result.curSchedule_ = curSchedule_;
        } else {
          result.curSchedule_ = curScheduleBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.getDefaultInstance()) return this;
        if (other.getHaveCurSchedule() != false) {
          setHaveCurSchedule(other.getHaveCurSchedule());
        }
        if (other.hasCurSchedule()) {
          mergeCurSchedule(other.getCurSchedule());
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
        emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean haveCurSchedule_ ;
      /**
       * <code>bool have_cur_schedule = 3;</code>
       * @return The haveCurSchedule.
       */
      @java.lang.Override
      public boolean getHaveCurSchedule() {
        return haveCurSchedule_;
      }
      /**
       * <code>bool have_cur_schedule = 3;</code>
       * @param value The haveCurSchedule to set.
       * @return This builder for chaining.
       */
      public Builder setHaveCurSchedule(boolean value) {
        
        haveCurSchedule_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool have_cur_schedule = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHaveCurSchedule() {
        
        haveCurSchedule_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule curSchedule_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder> curScheduleBuilder_;
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       * @return Whether the curSchedule field is set.
       */
      public boolean hasCurSchedule() {
        return curScheduleBuilder_ != null || curSchedule_ != null;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       * @return The curSchedule.
       */
      public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule() {
        if (curScheduleBuilder_ == null) {
          return curSchedule_ == null ? emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : curSchedule_;
        } else {
          return curScheduleBuilder_.getMessage();
        }
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       */
      public Builder setCurSchedule(emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule value) {
        if (curScheduleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          curSchedule_ = value;
          onChanged();
        } else {
          curScheduleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       */
      public Builder setCurSchedule(
          emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder builderForValue) {
        if (curScheduleBuilder_ == null) {
          curSchedule_ = builderForValue.build();
          onChanged();
        } else {
          curScheduleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       */
      public Builder mergeCurSchedule(emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule value) {
        if (curScheduleBuilder_ == null) {
          if (curSchedule_ != null) {
            curSchedule_ =
              emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.newBuilder(curSchedule_).mergeFrom(value).buildPartial();
          } else {
            curSchedule_ = value;
          }
          onChanged();
        } else {
          curScheduleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       */
      public Builder clearCurSchedule() {
        if (curScheduleBuilder_ == null) {
          curSchedule_ = null;
          onChanged();
        } else {
          curSchedule_ = null;
          curScheduleBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       */
      public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder getCurScheduleBuilder() {
        
        onChanged();
        return getCurScheduleFieldBuilder().getBuilder();
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       */
      public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder() {
        if (curScheduleBuilder_ != null) {
          return curScheduleBuilder_.getMessageOrBuilder();
        } else {
          return curSchedule_ == null ?
              emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : curSchedule_;
        }
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder> 
          getCurScheduleFieldBuilder() {
        if (curScheduleBuilder_ == null) {
          curScheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder>(
                  getCurSchedule(),
                  getParentForChildren(),
                  isClean());
          curSchedule_ = null;
        }
        return curScheduleBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BattlePassCurScheduleUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:BattlePassCurScheduleUpdateNotify)
    private static final emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify();
    }

    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassCurScheduleUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassCurScheduleUpdateNotify>() {
      @java.lang.Override
      public BattlePassCurScheduleUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattlePassCurScheduleUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BattlePassCurScheduleUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassCurScheduleUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'BattlePassCurScheduleUpdateNotify.prot" +
      "o\032\030BattlePassSchedule.proto\"i\n!BattlePas" +
      "sCurScheduleUpdateNotify\022\031\n\021have_cur_sch" +
      "edule\030\003 \001(\010\022)\n\014cur_schedule\030\014 \001(\0132\023.Batt" +
      "lePassScheduleB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BattlePassScheduleOuterClass.getDescriptor(),
        });
    internal_static_BattlePassCurScheduleUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassCurScheduleUpdateNotify_descriptor,
        new java.lang.String[] { "HaveCurSchedule", "CurSchedule", });
    emu.grasscutter.net.proto.BattlePassScheduleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
