// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/asset_service.proto

package com.google.ads.googleads.v13.services;

public final class AssetServiceProto {
  private AssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_AssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_AssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v13/services/asse" +
      "t_service.proto\022!google.ads.googleads.v1" +
      "3.services\032:google/ads/googleads/v13/enu" +
      "ms/response_content_type.proto\032.google/a" +
      "ds/googleads/v13/resources/asset.proto\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\027google/rpc/" +
      "status.proto\"\231\002\n\023MutateAssetsRequest\022\031\n\013" +
      "customer_id\030\001 \001(\tB\004\342A\001\002\022K\n\noperations\030\002 " +
      "\003(\01321.google.ads.googleads.v13.services." +
      "AssetOperationB\004\342A\001\002\022\027\n\017partial_failure\030" +
      "\005 \001(\010\022j\n\025response_content_type\030\003 \001(\0162K.g" +
      "oogle.ads.googleads.v13.enums.ResponseCo" +
      "ntentTypeEnum.ResponseContentType\022\025\n\rval" +
      "idate_only\030\004 \001(\010\"\310\001\n\016AssetOperation\022/\n\013u" +
      "pdate_mask\030\003 \001(\0132\032.google.protobuf.Field" +
      "Mask\022;\n\006create\030\001 \001(\0132).google.ads.google" +
      "ads.v13.resources.AssetH\000\022;\n\006update\030\002 \001(" +
      "\0132).google.ads.googleads.v13.resources.A" +
      "ssetH\000B\013\n\toperation\"\220\001\n\024MutateAssetsResp" +
      "onse\0221\n\025partial_failure_error\030\003 \001(\0132\022.go" +
      "ogle.rpc.Status\022E\n\007results\030\002 \003(\01324.googl" +
      "e.ads.googleads.v13.services.MutateAsset" +
      "Result\"\211\001\n\021MutateAssetResult\022:\n\rresource" +
      "_name\030\001 \001(\tB#\372A \n\036googleads.googleapis.c" +
      "om/Asset\0228\n\005asset\030\002 \001(\0132).google.ads.goo" +
      "gleads.v13.resources.Asset2\251\002\n\014AssetServ" +
      "ice\022\321\001\n\014MutateAssets\0226.google.ads.google" +
      "ads.v13.services.MutateAssetsRequest\0327.g" +
      "oogle.ads.googleads.v13.services.MutateA" +
      "ssetsResponse\"P\332A\026customer_id,operations" +
      "\202\323\344\223\0021\",/v13/customers/{customer_id=*}/a" +
      "ssets:mutate:\001*\032E\312A\030googleads.googleapis" +
      ".com\322A\'https://www.googleapis.com/auth/a" +
      "dwordsB\375\001\n%com.google.ads.googleads.v13." +
      "servicesB\021AssetServiceProtoP\001ZIgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v13/services;services\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V13.Services\312\002!Google\\Ads\\" +
      "GoogleAds\\V13\\Services\352\002%Google::Ads::Go" +
      "ogleAds::V13::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.AssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ResponseContentType", "ValidateOnly", });
    internal_static_google_ads_googleads_v13_services_AssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_AssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_AssetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAssetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v13_services_MutateAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAssetResult_descriptor,
        new java.lang.String[] { "ResourceName", "Asset", });
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
    com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v13.resources.AssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
