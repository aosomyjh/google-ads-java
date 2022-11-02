// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/label.proto

package com.google.ads.googleads.v12.resources;

public interface LabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.Label)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Name of the resource.
   * Label resource names have the form:
   * `customers/{customer_id}/labels/{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Name of the resource.
   * Label resource names have the form:
   * `customers/{customer_id}/labels/{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of the label. Read only.
   * </pre>
   *
   * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. ID of the label. Read only.
   * </pre>
   *
   * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the label.
   * This field is required and should not be empty when creating a new label.
   * The length of this string should be between 1 and 80, inclusive.
   * </pre>
   *
   * <code>optional string name = 7;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the label.
   * This field is required and should not be empty when creating a new label.
   * The length of this string should be between 1 and 80, inclusive.
   * </pre>
   *
   * <code>optional string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the label.
   * This field is required and should not be empty when creating a new label.
   * The length of this string should be between 1 and 80, inclusive.
   * </pre>
   *
   * <code>optional string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Status of the label. Read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.LabelStatusEnum.LabelStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the label. Read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.LabelStatusEnum.LabelStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v12.enums.LabelStatusEnum.LabelStatus getStatus();

  /**
   * <pre>
   * A type of label displaying text on a colored background.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.TextLabel text_label = 5;</code>
   * @return Whether the textLabel field is set.
   */
  boolean hasTextLabel();
  /**
   * <pre>
   * A type of label displaying text on a colored background.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.TextLabel text_label = 5;</code>
   * @return The textLabel.
   */
  com.google.ads.googleads.v12.common.TextLabel getTextLabel();
  /**
   * <pre>
   * A type of label displaying text on a colored background.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.TextLabel text_label = 5;</code>
   */
  com.google.ads.googleads.v12.common.TextLabelOrBuilder getTextLabelOrBuilder();
}
