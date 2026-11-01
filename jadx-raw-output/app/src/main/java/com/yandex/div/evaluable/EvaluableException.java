package com.yandex.div.evaluable;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes9.dex */
public class EvaluableException extends RuntimeException {
    public /* synthetic */ EvaluableException(String str, Exception exc, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvaluableException(String str, Exception exc) {
        super(str, exc);
        p.j(str, "message");
    }
}
