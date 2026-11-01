package com.yandex.div.core.state;

import ck.i;

/* JADX INFO: compiled from: DivPathUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class StateConflictException extends Exception {
    public StateConflictException(String str, Throwable th2) {
        super(str, th2);
    }

    public /* synthetic */ StateConflictException(String str, Throwable th2, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
