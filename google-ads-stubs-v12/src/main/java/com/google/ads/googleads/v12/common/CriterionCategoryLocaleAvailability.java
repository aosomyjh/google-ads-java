// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/criterion_category_availability.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Information about which locales a category is available in.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability}
 */
public final class CriterionCategoryLocaleAvailability extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability)
    CriterionCategoryLocaleAvailabilityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CriterionCategoryLocaleAvailability.newBuilder() to construct.
  private CriterionCategoryLocaleAvailability(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CriterionCategoryLocaleAvailability() {
    availabilityMode_ = 0;
    countryCode_ = "";
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CriterionCategoryLocaleAvailability();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.CriterionCategoryAvailabilityProto.internal_static_google_ads_googleads_v12_common_CriterionCategoryLocaleAvailability_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.CriterionCategoryAvailabilityProto.internal_static_google_ads_googleads_v12_common_CriterionCategoryLocaleAvailability_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability.class, com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability.Builder.class);
  }

  private int bitField0_;
  public static final int AVAILABILITY_MODE_FIELD_NUMBER = 1;
  private int availabilityMode_;
  /**
   * <pre>
   * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
   * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
   * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
   * be set).
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
   * @return The enum numeric value on the wire for availabilityMode.
   */
  @java.lang.Override public int getAvailabilityModeValue() {
    return availabilityMode_;
  }
  /**
   * <pre>
   * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
   * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
   * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
   * be set).
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
   * @return The availabilityMode.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode getAvailabilityMode() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode result = com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode.valueOf(availabilityMode_);
    return result == null ? com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode.UNRECOGNIZED : result;
  }

  public static final int COUNTRY_CODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object countryCode_;
  /**
   * <pre>
   * Code of the country.
   * </pre>
   *
   * <code>optional string country_code = 4;</code>
   * @return Whether the countryCode field is set.
   */
  @java.lang.Override
  public boolean hasCountryCode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Code of the country.
   * </pre>
   *
   * <code>optional string country_code = 4;</code>
   * @return The countryCode.
   */
  @java.lang.Override
  public java.lang.String getCountryCode() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Code of the country.
   * </pre>
   *
   * <code>optional string country_code = 4;</code>
   * @return The bytes for countryCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryCodeBytes() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countryCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 5;
  private volatile java.lang.Object languageCode_;
  /**
   * <pre>
   * Code of the language.
   * </pre>
   *
   * <code>optional string language_code = 5;</code>
   * @return Whether the languageCode field is set.
   */
  @java.lang.Override
  public boolean hasLanguageCode() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Code of the language.
   * </pre>
   *
   * <code>optional string language_code = 5;</code>
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Code of the language.
   * </pre>
   *
   * <code>optional string language_code = 5;</code>
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
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
    if (availabilityMode_ != com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, availabilityMode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, countryCode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, languageCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (availabilityMode_ != com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, availabilityMode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, countryCode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, languageCode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability other = (com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability) obj;

    if (availabilityMode_ != other.availabilityMode_) return false;
    if (hasCountryCode() != other.hasCountryCode()) return false;
    if (hasCountryCode()) {
      if (!getCountryCode()
          .equals(other.getCountryCode())) return false;
    }
    if (hasLanguageCode() != other.hasLanguageCode()) return false;
    if (hasLanguageCode()) {
      if (!getLanguageCode()
          .equals(other.getLanguageCode())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AVAILABILITY_MODE_FIELD_NUMBER;
    hash = (53 * hash) + availabilityMode_;
    if (hasCountryCode()) {
      hash = (37 * hash) + COUNTRY_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCountryCode().hashCode();
    }
    if (hasLanguageCode()) {
      hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getLanguageCode().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability prototype) {
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
   * Information about which locales a category is available in.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability)
      com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailabilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.CriterionCategoryAvailabilityProto.internal_static_google_ads_googleads_v12_common_CriterionCategoryLocaleAvailability_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.CriterionCategoryAvailabilityProto.internal_static_google_ads_googleads_v12_common_CriterionCategoryLocaleAvailability_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability.class, com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      availabilityMode_ = 0;

      countryCode_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      languageCode_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.CriterionCategoryAvailabilityProto.internal_static_google_ads_googleads_v12_common_CriterionCategoryLocaleAvailability_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability build() {
      com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability buildPartial() {
      com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability result = new com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.availabilityMode_ = availabilityMode_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.countryCode_ = countryCode_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.languageCode_ = languageCode_;
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
      if (other instanceof com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability) {
        return mergeFrom((com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability other) {
      if (other == com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability.getDefaultInstance()) return this;
      if (other.availabilityMode_ != 0) {
        setAvailabilityModeValue(other.getAvailabilityModeValue());
      }
      if (other.hasCountryCode()) {
        bitField0_ |= 0x00000001;
        countryCode_ = other.countryCode_;
        onChanged();
      }
      if (other.hasLanguageCode()) {
        bitField0_ |= 0x00000002;
        languageCode_ = other.languageCode_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              availabilityMode_ = input.readEnum();

              break;
            } // case 8
            case 34: {
              countryCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 34
            case 42: {
              languageCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int availabilityMode_ = 0;
    /**
     * <pre>
     * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
     * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
     * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
     * be set).
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
     * @return The enum numeric value on the wire for availabilityMode.
     */
    @java.lang.Override public int getAvailabilityModeValue() {
      return availabilityMode_;
    }
    /**
     * <pre>
     * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
     * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
     * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
     * be set).
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
     * @param value The enum numeric value on the wire for availabilityMode to set.
     * @return This builder for chaining.
     */
    public Builder setAvailabilityModeValue(int value) {
      
      availabilityMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
     * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
     * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
     * be set).
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
     * @return The availabilityMode.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode getAvailabilityMode() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode result = com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode.valueOf(availabilityMode_);
      return result == null ? com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
     * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
     * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
     * be set).
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
     * @param value The availabilityMode to set.
     * @return This builder for chaining.
     */
    public Builder setAvailabilityMode(com.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      availabilityMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
     * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
     * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
     * be set).
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailabilityMode() {
      
      availabilityMode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object countryCode_ = "";
    /**
     * <pre>
     * Code of the country.
     * </pre>
     *
     * <code>optional string country_code = 4;</code>
     * @return Whether the countryCode field is set.
     */
    public boolean hasCountryCode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Code of the country.
     * </pre>
     *
     * <code>optional string country_code = 4;</code>
     * @return The countryCode.
     */
    public java.lang.String getCountryCode() {
      java.lang.Object ref = countryCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Code of the country.
     * </pre>
     *
     * <code>optional string country_code = 4;</code>
     * @return The bytes for countryCode.
     */
    public com.google.protobuf.ByteString
        getCountryCodeBytes() {
      java.lang.Object ref = countryCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Code of the country.
     * </pre>
     *
     * <code>optional string country_code = 4;</code>
     * @param value The countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      countryCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Code of the country.
     * </pre>
     *
     * <code>optional string country_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      countryCode_ = getDefaultInstance().getCountryCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Code of the country.
     * </pre>
     *
     * <code>optional string country_code = 4;</code>
     * @param value The bytes for countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      countryCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * Code of the language.
     * </pre>
     *
     * <code>optional string language_code = 5;</code>
     * @return Whether the languageCode field is set.
     */
    public boolean hasLanguageCode() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Code of the language.
     * </pre>
     *
     * <code>optional string language_code = 5;</code>
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Code of the language.
     * </pre>
     *
     * <code>optional string language_code = 5;</code>
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Code of the language.
     * </pre>
     *
     * <code>optional string language_code = 5;</code>
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Code of the language.
     * </pre>
     *
     * <code>optional string language_code = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Code of the language.
     * </pre>
     *
     * <code>optional string language_code = 5;</code>
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      languageCode_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability)
  private static final com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability();
  }

  public static com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CriterionCategoryLocaleAvailability>
      PARSER = new com.google.protobuf.AbstractParser<CriterionCategoryLocaleAvailability>() {
    @java.lang.Override
    public CriterionCategoryLocaleAvailability parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CriterionCategoryLocaleAvailability> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CriterionCategoryLocaleAvailability> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.CriterionCategoryLocaleAvailability getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

