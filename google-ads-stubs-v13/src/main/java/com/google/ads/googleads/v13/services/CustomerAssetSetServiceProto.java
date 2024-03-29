// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/customer_asset_set_service.proto

package com.google.ads.googleads.v13.services;

public final class CustomerAssetSetServiceProto {
  private CustomerAssetSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_CustomerAssetSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_CustomerAssetSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v13/services/cust" +
      "omer_asset_set_service.proto\022!google.ads" +
      ".googleads.v13.services\032:google/ads/goog" +
      "leads/v13/enums/response_content_type.pr" +
      "oto\032;google/ads/googleads/v13/resources/" +
      "customer_asset_set.proto\032\034google/api/ann" +
      "otations.proto\032\027google/api/client.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\027google/rpc/status.p" +
      "roto\"\257\002\n\036MutateCustomerAssetSetsRequest\022" +
      "\031\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022V\n\noperations" +
      "\030\002 \003(\0132<.google.ads.googleads.v13.servic" +
      "es.CustomerAssetSetOperationB\004\342A\001\002\022\027\n\017pa" +
      "rtial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001" +
      "(\010\022j\n\025response_content_type\030\005 \001(\0162K.goog" +
      "le.ads.googleads.v13.enums.ResponseConte" +
      "ntTypeEnum.ResponseContentType\"\262\001\n\031Custo" +
      "merAssetSetOperation\022F\n\006create\030\001 \001(\01324.g" +
      "oogle.ads.googleads.v13.resources.Custom" +
      "erAssetSetH\000\022@\n\006remove\030\002 \001(\tB.\372A+\n)googl" +
      "eads.googleapis.com/CustomerAssetSetH\000B\013" +
      "\n\toperation\"\246\001\n\037MutateCustomerAssetSetsR" +
      "esponse\022P\n\007results\030\001 \003(\0132?.google.ads.go" +
      "ogleads.v13.services.MutateCustomerAsset" +
      "SetResult\0221\n\025partial_failure_error\030\002 \001(\013" +
      "2\022.google.rpc.Status\"\267\001\n\034MutateCustomerA" +
      "ssetSetResult\022E\n\rresource_name\030\001 \001(\tB.\372A" +
      "+\n)googleads.googleapis.com/CustomerAsse" +
      "tSet\022P\n\022customer_asset_set\030\002 \001(\01324.googl" +
      "e.ads.googleads.v13.resources.CustomerAs" +
      "setSet2\340\002\n\027CustomerAssetSetService\022\375\001\n\027M" +
      "utateCustomerAssetSets\022A.google.ads.goog" +
      "leads.v13.services.MutateCustomerAssetSe" +
      "tsRequest\032B.google.ads.googleads.v13.ser" +
      "vices.MutateCustomerAssetSetsResponse\"[\332" +
      "A\026customer_id,operations\202\323\344\223\002<\"7/v13/cus" +
      "tomers/{customer_id=*}/customerAssetSets" +
      ":mutate:\001*\032E\312A\030googleads.googleapis.com\322" +
      "A\'https://www.googleapis.com/auth/adword" +
      "sB\210\002\n%com.google.ads.googleads.v13.servi" +
      "cesB\034CustomerAssetSetServiceProtoP\001ZIgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v13/services;services\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V13.Services\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V13\\Services\352\002%Google::A" +
      "ds::GoogleAds::V13::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.CustomerAssetSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v13_services_CustomerAssetSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_CustomerAssetSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_CustomerAssetSetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateCustomerAssetSetResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomerAssetSet", });
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
    com.google.ads.googleads.v13.resources.CustomerAssetSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
