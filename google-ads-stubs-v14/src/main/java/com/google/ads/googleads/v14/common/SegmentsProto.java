// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/segments.proto

package com.google.ads.googleads.v14.common;

public final class SegmentsProto {
  private SegmentsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_Segments_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_Segments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_Keyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_Keyword_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_AssetInteractionTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_AssetInteractionTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_SkAdNetworkSourceApp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_SkAdNetworkSourceApp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v14/common/segmen" +
      "ts.proto\022\037google.ads.googleads.v14.commo" +
      "n\032.google/ads/googleads/v14/common/crite" +
      "ria.proto\0328google/ads/googleads/v14/enum" +
      "s/ad_destination_type.proto\0324google/ads/" +
      "googleads/v14/enums/ad_network_type.prot" +
      "o\032Ggoogle/ads/googleads/v14/enums/budget" +
      "_campaign_association_status.proto\032/goog" +
      "le/ads/googleads/v14/enums/click_type.pr" +
      "oto\032?google/ads/googleads/v14/enums/conv" +
      "ersion_action_category.proto\032Fgoogle/ads" +
      "/googleads/v14/enums/conversion_attribut" +
      "ion_event_type.proto\032:google/ads/googlea" +
      "ds/v14/enums/conversion_lag_bucket.proto" +
      "\032Hgoogle/ads/googleads/v14/enums/convers" +
      "ion_or_adjustment_lag_bucket.proto\032Lgoog" +
      "le/ads/googleads/v14/enums/conversion_va" +
      "lue_rule_primary_dimension.proto\032Ygoogle" +
      "/ads/googleads/v14/enums/converting_user" +
      "_prior_engagement_type_and_ltv_bucket.pr" +
      "oto\0320google/ads/googleads/v14/enums/day_" +
      "of_week.proto\032+google/ads/googleads/v14/" +
      "enums/device.proto\032?google/ads/googleads" +
      "/v14/enums/external_conversion_source.pr" +
      "oto\032>google/ads/googleads/v14/enums/hote" +
      "l_date_selection_type.proto\0327google/ads/" +
      "googleads/v14/enums/hotel_price_bucket.p" +
      "roto\0324google/ads/googleads/v14/enums/hot" +
      "el_rate_type.proto\0322google/ads/googleads" +
      "/v14/enums/month_of_year.proto\0325google/a" +
      "ds/googleads/v14/enums/placeholder_type." +
      "proto\0324google/ads/googleads/v14/enums/pr" +
      "oduct_channel.proto\032@google/ads/googlead" +
      "s/v14/enums/product_channel_exclusivity." +
      "proto\0326google/ads/googleads/v14/enums/pr" +
      "oduct_condition.proto\0328google/ads/google" +
      "ads/v14/enums/recommendation_type.proto\032" +
      "Dgoogle/ads/googleads/v14/enums/search_e" +
      "ngine_results_page_type.proto\032;google/ad" +
      "s/googleads/v14/enums/search_term_match_" +
      "type.proto\032@google/ads/googleads/v14/enu" +
      "ms/sk_ad_network_ad_event_type.proto\032Ego" +
      "ogle/ads/googleads/v14/enums/sk_ad_netwo" +
      "rk_attribution_credit.proto\032<google/ads/" +
      "googleads/v14/enums/sk_ad_network_user_t" +
      "ype.proto\032)google/ads/googleads/v14/enum" +
      "s/slot.proto\032\031google/api/resource.proto\"" +
      "\3168\n\010Segments\022!\n\023activity_account_id\030\224\001 \001" +
      "(\003H\000\210\001\001\022\035\n\017activity_rating\030\225\001 \001(\003H\001\210\001\001\022\"" +
      "\n\024external_activity_id\030\226\001 \001(\tH\002\210\001\001\022e\n\023ad" +
      "_destination_type\030\210\001 \001(\0162G.google.ads.go" +
      "ogleads.v14.enums.AdDestinationTypeEnum." +
      "AdDestinationType\022X\n\017ad_network_type\030\003 \001" +
      "(\0162?.google.ads.googleads.v14.enums.AdNe" +
      "tworkTypeEnum.AdNetworkType\022\026\n\010ad_group\030" +
      "\236\001 \001(\tH\003\210\001\001\022\031\n\013asset_group\030\237\001 \001(\tH\004\210\001\001\022$" +
      "\n\026auction_insight_domain\030\221\001 \001(\tH\005\210\001\001\022m\n\"" +
      "budget_campaign_association_status\030\206\001 \001(" +
      "\0132@.google.ads.googleads.v14.common.Budg" +
      "etCampaignAssociationStatus\022\026\n\010campaign\030" +
      "\235\001 \001(\tH\006\210\001\001\022K\n\nclick_type\030\032 \001(\01627.google" +
      ".ads.googleads.v14.enums.ClickTypeEnum.C" +
      "lickType\022N\n\021conversion_action\030q \001(\tB.\372A+" +
      "\n)googleads.googleapis.com/ConversionAct" +
      "ionH\007\210\001\001\022y\n\032conversion_action_category\0305" +
      " \001(\0162U.google.ads.googleads.v14.enums.Co" +
      "nversionActionCategoryEnum.ConversionAct" +
      "ionCategory\022#\n\026conversion_action_name\030r " +
      "\001(\tH\010\210\001\001\022\"\n\025conversion_adjustment\030s \001(\010H" +
      "\t\210\001\001\022\214\001\n!conversion_attribution_event_ty" +
      "pe\030\002 \001(\0162a.google.ads.googleads.v14.enum" +
      "s.ConversionAttributionEventTypeEnum.Con" +
      "versionAttributionEventType\022j\n\025conversio" +
      "n_lag_bucket\0302 \001(\0162K.google.ads.googlead" +
      "s.v14.enums.ConversionLagBucketEnum.Conv" +
      "ersionLagBucket\022\220\001\n#conversion_or_adjust" +
      "ment_lag_bucket\0303 \001(\0162c.google.ads.googl" +
      "eads.v14.enums.ConversionOrAdjustmentLag" +
      "BucketEnum.ConversionOrAdjustmentLagBuck" +
      "et\022\021\n\004date\030O \001(\tH\n\210\001\001\022L\n\013day_of_week\030\005 \001" +
      "(\01627.google.ads.googleads.v14.enums.DayO" +
      "fWeekEnum.DayOfWeek\022A\n\006device\030\001 \001(\01621.go" +
      "ogle.ads.googleads.v14.enums.DeviceEnum." +
      "Device\022y\n\032external_conversion_source\0307 \001" +
      "(\0162U.google.ads.googleads.v14.enums.Exte" +
      "rnalConversionSourceEnum.ExternalConvers" +
      "ionSource\022\037\n\022geo_target_airport\030t \001(\tH\013\210" +
      "\001\001\022\036\n\021geo_target_canton\030u \001(\tH\014\210\001\001\022\034\n\017ge" +
      "o_target_city\030v \001(\tH\r\210\001\001\022\037\n\022geo_target_c" +
      "ountry\030w \001(\tH\016\210\001\001\022\036\n\021geo_target_county\030x" +
      " \001(\tH\017\210\001\001\022 \n\023geo_target_district\030y \001(\tH\020" +
      "\210\001\001\022\035\n\020geo_target_metro\030z \001(\tH\021\210\001\001\022.\n!ge" +
      "o_target_most_specific_location\030{ \001(\tH\022\210" +
      "\001\001\022#\n\026geo_target_postal_code\030| \001(\tH\023\210\001\001\022" +
      " \n\023geo_target_province\030} \001(\tH\024\210\001\001\022\036\n\021geo" +
      "_target_region\030~ \001(\tH\025\210\001\001\022\035\n\020geo_target_" +
      "state\030\177 \001(\tH\026\210\001\001\022\'\n\031hotel_booking_window" +
      "_days\030\207\001 \001(\003H\027\210\001\001\022\034\n\017hotel_center_id\030P \001" +
      "(\003H\030\210\001\001\022 \n\023hotel_check_in_date\030Q \001(\tH\031\210\001" +
      "\001\022[\n\032hotel_check_in_day_of_week\030\t \001(\01627." +
      "google.ads.googleads.v14.enums.DayOfWeek" +
      "Enum.DayOfWeek\022\027\n\nhotel_city\030R \001(\tH\032\210\001\001\022" +
      "\030\n\013hotel_class\030S \001(\005H\033\210\001\001\022\032\n\rhotel_count" +
      "ry\030T \001(\tH\034\210\001\001\022t\n\031hotel_date_selection_ty" +
      "pe\030\r \001(\0162Q.google.ads.googleads.v14.enum" +
      "s.HotelDateSelectionTypeEnum.HotelDateSe" +
      "lectionType\022!\n\024hotel_length_of_stay\030U \001(" +
      "\005H\035\210\001\001\022\037\n\022hotel_rate_rule_id\030V \001(\tH\036\210\001\001\022" +
      "X\n\017hotel_rate_type\030J \001(\0162?.google.ads.go" +
      "ogleads.v14.enums.HotelRateTypeEnum.Hote" +
      "lRateType\022a\n\022hotel_price_bucket\030N \001(\0162E." +
      "google.ads.googleads.v14.enums.HotelPric" +
      "eBucketEnum.HotelPriceBucket\022\030\n\013hotel_st" +
      "ate\030W \001(\tH\037\210\001\001\022\021\n\004hour\030X \001(\005H \210\001\001\022*\n\035int" +
      "eraction_on_this_extension\030Y \001(\010H!\210\001\001\0229\n" +
      "\007keyword\030= \001(\0132(.google.ads.googleads.v1" +
      "4.common.Keyword\022\022\n\005month\030Z \001(\tH\"\210\001\001\022R\n\r" +
      "month_of_year\030\022 \001(\0162;.google.ads.googlea" +
      "ds.v14.enums.MonthOfYearEnum.MonthOfYear" +
      "\022\035\n\020partner_hotel_id\030[ \001(\tH#\210\001\001\022]\n\020place" +
      "holder_type\030\024 \001(\0162C.google.ads.googleads" +
      ".v14.enums.PlaceholderTypeEnum.Placehold" +
      "erType\022#\n\025product_aggregator_id\030\204\001 \001(\003H$" +
      "\210\001\001\022,\n\037product_bidding_category_level1\030\\" +
      " \001(\tH%\210\001\001\022,\n\037product_bidding_category_le" +
      "vel2\030] \001(\tH&\210\001\001\022,\n\037product_bidding_categ" +
      "ory_level3\030^ \001(\tH\'\210\001\001\022,\n\037product_bidding" +
      "_category_level4\030_ \001(\tH(\210\001\001\022,\n\037product_b" +
      "idding_category_level5\030` \001(\tH)\210\001\001\022\032\n\rpro" +
      "duct_brand\030a \001(\tH*\210\001\001\022Z\n\017product_channel" +
      "\030\036 \001(\0162A.google.ads.googleads.v14.enums." +
      "ProductChannelEnum.ProductChannel\022|\n\033pro" +
      "duct_channel_exclusivity\030\037 \001(\0162W.google." +
      "ads.googleads.v14.enums.ProductChannelEx" +
      "clusivityEnum.ProductChannelExclusivity\022" +
      "`\n\021product_condition\030  \001(\0162E.google.ads." +
      "googleads.v14.enums.ProductConditionEnum" +
      ".ProductCondition\022\034\n\017product_country\030b \001" +
      "(\tH+\210\001\001\022&\n\031product_custom_attribute0\030c \001" +
      "(\tH,\210\001\001\022&\n\031product_custom_attribute1\030d \001" +
      "(\tH-\210\001\001\022&\n\031product_custom_attribute2\030e \001" +
      "(\tH.\210\001\001\022&\n\031product_custom_attribute3\030f \001" +
      "(\tH/\210\001\001\022&\n\031product_custom_attribute4\030g \001" +
      "(\tH0\210\001\001\022 \n\022product_feed_label\030\223\001 \001(\tH1\210\001" +
      "\001\022\034\n\017product_item_id\030h \001(\tH2\210\001\001\022\035\n\020produ" +
      "ct_language\030i \001(\tH3\210\001\001\022!\n\023product_mercha" +
      "nt_id\030\205\001 \001(\003H4\210\001\001\022\035\n\020product_store_id\030j " +
      "\001(\tH5\210\001\001\022\032\n\rproduct_title\030k \001(\tH6\210\001\001\022\034\n\017" +
      "product_type_l1\030l \001(\tH7\210\001\001\022\034\n\017product_ty" +
      "pe_l2\030m \001(\tH8\210\001\001\022\034\n\017product_type_l3\030n \001(" +
      "\tH9\210\001\001\022\034\n\017product_type_l4\030o \001(\tH:\210\001\001\022\034\n\017" +
      "product_type_l5\030p \001(\tH;\210\001\001\022\025\n\007quarter\030\200\001" +
      " \001(\tH<\210\001\001\022g\n\023recommendation_type\030\214\001 \001(\0162" +
      "I.google.ads.googleads.v14.enums.Recomme" +
      "ndationTypeEnum.RecommendationType\022\204\001\n\037s" +
      "earch_engine_results_page_type\030F \001(\0162[.g" +
      "oogle.ads.googleads.v14.enums.SearchEngi" +
      "neResultsPageTypeEnum.SearchEngineResult" +
      "sPageType\022 \n\022search_subcategory\030\233\001 \001(\tH=" +
      "\210\001\001\022\031\n\013search_term\030\234\001 \001(\tH>\210\001\001\022k\n\026search" +
      "_term_match_type\030\026 \001(\0162K.google.ads.goog" +
      "leads.v14.enums.SearchTermMatchTypeEnum." +
      "SearchTermMatchType\022;\n\004slot\030\027 \001(\0162-.goog" +
      "le.ads.googleads.v14.enums.SlotEnum.Slot" +
      "\022\235\001\n\'conversion_value_rule_primary_dimen" +
      "sion\030\212\001 \001(\0162k.google.ads.googleads.v14.e" +
      "nums.ConversionValueRulePrimaryDimension" +
      "Enum.ConversionValueRulePrimaryDimension" +
      "\022\025\n\007webpage\030\201\001 \001(\tH?\210\001\001\022\022\n\004week\030\202\001 \001(\tH@" +
      "\210\001\001\022\022\n\004year\030\203\001 \001(\005HA\210\001\001\022,\n\036sk_ad_network" +
      "_conversion_value\030\211\001 \001(\003HB\210\001\001\022m\n\027sk_ad_n" +
      "etwork_user_type\030\215\001 \001(\0162K.google.ads.goo" +
      "gleads.v14.enums.SkAdNetworkUserTypeEnum" +
      ".SkAdNetworkUserType\022w\n\033sk_ad_network_ad" +
      "_event_type\030\216\001 \001(\0162Q.google.ads.googlead" +
      "s.v14.enums.SkAdNetworkAdEventTypeEnum.S" +
      "kAdNetworkAdEventType\022]\n\030sk_ad_network_s" +
      "ource_app\030\217\001 \001(\01325.google.ads.googleads." +
      "v14.common.SkAdNetworkSourceAppHC\210\001\001\022\210\001\n" +
      " sk_ad_network_attribution_credit\030\220\001 \001(\016" +
      "2].google.ads.googleads.v14.enums.SkAdNe" +
      "tworkAttributionCreditEnum.SkAdNetworkAt" +
      "tributionCredit\022_\n\030asset_interaction_tar" +
      "get\030\213\001 \001(\01327.google.ads.googleads.v14.co" +
      "mmon.AssetInteractionTargetHD\210\001\001\022\250\001\n\036new" +
      "_versus_returning_customers\030\240\001 \001(\0162\177.goo" +
      "gle.ads.googleads.v14.enums.ConvertingUs" +
      "erPriorEngagementTypeAndLtvBucketEnum.Co" +
      "nvertingUserPriorEngagementTypeAndLtvBuc" +
      "ketB\026\n\024_activity_account_idB\022\n\020_activity" +
      "_ratingB\027\n\025_external_activity_idB\013\n\t_ad_" +
      "groupB\016\n\014_asset_groupB\031\n\027_auction_insigh" +
      "t_domainB\013\n\t_campaignB\024\n\022_conversion_act" +
      "ionB\031\n\027_conversion_action_nameB\030\n\026_conve" +
      "rsion_adjustmentB\007\n\005_dateB\025\n\023_geo_target" +
      "_airportB\024\n\022_geo_target_cantonB\022\n\020_geo_t" +
      "arget_cityB\025\n\023_geo_target_countryB\024\n\022_ge" +
      "o_target_countyB\026\n\024_geo_target_districtB" +
      "\023\n\021_geo_target_metroB$\n\"_geo_target_most" +
      "_specific_locationB\031\n\027_geo_target_postal" +
      "_codeB\026\n\024_geo_target_provinceB\024\n\022_geo_ta" +
      "rget_regionB\023\n\021_geo_target_stateB\034\n\032_hot" +
      "el_booking_window_daysB\022\n\020_hotel_center_" +
      "idB\026\n\024_hotel_check_in_dateB\r\n\013_hotel_cit" +
      "yB\016\n\014_hotel_classB\020\n\016_hotel_countryB\027\n\025_" +
      "hotel_length_of_stayB\025\n\023_hotel_rate_rule" +
      "_idB\016\n\014_hotel_stateB\007\n\005_hourB \n\036_interac" +
      "tion_on_this_extensionB\010\n\006_monthB\023\n\021_par" +
      "tner_hotel_idB\030\n\026_product_aggregator_idB" +
      "\"\n _product_bidding_category_level1B\"\n _" +
      "product_bidding_category_level2B\"\n _prod" +
      "uct_bidding_category_level3B\"\n _product_" +
      "bidding_category_level4B\"\n _product_bidd" +
      "ing_category_level5B\020\n\016_product_brandB\022\n" +
      "\020_product_countryB\034\n\032_product_custom_att" +
      "ribute0B\034\n\032_product_custom_attribute1B\034\n" +
      "\032_product_custom_attribute2B\034\n\032_product_" +
      "custom_attribute3B\034\n\032_product_custom_att" +
      "ribute4B\025\n\023_product_feed_labelB\022\n\020_produ" +
      "ct_item_idB\023\n\021_product_languageB\026\n\024_prod" +
      "uct_merchant_idB\023\n\021_product_store_idB\020\n\016" +
      "_product_titleB\022\n\020_product_type_l1B\022\n\020_p" +
      "roduct_type_l2B\022\n\020_product_type_l3B\022\n\020_p" +
      "roduct_type_l4B\022\n\020_product_type_l5B\n\n\010_q" +
      "uarterB\025\n\023_search_subcategoryB\016\n\014_search" +
      "_termB\n\n\010_webpageB\007\n\005_weekB\007\n\005_yearB!\n\037_" +
      "sk_ad_network_conversion_valueB\033\n\031_sk_ad" +
      "_network_source_appB\033\n\031_asset_interactio" +
      "n_target\"}\n\007Keyword\022\037\n\022ad_group_criterio" +
      "n\030\003 \001(\tH\000\210\001\001\022:\n\004info\030\002 \001(\0132,.google.ads." +
      "googleads.v14.common.KeywordInfoB\025\n\023_ad_" +
      "group_criterion\"\272\001\n\037BudgetCampaignAssoci" +
      "ationStatus\022\025\n\010campaign\030\001 \001(\tH\000\210\001\001\022s\n\006st" +
      "atus\030\002 \001(\0162c.google.ads.googleads.v14.en" +
      "ums.BudgetCampaignAssociationStatusEnum." +
      "BudgetCampaignAssociationStatusB\013\n\t_camp" +
      "aign\"J\n\026AssetInteractionTarget\022\r\n\005asset\030" +
      "\001 \001(\t\022!\n\031interaction_on_this_asset\030\002 \001(\010" +
      "\"`\n\024SkAdNetworkSourceApp\022(\n\033sk_ad_networ" +
      "k_source_app_id\030\001 \001(\tH\000\210\001\001B\036\n\034_sk_ad_net" +
      "work_source_app_idB\355\001\n#com.google.ads.go" +
      "ogleads.v14.commonB\rSegmentsProtoP\001ZEgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v14/common;common\242\002\003GAA\252\002\037Googl" +
      "e.Ads.GoogleAds.V14.Common\312\002\037Google\\Ads\\" +
      "GoogleAds\\V14\\Common\352\002#Google::Ads::Goog" +
      "leAds::V14::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AdDestinationTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AdNetworkTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ClickTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ConversionAttributionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ConversionLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ConversionValueRulePrimaryDimensionProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ConvertingUserPriorEngagementTypeAndLtvBucketProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.DayOfWeekProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ExternalConversionSourceProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.HotelDateSelectionTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.HotelPriceBucketProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.HotelRateTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ProductChannelProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ProductChannelExclusivityProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ProductConditionProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.RecommendationTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.SearchEngineResultsPageTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.SearchTermMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.SkAdNetworkAdEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.SkAdNetworkAttributionCreditProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.SkAdNetworkUserTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.SlotProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_common_Segments_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_common_Segments_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_Segments_descriptor,
        new java.lang.String[] { "ActivityAccountId", "ActivityRating", "ExternalActivityId", "AdDestinationType", "AdNetworkType", "AdGroup", "AssetGroup", "AuctionInsightDomain", "BudgetCampaignAssociationStatus", "Campaign", "ClickType", "ConversionAction", "ConversionActionCategory", "ConversionActionName", "ConversionAdjustment", "ConversionAttributionEventType", "ConversionLagBucket", "ConversionOrAdjustmentLagBucket", "Date", "DayOfWeek", "Device", "ExternalConversionSource", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCheckInDayOfWeek", "HotelCity", "HotelClass", "HotelCountry", "HotelDateSelectionType", "HotelLengthOfStay", "HotelRateRuleId", "HotelRateType", "HotelPriceBucket", "HotelState", "Hour", "InteractionOnThisExtension", "Keyword", "Month", "MonthOfYear", "PartnerHotelId", "PlaceholderType", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductChannel", "ProductChannelExclusivity", "ProductCondition", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductFeedLabel", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "RecommendationType", "SearchEngineResultsPageType", "SearchSubcategory", "SearchTerm", "SearchTermMatchType", "Slot", "ConversionValueRulePrimaryDimension", "Webpage", "Week", "Year", "SkAdNetworkConversionValue", "SkAdNetworkUserType", "SkAdNetworkAdEventType", "SkAdNetworkSourceApp", "SkAdNetworkAttributionCredit", "AssetInteractionTarget", "NewVersusReturningCustomers", "ActivityAccountId", "ActivityRating", "ExternalActivityId", "AdGroup", "AssetGroup", "AuctionInsightDomain", "Campaign", "ConversionAction", "ConversionActionName", "ConversionAdjustment", "Date", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCity", "HotelClass", "HotelCountry", "HotelLengthOfStay", "HotelRateRuleId", "HotelState", "Hour", "InteractionOnThisExtension", "Month", "PartnerHotelId", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductFeedLabel", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "SearchSubcategory", "SearchTerm", "Webpage", "Week", "Year", "SkAdNetworkConversionValue", "SkAdNetworkSourceApp", "AssetInteractionTarget", });
    internal_static_google_ads_googleads_v14_common_Keyword_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_common_Keyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_Keyword_descriptor,
        new java.lang.String[] { "AdGroupCriterion", "Info", "AdGroupCriterion", });
    internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_descriptor,
        new java.lang.String[] { "Campaign", "Status", "Campaign", });
    internal_static_google_ads_googleads_v14_common_AssetInteractionTarget_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_common_AssetInteractionTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_AssetInteractionTarget_descriptor,
        new java.lang.String[] { "Asset", "InteractionOnThisAsset", });
    internal_static_google_ads_googleads_v14_common_SkAdNetworkSourceApp_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v14_common_SkAdNetworkSourceApp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_SkAdNetworkSourceApp_descriptor,
        new java.lang.String[] { "SkAdNetworkSourceAppId", "SkAdNetworkSourceAppId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AdDestinationTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AdNetworkTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ClickTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ConversionAttributionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ConversionLagBucketProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ConversionValueRulePrimaryDimensionProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ConvertingUserPriorEngagementTypeAndLtvBucketProto.getDescriptor();
    com.google.ads.googleads.v14.enums.DayOfWeekProto.getDescriptor();
    com.google.ads.googleads.v14.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ExternalConversionSourceProto.getDescriptor();
    com.google.ads.googleads.v14.enums.HotelDateSelectionTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.HotelPriceBucketProto.getDescriptor();
    com.google.ads.googleads.v14.enums.HotelRateTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v14.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ProductChannelProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ProductChannelExclusivityProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ProductConditionProto.getDescriptor();
    com.google.ads.googleads.v14.enums.RecommendationTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.SearchEngineResultsPageTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.SearchTermMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.SkAdNetworkAdEventTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.SkAdNetworkAttributionCreditProto.getDescriptor();
    com.google.ads.googleads.v14.enums.SkAdNetworkUserTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.SlotProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
