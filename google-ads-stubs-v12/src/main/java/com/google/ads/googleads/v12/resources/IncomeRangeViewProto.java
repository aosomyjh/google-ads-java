// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/income_range_view.proto

package com.google.ads.googleads.v12.resources;

public final class IncomeRangeViewProto {
  private IncomeRangeViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_IncomeRangeView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_IncomeRangeView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v12/resources/inc" +
      "ome_range_view.proto\022\"google.ads.googlea" +
      "ds.v12.resources\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\320\001\n" +
      "\017IncomeRangeView\022G\n\rresource_name\030\001 \001(\tB" +
      "0\340A\003\372A*\n(googleads.googleapis.com/Income" +
      "RangeView:t\352Aq\n(googleads.googleapis.com" +
      "/IncomeRangeView\022Ecustomers/{customer_id" +
      "}/incomeRangeViews/{ad_group_id}~{criter" +
      "ion_id}B\206\002\n&com.google.ads.googleads.v12" +
      ".resourcesB\024IncomeRangeViewProtoP\001ZKgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v12/resources;resources\242\002\003GAA\252\002\"" +
      "Google.Ads.GoogleAds.V12.Resources\312\002\"Goo" +
      "gle\\Ads\\GoogleAds\\V12\\Resources\352\002&Google" +
      "::Ads::GoogleAds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_IncomeRangeView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_IncomeRangeView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_IncomeRangeView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
