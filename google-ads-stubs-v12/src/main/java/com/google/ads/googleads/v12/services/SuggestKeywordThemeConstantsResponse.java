// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/keyword_theme_constant_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * Response message for
 * [KeywordThemeConstantService.SuggestKeywordThemeConstants][google.ads.googleads.v12.services.KeywordThemeConstantService.SuggestKeywordThemeConstants].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse}
 */
public final class SuggestKeywordThemeConstantsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse)
    SuggestKeywordThemeConstantsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestKeywordThemeConstantsResponse.newBuilder() to construct.
  private SuggestKeywordThemeConstantsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestKeywordThemeConstantsResponse() {
    keywordThemeConstants_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestKeywordThemeConstantsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v12_services_SuggestKeywordThemeConstantsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v12_services_SuggestKeywordThemeConstantsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse.class, com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse.Builder.class);
  }

  public static final int KEYWORD_THEME_CONSTANTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v12.resources.KeywordThemeConstant> keywordThemeConstants_;
  /**
   * <pre>
   * Smart Campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v12.resources.KeywordThemeConstant> getKeywordThemeConstantsList() {
    return keywordThemeConstants_;
  }
  /**
   * <pre>
   * Smart Campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v12.resources.KeywordThemeConstantOrBuilder> 
      getKeywordThemeConstantsOrBuilderList() {
    return keywordThemeConstants_;
  }
  /**
   * <pre>
   * Smart Campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
   */
  @java.lang.Override
  public int getKeywordThemeConstantsCount() {
    return keywordThemeConstants_.size();
  }
  /**
   * <pre>
   * Smart Campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.resources.KeywordThemeConstant getKeywordThemeConstants(int index) {
    return keywordThemeConstants_.get(index);
  }
  /**
   * <pre>
   * Smart Campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.resources.KeywordThemeConstantOrBuilder getKeywordThemeConstantsOrBuilder(
      int index) {
    return keywordThemeConstants_.get(index);
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
    for (int i = 0; i < keywordThemeConstants_.size(); i++) {
      output.writeMessage(1, keywordThemeConstants_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keywordThemeConstants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, keywordThemeConstants_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse other = (com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse) obj;

    if (!getKeywordThemeConstantsList()
        .equals(other.getKeywordThemeConstantsList())) return false;
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
    if (getKeywordThemeConstantsCount() > 0) {
      hash = (37 * hash) + KEYWORD_THEME_CONSTANTS_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordThemeConstantsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse prototype) {
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
   * Response message for
   * [KeywordThemeConstantService.SuggestKeywordThemeConstants][google.ads.googleads.v12.services.KeywordThemeConstantService.SuggestKeywordThemeConstants].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse)
      com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v12_services_SuggestKeywordThemeConstantsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v12_services_SuggestKeywordThemeConstantsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse.class, com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keywordThemeConstantsBuilder_ == null) {
        keywordThemeConstants_ = java.util.Collections.emptyList();
      } else {
        keywordThemeConstants_ = null;
        keywordThemeConstantsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v12_services_SuggestKeywordThemeConstantsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse build() {
      com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse buildPartial() {
      com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse result = new com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse(this);
      int from_bitField0_ = bitField0_;
      if (keywordThemeConstantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keywordThemeConstants_ = java.util.Collections.unmodifiableList(keywordThemeConstants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keywordThemeConstants_ = keywordThemeConstants_;
      } else {
        result.keywordThemeConstants_ = keywordThemeConstantsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse) {
        return mergeFrom((com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse other) {
      if (other == com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse.getDefaultInstance()) return this;
      if (keywordThemeConstantsBuilder_ == null) {
        if (!other.keywordThemeConstants_.isEmpty()) {
          if (keywordThemeConstants_.isEmpty()) {
            keywordThemeConstants_ = other.keywordThemeConstants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeywordThemeConstantsIsMutable();
            keywordThemeConstants_.addAll(other.keywordThemeConstants_);
          }
          onChanged();
        }
      } else {
        if (!other.keywordThemeConstants_.isEmpty()) {
          if (keywordThemeConstantsBuilder_.isEmpty()) {
            keywordThemeConstantsBuilder_.dispose();
            keywordThemeConstantsBuilder_ = null;
            keywordThemeConstants_ = other.keywordThemeConstants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keywordThemeConstantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeywordThemeConstantsFieldBuilder() : null;
          } else {
            keywordThemeConstantsBuilder_.addAllMessages(other.keywordThemeConstants_);
          }
        }
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
            case 10: {
              com.google.ads.googleads.v12.resources.KeywordThemeConstant m =
                  input.readMessage(
                      com.google.ads.googleads.v12.resources.KeywordThemeConstant.parser(),
                      extensionRegistry);
              if (keywordThemeConstantsBuilder_ == null) {
                ensureKeywordThemeConstantsIsMutable();
                keywordThemeConstants_.add(m);
              } else {
                keywordThemeConstantsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v12.resources.KeywordThemeConstant> keywordThemeConstants_ =
      java.util.Collections.emptyList();
    private void ensureKeywordThemeConstantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keywordThemeConstants_ = new java.util.ArrayList<com.google.ads.googleads.v12.resources.KeywordThemeConstant>(keywordThemeConstants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v12.resources.KeywordThemeConstant, com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder, com.google.ads.googleads.v12.resources.KeywordThemeConstantOrBuilder> keywordThemeConstantsBuilder_;

    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v12.resources.KeywordThemeConstant> getKeywordThemeConstantsList() {
      if (keywordThemeConstantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keywordThemeConstants_);
      } else {
        return keywordThemeConstantsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public int getKeywordThemeConstantsCount() {
      if (keywordThemeConstantsBuilder_ == null) {
        return keywordThemeConstants_.size();
      } else {
        return keywordThemeConstantsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public com.google.ads.googleads.v12.resources.KeywordThemeConstant getKeywordThemeConstants(int index) {
      if (keywordThemeConstantsBuilder_ == null) {
        return keywordThemeConstants_.get(index);
      } else {
        return keywordThemeConstantsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder setKeywordThemeConstants(
        int index, com.google.ads.googleads.v12.resources.KeywordThemeConstant value) {
      if (keywordThemeConstantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordThemeConstantsIsMutable();
        keywordThemeConstants_.set(index, value);
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder setKeywordThemeConstants(
        int index, com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder builderForValue) {
      if (keywordThemeConstantsBuilder_ == null) {
        ensureKeywordThemeConstantsIsMutable();
        keywordThemeConstants_.set(index, builderForValue.build());
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder addKeywordThemeConstants(com.google.ads.googleads.v12.resources.KeywordThemeConstant value) {
      if (keywordThemeConstantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordThemeConstantsIsMutable();
        keywordThemeConstants_.add(value);
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder addKeywordThemeConstants(
        int index, com.google.ads.googleads.v12.resources.KeywordThemeConstant value) {
      if (keywordThemeConstantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordThemeConstantsIsMutable();
        keywordThemeConstants_.add(index, value);
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder addKeywordThemeConstants(
        com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder builderForValue) {
      if (keywordThemeConstantsBuilder_ == null) {
        ensureKeywordThemeConstantsIsMutable();
        keywordThemeConstants_.add(builderForValue.build());
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder addKeywordThemeConstants(
        int index, com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder builderForValue) {
      if (keywordThemeConstantsBuilder_ == null) {
        ensureKeywordThemeConstantsIsMutable();
        keywordThemeConstants_.add(index, builderForValue.build());
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder addAllKeywordThemeConstants(
        java.lang.Iterable<? extends com.google.ads.googleads.v12.resources.KeywordThemeConstant> values) {
      if (keywordThemeConstantsBuilder_ == null) {
        ensureKeywordThemeConstantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keywordThemeConstants_);
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder clearKeywordThemeConstants() {
      if (keywordThemeConstantsBuilder_ == null) {
        keywordThemeConstants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public Builder removeKeywordThemeConstants(int index) {
      if (keywordThemeConstantsBuilder_ == null) {
        ensureKeywordThemeConstantsIsMutable();
        keywordThemeConstants_.remove(index);
        onChanged();
      } else {
        keywordThemeConstantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder getKeywordThemeConstantsBuilder(
        int index) {
      return getKeywordThemeConstantsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public com.google.ads.googleads.v12.resources.KeywordThemeConstantOrBuilder getKeywordThemeConstantsOrBuilder(
        int index) {
      if (keywordThemeConstantsBuilder_ == null) {
        return keywordThemeConstants_.get(index);  } else {
        return keywordThemeConstantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v12.resources.KeywordThemeConstantOrBuilder> 
         getKeywordThemeConstantsOrBuilderList() {
      if (keywordThemeConstantsBuilder_ != null) {
        return keywordThemeConstantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keywordThemeConstants_);
      }
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder addKeywordThemeConstantsBuilder() {
      return getKeywordThemeConstantsFieldBuilder().addBuilder(
          com.google.ads.googleads.v12.resources.KeywordThemeConstant.getDefaultInstance());
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder addKeywordThemeConstantsBuilder(
        int index) {
      return getKeywordThemeConstantsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v12.resources.KeywordThemeConstant.getDefaultInstance());
    }
    /**
     * <pre>
     * Smart Campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.resources.KeywordThemeConstant keyword_theme_constants = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder> 
         getKeywordThemeConstantsBuilderList() {
      return getKeywordThemeConstantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v12.resources.KeywordThemeConstant, com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder, com.google.ads.googleads.v12.resources.KeywordThemeConstantOrBuilder> 
        getKeywordThemeConstantsFieldBuilder() {
      if (keywordThemeConstantsBuilder_ == null) {
        keywordThemeConstantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v12.resources.KeywordThemeConstant, com.google.ads.googleads.v12.resources.KeywordThemeConstant.Builder, com.google.ads.googleads.v12.resources.KeywordThemeConstantOrBuilder>(
                keywordThemeConstants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        keywordThemeConstants_ = null;
      }
      return keywordThemeConstantsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse)
  private static final com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse();
  }

  public static com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestKeywordThemeConstantsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SuggestKeywordThemeConstantsResponse>() {
    @java.lang.Override
    public SuggestKeywordThemeConstantsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestKeywordThemeConstantsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestKeywordThemeConstantsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.SuggestKeywordThemeConstantsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

