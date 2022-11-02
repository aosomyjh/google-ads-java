// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/custom_conversion_goal.proto

package com.google.ads.googleads.v12.resources;

public interface CustomConversionGoalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.CustomConversionGoal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the custom conversion goal.
   * Custom conversion goal resource names have the form:
   * `customers/{customer_id}/customConversionGoals/{goal_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the custom conversion goal.
   * Custom conversion goal resource names have the form:
   * `customers/{customer_id}/customConversionGoals/{goal_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The ID for this custom conversion goal.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name for this custom conversion goal.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name for this custom conversion goal.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Conversion actions that the custom conversion goal makes biddable.
   * </pre>
   *
   * <code>repeated string conversion_actions = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the conversionActions.
   */
  java.util.List<java.lang.String>
      getConversionActionsList();
  /**
   * <pre>
   * Conversion actions that the custom conversion goal makes biddable.
   * </pre>
   *
   * <code>repeated string conversion_actions = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of conversionActions.
   */
  int getConversionActionsCount();
  /**
   * <pre>
   * Conversion actions that the custom conversion goal makes biddable.
   * </pre>
   *
   * <code>repeated string conversion_actions = 4 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The conversionActions at the given index.
   */
  java.lang.String getConversionActions(int index);
  /**
   * <pre>
   * Conversion actions that the custom conversion goal makes biddable.
   * </pre>
   *
   * <code>repeated string conversion_actions = 4 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the conversionActions at the given index.
   */
  com.google.protobuf.ByteString
      getConversionActionsBytes(int index);

  /**
   * <pre>
   * The status of the custom conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CustomConversionGoalStatusEnum.CustomConversionGoalStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the custom conversion goal.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CustomConversionGoalStatusEnum.CustomConversionGoalStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v12.enums.CustomConversionGoalStatusEnum.CustomConversionGoalStatus getStatus();
}
