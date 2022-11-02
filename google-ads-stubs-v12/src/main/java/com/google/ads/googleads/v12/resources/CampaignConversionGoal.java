// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/campaign_conversion_goal.proto

package com.google.ads.googleads.v12.resources;

/**
 * <pre>
 * The biddability setting for the specified campaign only for all
 * conversion actions with a matching category and origin.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.resources.CampaignConversionGoal}
 */
public final class CampaignConversionGoal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.resources.CampaignConversionGoal)
    CampaignConversionGoalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignConversionGoal.newBuilder() to construct.
  private CampaignConversionGoal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignConversionGoal() {
    resourceName_ = "";
    campaign_ = "";
    category_ = 0;
    origin_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignConversionGoal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.resources.CampaignConversionGoalProto.internal_static_google_ads_googleads_v12_resources_CampaignConversionGoal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.resources.CampaignConversionGoalProto.internal_static_google_ads_googleads_v12_resources_CampaignConversionGoal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.resources.CampaignConversionGoal.class, com.google.ads.googleads.v12.resources.CampaignConversionGoal.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Immutable. The resource name of the campaign conversion goal.
   * Campaign conversion goal resource names have the form:
   * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
   * Immutable. The resource name of the campaign conversion goal.
   * Campaign conversion goal resource names have the form:
   * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

  public static final int CAMPAIGN_FIELD_NUMBER = 2;
  private volatile java.lang.Object campaign_;
  /**
   * <pre>
   * Immutable. The campaign with which this campaign conversion goal is associated.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  @java.lang.Override
  public java.lang.String getCampaign() {
    java.lang.Object ref = campaign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campaign_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The campaign with which this campaign conversion goal is associated.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampaignBytes() {
    java.lang.Object ref = campaign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campaign_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATEGORY_FIELD_NUMBER = 3;
  private int category_;
  /**
   * <pre>
   * The conversion category of this campaign conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
   * @return The enum numeric value on the wire for category.
   */
  @java.lang.Override public int getCategoryValue() {
    return category_;
  }
  /**
   * <pre>
   * The conversion category of this campaign conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
   * @return The category.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory getCategory() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory result = com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory.valueOf(category_);
    return result == null ? com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory.UNRECOGNIZED : result;
  }

  public static final int ORIGIN_FIELD_NUMBER = 4;
  private int origin_;
  /**
   * <pre>
   * The conversion origin of this campaign conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
   * @return The enum numeric value on the wire for origin.
   */
  @java.lang.Override public int getOriginValue() {
    return origin_;
  }
  /**
   * <pre>
   * The conversion origin of this campaign conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
   * @return The origin.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin getOrigin() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin result = com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin.valueOf(origin_);
    return result == null ? com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin.UNRECOGNIZED : result;
  }

  public static final int BIDDABLE_FIELD_NUMBER = 5;
  private boolean biddable_;
  /**
   * <pre>
   * The biddability of the campaign conversion goal.
   * </pre>
   *
   * <code>bool biddable = 5;</code>
   * @return The biddable.
   */
  @java.lang.Override
  public boolean getBiddable() {
    return biddable_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, campaign_);
    }
    if (category_ != com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, category_);
    }
    if (origin_ != com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, origin_);
    }
    if (biddable_ != false) {
      output.writeBool(5, biddable_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, campaign_);
    }
    if (category_ != com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, category_);
    }
    if (origin_ != com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, origin_);
    }
    if (biddable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, biddable_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.resources.CampaignConversionGoal)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.resources.CampaignConversionGoal other = (com.google.ads.googleads.v12.resources.CampaignConversionGoal) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getCampaign()
        .equals(other.getCampaign())) return false;
    if (category_ != other.category_) return false;
    if (origin_ != other.origin_) return false;
    if (getBiddable()
        != other.getBiddable()) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
    hash = (53 * hash) + getCampaign().hashCode();
    hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + category_;
    hash = (37 * hash) + ORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + origin_;
    hash = (37 * hash) + BIDDABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBiddable());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.resources.CampaignConversionGoal prototype) {
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
   * The biddability setting for the specified campaign only for all
   * conversion actions with a matching category and origin.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.resources.CampaignConversionGoal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.resources.CampaignConversionGoal)
      com.google.ads.googleads.v12.resources.CampaignConversionGoalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.resources.CampaignConversionGoalProto.internal_static_google_ads_googleads_v12_resources_CampaignConversionGoal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.resources.CampaignConversionGoalProto.internal_static_google_ads_googleads_v12_resources_CampaignConversionGoal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.resources.CampaignConversionGoal.class, com.google.ads.googleads.v12.resources.CampaignConversionGoal.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.resources.CampaignConversionGoal.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceName_ = "";

      campaign_ = "";

      category_ = 0;

      origin_ = 0;

      biddable_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.resources.CampaignConversionGoalProto.internal_static_google_ads_googleads_v12_resources_CampaignConversionGoal_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.CampaignConversionGoal getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.resources.CampaignConversionGoal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.CampaignConversionGoal build() {
      com.google.ads.googleads.v12.resources.CampaignConversionGoal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.CampaignConversionGoal buildPartial() {
      com.google.ads.googleads.v12.resources.CampaignConversionGoal result = new com.google.ads.googleads.v12.resources.CampaignConversionGoal(this);
      result.resourceName_ = resourceName_;
      result.campaign_ = campaign_;
      result.category_ = category_;
      result.origin_ = origin_;
      result.biddable_ = biddable_;
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
      if (other instanceof com.google.ads.googleads.v12.resources.CampaignConversionGoal) {
        return mergeFrom((com.google.ads.googleads.v12.resources.CampaignConversionGoal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.resources.CampaignConversionGoal other) {
      if (other == com.google.ads.googleads.v12.resources.CampaignConversionGoal.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (!other.getCampaign().isEmpty()) {
        campaign_ = other.campaign_;
        onChanged();
      }
      if (other.category_ != 0) {
        setCategoryValue(other.getCategoryValue());
      }
      if (other.origin_ != 0) {
        setOriginValue(other.getOriginValue());
      }
      if (other.getBiddable() != false) {
        setBiddable(other.getBiddable());
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
              resourceName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              campaign_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              category_ = input.readEnum();

              break;
            } // case 24
            case 32: {
              origin_ = input.readEnum();

              break;
            } // case 32
            case 40: {
              biddable_ = input.readBool();

              break;
            } // case 40
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Immutable. The resource name of the campaign conversion goal.
     * Campaign conversion goal resource names have the form:
     * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the campaign conversion goal.
     * Campaign conversion goal resource names have the form:
     * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the campaign conversion goal.
     * Campaign conversion goal resource names have the form:
     * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the campaign conversion goal.
     * Campaign conversion goal resource names have the form:
     * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the campaign conversion goal.
     * Campaign conversion goal resource names have the form:
     * `customers/{customer_id}/campaignConversionGoals/{campaign_id}~{category}~{origin}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

    private java.lang.Object campaign_ = "";
    /**
     * <pre>
     * Immutable. The campaign with which this campaign conversion goal is associated.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The campaign.
     */
    public java.lang.String getCampaign() {
      java.lang.Object ref = campaign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campaign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The campaign with which this campaign conversion goal is associated.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for campaign.
     */
    public com.google.protobuf.ByteString
        getCampaignBytes() {
      java.lang.Object ref = campaign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campaign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The campaign with which this campaign conversion goal is associated.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaign(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      campaign_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The campaign with which this campaign conversion goal is associated.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaign() {
      
      campaign_ = getDefaultInstance().getCampaign();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The campaign with which this campaign conversion goal is associated.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      campaign_ = value;
      onChanged();
      return this;
    }

    private int category_ = 0;
    /**
     * <pre>
     * The conversion category of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
     * @return The enum numeric value on the wire for category.
     */
    @java.lang.Override public int getCategoryValue() {
      return category_;
    }
    /**
     * <pre>
     * The conversion category of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
     * @param value The enum numeric value on the wire for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryValue(int value) {
      
      category_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The conversion category of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
     * @return The category.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory getCategory() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory result = com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory.valueOf(category_);
      return result == null ? com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The conversion category of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(com.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      category_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The conversion category of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionActionCategoryEnum.ConversionActionCategory category = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      
      category_ = 0;
      onChanged();
      return this;
    }

    private int origin_ = 0;
    /**
     * <pre>
     * The conversion origin of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
     * @return The enum numeric value on the wire for origin.
     */
    @java.lang.Override public int getOriginValue() {
      return origin_;
    }
    /**
     * <pre>
     * The conversion origin of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
     * @param value The enum numeric value on the wire for origin to set.
     * @return This builder for chaining.
     */
    public Builder setOriginValue(int value) {
      
      origin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The conversion origin of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
     * @return The origin.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin getOrigin() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin result = com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin.valueOf(origin_);
      return result == null ? com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The conversion origin of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
     * @param value The origin to set.
     * @return This builder for chaining.
     */
    public Builder setOrigin(com.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      origin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The conversion origin of this campaign conversion goal.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ConversionOriginEnum.ConversionOrigin origin = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrigin() {
      
      origin_ = 0;
      onChanged();
      return this;
    }

    private boolean biddable_ ;
    /**
     * <pre>
     * The biddability of the campaign conversion goal.
     * </pre>
     *
     * <code>bool biddable = 5;</code>
     * @return The biddable.
     */
    @java.lang.Override
    public boolean getBiddable() {
      return biddable_;
    }
    /**
     * <pre>
     * The biddability of the campaign conversion goal.
     * </pre>
     *
     * <code>bool biddable = 5;</code>
     * @param value The biddable to set.
     * @return This builder for chaining.
     */
    public Builder setBiddable(boolean value) {
      
      biddable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The biddability of the campaign conversion goal.
     * </pre>
     *
     * <code>bool biddable = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBiddable() {
      
      biddable_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.resources.CampaignConversionGoal)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.resources.CampaignConversionGoal)
  private static final com.google.ads.googleads.v12.resources.CampaignConversionGoal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.resources.CampaignConversionGoal();
  }

  public static com.google.ads.googleads.v12.resources.CampaignConversionGoal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignConversionGoal>
      PARSER = new com.google.protobuf.AbstractParser<CampaignConversionGoal>() {
    @java.lang.Override
    public CampaignConversionGoal parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignConversionGoal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignConversionGoal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.resources.CampaignConversionGoal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

