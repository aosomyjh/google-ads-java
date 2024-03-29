// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/smart_campaign_suggest_service.proto

package com.google.ads.googleads.v13.services;

public final class SmartCampaignSuggestServiceProto {
  private SmartCampaignSuggestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_LocationList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_LocationList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_BusinessContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_BusinessContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_KeywordTheme_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_KeywordTheme_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v13/services/smar" +
      "t_campaign_suggest_service.proto\022!google" +
      ".ads.googleads.v13.services\0323google/ads/" +
      "googleads/v13/common/ad_type_infos.proto" +
      "\032.google/ads/googleads/v13/common/criter" +
      "ia.proto\032?google/ads/googleads/v13/resou" +
      "rces/keyword_theme_constant.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\"\371\001\n(Suggest" +
      "SmartCampaignBudgetOptionsRequest\022\031\n\013cus" +
      "tomer_id\030\001 \001(\tB\004\342A\001\002\022>\n\010campaign\030\002 \001(\tB*" +
      "\342A\001\002\372A#\n!googleads.googleapis.com/Campai" +
      "gnH\000\022_\n\017suggestion_info\030\003 \001(\0132>.google.a" +
      "ds.googleads.v13.services.SmartCampaignS" +
      "uggestionInfoB\004\342A\001\002H\000B\021\n\017suggestion_data" +
      "\"\357\005\n\033SmartCampaignSuggestionInfo\022\027\n\tfina" +
      "l_url\030\001 \001(\tB\004\342A\001\001\022\033\n\rlanguage_code\030\003 \001(\t" +
      "B\004\342A\001\001\022K\n\014ad_schedules\030\006 \003(\0132/.google.ad" +
      "s.googleads.v13.common.AdScheduleInfoB\004\342" +
      "A\001\001\022O\n\016keyword_themes\030\007 \003(\01321.google.ads" +
      ".googleads.v13.common.KeywordThemeInfoB\004" +
      "\342A\001\001\022p\n\020business_context\030\010 \001(\0132N.google." +
      "ads.googleads.v13.services.SmartCampaign" +
      "SuggestionInfo.BusinessContextB\004\342A\001\001H\000\022)" +
      "\n\031business_profile_location\030\t \001(\tB\004\342A\001\001H" +
      "\000\022j\n\rlocation_list\030\004 \001(\0132K.google.ads.go" +
      "ogleads.v13.services.SmartCampaignSugges" +
      "tionInfo.LocationListB\004\342A\001\001H\001\022I\n\tproximi" +
      "ty\030\005 \001(\0132..google.ads.googleads.v13.comm" +
      "on.ProximityInfoB\004\342A\001\001H\001\032V\n\014LocationList" +
      "\022F\n\tlocations\030\001 \003(\0132-.google.ads.googlea" +
      "ds.v13.common.LocationInfoB\004\342A\001\002\032.\n\017Busi" +
      "nessContext\022\033\n\rbusiness_name\030\001 \001(\tB\004\342A\001\001" +
      "B\022\n\020business_settingB\014\n\ngeo_target\"\202\005\n)S" +
      "uggestSmartCampaignBudgetOptionsResponse" +
      "\022q\n\003low\030\001 \001(\0132Y.google.ads.googleads.v13" +
      ".services.SuggestSmartCampaignBudgetOpti" +
      "onsResponse.BudgetOptionB\004\342A\001\001H\000\210\001\001\022y\n\013r" +
      "ecommended\030\002 \001(\0132Y.google.ads.googleads." +
      "v13.services.SuggestSmartCampaignBudgetO" +
      "ptionsResponse.BudgetOptionB\004\342A\001\001H\001\210\001\001\022r" +
      "\n\004high\030\003 \001(\0132Y.google.ads.googleads.v13." +
      "services.SuggestSmartCampaignBudgetOptio" +
      "nsResponse.BudgetOptionB\004\342A\001\001H\002\210\001\001\032=\n\007Me" +
      "trics\022\030\n\020min_daily_clicks\030\001 \001(\003\022\030\n\020max_d" +
      "aily_clicks\030\002 \001(\003\032\222\001\n\014BudgetOption\022\033\n\023da" +
      "ily_amount_micros\030\001 \001(\003\022e\n\007metrics\030\002 \001(\013" +
      "2T.google.ads.googleads.v13.services.Sug" +
      "gestSmartCampaignBudgetOptionsResponse.M" +
      "etricsB\006\n\004_lowB\016\n\014_recommendedB\007\n\005_high\"" +
      "\231\001\n\035SuggestSmartCampaignAdRequest\022\031\n\013cus" +
      "tomer_id\030\001 \001(\tB\004\342A\001\002\022]\n\017suggestion_info\030" +
      "\002 \001(\0132>.google.ads.googleads.v13.service" +
      "s.SmartCampaignSuggestionInfoB\004\342A\001\002\"m\n\036S" +
      "uggestSmartCampaignAdResponse\022K\n\007ad_info" +
      "\030\001 \001(\01324.google.ads.googleads.v13.common" +
      ".SmartCampaignAdInfoB\004\342A\001\001\"\227\001\n\033SuggestKe" +
      "ywordThemesRequest\022\031\n\013customer_id\030\001 \001(\tB" +
      "\004\342A\001\002\022]\n\017suggestion_info\030\002 \001(\0132>.google." +
      "ads.googleads.v13.services.SmartCampaign" +
      "SuggestionInfoB\004\342A\001\002\"\245\002\n\034SuggestKeywordT" +
      "hemesResponse\022d\n\016keyword_themes\030\002 \003(\0132L." +
      "google.ads.googleads.v13.services.Sugges" +
      "tKeywordThemesResponse.KeywordTheme\032\236\001\n\014" +
      "KeywordTheme\022Z\n\026keyword_theme_constant\030\001" +
      " \001(\01328.google.ads.googleads.v13.resource" +
      "s.KeywordThemeConstantH\000\022!\n\027free_form_ke" +
      "yword_theme\030\002 \001(\tH\000B\017\n\rkeyword_theme2\256\006\n" +
      "\033SmartCampaignSuggestService\022\213\002\n!Suggest" +
      "SmartCampaignBudgetOptions\022K.google.ads." +
      "googleads.v13.services.SuggestSmartCampa" +
      "ignBudgetOptionsRequest\032L.google.ads.goo" +
      "gleads.v13.services.SuggestSmartCampaign" +
      "BudgetOptionsResponse\"K\202\323\344\223\002E\"@/v13/cust" +
      "omers/{customer_id=*}:suggestSmartCampai" +
      "gnBudgetOptions:\001*\022\337\001\n\026SuggestSmartCampa" +
      "ignAd\022@.google.ads.googleads.v13.service" +
      "s.SuggestSmartCampaignAdRequest\032A.google" +
      ".ads.googleads.v13.services.SuggestSmart" +
      "CampaignAdResponse\"@\202\323\344\223\002:\"5/v13/custome" +
      "rs/{customer_id=*}:suggestSmartCampaignA" +
      "d:\001*\022\327\001\n\024SuggestKeywordThemes\022>.google.a" +
      "ds.googleads.v13.services.SuggestKeyword" +
      "ThemesRequest\032?.google.ads.googleads.v13" +
      ".services.SuggestKeywordThemesResponse\">" +
      "\202\323\344\223\0028\"3/v13/customers/{customer_id=*}:s" +
      "uggestKeywordThemes:\001*\032E\312A\030googleads.goo" +
      "gleapis.com\322A\'https://www.googleapis.com" +
      "/auth/adwordsB\214\002\n%com.google.ads.googlea" +
      "ds.v13.servicesB SmartCampaignSuggestSer" +
      "viceProtoP\001ZIgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v13/services;se" +
      "rvices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V13." +
      "Services\312\002!Google\\Ads\\GoogleAds\\V13\\Serv" +
      "ices\352\002%Google::Ads::GoogleAds::V13::Serv" +
      "icesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.common.AdTypeInfosProto.getDescriptor(),
          com.google.ads.googleads.v13.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.KeywordThemeConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Campaign", "SuggestionInfo", "SuggestionData", });
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_descriptor,
        new java.lang.String[] { "FinalUrl", "LanguageCode", "AdSchedules", "KeywordThemes", "BusinessContext", "BusinessProfileLocation", "LocationList", "Proximity", "BusinessSetting", "GeoTarget", });
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_LocationList_descriptor =
      internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_LocationList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_LocationList_descriptor,
        new java.lang.String[] { "Locations", });
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_BusinessContext_descriptor =
      internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_BusinessContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SmartCampaignSuggestionInfo_BusinessContext_descriptor,
        new java.lang.String[] { "BusinessName", });
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor,
        new java.lang.String[] { "Low", "Recommended", "High", "Low", "Recommended", "High", });
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_descriptor =
      internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_descriptor,
        new java.lang.String[] { "MinDailyClicks", "MaxDailyClicks", });
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_descriptor =
      internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_descriptor,
        new java.lang.String[] { "DailyAmountMicros", "Metrics", });
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdRequest_descriptor,
        new java.lang.String[] { "CustomerId", "SuggestionInfo", });
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_descriptor,
        new java.lang.String[] { "AdInfo", });
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "SuggestionInfo", });
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_descriptor,
        new java.lang.String[] { "KeywordThemes", });
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_KeywordTheme_descriptor =
      internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_KeywordTheme_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestKeywordThemesResponse_KeywordTheme_descriptor,
        new java.lang.String[] { "KeywordThemeConstant", "FreeFormKeywordTheme", "KeywordTheme", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.common.AdTypeInfosProto.getDescriptor();
    com.google.ads.googleads.v13.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v13.resources.KeywordThemeConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
