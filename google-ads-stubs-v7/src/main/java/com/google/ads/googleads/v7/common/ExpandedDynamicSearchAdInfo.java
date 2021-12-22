// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/ad_type_infos.proto

package com.google.ads.googleads.v7.common;

/**
 * <pre>
 * An expanded dynamic search ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo}
 */
public final class ExpandedDynamicSearchAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo)
    ExpandedDynamicSearchAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpandedDynamicSearchAdInfo.newBuilder() to construct.
  private ExpandedDynamicSearchAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpandedDynamicSearchAdInfo() {
    description_ = "";
    description2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExpandedDynamicSearchAdInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExpandedDynamicSearchAdInfo(
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
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            description_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            description2_ = s;
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
    return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_ExpandedDynamicSearchAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_ExpandedDynamicSearchAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo.class, com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo.Builder.class);
  }

  private int bitField0_;
  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * The description of the ad.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The description of the ad.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The description of the ad.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION2_FIELD_NUMBER = 4;
  private volatile java.lang.Object description2_;
  /**
   * <pre>
   * The second description of the ad.
   * </pre>
   *
   * <code>optional string description2 = 4;</code>
   * @return Whether the description2 field is set.
   */
  @java.lang.Override
  public boolean hasDescription2() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The second description of the ad.
   * </pre>
   *
   * <code>optional string description2 = 4;</code>
   * @return The description2.
   */
  @java.lang.Override
  public java.lang.String getDescription2() {
    java.lang.Object ref = description2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The second description of the ad.
   * </pre>
   *
   * <code>optional string description2 = 4;</code>
   * @return The bytes for description2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescription2Bytes() {
    java.lang.Object ref = description2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description2_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description2_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo other = (com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo) obj;

    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
    }
    if (hasDescription2() != other.hasDescription2()) return false;
    if (hasDescription2()) {
      if (!getDescription2()
          .equals(other.getDescription2())) return false;
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
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    if (hasDescription2()) {
      hash = (37 * hash) + DESCRIPTION2_FIELD_NUMBER;
      hash = (53 * hash) + getDescription2().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo prototype) {
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
   * An expanded dynamic search ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo)
      com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_ExpandedDynamicSearchAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_ExpandedDynamicSearchAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo.class, com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo.newBuilder()
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
      description_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      description2_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_ExpandedDynamicSearchAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo build() {
      com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo buildPartial() {
      com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo result = new com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.description_ = description_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.description2_ = description2_;
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
      if (other instanceof com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo) {
        return mergeFrom((com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo other) {
      if (other == com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo.getDefaultInstance()) return this;
      if (other.hasDescription()) {
        bitField0_ |= 0x00000001;
        description_ = other.description_;
        onChanged();
      }
      if (other.hasDescription2()) {
        bitField0_ |= 0x00000002;
        description2_ = other.description2_;
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
      com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * The description of the ad.
     * </pre>
     *
     * <code>optional string description = 3;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The description of the ad.
     * </pre>
     *
     * <code>optional string description = 3;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The description of the ad.
     * </pre>
     *
     * <code>optional string description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The description of the ad.
     * </pre>
     *
     * <code>optional string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The description of the ad.
     * </pre>
     *
     * <code>optional string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000001);
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The description of the ad.
     * </pre>
     *
     * <code>optional string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description2_ = "";
    /**
     * <pre>
     * The second description of the ad.
     * </pre>
     *
     * <code>optional string description2 = 4;</code>
     * @return Whether the description2 field is set.
     */
    public boolean hasDescription2() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The second description of the ad.
     * </pre>
     *
     * <code>optional string description2 = 4;</code>
     * @return The description2.
     */
    public java.lang.String getDescription2() {
      java.lang.Object ref = description2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The second description of the ad.
     * </pre>
     *
     * <code>optional string description2 = 4;</code>
     * @return The bytes for description2.
     */
    public com.google.protobuf.ByteString
        getDescription2Bytes() {
      java.lang.Object ref = description2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The second description of the ad.
     * </pre>
     *
     * <code>optional string description2 = 4;</code>
     * @param value The description2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      description2_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The second description of the ad.
     * </pre>
     *
     * <code>optional string description2 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription2() {
      bitField0_ = (bitField0_ & ~0x00000002);
      description2_ = getDefaultInstance().getDescription2();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The second description of the ad.
     * </pre>
     *
     * <code>optional string description2 = 4;</code>
     * @param value The bytes for description2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      description2_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo)
  private static final com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo();
  }

  public static com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpandedDynamicSearchAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<ExpandedDynamicSearchAdInfo>() {
    @java.lang.Override
    public ExpandedDynamicSearchAdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExpandedDynamicSearchAdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExpandedDynamicSearchAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpandedDynamicSearchAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.common.ExpandedDynamicSearchAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

