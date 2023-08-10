// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/asset_group_listing_group_filter.proto

package com.google.ads.googleads.v14.resources;

public interface AssetGroupListingGroupFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.AssetGroupListingGroupFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the asset group listing group filter.
   * Asset group listing group filter resource name have the form:
   *
   * `customers/{customer_id}/assetGroupListingGroupFilters/{asset_group_id}~{listing_group_filter_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the asset group listing group filter.
   * Asset group listing group filter resource name have the form:
   *
   * `customers/{customer_id}/assetGroupListingGroupFilters/{asset_group_id}~{listing_group_filter_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The asset group which this asset group listing group filter is
   * part of.
   * </pre>
   *
   * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetGroup.
   */
  java.lang.String getAssetGroup();
  /**
   * <pre>
   * Immutable. The asset group which this asset group listing group filter is
   * part of.
   * </pre>
   *
   * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetGroup.
   */
  com.google.protobuf.ByteString
      getAssetGroupBytes();

  /**
   * <pre>
   * Output only. The ID of the ListingGroupFilter.
   * </pre>
   *
   * <code>int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Immutable. Type of a listing group filter node.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ListingGroupFilterTypeEnum.ListingGroupFilterType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. Type of a listing group filter node.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ListingGroupFilterTypeEnum.ListingGroupFilterType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v14.enums.ListingGroupFilterTypeEnum.ListingGroupFilterType getType();

  /**
   * <pre>
   * Immutable. The vertical the current node tree represents. All nodes in the
   * same tree must belong to the same vertical.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ListingGroupFilterVerticalEnum.ListingGroupFilterVertical vertical = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for vertical.
   */
  int getVerticalValue();
  /**
   * <pre>
   * Immutable. The vertical the current node tree represents. All nodes in the
   * same tree must belong to the same vertical.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ListingGroupFilterVerticalEnum.ListingGroupFilterVertical vertical = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The vertical.
   */
  com.google.ads.googleads.v14.enums.ListingGroupFilterVerticalEnum.ListingGroupFilterVertical getVertical();

  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ListingGroupFilterDimension case_value = 6;</code>
   * @return Whether the caseValue field is set.
   */
  boolean hasCaseValue();
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ListingGroupFilterDimension case_value = 6;</code>
   * @return The caseValue.
   */
  com.google.ads.googleads.v14.resources.ListingGroupFilterDimension getCaseValue();
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ListingGroupFilterDimension case_value = 6;</code>
   */
  com.google.ads.googleads.v14.resources.ListingGroupFilterDimensionOrBuilder getCaseValueOrBuilder();

  /**
   * <pre>
   * Immutable. Resource name of the parent listing group subdivision. Null for
   * the root listing group filter node.
   * </pre>
   *
   * <code>string parent_listing_group_filter = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The parentListingGroupFilter.
   */
  java.lang.String getParentListingGroupFilter();
  /**
   * <pre>
   * Immutable. Resource name of the parent listing group subdivision. Null for
   * the root listing group filter node.
   * </pre>
   *
   * <code>string parent_listing_group_filter = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parentListingGroupFilter.
   */
  com.google.protobuf.ByteString
      getParentListingGroupFilterBytes();

  /**
   * <pre>
   * Output only. The path of dimensions defining this listing group filter.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ListingGroupFilterDimensionPath path = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <pre>
   * Output only. The path of dimensions defining this listing group filter.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ListingGroupFilterDimensionPath path = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The path.
   */
  com.google.ads.googleads.v14.resources.ListingGroupFilterDimensionPath getPath();
  /**
   * <pre>
   * Output only. The path of dimensions defining this listing group filter.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ListingGroupFilterDimensionPath path = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.ListingGroupFilterDimensionPathOrBuilder getPathOrBuilder();
}
