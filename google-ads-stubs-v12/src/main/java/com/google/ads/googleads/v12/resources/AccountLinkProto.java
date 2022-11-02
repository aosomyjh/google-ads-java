// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/account_link.proto

package com.google.ads.googleads.v12.resources;

public final class AccountLinkProto {
  private AccountLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_AccountLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_AccountLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_DataPartnerLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_DataPartnerLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_GoogleAdsLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_GoogleAdsLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_AdvertisingPartnerLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_AdvertisingPartnerLinkIdentifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v12/resources/acc" +
      "ount_link.proto\022\"google.ads.googleads.v1" +
      "2.resources\0328google/ads/googleads/v12/en" +
      "ums/account_link_status.proto\0328google/ad" +
      "s/googleads/v12/enums/linked_account_typ" +
      "e.proto\0326google/ads/googleads/v12/enums/" +
      "mobile_app_vendor.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\"\241\007\n\013AccountLink\022C\n\rresource_name\030\001 \001" +
      "(\tB,\340A\005\372A&\n$googleads.googleapis.com/Acc" +
      "ountLink\022!\n\017account_link_id\030\010 \001(\003B\003\340A\003H\001" +
      "\210\001\001\022W\n\006status\030\003 \001(\0162G.google.ads.googlea" +
      "ds.v12.enums.AccountLinkStatusEnum.Accou" +
      "ntLinkStatus\022Z\n\004type\030\004 \001(\0162G.google.ads." +
      "googleads.v12.enums.LinkedAccountTypeEnu" +
      "m.LinkedAccountTypeB\003\340A\003\022r\n\031third_party_" +
      "app_analytics\030\005 \001(\0132H.google.ads.googlea" +
      "ds.v12.resources.ThirdPartyAppAnalyticsL" +
      "inkIdentifierB\003\340A\005H\000\022Z\n\014data_partner\030\006 \001" +
      "(\0132=.google.ads.googleads.v12.resources." +
      "DataPartnerLinkIdentifierB\003\340A\003H\000\022V\n\ngoog" +
      "le_ads\030\007 \001(\0132;.google.ads.googleads.v12." +
      "resources.GoogleAdsLinkIdentifierB\003\340A\003H\000" +
      "\022Z\n\014hotel_center\030\t \001(\0132=.google.ads.goog" +
      "leads.v12.resources.HotelCenterLinkIdent" +
      "ifierB\003\340A\003H\000\022h\n\023advertising_partner\030\n \001(" +
      "\0132D.google.ads.googleads.v12.resources.A" +
      "dvertisingPartnerLinkIdentifierB\003\340A\003H\000:a" +
      "\352A^\n$googleads.googleapis.com/AccountLin" +
      "k\0226customers/{customer_id}/accountLinks/" +
      "{account_link_id}B\020\n\016linked_accountB\022\n\020_" +
      "account_link_id\"\364\001\n$ThirdPartyAppAnalyti" +
      "csLinkIdentifier\022+\n\031app_analytics_provid" +
      "er_id\030\004 \001(\003B\003\340A\005H\000\210\001\001\022\030\n\006app_id\030\005 \001(\tB\003\340" +
      "A\005H\001\210\001\001\022\\\n\napp_vendor\030\003 \001(\0162C.google.ads" +
      ".googleads.v12.enums.MobileAppVendorEnum" +
      ".MobileAppVendorB\003\340A\005B\034\n\032_app_analytics_" +
      "provider_idB\t\n\007_app_id\"R\n\031DataPartnerLin" +
      "kIdentifier\022!\n\017data_partner_id\030\001 \001(\003B\003\340A" +
      "\005H\000\210\001\001B\022\n\020_data_partner_id\"9\n\031HotelCente" +
      "rLinkIdentifier\022\034\n\017hotel_center_id\030\001 \001(\003" +
      "B\003\340A\003\"h\n\027GoogleAdsLinkIdentifier\022@\n\010cust" +
      "omer\030\003 \001(\tB)\340A\005\372A#\n!googleads.googleapis" +
      ".com/CustomerH\000\210\001\001B\013\n\t_customer\"q\n Adver" +
      "tisingPartnerLinkIdentifier\022@\n\010customer\030" +
      "\001 \001(\tB)\340A\005\372A#\n!googleads.googleapis.com/" +
      "CustomerH\000\210\001\001B\013\n\t_customerB\202\002\n&com.googl" +
      "e.ads.googleads.v12.resourcesB\020AccountLi" +
      "nkProtoP\001ZKgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v12/resources;res" +
      "ources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V12." +
      "Resources\312\002\"Google\\Ads\\GoogleAds\\V12\\Res" +
      "ources\352\002&Google::Ads::GoogleAds::V12::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.AccountLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.LinkedAccountTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.MobileAppVendorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_AccountLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_AccountLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_AccountLink_descriptor,
        new java.lang.String[] { "ResourceName", "AccountLinkId", "Status", "Type", "ThirdPartyAppAnalytics", "DataPartner", "GoogleAds", "HotelCenter", "AdvertisingPartner", "LinkedAccount", "AccountLinkId", });
    internal_static_google_ads_googleads_v12_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor,
        new java.lang.String[] { "AppAnalyticsProviderId", "AppId", "AppVendor", "AppAnalyticsProviderId", "AppId", });
    internal_static_google_ads_googleads_v12_resources_DataPartnerLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_resources_DataPartnerLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_DataPartnerLinkIdentifier_descriptor,
        new java.lang.String[] { "DataPartnerId", "DataPartnerId", });
    internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_descriptor,
        new java.lang.String[] { "HotelCenterId", });
    internal_static_google_ads_googleads_v12_resources_GoogleAdsLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v12_resources_GoogleAdsLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_GoogleAdsLinkIdentifier_descriptor,
        new java.lang.String[] { "Customer", "Customer", });
    internal_static_google_ads_googleads_v12_resources_AdvertisingPartnerLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v12_resources_AdvertisingPartnerLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_AdvertisingPartnerLinkIdentifier_descriptor,
        new java.lang.String[] { "Customer", "Customer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.enums.AccountLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v12.enums.LinkedAccountTypeProto.getDescriptor();
    com.google.ads.googleads.v12.enums.MobileAppVendorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
