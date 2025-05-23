// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityIdentifier.proto

package emu.grasscutter.net.proto;

public final class AbilityIdentifierOuterClass {
  private AbilityIdentifierOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityIdentifierOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityIdentifier)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 HDPFOJMGBJA = 5;</code>
     * @return The hDPFOJMGBJA.
     */
    int getHDPFOJMGBJA();

    /**
     * <code>bool is_serverbuff_modifier = 6;</code>
     * @return The isServerbuffModifier.
     */
    boolean getIsServerbuffModifier();

    /**
     * <code>uint32 IPGHMJALPKC = 7;</code>
     * @return The iPGHMJALPKC.
     */
    int getIPGHMJALPKC();

    /**
     * <code>int32 local_id = 10;</code>
     * @return The localId.
     */
    int getLocalId();

    /**
     * <code>uint32 instanced_modifier_id = 14;</code>
     * @return The instancedModifierId.
     */
    int getInstancedModifierId();

    /**
     * <code>uint32 instanced_ability_id = 15;</code>
     * @return The instancedAbilityId.
     */
    int getInstancedAbilityId();
  }
  /**
   * <pre>
   *4.7.0
   * </pre>
   *
   * Protobuf type {@code AbilityIdentifier}
   */
  public static final class AbilityIdentifier extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityIdentifier)
      AbilityIdentifierOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityIdentifier.newBuilder() to construct.
    private AbilityIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityIdentifier() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityIdentifier();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityIdentifier(
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
            case 40: {

              hDPFOJMGBJA_ = input.readUInt32();
              break;
            }
            case 48: {

              isServerbuffModifier_ = input.readBool();
              break;
            }
            case 56: {

              iPGHMJALPKC_ = input.readUInt32();
              break;
            }
            case 80: {

              localId_ = input.readInt32();
              break;
            }
            case 112: {

              instancedModifierId_ = input.readUInt32();
              break;
            }
            case 120: {

              instancedAbilityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AbilityIdentifierOuterClass.internal_static_AbilityIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityIdentifierOuterClass.internal_static_AbilityIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier.class, emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier.Builder.class);
    }

    public static final int HDPFOJMGBJA_FIELD_NUMBER = 5;
    private int hDPFOJMGBJA_;
    /**
     * <code>uint32 HDPFOJMGBJA = 5;</code>
     * @return The hDPFOJMGBJA.
     */
    @java.lang.Override
    public int getHDPFOJMGBJA() {
      return hDPFOJMGBJA_;
    }

    public static final int IS_SERVERBUFF_MODIFIER_FIELD_NUMBER = 6;
    private boolean isServerbuffModifier_;
    /**
     * <code>bool is_serverbuff_modifier = 6;</code>
     * @return The isServerbuffModifier.
     */
    @java.lang.Override
    public boolean getIsServerbuffModifier() {
      return isServerbuffModifier_;
    }

    public static final int IPGHMJALPKC_FIELD_NUMBER = 7;
    private int iPGHMJALPKC_;
    /**
     * <code>uint32 IPGHMJALPKC = 7;</code>
     * @return The iPGHMJALPKC.
     */
    @java.lang.Override
    public int getIPGHMJALPKC() {
      return iPGHMJALPKC_;
    }

    public static final int LOCAL_ID_FIELD_NUMBER = 10;
    private int localId_;
    /**
     * <code>int32 local_id = 10;</code>
     * @return The localId.
     */
    @java.lang.Override
    public int getLocalId() {
      return localId_;
    }

    public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 14;
    private int instancedModifierId_;
    /**
     * <code>uint32 instanced_modifier_id = 14;</code>
     * @return The instancedModifierId.
     */
    @java.lang.Override
    public int getInstancedModifierId() {
      return instancedModifierId_;
    }

    public static final int INSTANCED_ABILITY_ID_FIELD_NUMBER = 15;
    private int instancedAbilityId_;
    /**
     * <code>uint32 instanced_ability_id = 15;</code>
     * @return The instancedAbilityId.
     */
    @java.lang.Override
    public int getInstancedAbilityId() {
      return instancedAbilityId_;
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
      if (hDPFOJMGBJA_ != 0) {
        output.writeUInt32(5, hDPFOJMGBJA_);
      }
      if (isServerbuffModifier_ != false) {
        output.writeBool(6, isServerbuffModifier_);
      }
      if (iPGHMJALPKC_ != 0) {
        output.writeUInt32(7, iPGHMJALPKC_);
      }
      if (localId_ != 0) {
        output.writeInt32(10, localId_);
      }
      if (instancedModifierId_ != 0) {
        output.writeUInt32(14, instancedModifierId_);
      }
      if (instancedAbilityId_ != 0) {
        output.writeUInt32(15, instancedAbilityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hDPFOJMGBJA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, hDPFOJMGBJA_);
      }
      if (isServerbuffModifier_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isServerbuffModifier_);
      }
      if (iPGHMJALPKC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, iPGHMJALPKC_);
      }
      if (localId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, localId_);
      }
      if (instancedModifierId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, instancedModifierId_);
      }
      if (instancedAbilityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, instancedAbilityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier other = (emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier) obj;

      if (getHDPFOJMGBJA()
          != other.getHDPFOJMGBJA()) return false;
      if (getIsServerbuffModifier()
          != other.getIsServerbuffModifier()) return false;
      if (getIPGHMJALPKC()
          != other.getIPGHMJALPKC()) return false;
      if (getLocalId()
          != other.getLocalId()) return false;
      if (getInstancedModifierId()
          != other.getInstancedModifierId()) return false;
      if (getInstancedAbilityId()
          != other.getInstancedAbilityId()) return false;
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
      hash = (37 * hash) + HDPFOJMGBJA_FIELD_NUMBER;
      hash = (53 * hash) + getHDPFOJMGBJA();
      hash = (37 * hash) + IS_SERVERBUFF_MODIFIER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsServerbuffModifier());
      hash = (37 * hash) + IPGHMJALPKC_FIELD_NUMBER;
      hash = (53 * hash) + getIPGHMJALPKC();
      hash = (37 * hash) + LOCAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLocalId();
      hash = (37 * hash) + INSTANCED_MODIFIER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedModifierId();
      hash = (37 * hash) + INSTANCED_ABILITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedAbilityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier prototype) {
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
     *4.7.0
     * </pre>
     *
     * Protobuf type {@code AbilityIdentifier}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityIdentifier)
        emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifierOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityIdentifierOuterClass.internal_static_AbilityIdentifier_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityIdentifierOuterClass.internal_static_AbilityIdentifier_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier.class, emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier.newBuilder()
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
        hDPFOJMGBJA_ = 0;

        isServerbuffModifier_ = false;

        iPGHMJALPKC_ = 0;

        localId_ = 0;

        instancedModifierId_ = 0;

        instancedAbilityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityIdentifierOuterClass.internal_static_AbilityIdentifier_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier build() {
        emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier buildPartial() {
        emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier result = new emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier(this);
        result.hDPFOJMGBJA_ = hDPFOJMGBJA_;
        result.isServerbuffModifier_ = isServerbuffModifier_;
        result.iPGHMJALPKC_ = iPGHMJALPKC_;
        result.localId_ = localId_;
        result.instancedModifierId_ = instancedModifierId_;
        result.instancedAbilityId_ = instancedAbilityId_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier other) {
        if (other == emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier.getDefaultInstance()) return this;
        if (other.getHDPFOJMGBJA() != 0) {
          setHDPFOJMGBJA(other.getHDPFOJMGBJA());
        }
        if (other.getIsServerbuffModifier() != false) {
          setIsServerbuffModifier(other.getIsServerbuffModifier());
        }
        if (other.getIPGHMJALPKC() != 0) {
          setIPGHMJALPKC(other.getIPGHMJALPKC());
        }
        if (other.getLocalId() != 0) {
          setLocalId(other.getLocalId());
        }
        if (other.getInstancedModifierId() != 0) {
          setInstancedModifierId(other.getInstancedModifierId());
        }
        if (other.getInstancedAbilityId() != 0) {
          setInstancedAbilityId(other.getInstancedAbilityId());
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
        emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hDPFOJMGBJA_ ;
      /**
       * <code>uint32 HDPFOJMGBJA = 5;</code>
       * @return The hDPFOJMGBJA.
       */
      @java.lang.Override
      public int getHDPFOJMGBJA() {
        return hDPFOJMGBJA_;
      }
      /**
       * <code>uint32 HDPFOJMGBJA = 5;</code>
       * @param value The hDPFOJMGBJA to set.
       * @return This builder for chaining.
       */
      public Builder setHDPFOJMGBJA(int value) {
        
        hDPFOJMGBJA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HDPFOJMGBJA = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearHDPFOJMGBJA() {
        
        hDPFOJMGBJA_ = 0;
        onChanged();
        return this;
      }

      private boolean isServerbuffModifier_ ;
      /**
       * <code>bool is_serverbuff_modifier = 6;</code>
       * @return The isServerbuffModifier.
       */
      @java.lang.Override
      public boolean getIsServerbuffModifier() {
        return isServerbuffModifier_;
      }
      /**
       * <code>bool is_serverbuff_modifier = 6;</code>
       * @param value The isServerbuffModifier to set.
       * @return This builder for chaining.
       */
      public Builder setIsServerbuffModifier(boolean value) {
        
        isServerbuffModifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_serverbuff_modifier = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsServerbuffModifier() {
        
        isServerbuffModifier_ = false;
        onChanged();
        return this;
      }

      private int iPGHMJALPKC_ ;
      /**
       * <code>uint32 IPGHMJALPKC = 7;</code>
       * @return The iPGHMJALPKC.
       */
      @java.lang.Override
      public int getIPGHMJALPKC() {
        return iPGHMJALPKC_;
      }
      /**
       * <code>uint32 IPGHMJALPKC = 7;</code>
       * @param value The iPGHMJALPKC to set.
       * @return This builder for chaining.
       */
      public Builder setIPGHMJALPKC(int value) {
        
        iPGHMJALPKC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IPGHMJALPKC = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIPGHMJALPKC() {
        
        iPGHMJALPKC_ = 0;
        onChanged();
        return this;
      }

      private int localId_ ;
      /**
       * <code>int32 local_id = 10;</code>
       * @return The localId.
       */
      @java.lang.Override
      public int getLocalId() {
        return localId_;
      }
      /**
       * <code>int32 local_id = 10;</code>
       * @param value The localId to set.
       * @return This builder for chaining.
       */
      public Builder setLocalId(int value) {
        
        localId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 local_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocalId() {
        
        localId_ = 0;
        onChanged();
        return this;
      }

      private int instancedModifierId_ ;
      /**
       * <code>uint32 instanced_modifier_id = 14;</code>
       * @return The instancedModifierId.
       */
      @java.lang.Override
      public int getInstancedModifierId() {
        return instancedModifierId_;
      }
      /**
       * <code>uint32 instanced_modifier_id = 14;</code>
       * @param value The instancedModifierId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedModifierId(int value) {
        
        instancedModifierId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_modifier_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedModifierId() {
        
        instancedModifierId_ = 0;
        onChanged();
        return this;
      }

      private int instancedAbilityId_ ;
      /**
       * <code>uint32 instanced_ability_id = 15;</code>
       * @return The instancedAbilityId.
       */
      @java.lang.Override
      public int getInstancedAbilityId() {
        return instancedAbilityId_;
      }
      /**
       * <code>uint32 instanced_ability_id = 15;</code>
       * @param value The instancedAbilityId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedAbilityId(int value) {
        
        instancedAbilityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_ability_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedAbilityId() {
        
        instancedAbilityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityIdentifier)
    }

    // @@protoc_insertion_point(class_scope:AbilityIdentifier)
    private static final emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier();
    }

    public static emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityIdentifier>
        PARSER = new com.google.protobuf.AbstractParser<AbilityIdentifier>() {
      @java.lang.Override
      public AbilityIdentifier parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityIdentifier(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityIdentifier> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityIdentifier> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityIdentifierOuterClass.AbilityIdentifier getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityIdentifier_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityIdentifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AbilityIdentifier.proto\"\254\001\n\021AbilityIde" +
      "ntifier\022\023\n\013HDPFOJMGBJA\030\005 \001(\r\022\036\n\026is_serve" +
      "rbuff_modifier\030\006 \001(\010\022\023\n\013IPGHMJALPKC\030\007 \001(" +
      "\r\022\020\n\010local_id\030\n \001(\005\022\035\n\025instanced_modifie" +
      "r_id\030\016 \001(\r\022\034\n\024instanced_ability_id\030\017 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityIdentifier_descriptor,
        new java.lang.String[] { "HDPFOJMGBJA", "IsServerbuffModifier", "IPGHMJALPKC", "LocalId", "InstancedModifierId", "InstancedAbilityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
