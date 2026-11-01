package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public interface Tf {
    void a(Runnable runnable);

    void a(Runnable runnable, long j10);

    static /* synthetic */ void a(Tf tf2, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        tf2.a(runnable, j10);
    }
}
