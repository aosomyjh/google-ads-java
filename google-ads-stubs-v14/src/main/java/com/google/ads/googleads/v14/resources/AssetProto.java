// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/asset.proto

package com.google.ads.googleads.v14.resources;

public final class AssetProto {
  private AssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_AssetFieldTypePolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_AssetFieldTypePolicySummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_AssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_AssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v14/resources/ass" +
      "et.proto\022\"google.ads.googleads.v14.resou" +
      "rces\0321google/ads/googleads/v14/common/as" +
      "set_types.proto\0326google/ads/googleads/v1" +
      "4/common/custom_parameter.proto\032,google/" +
      "ads/googleads/v14/common/policy.proto\0325g" +
      "oogle/ads/googleads/v14/enums/asset_fiel" +
      "d_type.proto\0321google/ads/googleads/v14/e" +
      "nums/asset_source.proto\032/google/ads/goog" +
      "leads/v14/enums/asset_type.proto\032;google" +
      "/ads/googleads/v14/enums/policy_approval" +
      "_status.proto\0329google/ads/googleads/v14/" +
      "enums/policy_review_status.proto\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\"\372\027\n\005Asset\022>\n\rresource_name\030" +
      "\001 \001(\tB\'\342A\001\005\372A \n\036googleads.googleapis.com" +
      "/Asset\022\025\n\002id\030\013 \001(\003B\004\342A\001\003H\001\210\001\001\022\021\n\004name\030\014 " +
      "\001(\tH\002\210\001\001\022K\n\004type\030\004 \001(\01627.google.ads.goog" +
      "leads.v14.enums.AssetTypeEnum.AssetTypeB" +
      "\004\342A\001\003\022\022\n\nfinal_urls\030\016 \003(\t\022\031\n\021final_mobil" +
      "e_urls\030\020 \003(\t\022\"\n\025tracking_url_template\030\021 " +
      "\001(\tH\003\210\001\001\022O\n\025url_custom_parameters\030\022 \003(\0132" +
      "0.google.ads.googleads.v14.common.Custom" +
      "Parameter\022\035\n\020final_url_suffix\030\023 \001(\tH\004\210\001\001" +
      "\022Q\n\006source\030& \001(\0162;.google.ads.googleads." +
      "v14.enums.AssetSourceEnum.AssetSourceB\004\342" +
      "A\001\003\022T\n\016policy_summary\030\r \001(\01326.google.ads" +
      ".googleads.v14.resources.AssetPolicySumm" +
      "aryB\004\342A\001\003\022j\n\033field_type_policy_summaries" +
      "\030( \003(\0132?.google.ads.googleads.v14.resour" +
      "ces.AssetFieldTypePolicySummaryB\004\342A\001\003\022W\n" +
      "\023youtube_video_asset\030\005 \001(\01322.google.ads." +
      "googleads.v14.common.YoutubeVideoAssetB\004" +
      "\342A\001\005H\000\022U\n\022media_bundle_asset\030\006 \001(\01321.goo" +
      "gle.ads.googleads.v14.common.MediaBundle" +
      "AssetB\004\342A\001\005H\000\022H\n\013image_asset\030\007 \001(\0132+.goo" +
      "gle.ads.googleads.v14.common.ImageAssetB" +
      "\004\342A\001\003H\000\022F\n\ntext_asset\030\010 \001(\0132*.google.ads" +
      ".googleads.v14.common.TextAssetB\004\342A\001\005H\000\022" +
      "I\n\017lead_form_asset\030\t \001(\0132..google.ads.go" +
      "ogleads.v14.common.LeadFormAssetH\000\022R\n\024bo" +
      "ok_on_google_asset\030\n \001(\01322.google.ads.go" +
      "ogleads.v14.common.BookOnGoogleAssetH\000\022J" +
      "\n\017promotion_asset\030\017 \001(\0132/.google.ads.goo" +
      "gleads.v14.common.PromotionAssetH\000\022F\n\rca" +
      "llout_asset\030\024 \001(\0132-.google.ads.googleads" +
      ".v14.common.CalloutAssetH\000\022[\n\030structured" +
      "_snippet_asset\030\025 \001(\01327.google.ads.google" +
      "ads.v14.common.StructuredSnippetAssetH\000\022" +
      "H\n\016sitelink_asset\030\026 \001(\0132..google.ads.goo" +
      "gleads.v14.common.SitelinkAssetH\000\022I\n\017pag" +
      "e_feed_asset\030\027 \001(\0132..google.ads.googlead" +
      "s.v14.common.PageFeedAssetH\000\022Y\n\027dynamic_" +
      "education_asset\030\030 \001(\01326.google.ads.googl" +
      "eads.v14.common.DynamicEducationAssetH\000\022" +
      "K\n\020mobile_app_asset\030\031 \001(\0132/.google.ads.g" +
      "oogleads.v14.common.MobileAppAssetH\000\022Q\n\023" +
      "hotel_callout_asset\030\032 \001(\01322.google.ads.g" +
      "oogleads.v14.common.HotelCalloutAssetH\000\022" +
      "@\n\ncall_asset\030\033 \001(\0132*.google.ads.googlea" +
      "ds.v14.common.CallAssetH\000\022B\n\013price_asset" +
      "\030\034 \001(\0132+.google.ads.googleads.v14.common" +
      ".PriceAssetH\000\022X\n\024call_to_action_asset\030\035 " +
      "\001(\01322.google.ads.googleads.v14.common.Ca" +
      "llToActionAssetB\004\342A\001\005H\000\022\\\n\031dynamic_real_" +
      "estate_asset\030\036 \001(\01327.google.ads.googlead" +
      "s.v14.common.DynamicRealEstateAssetH\000\022S\n" +
      "\024dynamic_custom_asset\030\037 \001(\01323.google.ads" +
      ".googleads.v14.common.DynamicCustomAsset" +
      "H\000\022i\n dynamic_hotels_and_rentals_asset\030 " +
      " \001(\0132=.google.ads.googleads.v14.common.D" +
      "ynamicHotelsAndRentalsAssetH\000\022U\n\025dynamic" +
      "_flights_asset\030! \001(\01324.google.ads.google" +
      "ads.v14.common.DynamicFlightsAssetH\000\022j\n\035" +
      "discovery_carousel_card_asset\030\" \001(\0132;.go" +
      "ogle.ads.googleads.v14.common.DiscoveryC" +
      "arouselCardAssetB\004\342A\001\005H\000\022S\n\024dynamic_trav" +
      "el_asset\030# \001(\01323.google.ads.googleads.v1" +
      "4.common.DynamicTravelAssetH\000\022Q\n\023dynamic" +
      "_local_asset\030$ \001(\01322.google.ads.googlead" +
      "s.v14.common.DynamicLocalAssetH\000\022O\n\022dyna" +
      "mic_jobs_asset\030% \001(\01321.google.ads.google" +
      "ads.v14.common.DynamicJobsAssetH\000\022N\n\016loc" +
      "ation_asset\030\' \001(\0132..google.ads.googleads" +
      ".v14.common.LocationAssetB\004\342A\001\003H\000\022Y\n\024hot" +
      "el_property_asset\030) \001(\01323.google.ads.goo" +
      "gleads.v14.common.HotelPropertyAssetB\004\342A" +
      "\001\005H\000:N\352AK\n\036googleads.googleapis.com/Asse" +
      "t\022)customers/{customer_id}/assets/{asset" +
      "_id}B\014\n\nasset_dataB\005\n\003_idB\007\n\005_nameB\030\n\026_t" +
      "racking_url_templateB\023\n\021_final_url_suffi" +
      "x\"\201\003\n\033AssetFieldTypePolicySummary\022f\n\020ass" +
      "et_field_type\030\001 \001(\0162A.google.ads.googlea" +
      "ds.v14.enums.AssetFieldTypeEnum.AssetFie" +
      "ldTypeB\004\342A\001\003H\000\210\001\001\022\\\n\014asset_source\030\002 \001(\0162" +
      ";.google.ads.googleads.v14.enums.AssetSo" +
      "urceEnum.AssetSourceB\004\342A\001\003H\001\210\001\001\022^\n\023polic" +
      "y_summary_info\030\003 \001(\01326.google.ads.google" +
      "ads.v14.resources.AssetPolicySummaryB\004\342A" +
      "\001\003H\002\210\001\001B\023\n\021_asset_field_typeB\017\n\r_asset_s" +
      "ourceB\026\n\024_policy_summary_info\"\301\002\n\022AssetP" +
      "olicySummary\022U\n\024policy_topic_entries\030\001 \003" +
      "(\01321.google.ads.googleads.v14.common.Pol" +
      "icyTopicEntryB\004\342A\001\003\022f\n\rreview_status\030\002 \001" +
      "(\0162I.google.ads.googleads.v14.enums.Poli" +
      "cyReviewStatusEnum.PolicyReviewStatusB\004\342" +
      "A\001\003\022l\n\017approval_status\030\003 \001(\0162M.google.ad" +
      "s.googleads.v14.enums.PolicyApprovalStat" +
      "usEnum.PolicyApprovalStatusB\004\342A\001\003B\374\001\n&co" +
      "m.google.ads.googleads.v14.resourcesB\nAs" +
      "setProtoP\001ZKgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v14/resources;re" +
      "sources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V14" +
      ".Resources\312\002\"Google\\Ads\\GoogleAds\\V14\\Re" +
      "sources\352\002&Google::Ads::GoogleAds::V14::R" +
      "esourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.common.AssetTypesProto.getDescriptor(),
          com.google.ads.googleads.v14.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v14.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AssetSourceProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AssetTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_Asset_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "Source", "PolicySummary", "FieldTypePolicySummaries", "YoutubeVideoAsset", "MediaBundleAsset", "ImageAsset", "TextAsset", "LeadFormAsset", "BookOnGoogleAsset", "PromotionAsset", "CalloutAsset", "StructuredSnippetAsset", "SitelinkAsset", "PageFeedAsset", "DynamicEducationAsset", "MobileAppAsset", "HotelCalloutAsset", "CallAsset", "PriceAsset", "CallToActionAsset", "DynamicRealEstateAsset", "DynamicCustomAsset", "DynamicHotelsAndRentalsAsset", "DynamicFlightsAsset", "DiscoveryCarouselCardAsset", "DynamicTravelAsset", "DynamicLocalAsset", "DynamicJobsAsset", "LocationAsset", "HotelPropertyAsset", "AssetData", "Id", "Name", "TrackingUrlTemplate", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v14_resources_AssetFieldTypePolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_resources_AssetFieldTypePolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_AssetFieldTypePolicySummary_descriptor,
        new java.lang.String[] { "AssetFieldType", "AssetSource", "PolicySummaryInfo", "AssetFieldType", "AssetSource", "PolicySummaryInfo", });
    internal_static_google_ads_googleads_v14_resources_AssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_resources_AssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_AssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.common.AssetTypesProto.getDescriptor();
    com.google.ads.googleads.v14.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v14.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AssetSourceProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AssetTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v14.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
