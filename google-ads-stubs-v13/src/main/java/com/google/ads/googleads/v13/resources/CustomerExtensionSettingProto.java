// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/customer_extension_setting.proto

package com.google.ads.googleads.v13.resources;

public final class CustomerExtensionSettingProto {
  private CustomerExtensionSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_CustomerExtensionSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_CustomerExtensionSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v13/resources/cus" +
      "tomer_extension_setting.proto\022\"google.ad" +
      "s.googleads.v13.resources\032=google/ads/go" +
      "ogleads/v13/enums/extension_setting_devi" +
      "ce.proto\0323google/ads/googleads/v13/enums" +
      "/extension_type.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\372\003\n\030CustomerExtensionSetting\022Q\n\rresour" +
      "ce_name\030\001 \001(\tB:\342A\001\005\372A3\n1googleads.google" +
      "apis.com/CustomerExtensionSetting\022]\n\016ext" +
      "ension_type\030\002 \001(\0162?.google.ads.googleads" +
      ".v13.enums.ExtensionTypeEnum.ExtensionTy" +
      "peB\004\342A\001\005\022M\n\024extension_feed_items\030\005 \003(\tB/" +
      "\372A,\n*googleads.googleapis.com/ExtensionF" +
      "eedItem\022a\n\006device\030\004 \001(\0162Q.google.ads.goo" +
      "gleads.v13.enums.ExtensionSettingDeviceE" +
      "num.ExtensionSettingDevice:z\352Aw\n1googlea" +
      "ds.googleapis.com/CustomerExtensionSetti" +
      "ng\022Bcustomers/{customer_id}/customerExte" +
      "nsionSettings/{extension_type}B\217\002\n&com.g" +
      "oogle.ads.googleads.v13.resourcesB\035Custo" +
      "merExtensionSettingProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v13/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V13.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V13\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V13::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ExtensionSettingDeviceProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.ExtensionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_CustomerExtensionSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_CustomerExtensionSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_CustomerExtensionSetting_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionType", "ExtensionFeedItems", "Device", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.ExtensionSettingDeviceProto.getDescriptor();
    com.google.ads.googleads.v13.enums.ExtensionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
