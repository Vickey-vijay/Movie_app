package com.yandex.div.core.expression.storedvalues;

import ck.i;

/* JADX INFO: compiled from: StoredValueDeclarationException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StoredValueDeclarationException extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public StoredValueDeclarationException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ StoredValueDeclarationException(String str, Throwable th2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
    }

    public StoredValueDeclarationException(String str, Throwable th2) {
        super(str, th2);
    }
}
