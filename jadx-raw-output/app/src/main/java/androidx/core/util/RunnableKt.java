package androidx.core.util;

import mj.r;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(rj.c<? super r> cVar) {
        return new ContinuationRunnable(cVar);
    }
}
