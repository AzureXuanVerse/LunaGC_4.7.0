// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Weapon.proto

package emu.grasscutter.net.proto;

public final class WeaponOuterClass {
  private WeaponOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeaponOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Weapon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 exp = 2;</code>
     * @return The exp.
     */
    int getExp();

    /**
     * <code>uint32 promote_level = 3;</code>
     * @return The promoteLevel.
     */
    int getPromoteLevel();

    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    int getAffixMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    boolean containsAffixMap(
        int key);
    /**
     * Use {@link #getAffixMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAffixMap();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAffixMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */

    int getAffixMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */

    int getAffixMapOrThrow(
        int key);

    /**
     * <code>bool KMPFOOMNDFJ = 5;</code>
     * @return The kMPFOOMNDFJ.
     */
    boolean getKMPFOOMNDFJ();
  }
  /**
   * <pre>
   *4.7.0
   * </pre>
   *
   * Protobuf type {@code Weapon}
   */
  public static final class Weapon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Weapon)
      WeaponOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Weapon.newBuilder() to construct.
    private Weapon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Weapon() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Weapon();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Weapon(
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
            case 8: {

              level_ = input.readUInt32();
              break;
            }
            case 16: {

              exp_ = input.readUInt32();
              break;
            }
            case 24: {

              promoteLevel_ = input.readUInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                affixMap_ = com.google.protobuf.MapField.newMapField(
                    AffixMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              affixMap__ = input.readMessage(
                  AffixMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              affixMap_.getMutableMap().put(
                  affixMap__.getKey(), affixMap__.getValue());
              break;
            }
            case 40: {

              kMPFOOMNDFJ_ = input.readBool();
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
      return emu.grasscutter.net.proto.WeaponOuterClass.internal_static_Weapon_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetAffixMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WeaponOuterClass.internal_static_Weapon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WeaponOuterClass.Weapon.class, emu.grasscutter.net.proto.WeaponOuterClass.Weapon.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 1;
    private int level_;
    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int EXP_FIELD_NUMBER = 2;
    private int exp_;
    /**
     * <code>uint32 exp = 2;</code>
     * @return The exp.
     */
    @java.lang.Override
    public int getExp() {
      return exp_;
    }

    public static final int PROMOTE_LEVEL_FIELD_NUMBER = 3;
    private int promoteLevel_;
    /**
     * <code>uint32 promote_level = 3;</code>
     * @return The promoteLevel.
     */
    @java.lang.Override
    public int getPromoteLevel() {
      return promoteLevel_;
    }

    public static final int AFFIX_MAP_FIELD_NUMBER = 4;
    private static final class AffixMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.WeaponOuterClass.internal_static_Weapon_AffixMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> affixMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetAffixMap() {
      if (affixMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AffixMapDefaultEntryHolder.defaultEntry);
      }
      return affixMap_;
    }

    public int getAffixMapCount() {
      return internalGetAffixMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */

    @java.lang.Override
    public boolean containsAffixMap(
        int key) {
      
      return internalGetAffixMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAffixMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAffixMap() {
      return getAffixMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getAffixMapMap() {
      return internalGetAffixMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    @java.lang.Override

    public int getAffixMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAffixMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    @java.lang.Override

    public int getAffixMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAffixMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int KMPFOOMNDFJ_FIELD_NUMBER = 5;
    private boolean kMPFOOMNDFJ_;
    /**
     * <code>bool KMPFOOMNDFJ = 5;</code>
     * @return The kMPFOOMNDFJ.
     */
    @java.lang.Override
    public boolean getKMPFOOMNDFJ() {
      return kMPFOOMNDFJ_;
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
      if (level_ != 0) {
        output.writeUInt32(1, level_);
      }
      if (exp_ != 0) {
        output.writeUInt32(2, exp_);
      }
      if (promoteLevel_ != 0) {
        output.writeUInt32(3, promoteLevel_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetAffixMap(),
          AffixMapDefaultEntryHolder.defaultEntry,
          4);
      if (kMPFOOMNDFJ_ != false) {
        output.writeBool(5, kMPFOOMNDFJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, level_);
      }
      if (exp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, exp_);
      }
      if (promoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, promoteLevel_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetAffixMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        affixMap__ = AffixMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, affixMap__);
      }
      if (kMPFOOMNDFJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, kMPFOOMNDFJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WeaponOuterClass.Weapon)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WeaponOuterClass.Weapon other = (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getExp()
          != other.getExp()) return false;
      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
      if (!internalGetAffixMap().equals(
          other.internalGetAffixMap())) return false;
      if (getKMPFOOMNDFJ()
          != other.getKMPFOOMNDFJ()) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + EXP_FIELD_NUMBER;
      hash = (53 * hash) + getExp();
      hash = (37 * hash) + PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getPromoteLevel();
      if (!internalGetAffixMap().getMap().isEmpty()) {
        hash = (37 * hash) + AFFIX_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAffixMap().hashCode();
      }
      hash = (37 * hash) + KMPFOOMNDFJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKMPFOOMNDFJ());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WeaponOuterClass.Weapon prototype) {
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
     * Protobuf type {@code Weapon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Weapon)
        emu.grasscutter.net.proto.WeaponOuterClass.WeaponOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WeaponOuterClass.internal_static_Weapon_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetAffixMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableAffixMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WeaponOuterClass.internal_static_Weapon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WeaponOuterClass.Weapon.class, emu.grasscutter.net.proto.WeaponOuterClass.Weapon.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WeaponOuterClass.Weapon.newBuilder()
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
        level_ = 0;

        exp_ = 0;

        promoteLevel_ = 0;

        internalGetMutableAffixMap().clear();
        kMPFOOMNDFJ_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WeaponOuterClass.internal_static_Weapon_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponOuterClass.Weapon getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponOuterClass.Weapon build() {
        emu.grasscutter.net.proto.WeaponOuterClass.Weapon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponOuterClass.Weapon buildPartial() {
        emu.grasscutter.net.proto.WeaponOuterClass.Weapon result = new emu.grasscutter.net.proto.WeaponOuterClass.Weapon(this);
        int from_bitField0_ = bitField0_;
        result.level_ = level_;
        result.exp_ = exp_;
        result.promoteLevel_ = promoteLevel_;
        result.affixMap_ = internalGetAffixMap();
        result.affixMap_.makeImmutable();
        result.kMPFOOMNDFJ_ = kMPFOOMNDFJ_;
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
        if (other instanceof emu.grasscutter.net.proto.WeaponOuterClass.Weapon) {
          return mergeFrom((emu.grasscutter.net.proto.WeaponOuterClass.Weapon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WeaponOuterClass.Weapon other) {
        if (other == emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getExp() != 0) {
          setExp(other.getExp());
        }
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
        }
        internalGetMutableAffixMap().mergeFrom(
            other.internalGetAffixMap());
        if (other.getKMPFOOMNDFJ() != false) {
          setKMPFOOMNDFJ(other.getKMPFOOMNDFJ());
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
        emu.grasscutter.net.proto.WeaponOuterClass.Weapon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int level_ ;
      /**
       * <code>uint32 level = 1;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int exp_ ;
      /**
       * <code>uint32 exp = 2;</code>
       * @return The exp.
       */
      @java.lang.Override
      public int getExp() {
        return exp_;
      }
      /**
       * <code>uint32 exp = 2;</code>
       * @param value The exp to set.
       * @return This builder for chaining.
       */
      public Builder setExp(int value) {
        
        exp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearExp() {
        
        exp_ = 0;
        onChanged();
        return this;
      }

      private int promoteLevel_ ;
      /**
       * <code>uint32 promote_level = 3;</code>
       * @return The promoteLevel.
       */
      @java.lang.Override
      public int getPromoteLevel() {
        return promoteLevel_;
      }
      /**
       * <code>uint32 promote_level = 3;</code>
       * @param value The promoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setPromoteLevel(int value) {
        
        promoteLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 promote_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPromoteLevel() {
        
        promoteLevel_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> affixMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetAffixMap() {
        if (affixMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AffixMapDefaultEntryHolder.defaultEntry);
        }
        return affixMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableAffixMap() {
        onChanged();;
        if (affixMap_ == null) {
          affixMap_ = com.google.protobuf.MapField.newMapField(
              AffixMapDefaultEntryHolder.defaultEntry);
        }
        if (!affixMap_.isMutable()) {
          affixMap_ = affixMap_.copy();
        }
        return affixMap_;
      }

      public int getAffixMapCount() {
        return internalGetAffixMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */

      @java.lang.Override
      public boolean containsAffixMap(
          int key) {
        
        return internalGetAffixMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAffixMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getAffixMap() {
        return getAffixMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getAffixMapMap() {
        return internalGetAffixMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      @java.lang.Override

      public int getAffixMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAffixMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      @java.lang.Override

      public int getAffixMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAffixMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAffixMap() {
        internalGetMutableAffixMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */

      public Builder removeAffixMap(
          int key) {
        
        internalGetMutableAffixMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableAffixMap() {
        return internalGetMutableAffixMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      public Builder putAffixMap(
          int key,
          int value) {
        
        
        internalGetMutableAffixMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */

      public Builder putAllAffixMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableAffixMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private boolean kMPFOOMNDFJ_ ;
      /**
       * <code>bool KMPFOOMNDFJ = 5;</code>
       * @return The kMPFOOMNDFJ.
       */
      @java.lang.Override
      public boolean getKMPFOOMNDFJ() {
        return kMPFOOMNDFJ_;
      }
      /**
       * <code>bool KMPFOOMNDFJ = 5;</code>
       * @param value The kMPFOOMNDFJ to set.
       * @return This builder for chaining.
       */
      public Builder setKMPFOOMNDFJ(boolean value) {
        
        kMPFOOMNDFJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool KMPFOOMNDFJ = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearKMPFOOMNDFJ() {
        
        kMPFOOMNDFJ_ = false;
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


      // @@protoc_insertion_point(builder_scope:Weapon)
    }

    // @@protoc_insertion_point(class_scope:Weapon)
    private static final emu.grasscutter.net.proto.WeaponOuterClass.Weapon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WeaponOuterClass.Weapon();
    }

    public static emu.grasscutter.net.proto.WeaponOuterClass.Weapon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Weapon>
        PARSER = new com.google.protobuf.AbstractParser<Weapon>() {
      @java.lang.Override
      public Weapon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Weapon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Weapon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Weapon> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WeaponOuterClass.Weapon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Weapon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Weapon_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Weapon_AffixMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Weapon_AffixMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Weapon.proto\"\253\001\n\006Weapon\022\r\n\005level\030\001 \001(\r" +
      "\022\013\n\003exp\030\002 \001(\r\022\025\n\rpromote_level\030\003 \001(\r\022(\n\t" +
      "affix_map\030\004 \003(\0132\025.Weapon.AffixMapEntry\022\023" +
      "\n\013KMPFOOMNDFJ\030\005 \001(\010\032/\n\rAffixMapEntry\022\013\n\003" +
      "key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Weapon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Weapon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Weapon_descriptor,
        new java.lang.String[] { "Level", "Exp", "PromoteLevel", "AffixMap", "KMPFOOMNDFJ", });
    internal_static_Weapon_AffixMapEntry_descriptor =
      internal_static_Weapon_descriptor.getNestedTypes().get(0);
    internal_static_Weapon_AffixMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Weapon_AffixMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
