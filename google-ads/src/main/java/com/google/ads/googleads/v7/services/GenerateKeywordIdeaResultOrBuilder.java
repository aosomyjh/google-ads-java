// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v7.services;

public interface GenerateKeywordIdeaResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.services.GenerateKeywordIdeaResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Text of the keyword idea.
   * As in Keyword Plan historical metrics, this text may not be an actual
   * keyword, but the canonical form of multiple keywords.
   * See KeywordPlanKeywordHistoricalMetrics message in KeywordPlanService.
   * </pre>
   *
   * <code>string text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text of the keyword idea.
   * As in Keyword Plan historical metrics, this text may not be an actual
   * keyword, but the canonical form of multiple keywords.
   * See KeywordPlanKeywordHistoricalMetrics message in KeywordPlanService.
   * </pre>
   *
   * <code>string text = 5;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Text of the keyword idea.
   * As in Keyword Plan historical metrics, this text may not be an actual
   * keyword, but the canonical form of multiple keywords.
   * See KeywordPlanKeywordHistoricalMetrics message in KeywordPlanService.
   * </pre>
   *
   * <code>string text = 5;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The historical metrics for the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   * @return Whether the keywordIdeaMetrics field is set.
   */
  boolean hasKeywordIdeaMetrics();
  /**
   * <pre>
   * The historical metrics for the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   * @return The keywordIdeaMetrics.
   */
  com.google.ads.googleads.v7.common.KeywordPlanHistoricalMetrics getKeywordIdeaMetrics();
  /**
   * <pre>
   * The historical metrics for the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   */
  com.google.ads.googleads.v7.common.KeywordPlanHistoricalMetricsOrBuilder getKeywordIdeaMetricsOrBuilder();

  /**
   * <pre>
   * The annotations for the keyword.
   * The annotation data is only provided if requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordAnnotations keyword_annotations = 6;</code>
   * @return Whether the keywordAnnotations field is set.
   */
  boolean hasKeywordAnnotations();
  /**
   * <pre>
   * The annotations for the keyword.
   * The annotation data is only provided if requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordAnnotations keyword_annotations = 6;</code>
   * @return The keywordAnnotations.
   */
  com.google.ads.googleads.v7.common.KeywordAnnotations getKeywordAnnotations();
  /**
   * <pre>
   * The annotations for the keyword.
   * The annotation data is only provided if requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordAnnotations keyword_annotations = 6;</code>
   */
  com.google.ads.googleads.v7.common.KeywordAnnotationsOrBuilder getKeywordAnnotationsOrBuilder();
}