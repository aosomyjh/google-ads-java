// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v7.services;

public interface KeywordAndUrlSeedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.services.KeywordAndUrlSeed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 4;</code>
   * @return A list containing the keywords.
   */
  java.util.List<java.lang.String>
      getKeywordsList();
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 4;</code>
   * @return The count of keywords.
   */
  int getKeywordsCount();
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 4;</code>
   * @param index The index of the element to return.
   * @return The keywords at the given index.
   */
  java.lang.String getKeywords(int index);
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keywords at the given index.
   */
  com.google.protobuf.ByteString
      getKeywordsBytes(int index);
}
