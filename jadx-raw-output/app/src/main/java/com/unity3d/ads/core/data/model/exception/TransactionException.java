package com.unity3d.ads.core.data.model.exception;

import ck.p;

/* JADX INFO: compiled from: TransactionException.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TransactionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionException(String str) {
        super(str);
        p.j(str, "message");
    }
}
