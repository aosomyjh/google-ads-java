// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/ad_group_extension_setting.proto

package com.google.ads.googleads.v15.resources;

public final class AdGroupExtensionSettingProto {
  private AdGroupExtensionSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AdGroupExtensionSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AdGroupExtensionSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v15/resources/ad_" +
      "group_extension_setting.proto\022\"google.ad" +
      "s.googleads.v15.resources\032=google/ads/go" +
      "ogleads/v15/enums/extension_setting_devi" +
      "ce.proto\0323google/ads/googleads/v15/enums" +
      "/extension_type.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\325\004\n\027AdGroupExtensionSetting\022P\n\rresourc" +
      "e_name\030\001 \001(\tB9\342A\001\005\372A2\n0googleads.googlea" +
      "pis.com/AdGroupExtensionSetting\022]\n\016exten" +
      "sion_type\030\002 \001(\0162?.google.ads.googleads.v" +
      "15.enums.ExtensionTypeEnum.ExtensionType" +
      "B\004\342A\001\005\022@\n\010ad_group\030\006 \001(\tB)\342A\001\005\372A\"\n googl" +
      "eads.googleapis.com/AdGroupH\000\210\001\001\022M\n\024exte" +
      "nsion_feed_items\030\007 \003(\tB/\372A,\n*googleads.g" +
      "oogleapis.com/ExtensionFeedItem\022a\n\006devic" +
      "e\030\005 \001(\0162Q.google.ads.googleads.v15.enums" +
      ".ExtensionSettingDeviceEnum.ExtensionSet" +
      "tingDevice:\207\001\352A\203\001\n0googleads.googleapis." +
      "com/AdGroupExtensionSetting\022Ocustomers/{" +
      "customer_id}/adGroupExtensionSettings/{a" +
      "d_group_id}~{extension_type}B\013\n\t_ad_grou" +
      "pB\216\002\n&com.google.ads.googleads.v15.resou" +
      "rcesB\034AdGroupExtensionSettingProtoP\001ZKgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v15/resources;resources\242\002\003GAA\252" +
      "\002\"Google.Ads.GoogleAds.V15.Resources\312\002\"G" +
      "oogle\\Ads\\GoogleAds\\V15\\Resources\352\002&Goog" +
      "le::Ads::GoogleAds::V15::Resourcesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ExtensionSettingDeviceProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.ExtensionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AdGroupExtensionSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AdGroupExtensionSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AdGroupExtensionSetting_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionType", "AdGroup", "ExtensionFeedItems", "Device", "AdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.ExtensionSettingDeviceProto.getDescriptor();
    com.google.ads.googleads.v15.enums.ExtensionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
