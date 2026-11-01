package com.yandex.div.core.state;

import ck.i;

/* JADX INFO: compiled from: DivStatePath.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class PathFormatException extends Exception {
    public PathFormatException(String str, Throwable th2) {
        super(str, th2);
    }

    public /* synthetic */ PathFormatException(String str, Throwable th2, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
