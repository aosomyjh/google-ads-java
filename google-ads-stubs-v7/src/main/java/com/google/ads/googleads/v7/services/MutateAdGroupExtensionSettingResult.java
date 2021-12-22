// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/ad_group_extension_setting_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * The result for the ad group extension setting mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult}
 */
public final class MutateAdGroupExtensionSettingResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult)
    MutateAdGroupExtensionSettingResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAdGroupExtensionSettingResult.newBuilder() to construct.
  private MutateAdGroupExtensionSettingResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAdGroupExtensionSettingResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAdGroupExtensionSettingResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateAdGroupExtensionSettingResult(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.Builder subBuilder = null;
            if (adGroupExtensionSetting_ != null) {
              subBuilder = adGroupExtensionSetting_.toBuilder();
            }
            adGroupExtensionSetting_ = input.readMessage(com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(adGroupExtensionSetting_);
              adGroupExtensionSetting_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v7.services.AdGroupExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateAdGroupExtensionSettingResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.AdGroupExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateAdGroupExtensionSettingResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult.class, com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AD_GROUP_EXTENSION_SETTING_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v7.resources.AdGroupExtensionSetting adGroupExtensionSetting_;
  /**
   * <pre>
   * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
   * @return Whether the adGroupExtensionSetting field is set.
   */
  @java.lang.Override
  public boolean hasAdGroupExtensionSetting() {
    return adGroupExtensionSetting_ != null;
  }
  /**
   * <pre>
   * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
   * @return The adGroupExtensionSetting.
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.AdGroupExtensionSetting getAdGroupExtensionSetting() {
    return adGroupExtensionSetting_ == null ? com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.getDefaultInstance() : adGroupExtensionSetting_;
  }
  /**
   * <pre>
   * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.AdGroupExtensionSettingOrBuilder getAdGroupExtensionSettingOrBuilder() {
    return getAdGroupExtensionSetting();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (adGroupExtensionSetting_ != null) {
      output.writeMessage(2, getAdGroupExtensionSetting());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (adGroupExtensionSetting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdGroupExtensionSetting());
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult other = (com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasAdGroupExtensionSetting() != other.hasAdGroupExtensionSetting()) return false;
    if (hasAdGroupExtensionSetting()) {
      if (!getAdGroupExtensionSetting()
          .equals(other.getAdGroupExtensionSetting())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasAdGroupExtensionSetting()) {
      hash = (37 * hash) + AD_GROUP_EXTENSION_SETTING_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroupExtensionSetting().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult prototype) {
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
   * The result for the ad group extension setting mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult)
      com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.AdGroupExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateAdGroupExtensionSettingResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.AdGroupExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateAdGroupExtensionSettingResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult.class, com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult.newBuilder()
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
      resourceName_ = "";

      if (adGroupExtensionSettingBuilder_ == null) {
        adGroupExtensionSetting_ = null;
      } else {
        adGroupExtensionSetting_ = null;
        adGroupExtensionSettingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.AdGroupExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateAdGroupExtensionSettingResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult build() {
      com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult buildPartial() {
      com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult result = new com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult(this);
      result.resourceName_ = resourceName_;
      if (adGroupExtensionSettingBuilder_ == null) {
        result.adGroupExtensionSetting_ = adGroupExtensionSetting_;
      } else {
        result.adGroupExtensionSetting_ = adGroupExtensionSettingBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult) {
        return mergeFrom((com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult other) {
      if (other == com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasAdGroupExtensionSetting()) {
        mergeAdGroupExtensionSetting(other.getAdGroupExtensionSetting());
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
      com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v7.resources.AdGroupExtensionSetting adGroupExtensionSetting_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.AdGroupExtensionSetting, com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.Builder, com.google.ads.googleads.v7.resources.AdGroupExtensionSettingOrBuilder> adGroupExtensionSettingBuilder_;
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     * @return Whether the adGroupExtensionSetting field is set.
     */
    public boolean hasAdGroupExtensionSetting() {
      return adGroupExtensionSettingBuilder_ != null || adGroupExtensionSetting_ != null;
    }
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     * @return The adGroupExtensionSetting.
     */
    public com.google.ads.googleads.v7.resources.AdGroupExtensionSetting getAdGroupExtensionSetting() {
      if (adGroupExtensionSettingBuilder_ == null) {
        return adGroupExtensionSetting_ == null ? com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.getDefaultInstance() : adGroupExtensionSetting_;
      } else {
        return adGroupExtensionSettingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     */
    public Builder setAdGroupExtensionSetting(com.google.ads.googleads.v7.resources.AdGroupExtensionSetting value) {
      if (adGroupExtensionSettingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adGroupExtensionSetting_ = value;
        onChanged();
      } else {
        adGroupExtensionSettingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     */
    public Builder setAdGroupExtensionSetting(
        com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.Builder builderForValue) {
      if (adGroupExtensionSettingBuilder_ == null) {
        adGroupExtensionSetting_ = builderForValue.build();
        onChanged();
      } else {
        adGroupExtensionSettingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     */
    public Builder mergeAdGroupExtensionSetting(com.google.ads.googleads.v7.resources.AdGroupExtensionSetting value) {
      if (adGroupExtensionSettingBuilder_ == null) {
        if (adGroupExtensionSetting_ != null) {
          adGroupExtensionSetting_ =
            com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.newBuilder(adGroupExtensionSetting_).mergeFrom(value).buildPartial();
        } else {
          adGroupExtensionSetting_ = value;
        }
        onChanged();
      } else {
        adGroupExtensionSettingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     */
    public Builder clearAdGroupExtensionSetting() {
      if (adGroupExtensionSettingBuilder_ == null) {
        adGroupExtensionSetting_ = null;
        onChanged();
      } else {
        adGroupExtensionSetting_ = null;
        adGroupExtensionSettingBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.Builder getAdGroupExtensionSettingBuilder() {
      
      onChanged();
      return getAdGroupExtensionSettingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.AdGroupExtensionSettingOrBuilder getAdGroupExtensionSettingOrBuilder() {
      if (adGroupExtensionSettingBuilder_ != null) {
        return adGroupExtensionSettingBuilder_.getMessageOrBuilder();
      } else {
        return adGroupExtensionSetting_ == null ?
            com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.getDefaultInstance() : adGroupExtensionSetting_;
      }
    }
    /**
     * <pre>
     * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.AdGroupExtensionSetting, com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.Builder, com.google.ads.googleads.v7.resources.AdGroupExtensionSettingOrBuilder> 
        getAdGroupExtensionSettingFieldBuilder() {
      if (adGroupExtensionSettingBuilder_ == null) {
        adGroupExtensionSettingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v7.resources.AdGroupExtensionSetting, com.google.ads.googleads.v7.resources.AdGroupExtensionSetting.Builder, com.google.ads.googleads.v7.resources.AdGroupExtensionSettingOrBuilder>(
                getAdGroupExtensionSetting(),
                getParentForChildren(),
                isClean());
        adGroupExtensionSetting_ = null;
      }
      return adGroupExtensionSettingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult)
  private static final com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult();
  }

  public static com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAdGroupExtensionSettingResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateAdGroupExtensionSettingResult>() {
    @java.lang.Override
    public MutateAdGroupExtensionSettingResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateAdGroupExtensionSettingResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateAdGroupExtensionSettingResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAdGroupExtensionSettingResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

