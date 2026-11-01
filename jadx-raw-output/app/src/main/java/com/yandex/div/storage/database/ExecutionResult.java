package com.yandex.div.storage.database;

import java.util.List;

/* JADX INFO: compiled from: ExecutionResult.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ExecutionResult {
    private final List<StorageException> errors;

    public List<StorageException> getErrors() {
        return this.errors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResult(List<? extends StorageException> list) {
        this.errors = list;
    }
}
