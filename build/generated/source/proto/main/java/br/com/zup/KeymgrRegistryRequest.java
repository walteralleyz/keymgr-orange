// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keymgr.proto

package br.com.zup;

/**
 * Protobuf type {@code br.com.zup.KeymgrRegistryRequest}
 */
public final class KeymgrRegistryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.zup.KeymgrRegistryRequest)
    KeymgrRegistryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeymgrRegistryRequest.newBuilder() to construct.
  private KeymgrRegistryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeymgrRegistryRequest() {
    pix_ = "";
    pixType_ = 0;
    clientId_ = "";
    accountType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeymgrRegistryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeymgrRegistryRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            pix_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            pixType_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            clientId_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            accountType_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrRegistryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrRegistryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zup.KeymgrRegistryRequest.class, br.com.zup.KeymgrRegistryRequest.Builder.class);
  }

  public static final int PIX_FIELD_NUMBER = 1;
  private volatile java.lang.Object pix_;
  /**
   * <code>string pix = 1;</code>
   * @return The pix.
   */
  @java.lang.Override
  public java.lang.String getPix() {
    java.lang.Object ref = pix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pix_ = s;
      return s;
    }
  }
  /**
   * <code>string pix = 1;</code>
   * @return The bytes for pix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPixBytes() {
    java.lang.Object ref = pix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PIXTYPE_FIELD_NUMBER = 2;
  private int pixType_;
  /**
   * <code>.br.com.zup.KeyType pixType = 2;</code>
   * @return The enum numeric value on the wire for pixType.
   */
  @java.lang.Override public int getPixTypeValue() {
    return pixType_;
  }
  /**
   * <code>.br.com.zup.KeyType pixType = 2;</code>
   * @return The pixType.
   */
  @java.lang.Override public br.com.zup.KeyType getPixType() {
    @SuppressWarnings("deprecation")
    br.com.zup.KeyType result = br.com.zup.KeyType.valueOf(pixType_);
    return result == null ? br.com.zup.KeyType.UNRECOGNIZED : result;
  }

  public static final int CLIENTID_FIELD_NUMBER = 3;
  private volatile java.lang.Object clientId_;
  /**
   * <code>string clientId = 3;</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <code>string clientId = 3;</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNTTYPE_FIELD_NUMBER = 4;
  private int accountType_;
  /**
   * <code>.br.com.zup.AccountType accountType = 4;</code>
   * @return The enum numeric value on the wire for accountType.
   */
  @java.lang.Override public int getAccountTypeValue() {
    return accountType_;
  }
  /**
   * <code>.br.com.zup.AccountType accountType = 4;</code>
   * @return The accountType.
   */
  @java.lang.Override public br.com.zup.AccountType getAccountType() {
    @SuppressWarnings("deprecation")
    br.com.zup.AccountType result = br.com.zup.AccountType.valueOf(accountType_);
    return result == null ? br.com.zup.AccountType.UNRECOGNIZED : result;
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
    if (!getPixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pix_);
    }
    if (pixType_ != br.com.zup.KeyType.KEY.getNumber()) {
      output.writeEnum(2, pixType_);
    }
    if (!getClientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clientId_);
    }
    if (accountType_ != br.com.zup.AccountType.ACCOUNT.getNumber()) {
      output.writeEnum(4, accountType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pix_);
    }
    if (pixType_ != br.com.zup.KeyType.KEY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, pixType_);
    }
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clientId_);
    }
    if (accountType_ != br.com.zup.AccountType.ACCOUNT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, accountType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.zup.KeymgrRegistryRequest)) {
      return super.equals(obj);
    }
    br.com.zup.KeymgrRegistryRequest other = (br.com.zup.KeymgrRegistryRequest) obj;

    if (!getPix()
        .equals(other.getPix())) return false;
    if (pixType_ != other.pixType_) return false;
    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (accountType_ != other.accountType_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PIX_FIELD_NUMBER;
    hash = (53 * hash) + getPix().hashCode();
    hash = (37 * hash) + PIXTYPE_FIELD_NUMBER;
    hash = (53 * hash) + pixType_;
    hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + ACCOUNTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + accountType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zup.KeymgrRegistryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.KeymgrRegistryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zup.KeymgrRegistryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.KeymgrRegistryRequest parseFrom(
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
  public static Builder newBuilder(br.com.zup.KeymgrRegistryRequest prototype) {
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
   * Protobuf type {@code br.com.zup.KeymgrRegistryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.zup.KeymgrRegistryRequest)
      br.com.zup.KeymgrRegistryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrRegistryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrRegistryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zup.KeymgrRegistryRequest.class, br.com.zup.KeymgrRegistryRequest.Builder.class);
    }

    // Construct using br.com.zup.KeymgrRegistryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pix_ = "";

      pixType_ = 0;

      clientId_ = "";

      accountType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrRegistryRequest_descriptor;
    }

    @java.lang.Override
    public br.com.zup.KeymgrRegistryRequest getDefaultInstanceForType() {
      return br.com.zup.KeymgrRegistryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zup.KeymgrRegistryRequest build() {
      br.com.zup.KeymgrRegistryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zup.KeymgrRegistryRequest buildPartial() {
      br.com.zup.KeymgrRegistryRequest result = new br.com.zup.KeymgrRegistryRequest(this);
      result.pix_ = pix_;
      result.pixType_ = pixType_;
      result.clientId_ = clientId_;
      result.accountType_ = accountType_;
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
      if (other instanceof br.com.zup.KeymgrRegistryRequest) {
        return mergeFrom((br.com.zup.KeymgrRegistryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zup.KeymgrRegistryRequest other) {
      if (other == br.com.zup.KeymgrRegistryRequest.getDefaultInstance()) return this;
      if (!other.getPix().isEmpty()) {
        pix_ = other.pix_;
        onChanged();
      }
      if (other.pixType_ != 0) {
        setPixTypeValue(other.getPixTypeValue());
      }
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (other.accountType_ != 0) {
        setAccountTypeValue(other.getAccountTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      br.com.zup.KeymgrRegistryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zup.KeymgrRegistryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pix_ = "";
    /**
     * <code>string pix = 1;</code>
     * @return The pix.
     */
    public java.lang.String getPix() {
      java.lang.Object ref = pix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pix = 1;</code>
     * @return The bytes for pix.
     */
    public com.google.protobuf.ByteString
        getPixBytes() {
      java.lang.Object ref = pix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pix = 1;</code>
     * @param value The pix to set.
     * @return This builder for chaining.
     */
    public Builder setPix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pix = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPix() {
      
      pix_ = getDefaultInstance().getPix();
      onChanged();
      return this;
    }
    /**
     * <code>string pix = 1;</code>
     * @param value The bytes for pix to set.
     * @return This builder for chaining.
     */
    public Builder setPixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pix_ = value;
      onChanged();
      return this;
    }

    private int pixType_ = 0;
    /**
     * <code>.br.com.zup.KeyType pixType = 2;</code>
     * @return The enum numeric value on the wire for pixType.
     */
    @java.lang.Override public int getPixTypeValue() {
      return pixType_;
    }
    /**
     * <code>.br.com.zup.KeyType pixType = 2;</code>
     * @param value The enum numeric value on the wire for pixType to set.
     * @return This builder for chaining.
     */
    public Builder setPixTypeValue(int value) {
      
      pixType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.KeyType pixType = 2;</code>
     * @return The pixType.
     */
    @java.lang.Override
    public br.com.zup.KeyType getPixType() {
      @SuppressWarnings("deprecation")
      br.com.zup.KeyType result = br.com.zup.KeyType.valueOf(pixType_);
      return result == null ? br.com.zup.KeyType.UNRECOGNIZED : result;
    }
    /**
     * <code>.br.com.zup.KeyType pixType = 2;</code>
     * @param value The pixType to set.
     * @return This builder for chaining.
     */
    public Builder setPixType(br.com.zup.KeyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pixType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.KeyType pixType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPixType() {
      
      pixType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object clientId_ = "";
    /**
     * <code>string clientId = 3;</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clientId = 3;</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clientId = 3;</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clientId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <code>string clientId = 3;</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientId_ = value;
      onChanged();
      return this;
    }

    private int accountType_ = 0;
    /**
     * <code>.br.com.zup.AccountType accountType = 4;</code>
     * @return The enum numeric value on the wire for accountType.
     */
    @java.lang.Override public int getAccountTypeValue() {
      return accountType_;
    }
    /**
     * <code>.br.com.zup.AccountType accountType = 4;</code>
     * @param value The enum numeric value on the wire for accountType to set.
     * @return This builder for chaining.
     */
    public Builder setAccountTypeValue(int value) {
      
      accountType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.AccountType accountType = 4;</code>
     * @return The accountType.
     */
    @java.lang.Override
    public br.com.zup.AccountType getAccountType() {
      @SuppressWarnings("deprecation")
      br.com.zup.AccountType result = br.com.zup.AccountType.valueOf(accountType_);
      return result == null ? br.com.zup.AccountType.UNRECOGNIZED : result;
    }
    /**
     * <code>.br.com.zup.AccountType accountType = 4;</code>
     * @param value The accountType to set.
     * @return This builder for chaining.
     */
    public Builder setAccountType(br.com.zup.AccountType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      accountType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.AccountType accountType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountType() {
      
      accountType_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:br.com.zup.KeymgrRegistryRequest)
  }

  // @@protoc_insertion_point(class_scope:br.com.zup.KeymgrRegistryRequest)
  private static final br.com.zup.KeymgrRegistryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zup.KeymgrRegistryRequest();
  }

  public static br.com.zup.KeymgrRegistryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeymgrRegistryRequest>
      PARSER = new com.google.protobuf.AbstractParser<KeymgrRegistryRequest>() {
    @java.lang.Override
    public KeymgrRegistryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeymgrRegistryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeymgrRegistryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeymgrRegistryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zup.KeymgrRegistryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
