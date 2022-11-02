// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/campaign_label_service.proto

package com.google.ads.googleads.v12.services;

public final class CampaignLabelServiceProto {
  private CampaignLabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_CampaignLabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_CampaignLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateCampaignLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v12/services/camp" +
      "aign_label_service.proto\022!google.ads.goo" +
      "gleads.v12.services\0327google/ads/googlead" +
      "s/v12/resources/campaign_label.proto\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\027google/" +
      "rpc/status.proto\"\273\001\n\033MutateCampaignLabel" +
      "sRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022R\n\nop" +
      "erations\030\002 \003(\01329.google.ads.googleads.v1" +
      "2.services.CampaignLabelOperationB\003\340A\002\022\027" +
      "\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\"\251\001\n\026CampaignLabelOperation\022C\n\006cre" +
      "ate\030\001 \001(\01321.google.ads.googleads.v12.res" +
      "ources.CampaignLabelH\000\022=\n\006remove\030\002 \001(\tB+" +
      "\372A(\n&googleads.googleapis.com/CampaignLa" +
      "belH\000B\013\n\toperation\"\240\001\n\034MutateCampaignLab" +
      "elsResponse\0221\n\025partial_failure_error\030\003 \001" +
      "(\0132\022.google.rpc.Status\022M\n\007results\030\002 \003(\0132" +
      "<.google.ads.googleads.v12.services.Muta" +
      "teCampaignLabelResult\"_\n\031MutateCampaignL" +
      "abelResult\022B\n\rresource_name\030\001 \001(\tB+\372A(\n&" +
      "googleads.googleapis.com/CampaignLabel2\321" +
      "\002\n\024CampaignLabelService\022\361\001\n\024MutateCampai" +
      "gnLabels\022>.google.ads.googleads.v12.serv" +
      "ices.MutateCampaignLabelsRequest\032?.googl" +
      "e.ads.googleads.v12.services.MutateCampa" +
      "ignLabelsResponse\"X\202\323\344\223\0029\"4/v12/customer" +
      "s/{customer_id=*}/campaignLabels:mutate:" +
      "\001*\332A\026customer_id,operations\032E\312A\030googlead" +
      "s.googleapis.com\322A\'https://www.googleapi" +
      "s.com/auth/adwordsB\205\002\n%com.google.ads.go" +
      "ogleads.v12.servicesB\031CampaignLabelServi" +
      "ceProtoP\001ZIgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v12/services;serv" +
      "ices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V12.Se" +
      "rvices\312\002!Google\\Ads\\GoogleAds\\V12\\Servic" +
      "es\352\002%Google::Ads::GoogleAds::V12::Servic" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.resources.CampaignLabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v12_services_CampaignLabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_CampaignLabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_CampaignLabelOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateCampaignLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateCampaignLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateCampaignLabelResult_descriptor,
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
    com.google.ads.googleads.v12.resources.CampaignLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
