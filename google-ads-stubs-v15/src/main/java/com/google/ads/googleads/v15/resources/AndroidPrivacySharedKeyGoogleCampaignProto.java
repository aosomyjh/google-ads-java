// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/android_privacy_shared_key_google_campaign.proto

package com.google.ads.googleads.v15.resources;

public final class AndroidPrivacySharedKeyGoogleCampaignProto {
  private AndroidPrivacySharedKeyGoogleCampaignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AndroidPrivacySharedKeyGoogleCampaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AndroidPrivacySharedKeyGoogleCampaign_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nSgoogle/ads/googleads/v15/resources/and" +
      "roid_privacy_shared_key_google_campaign." +
      "proto\022\"google.ads.googleads.v15.resource" +
      "s\032Egoogle/ads/googleads/v15/enums/androi" +
      "d_privacy_interaction_type.proto\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\"\343\004\n%AndroidPrivacySharedKey" +
      "GoogleCampaign\022^\n\rresource_name\030\001 \001(\tBG\342" +
      "A\001\003\372A@\n>googleads.googleapis.com/Android" +
      "PrivacySharedKeyGoogleCampaign\022\031\n\013campai" +
      "gn_id\030\002 \001(\003B\004\342A\001\003\022\217\001\n android_privacy_in" +
      "teraction_type\030\003 \001(\0162_.google.ads.google" +
      "ads.v15.enums.AndroidPrivacyInteractionT" +
      "ypeEnum.AndroidPrivacyInteractionTypeB\004\342" +
      "A\001\003\022.\n android_privacy_interaction_date\030" +
      "\004 \001(\tB\004\342A\001\003\022!\n\023shared_campaign_key\030\005 \001(\t" +
      "B\004\342A\001\003:\331\001\352A\325\001\n>googleads.googleapis.com/" +
      "AndroidPrivacySharedKeyGoogleCampaign\022\222\001" +
      "customers/{customer_id}/androidPrivacySh" +
      "aredKeyGoogleCampaigns/{campaign_id}~{an" +
      "droid_privacy_interaction_type}~{android" +
      "_privacy_interaction_date}B\234\002\n&com.googl" +
      "e.ads.googleads.v15.resourcesB*AndroidPr" +
      "ivacySharedKeyGoogleCampaignProtoP\001ZKgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v15/resources;resources\242\002\003GAA\252\002" +
      "\"Google.Ads.GoogleAds.V15.Resources\312\002\"Go" +
      "ogle\\Ads\\GoogleAds\\V15\\Resources\352\002&Googl" +
      "e::Ads::GoogleAds::V15::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.AndroidPrivacyInteractionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AndroidPrivacySharedKeyGoogleCampaign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AndroidPrivacySharedKeyGoogleCampaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AndroidPrivacySharedKeyGoogleCampaign_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignId", "AndroidPrivacyInteractionType", "AndroidPrivacyInteractionDate", "SharedCampaignKey", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.AndroidPrivacyInteractionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
