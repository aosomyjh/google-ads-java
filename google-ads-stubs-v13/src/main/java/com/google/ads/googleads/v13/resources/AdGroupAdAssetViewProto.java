// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/ad_group_ad_asset_view.proto

package com.google.ads.googleads.v13.resources;

public final class AdGroupAdAssetViewProto {
  private AdGroupAdAssetViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v13/resources/ad_" +
      "group_ad_asset_view.proto\022\"google.ads.go" +
      "ogleads.v13.resources\032,google/ads/google" +
      "ads/v13/common/policy.proto\0325google/ads/" +
      "googleads/v13/enums/asset_field_type.pro" +
      "to\032<google/ads/googleads/v13/enums/asset" +
      "_performance_label.proto\032;google/ads/goo" +
      "gleads/v13/enums/policy_approval_status." +
      "proto\0329google/ads/googleads/v13/enums/po" +
      "licy_review_status.proto\032<google/ads/goo" +
      "gleads/v13/enums/served_asset_field_type" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\317\006\n\022AdGroupAd" +
      "AssetView\022K\n\rresource_name\030\001 \001(\tB4\342A\001\003\372A" +
      "-\n+googleads.googleapis.com/AdGroupAdAss" +
      "etView\022E\n\013ad_group_ad\030\t \001(\tB+\342A\001\003\372A$\n\"go" +
      "ogleads.googleapis.com/AdGroupAdH\000\210\001\001\022;\n" +
      "\005asset\030\n \001(\tB\'\342A\001\003\372A \n\036googleads.googlea" +
      "pis.com/AssetH\001\210\001\001\022[\n\nfield_type\030\002 \001(\0162A" +
      ".google.ads.googleads.v13.enums.AssetFie" +
      "ldTypeEnum.AssetFieldTypeB\004\342A\001\003\022\032\n\007enabl" +
      "ed\030\010 \001(\010B\004\342A\001\003H\002\210\001\001\022]\n\016policy_summary\030\003 " +
      "\001(\0132?.google.ads.googleads.v13.resources" +
      ".AdGroupAdAssetPolicySummaryB\004\342A\001\003\022p\n\021pe" +
      "rformance_label\030\004 \001(\0162O.google.ads.googl" +
      "eads.v13.enums.AssetPerformanceLabelEnum" +
      ".AssetPerformanceLabelB\004\342A\001\003\022i\n\014pinned_f" +
      "ield\030\013 \001(\0162M.google.ads.googleads.v13.en" +
      "ums.ServedAssetFieldTypeEnum.ServedAsset" +
      "FieldTypeB\004\342A\001\003:\214\001\352A\210\001\n+googleads.google" +
      "apis.com/AdGroupAdAssetView\022Ycustomers/{" +
      "customer_id}/adGroupAdAssetViews/{ad_gro" +
      "up_id}~{ad_id}~{asset_id}~{field_type}B\016" +
      "\n\014_ad_group_adB\010\n\006_assetB\n\n\010_enabled\"\312\002\n" +
      "\033AdGroupAdAssetPolicySummary\022U\n\024policy_t" +
      "opic_entries\030\001 \003(\01321.google.ads.googlead" +
      "s.v13.common.PolicyTopicEntryB\004\342A\001\003\022f\n\rr" +
      "eview_status\030\002 \001(\0162I.google.ads.googlead" +
      "s.v13.enums.PolicyReviewStatusEnum.Polic" +
      "yReviewStatusB\004\342A\001\003\022l\n\017approval_status\030\003" +
      " \001(\0162M.google.ads.googleads.v13.enums.Po" +
      "licyApprovalStatusEnum.PolicyApprovalSta" +
      "tusB\004\342A\001\003B\211\002\n&com.google.ads.googleads.v" +
      "13.resourcesB\027AdGroupAdAssetViewProtoP\001Z" +
      "Kgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v13/resources;resources\242\002\003G" +
      "AA\252\002\"Google.Ads.GoogleAds.V13.Resources\312" +
      "\002\"Google\\Ads\\GoogleAds\\V13\\Resources\352\002&G" +
      "oogle::Ads::GoogleAds::V13::Resourcesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.AssetPerformanceLabelProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.ServedAssetFieldTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetView_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAd", "Asset", "FieldType", "Enabled", "PolicySummary", "PerformanceLabel", "PinnedField", "AdGroupAd", "Asset", "Enabled", });
    internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_AdGroupAdAssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v13.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v13.enums.AssetPerformanceLabelProto.getDescriptor();
    com.google.ads.googleads.v13.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v13.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v13.enums.ServedAssetFieldTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
