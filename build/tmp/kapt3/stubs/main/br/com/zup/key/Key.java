package br.com.zup.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0018"}, d2 = {"Lbr/com/zup/key/Key;", "", "pixKeyId", "", "pixKeyType", "Lbr/com/zup/KeyType;", "clientId", "accountType", "Lbr/com/zup/AccountType;", "(Ljava/lang/String;Lbr/com/zup/KeyType;Ljava/lang/String;Lbr/com/zup/AccountType;)V", "getAccountType", "()Lbr/com/zup/AccountType;", "getClientId", "()Ljava/lang/String;", "id", "", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPixKeyId", "getPixKeyType", "()Lbr/com/zup/KeyType;", "toResponse", "Lbr/com/zup/KeymgrRegistryResponse;", "keymgr"})
@javax.persistence.Table(name = "keys")
@javax.persistence.Entity()
public final class Key {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(unique = true)
    private final java.lang.String pixKeyId = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.zup.KeyType pixKeyType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientId = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.zup.AccountType accountType = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.KeymgrRegistryResponse toResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPixKeyId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.KeyType getPixKeyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.AccountType getAccountType() {
        return null;
    }
    
    public Key(@org.jetbrains.annotations.NotNull()
    java.lang.String pixKeyId, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeyType pixKeyType, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    br.com.zup.AccountType accountType) {
        super();
    }
}