package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class Wb implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f23740a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        this.f23740a.post(runnable);
    }
}
