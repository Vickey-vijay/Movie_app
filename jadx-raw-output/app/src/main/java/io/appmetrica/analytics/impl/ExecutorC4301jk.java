package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ExecutorC4301jk implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f57025a;

    public ExecutorC4301jk(Handler handler) {
        this.f57025a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f57025a.post(runnable);
    }
}
