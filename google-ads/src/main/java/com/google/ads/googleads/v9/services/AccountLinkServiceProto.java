// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/account_link_service.proto

package com.google.ads.googleads.v9.services;

public final class AccountLinkServiceProto {
  private AccountLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CreateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CreateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CreateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CreateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_AccountLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_AccountLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAccountLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v9/services/accou" +
      "nt_link_service.proto\022 google.ads.google" +
      "ads.v9.services\0324google/ads/googleads/v9" +
      "/resources/account_link.proto\032\034google/ap" +
      "i/annotations.proto\032\027google/api/client.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032 google/protobu" +
      "f/field_mask.proto\032\027google/rpc/status.pr" +
      "oto\"\\\n\025GetAccountLinkRequest\022C\n\rresource" +
      "_name\030\001 \001(\tB,\340A\002\372A&\n$googleads.googleapi" +
      "s.com/AccountLink\"\177\n\030CreateAccountLinkRe" +
      "quest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022I\n\014accou" +
      "nt_link\030\002 \001(\0132..google.ads.googleads.v9." +
      "resources.AccountLinkB\003\340A\002\"2\n\031CreateAcco" +
      "untLinkResponse\022\025\n\rresource_name\030\001 \001(\t\"\264" +
      "\001\n\030MutateAccountLinkRequest\022\030\n\013customer_" +
      "id\030\001 \001(\tB\003\340A\002\022N\n\toperation\030\002 \001(\01326.googl" +
      "e.ads.googleads.v9.services.AccountLinkO" +
      "perationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025" +
      "\n\rvalidate_only\030\004 \001(\010\"\250\001\n\024AccountLinkOpe" +
      "ration\022/\n\013update_mask\030\004 \001(\0132\032.google.pro" +
      "tobuf.FieldMask\022@\n\006update\030\002 \001(\0132..google" +
      ".ads.googleads.v9.resources.AccountLinkH" +
      "\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\231\001\n\031Mut" +
      "ateAccountLinkResponse\022I\n\006result\030\001 \001(\01329" +
      ".google.ads.googleads.v9.services.Mutate" +
      "AccountLinkResult\0221\n\025partial_failure_err" +
      "or\030\002 \001(\0132\022.google.rpc.Status\"0\n\027MutateAc" +
      "countLinkResult\022\025\n\rresource_name\030\001 \001(\t2\354" +
      "\005\n\022AccountLinkService\022\301\001\n\016GetAccountLink" +
      "\0227.google.ads.googleads.v9.services.GetA" +
      "ccountLinkRequest\032..google.ads.googleads" +
      ".v9.resources.AccountLink\"F\202\323\344\223\0020\022./v9/{" +
      "resource_name=customers/*/accountLinks/*" +
      "}\332A\rresource_name\022\345\001\n\021CreateAccountLink\022" +
      ":.google.ads.googleads.v9.services.Creat" +
      "eAccountLinkRequest\032;.google.ads.googlea" +
      "ds.v9.services.CreateAccountLinkResponse" +
      "\"W\202\323\344\223\0026\"1/v9/customers/{customer_id=*}/" +
      "accountLinks:create:\001*\332A\030customer_id,acc" +
      "ount_link\022\342\001\n\021MutateAccountLink\022:.google" +
      ".ads.googleads.v9.services.MutateAccount" +
      "LinkRequest\032;.google.ads.googleads.v9.se" +
      "rvices.MutateAccountLinkResponse\"T\202\323\344\223\0026" +
      "\"1/v9/customers/{customer_id=*}/accountL" +
      "inks:mutate:\001*\332A\025customer_id,operation\032E" +
      "\312A\030googleads.googleapis.com\322A\'https://ww" +
      "w.googleapis.com/auth/adwordsB\376\001\n$com.go" +
      "ogle.ads.googleads.v9.servicesB\027AccountL" +
      "inkServiceProtoP\001ZHgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v9/servic" +
      "es;services\242\002\003GAA\252\002 Google.Ads.GoogleAds" +
      ".V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\S" +
      "ervices\352\002$Google::Ads::GoogleAds::V9::Se" +
      "rvicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.AccountLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetAccountLinkRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_CreateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_CreateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CreateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "AccountLink", });
    internal_static_google_ads_googleads_v9_services_CreateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_CreateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CreateAccountLinkResponse_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_AccountLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_AccountLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_AccountLinkOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAccountLinkResponse_descriptor,
        new java.lang.String[] { "Result", "PartialFailureError", });
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v9_services_MutateAccountLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAccountLinkResult_descriptor,
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
    com.google.ads.googleads.v9.resources.AccountLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}