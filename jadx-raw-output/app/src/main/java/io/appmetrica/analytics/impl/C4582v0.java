package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4582v0 implements Ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f57781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f57782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4182f4 f57783c;

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(@Nullable AppMetricaConfig appMetricaConfig, @NonNull Ua ua2) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final C4182f4 a() {
        return this.f57783c;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final Handler b() {
        return this.f57781a;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final T1 c() {
        return new T1();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final C4344lb d() {
        return new C4344lb();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.f57782b;
    }

    public C4582v0() {
        IHandlerExecutor iHandlerExecutorA = C4105c4.l().g().a();
        this.f57782b = iHandlerExecutorA;
        this.f57781a = iHandlerExecutorA.getHandler();
        this.f57783c = new C4182f4();
    }
}
