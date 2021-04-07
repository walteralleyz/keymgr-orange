package br.com.zup.pix.remove;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lbr/com/zup/pix/remove/RemoveValidatedRequest;", "", "pixId", "", "clientId", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getPixId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toResponse", "Lbr/com/zup/KeymgrExcludeResponse;", "kotlin.jvm.PlatformType", "toString", "keymgr"})
@br.com.zup.annotation.PixAndClient(message = "Chave pix com o cliente, n\u00e3o encontrada", domain = "Pix")
@io.micronaut.core.annotation.Introspected()
public final class RemoveValidatedRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pixId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientId = null;
    
    public final br.com.zup.KeymgrExcludeResponse toResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPixId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientId() {
        return null;
    }
    
    public RemoveValidatedRequest(@org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 77)
    @javax.validation.constraints.NotBlank()
    java.lang.String pixId, @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String clientId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.pix.remove.RemoveValidatedRequest copy(@org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 77)
    @javax.validation.constraints.NotBlank()
    java.lang.String pixId, @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String clientId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}