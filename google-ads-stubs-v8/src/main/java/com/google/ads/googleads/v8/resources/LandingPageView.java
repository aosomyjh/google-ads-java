// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/landing_page_view.proto

package com.google.ads.googleads.v8.resources;

/**
 * <pre>
 * A landing page view with metrics aggregated at the unexpanded final URL
 * level.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.resources.LandingPageView}
 */
public final class LandingPageView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.resources.LandingPageView)
    LandingPageViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LandingPageView.newBuilder() to construct.
  private LandingPageView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LandingPageView() {
    resourceName_ = "";
    unexpandedFinalUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LandingPageView();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LandingPageView(
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

            resourceName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            unexpandedFinalUrl_ = s;
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
    return com.google.ads.googleads.v8.resources.LandingPageViewProto.internal_static_google_ads_googleads_v8_resources_LandingPageView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.resources.LandingPageViewProto.internal_static_google_ads_googleads_v8_resources_LandingPageView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.resources.LandingPageView.class, com.google.ads.googleads.v8.resources.LandingPageView.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Output only. The resource name of the landing page view.
   * Landing page view resource names have the form:
   * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
   * Output only. The resource name of the landing page view.
   * Landing page view resource names have the form:
   * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

  public static final int UNEXPANDED_FINAL_URL_FIELD_NUMBER = 3;
  private volatile java.lang.Object unexpandedFinalUrl_;
  /**
   * <pre>
   * Output only. The advertiser-specified final URL.
   * </pre>
   *
   * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the unexpandedFinalUrl field is set.
   */
  @java.lang.Override
  public boolean hasUnexpandedFinalUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The advertiser-specified final URL.
   * </pre>
   *
   * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The unexpandedFinalUrl.
   */
  @java.lang.Override
  public java.lang.String getUnexpandedFinalUrl() {
    java.lang.Object ref = unexpandedFinalUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unexpandedFinalUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The advertiser-specified final URL.
   * </pre>
   *
   * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for unexpandedFinalUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUnexpandedFinalUrlBytes() {
    java.lang.Object ref = unexpandedFinalUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unexpandedFinalUrl_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, unexpandedFinalUrl_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, unexpandedFinalUrl_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.resources.LandingPageView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.resources.LandingPageView other = (com.google.ads.googleads.v8.resources.LandingPageView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasUnexpandedFinalUrl() != other.hasUnexpandedFinalUrl()) return false;
    if (hasUnexpandedFinalUrl()) {
      if (!getUnexpandedFinalUrl()
          .equals(other.getUnexpandedFinalUrl())) return false;
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
    if (hasUnexpandedFinalUrl()) {
      hash = (37 * hash) + UNEXPANDED_FINAL_URL_FIELD_NUMBER;
      hash = (53 * hash) + getUnexpandedFinalUrl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.LandingPageView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.resources.LandingPageView prototype) {
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
   * A landing page view with metrics aggregated at the unexpanded final URL
   * level.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.resources.LandingPageView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.resources.LandingPageView)
      com.google.ads.googleads.v8.resources.LandingPageViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.resources.LandingPageViewProto.internal_static_google_ads_googleads_v8_resources_LandingPageView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.resources.LandingPageViewProto.internal_static_google_ads_googleads_v8_resources_LandingPageView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.resources.LandingPageView.class, com.google.ads.googleads.v8.resources.LandingPageView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.resources.LandingPageView.newBuilder()
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

      unexpandedFinalUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.resources.LandingPageViewProto.internal_static_google_ads_googleads_v8_resources_LandingPageView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.LandingPageView getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.resources.LandingPageView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.LandingPageView build() {
      com.google.ads.googleads.v8.resources.LandingPageView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.LandingPageView buildPartial() {
      com.google.ads.googleads.v8.resources.LandingPageView result = new com.google.ads.googleads.v8.resources.LandingPageView(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resourceName_ = resourceName_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.unexpandedFinalUrl_ = unexpandedFinalUrl_;
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
      if (other instanceof com.google.ads.googleads.v8.resources.LandingPageView) {
        return mergeFrom((com.google.ads.googleads.v8.resources.LandingPageView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.resources.LandingPageView other) {
      if (other == com.google.ads.googleads.v8.resources.LandingPageView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasUnexpandedFinalUrl()) {
        bitField0_ |= 0x00000001;
        unexpandedFinalUrl_ = other.unexpandedFinalUrl_;
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
      com.google.ads.googleads.v8.resources.LandingPageView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.resources.LandingPageView) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Output only. The resource name of the landing page view.
     * Landing page view resource names have the form:
     * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the landing page view.
     * Landing page view resource names have the form:
     * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the landing page view.
     * Landing page view resource names have the form:
     * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the landing page view.
     * Landing page view resource names have the form:
     * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the landing page view.
     * Landing page view resource names have the form:
     * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

    private java.lang.Object unexpandedFinalUrl_ = "";
    /**
     * <pre>
     * Output only. The advertiser-specified final URL.
     * </pre>
     *
     * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the unexpandedFinalUrl field is set.
     */
    public boolean hasUnexpandedFinalUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. The advertiser-specified final URL.
     * </pre>
     *
     * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The unexpandedFinalUrl.
     */
    public java.lang.String getUnexpandedFinalUrl() {
      java.lang.Object ref = unexpandedFinalUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unexpandedFinalUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The advertiser-specified final URL.
     * </pre>
     *
     * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for unexpandedFinalUrl.
     */
    public com.google.protobuf.ByteString
        getUnexpandedFinalUrlBytes() {
      java.lang.Object ref = unexpandedFinalUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unexpandedFinalUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The advertiser-specified final URL.
     * </pre>
     *
     * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The unexpandedFinalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setUnexpandedFinalUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      unexpandedFinalUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The advertiser-specified final URL.
     * </pre>
     *
     * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnexpandedFinalUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      unexpandedFinalUrl_ = getDefaultInstance().getUnexpandedFinalUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The advertiser-specified final URL.
     * </pre>
     *
     * <code>optional string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for unexpandedFinalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setUnexpandedFinalUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      unexpandedFinalUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.resources.LandingPageView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.LandingPageView)
  private static final com.google.ads.googleads.v8.resources.LandingPageView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.resources.LandingPageView();
  }

  public static com.google.ads.googleads.v8.resources.LandingPageView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LandingPageView>
      PARSER = new com.google.protobuf.AbstractParser<LandingPageView>() {
    @java.lang.Override
    public LandingPageView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LandingPageView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LandingPageView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LandingPageView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.resources.LandingPageView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

