// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/conversion_goal_campaign_config.proto

package com.google.ads.googleads.v13.resources;

public final class ConversionGoalCampaignConfigProto {
  private ConversionGoalCampaignConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_ConversionGoalCampaignConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_ConversionGoalCampaignConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/ads/googleads/v13/resources/con" +
      "version_goal_campaign_config.proto\022\"goog" +
      "le.ads.googleads.v13.resources\0326google/a" +
      "ds/googleads/v13/enums/goal_config_level" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\350\003\n\034Conversio" +
      "nGoalCampaignConfig\022U\n\rresource_name\030\001 \001" +
      "(\tB>\342A\001\005\372A7\n5googleads.googleapis.com/Co" +
      "nversionGoalCampaignConfig\022<\n\010campaign\030\002" +
      " \001(\tB*\342A\001\005\372A#\n!googleads.googleapis.com/" +
      "Campaign\022^\n\021goal_config_level\030\003 \001(\0162C.go" +
      "ogle.ads.googleads.v13.enums.GoalConfigL" +
      "evelEnum.GoalConfigLevel\022R\n\026custom_conve" +
      "rsion_goal\030\004 \001(\tB2\372A/\n-googleads.googlea" +
      "pis.com/CustomConversionGoal:\177\352A|\n5googl" +
      "eads.googleapis.com/ConversionGoalCampai" +
      "gnConfig\022Ccustomers/{customer_id}/conver" +
      "sionGoalCampaignConfigs/{campaign_id}B\223\002" +
      "\n&com.google.ads.googleads.v13.resources" +
      "B!ConversionGoalCampaignConfigProtoP\001ZKg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v13/resources;resources\242\002\003GAA" +
      "\252\002\"Google.Ads.GoogleAds.V13.Resources\312\002\"" +
      "Google\\Ads\\GoogleAds\\V13\\Resources\352\002&Goo" +
      "gle::Ads::GoogleAds::V13::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.GoalConfigLevelProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_ConversionGoalCampaignConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_ConversionGoalCampaignConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_ConversionGoalCampaignConfig_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "GoalConfigLevel", "CustomConversionGoal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.GoalConfigLevelProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
