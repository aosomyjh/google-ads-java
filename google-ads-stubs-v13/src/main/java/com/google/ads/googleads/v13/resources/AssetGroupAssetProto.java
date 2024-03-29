// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/asset_group_asset.proto

package com.google.ads.googleads.v13.resources;

public final class AssetGroupAssetProto {
  private AssetGroupAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_AssetGroupAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_AssetGroupAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v13/resources/ass" +
      "et_group_asset.proto\022\"google.ads.googlea" +
      "ds.v13.resources\0324google/ads/googleads/v" +
      "13/common/policy_summary.proto\0325google/a" +
      "ds/googleads/v13/enums/asset_field_type." +
      "proto\0326google/ads/googleads/v13/enums/as" +
      "set_link_status.proto\032<google/ads/google" +
      "ads/v13/enums/asset_performance_label.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\"\305\005\n\017AssetGroupAs" +
      "set\022H\n\rresource_name\030\001 \001(\tB1\342A\001\005\372A*\n(goo" +
      "gleads.googleapis.com/AssetGroupAsset\022A\n" +
      "\013asset_group\030\002 \001(\tB,\342A\001\005\372A%\n#googleads.g" +
      "oogleapis.com/AssetGroup\0226\n\005asset\030\003 \001(\tB" +
      "\'\342A\001\005\372A \n\036googleads.googleapis.com/Asset" +
      "\022U\n\nfield_type\030\004 \001(\0162A.google.ads.google" +
      "ads.v13.enums.AssetFieldTypeEnum.AssetFi" +
      "eldType\022S\n\006status\030\005 \001(\0162C.google.ads.goo" +
      "gleads.v13.enums.AssetLinkStatusEnum.Ass" +
      "etLinkStatus\022p\n\021performance_label\030\006 \001(\0162" +
      "O.google.ads.googleads.v13.enums.AssetPe" +
      "rformanceLabelEnum.AssetPerformanceLabel" +
      "B\004\342A\001\003\022L\n\016policy_summary\030\007 \001(\0132..google." +
      "ads.googleads.v13.common.PolicySummaryB\004" +
      "\342A\001\003:\200\001\352A}\n(googleads.googleapis.com/Ass" +
      "etGroupAsset\022Qcustomers/{customer_id}/as" +
      "setGroupAssets/{asset_group_id}~{asset_i" +
      "d}~{field_type}B\206\002\n&com.google.ads.googl" +
      "eads.v13.resourcesB\024AssetGroupAssetProto" +
      "P\001ZKgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v13/resources;resources\242" +
      "\002\003GAA\252\002\"Google.Ads.GoogleAds.V13.Resourc" +
      "es\312\002\"Google\\Ads\\GoogleAds\\V13\\Resources\352" +
      "\002&Google::Ads::GoogleAds::V13::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.common.PolicySummaryProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.AssetLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.AssetPerformanceLabelProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_AssetGroupAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_AssetGroupAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_AssetGroupAsset_descriptor,
        new java.lang.String[] { "ResourceName", "AssetGroup", "Asset", "FieldType", "Status", "PerformanceLabel", "PolicySummary", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.common.PolicySummaryProto.getDescriptor();
    com.google.ads.googleads.v13.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v13.enums.AssetLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v13.enums.AssetPerformanceLabelProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
