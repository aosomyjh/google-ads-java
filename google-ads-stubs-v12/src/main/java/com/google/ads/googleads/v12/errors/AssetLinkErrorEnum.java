// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/asset_link_error.proto

package com.google.ads.googleads.v12.errors;

/**
 * <pre>
 * Container for enum describing possible asset link errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.errors.AssetLinkErrorEnum}
 */
public final class AssetLinkErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.errors.AssetLinkErrorEnum)
    AssetLinkErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetLinkErrorEnum.newBuilder() to construct.
  private AssetLinkErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetLinkErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetLinkErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.errors.AssetLinkErrorProto.internal_static_google_ads_googleads_v12_errors_AssetLinkErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.errors.AssetLinkErrorProto.internal_static_google_ads_googleads_v12_errors_AssetLinkErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.errors.AssetLinkErrorEnum.class, com.google.ads.googleads.v12.errors.AssetLinkErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset link errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.errors.AssetLinkErrorEnum.AssetLinkError}
   */
  public enum AssetLinkError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Pinning is not supported for the given asset link field.
     * </pre>
     *
     * <code>PINNING_UNSUPPORTED = 2;</code>
     */
    PINNING_UNSUPPORTED(2),
    /**
     * <pre>
     * The given field type is not supported to be added directly through asset
     * links.
     * </pre>
     *
     * <code>UNSUPPORTED_FIELD_TYPE = 3;</code>
     */
    UNSUPPORTED_FIELD_TYPE(3),
    /**
     * <pre>
     * The given asset's type and the specified field type are incompatible.
     * </pre>
     *
     * <code>FIELD_TYPE_INCOMPATIBLE_WITH_ASSET_TYPE = 4;</code>
     */
    FIELD_TYPE_INCOMPATIBLE_WITH_ASSET_TYPE(4),
    /**
     * <pre>
     * The specified field type is incompatible with the given campaign type.
     * </pre>
     *
     * <code>FIELD_TYPE_INCOMPATIBLE_WITH_CAMPAIGN_TYPE = 5;</code>
     */
    FIELD_TYPE_INCOMPATIBLE_WITH_CAMPAIGN_TYPE(5),
    /**
     * <pre>
     * The campaign advertising channel type cannot be associated with the given
     * asset due to channel-based restrictions on the asset's fields.
     * </pre>
     *
     * <code>INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE = 6;</code>
     */
    INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE(6),
    /**
     * <pre>
     * The image asset provided is not within the dimension constraints
     * specified for the submitted asset field.
     * </pre>
     *
     * <code>IMAGE_NOT_WITHIN_SPECIFIED_DIMENSION_RANGE = 7;</code>
     */
    IMAGE_NOT_WITHIN_SPECIFIED_DIMENSION_RANGE(7),
    /**
     * <pre>
     * The pinned field is not valid for the submitted asset field.
     * </pre>
     *
     * <code>INVALID_PINNED_FIELD = 8;</code>
     */
    INVALID_PINNED_FIELD(8),
    /**
     * <pre>
     * The media bundle asset provided is too large for the submitted asset
     * field.
     * </pre>
     *
     * <code>MEDIA_BUNDLE_ASSET_FILE_SIZE_TOO_LARGE = 9;</code>
     */
    MEDIA_BUNDLE_ASSET_FILE_SIZE_TOO_LARGE(9),
    /**
     * <pre>
     * Not enough assets are available for use with other fields since other
     * assets are pinned to specific fields.
     * </pre>
     *
     * <code>NOT_ENOUGH_AVAILABLE_ASSET_LINKS_FOR_VALID_COMBINATION = 10;</code>
     */
    NOT_ENOUGH_AVAILABLE_ASSET_LINKS_FOR_VALID_COMBINATION(10),
    /**
     * <pre>
     * Not enough assets with fallback are available. When validating the
     * minimum number of assets, assets without fallback (for example, assets
     * that contain location tag without default value "{LOCATION(City)}") will
     * not be counted.
     * </pre>
     *
     * <code>NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK = 11;</code>
     */
    NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK(11),
    /**
     * <pre>
     * This is a combination of the
     * NOT_ENOUGH_AVAILABLE_ASSET_LINKS_FOR_VALID_COMBINATION and
     * NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK errors. Not enough assets
     * with fallback are available since some assets are pinned.
     * </pre>
     *
     * <code>NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK_FOR_VALID_COMBINATION = 12;</code>
     */
    NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK_FOR_VALID_COMBINATION(12),
    /**
     * <pre>
     * The YouTube video referenced in the provided asset has been removed.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO_REMOVED = 13;</code>
     */
    YOUTUBE_VIDEO_REMOVED(13),
    /**
     * <pre>
     * The YouTube video referenced in the provided asset is too long for the
     * field submitted.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO_TOO_LONG = 14;</code>
     */
    YOUTUBE_VIDEO_TOO_LONG(14),
    /**
     * <pre>
     * The YouTube video referenced in the provided asset is too short for the
     * field submitted.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO_TOO_SHORT = 15;</code>
     */
    YOUTUBE_VIDEO_TOO_SHORT(15),
    /**
     * <pre>
     * The specified field type is excluded for given campaign or ad group.
     * </pre>
     *
     * <code>EXCLUDED_PARENT_FIELD_TYPE = 16;</code>
     */
    EXCLUDED_PARENT_FIELD_TYPE(16),
    /**
     * <pre>
     * The status is invalid for the operation specified.
     * </pre>
     *
     * <code>INVALID_STATUS = 17;</code>
     */
    INVALID_STATUS(17),
    /**
     * <pre>
     * The YouTube video referenced in the provided asset has unknown duration.
     * This might be the case for a livestream video or a video being currently
     * uploaded to YouTube. In both cases, the video duration should eventually
     * get resolved.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO_DURATION_NOT_DEFINED = 18;</code>
     */
    YOUTUBE_VIDEO_DURATION_NOT_DEFINED(18),
    /**
     * <pre>
     * User cannot create automatically created links.
     * </pre>
     *
     * <code>CANNOT_CREATE_AUTOMATICALLY_CREATED_LINKS = 19;</code>
     */
    CANNOT_CREATE_AUTOMATICALLY_CREATED_LINKS(19),
    /**
     * <pre>
     * Advertiser links cannot link to automatically created asset.
     * </pre>
     *
     * <code>CANNOT_LINK_TO_AUTOMATICALLY_CREATED_ASSET = 20;</code>
     */
    CANNOT_LINK_TO_AUTOMATICALLY_CREATED_ASSET(20),
    /**
     * <pre>
     * Automatically created links cannot be changed into adveritser links or
     * the reverse.
     * </pre>
     *
     * <code>CANNOT_MODIFY_ASSET_LINK_SOURCE = 21;</code>
     */
    CANNOT_MODIFY_ASSET_LINK_SOURCE(21),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Pinning is not supported for the given asset link field.
     * </pre>
     *
     * <code>PINNING_UNSUPPORTED = 2;</code>
     */
    public static final int PINNING_UNSUPPORTED_VALUE = 2;
    /**
     * <pre>
     * The given field type is not supported to be added directly through asset
     * links.
     * </pre>
     *
     * <code>UNSUPPORTED_FIELD_TYPE = 3;</code>
     */
    public static final int UNSUPPORTED_FIELD_TYPE_VALUE = 3;
    /**
     * <pre>
     * The given asset's type and the specified field type are incompatible.
     * </pre>
     *
     * <code>FIELD_TYPE_INCOMPATIBLE_WITH_ASSET_TYPE = 4;</code>
     */
    public static final int FIELD_TYPE_INCOMPATIBLE_WITH_ASSET_TYPE_VALUE = 4;
    /**
     * <pre>
     * The specified field type is incompatible with the given campaign type.
     * </pre>
     *
     * <code>FIELD_TYPE_INCOMPATIBLE_WITH_CAMPAIGN_TYPE = 5;</code>
     */
    public static final int FIELD_TYPE_INCOMPATIBLE_WITH_CAMPAIGN_TYPE_VALUE = 5;
    /**
     * <pre>
     * The campaign advertising channel type cannot be associated with the given
     * asset due to channel-based restrictions on the asset's fields.
     * </pre>
     *
     * <code>INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE = 6;</code>
     */
    public static final int INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE_VALUE = 6;
    /**
     * <pre>
     * The image asset provided is not within the dimension constraints
     * specified for the submitted asset field.
     * </pre>
     *
     * <code>IMAGE_NOT_WITHIN_SPECIFIED_DIMENSION_RANGE = 7;</code>
     */
    public static final int IMAGE_NOT_WITHIN_SPECIFIED_DIMENSION_RANGE_VALUE = 7;
    /**
     * <pre>
     * The pinned field is not valid for the submitted asset field.
     * </pre>
     *
     * <code>INVALID_PINNED_FIELD = 8;</code>
     */
    public static final int INVALID_PINNED_FIELD_VALUE = 8;
    /**
     * <pre>
     * The media bundle asset provided is too large for the submitted asset
     * field.
     * </pre>
     *
     * <code>MEDIA_BUNDLE_ASSET_FILE_SIZE_TOO_LARGE = 9;</code>
     */
    public static final int MEDIA_BUNDLE_ASSET_FILE_SIZE_TOO_LARGE_VALUE = 9;
    /**
     * <pre>
     * Not enough assets are available for use with other fields since other
     * assets are pinned to specific fields.
     * </pre>
     *
     * <code>NOT_ENOUGH_AVAILABLE_ASSET_LINKS_FOR_VALID_COMBINATION = 10;</code>
     */
    public static final int NOT_ENOUGH_AVAILABLE_ASSET_LINKS_FOR_VALID_COMBINATION_VALUE = 10;
    /**
     * <pre>
     * Not enough assets with fallback are available. When validating the
     * minimum number of assets, assets without fallback (for example, assets
     * that contain location tag without default value "{LOCATION(City)}") will
     * not be counted.
     * </pre>
     *
     * <code>NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK = 11;</code>
     */
    public static final int NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK_VALUE = 11;
    /**
     * <pre>
     * This is a combination of the
     * NOT_ENOUGH_AVAILABLE_ASSET_LINKS_FOR_VALID_COMBINATION and
     * NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK errors. Not enough assets
     * with fallback are available since some assets are pinned.
     * </pre>
     *
     * <code>NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK_FOR_VALID_COMBINATION = 12;</code>
     */
    public static final int NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK_FOR_VALID_COMBINATION_VALUE = 12;
    /**
     * <pre>
     * The YouTube video referenced in the provided asset has been removed.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO_REMOVED = 13;</code>
     */
    public static final int YOUTUBE_VIDEO_REMOVED_VALUE = 13;
    /**
     * <pre>
     * The YouTube video referenced in the provided asset is too long for the
     * field submitted.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO_TOO_LONG = 14;</code>
     */
    public static final int YOUTUBE_VIDEO_TOO_LONG_VALUE = 14;
    /**
     * <pre>
     * The YouTube video referenced in the provided asset is too short for the
     * field submitted.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO_TOO_SHORT = 15;</code>
     */
    public static final int YOUTUBE_VIDEO_TOO_SHORT_VALUE = 15;
    /**
     * <pre>
     * The specified field type is excluded for given campaign or ad group.
     * </pre>
     *
     * <code>EXCLUDED_PARENT_FIELD_TYPE = 16;</code>
     */
    public static final int EXCLUDED_PARENT_FIELD_TYPE_VALUE = 16;
    /**
     * <pre>
     * The status is invalid for the operation specified.
     * </pre>
     *
     * <code>INVALID_STATUS = 17;</code>
     */
    public static final int INVALID_STATUS_VALUE = 17;
    /**
     * <pre>
     * The YouTube video referenced in the provided asset has unknown duration.
     * This might be the case for a livestream video or a video being currently
     * uploaded to YouTube. In both cases, the video duration should eventually
     * get resolved.
     * </pre>
     *
     * <code>YOUTUBE_VIDEO_DURATION_NOT_DEFINED = 18;</code>
     */
    public static final int YOUTUBE_VIDEO_DURATION_NOT_DEFINED_VALUE = 18;
    /**
     * <pre>
     * User cannot create automatically created links.
     * </pre>
     *
     * <code>CANNOT_CREATE_AUTOMATICALLY_CREATED_LINKS = 19;</code>
     */
    public static final int CANNOT_CREATE_AUTOMATICALLY_CREATED_LINKS_VALUE = 19;
    /**
     * <pre>
     * Advertiser links cannot link to automatically created asset.
     * </pre>
     *
     * <code>CANNOT_LINK_TO_AUTOMATICALLY_CREATED_ASSET = 20;</code>
     */
    public static final int CANNOT_LINK_TO_AUTOMATICALLY_CREATED_ASSET_VALUE = 20;
    /**
     * <pre>
     * Automatically created links cannot be changed into adveritser links or
     * the reverse.
     * </pre>
     *
     * <code>CANNOT_MODIFY_ASSET_LINK_SOURCE = 21;</code>
     */
    public static final int CANNOT_MODIFY_ASSET_LINK_SOURCE_VALUE = 21;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AssetLinkError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetLinkError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PINNING_UNSUPPORTED;
        case 3: return UNSUPPORTED_FIELD_TYPE;
        case 4: return FIELD_TYPE_INCOMPATIBLE_WITH_ASSET_TYPE;
        case 5: return FIELD_TYPE_INCOMPATIBLE_WITH_CAMPAIGN_TYPE;
        case 6: return INCOMPATIBLE_ADVERTISING_CHANNEL_TYPE;
        case 7: return IMAGE_NOT_WITHIN_SPECIFIED_DIMENSION_RANGE;
        case 8: return INVALID_PINNED_FIELD;
        case 9: return MEDIA_BUNDLE_ASSET_FILE_SIZE_TOO_LARGE;
        case 10: return NOT_ENOUGH_AVAILABLE_ASSET_LINKS_FOR_VALID_COMBINATION;
        case 11: return NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK;
        case 12: return NOT_ENOUGH_AVAILABLE_ASSET_LINKS_WITH_FALLBACK_FOR_VALID_COMBINATION;
        case 13: return YOUTUBE_VIDEO_REMOVED;
        case 14: return YOUTUBE_VIDEO_TOO_LONG;
        case 15: return YOUTUBE_VIDEO_TOO_SHORT;
        case 16: return EXCLUDED_PARENT_FIELD_TYPE;
        case 17: return INVALID_STATUS;
        case 18: return YOUTUBE_VIDEO_DURATION_NOT_DEFINED;
        case 19: return CANNOT_CREATE_AUTOMATICALLY_CREATED_LINKS;
        case 20: return CANNOT_LINK_TO_AUTOMATICALLY_CREATED_ASSET;
        case 21: return CANNOT_MODIFY_ASSET_LINK_SOURCE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetLinkError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetLinkError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetLinkError>() {
            public AssetLinkError findValueByNumber(int number) {
              return AssetLinkError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.errors.AssetLinkErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetLinkError[] VALUES = values();

    public static AssetLinkError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AssetLinkError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.errors.AssetLinkErrorEnum.AssetLinkError)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v12.errors.AssetLinkErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.errors.AssetLinkErrorEnum other = (com.google.ads.googleads.v12.errors.AssetLinkErrorEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.errors.AssetLinkErrorEnum prototype) {
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
   * Container for enum describing possible asset link errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.errors.AssetLinkErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.errors.AssetLinkErrorEnum)
      com.google.ads.googleads.v12.errors.AssetLinkErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.errors.AssetLinkErrorProto.internal_static_google_ads_googleads_v12_errors_AssetLinkErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.errors.AssetLinkErrorProto.internal_static_google_ads_googleads_v12_errors_AssetLinkErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.errors.AssetLinkErrorEnum.class, com.google.ads.googleads.v12.errors.AssetLinkErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.errors.AssetLinkErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.errors.AssetLinkErrorProto.internal_static_google_ads_googleads_v12_errors_AssetLinkErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.AssetLinkErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.errors.AssetLinkErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.AssetLinkErrorEnum build() {
      com.google.ads.googleads.v12.errors.AssetLinkErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.AssetLinkErrorEnum buildPartial() {
      com.google.ads.googleads.v12.errors.AssetLinkErrorEnum result = new com.google.ads.googleads.v12.errors.AssetLinkErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.errors.AssetLinkErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v12.errors.AssetLinkErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.errors.AssetLinkErrorEnum other) {
      if (other == com.google.ads.googleads.v12.errors.AssetLinkErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.errors.AssetLinkErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.errors.AssetLinkErrorEnum)
  private static final com.google.ads.googleads.v12.errors.AssetLinkErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.errors.AssetLinkErrorEnum();
  }

  public static com.google.ads.googleads.v12.errors.AssetLinkErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetLinkErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetLinkErrorEnum>() {
    @java.lang.Override
    public AssetLinkErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetLinkErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetLinkErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.errors.AssetLinkErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

