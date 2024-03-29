// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/lead_form_submission_data.proto

package com.google.ads.googleads.v15.resources;

public final class LeadFormSubmissionDataProto {
  private LeadFormSubmissionDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v15/resources/lea" +
      "d_form_submission_data.proto\022\"google.ads" +
      ".googleads.v15.resources\032Dgoogle/ads/goo" +
      "gleads/v15/enums/lead_form_field_user_in" +
      "put_type.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\"\215\006\n\026L" +
      "eadFormSubmissionData\022O\n\rresource_name\030\001" +
      " \001(\tB8\342A\001\003\372A1\n/googleads.googleapis.com/" +
      "LeadFormSubmissionData\022\020\n\002id\030\002 \001(\tB\004\342A\001\003" +
      "\0226\n\005asset\030\003 \001(\tB\'\342A\001\003\372A \n\036googleads.goog" +
      "leapis.com/Asset\022<\n\010campaign\030\004 \001(\tB*\342A\001\003" +
      "\372A#\n!googleads.googleapis.com/Campaign\022f" +
      "\n\033lead_form_submission_fields\030\005 \003(\0132;.go" +
      "ogle.ads.googleads.v15.resources.LeadFor" +
      "mSubmissionFieldB\004\342A\001\003\022s\n\"custom_lead_fo" +
      "rm_submission_fields\030\n \003(\0132A.google.ads." +
      "googleads.v15.resources.CustomLeadFormSu" +
      "bmissionFieldB\004\342A\001\003\022;\n\010ad_group\030\006 \001(\tB)\342" +
      "A\001\003\372A\"\n googleads.googleapis.com/AdGroup" +
      "\022@\n\013ad_group_ad\030\007 \001(\tB+\342A\001\003\372A$\n\"googlead" +
      "s.googleapis.com/AdGroupAd\022\023\n\005gclid\030\010 \001(" +
      "\tB\004\342A\001\003\022\"\n\024submission_date_time\030\t \001(\tB\004\342" +
      "A\001\003:\204\001\352A\200\001\n/googleads.googleapis.com/Lea" +
      "dFormSubmissionData\022Mcustomers/{customer" +
      "_id}/leadFormSubmissionData/{lead_form_u" +
      "ser_submission_id}\"\251\001\n\027LeadFormSubmissio" +
      "nField\022s\n\nfield_type\030\001 \001(\0162Y.google.ads." +
      "googleads.v15.enums.LeadFormFieldUserInp" +
      "utTypeEnum.LeadFormFieldUserInputTypeB\004\342" +
      "A\001\003\022\031\n\013field_value\030\002 \001(\tB\004\342A\001\003\"W\n\035Custom" +
      "LeadFormSubmissionField\022\033\n\rquestion_text" +
      "\030\001 \001(\tB\004\342A\001\003\022\031\n\013field_value\030\002 \001(\tB\004\342A\001\003B" +
      "\215\002\n&com.google.ads.googleads.v15.resourc" +
      "esB\033LeadFormSubmissionDataProtoP\001ZKgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v15/resources;resources\242\002\003GAA\252\002\"G" +
      "oogle.Ads.GoogleAds.V15.Resources\312\002\"Goog" +
      "le\\Ads\\GoogleAds\\V15\\Resources\352\002&Google:" +
      ":Ads::GoogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.LeadFormFieldUserInputTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionData_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Asset", "Campaign", "LeadFormSubmissionFields", "CustomLeadFormSubmissionFields", "AdGroup", "AdGroupAd", "Gclid", "SubmissionDateTime", });
    internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionField_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_LeadFormSubmissionField_descriptor,
        new java.lang.String[] { "FieldType", "FieldValue", });
    internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_descriptor,
        new java.lang.String[] { "QuestionText", "FieldValue", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.LeadFormFieldUserInputTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
