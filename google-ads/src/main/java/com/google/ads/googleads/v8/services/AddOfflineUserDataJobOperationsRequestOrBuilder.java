// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/offline_user_data_job_service.proto

package com.google.ads.googleads.v8.services;

public interface AddOfflineUserDataJobOperationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.AddOfflineUserDataJobOperationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the OfflineUserDataJob.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Required. The resource name of the OfflineUserDataJob.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * True to enable partial failure for the offline user data job.
   * </pre>
   *
   * <code>bool enable_partial_failure = 4;</code>
   * @return Whether the enablePartialFailure field is set.
   */
  boolean hasEnablePartialFailure();
  /**
   * <pre>
   * True to enable partial failure for the offline user data job.
   * </pre>
   *
   * <code>bool enable_partial_failure = 4;</code>
   * @return The enablePartialFailure.
   */
  boolean getEnablePartialFailure();

  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.OfflineUserDataJobOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v8.services.OfflineUserDataJobOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.OfflineUserDataJobOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v8.services.OfflineUserDataJobOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.OfflineUserDataJobOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.OfflineUserDataJobOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.services.OfflineUserDataJobOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.OfflineUserDataJobOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v8.services.OfflineUserDataJobOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 5;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}