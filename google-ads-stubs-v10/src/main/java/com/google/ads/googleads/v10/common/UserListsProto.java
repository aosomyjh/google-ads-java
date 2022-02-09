// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/user_lists.proto

package com.google.ads.googleads.v10.common;

public final class UserListsProto {
  private UserListsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_SimilarUserListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_SimilarUserListInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_CrmBasedUserListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_CrmBasedUserListInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UserListRuleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UserListRuleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UserListRuleItemGroupInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UserListRuleItemGroupInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UserListRuleItemInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UserListRuleItemInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UserListDateRuleItemInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UserListDateRuleItemInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UserListStringRuleItemInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UserListStringRuleItemInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_CombinedRuleUserListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_CombinedRuleUserListInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_DateSpecificRuleUserListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_DateSpecificRuleUserListInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_ExpressionRuleUserListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_ExpressionRuleUserListInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_RuleBasedUserListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_RuleBasedUserListInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_LogicalUserListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_LogicalUserListInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UserListLogicalRuleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UserListLogicalRuleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_LogicalUserListOperandInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_LogicalUserListOperandInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_BasicUserListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_BasicUserListInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_UserListActionInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_UserListActionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v10/common/user_l" +
      "ists.proto\022\037google.ads.googleads.v10.com" +
      "mon\032Cgoogle/ads/googleads/v10/enums/cust" +
      "omer_match_upload_key_type.proto\032Egoogle" +
      "/ads/googleads/v10/enums/user_list_combi" +
      "ned_rule_operator.proto\032Cgoogle/ads/goog" +
      "leads/v10/enums/user_list_crm_data_sourc" +
      "e_type.proto\032Fgoogle/ads/googleads/v10/e" +
      "nums/user_list_date_rule_item_operator.p" +
      "roto\032Dgoogle/ads/googleads/v10/enums/use" +
      "r_list_logical_rule_operator.proto\032Hgoog" +
      "le/ads/googleads/v10/enums/user_list_num" +
      "ber_rule_item_operator.proto\032Cgoogle/ads" +
      "/googleads/v10/enums/user_list_prepopula" +
      "tion_status.proto\0328google/ads/googleads/" +
      "v10/enums/user_list_rule_type.proto\032Hgoo" +
      "gle/ads/googleads/v10/enums/user_list_st" +
      "ring_rule_item_operator.proto\032\034google/ap" +
      "i/annotations.proto\"E\n\023SimilarUserListIn" +
      "fo\022\033\n\016seed_user_list\030\002 \001(\tH\000\210\001\001B\021\n\017_seed" +
      "_user_list\"\235\002\n\024CrmBasedUserListInfo\022\023\n\006a" +
      "pp_id\030\004 \001(\tH\000\210\001\001\022r\n\017upload_key_type\030\002 \001(" +
      "\0162Y.google.ads.googleads.v10.enums.Custo" +
      "merMatchUploadKeyTypeEnum.CustomerMatchU" +
      "ploadKeyType\022q\n\020data_source_type\030\003 \001(\0162W" +
      ".google.ads.googleads.v10.enums.UserList" +
      "CrmDataSourceTypeEnum.UserListCrmDataSou" +
      "rceTypeB\t\n\007_app_id\"\302\001\n\020UserListRuleInfo\022" +
      "X\n\trule_type\030\001 \001(\0162E.google.ads.googlead" +
      "s.v10.enums.UserListRuleTypeEnum.UserLis" +
      "tRuleType\022T\n\020rule_item_groups\030\002 \003(\0132:.go" +
      "ogle.ads.googleads.v10.common.UserListRu" +
      "leItemGroupInfo\"f\n\031UserListRuleItemGroup" +
      "Info\022I\n\nrule_items\030\001 \003(\01325.google.ads.go" +
      "ogleads.v10.common.UserListRuleItemInfo\"" +
      "\306\002\n\024UserListRuleItemInfo\022\021\n\004name\030\005 \001(\tH\001" +
      "\210\001\001\022W\n\020number_rule_item\030\002 \001(\0132;.google.a" +
      "ds.googleads.v10.common.UserListNumberRu" +
      "leItemInfoH\000\022W\n\020string_rule_item\030\003 \001(\0132;" +
      ".google.ads.googleads.v10.common.UserLis" +
      "tStringRuleItemInfoH\000\022S\n\016date_rule_item\030" +
      "\004 \001(\01329.google.ads.googleads.v10.common." +
      "UserListDateRuleItemInfoH\000B\013\n\trule_itemB" +
      "\007\n\005_name\"\331\001\n\030UserListDateRuleItemInfo\022o\n" +
      "\010operator\030\001 \001(\0162].google.ads.googleads.v" +
      "10.enums.UserListDateRuleItemOperatorEnu" +
      "m.UserListDateRuleItemOperator\022\022\n\005value\030" +
      "\004 \001(\tH\000\210\001\001\022\033\n\016offset_in_days\030\005 \001(\003H\001\210\001\001B" +
      "\010\n\006_valueB\021\n\017_offset_in_days\"\257\001\n\032UserLis" +
      "tNumberRuleItemInfo\022s\n\010operator\030\001 \001(\0162a." +
      "google.ads.googleads.v10.enums.UserListN" +
      "umberRuleItemOperatorEnum.UserListNumber" +
      "RuleItemOperator\022\022\n\005value\030\003 \001(\001H\000\210\001\001B\010\n\006" +
      "_value\"\257\001\n\032UserListStringRuleItemInfo\022s\n" +
      "\010operator\030\001 \001(\0162a.google.ads.googleads.v" +
      "10.enums.UserListStringRuleItemOperatorE" +
      "num.UserListStringRuleItemOperator\022\022\n\005va" +
      "lue\030\003 \001(\tH\000\210\001\001B\010\n\006_value\"\243\002\n\030CombinedRul" +
      "eUserListInfo\022G\n\014left_operand\030\001 \001(\01321.go" +
      "ogle.ads.googleads.v10.common.UserListRu" +
      "leInfo\022H\n\rright_operand\030\002 \001(\01321.google.a" +
      "ds.googleads.v10.common.UserListRuleInfo" +
      "\022t\n\rrule_operator\030\003 \001(\0162].google.ads.goo" +
      "gleads.v10.enums.UserListCombinedRuleOpe" +
      "ratorEnum.UserListCombinedRuleOperator\"\253" +
      "\001\n\034DateSpecificRuleUserListInfo\022?\n\004rule\030" +
      "\001 \001(\01321.google.ads.googleads.v10.common." +
      "UserListRuleInfo\022\027\n\nstart_date\030\004 \001(\tH\000\210\001" +
      "\001\022\025\n\010end_date\030\005 \001(\tH\001\210\001\001B\r\n\013_start_dateB" +
      "\013\n\t_end_date\"]\n\032ExpressionRuleUserListIn" +
      "fo\022?\n\004rule\030\001 \001(\01321.google.ads.googleads." +
      "v10.common.UserListRuleInfo\"\321\003\n\025RuleBase" +
      "dUserListInfo\022y\n\024prepopulation_status\030\001 " +
      "\001(\0162[.google.ads.googleads.v10.enums.Use" +
      "rListPrepopulationStatusEnum.UserListPre" +
      "populationStatus\022\\\n\027combined_rule_user_l" +
      "ist\030\002 \001(\01329.google.ads.googleads.v10.com" +
      "mon.CombinedRuleUserListInfoH\000\022e\n\034date_s" +
      "pecific_rule_user_list\030\003 \001(\0132=.google.ad" +
      "s.googleads.v10.common.DateSpecificRuleU" +
      "serListInfoH\000\022`\n\031expression_rule_user_li" +
      "st\030\004 \001(\0132;.google.ads.googleads.v10.comm" +
      "on.ExpressionRuleUserListInfoH\000B\026\n\024rule_" +
      "based_user_list\"^\n\023LogicalUserListInfo\022G" +
      "\n\005rules\030\001 \003(\01328.google.ads.googleads.v10" +
      ".common.UserListLogicalRuleInfo\"\334\001\n\027User" +
      "ListLogicalRuleInfo\022m\n\010operator\030\001 \001(\0162[." +
      "google.ads.googleads.v10.enums.UserListL" +
      "ogicalRuleOperatorEnum.UserListLogicalRu" +
      "leOperator\022R\n\rrule_operands\030\002 \003(\0132;.goog" +
      "le.ads.googleads.v10.common.LogicalUserL" +
      "istOperandInfo\"B\n\032LogicalUserListOperand" +
      "Info\022\026\n\tuser_list\030\002 \001(\tH\000\210\001\001B\014\n\n_user_li" +
      "st\"Y\n\021BasicUserListInfo\022D\n\007actions\030\001 \003(\013" +
      "23.google.ads.googleads.v10.common.UserL" +
      "istActionInfo\"c\n\022UserListActionInfo\022\033\n\021c" +
      "onversion_action\030\003 \001(\tH\000\022\034\n\022remarketing_" +
      "action\030\004 \001(\tH\000B\022\n\020user_list_actionB\356\001\n#c" +
      "om.google.ads.googleads.v10.commonB\016User" +
      "ListsProtoP\001ZEgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v10/common;com" +
      "mon\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10.Com" +
      "mon\312\002\037Google\\Ads\\GoogleAds\\V10\\Common\352\002#" +
      "Google::Ads::GoogleAds::V10::Commonb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.CustomerMatchUploadKeyTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.UserListCombinedRuleOperatorProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.UserListCrmDataSourceTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.UserListDateRuleItemOperatorProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.UserListLogicalRuleOperatorProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.UserListPrepopulationStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.UserListRuleTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_SimilarUserListInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_SimilarUserListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_SimilarUserListInfo_descriptor,
        new java.lang.String[] { "SeedUserList", "SeedUserList", });
    internal_static_google_ads_googleads_v10_common_CrmBasedUserListInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_common_CrmBasedUserListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_CrmBasedUserListInfo_descriptor,
        new java.lang.String[] { "AppId", "UploadKeyType", "DataSourceType", "AppId", });
    internal_static_google_ads_googleads_v10_common_UserListRuleInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_common_UserListRuleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UserListRuleInfo_descriptor,
        new java.lang.String[] { "RuleType", "RuleItemGroups", });
    internal_static_google_ads_googleads_v10_common_UserListRuleItemGroupInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_common_UserListRuleItemGroupInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UserListRuleItemGroupInfo_descriptor,
        new java.lang.String[] { "RuleItems", });
    internal_static_google_ads_googleads_v10_common_UserListRuleItemInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v10_common_UserListRuleItemInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UserListRuleItemInfo_descriptor,
        new java.lang.String[] { "Name", "NumberRuleItem", "StringRuleItem", "DateRuleItem", "RuleItem", "Name", });
    internal_static_google_ads_googleads_v10_common_UserListDateRuleItemInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v10_common_UserListDateRuleItemInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UserListDateRuleItemInfo_descriptor,
        new java.lang.String[] { "Operator", "Value", "OffsetInDays", "Value", "OffsetInDays", });
    internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_descriptor,
        new java.lang.String[] { "Operator", "Value", "Value", });
    internal_static_google_ads_googleads_v10_common_UserListStringRuleItemInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v10_common_UserListStringRuleItemInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UserListStringRuleItemInfo_descriptor,
        new java.lang.String[] { "Operator", "Value", "Value", });
    internal_static_google_ads_googleads_v10_common_CombinedRuleUserListInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v10_common_CombinedRuleUserListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_CombinedRuleUserListInfo_descriptor,
        new java.lang.String[] { "LeftOperand", "RightOperand", "RuleOperator", });
    internal_static_google_ads_googleads_v10_common_DateSpecificRuleUserListInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v10_common_DateSpecificRuleUserListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_DateSpecificRuleUserListInfo_descriptor,
        new java.lang.String[] { "Rule", "StartDate", "EndDate", "StartDate", "EndDate", });
    internal_static_google_ads_googleads_v10_common_ExpressionRuleUserListInfo_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v10_common_ExpressionRuleUserListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_ExpressionRuleUserListInfo_descriptor,
        new java.lang.String[] { "Rule", });
    internal_static_google_ads_googleads_v10_common_RuleBasedUserListInfo_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v10_common_RuleBasedUserListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_RuleBasedUserListInfo_descriptor,
        new java.lang.String[] { "PrepopulationStatus", "CombinedRuleUserList", "DateSpecificRuleUserList", "ExpressionRuleUserList", "RuleBasedUserList", });
    internal_static_google_ads_googleads_v10_common_LogicalUserListInfo_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v10_common_LogicalUserListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_LogicalUserListInfo_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_google_ads_googleads_v10_common_UserListLogicalRuleInfo_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_ads_googleads_v10_common_UserListLogicalRuleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UserListLogicalRuleInfo_descriptor,
        new java.lang.String[] { "Operator", "RuleOperands", });
    internal_static_google_ads_googleads_v10_common_LogicalUserListOperandInfo_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_ads_googleads_v10_common_LogicalUserListOperandInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_LogicalUserListOperandInfo_descriptor,
        new java.lang.String[] { "UserList", "UserList", });
    internal_static_google_ads_googleads_v10_common_BasicUserListInfo_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_ads_googleads_v10_common_BasicUserListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_BasicUserListInfo_descriptor,
        new java.lang.String[] { "Actions", });
    internal_static_google_ads_googleads_v10_common_UserListActionInfo_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_google_ads_googleads_v10_common_UserListActionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_UserListActionInfo_descriptor,
        new java.lang.String[] { "ConversionAction", "RemarketingAction", "UserListAction", });
    com.google.ads.googleads.v10.enums.CustomerMatchUploadKeyTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.UserListCombinedRuleOperatorProto.getDescriptor();
    com.google.ads.googleads.v10.enums.UserListCrmDataSourceTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.UserListDateRuleItemOperatorProto.getDescriptor();
    com.google.ads.googleads.v10.enums.UserListLogicalRuleOperatorProto.getDescriptor();
    com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorProto.getDescriptor();
    com.google.ads.googleads.v10.enums.UserListPrepopulationStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.UserListRuleTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}