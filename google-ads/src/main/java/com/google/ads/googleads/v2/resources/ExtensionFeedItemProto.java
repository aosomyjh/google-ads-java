// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/extension_feed_item.proto

package com.google.ads.googleads.v2.resources;

public final class ExtensionFeedItemProto {
  private ExtensionFeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_ExtensionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_ExtensionFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v2/resources/exte" +
      "nsion_feed_item.proto\022!google.ads.google" +
      "ads.v2.resources\032-google/ads/googleads/v" +
      "2/common/criteria.proto\032/google/ads/goog" +
      "leads/v2/common/extensions.proto\0322google" +
      "/ads/googleads/v2/enums/extension_type.p" +
      "roto\0324google/ads/googleads/v2/enums/feed" +
      "_item_status.proto\032;google/ads/googleads" +
      "/v2/enums/feed_item_target_device.proto\032" +
      "\036google/protobuf/wrappers.proto\032\034google/" +
      "api/annotations.proto\"\307\r\n\021ExtensionFeedI" +
      "tem\022\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030\030 \001(\0132\033" +
      ".google.protobuf.Int64Value\022V\n\016extension" +
      "_type\030\r \001(\0162>.google.ads.googleads.v2.en" +
      "ums.ExtensionTypeEnum.ExtensionType\0225\n\017s" +
      "tart_date_time\030\005 \001(\0132\034.google.protobuf.S" +
      "tringValue\0223\n\rend_date_time\030\006 \001(\0132\034.goog" +
      "le.protobuf.StringValue\022D\n\014ad_schedules\030" +
      "\020 \003(\0132..google.ads.googleads.v2.common.A" +
      "dScheduleInfo\022\\\n\006device\030\021 \001(\0162L.google.a" +
      "ds.googleads.v2.enums.FeedItemTargetDevi" +
      "ceEnum.FeedItemTargetDevice\022B\n\034targeted_" +
      "geo_target_constant\030\024 \001(\0132\034.google.proto" +
      "buf.StringValue\022E\n\020targeted_keyword\030\026 \001(" +
      "\0132+.google.ads.googleads.v2.common.Keywo" +
      "rdInfo\022P\n\006status\030\004 \001(\0162@.google.ads.goog" +
      "leads.v2.enums.FeedItemStatusEnum.FeedIt" +
      "emStatus\022N\n\022sitelink_feed_item\030\002 \001(\01320.g" +
      "oogle.ads.googleads.v2.common.SitelinkFe" +
      "edItemH\000\022a\n\034structured_snippet_feed_item" +
      "\030\003 \001(\01329.google.ads.googleads.v2.common." +
      "StructuredSnippetFeedItemH\000\022D\n\rapp_feed_" +
      "item\030\007 \001(\0132+.google.ads.googleads.v2.com" +
      "mon.AppFeedItemH\000\022F\n\016call_feed_item\030\010 \001(" +
      "\0132,.google.ads.googleads.v2.common.CallF" +
      "eedItemH\000\022L\n\021callout_feed_item\030\t \001(\0132/.g" +
      "oogle.ads.googleads.v2.common.CalloutFee" +
      "dItemH\000\022U\n\026text_message_feed_item\030\n \001(\0132" +
      "3.google.ads.googleads.v2.common.TextMes" +
      "sageFeedItemH\000\022H\n\017price_feed_item\030\013 \001(\0132" +
      "-.google.ads.googleads.v2.common.PriceFe" +
      "edItemH\000\022P\n\023promotion_feed_item\030\014 \001(\01321." +
      "google.ads.googleads.v2.common.Promotion" +
      "FeedItemH\000\022N\n\022location_feed_item\030\016 \001(\01320" +
      ".google.ads.googleads.v2.common.Location" +
      "FeedItemH\000\022a\n\034affiliate_location_feed_it" +
      "em\030\017 \001(\01329.google.ads.googleads.v2.commo" +
      "n.AffiliateLocationFeedItemH\000\022W\n\027hotel_c" +
      "allout_feed_item\030\027 \001(\01324.google.ads.goog" +
      "leads.v2.common.HotelCalloutFeedItemH\000\0229" +
      "\n\021targeted_campaign\030\022 \001(\0132\034.google.proto" +
      "buf.StringValueH\001\0229\n\021targeted_ad_group\030\023" +
      " \001(\0132\034.google.protobuf.StringValueH\001B\013\n\t" +
      "extensionB\034\n\032serving_resource_targetingB" +
      "\203\002\n%com.google.ads.googleads.v2.resource" +
      "sB\026ExtensionFeedItemProtoP\001ZJgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v2/resources;resources\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V2.Resources\312\002!Google\\Ads\\G" +
      "oogleAds\\V2\\Resources\352\002%Google::Ads::Goo" +
      "gleAds::V2::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v2.common.ExtensionsProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.ExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.FeedItemTargetDeviceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_ExtensionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_ExtensionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_ExtensionFeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ExtensionType", "StartDateTime", "EndDateTime", "AdSchedules", "Device", "TargetedGeoTargetConstant", "TargetedKeyword", "Status", "SitelinkFeedItem", "StructuredSnippetFeedItem", "AppFeedItem", "CallFeedItem", "CalloutFeedItem", "TextMessageFeedItem", "PriceFeedItem", "PromotionFeedItem", "LocationFeedItem", "AffiliateLocationFeedItem", "HotelCalloutFeedItem", "TargetedCampaign", "TargetedAdGroup", "Extension", "ServingResourceTargeting", });
    com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v2.common.ExtensionsProto.getDescriptor();
    com.google.ads.googleads.v2.enums.ExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.FeedItemTargetDeviceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}