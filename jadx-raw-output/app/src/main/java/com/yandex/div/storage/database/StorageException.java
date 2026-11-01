package com.yandex.div.storage.database;

import ck.i;

/* JADX INFO: compiled from: StorageException.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class StorageException extends Exception {
    private final String cardId;

    public StorageException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ StorageException(String str, Throwable th2, String str2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? null : str2);
    }

    public StorageException(String str, Throwable th2, String str2) {
        super(str, th2);
        this.cardId = str2;
    }

    public final String getCardId() {
        return this.cardId;
    }
}
