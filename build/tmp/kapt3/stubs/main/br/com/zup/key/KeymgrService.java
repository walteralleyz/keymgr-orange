package br.com.zup.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/key/KeymgrService;", "", "repository", "Lbr/com/zup/repository/KeyRepository;", "client", "Lbr/com/zup/account/AccountClient;", "(Lbr/com/zup/repository/KeyRepository;Lbr/com/zup/account/AccountClient;)V", "create", "Lbr/com/zup/KeymgrRegistryResponse;", "req", "Lbr/com/zup/key/KeyValidatedRequest;", "keymgr"})
@javax.inject.Singleton()
@io.micronaut.validation.Validated()
public class KeymgrService {
    private final br.com.zup.repository.KeyRepository repository = null;
    private final br.com.zup.account.AccountClient client = null;
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.KeymgrRegistryResponse create(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    br.com.zup.key.KeyValidatedRequest req) {
        return null;
    }
    
    public KeymgrService(@org.jetbrains.annotations.NotNull()
    br.com.zup.repository.KeyRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.zup.account.AccountClient client) {
        super();
    }
}