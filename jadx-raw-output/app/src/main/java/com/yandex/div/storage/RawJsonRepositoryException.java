package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;

/* JADX INFO: compiled from: RawJsonRepositoryException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RawJsonRepositoryException extends Exception {
    private final String jsonId;

    public final String getJsonId() {
        return this.jsonId;
    }

    public RawJsonRepositoryException(StorageException storageException) {
        super(storageException.getMessage(), storageException);
        this.jsonId = storageException.getCardId();
    }
}
