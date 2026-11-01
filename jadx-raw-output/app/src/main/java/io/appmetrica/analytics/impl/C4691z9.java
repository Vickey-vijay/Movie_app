package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4691z9 implements ExecutorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4353lk f58044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f58045b;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f58044a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + Ad.f54959a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f58045b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.f58044a.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C4353lk c4353lk = this.f58044a;
        if (c4353lk.f57230f == null) {
            synchronized (c4353lk) {
                if (c4353lk.f57230f == null) {
                    c4353lk.f57225a.getClass();
                    HandlerThreadC4138db handlerThreadC4138dbA = A9.a("IAA-SIO");
                    c4353lk.f57230f = new A9(handlerThreadC4138dbA, handlerThreadC4138dbA.getLooper(), new Handler(handlerThreadC4138dbA.getLooper()));
                }
            }
        }
        return c4353lk.f57230f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        C4353lk c4353lk = this.f58044a;
        if (c4353lk.f57232h == null) {
            synchronized (c4353lk) {
                if (c4353lk.f57232h == null) {
                    c4353lk.f57225a.getClass();
                    c4353lk.f57232h = new ExecutorC4301jk(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return c4353lk.f57232h;
    }

    public C4691z9() {
        C4353lk c4353lkW = C4418oa.k().w();
        this.f58044a = c4353lkW;
        this.f58045b = c4353lkW.b();
    }
}
