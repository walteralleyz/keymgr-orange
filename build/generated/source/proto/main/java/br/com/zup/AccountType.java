// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keymgr.proto

package br.com.zup;

/**
 * Protobuf enum {@code br.com.zup.AccountType}
 */
public enum AccountType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACCOUNT = 0;</code>
   */
  ACCOUNT(0),
  /**
   * <code>CACC = 1;</code>
   */
  CACC(1),
  /**
   * <code>SVGS = 2;</code>
   */
  SVGS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ACCOUNT = 0;</code>
   */
  public static final int ACCOUNT_VALUE = 0;
  /**
   * <code>CACC = 1;</code>
   */
  public static final int CACC_VALUE = 1;
  /**
   * <code>SVGS = 2;</code>
   */
  public static final int SVGS_VALUE = 2;


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
  public static AccountType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AccountType forNumber(int value) {
    switch (value) {
      case 0: return ACCOUNT;
      case 1: return CACC;
      case 2: return SVGS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AccountType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AccountType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AccountType>() {
          public AccountType findValueByNumber(int number) {
            return AccountType.forNumber(number);
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
    return br.com.zup.Keymgr.getDescriptor().getEnumTypes().get(1);
  }

  private static final AccountType[] VALUES = values();

  public static AccountType valueOf(
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

  private AccountType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:br.com.zup.AccountType)
}

