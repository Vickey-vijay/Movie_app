package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f54759b;

    public static class ActivationBarrierHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f54760a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f54761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f54762c;

        public void subscribeIfNeeded(long j10, @NonNull ICommonExecutor iCommonExecutor) {
            if (this.f54760a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f54762c.subscribe(j10, iCommonExecutor, this.f54761b);
            }
        }

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f54761b = new a(this, runnable);
            this.f54762c = waitForActivationDelayBarrier;
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f54759b = systemTimeProvider;
    }

    public void activate() {
        this.f54758a = this.f54759b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j10, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j10 - (this.f54759b.currentTimeMillis() - this.f54758a), 0L));
    }
}
