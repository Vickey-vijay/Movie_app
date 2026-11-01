package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class Zf implements Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4194fg f56288a;

    public Zf(C4194fg c4194fg) {
        this.f56288a = c4194fg;
    }

    @Override // io.appmetrica.analytics.impl.Xf
    @WorkerThread
    public final void a() {
        C4194fg c4194fg = this.f56288a;
        Aa aa2 = c4194fg.f56766b;
        Yf yf2 = new Yf(c4194fg);
        aa2.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC4692za(aa2));
            C4418oa.I.f57406d.f57225a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Ad.f54959a.incrementAndGet()).start();
            C4424og c4424og = (C4424og) futureTask.get(5L, TimeUnit.SECONDS);
            mo.a(aa2.f54958b);
            C4194fg.a(c4194fg, c4424og, C4194fg.a(c4194fg));
        } catch (Throwable th2) {
            try {
                yf2.a(th2);
            } finally {
                mo.a(aa2.f54958b);
            }
        }
    }
}
