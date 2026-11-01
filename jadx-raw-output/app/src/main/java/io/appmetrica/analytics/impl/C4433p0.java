package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4433p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f57461k = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f57463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IAppMetricaService f57465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f57466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f57467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G1 f57468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H1 f57469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RunnableC4383n0 f57470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ServiceConnectionC4408o0 f57471j;

    public C4433p0(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C4105c4.l().e(), new H1());
    }

    public final synchronized boolean a() {
        return this.f57465d != null;
    }

    public final void a(Long l10) {
        try {
            synchronized (this) {
                CountDownLatch countDownLatch = this.f57466e;
                if (countDownLatch == null) {
                    return;
                }
                countDownLatch.await(l10.longValue(), TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused) {
        }
    }

    public final void b() {
        synchronized (this.f57467f) {
            this.f57463b.remove(this.f57470i);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f57463b;
        synchronized (this.f57467f) {
            iCommonExecutor.remove(this.f57470i);
            if (!this.f57464c) {
                iCommonExecutor.executeDelayed(this.f57470i, f57461k);
            }
        }
    }

    public C4433p0(Context context, ICommonExecutor iCommonExecutor, G1 g10, H1 h10) {
        this.f57465d = null;
        this.f57467f = new Object();
        this.f57470i = new RunnableC4383n0(this);
        this.f57471j = new ServiceConnectionC4408o0(this);
        this.f57462a = context.getApplicationContext();
        this.f57463b = iCommonExecutor;
        this.f57464c = false;
        this.f57468g = g10;
        this.f57469h = h10;
    }
}
