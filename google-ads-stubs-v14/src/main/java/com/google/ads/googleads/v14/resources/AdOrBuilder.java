// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/ad.proto

package com.google.ads.googleads.v14.resources;

public interface AdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.Ad)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad.
   * Ad resource names have the form:
   *
   * `customers/{customer_id}/ads/{ad_id}`
   * </pre>
   *
   * <code>string resource_name = 37 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad.
   * Ad resource names have the form:
   *
   * `customers/{customer_id}/ads/{ad_id}`
   * </pre>
   *
   * <code>string resource_name = 37 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the ad.
   * </pre>
   *
   * <code>optional int64 id = 40 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the ad.
   * </pre>
   *
   * <code>optional int64 id = 40 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated string final_urls = 41;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated string final_urls = 41;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated string final_urls = 41;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated string final_urls = 41;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.FinalAppUrl final_app_urls = 35;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.FinalAppUrl> 
      getFinalAppUrlsList();
  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.FinalAppUrl final_app_urls = 35;</code>
   */
  com.google.ads.googleads.v14.common.FinalAppUrl getFinalAppUrls(int index);
  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.FinalAppUrl final_app_urls = 35;</code>
   */
  int getFinalAppUrlsCount();
  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.FinalAppUrl final_app_urls = 35;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.FinalAppUrlOrBuilder> 
      getFinalAppUrlsOrBuilderList();
  /**
   * <pre>
   * A list of final app URLs that will be used on mobile if the user has the
   * specific app installed.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.FinalAppUrl final_app_urls = 35;</code>
   */
  com.google.ads.googleads.v14.common.FinalAppUrlOrBuilder getFinalAppUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 42;</code>
   * @return A list containing the finalMobileUrls.
   */
  java.util.List<java.lang.String>
      getFinalMobileUrlsList();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 42;</code>
   * @return The count of finalMobileUrls.
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 42;</code>
   * @param index The index of the element to return.
   * @return The finalMobileUrls at the given index.
   */
  java.lang.String getFinalMobileUrls(int index);
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 42;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalMobileUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlsBytes(int index);

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 43;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 43;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 43;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * The suffix to use when constructing a final URL.
   * </pre>
   *
   * <code>optional string final_url_suffix = 44;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * The suffix to use when constructing a final URL.
   * </pre>
   *
   * <code>optional string final_url_suffix = 44;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * The suffix to use when constructing a final URL.
   * </pre>
   *
   * <code>optional string final_url_suffix = 44;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();

  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 10;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 10;</code>
   */
  com.google.ads.googleads.v14.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 10;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 10;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * For mutates, use url custom parameter operations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 10;</code>
   */
  com.google.ads.googleads.v14.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>optional string display_url = 45;</code>
   * @return Whether the displayUrl field is set.
   */
  boolean hasDisplayUrl();
  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>optional string display_url = 45;</code>
   * @return The displayUrl.
   */
  java.lang.String getDisplayUrl();
  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>optional string display_url = 45;</code>
   * @return The bytes for displayUrl.
   */
  com.google.protobuf.ByteString
      getDisplayUrlBytes();

  /**
   * <pre>
   * Output only. The type of ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.AdTypeEnum.AdType type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.AdTypeEnum.AdType type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v14.enums.AdTypeEnum.AdType getType();

  /**
   * <pre>
   * Output only. Indicates if this ad was automatically added by Google Ads and
   * not by a user. For example, this could happen when ads are automatically
   * created as suggestions for new ads based on knowledge of how existing ads
   * are performing.
   * </pre>
   *
   * <code>optional bool added_by_google_ads = 46 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the addedByGoogleAds field is set.
   */
  boolean hasAddedByGoogleAds();
  /**
   * <pre>
   * Output only. Indicates if this ad was automatically added by Google Ads and
   * not by a user. For example, this could happen when ads are automatically
   * created as suggestions for new ads based on knowledge of how existing ads
   * are performing.
   * </pre>
   *
   * <code>optional bool added_by_google_ads = 46 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The addedByGoogleAds.
   */
  boolean getAddedByGoogleAds();

  /**
   * <pre>
   * The device preference for the ad. You can only specify a preference for
   * mobile devices. When this preference is set the ad will be preferred over
   * other ads when being displayed on a mobile device. The ad can still be
   * displayed on other device types, for example, if no other ads are
   * available. If unspecified (no device preference), all devices are targeted.
   * This is only supported by some ad types.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.DeviceEnum.Device device_preference = 20;</code>
   * @return The enum numeric value on the wire for devicePreference.
   */
  int getDevicePreferenceValue();
  /**
   * <pre>
   * The device preference for the ad. You can only specify a preference for
   * mobile devices. When this preference is set the ad will be preferred over
   * other ads when being displayed on a mobile device. The ad can still be
   * displayed on other device types, for example, if no other ads are
   * available. If unspecified (no device preference), all devices are targeted.
   * This is only supported by some ad types.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.DeviceEnum.Device device_preference = 20;</code>
   * @return The devicePreference.
   */
  com.google.ads.googleads.v14.enums.DeviceEnum.Device getDevicePreference();

  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.UrlCollection url_collections = 26;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.UrlCollection> 
      getUrlCollectionsList();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.UrlCollection url_collections = 26;</code>
   */
  com.google.ads.googleads.v14.common.UrlCollection getUrlCollections(int index);
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.UrlCollection url_collections = 26;</code>
   */
  int getUrlCollectionsCount();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.UrlCollection url_collections = 26;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.UrlCollectionOrBuilder> 
      getUrlCollectionsOrBuilderList();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.UrlCollection url_collections = 26;</code>
   */
  com.google.ads.googleads.v14.common.UrlCollectionOrBuilder getUrlCollectionsOrBuilder(
      int index);

  /**
   * <pre>
   * Immutable. The name of the ad. This is only used to be able to identify the
   * ad. It does not need to be unique and does not affect the served ad. The
   * name field is currently only supported for DisplayUploadAd, ImageAd,
   * ShoppingComparisonListingAd and VideoAd.
   * </pre>
   *
   * <code>optional string name = 47 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Immutable. The name of the ad. This is only used to be able to identify the
   * ad. It does not need to be unique and does not affect the served ad. The
   * name field is currently only supported for DisplayUploadAd, ImageAd,
   * ShoppingComparisonListingAd and VideoAd.
   * </pre>
   *
   * <code>optional string name = 47 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The name of the ad. This is only used to be able to identify the
   * ad. It does not need to be unique and does not affect the served ad. The
   * name field is currently only supported for DisplayUploadAd, ImageAd,
   * ShoppingComparisonListingAd and VideoAd.
   * </pre>
   *
   * <code>optional string name = 47 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. If this ad is system managed, then this field will indicate
   * the source. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource system_managed_resource_source = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for systemManagedResourceSource.
   */
  int getSystemManagedResourceSourceValue();
  /**
   * <pre>
   * Output only. If this ad is system managed, then this field will indicate
   * the source. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource system_managed_resource_source = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The systemManagedResourceSource.
   */
  com.google.ads.googleads.v14.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource getSystemManagedResourceSource();

  /**
   * <pre>
   * Immutable. Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TextAdInfo text_ad = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the textAd field is set.
   */
  boolean hasTextAd();
  /**
   * <pre>
   * Immutable. Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TextAdInfo text_ad = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The textAd.
   */
  com.google.ads.googleads.v14.common.TextAdInfo getTextAd();
  /**
   * <pre>
   * Immutable. Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TextAdInfo text_ad = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.common.TextAdInfoOrBuilder getTextAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   * @return Whether the expandedTextAd field is set.
   */
  boolean hasExpandedTextAd();
  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   * @return The expandedTextAd.
   */
  com.google.ads.googleads.v14.common.ExpandedTextAdInfo getExpandedTextAd();
  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  com.google.ads.googleads.v14.common.ExpandedTextAdInfoOrBuilder getExpandedTextAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a call ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CallAdInfo call_ad = 49;</code>
   * @return Whether the callAd field is set.
   */
  boolean hasCallAd();
  /**
   * <pre>
   * Details pertaining to a call ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CallAdInfo call_ad = 49;</code>
   * @return The callAd.
   */
  com.google.ads.googleads.v14.common.CallAdInfo getCallAd();
  /**
   * <pre>
   * Details pertaining to a call ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CallAdInfo call_ad = 49;</code>
   */
  com.google.ads.googleads.v14.common.CallAdInfoOrBuilder getCallAdOrBuilder();

  /**
   * <pre>
   * Immutable. Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the expandedDynamicSearchAd field is set.
   */
  boolean hasExpandedDynamicSearchAd();
  /**
   * <pre>
   * Immutable. Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The expandedDynamicSearchAd.
   */
  com.google.ads.googleads.v14.common.ExpandedDynamicSearchAdInfo getExpandedDynamicSearchAd();
  /**
   * <pre>
   * Immutable. Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.common.ExpandedDynamicSearchAdInfoOrBuilder getExpandedDynamicSearchAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.HotelAdInfo hotel_ad = 15;</code>
   * @return Whether the hotelAd field is set.
   */
  boolean hasHotelAd();
  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.HotelAdInfo hotel_ad = 15;</code>
   * @return The hotelAd.
   */
  com.google.ads.googleads.v14.common.HotelAdInfo getHotelAd();
  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.HotelAdInfo hotel_ad = 15;</code>
   */
  com.google.ads.googleads.v14.common.HotelAdInfoOrBuilder getHotelAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   * @return Whether the shoppingSmartAd field is set.
   */
  boolean hasShoppingSmartAd();
  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   * @return The shoppingSmartAd.
   */
  com.google.ads.googleads.v14.common.ShoppingSmartAdInfo getShoppingSmartAd();
  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   */
  com.google.ads.googleads.v14.common.ShoppingSmartAdInfoOrBuilder getShoppingSmartAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   * @return Whether the shoppingProductAd field is set.
   */
  boolean hasShoppingProductAd();
  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   * @return The shoppingProductAd.
   */
  com.google.ads.googleads.v14.common.ShoppingProductAdInfo getShoppingProductAd();
  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   */
  com.google.ads.googleads.v14.common.ShoppingProductAdInfoOrBuilder getShoppingProductAdOrBuilder();

  /**
   * <pre>
   * Immutable. Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ImageAdInfo image_ad = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the imageAd field is set.
   */
  boolean hasImageAd();
  /**
   * <pre>
   * Immutable. Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ImageAdInfo image_ad = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The imageAd.
   */
  com.google.ads.googleads.v14.common.ImageAdInfo getImageAd();
  /**
   * <pre>
   * Immutable. Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ImageAdInfo image_ad = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.common.ImageAdInfoOrBuilder getImageAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.VideoAdInfo video_ad = 24;</code>
   * @return Whether the videoAd field is set.
   */
  boolean hasVideoAd();
  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.VideoAdInfo video_ad = 24;</code>
   * @return The videoAd.
   */
  com.google.ads.googleads.v14.common.VideoAdInfo getVideoAd();
  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.VideoAdInfo video_ad = 24;</code>
   */
  com.google.ads.googleads.v14.common.VideoAdInfoOrBuilder getVideoAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Video responsive ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.VideoResponsiveAdInfo video_responsive_ad = 39;</code>
   * @return Whether the videoResponsiveAd field is set.
   */
  boolean hasVideoResponsiveAd();
  /**
   * <pre>
   * Details pertaining to a Video responsive ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.VideoResponsiveAdInfo video_responsive_ad = 39;</code>
   * @return The videoResponsiveAd.
   */
  com.google.ads.googleads.v14.common.VideoResponsiveAdInfo getVideoResponsiveAd();
  /**
   * <pre>
   * Details pertaining to a Video responsive ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.VideoResponsiveAdInfo video_responsive_ad = 39;</code>
   */
  com.google.ads.googleads.v14.common.VideoResponsiveAdInfoOrBuilder getVideoResponsiveAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   * @return Whether the responsiveSearchAd field is set.
   */
  boolean hasResponsiveSearchAd();
  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   * @return The responsiveSearchAd.
   */
  com.google.ads.googleads.v14.common.ResponsiveSearchAdInfo getResponsiveSearchAd();
  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   */
  com.google.ads.googleads.v14.common.ResponsiveSearchAdInfoOrBuilder getResponsiveSearchAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   * @return Whether the legacyResponsiveDisplayAd field is set.
   */
  boolean hasLegacyResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   * @return The legacyResponsiveDisplayAd.
   */
  com.google.ads.googleads.v14.common.LegacyResponsiveDisplayAdInfo getLegacyResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   */
  com.google.ads.googleads.v14.common.LegacyResponsiveDisplayAdInfoOrBuilder getLegacyResponsiveDisplayAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an app ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppAdInfo app_ad = 29;</code>
   * @return Whether the appAd field is set.
   */
  boolean hasAppAd();
  /**
   * <pre>
   * Details pertaining to an app ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppAdInfo app_ad = 29;</code>
   * @return The appAd.
   */
  com.google.ads.googleads.v14.common.AppAdInfo getAppAd();
  /**
   * <pre>
   * Details pertaining to an app ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppAdInfo app_ad = 29;</code>
   */
  com.google.ads.googleads.v14.common.AppAdInfoOrBuilder getAppAdOrBuilder();

  /**
   * <pre>
   * Immutable. Details pertaining to a legacy app install ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LegacyAppInstallAdInfo legacy_app_install_ad = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the legacyAppInstallAd field is set.
   */
  boolean hasLegacyAppInstallAd();
  /**
   * <pre>
   * Immutable. Details pertaining to a legacy app install ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LegacyAppInstallAdInfo legacy_app_install_ad = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The legacyAppInstallAd.
   */
  com.google.ads.googleads.v14.common.LegacyAppInstallAdInfo getLegacyAppInstallAd();
  /**
   * <pre>
   * Immutable. Details pertaining to a legacy app install ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LegacyAppInstallAdInfo legacy_app_install_ad = 30 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.common.LegacyAppInstallAdInfoOrBuilder getLegacyAppInstallAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ResponsiveDisplayAdInfo responsive_display_ad = 31;</code>
   * @return Whether the responsiveDisplayAd field is set.
   */
  boolean hasResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ResponsiveDisplayAdInfo responsive_display_ad = 31;</code>
   * @return The responsiveDisplayAd.
   */
  com.google.ads.googleads.v14.common.ResponsiveDisplayAdInfo getResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ResponsiveDisplayAdInfo responsive_display_ad = 31;</code>
   */
  com.google.ads.googleads.v14.common.ResponsiveDisplayAdInfoOrBuilder getResponsiveDisplayAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a local ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LocalAdInfo local_ad = 32;</code>
   * @return Whether the localAd field is set.
   */
  boolean hasLocalAd();
  /**
   * <pre>
   * Details pertaining to a local ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LocalAdInfo local_ad = 32;</code>
   * @return The localAd.
   */
  com.google.ads.googleads.v14.common.LocalAdInfo getLocalAd();
  /**
   * <pre>
   * Details pertaining to a local ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.LocalAdInfo local_ad = 32;</code>
   */
  com.google.ads.googleads.v14.common.LocalAdInfoOrBuilder getLocalAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a display upload ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DisplayUploadAdInfo display_upload_ad = 33;</code>
   * @return Whether the displayUploadAd field is set.
   */
  boolean hasDisplayUploadAd();
  /**
   * <pre>
   * Details pertaining to a display upload ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DisplayUploadAdInfo display_upload_ad = 33;</code>
   * @return The displayUploadAd.
   */
  com.google.ads.googleads.v14.common.DisplayUploadAdInfo getDisplayUploadAd();
  /**
   * <pre>
   * Details pertaining to a display upload ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DisplayUploadAdInfo display_upload_ad = 33;</code>
   */
  com.google.ads.googleads.v14.common.DisplayUploadAdInfoOrBuilder getDisplayUploadAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an app engagement ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppEngagementAdInfo app_engagement_ad = 34;</code>
   * @return Whether the appEngagementAd field is set.
   */
  boolean hasAppEngagementAd();
  /**
   * <pre>
   * Details pertaining to an app engagement ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppEngagementAdInfo app_engagement_ad = 34;</code>
   * @return The appEngagementAd.
   */
  com.google.ads.googleads.v14.common.AppEngagementAdInfo getAppEngagementAd();
  /**
   * <pre>
   * Details pertaining to an app engagement ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppEngagementAdInfo app_engagement_ad = 34;</code>
   */
  com.google.ads.googleads.v14.common.AppEngagementAdInfoOrBuilder getAppEngagementAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Shopping Comparison Listing ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingComparisonListingAdInfo shopping_comparison_listing_ad = 36;</code>
   * @return Whether the shoppingComparisonListingAd field is set.
   */
  boolean hasShoppingComparisonListingAd();
  /**
   * <pre>
   * Details pertaining to a Shopping Comparison Listing ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingComparisonListingAdInfo shopping_comparison_listing_ad = 36;</code>
   * @return The shoppingComparisonListingAd.
   */
  com.google.ads.googleads.v14.common.ShoppingComparisonListingAdInfo getShoppingComparisonListingAd();
  /**
   * <pre>
   * Details pertaining to a Shopping Comparison Listing ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ShoppingComparisonListingAdInfo shopping_comparison_listing_ad = 36;</code>
   */
  com.google.ads.googleads.v14.common.ShoppingComparisonListingAdInfoOrBuilder getShoppingComparisonListingAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Smart campaign ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.SmartCampaignAdInfo smart_campaign_ad = 48;</code>
   * @return Whether the smartCampaignAd field is set.
   */
  boolean hasSmartCampaignAd();
  /**
   * <pre>
   * Details pertaining to a Smart campaign ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.SmartCampaignAdInfo smart_campaign_ad = 48;</code>
   * @return The smartCampaignAd.
   */
  com.google.ads.googleads.v14.common.SmartCampaignAdInfo getSmartCampaignAd();
  /**
   * <pre>
   * Details pertaining to a Smart campaign ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.SmartCampaignAdInfo smart_campaign_ad = 48;</code>
   */
  com.google.ads.googleads.v14.common.SmartCampaignAdInfoOrBuilder getSmartCampaignAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an app pre-registration ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppPreRegistrationAdInfo app_pre_registration_ad = 50;</code>
   * @return Whether the appPreRegistrationAd field is set.
   */
  boolean hasAppPreRegistrationAd();
  /**
   * <pre>
   * Details pertaining to an app pre-registration ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppPreRegistrationAdInfo app_pre_registration_ad = 50;</code>
   * @return The appPreRegistrationAd.
   */
  com.google.ads.googleads.v14.common.AppPreRegistrationAdInfo getAppPreRegistrationAd();
  /**
   * <pre>
   * Details pertaining to an app pre-registration ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AppPreRegistrationAdInfo app_pre_registration_ad = 50;</code>
   */
  com.google.ads.googleads.v14.common.AppPreRegistrationAdInfoOrBuilder getAppPreRegistrationAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a discovery multi asset ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryMultiAssetAdInfo discovery_multi_asset_ad = 51;</code>
   * @return Whether the discoveryMultiAssetAd field is set.
   */
  boolean hasDiscoveryMultiAssetAd();
  /**
   * <pre>
   * Details pertaining to a discovery multi asset ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryMultiAssetAdInfo discovery_multi_asset_ad = 51;</code>
   * @return The discoveryMultiAssetAd.
   */
  com.google.ads.googleads.v14.common.DiscoveryMultiAssetAdInfo getDiscoveryMultiAssetAd();
  /**
   * <pre>
   * Details pertaining to a discovery multi asset ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryMultiAssetAdInfo discovery_multi_asset_ad = 51;</code>
   */
  com.google.ads.googleads.v14.common.DiscoveryMultiAssetAdInfoOrBuilder getDiscoveryMultiAssetAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a discovery carousel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryCarouselAdInfo discovery_carousel_ad = 52;</code>
   * @return Whether the discoveryCarouselAd field is set.
   */
  boolean hasDiscoveryCarouselAd();
  /**
   * <pre>
   * Details pertaining to a discovery carousel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryCarouselAdInfo discovery_carousel_ad = 52;</code>
   * @return The discoveryCarouselAd.
   */
  com.google.ads.googleads.v14.common.DiscoveryCarouselAdInfo getDiscoveryCarouselAd();
  /**
   * <pre>
   * Details pertaining to a discovery carousel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryCarouselAdInfo discovery_carousel_ad = 52;</code>
   */
  com.google.ads.googleads.v14.common.DiscoveryCarouselAdInfoOrBuilder getDiscoveryCarouselAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a discovery video responsive ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryVideoResponsiveAdInfo discovery_video_responsive_ad = 60;</code>
   * @return Whether the discoveryVideoResponsiveAd field is set.
   */
  boolean hasDiscoveryVideoResponsiveAd();
  /**
   * <pre>
   * Details pertaining to a discovery video responsive ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryVideoResponsiveAdInfo discovery_video_responsive_ad = 60;</code>
   * @return The discoveryVideoResponsiveAd.
   */
  com.google.ads.googleads.v14.common.DiscoveryVideoResponsiveAdInfo getDiscoveryVideoResponsiveAd();
  /**
   * <pre>
   * Details pertaining to a discovery video responsive ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.DiscoveryVideoResponsiveAdInfo discovery_video_responsive_ad = 60;</code>
   */
  com.google.ads.googleads.v14.common.DiscoveryVideoResponsiveAdInfoOrBuilder getDiscoveryVideoResponsiveAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a travel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TravelAdInfo travel_ad = 54;</code>
   * @return Whether the travelAd field is set.
   */
  boolean hasTravelAd();
  /**
   * <pre>
   * Details pertaining to a travel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TravelAdInfo travel_ad = 54;</code>
   * @return The travelAd.
   */
  com.google.ads.googleads.v14.common.TravelAdInfo getTravelAd();
  /**
   * <pre>
   * Details pertaining to a travel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.TravelAdInfo travel_ad = 54;</code>
   */
  com.google.ads.googleads.v14.common.TravelAdInfoOrBuilder getTravelAdOrBuilder();

  com.google.ads.googleads.v14.resources.Ad.AdDataCase getAdDataCase();
}
