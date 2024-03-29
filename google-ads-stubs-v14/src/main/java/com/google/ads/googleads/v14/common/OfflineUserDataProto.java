// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/offline_user_data.proto

package com.google.ads.googleads.v14.common;

public final class OfflineUserDataProto {
  private OfflineUserDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_OfflineUserAddressInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_OfflineUserAddressInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_UserIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_UserIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_TransactionAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_TransactionAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_StoreAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_StoreAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_ItemAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_ItemAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_UserData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_UserData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_UserAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_UserAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_EventAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_EventAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_EventItemAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_EventItemAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_ShoppingLoyalty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_ShoppingLoyalty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_CustomerMatchUserListMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_CustomerMatchUserListMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_StoreSalesMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_StoreSalesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_StoreSalesThirdPartyMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_StoreSalesThirdPartyMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v14/common/offlin" +
      "e_user_data.proto\022\037google.ads.googleads." +
      "v14.common\032;google/ads/googleads/v14/enu" +
      "ms/user_identifier_source.proto\032\037google/" +
      "api/field_behavior.proto\"\320\002\n\026OfflineUser" +
      "AddressInfo\022\036\n\021hashed_first_name\030\007 \001(\tH\000" +
      "\210\001\001\022\035\n\020hashed_last_name\030\010 \001(\tH\001\210\001\001\022\021\n\004ci" +
      "ty\030\t \001(\tH\002\210\001\001\022\022\n\005state\030\n \001(\tH\003\210\001\001\022\031\n\014cou" +
      "ntry_code\030\013 \001(\tH\004\210\001\001\022\030\n\013postal_code\030\014 \001(" +
      "\tH\005\210\001\001\022\"\n\025hashed_street_address\030\r \001(\tH\006\210" +
      "\001\001B\024\n\022_hashed_first_nameB\023\n\021_hashed_last" +
      "_nameB\007\n\005_cityB\010\n\006_stateB\017\n\r_country_cod" +
      "eB\016\n\014_postal_codeB\030\n\026_hashed_street_addr" +
      "ess\"\311\002\n\016UserIdentifier\022m\n\026user_identifie" +
      "r_source\030\006 \001(\0162M.google.ads.googleads.v1" +
      "4.enums.UserIdentifierSourceEnum.UserIde" +
      "ntifierSource\022\026\n\014hashed_email\030\007 \001(\tH\000\022\035\n" +
      "\023hashed_phone_number\030\010 \001(\tH\000\022\023\n\tmobile_i" +
      "d\030\t \001(\tH\000\022\035\n\023third_party_user_id\030\n \001(\tH\000" +
      "\022O\n\014address_info\030\005 \001(\01327.google.ads.goog" +
      "leads.v14.common.OfflineUserAddressInfoH" +
      "\000B\014\n\nidentifier\"\340\003\n\024TransactionAttribute" +
      "\022\"\n\025transaction_date_time\030\010 \001(\tH\000\210\001\001\022&\n\031" +
      "transaction_amount_micros\030\t \001(\001H\001\210\001\001\022\032\n\r" +
      "currency_code\030\n \001(\tH\002\210\001\001\022\036\n\021conversion_a" +
      "ction\030\013 \001(\tH\003\210\001\001\022\025\n\010order_id\030\014 \001(\tH\004\210\001\001\022" +
      "H\n\017store_attribute\030\006 \001(\0132/.google.ads.go" +
      "ogleads.v14.common.StoreAttribute\022\031\n\014cus" +
      "tom_value\030\r \001(\tH\005\210\001\001\022F\n\016item_attribute\030\016" +
      " \001(\0132..google.ads.googleads.v14.common.I" +
      "temAttributeB\030\n\026_transaction_date_timeB\034" +
      "\n\032_transaction_amount_microsB\020\n\016_currenc" +
      "y_codeB\024\n\022_conversion_actionB\013\n\t_order_i" +
      "dB\017\n\r_custom_value\"8\n\016StoreAttribute\022\027\n\n" +
      "store_code\030\002 \001(\tH\000\210\001\001B\r\n\013_store_code\"\211\001\n" +
      "\rItemAttribute\022\017\n\007item_id\030\001 \001(\t\022\030\n\013merch" +
      "ant_id\030\002 \001(\003H\000\210\001\001\022\024\n\014country_code\030\003 \001(\t\022" +
      "\025\n\rlanguage_code\030\004 \001(\t\022\020\n\010quantity\030\005 \001(\003" +
      "B\016\n\014_merchant_id\"\363\001\n\010UserData\022I\n\020user_id" +
      "entifiers\030\001 \003(\0132/.google.ads.googleads.v" +
      "14.common.UserIdentifier\022T\n\025transaction_" +
      "attribute\030\002 \001(\01325.google.ads.googleads.v" +
      "14.common.TransactionAttribute\022F\n\016user_a" +
      "ttribute\030\003 \001(\0132..google.ads.googleads.v1" +
      "4.common.UserAttribute\"\217\004\n\rUserAttribute" +
      "\022\"\n\025lifetime_value_micros\030\001 \001(\003H\000\210\001\001\022\"\n\025" +
      "lifetime_value_bucket\030\002 \001(\005H\001\210\001\001\022\037\n\027last" +
      "_purchase_date_time\030\003 \001(\t\022\036\n\026average_pur" +
      "chase_count\030\004 \001(\005\022%\n\035average_purchase_va" +
      "lue_micros\030\005 \001(\003\022\035\n\025acquisition_date_tim" +
      "e\030\006 \001(\t\022O\n\020shopping_loyalty\030\007 \001(\01320.goog" +
      "le.ads.googleads.v14.common.ShoppingLoya" +
      "ltyH\002\210\001\001\022\035\n\017lifecycle_stage\030\010 \001(\tB\004\342A\001\001\022" +
      "&\n\030first_purchase_date_time\030\t \001(\tB\004\342A\001\001\022" +
      "N\n\017event_attribute\030\n \003(\0132/.google.ads.go" +
      "ogleads.v14.common.EventAttributeB\004\342A\001\001B" +
      "\030\n\026_lifetime_value_microsB\030\n\026_lifetime_v" +
      "alue_bucketB\023\n\021_shopping_loyalty\"\227\001\n\016Eve" +
      "ntAttribute\022\023\n\005event\030\001 \001(\tB\004\342A\001\002\022\035\n\017even" +
      "t_date_time\030\002 \001(\tB\004\342A\001\002\022Q\n\016item_attribut" +
      "e\030\003 \003(\01323.google.ads.googleads.v14.commo" +
      "n.EventItemAttributeB\004\342A\001\002\"+\n\022EventItemA" +
      "ttribute\022\025\n\007item_id\030\001 \001(\tB\004\342A\001\001\"=\n\017Shopp" +
      "ingLoyalty\022\031\n\014loyalty_tier\030\001 \001(\tH\000\210\001\001B\017\n" +
      "\r_loyalty_tier\"E\n\035CustomerMatchUserListM" +
      "etadata\022\026\n\tuser_list\030\002 \001(\tH\000\210\001\001B\014\n\n_user" +
      "_list\"\227\002\n\022StoreSalesMetadata\022\035\n\020loyalty_" +
      "fraction\030\005 \001(\001H\000\210\001\001\022(\n\033transaction_uploa" +
      "d_fraction\030\006 \001(\001H\001\210\001\001\022\027\n\ncustom_key\030\007 \001(" +
      "\tH\002\210\001\001\022[\n\024third_party_metadata\030\003 \001(\0132=.g" +
      "oogle.ads.googleads.v14.common.StoreSale" +
      "sThirdPartyMetadataB\023\n\021_loyalty_fraction" +
      "B\036\n\034_transaction_upload_fractionB\r\n\013_cus" +
      "tom_key\"\230\003\n\034StoreSalesThirdPartyMetadata" +
      "\022(\n\033advertiser_upload_date_time\030\007 \001(\tH\000\210" +
      "\001\001\022\'\n\032valid_transaction_fraction\030\010 \001(\001H\001" +
      "\210\001\001\022#\n\026partner_match_fraction\030\t \001(\001H\002\210\001\001" +
      "\022$\n\027partner_upload_fraction\030\n \001(\001H\003\210\001\001\022\"" +
      "\n\025bridge_map_version_id\030\013 \001(\tH\004\210\001\001\022\027\n\npa" +
      "rtner_id\030\014 \001(\003H\005\210\001\001B\036\n\034_advertiser_uploa" +
      "d_date_timeB\035\n\033_valid_transaction_fracti" +
      "onB\031\n\027_partner_match_fractionB\032\n\030_partne" +
      "r_upload_fractionB\030\n\026_bridge_map_version" +
      "_idB\r\n\013_partner_idB\364\001\n#com.google.ads.go" +
      "ogleads.v14.commonB\024OfflineUserDataProto" +
      "P\001ZEgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v14/common;common\242\002\003GAA\252" +
      "\002\037Google.Ads.GoogleAds.V14.Common\312\002\037Goog" +
      "le\\Ads\\GoogleAds\\V14\\Common\352\002#Google::Ad" +
      "s::GoogleAds::V14::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.UserIdentifierSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_common_OfflineUserAddressInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_common_OfflineUserAddressInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_OfflineUserAddressInfo_descriptor,
        new java.lang.String[] { "HashedFirstName", "HashedLastName", "City", "State", "CountryCode", "PostalCode", "HashedStreetAddress", "HashedFirstName", "HashedLastName", "City", "State", "CountryCode", "PostalCode", "HashedStreetAddress", });
    internal_static_google_ads_googleads_v14_common_UserIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_common_UserIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_UserIdentifier_descriptor,
        new java.lang.String[] { "UserIdentifierSource", "HashedEmail", "HashedPhoneNumber", "MobileId", "ThirdPartyUserId", "AddressInfo", "Identifier", });
    internal_static_google_ads_googleads_v14_common_TransactionAttribute_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_common_TransactionAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_TransactionAttribute_descriptor,
        new java.lang.String[] { "TransactionDateTime", "TransactionAmountMicros", "CurrencyCode", "ConversionAction", "OrderId", "StoreAttribute", "CustomValue", "ItemAttribute", "TransactionDateTime", "TransactionAmountMicros", "CurrencyCode", "ConversionAction", "OrderId", "CustomValue", });
    internal_static_google_ads_googleads_v14_common_StoreAttribute_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_common_StoreAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_StoreAttribute_descriptor,
        new java.lang.String[] { "StoreCode", "StoreCode", });
    internal_static_google_ads_googleads_v14_common_ItemAttribute_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v14_common_ItemAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_ItemAttribute_descriptor,
        new java.lang.String[] { "ItemId", "MerchantId", "CountryCode", "LanguageCode", "Quantity", "MerchantId", });
    internal_static_google_ads_googleads_v14_common_UserData_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v14_common_UserData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_UserData_descriptor,
        new java.lang.String[] { "UserIdentifiers", "TransactionAttribute", "UserAttribute", });
    internal_static_google_ads_googleads_v14_common_UserAttribute_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v14_common_UserAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_UserAttribute_descriptor,
        new java.lang.String[] { "LifetimeValueMicros", "LifetimeValueBucket", "LastPurchaseDateTime", "AveragePurchaseCount", "AveragePurchaseValueMicros", "AcquisitionDateTime", "ShoppingLoyalty", "LifecycleStage", "FirstPurchaseDateTime", "EventAttribute", "LifetimeValueMicros", "LifetimeValueBucket", "ShoppingLoyalty", });
    internal_static_google_ads_googleads_v14_common_EventAttribute_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v14_common_EventAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_EventAttribute_descriptor,
        new java.lang.String[] { "Event", "EventDateTime", "ItemAttribute", });
    internal_static_google_ads_googleads_v14_common_EventItemAttribute_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v14_common_EventItemAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_EventItemAttribute_descriptor,
        new java.lang.String[] { "ItemId", });
    internal_static_google_ads_googleads_v14_common_ShoppingLoyalty_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v14_common_ShoppingLoyalty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_ShoppingLoyalty_descriptor,
        new java.lang.String[] { "LoyaltyTier", "LoyaltyTier", });
    internal_static_google_ads_googleads_v14_common_CustomerMatchUserListMetadata_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v14_common_CustomerMatchUserListMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_CustomerMatchUserListMetadata_descriptor,
        new java.lang.String[] { "UserList", "UserList", });
    internal_static_google_ads_googleads_v14_common_StoreSalesMetadata_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v14_common_StoreSalesMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_StoreSalesMetadata_descriptor,
        new java.lang.String[] { "LoyaltyFraction", "TransactionUploadFraction", "CustomKey", "ThirdPartyMetadata", "LoyaltyFraction", "TransactionUploadFraction", "CustomKey", });
    internal_static_google_ads_googleads_v14_common_StoreSalesThirdPartyMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v14_common_StoreSalesThirdPartyMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_StoreSalesThirdPartyMetadata_descriptor,
        new java.lang.String[] { "AdvertiserUploadDateTime", "ValidTransactionFraction", "PartnerMatchFraction", "PartnerUploadFraction", "BridgeMapVersionId", "PartnerId", "AdvertiserUploadDateTime", "ValidTransactionFraction", "PartnerMatchFraction", "PartnerUploadFraction", "BridgeMapVersionId", "PartnerId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.UserIdentifierSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
