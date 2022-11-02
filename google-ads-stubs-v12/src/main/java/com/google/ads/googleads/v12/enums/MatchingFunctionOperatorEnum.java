// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/enums/matching_function_operator.proto

package com.google.ads.googleads.v12.enums;

/**
 * <pre>
 * Container for enum describing matching function operator.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum}
 */
public final class MatchingFunctionOperatorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum)
    MatchingFunctionOperatorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MatchingFunctionOperatorEnum.newBuilder() to construct.
  private MatchingFunctionOperatorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MatchingFunctionOperatorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MatchingFunctionOperatorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.enums.MatchingFunctionOperatorProto.internal_static_google_ads_googleads_v12_enums_MatchingFunctionOperatorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.enums.MatchingFunctionOperatorProto.internal_static_google_ads_googleads_v12_enums_MatchingFunctionOperatorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.class, com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible operators in a matching function.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.MatchingFunctionOperator}
   */
  public enum MatchingFunctionOperator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The IN operator.
     * </pre>
     *
     * <code>IN = 2;</code>
     */
    IN(2),
    /**
     * <pre>
     * The IDENTITY operator.
     * </pre>
     *
     * <code>IDENTITY = 3;</code>
     */
    IDENTITY(3),
    /**
     * <pre>
     * The EQUALS operator
     * </pre>
     *
     * <code>EQUALS = 4;</code>
     */
    EQUALS(4),
    /**
     * <pre>
     * Operator that takes two or more operands that are of type
     * FunctionOperand and checks that all the operands evaluate to true.
     * For functions related to ad formats, all the operands must be in
     * left_operands.
     * </pre>
     *
     * <code>AND = 5;</code>
     */
    AND(5),
    /**
     * <pre>
     * Operator that returns true if the elements in left_operands contain any
     * of the elements in right_operands. Otherwise, return false. The
     * right_operands must contain at least 1 and no more than 3
     * ConstantOperands.
     * </pre>
     *
     * <code>CONTAINS_ANY = 6;</code>
     */
    CONTAINS_ANY(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The IN operator.
     * </pre>
     *
     * <code>IN = 2;</code>
     */
    public static final int IN_VALUE = 2;
    /**
     * <pre>
     * The IDENTITY operator.
     * </pre>
     *
     * <code>IDENTITY = 3;</code>
     */
    public static final int IDENTITY_VALUE = 3;
    /**
     * <pre>
     * The EQUALS operator
     * </pre>
     *
     * <code>EQUALS = 4;</code>
     */
    public static final int EQUALS_VALUE = 4;
    /**
     * <pre>
     * Operator that takes two or more operands that are of type
     * FunctionOperand and checks that all the operands evaluate to true.
     * For functions related to ad formats, all the operands must be in
     * left_operands.
     * </pre>
     *
     * <code>AND = 5;</code>
     */
    public static final int AND_VALUE = 5;
    /**
     * <pre>
     * Operator that returns true if the elements in left_operands contain any
     * of the elements in right_operands. Otherwise, return false. The
     * right_operands must contain at least 1 and no more than 3
     * ConstantOperands.
     * </pre>
     *
     * <code>CONTAINS_ANY = 6;</code>
     */
    public static final int CONTAINS_ANY_VALUE = 6;


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
    public static MatchingFunctionOperator valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MatchingFunctionOperator forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return IN;
        case 3: return IDENTITY;
        case 4: return EQUALS;
        case 5: return AND;
        case 6: return CONTAINS_ANY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MatchingFunctionOperator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MatchingFunctionOperator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MatchingFunctionOperator>() {
            public MatchingFunctionOperator findValueByNumber(int number) {
              return MatchingFunctionOperator.forNumber(number);
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
      return com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MatchingFunctionOperator[] VALUES = values();

    public static MatchingFunctionOperator valueOf(
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

    private MatchingFunctionOperator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.MatchingFunctionOperator)
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
    if (!(obj instanceof com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum other = (com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum) obj;

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

  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum prototype) {
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
   * Container for enum describing matching function operator.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum)
      com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.enums.MatchingFunctionOperatorProto.internal_static_google_ads_googleads_v12_enums_MatchingFunctionOperatorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.enums.MatchingFunctionOperatorProto.internal_static_google_ads_googleads_v12_enums_MatchingFunctionOperatorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.class, com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.newBuilder()
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
      return com.google.ads.googleads.v12.enums.MatchingFunctionOperatorProto.internal_static_google_ads_googleads_v12_enums_MatchingFunctionOperatorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum build() {
      com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum buildPartial() {
      com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum result = new com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum) {
        return mergeFrom((com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum other) {
      if (other == com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum)
  private static final com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum();
  }

  public static com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatchingFunctionOperatorEnum>
      PARSER = new com.google.protobuf.AbstractParser<MatchingFunctionOperatorEnum>() {
    @java.lang.Override
    public MatchingFunctionOperatorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<MatchingFunctionOperatorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatchingFunctionOperatorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.enums.MatchingFunctionOperatorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

