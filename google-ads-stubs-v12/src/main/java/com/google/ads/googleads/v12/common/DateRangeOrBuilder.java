// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/dates.proto

package com.google.ads.googleads.v12.common;

public interface DateRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.DateRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 3;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 3;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 3;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * The end date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string end_date = 4;</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * The end date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string end_date = 4;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * The end date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string end_date = 4;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();
}
