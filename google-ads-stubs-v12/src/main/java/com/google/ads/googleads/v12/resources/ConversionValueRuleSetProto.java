// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/conversion_value_rule_set.proto

package com.google.ads.googleads.v12.resources;

public final class ConversionValueRuleSetProto {
  private ConversionValueRuleSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_ConversionValueRuleSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ConversionValueRuleSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v12/resources/con" +
      "version_value_rule_set.proto\022\"google.ads" +
      ".googleads.v12.resources\032?google/ads/goo" +
      "gleads/v12/enums/conversion_action_categ" +
      "ory.proto\032Egoogle/ads/googleads/v12/enum" +
      "s/conversion_value_rule_set_status.proto" +
      "\032Cgoogle/ads/googleads/v12/enums/value_r" +
      "ule_set_attachment_type.proto\032=google/ad" +
      "s/googleads/v12/enums/value_rule_set_dim" +
      "ension.proto\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\"\246\007\n\026Con" +
      "versionValueRuleSet\022N\n\rresource_name\030\001 \001" +
      "(\tB7\340A\005\372A1\n/googleads.googleapis.com/Con" +
      "versionValueRuleSet\022\017\n\002id\030\002 \001(\003B\003\340A\003\022Q\n\026" +
      "conversion_value_rules\030\003 \003(\tB1\372A.\n,googl" +
      "eads.googleapis.com/ConversionValueRule\022" +
      "c\n\ndimensions\030\004 \003(\0162O.google.ads.googlea" +
      "ds.v12.enums.ValueRuleSetDimensionEnum.V" +
      "alueRuleSetDimension\022A\n\016owner_customer\030\005" +
      " \001(\tB)\340A\003\372A#\n!googleads.googleapis.com/C" +
      "ustomer\022w\n\017attachment_type\030\006 \001(\0162Y.googl" +
      "e.ads.googleads.v12.enums.ValueRuleSetAt" +
      "tachmentTypeEnum.ValueRuleSetAttachmentT" +
      "ypeB\003\340A\005\0228\n\010campaign\030\007 \001(\tB&\372A#\n!googlea" +
      "ds.googleapis.com/Campaign\022r\n\006status\030\010 \001" +
      "(\0162].google.ads.googleads.v12.enums.Conv" +
      "ersionValueRuleSetStatusEnum.ConversionV" +
      "alueRuleSetStatusB\003\340A\003\022\200\001\n\034conversion_ac" +
      "tion_categories\030\t \003(\0162U.google.ads.googl" +
      "eads.v12.enums.ConversionActionCategoryE" +
      "num.ConversionActionCategoryB\003\340A\005:\205\001\352A\201\001" +
      "\n/googleads.googleapis.com/ConversionVal" +
      "ueRuleSet\022Ncustomers/{customer_id}/conve" +
      "rsionValueRuleSets/{conversion_value_rul" +
      "e_set_id}B\215\002\n&com.google.ads.googleads.v" +
      "12.resourcesB\033ConversionValueRuleSetProt" +
      "oP\001ZKgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v12/resources;resources" +
      "\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V12.Resour" +
      "ces\312\002\"Google\\Ads\\GoogleAds\\V12\\Resources" +
      "\352\002&Google::Ads::GoogleAds::V12::Resource" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ConversionValueRuleSetStatusProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ValueRuleSetAttachmentTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ValueRuleSetDimensionProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_ConversionValueRuleSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_ConversionValueRuleSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ConversionValueRuleSet_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ConversionValueRules", "Dimensions", "OwnerCustomer", "AttachmentType", "Campaign", "Status", "ConversionActionCategories", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ConversionValueRuleSetStatusProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ValueRuleSetAttachmentTypeProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ValueRuleSetDimensionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
