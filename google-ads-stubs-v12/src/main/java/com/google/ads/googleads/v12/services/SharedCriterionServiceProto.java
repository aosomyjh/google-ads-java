// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/shared_criterion_service.proto

package com.google.ads.googleads.v12.services;

public final class SharedCriterionServiceProto {
  private SharedCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_SharedCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_SharedCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateSharedCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateSharedCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v12/services/shar" +
      "ed_criterion_service.proto\022!google.ads.g" +
      "oogleads.v12.services\032:google/ads/google" +
      "ads/v12/enums/response_content_type.prot" +
      "o\0329google/ads/googleads/v12/resources/sh" +
      "ared_criterion.proto\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\027google/rpc/status.proto" +
      "\"\251\002\n\033MutateSharedCriteriaRequest\022\030\n\013cust" +
      "omer_id\030\001 \001(\tB\003\340A\002\022T\n\noperations\030\002 \003(\0132;" +
      ".google.ads.googleads.v12.services.Share" +
      "dCriterionOperationB\003\340A\002\022\027\n\017partial_fail" +
      "ure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025resp" +
      "onse_content_type\030\005 \001(\0162K.google.ads.goo" +
      "gleads.v12.enums.ResponseContentTypeEnum" +
      ".ResponseContentType\"\257\001\n\030SharedCriterion" +
      "Operation\022E\n\006create\030\001 \001(\01323.google.ads.g" +
      "oogleads.v12.resources.SharedCriterionH\000" +
      "\022?\n\006remove\030\003 \001(\tB-\372A*\n(googleads.googlea" +
      "pis.com/SharedCriterionH\000B\013\n\toperation\"\242" +
      "\001\n\034MutateSharedCriteriaResponse\0221\n\025parti" +
      "al_failure_error\030\003 \001(\0132\022.google.rpc.Stat" +
      "us\022O\n\007results\030\002 \003(\0132>.google.ads.googlea" +
      "ds.v12.services.MutateSharedCriterionRes" +
      "ult\"\262\001\n\033MutateSharedCriterionResult\022D\n\rr" +
      "esource_name\030\001 \001(\tB-\372A*\n(googleads.googl" +
      "eapis.com/SharedCriterion\022M\n\020shared_crit" +
      "erion\030\002 \001(\01323.google.ads.googleads.v12.r" +
      "esources.SharedCriterion2\323\002\n\026SharedCrite" +
      "rionService\022\361\001\n\024MutateSharedCriteria\022>.g" +
      "oogle.ads.googleads.v12.services.MutateS" +
      "haredCriteriaRequest\032?.google.ads.google" +
      "ads.v12.services.MutateSharedCriteriaRes" +
      "ponse\"X\202\323\344\223\0029\"4/v12/customers/{customer_" +
      "id=*}/sharedCriteria:mutate:\001*\332A\026custome" +
      "r_id,operations\032E\312A\030googleads.googleapis" +
      ".com\322A\'https://www.googleapis.com/auth/a" +
      "dwordsB\207\002\n%com.google.ads.googleads.v12." +
      "servicesB\033SharedCriterionServiceProtoP\001Z" +
      "Igoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v12/services;services\242\002\003GAA" +
      "\252\002!Google.Ads.GoogleAds.V12.Services\312\002!G" +
      "oogle\\Ads\\GoogleAds\\V12\\Services\352\002%Googl" +
      "e::Ads::GoogleAds::V12::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.resources.SharedCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v12_services_SharedCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_SharedCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_SharedCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateSharedCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v12_services_MutateSharedCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateSharedCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateSharedCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", "SharedCriterion", });
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
    com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v12.resources.SharedCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
