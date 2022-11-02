// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/dynamic_search_ads_search_term_view.proto

package com.google.ads.googleads.v12.resources;

public final class DynamicSearchAdsSearchTermViewProto {
  private DynamicSearchAdsSearchTermViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_DynamicSearchAdsSearchTermView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_DynamicSearchAdsSearchTermView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/ads/googleads/v12/resources/dyn" +
      "amic_search_ads_search_term_view.proto\022\"" +
      "google.ads.googleads.v12.resources\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\"\320\005\n\036DynamicSearchAdsSearc" +
      "hTermView\022V\n\rresource_name\030\001 \001(\tB?\340A\003\372A9" +
      "\n7googleads.googleapis.com/DynamicSearch" +
      "AdsSearchTermView\022\035\n\013search_term\030\t \001(\tB\003" +
      "\340A\003H\000\210\001\001\022\032\n\010headline\030\n \001(\tB\003\340A\003H\001\210\001\001\022\036\n\014" +
      "landing_page\030\013 \001(\tB\003\340A\003H\002\210\001\001\022\032\n\010page_url" +
      "\030\014 \001(\tB\003\340A\003H\003\210\001\001\022&\n\024has_negative_keyword" +
      "\030\r \001(\010B\003\340A\003H\004\210\001\001\022&\n\024has_matching_keyword" +
      "\030\016 \001(\010B\003\340A\003H\005\210\001\001\022\"\n\020has_negative_url\030\017 \001" +
      "(\010B\003\340A\003H\006\210\001\001:\350\001\352A\344\001\n7googleads.googleapi" +
      "s.com/DynamicSearchAdsSearchTermView\022\250\001c" +
      "ustomers/{customer_id}/dynamicSearchAdsS" +
      "earchTermViews/{ad_group_id}~{search_ter" +
      "m_fingerprint}~{headline_fingerprint}~{l" +
      "anding_page_fingerprint}~{page_url_finge" +
      "rprint}B\016\n\014_search_termB\013\n\t_headlineB\017\n\r" +
      "_landing_pageB\013\n\t_page_urlB\027\n\025_has_negat" +
      "ive_keywordB\027\n\025_has_matching_keywordB\023\n\021" +
      "_has_negative_urlB\225\002\n&com.google.ads.goo" +
      "gleads.v12.resourcesB#DynamicSearchAdsSe" +
      "archTermViewProtoP\001ZKgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v12/res" +
      "ources;resources\242\002\003GAA\252\002\"Google.Ads.Goog" +
      "leAds.V12.Resources\312\002\"Google\\Ads\\GoogleA" +
      "ds\\V12\\Resources\352\002&Google::Ads::GoogleAd" +
      "s::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_DynamicSearchAdsSearchTermView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_DynamicSearchAdsSearchTermView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_DynamicSearchAdsSearchTermView_descriptor,
        new java.lang.String[] { "ResourceName", "SearchTerm", "Headline", "LandingPage", "PageUrl", "HasNegativeKeyword", "HasMatchingKeyword", "HasNegativeUrl", "SearchTerm", "Headline", "LandingPage", "PageUrl", "HasNegativeKeyword", "HasMatchingKeyword", "HasNegativeUrl", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
