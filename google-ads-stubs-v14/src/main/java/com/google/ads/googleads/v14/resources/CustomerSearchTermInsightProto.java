// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/customer_search_term_insight.proto

package com.google.ads.googleads.v14.resources;

public final class CustomerSearchTermInsightProto {
  private CustomerSearchTermInsightProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerSearchTermInsight_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerSearchTermInsight_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v14/resources/cus" +
      "tomer_search_term_insight.proto\022\"google." +
      "ads.googleads.v14.resources\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\"\275\002\n\031CustomerSearchTermInsight\022R\n" +
      "\rresource_name\030\001 \001(\tB;\342A\001\003\372A4\n2googleads" +
      ".googleapis.com/CustomerSearchTermInsigh" +
      "t\022!\n\016category_label\030\002 \001(\tB\004\342A\001\003H\000\210\001\001\022\025\n\002" +
      "id\030\003 \001(\003B\004\342A\001\003H\001\210\001\001:x\352Au\n2googleads.goog" +
      "leapis.com/CustomerSearchTermInsight\022?cu" +
      "stomers/{customer_id}/customerSearchTerm" +
      "Insights/{cluster_id}B\021\n\017_category_label" +
      "B\005\n\003_idB\220\002\n&com.google.ads.googleads.v14" +
      ".resourcesB\036CustomerSearchTermInsightPro" +
      "toP\001ZKgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v14/resources;resource" +
      "s\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V14.Resou" +
      "rces\312\002\"Google\\Ads\\GoogleAds\\V14\\Resource" +
      "s\352\002&Google::Ads::GoogleAds::V14::Resourc" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_CustomerSearchTermInsight_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_CustomerSearchTermInsight_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerSearchTermInsight_descriptor,
        new java.lang.String[] { "ResourceName", "CategoryLabel", "Id", "CategoryLabel", "Id", });
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
