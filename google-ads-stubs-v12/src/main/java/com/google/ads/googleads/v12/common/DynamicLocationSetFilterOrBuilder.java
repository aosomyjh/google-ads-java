// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/feed_item_set_filter_type_infos.proto

package com.google.ads.googleads.v12.common;

public interface DynamicLocationSetFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.DynamicLocationSetFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If multiple labels are set, then only feeditems marked with all the labels
   * will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @return A list containing the labels.
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * If multiple labels are set, then only feeditems marked with all the labels
   * will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   * <pre>
   * If multiple labels are set, then only feeditems marked with all the labels
   * will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * If multiple labels are set, then only feeditems marked with all the labels
   * will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <pre>
   * Business name filter.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.BusinessNameFilter business_name_filter = 2;</code>
   * @return Whether the businessNameFilter field is set.
   */
  boolean hasBusinessNameFilter();
  /**
   * <pre>
   * Business name filter.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.BusinessNameFilter business_name_filter = 2;</code>
   * @return The businessNameFilter.
   */
  com.google.ads.googleads.v12.common.BusinessNameFilter getBusinessNameFilter();
  /**
   * <pre>
   * Business name filter.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.BusinessNameFilter business_name_filter = 2;</code>
   */
  com.google.ads.googleads.v12.common.BusinessNameFilterOrBuilder getBusinessNameFilterOrBuilder();
}
