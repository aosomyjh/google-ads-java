// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/feed_item_service.proto

package com.google.ads.googleads.v14.services;

public final class FeedItemServiceProto {
  private FeedItemServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateFeedItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateFeedItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_FeedItemOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_FeedItemOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateFeedItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateFeedItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateFeedItemResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateFeedItemResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v14/services/feed" +
      "_item_service.proto\022!google.ads.googlead" +
      "s.v14.services\032:google/ads/googleads/v14" +
      "/enums/response_content_type.proto\0322goog" +
      "le/ads/googleads/v14/resources/feed_item" +
      ".proto\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032 google/protobuf/field_mask.proto\032\027goo" +
      "gle/rpc/status.proto\"\237\002\n\026MutateFeedItems" +
      "Request\022\031\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022N\n\nop" +
      "erations\030\002 \003(\01324.google.ads.googleads.v1" +
      "4.services.FeedItemOperationB\004\342A\001\002\022\027\n\017pa" +
      "rtial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001" +
      "(\010\022j\n\025response_content_type\030\005 \001(\0162K.goog" +
      "le.ads.googleads.v14.enums.ResponseConte" +
      "ntTypeEnum.ResponseContentType\"\213\002\n\021FeedI" +
      "temOperation\022/\n\013update_mask\030\004 \001(\0132\032.goog" +
      "le.protobuf.FieldMask\022>\n\006create\030\001 \001(\0132,." +
      "google.ads.googleads.v14.resources.FeedI" +
      "temH\000\022>\n\006update\030\002 \001(\0132,.google.ads.googl" +
      "eads.v14.resources.FeedItemH\000\0228\n\006remove\030" +
      "\003 \001(\tB&\372A#\n!googleads.googleapis.com/Fee" +
      "dItemH\000B\013\n\toperation\"\226\001\n\027MutateFeedItems" +
      "Response\0221\n\025partial_failure_error\030\003 \001(\0132" +
      "\022.google.rpc.Status\022H\n\007results\030\002 \003(\01327.g" +
      "oogle.ads.googleads.v14.services.MutateF" +
      "eedItemResult\"\226\001\n\024MutateFeedItemResult\022=" +
      "\n\rresource_name\030\001 \001(\tB&\372A#\n!googleads.go" +
      "ogleapis.com/FeedItem\022?\n\tfeed_item\030\002 \001(\013" +
      "2,.google.ads.googleads.v14.resources.Fe" +
      "edItem2\270\002\n\017FeedItemService\022\335\001\n\017MutateFee" +
      "dItems\0229.google.ads.googleads.v14.servic" +
      "es.MutateFeedItemsRequest\032:.google.ads.g" +
      "oogleads.v14.services.MutateFeedItemsRes" +
      "ponse\"S\332A\026customer_id,operations\202\323\344\223\0024\"/" +
      "/v14/customers/{customer_id=*}/feedItems" +
      ":mutate:\001*\032E\312A\030googleads.googleapis.com\322" +
      "A\'https://www.googleapis.com/auth/adword" +
      "sB\200\002\n%com.google.ads.googleads.v14.servi" +
      "cesB\024FeedItemServiceProtoP\001ZIgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v14/services;services\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V14.Services\312\002!Google\\Ads\\Go" +
      "ogleAds\\V14\\Services\352\002%Google::Ads::Goog" +
      "leAds::V14::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.resources.FeedItemProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateFeedItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateFeedItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateFeedItemsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v14_services_FeedItemOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_FeedItemOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_FeedItemOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateFeedItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateFeedItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateFeedItemsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v14_services_MutateFeedItemResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateFeedItemResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateFeedItemResult_descriptor,
        new java.lang.String[] { "ResourceName", "FeedItem", });
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
    com.google.ads.googleads.v14.resources.FeedItemProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
