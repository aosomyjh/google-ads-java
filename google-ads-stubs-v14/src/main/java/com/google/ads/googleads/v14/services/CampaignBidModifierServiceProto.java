// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/campaign_bid_modifier_service.proto

package com.google.ads.googleads.v14.services;

public final class CampaignBidModifierServiceProto {
  private CampaignBidModifierServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_CampaignBidModifierOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_CampaignBidModifierOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifierResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifierResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v14/services/camp" +
      "aign_bid_modifier_service.proto\022!google." +
      "ads.googleads.v14.services\032:google/ads/g" +
      "oogleads/v14/enums/response_content_type" +
      ".proto\032>google/ads/googleads/v14/resourc" +
      "es/campaign_bid_modifier.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032 google/protob" +
      "uf/field_mask.proto\032\027google/rpc/status.p" +
      "roto\"\265\002\n!MutateCampaignBidModifiersReque" +
      "st\022\031\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022Y\n\noperati" +
      "ons\030\002 \003(\0132?.google.ads.googleads.v14.ser" +
      "vices.CampaignBidModifierOperationB\004\342A\001\002" +
      "\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_on" +
      "ly\030\004 \001(\010\022j\n\025response_content_type\030\005 \001(\0162" +
      "K.google.ads.googleads.v14.enums.Respons" +
      "eContentTypeEnum.ResponseContentType\"\267\002\n" +
      "\034CampaignBidModifierOperation\022/\n\013update_" +
      "mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022I" +
      "\n\006create\030\001 \001(\01327.google.ads.googleads.v1" +
      "4.resources.CampaignBidModifierH\000\022I\n\006upd" +
      "ate\030\002 \001(\01327.google.ads.googleads.v14.res" +
      "ources.CampaignBidModifierH\000\022C\n\006remove\030\003" +
      " \001(\tB1\372A.\n,googleads.googleapis.com/Camp" +
      "aignBidModifierH\000B\013\n\toperation\"\254\001\n\"Mutat" +
      "eCampaignBidModifiersResponse\0221\n\025partial" +
      "_failure_error\030\003 \001(\0132\022.google.rpc.Status" +
      "\022S\n\007results\030\002 \003(\0132B.google.ads.googleads" +
      ".v14.services.MutateCampaignBidModifierR" +
      "esult\"\303\001\n\037MutateCampaignBidModifierResul" +
      "t\022H\n\rresource_name\030\001 \001(\tB1\372A.\n,googleads" +
      ".googleapis.com/CampaignBidModifier\022V\n\025c" +
      "ampaign_bid_modifier\030\002 \001(\01327.google.ads." +
      "googleads.v14.resources.CampaignBidModif" +
      "ier2\357\002\n\032CampaignBidModifierService\022\211\002\n\032M" +
      "utateCampaignBidModifiers\022D.google.ads.g" +
      "oogleads.v14.services.MutateCampaignBidM" +
      "odifiersRequest\032E.google.ads.googleads.v" +
      "14.services.MutateCampaignBidModifiersRe" +
      "sponse\"^\332A\026customer_id,operations\202\323\344\223\002?\"" +
      ":/v14/customers/{customer_id=*}/campaign" +
      "BidModifiers:mutate:\001*\032E\312A\030googleads.goo" +
      "gleapis.com\322A\'https://www.googleapis.com" +
      "/auth/adwordsB\213\002\n%com.google.ads.googlea" +
      "ds.v14.servicesB\037CampaignBidModifierServ" +
      "iceProtoP\001ZIgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v14/services;ser" +
      "vices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V14.S" +
      "ervices\312\002!Google\\Ads\\GoogleAds\\V14\\Servi" +
      "ces\352\002%Google::Ads::GoogleAds::V14::Servi" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.resources.CampaignBidModifierProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v14_services_CampaignBidModifierOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_CampaignBidModifierOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_CampaignBidModifierOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifiersResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifierResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifierResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignBidModifierResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignBidModifier", });
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
    com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v14.resources.CampaignBidModifierProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
