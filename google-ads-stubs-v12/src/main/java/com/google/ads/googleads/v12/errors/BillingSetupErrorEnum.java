// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/billing_setup_error.proto

package com.google.ads.googleads.v12.errors;

/**
 * <pre>
 * Container for enum describing possible billing setup errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.errors.BillingSetupErrorEnum}
 */
public final class BillingSetupErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.errors.BillingSetupErrorEnum)
    BillingSetupErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BillingSetupErrorEnum.newBuilder() to construct.
  private BillingSetupErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BillingSetupErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BillingSetupErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.errors.BillingSetupErrorProto.internal_static_google_ads_googleads_v12_errors_BillingSetupErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.errors.BillingSetupErrorProto.internal_static_google_ads_googleads_v12_errors_BillingSetupErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.errors.BillingSetupErrorEnum.class, com.google.ads.googleads.v12.errors.BillingSetupErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible billing setup errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.errors.BillingSetupErrorEnum.BillingSetupError}
   */
  public enum BillingSetupError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Cannot specify both an existing payments account and a new payments
     * account when setting up billing.
     * </pre>
     *
     * <code>CANNOT_USE_EXISTING_AND_NEW_ACCOUNT = 2;</code>
     */
    CANNOT_USE_EXISTING_AND_NEW_ACCOUNT(2),
    /**
     * <pre>
     * Cannot cancel an approved billing setup whose start time has passed.
     * </pre>
     *
     * <code>CANNOT_REMOVE_STARTED_BILLING_SETUP = 3;</code>
     */
    CANNOT_REMOVE_STARTED_BILLING_SETUP(3),
    /**
     * <pre>
     * Cannot perform a Change of Bill-To (CBT) to the same payments account.
     * </pre>
     *
     * <code>CANNOT_CHANGE_BILLING_TO_SAME_PAYMENTS_ACCOUNT = 4;</code>
     */
    CANNOT_CHANGE_BILLING_TO_SAME_PAYMENTS_ACCOUNT(4),
    /**
     * <pre>
     * Billing setups can only be used by customers with ENABLED or DRAFT
     * status.
     * </pre>
     *
     * <code>BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_STATUS = 5;</code>
     */
    BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_STATUS(5),
    /**
     * <pre>
     * Billing setups must either include a correctly formatted existing
     * payments account id, or a non-empty new payments account name.
     * </pre>
     *
     * <code>INVALID_PAYMENTS_ACCOUNT = 6;</code>
     */
    INVALID_PAYMENTS_ACCOUNT(6),
    /**
     * <pre>
     * Only billable and third-party customers can create billing setups.
     * </pre>
     *
     * <code>BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_CATEGORY = 7;</code>
     */
    BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_CATEGORY(7),
    /**
     * <pre>
     * Billing setup creations can only use NOW for start time type.
     * </pre>
     *
     * <code>INVALID_START_TIME_TYPE = 8;</code>
     */
    INVALID_START_TIME_TYPE(8),
    /**
     * <pre>
     * Billing setups can only be created for a third-party customer if they do
     * not already have a setup.
     * </pre>
     *
     * <code>THIRD_PARTY_ALREADY_HAS_BILLING = 9;</code>
     */
    THIRD_PARTY_ALREADY_HAS_BILLING(9),
    /**
     * <pre>
     * Billing setups cannot be created if there is already a pending billing in
     * progress.
     * </pre>
     *
     * <code>BILLING_SETUP_IN_PROGRESS = 10;</code>
     */
    BILLING_SETUP_IN_PROGRESS(10),
    /**
     * <pre>
     * Billing setups can only be created by customers who have permission to
     * setup billings. Users can contact a representative for help setting up
     * permissions.
     * </pre>
     *
     * <code>NO_SIGNUP_PERMISSION = 11;</code>
     */
    NO_SIGNUP_PERMISSION(11),
    /**
     * <pre>
     * Billing setups cannot be created if there is already a future-approved
     * billing.
     * </pre>
     *
     * <code>CHANGE_OF_BILL_TO_IN_PROGRESS = 12;</code>
     */
    CHANGE_OF_BILL_TO_IN_PROGRESS(12),
    /**
     * <pre>
     * Requested payments profile not found.
     * </pre>
     *
     * <code>PAYMENTS_PROFILE_NOT_FOUND = 13;</code>
     */
    PAYMENTS_PROFILE_NOT_FOUND(13),
    /**
     * <pre>
     * Requested payments account not found.
     * </pre>
     *
     * <code>PAYMENTS_ACCOUNT_NOT_FOUND = 14;</code>
     */
    PAYMENTS_ACCOUNT_NOT_FOUND(14),
    /**
     * <pre>
     * Billing setup creation failed because the payments profile is ineligible.
     * </pre>
     *
     * <code>PAYMENTS_PROFILE_INELIGIBLE = 15;</code>
     */
    PAYMENTS_PROFILE_INELIGIBLE(15),
    /**
     * <pre>
     * Billing setup creation failed because the payments account is ineligible.
     * </pre>
     *
     * <code>PAYMENTS_ACCOUNT_INELIGIBLE = 16;</code>
     */
    PAYMENTS_ACCOUNT_INELIGIBLE(16),
    /**
     * <pre>
     * Billing setup creation failed because the payments profile needs internal
     * approval.
     * </pre>
     *
     * <code>CUSTOMER_NEEDS_INTERNAL_APPROVAL = 17;</code>
     */
    CUSTOMER_NEEDS_INTERNAL_APPROVAL(17),
    /**
     * <pre>
     * Payments account has different currency code than the current customer
     * and hence cannot be used to setup billing.
     * </pre>
     *
     * <code>PAYMENTS_ACCOUNT_INELIGIBLE_CURRENCY_CODE_MISMATCH = 19;</code>
     */
    PAYMENTS_ACCOUNT_INELIGIBLE_CURRENCY_CODE_MISMATCH(19),
    /**
     * <pre>
     * A start time in the future cannot be used because there is currently no
     * active billing setup for this customer.
     * </pre>
     *
     * <code>FUTURE_START_TIME_PROHIBITED = 20;</code>
     */
    FUTURE_START_TIME_PROHIBITED(20),
    /**
     * <pre>
     * The payments account has maximum number of billing setups.
     * </pre>
     *
     * <code>TOO_MANY_BILLING_SETUPS_FOR_PAYMENTS_ACCOUNT = 21;</code>
     */
    TOO_MANY_BILLING_SETUPS_FOR_PAYMENTS_ACCOUNT(21),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Cannot specify both an existing payments account and a new payments
     * account when setting up billing.
     * </pre>
     *
     * <code>CANNOT_USE_EXISTING_AND_NEW_ACCOUNT = 2;</code>
     */
    public static final int CANNOT_USE_EXISTING_AND_NEW_ACCOUNT_VALUE = 2;
    /**
     * <pre>
     * Cannot cancel an approved billing setup whose start time has passed.
     * </pre>
     *
     * <code>CANNOT_REMOVE_STARTED_BILLING_SETUP = 3;</code>
     */
    public static final int CANNOT_REMOVE_STARTED_BILLING_SETUP_VALUE = 3;
    /**
     * <pre>
     * Cannot perform a Change of Bill-To (CBT) to the same payments account.
     * </pre>
     *
     * <code>CANNOT_CHANGE_BILLING_TO_SAME_PAYMENTS_ACCOUNT = 4;</code>
     */
    public static final int CANNOT_CHANGE_BILLING_TO_SAME_PAYMENTS_ACCOUNT_VALUE = 4;
    /**
     * <pre>
     * Billing setups can only be used by customers with ENABLED or DRAFT
     * status.
     * </pre>
     *
     * <code>BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_STATUS = 5;</code>
     */
    public static final int BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_STATUS_VALUE = 5;
    /**
     * <pre>
     * Billing setups must either include a correctly formatted existing
     * payments account id, or a non-empty new payments account name.
     * </pre>
     *
     * <code>INVALID_PAYMENTS_ACCOUNT = 6;</code>
     */
    public static final int INVALID_PAYMENTS_ACCOUNT_VALUE = 6;
    /**
     * <pre>
     * Only billable and third-party customers can create billing setups.
     * </pre>
     *
     * <code>BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_CATEGORY = 7;</code>
     */
    public static final int BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_CATEGORY_VALUE = 7;
    /**
     * <pre>
     * Billing setup creations can only use NOW for start time type.
     * </pre>
     *
     * <code>INVALID_START_TIME_TYPE = 8;</code>
     */
    public static final int INVALID_START_TIME_TYPE_VALUE = 8;
    /**
     * <pre>
     * Billing setups can only be created for a third-party customer if they do
     * not already have a setup.
     * </pre>
     *
     * <code>THIRD_PARTY_ALREADY_HAS_BILLING = 9;</code>
     */
    public static final int THIRD_PARTY_ALREADY_HAS_BILLING_VALUE = 9;
    /**
     * <pre>
     * Billing setups cannot be created if there is already a pending billing in
     * progress.
     * </pre>
     *
     * <code>BILLING_SETUP_IN_PROGRESS = 10;</code>
     */
    public static final int BILLING_SETUP_IN_PROGRESS_VALUE = 10;
    /**
     * <pre>
     * Billing setups can only be created by customers who have permission to
     * setup billings. Users can contact a representative for help setting up
     * permissions.
     * </pre>
     *
     * <code>NO_SIGNUP_PERMISSION = 11;</code>
     */
    public static final int NO_SIGNUP_PERMISSION_VALUE = 11;
    /**
     * <pre>
     * Billing setups cannot be created if there is already a future-approved
     * billing.
     * </pre>
     *
     * <code>CHANGE_OF_BILL_TO_IN_PROGRESS = 12;</code>
     */
    public static final int CHANGE_OF_BILL_TO_IN_PROGRESS_VALUE = 12;
    /**
     * <pre>
     * Requested payments profile not found.
     * </pre>
     *
     * <code>PAYMENTS_PROFILE_NOT_FOUND = 13;</code>
     */
    public static final int PAYMENTS_PROFILE_NOT_FOUND_VALUE = 13;
    /**
     * <pre>
     * Requested payments account not found.
     * </pre>
     *
     * <code>PAYMENTS_ACCOUNT_NOT_FOUND = 14;</code>
     */
    public static final int PAYMENTS_ACCOUNT_NOT_FOUND_VALUE = 14;
    /**
     * <pre>
     * Billing setup creation failed because the payments profile is ineligible.
     * </pre>
     *
     * <code>PAYMENTS_PROFILE_INELIGIBLE = 15;</code>
     */
    public static final int PAYMENTS_PROFILE_INELIGIBLE_VALUE = 15;
    /**
     * <pre>
     * Billing setup creation failed because the payments account is ineligible.
     * </pre>
     *
     * <code>PAYMENTS_ACCOUNT_INELIGIBLE = 16;</code>
     */
    public static final int PAYMENTS_ACCOUNT_INELIGIBLE_VALUE = 16;
    /**
     * <pre>
     * Billing setup creation failed because the payments profile needs internal
     * approval.
     * </pre>
     *
     * <code>CUSTOMER_NEEDS_INTERNAL_APPROVAL = 17;</code>
     */
    public static final int CUSTOMER_NEEDS_INTERNAL_APPROVAL_VALUE = 17;
    /**
     * <pre>
     * Payments account has different currency code than the current customer
     * and hence cannot be used to setup billing.
     * </pre>
     *
     * <code>PAYMENTS_ACCOUNT_INELIGIBLE_CURRENCY_CODE_MISMATCH = 19;</code>
     */
    public static final int PAYMENTS_ACCOUNT_INELIGIBLE_CURRENCY_CODE_MISMATCH_VALUE = 19;
    /**
     * <pre>
     * A start time in the future cannot be used because there is currently no
     * active billing setup for this customer.
     * </pre>
     *
     * <code>FUTURE_START_TIME_PROHIBITED = 20;</code>
     */
    public static final int FUTURE_START_TIME_PROHIBITED_VALUE = 20;
    /**
     * <pre>
     * The payments account has maximum number of billing setups.
     * </pre>
     *
     * <code>TOO_MANY_BILLING_SETUPS_FOR_PAYMENTS_ACCOUNT = 21;</code>
     */
    public static final int TOO_MANY_BILLING_SETUPS_FOR_PAYMENTS_ACCOUNT_VALUE = 21;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static BillingSetupError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BillingSetupError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CANNOT_USE_EXISTING_AND_NEW_ACCOUNT;
        case 3: return CANNOT_REMOVE_STARTED_BILLING_SETUP;
        case 4: return CANNOT_CHANGE_BILLING_TO_SAME_PAYMENTS_ACCOUNT;
        case 5: return BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_STATUS;
        case 6: return INVALID_PAYMENTS_ACCOUNT;
        case 7: return BILLING_SETUP_NOT_PERMITTED_FOR_CUSTOMER_CATEGORY;
        case 8: return INVALID_START_TIME_TYPE;
        case 9: return THIRD_PARTY_ALREADY_HAS_BILLING;
        case 10: return BILLING_SETUP_IN_PROGRESS;
        case 11: return NO_SIGNUP_PERMISSION;
        case 12: return CHANGE_OF_BILL_TO_IN_PROGRESS;
        case 13: return PAYMENTS_PROFILE_NOT_FOUND;
        case 14: return PAYMENTS_ACCOUNT_NOT_FOUND;
        case 15: return PAYMENTS_PROFILE_INELIGIBLE;
        case 16: return PAYMENTS_ACCOUNT_INELIGIBLE;
        case 17: return CUSTOMER_NEEDS_INTERNAL_APPROVAL;
        case 19: return PAYMENTS_ACCOUNT_INELIGIBLE_CURRENCY_CODE_MISMATCH;
        case 20: return FUTURE_START_TIME_PROHIBITED;
        case 21: return TOO_MANY_BILLING_SETUPS_FOR_PAYMENTS_ACCOUNT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BillingSetupError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BillingSetupError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BillingSetupError>() {
            public BillingSetupError findValueByNumber(int number) {
              return BillingSetupError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.errors.BillingSetupErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final BillingSetupError[] VALUES = values();

    public static BillingSetupError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private BillingSetupError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.errors.BillingSetupErrorEnum.BillingSetupError)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v12.errors.BillingSetupErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.errors.BillingSetupErrorEnum other = (com.google.ads.googleads.v12.errors.BillingSetupErrorEnum) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v12.errors.BillingSetupErrorEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum describing possible billing setup errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.errors.BillingSetupErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.errors.BillingSetupErrorEnum)
      com.google.ads.googleads.v12.errors.BillingSetupErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.errors.BillingSetupErrorProto.internal_static_google_ads_googleads_v12_errors_BillingSetupErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.errors.BillingSetupErrorProto.internal_static_google_ads_googleads_v12_errors_BillingSetupErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.errors.BillingSetupErrorEnum.class, com.google.ads.googleads.v12.errors.BillingSetupErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.errors.BillingSetupErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.errors.BillingSetupErrorProto.internal_static_google_ads_googleads_v12_errors_BillingSetupErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.BillingSetupErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.errors.BillingSetupErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.BillingSetupErrorEnum build() {
      com.google.ads.googleads.v12.errors.BillingSetupErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.BillingSetupErrorEnum buildPartial() {
      com.google.ads.googleads.v12.errors.BillingSetupErrorEnum result = new com.google.ads.googleads.v12.errors.BillingSetupErrorEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v12.errors.BillingSetupErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v12.errors.BillingSetupErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.errors.BillingSetupErrorEnum other) {
      if (other == com.google.ads.googleads.v12.errors.BillingSetupErrorEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.errors.BillingSetupErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.errors.BillingSetupErrorEnum)
  private static final com.google.ads.googleads.v12.errors.BillingSetupErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.errors.BillingSetupErrorEnum();
  }

  public static com.google.ads.googleads.v12.errors.BillingSetupErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BillingSetupErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<BillingSetupErrorEnum>() {
    @java.lang.Override
    public BillingSetupErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BillingSetupErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BillingSetupErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.errors.BillingSetupErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

