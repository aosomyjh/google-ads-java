// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/targeting_setting.proto

package com.google.ads.googleads.v8.common;

/**
 * <pre>
 * The list of per-targeting-dimension targeting settings.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.common.TargetRestriction}
 */
public final class TargetRestriction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.common.TargetRestriction)
    TargetRestrictionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetRestriction.newBuilder() to construct.
  private TargetRestriction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetRestriction() {
    targetingDimension_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetRestriction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TargetRestriction(
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
            int rawValue = input.readEnum();

            targetingDimension_ = rawValue;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000001;
            bidOnly_ = input.readBool();
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
    return com.google.ads.googleads.v8.common.TargetingSettingProto.internal_static_google_ads_googleads_v8_common_TargetRestriction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.common.TargetingSettingProto.internal_static_google_ads_googleads_v8_common_TargetRestriction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.common.TargetRestriction.class, com.google.ads.googleads.v8.common.TargetRestriction.Builder.class);
  }

  private int bitField0_;
  public static final int TARGETING_DIMENSION_FIELD_NUMBER = 1;
  private int targetingDimension_;
  /**
   * <pre>
   * The targeting dimension that these settings apply to.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
   * @return The enum numeric value on the wire for targetingDimension.
   */
  @java.lang.Override public int getTargetingDimensionValue() {
    return targetingDimension_;
  }
  /**
   * <pre>
   * The targeting dimension that these settings apply to.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
   * @return The targetingDimension.
   */
  @java.lang.Override public com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension getTargetingDimension() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension result = com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension.valueOf(targetingDimension_);
    return result == null ? com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension.UNRECOGNIZED : result;
  }

  public static final int BID_ONLY_FIELD_NUMBER = 3;
  private boolean bidOnly_;
  /**
   * <pre>
   * Indicates whether to restrict your ads to show only for the criteria you
   * have selected for this targeting_dimension, or to target all values for
   * this targeting_dimension and show ads based on your targeting in other
   * TargetingDimensions. A value of `true` means that these criteria will only
   * apply bid modifiers, and not affect targeting. A value of `false` means
   * that these criteria will restrict targeting as well as applying bid
   * modifiers.
   * </pre>
   *
   * <code>optional bool bid_only = 3;</code>
   * @return Whether the bidOnly field is set.
   */
  @java.lang.Override
  public boolean hasBidOnly() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Indicates whether to restrict your ads to show only for the criteria you
   * have selected for this targeting_dimension, or to target all values for
   * this targeting_dimension and show ads based on your targeting in other
   * TargetingDimensions. A value of `true` means that these criteria will only
   * apply bid modifiers, and not affect targeting. A value of `false` means
   * that these criteria will restrict targeting as well as applying bid
   * modifiers.
   * </pre>
   *
   * <code>optional bool bid_only = 3;</code>
   * @return The bidOnly.
   */
  @java.lang.Override
  public boolean getBidOnly() {
    return bidOnly_;
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
    if (targetingDimension_ != com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, targetingDimension_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(3, bidOnly_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetingDimension_ != com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, targetingDimension_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, bidOnly_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.common.TargetRestriction)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.common.TargetRestriction other = (com.google.ads.googleads.v8.common.TargetRestriction) obj;

    if (targetingDimension_ != other.targetingDimension_) return false;
    if (hasBidOnly() != other.hasBidOnly()) return false;
    if (hasBidOnly()) {
      if (getBidOnly()
          != other.getBidOnly()) return false;
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
    hash = (37 * hash) + TARGETING_DIMENSION_FIELD_NUMBER;
    hash = (53 * hash) + targetingDimension_;
    if (hasBidOnly()) {
      hash = (37 * hash) + BID_ONLY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBidOnly());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.TargetRestriction parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.common.TargetRestriction prototype) {
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
   * The list of per-targeting-dimension targeting settings.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.common.TargetRestriction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.common.TargetRestriction)
      com.google.ads.googleads.v8.common.TargetRestrictionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.common.TargetingSettingProto.internal_static_google_ads_googleads_v8_common_TargetRestriction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.common.TargetingSettingProto.internal_static_google_ads_googleads_v8_common_TargetRestriction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.common.TargetRestriction.class, com.google.ads.googleads.v8.common.TargetRestriction.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.common.TargetRestriction.newBuilder()
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
      targetingDimension_ = 0;

      bidOnly_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.common.TargetingSettingProto.internal_static_google_ads_googleads_v8_common_TargetRestriction_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.TargetRestriction getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.common.TargetRestriction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.TargetRestriction build() {
      com.google.ads.googleads.v8.common.TargetRestriction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.TargetRestriction buildPartial() {
      com.google.ads.googleads.v8.common.TargetRestriction result = new com.google.ads.googleads.v8.common.TargetRestriction(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.targetingDimension_ = targetingDimension_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bidOnly_ = bidOnly_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v8.common.TargetRestriction) {
        return mergeFrom((com.google.ads.googleads.v8.common.TargetRestriction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.common.TargetRestriction other) {
      if (other == com.google.ads.googleads.v8.common.TargetRestriction.getDefaultInstance()) return this;
      if (other.targetingDimension_ != 0) {
        setTargetingDimensionValue(other.getTargetingDimensionValue());
      }
      if (other.hasBidOnly()) {
        setBidOnly(other.getBidOnly());
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
      com.google.ads.googleads.v8.common.TargetRestriction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.common.TargetRestriction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int targetingDimension_ = 0;
    /**
     * <pre>
     * The targeting dimension that these settings apply to.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
     * @return The enum numeric value on the wire for targetingDimension.
     */
    @java.lang.Override public int getTargetingDimensionValue() {
      return targetingDimension_;
    }
    /**
     * <pre>
     * The targeting dimension that these settings apply to.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
     * @param value The enum numeric value on the wire for targetingDimension to set.
     * @return This builder for chaining.
     */
    public Builder setTargetingDimensionValue(int value) {
      
      targetingDimension_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The targeting dimension that these settings apply to.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
     * @return The targetingDimension.
     */
    @java.lang.Override
    public com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension getTargetingDimension() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension result = com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension.valueOf(targetingDimension_);
      return result == null ? com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The targeting dimension that these settings apply to.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
     * @param value The targetingDimension to set.
     * @return This builder for chaining.
     */
    public Builder setTargetingDimension(com.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      targetingDimension_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The targeting dimension that these settings apply to.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetingDimension() {
      
      targetingDimension_ = 0;
      onChanged();
      return this;
    }

    private boolean bidOnly_ ;
    /**
     * <pre>
     * Indicates whether to restrict your ads to show only for the criteria you
     * have selected for this targeting_dimension, or to target all values for
     * this targeting_dimension and show ads based on your targeting in other
     * TargetingDimensions. A value of `true` means that these criteria will only
     * apply bid modifiers, and not affect targeting. A value of `false` means
     * that these criteria will restrict targeting as well as applying bid
     * modifiers.
     * </pre>
     *
     * <code>optional bool bid_only = 3;</code>
     * @return Whether the bidOnly field is set.
     */
    @java.lang.Override
    public boolean hasBidOnly() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Indicates whether to restrict your ads to show only for the criteria you
     * have selected for this targeting_dimension, or to target all values for
     * this targeting_dimension and show ads based on your targeting in other
     * TargetingDimensions. A value of `true` means that these criteria will only
     * apply bid modifiers, and not affect targeting. A value of `false` means
     * that these criteria will restrict targeting as well as applying bid
     * modifiers.
     * </pre>
     *
     * <code>optional bool bid_only = 3;</code>
     * @return The bidOnly.
     */
    @java.lang.Override
    public boolean getBidOnly() {
      return bidOnly_;
    }
    /**
     * <pre>
     * Indicates whether to restrict your ads to show only for the criteria you
     * have selected for this targeting_dimension, or to target all values for
     * this targeting_dimension and show ads based on your targeting in other
     * TargetingDimensions. A value of `true` means that these criteria will only
     * apply bid modifiers, and not affect targeting. A value of `false` means
     * that these criteria will restrict targeting as well as applying bid
     * modifiers.
     * </pre>
     *
     * <code>optional bool bid_only = 3;</code>
     * @param value The bidOnly to set.
     * @return This builder for chaining.
     */
    public Builder setBidOnly(boolean value) {
      bitField0_ |= 0x00000001;
      bidOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates whether to restrict your ads to show only for the criteria you
     * have selected for this targeting_dimension, or to target all values for
     * this targeting_dimension and show ads based on your targeting in other
     * TargetingDimensions. A value of `true` means that these criteria will only
     * apply bid modifiers, and not affect targeting. A value of `false` means
     * that these criteria will restrict targeting as well as applying bid
     * modifiers.
     * </pre>
     *
     * <code>optional bool bid_only = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBidOnly() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bidOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.common.TargetRestriction)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.TargetRestriction)
  private static final com.google.ads.googleads.v8.common.TargetRestriction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.common.TargetRestriction();
  }

  public static com.google.ads.googleads.v8.common.TargetRestriction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetRestriction>
      PARSER = new com.google.protobuf.AbstractParser<TargetRestriction>() {
    @java.lang.Override
    public TargetRestriction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TargetRestriction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TargetRestriction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetRestriction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.common.TargetRestriction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

