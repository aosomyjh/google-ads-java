// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/managed_placement_view.proto

package com.google.ads.googleads.v10.resources;

public final class ManagedPlacementViewProto {
  private ManagedPlacementViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ManagedPlacementView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ManagedPlacementView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v10/resources/man" +
      "aged_placement_view.proto\022\"google.ads.go" +
      "ogleads.v10.resources\032\034google/api/annota" +
      "tions.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\"\344\001\n\024Mana" +
      "gedPlacementView\022L\n\rresource_name\030\001 \001(\tB" +
      "5\340A\003\372A/\n-googleads.googleapis.com/Manage" +
      "dPlacementView:~\352A{\n-googleads.googleapi" +
      "s.com/ManagedPlacementView\022Jcustomers/{c" +
      "ustomer_id}/managedPlacementViews/{ad_gr" +
      "oup_id}~{criterion_id}B\213\002\n&com.google.ad" +
      "s.googleads.v10.resourcesB\031ManagedPlacem" +
      "entViewProtoP\001ZKgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v10/resource" +
      "s;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds" +
      ".V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V1" +
      "0\\Resources\352\002&Google::Ads::GoogleAds::V1" +
      "0::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ManagedPlacementView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ManagedPlacementView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ManagedPlacementView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}