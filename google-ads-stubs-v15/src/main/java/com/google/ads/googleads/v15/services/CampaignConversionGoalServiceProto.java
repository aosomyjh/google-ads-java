// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/campaign_conversion_goal_service.proto

package com.google.ads.googleads.v15.services;

public final class CampaignConversionGoalServiceProto {
  private CampaignConversionGoalServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_CampaignConversionGoalOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_CampaignConversionGoalOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/ads/googleads/v15/services/camp" +
      "aign_conversion_goal_service.proto\022!goog" +
      "le.ads.googleads.v15.services\032Agoogle/ad" +
      "s/googleads/v15/resources/campaign_conve" +
      "rsion_goal.proto\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032 google/protobuf/field_mask." +
      "proto\"\266\001\n$MutateCampaignConversionGoalsR" +
      "equest\022\031\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022\\\n\nope" +
      "rations\030\002 \003(\0132B.google.ads.googleads.v15" +
      ".services.CampaignConversionGoalOperatio" +
      "nB\004\342A\001\002\022\025\n\rvalidate_only\030\003 \001(\010\"\255\001\n\037Campa" +
      "ignConversionGoalOperation\022/\n\013update_mas" +
      "k\030\002 \001(\0132\032.google.protobuf.FieldMask\022L\n\006u" +
      "pdate\030\001 \001(\0132:.google.ads.googleads.v15.r" +
      "esources.CampaignConversionGoalH\000B\013\n\tope" +
      "ration\"\177\n%MutateCampaignConversionGoalsR" +
      "esponse\022V\n\007results\030\001 \003(\0132E.google.ads.go" +
      "ogleads.v15.services.MutateCampaignConve" +
      "rsionGoalResult\"q\n\"MutateCampaignConvers" +
      "ionGoalResult\022K\n\rresource_name\030\001 \001(\tB4\372A" +
      "1\n/googleads.googleapis.com/CampaignConv" +
      "ersionGoal2\376\002\n\035CampaignConversionGoalSer" +
      "vice\022\225\002\n\035MutateCampaignConversionGoals\022G" +
      ".google.ads.googleads.v15.services.Mutat" +
      "eCampaignConversionGoalsRequest\032H.google" +
      ".ads.googleads.v15.services.MutateCampai" +
      "gnConversionGoalsResponse\"a\332A\026customer_i" +
      "d,operations\202\323\344\223\002B\"=/v15/customers/{cust" +
      "omer_id=*}/campaignConversionGoals:mutat" +
      "e:\001*\032E\312A\030googleads.googleapis.com\322A\'http" +
      "s://www.googleapis.com/auth/adwordsB\216\002\n%" +
      "com.google.ads.googleads.v15.servicesB\"C" +
      "ampaignConversionGoalServiceProtoP\001ZIgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v15/services;services\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V15.Services\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V15\\Services\352\002%Google::A" +
      "ds::GoogleAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.resources.CampaignConversionGoalProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", });
    internal_static_google_ads_googleads_v15_services_CampaignConversionGoalOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_CampaignConversionGoalOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_CampaignConversionGoalOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignConversionGoalResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.resources.CampaignConversionGoalProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
