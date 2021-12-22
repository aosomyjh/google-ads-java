// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/criteria.proto

package com.google.ads.googleads.v7.common;

/**
 * <pre>
 * A combined audience criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.common.CombinedAudienceInfo}
 */
public final class CombinedAudienceInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.common.CombinedAudienceInfo)
    CombinedAudienceInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombinedAudienceInfo.newBuilder() to construct.
  private CombinedAudienceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombinedAudienceInfo() {
    combinedAudience_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombinedAudienceInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombinedAudienceInfo(
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

            combinedAudience_ = s;
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
    return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_CombinedAudienceInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_CombinedAudienceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.common.CombinedAudienceInfo.class, com.google.ads.googleads.v7.common.CombinedAudienceInfo.Builder.class);
  }

  public static final int COMBINED_AUDIENCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object combinedAudience_;
  /**
   * <pre>
   * The CombinedAudience resource name.
   * </pre>
   *
   * <code>string combined_audience = 1;</code>
   * @return The combinedAudience.
   */
  @java.lang.Override
  public java.lang.String getCombinedAudience() {
    java.lang.Object ref = combinedAudience_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      combinedAudience_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The CombinedAudience resource name.
   * </pre>
   *
   * <code>string combined_audience = 1;</code>
   * @return The bytes for combinedAudience.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCombinedAudienceBytes() {
    java.lang.Object ref = combinedAudience_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      combinedAudience_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(combinedAudience_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, combinedAudience_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(combinedAudience_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, combinedAudience_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.common.CombinedAudienceInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.common.CombinedAudienceInfo other = (com.google.ads.googleads.v7.common.CombinedAudienceInfo) obj;

    if (!getCombinedAudience()
        .equals(other.getCombinedAudience())) return false;
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
    hash = (37 * hash) + COMBINED_AUDIENCE_FIELD_NUMBER;
    hash = (53 * hash) + getCombinedAudience().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.common.CombinedAudienceInfo prototype) {
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
   * A combined audience criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.common.CombinedAudienceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.common.CombinedAudienceInfo)
      com.google.ads.googleads.v7.common.CombinedAudienceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_CombinedAudienceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_CombinedAudienceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.common.CombinedAudienceInfo.class, com.google.ads.googleads.v7.common.CombinedAudienceInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.common.CombinedAudienceInfo.newBuilder()
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
      combinedAudience_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_CombinedAudienceInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.CombinedAudienceInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.common.CombinedAudienceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.CombinedAudienceInfo build() {
      com.google.ads.googleads.v7.common.CombinedAudienceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.CombinedAudienceInfo buildPartial() {
      com.google.ads.googleads.v7.common.CombinedAudienceInfo result = new com.google.ads.googleads.v7.common.CombinedAudienceInfo(this);
      result.combinedAudience_ = combinedAudience_;
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
      if (other instanceof com.google.ads.googleads.v7.common.CombinedAudienceInfo) {
        return mergeFrom((com.google.ads.googleads.v7.common.CombinedAudienceInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.common.CombinedAudienceInfo other) {
      if (other == com.google.ads.googleads.v7.common.CombinedAudienceInfo.getDefaultInstance()) return this;
      if (!other.getCombinedAudience().isEmpty()) {
        combinedAudience_ = other.combinedAudience_;
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
      com.google.ads.googleads.v7.common.CombinedAudienceInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.common.CombinedAudienceInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object combinedAudience_ = "";
    /**
     * <pre>
     * The CombinedAudience resource name.
     * </pre>
     *
     * <code>string combined_audience = 1;</code>
     * @return The combinedAudience.
     */
    public java.lang.String getCombinedAudience() {
      java.lang.Object ref = combinedAudience_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        combinedAudience_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The CombinedAudience resource name.
     * </pre>
     *
     * <code>string combined_audience = 1;</code>
     * @return The bytes for combinedAudience.
     */
    public com.google.protobuf.ByteString
        getCombinedAudienceBytes() {
      java.lang.Object ref = combinedAudience_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        combinedAudience_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The CombinedAudience resource name.
     * </pre>
     *
     * <code>string combined_audience = 1;</code>
     * @param value The combinedAudience to set.
     * @return This builder for chaining.
     */
    public Builder setCombinedAudience(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      combinedAudience_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The CombinedAudience resource name.
     * </pre>
     *
     * <code>string combined_audience = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombinedAudience() {
      
      combinedAudience_ = getDefaultInstance().getCombinedAudience();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The CombinedAudience resource name.
     * </pre>
     *
     * <code>string combined_audience = 1;</code>
     * @param value The bytes for combinedAudience to set.
     * @return This builder for chaining.
     */
    public Builder setCombinedAudienceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      combinedAudience_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.common.CombinedAudienceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.CombinedAudienceInfo)
  private static final com.google.ads.googleads.v7.common.CombinedAudienceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.common.CombinedAudienceInfo();
  }

  public static com.google.ads.googleads.v7.common.CombinedAudienceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombinedAudienceInfo>
      PARSER = new com.google.protobuf.AbstractParser<CombinedAudienceInfo>() {
    @java.lang.Override
    public CombinedAudienceInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombinedAudienceInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombinedAudienceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombinedAudienceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.common.CombinedAudienceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

