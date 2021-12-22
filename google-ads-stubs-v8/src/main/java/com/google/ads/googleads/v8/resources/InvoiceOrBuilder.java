// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/invoice.proto

package com.google.ads.googleads.v8.resources;

public interface InvoiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.Invoice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the invoice. Multiple customers can share a given
   * invoice, so multiple resource names may point to the same invoice.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the invoice. Multiple customers can share a given
   * invoice, so multiple resource names may point to the same invoice.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the invoice. It appears on the invoice PDF as "Invoice number".
   * </pre>
   *
   * <code>optional string id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the invoice. It appears on the invoice PDF as "Invoice number".
   * </pre>
   *
   * <code>optional string id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. The ID of the invoice. It appears on the invoice PDF as "Invoice number".
   * </pre>
   *
   * <code>optional string id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. The type of invoice.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.InvoiceTypeEnum.InvoiceType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of invoice.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.InvoiceTypeEnum.InvoiceType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v8.enums.InvoiceTypeEnum.InvoiceType getType();

  /**
   * <pre>
   * Output only. The resource name of this invoice’s billing setup.
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>optional string billing_setup = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the billingSetup field is set.
   */
  boolean hasBillingSetup();
  /**
   * <pre>
   * Output only. The resource name of this invoice’s billing setup.
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>optional string billing_setup = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The billingSetup.
   */
  java.lang.String getBillingSetup();
  /**
   * <pre>
   * Output only. The resource name of this invoice’s billing setup.
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>optional string billing_setup = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for billingSetup.
   */
  com.google.protobuf.ByteString
      getBillingSetupBytes();

  /**
   * <pre>
   * Output only. A 16 digit ID used to identify the payments account associated with the
   * billing setup, e.g. "1234-5678-9012-3456". It appears on the invoice PDF as
   * "Billing Account Number".
   * </pre>
   *
   * <code>optional string payments_account_id = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the paymentsAccountId field is set.
   */
  boolean hasPaymentsAccountId();
  /**
   * <pre>
   * Output only. A 16 digit ID used to identify the payments account associated with the
   * billing setup, e.g. "1234-5678-9012-3456". It appears on the invoice PDF as
   * "Billing Account Number".
   * </pre>
   *
   * <code>optional string payments_account_id = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The paymentsAccountId.
   */
  java.lang.String getPaymentsAccountId();
  /**
   * <pre>
   * Output only. A 16 digit ID used to identify the payments account associated with the
   * billing setup, e.g. "1234-5678-9012-3456". It appears on the invoice PDF as
   * "Billing Account Number".
   * </pre>
   *
   * <code>optional string payments_account_id = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for paymentsAccountId.
   */
  com.google.protobuf.ByteString
      getPaymentsAccountIdBytes();

  /**
   * <pre>
   * Output only. A 12 digit ID used to identify the payments profile associated with the
   * billing setup, e.g. "1234-5678-9012". It appears on the invoice PDF as
   * "Billing ID".
   * </pre>
   *
   * <code>optional string payments_profile_id = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the paymentsProfileId field is set.
   */
  boolean hasPaymentsProfileId();
  /**
   * <pre>
   * Output only. A 12 digit ID used to identify the payments profile associated with the
   * billing setup, e.g. "1234-5678-9012". It appears on the invoice PDF as
   * "Billing ID".
   * </pre>
   *
   * <code>optional string payments_profile_id = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The paymentsProfileId.
   */
  java.lang.String getPaymentsProfileId();
  /**
   * <pre>
   * Output only. A 12 digit ID used to identify the payments profile associated with the
   * billing setup, e.g. "1234-5678-9012". It appears on the invoice PDF as
   * "Billing ID".
   * </pre>
   *
   * <code>optional string payments_profile_id = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for paymentsProfileId.
   */
  com.google.protobuf.ByteString
      getPaymentsProfileIdBytes();

  /**
   * <pre>
   * Output only. The issue date in yyyy-mm-dd format. It appears on the invoice PDF as
   * either "Issue date" or "Invoice date".
   * </pre>
   *
   * <code>optional string issue_date = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the issueDate field is set.
   */
  boolean hasIssueDate();
  /**
   * <pre>
   * Output only. The issue date in yyyy-mm-dd format. It appears on the invoice PDF as
   * either "Issue date" or "Invoice date".
   * </pre>
   *
   * <code>optional string issue_date = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The issueDate.
   */
  java.lang.String getIssueDate();
  /**
   * <pre>
   * Output only. The issue date in yyyy-mm-dd format. It appears on the invoice PDF as
   * either "Issue date" or "Invoice date".
   * </pre>
   *
   * <code>optional string issue_date = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for issueDate.
   */
  com.google.protobuf.ByteString
      getIssueDateBytes();

  /**
   * <pre>
   * Output only. The due date in yyyy-mm-dd format.
   * </pre>
   *
   * <code>optional string due_date = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the dueDate field is set.
   */
  boolean hasDueDate();
  /**
   * <pre>
   * Output only. The due date in yyyy-mm-dd format.
   * </pre>
   *
   * <code>optional string due_date = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dueDate.
   */
  java.lang.String getDueDate();
  /**
   * <pre>
   * Output only. The due date in yyyy-mm-dd format.
   * </pre>
   *
   * <code>optional string due_date = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for dueDate.
   */
  com.google.protobuf.ByteString
      getDueDateBytes();

  /**
   * <pre>
   * Output only. The service period date range of this invoice. The end date is inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DateRange service_date_range = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the serviceDateRange field is set.
   */
  boolean hasServiceDateRange();
  /**
   * <pre>
   * Output only. The service period date range of this invoice. The end date is inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DateRange service_date_range = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The serviceDateRange.
   */
  com.google.ads.googleads.v8.common.DateRange getServiceDateRange();
  /**
   * <pre>
   * Output only. The service period date range of this invoice. The end date is inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DateRange service_date_range = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v8.common.DateRangeOrBuilder getServiceDateRangeOrBuilder();

  /**
   * <pre>
   * Output only. The currency code. All costs are returned in this currency. A subset of the
   * currency codes derived from the ISO 4217 standard is supported.
   * </pre>
   *
   * <code>optional string currency_code = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Output only. The currency code. All costs are returned in this currency. A subset of the
   * currency codes derived from the ISO 4217 standard is supported.
   * </pre>
   *
   * <code>optional string currency_code = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Output only. The currency code. All costs are returned in this currency. A subset of the
   * currency codes derived from the ISO 4217 standard is supported.
   * </pre>
   *
   * <code>optional string currency_code = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * Output only. The pretax subtotal amount of invoice level adjustments, in micros.
   * </pre>
   *
   * <code>int64 adjustments_subtotal_amount_micros = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adjustmentsSubtotalAmountMicros.
   */
  long getAdjustmentsSubtotalAmountMicros();

  /**
   * <pre>
   * Output only. The sum of taxes on the invoice level adjustments, in micros.
   * </pre>
   *
   * <code>int64 adjustments_tax_amount_micros = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adjustmentsTaxAmountMicros.
   */
  long getAdjustmentsTaxAmountMicros();

  /**
   * <pre>
   * Output only. The total amount of invoice level adjustments, in micros.
   * </pre>
   *
   * <code>int64 adjustments_total_amount_micros = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adjustmentsTotalAmountMicros.
   */
  long getAdjustmentsTotalAmountMicros();

  /**
   * <pre>
   * Output only. The pretax subtotal amount of invoice level regulatory costs, in micros.
   * </pre>
   *
   * <code>int64 regulatory_costs_subtotal_amount_micros = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The regulatoryCostsSubtotalAmountMicros.
   */
  long getRegulatoryCostsSubtotalAmountMicros();

  /**
   * <pre>
   * Output only. The sum of taxes on the invoice level regulatory costs, in micros.
   * </pre>
   *
   * <code>int64 regulatory_costs_tax_amount_micros = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The regulatoryCostsTaxAmountMicros.
   */
  long getRegulatoryCostsTaxAmountMicros();

  /**
   * <pre>
   * Output only. The total amount of invoice level regulatory costs, in micros.
   * </pre>
   *
   * <code>int64 regulatory_costs_total_amount_micros = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The regulatoryCostsTotalAmountMicros.
   */
  long getRegulatoryCostsTotalAmountMicros();

  /**
   * <pre>
   * Output only. The pretax subtotal amount, in micros. This equals the
   * sum of the AccountBudgetSummary subtotal amounts,
   * Invoice.adjustments_subtotal_amount_micros, and
   * Invoice.regulatory_costs_subtotal_amount_micros.
   * Starting with v6, the Invoice.regulatory_costs_subtotal_amount_micros is no
   * longer included.
   * </pre>
   *
   * <code>optional int64 subtotal_amount_micros = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the subtotalAmountMicros field is set.
   */
  boolean hasSubtotalAmountMicros();
  /**
   * <pre>
   * Output only. The pretax subtotal amount, in micros. This equals the
   * sum of the AccountBudgetSummary subtotal amounts,
   * Invoice.adjustments_subtotal_amount_micros, and
   * Invoice.regulatory_costs_subtotal_amount_micros.
   * Starting with v6, the Invoice.regulatory_costs_subtotal_amount_micros is no
   * longer included.
   * </pre>
   *
   * <code>optional int64 subtotal_amount_micros = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The subtotalAmountMicros.
   */
  long getSubtotalAmountMicros();

  /**
   * <pre>
   * Output only. The sum of all taxes on the invoice, in micros. This equals the sum of the
   * AccountBudgetSummary tax amounts, plus taxes not associated with a specific
   * account budget.
   * </pre>
   *
   * <code>optional int64 tax_amount_micros = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the taxAmountMicros field is set.
   */
  boolean hasTaxAmountMicros();
  /**
   * <pre>
   * Output only. The sum of all taxes on the invoice, in micros. This equals the sum of the
   * AccountBudgetSummary tax amounts, plus taxes not associated with a specific
   * account budget.
   * </pre>
   *
   * <code>optional int64 tax_amount_micros = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The taxAmountMicros.
   */
  long getTaxAmountMicros();

  /**
   * <pre>
   * Output only. The total amount, in micros. This equals the sum of
   * Invoice.subtotal_amount_micros and Invoice.tax_amount_micros.
   * Starting with v6, Invoice.regulatory_costs_subtotal_amount_micros is
   * also added as it is no longer already included in
   * Invoice.tax_amount_micros.
   * </pre>
   *
   * <code>optional int64 total_amount_micros = 35 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the totalAmountMicros field is set.
   */
  boolean hasTotalAmountMicros();
  /**
   * <pre>
   * Output only. The total amount, in micros. This equals the sum of
   * Invoice.subtotal_amount_micros and Invoice.tax_amount_micros.
   * Starting with v6, Invoice.regulatory_costs_subtotal_amount_micros is
   * also added as it is no longer already included in
   * Invoice.tax_amount_micros.
   * </pre>
   *
   * <code>optional int64 total_amount_micros = 35 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The totalAmountMicros.
   */
  long getTotalAmountMicros();

  /**
   * <pre>
   * Output only. The resource name of the original invoice corrected, wrote off, or canceled
   * by this invoice, if applicable. If `corrected_invoice` is set,
   * `replaced_invoices` will not be set.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>optional string corrected_invoice = 36 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the correctedInvoice field is set.
   */
  boolean hasCorrectedInvoice();
  /**
   * <pre>
   * Output only. The resource name of the original invoice corrected, wrote off, or canceled
   * by this invoice, if applicable. If `corrected_invoice` is set,
   * `replaced_invoices` will not be set.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>optional string corrected_invoice = 36 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The correctedInvoice.
   */
  java.lang.String getCorrectedInvoice();
  /**
   * <pre>
   * Output only. The resource name of the original invoice corrected, wrote off, or canceled
   * by this invoice, if applicable. If `corrected_invoice` is set,
   * `replaced_invoices` will not be set.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>optional string corrected_invoice = 36 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for correctedInvoice.
   */
  com.google.protobuf.ByteString
      getCorrectedInvoiceBytes();

  /**
   * <pre>
   * Output only. The resource name of the original invoice(s) being rebilled or replaced by
   * this invoice, if applicable. There might be multiple replaced invoices due
   * to invoice consolidation. The replaced invoices may not belong to the same
   * payments account. If `replaced_invoices` is set, `corrected_invoice` will
   * not be set.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>repeated string replaced_invoices = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the replacedInvoices.
   */
  java.util.List<java.lang.String>
      getReplacedInvoicesList();
  /**
   * <pre>
   * Output only. The resource name of the original invoice(s) being rebilled or replaced by
   * this invoice, if applicable. There might be multiple replaced invoices due
   * to invoice consolidation. The replaced invoices may not belong to the same
   * payments account. If `replaced_invoices` is set, `corrected_invoice` will
   * not be set.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>repeated string replaced_invoices = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of replacedInvoices.
   */
  int getReplacedInvoicesCount();
  /**
   * <pre>
   * Output only. The resource name of the original invoice(s) being rebilled or replaced by
   * this invoice, if applicable. There might be multiple replaced invoices due
   * to invoice consolidation. The replaced invoices may not belong to the same
   * payments account. If `replaced_invoices` is set, `corrected_invoice` will
   * not be set.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>repeated string replaced_invoices = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The replacedInvoices at the given index.
   */
  java.lang.String getReplacedInvoices(int index);
  /**
   * <pre>
   * Output only. The resource name of the original invoice(s) being rebilled or replaced by
   * this invoice, if applicable. There might be multiple replaced invoices due
   * to invoice consolidation. The replaced invoices may not belong to the same
   * payments account. If `replaced_invoices` is set, `corrected_invoice` will
   * not be set.
   * Invoice resource names have the form:
   * `customers/{customer_id}/invoices/{invoice_id}`
   * </pre>
   *
   * <code>repeated string replaced_invoices = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the replacedInvoices at the given index.
   */
  com.google.protobuf.ByteString
      getReplacedInvoicesBytes(int index);

  /**
   * <pre>
   * Output only. The URL to a PDF copy of the invoice. Users need to pass in their OAuth
   * token to request the PDF with this URL.
   * </pre>
   *
   * <code>optional string pdf_url = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the pdfUrl field is set.
   */
  boolean hasPdfUrl();
  /**
   * <pre>
   * Output only. The URL to a PDF copy of the invoice. Users need to pass in their OAuth
   * token to request the PDF with this URL.
   * </pre>
   *
   * <code>optional string pdf_url = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pdfUrl.
   */
  java.lang.String getPdfUrl();
  /**
   * <pre>
   * Output only. The URL to a PDF copy of the invoice. Users need to pass in their OAuth
   * token to request the PDF with this URL.
   * </pre>
   *
   * <code>optional string pdf_url = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for pdfUrl.
   */
  com.google.protobuf.ByteString
      getPdfUrlBytes();

  /**
   * <pre>
   * Output only. The list of summarized account budget information associated with this
   * invoice.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.resources.Invoice.AccountBudgetSummary account_budget_summaries = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v8.resources.Invoice.AccountBudgetSummary> 
      getAccountBudgetSummariesList();
  /**
   * <pre>
   * Output only. The list of summarized account budget information associated with this
   * invoice.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.resources.Invoice.AccountBudgetSummary account_budget_summaries = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v8.resources.Invoice.AccountBudgetSummary getAccountBudgetSummaries(int index);
  /**
   * <pre>
   * Output only. The list of summarized account budget information associated with this
   * invoice.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.resources.Invoice.AccountBudgetSummary account_budget_summaries = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAccountBudgetSummariesCount();
  /**
   * <pre>
   * Output only. The list of summarized account budget information associated with this
   * invoice.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.resources.Invoice.AccountBudgetSummary account_budget_summaries = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.resources.Invoice.AccountBudgetSummaryOrBuilder> 
      getAccountBudgetSummariesOrBuilderList();
  /**
   * <pre>
   * Output only. The list of summarized account budget information associated with this
   * invoice.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.resources.Invoice.AccountBudgetSummary account_budget_summaries = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v8.resources.Invoice.AccountBudgetSummaryOrBuilder getAccountBudgetSummariesOrBuilder(
      int index);
}
