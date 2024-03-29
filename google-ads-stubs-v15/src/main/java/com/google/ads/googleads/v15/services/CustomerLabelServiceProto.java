// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_label_service.proto

package com.google.ads.googleads.v15.services;

public final class CustomerLabelServiceProto {
  private CustomerLabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_CustomerLabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_CustomerLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomerLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v15/services/cust" +
      "omer_label_service.proto\022!google.ads.goo" +
      "gleads.v15.services\0327google/ads/googlead" +
      "s/v15/resources/customer_label.proto\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\027google/" +
      "rpc/status.proto\"\275\001\n\033MutateCustomerLabel" +
      "sRequest\022\031\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022S\n\no" +
      "perations\030\002 \003(\01329.google.ads.googleads.v" +
      "15.services.CustomerLabelOperationB\004\342A\001\002" +
      "\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_on" +
      "ly\030\004 \001(\010\"\251\001\n\026CustomerLabelOperation\022C\n\006c" +
      "reate\030\001 \001(\01321.google.ads.googleads.v15.r" +
      "esources.CustomerLabelH\000\022=\n\006remove\030\002 \001(\t" +
      "B+\372A(\n&googleads.googleapis.com/Customer" +
      "LabelH\000B\013\n\toperation\"\240\001\n\034MutateCustomerL" +
      "abelsResponse\0221\n\025partial_failure_error\030\003" +
      " \001(\0132\022.google.rpc.Status\022M\n\007results\030\002 \003(" +
      "\0132<.google.ads.googleads.v15.services.Mu" +
      "tateCustomerLabelResult\"_\n\031MutateCustome" +
      "rLabelResult\022B\n\rresource_name\030\001 \001(\tB+\372A(" +
      "\n&googleads.googleapis.com/CustomerLabel" +
      "2\321\002\n\024CustomerLabelService\022\361\001\n\024MutateCust" +
      "omerLabels\022>.google.ads.googleads.v15.se" +
      "rvices.MutateCustomerLabelsRequest\032?.goo" +
      "gle.ads.googleads.v15.services.MutateCus" +
      "tomerLabelsResponse\"X\332A\026customer_id,oper" +
      "ations\202\323\344\223\0029\"4/v15/customers/{customer_i" +
      "d=*}/customerLabels:mutate:\001*\032E\312A\030google" +
      "ads.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/adwordsB\205\002\n%com.google.ads." +
      "googleads.v15.servicesB\031CustomerLabelSer" +
      "viceProtoP\001ZIgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v15/services;se" +
      "rvices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V15." +
      "Services\312\002!Google\\Ads\\GoogleAds\\V15\\Serv" +
      "ices\352\002%Google::Ads::GoogleAds::V15::Serv" +
      "icesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.resources.CustomerLabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v15_services_CustomerLabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_CustomerLabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_CustomerLabelOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomerLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateCustomerLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomerLabelResult_descriptor,
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
    com.google.ads.googleads.v15.resources.CustomerLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
