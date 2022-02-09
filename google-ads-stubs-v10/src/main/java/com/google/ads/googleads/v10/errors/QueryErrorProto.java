// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/query_error.proto

package com.google.ads.googleads.v10.errors;

public final class QueryErrorProto {
  private QueryErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_QueryErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_QueryErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v10/errors/query_" +
      "error.proto\022\037google.ads.googleads.v10.er" +
      "rors\032\034google/api/annotations.proto\"\223\016\n\016Q" +
      "ueryErrorEnum\"\200\016\n\nQueryError\022\017\n\013UNSPECIF" +
      "IED\020\000\022\013\n\007UNKNOWN\020\001\022\017\n\013QUERY_ERROR\0202\022\025\n\021B" +
      "AD_ENUM_CONSTANT\020\022\022\027\n\023BAD_ESCAPE_SEQUENC" +
      "E\020\007\022\022\n\016BAD_FIELD_NAME\020\014\022\023\n\017BAD_LIMIT_VAL" +
      "UE\020\017\022\016\n\nBAD_NUMBER\020\005\022\020\n\014BAD_OPERATOR\020\003\022\026" +
      "\n\022BAD_PARAMETER_NAME\020=\022\027\n\023BAD_PARAMETER_" +
      "VALUE\020>\022$\n BAD_RESOURCE_TYPE_IN_FROM_CLA" +
      "USE\020-\022\016\n\nBAD_SYMBOL\020\002\022\r\n\tBAD_VALUE\020\004\022\027\n\023" +
      "DATE_RANGE_TOO_WIDE\020$\022\031\n\025DATE_RANGE_TOO_" +
      "NARROW\020<\022\020\n\014EXPECTED_AND\020\036\022\017\n\013EXPECTED_B" +
      "Y\020\016\022-\n)EXPECTED_DIMENSION_FIELD_IN_SELEC" +
      "T_CLAUSE\020%\022\"\n\036EXPECTED_FILTERS_ON_DATE_R" +
      "ANGE\0207\022\021\n\rEXPECTED_FROM\020,\022\021\n\rEXPECTED_LI" +
      "ST\020)\022.\n*EXPECTED_REFERENCED_FIELD_IN_SEL" +
      "ECT_CLAUSE\020\020\022\023\n\017EXPECTED_SELECT\020\r\022\031\n\025EXP" +
      "ECTED_SINGLE_VALUE\020*\022(\n$EXPECTED_VALUE_W" +
      "ITH_BETWEEN_OPERATOR\020\035\022\027\n\023INVALID_DATE_F" +
      "ORMAT\020&\022\036\n\032MISALIGNED_DATE_FOR_FILTER\020@\022" +
      "\030\n\024INVALID_STRING_VALUE\0209\022\'\n#INVALID_VAL" +
      "UE_WITH_BETWEEN_OPERATOR\020\032\022&\n\"INVALID_VA" +
      "LUE_WITH_DURING_OPERATOR\020\026\022$\n INVALID_VA" +
      "LUE_WITH_LIKE_OPERATOR\0208\022\033\n\027OPERATOR_FIE" +
      "LD_MISMATCH\020#\022&\n\"PROHIBITED_EMPTY_LIST_I" +
      "N_CONDITION\020\034\022\034\n\030PROHIBITED_ENUM_CONSTAN" +
      "T\0206\0221\n-PROHIBITED_FIELD_COMBINATION_IN_S" +
      "ELECT_CLAUSE\020\037\022\'\n#PROHIBITED_FIELD_IN_OR" +
      "DER_BY_CLAUSE\020(\022%\n!PROHIBITED_FIELD_IN_S" +
      "ELECT_CLAUSE\020\027\022$\n PROHIBITED_FIELD_IN_WH" +
      "ERE_CLAUSE\020\030\022+\n\'PROHIBITED_RESOURCE_TYPE" +
      "_IN_FROM_CLAUSE\020+\022-\n)PROHIBITED_RESOURCE" +
      "_TYPE_IN_SELECT_CLAUSE\0200\022,\n(PROHIBITED_R" +
      "ESOURCE_TYPE_IN_WHERE_CLAUSE\020:\022/\n+PROHIB" +
      "ITED_METRIC_IN_SELECT_OR_WHERE_CLAUSE\0201\022" +
      "0\n,PROHIBITED_SEGMENT_IN_SELECT_OR_WHERE" +
      "_CLAUSE\0203\022<\n8PROHIBITED_SEGMENT_WITH_MET" +
      "RIC_IN_SELECT_OR_WHERE_CLAUSE\0205\022\027\n\023LIMIT" +
      "_VALUE_TOO_LOW\020\031\022 \n\034PROHIBITED_NEWLINE_I" +
      "N_STRING\020\010\022(\n$PROHIBITED_VALUE_COMBINATI" +
      "ON_IN_LIST\020\n\0226\n2PROHIBITED_VALUE_COMBINA" +
      "TION_WITH_BETWEEN_OPERATOR\020\025\022\031\n\025STRING_N" +
      "OT_TERMINATED\020\006\022\025\n\021TOO_MANY_SEGMENTS\020\"\022\033" +
      "\n\027UNEXPECTED_END_OF_QUERY\020\t\022\032\n\026UNEXPECTE" +
      "D_FROM_CLAUSE\020/\022\026\n\022UNRECOGNIZED_FIELD\020 \022" +
      "\024\n\020UNEXPECTED_INPUT\020\013\022!\n\035REQUESTED_METRI" +
      "CS_FOR_MANAGER\020;\022\036\n\032FILTER_HAS_TOO_MANY_" +
      "VALUES\020?B\357\001\n#com.google.ads.googleads.v1" +
      "0.errorsB\017QueryErrorProtoP\001ZEgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v10/errors;errors\242\002\003GAA\252\002\037Google.Ads.Go" +
      "ogleAds.V10.Errors\312\002\037Google\\Ads\\GoogleAd" +
      "s\\V10\\Errors\352\002#Google::Ads::GoogleAds::V" +
      "10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_QueryErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_QueryErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_QueryErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}