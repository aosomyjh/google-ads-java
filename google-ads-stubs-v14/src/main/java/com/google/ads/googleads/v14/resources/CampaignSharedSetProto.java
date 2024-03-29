// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/campaign_shared_set.proto

package com.google.ads.googleads.v14.resources;

public final class CampaignSharedSetProto {
  private CampaignSharedSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CampaignSharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CampaignSharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v14/resources/cam" +
      "paign_shared_set.proto\022\"google.ads.googl" +
      "eads.v14.resources\032?google/ads/googleads" +
      "/v14/enums/campaign_shared_set_status.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\"\352\003\n\021CampaignShar" +
      "edSet\022J\n\rresource_name\030\001 \001(\tB3\342A\001\005\372A,\n*g" +
      "oogleads.googleapis.com/CampaignSharedSe" +
      "t\022A\n\010campaign\030\005 \001(\tB*\342A\001\005\372A#\n!googleads." +
      "googleapis.com/CampaignH\000\210\001\001\022D\n\nshared_s" +
      "et\030\006 \001(\tB+\342A\001\005\372A$\n\"googleads.googleapis." +
      "com/SharedSetH\001\210\001\001\022i\n\006status\030\002 \001(\0162S.goo" +
      "gle.ads.googleads.v14.enums.CampaignShar" +
      "edSetStatusEnum.CampaignSharedSetStatusB" +
      "\004\342A\001\003:y\352Av\n*googleads.googleapis.com/Cam" +
      "paignSharedSet\022Hcustomers/{customer_id}/" +
      "campaignSharedSets/{campaign_id}~{shared" +
      "_set_id}B\013\n\t_campaignB\r\n\013_shared_setB\210\002\n" +
      "&com.google.ads.googleads.v14.resourcesB" +
      "\026CampaignSharedSetProtoP\001ZKgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "14/resources;resources\242\002\003GAA\252\002\"Google.Ad" +
      "s.GoogleAds.V14.Resources\312\002\"Google\\Ads\\G" +
      "oogleAds\\V14\\Resources\352\002&Google::Ads::Go" +
      "ogleAds::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.CampaignSharedSetStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_CampaignSharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_CampaignSharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CampaignSharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "SharedSet", "Status", "Campaign", "SharedSet", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.CampaignSharedSetStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
