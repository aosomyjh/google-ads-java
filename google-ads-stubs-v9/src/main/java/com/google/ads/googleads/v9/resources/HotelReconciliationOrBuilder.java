// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/hotel_reconciliation.proto

package com.google.ads.googleads.v9.resources;

public interface HotelReconciliationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.HotelReconciliation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the hotel reconciliation.
   * Hotel reconciliation resource names have the form:
   * `customers/{customer_id}/hotelReconciliations/{commission_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the hotel reconciliation.
   * Hotel reconciliation resource names have the form:
   * `customers/{customer_id}/hotelReconciliations/{commission_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Required. Output only. The commission ID is Google's ID for this booking. Every booking event is
   * assigned a Commission ID to help you match it to a guest stay.
   * </pre>
   *
   * <code>string commission_id = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The commissionId.
   */
  java.lang.String getCommissionId();
  /**
   * <pre>
   * Required. Output only. The commission ID is Google's ID for this booking. Every booking event is
   * assigned a Commission ID to help you match it to a guest stay.
   * </pre>
   *
   * <code>string commission_id = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for commissionId.
   */
  com.google.protobuf.ByteString
      getCommissionIdBytes();

  /**
   * <pre>
   * Output only. The order ID is the identifier for this booking as provided in the
   * 'transaction_id' parameter of the conversion tracking tag.
   * </pre>
   *
   * <code>string order_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <pre>
   * Output only. The order ID is the identifier for this booking as provided in the
   * 'transaction_id' parameter of the conversion tracking tag.
   * </pre>
   *
   * <code>string order_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <pre>
   * Output only. Identifier for the Hotel Center account which provides the rates for the
   * Hotel campaign.
   * </pre>
   *
   * <code>int64 hotel_center_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hotelCenterId.
   */
  long getHotelCenterId();

  /**
   * <pre>
   * Output only. Unique identifier for the booked property, as provided in the Hotel Center
   * feed. The hotel ID comes from the 'ID' parameter of the conversion tracking
   * tag.
   * </pre>
   *
   * <code>string hotel_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hotelId.
   */
  java.lang.String getHotelId();
  /**
   * <pre>
   * Output only. Unique identifier for the booked property, as provided in the Hotel Center
   * feed. The hotel ID comes from the 'ID' parameter of the conversion tracking
   * tag.
   * </pre>
   *
   * <code>string hotel_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for hotelId.
   */
  com.google.protobuf.ByteString
      getHotelIdBytes();

  /**
   * <pre>
   * Output only. Check-in date recorded when the booking is made. If the check-in date is
   * modified at reconciliation, the revised date will then take the place of
   * the original date in this column. Format is YYYY-MM-DD.
   * </pre>
   *
   * <code>string check_in_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The checkInDate.
   */
  java.lang.String getCheckInDate();
  /**
   * <pre>
   * Output only. Check-in date recorded when the booking is made. If the check-in date is
   * modified at reconciliation, the revised date will then take the place of
   * the original date in this column. Format is YYYY-MM-DD.
   * </pre>
   *
   * <code>string check_in_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for checkInDate.
   */
  com.google.protobuf.ByteString
      getCheckInDateBytes();

  /**
   * <pre>
   * Output only. Check-out date recorded when the booking is made. If the check-in date is
   * modified at reconciliation, the revised date will then take the place of
   * the original date in this column. Format is YYYY-MM-DD.
   * </pre>
   *
   * <code>string check_out_date = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The checkOutDate.
   */
  java.lang.String getCheckOutDate();
  /**
   * <pre>
   * Output only. Check-out date recorded when the booking is made. If the check-in date is
   * modified at reconciliation, the revised date will then take the place of
   * the original date in this column. Format is YYYY-MM-DD.
   * </pre>
   *
   * <code>string check_out_date = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for checkOutDate.
   */
  com.google.protobuf.ByteString
      getCheckOutDateBytes();

  /**
   * <pre>
   * Required. Output only. Reconciled value is the final value of a booking as paid by the guest. If
   * original booking value changes for any reason, such as itinerary changes or
   * room upsells, the reconciled value should be the full final amount
   * collected. If a booking is canceled, the reconciled value should include
   * the value of any cancellation fees or non-refundable nights charged. Value
   * is in millionths of the base unit currency. For example, $12.35 would be
   * represented as 12350000. Currency unit is in the default customer currency.
   * </pre>
   *
   * <code>int64 reconciled_value_micros = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The reconciledValueMicros.
   */
  long getReconciledValueMicros();

  /**
   * <pre>
   * Output only. Whether a given booking has been billed. Once billed, a booking can't be
   * modified.
   * </pre>
   *
   * <code>bool billed = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The billed.
   */
  boolean getBilled();

  /**
   * <pre>
   * Required. Output only. Current status of a booking with regards to reconciliation and billing.
   * Bookings should be reconciled within 45 days after the check-out date.
   * Any booking not reconciled within 45 days will be billed at its original
   * value.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.HotelReconciliationStatusEnum.HotelReconciliationStatus status = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Required. Output only. Current status of a booking with regards to reconciliation and billing.
   * Bookings should be reconciled within 45 days after the check-out date.
   * Any booking not reconciled within 45 days will be billed at its original
   * value.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.HotelReconciliationStatusEnum.HotelReconciliationStatus status = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v9.enums.HotelReconciliationStatusEnum.HotelReconciliationStatus getStatus();
}