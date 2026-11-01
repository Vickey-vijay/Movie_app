package com.yandex.div.data;

import ck.i;

/* JADX INFO: compiled from: VariableMutationException.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class VariableMutationException extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public VariableMutationException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VariableMutationException(String str, Throwable th2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
    }

    public VariableMutationException(String str, Throwable th2) {
        super(str, th2);
    }
}
