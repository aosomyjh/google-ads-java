// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/asset_types.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * A MediaBundle asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.MediaBundleAsset}
 */
public final class MediaBundleAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.MediaBundleAsset)
    MediaBundleAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaBundleAsset.newBuilder() to construct.
  private MediaBundleAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaBundleAsset() {
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaBundleAsset();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_MediaBundleAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_MediaBundleAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.MediaBundleAsset.class, com.google.ads.googleads.v12.common.MediaBundleAsset.Builder.class);
  }

  private int bitField0_;
  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
   * depends on the ad field where it will be used. For more information on the
   * format, see the documentation of the ad field where you plan on using the
   * MediaBundleAsset. This field is mutate only.
   * </pre>
   *
   * <code>optional bytes data = 2;</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
   * depends on the ad field where it will be used. For more information on the
   * format, see the documentation of the ad field where you plan on using the
   * MediaBundleAsset. This field is mutate only.
   * </pre>
   *
   * <code>optional bytes data = 2;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
      output.writeBytes(2, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, data_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.MediaBundleAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.MediaBundleAsset other = (com.google.ads.googleads.v12.common.MediaBundleAsset) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.MediaBundleAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.MediaBundleAsset prototype) {
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
   * A MediaBundle asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.MediaBundleAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.MediaBundleAsset)
      com.google.ads.googleads.v12.common.MediaBundleAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_MediaBundleAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_MediaBundleAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.MediaBundleAsset.class, com.google.ads.googleads.v12.common.MediaBundleAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.MediaBundleAsset.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      data_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_MediaBundleAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.MediaBundleAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.MediaBundleAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.MediaBundleAsset build() {
      com.google.ads.googleads.v12.common.MediaBundleAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.MediaBundleAsset buildPartial() {
      com.google.ads.googleads.v12.common.MediaBundleAsset result = new com.google.ads.googleads.v12.common.MediaBundleAsset(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.data_ = data_;
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
      if (other instanceof com.google.ads.googleads.v12.common.MediaBundleAsset) {
        return mergeFrom((com.google.ads.googleads.v12.common.MediaBundleAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.MediaBundleAsset other) {
      if (other == com.google.ads.googleads.v12.common.MediaBundleAsset.getDefaultInstance()) return this;
      if (other.hasData()) {
        setData(other.getData());
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
            case 18: {
              data_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
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

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>optional bytes data = 2;</code>
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>optional bytes data = 2;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>optional bytes data = 2;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
     * depends on the ad field where it will be used. For more information on the
     * format, see the documentation of the ad field where you plan on using the
     * MediaBundleAsset. This field is mutate only.
     * </pre>
     *
     * <code>optional bytes data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      data_ = getDefaultInstance().getData();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.MediaBundleAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.MediaBundleAsset)
  private static final com.google.ads.googleads.v12.common.MediaBundleAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.MediaBundleAsset();
  }

  public static com.google.ads.googleads.v12.common.MediaBundleAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaBundleAsset>
      PARSER = new com.google.protobuf.AbstractParser<MediaBundleAsset>() {
    @java.lang.Override
    public MediaBundleAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<MediaBundleAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaBundleAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.MediaBundleAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

