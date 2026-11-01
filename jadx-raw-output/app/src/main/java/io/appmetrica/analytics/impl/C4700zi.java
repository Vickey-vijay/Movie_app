package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4700zi implements InterfaceC4172ek {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C4675yi f58049e = new C4675yi();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f58050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f58051g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4433p0 f58052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zj f58053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeProvider f58054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f58055d;

    @VisibleForTesting
    public C4700zi(C4433p0 c4433p0, Zj zj2, TimeProvider timeProvider) {
        this.f58052a = c4433p0;
        this.f58053b = zj2;
        this.f58054c = timeProvider;
        this.f58055d = C4105c4.l().g().b();
    }

    public final void a(C4624wh c4624wh) {
        AbstractCallableC4674yh qg2;
        ICommonExecutor iCommonExecutor = this.f58055d;
        if (c4624wh.f57888b) {
            Zj zj2 = this.f58053b;
            qg2 = new C4133d6(zj2.f56295a, zj2.f56296b, zj2.f56297c, c4624wh);
        } else {
            Zj zj3 = this.f58053b;
            qg2 = new Qg(zj3.f56296b, zj3.f56297c, c4624wh);
        }
        iCommonExecutor.submit(qg2);
    }

    public final void b(C4624wh c4624wh) {
        long jUptimeMillis = this.f58054c.uptimeMillis();
        Zj zj2 = this.f58053b;
        C4133d6 c4133d6 = new C4133d6(zj2.f56295a, zj2.f56296b, zj2.f56297c, c4624wh);
        long j10 = ck.p.e(Looper.myLooper(), Looper.getMainLooper()) ? f58050f : f58051g;
        if (this.f58052a.a()) {
            try {
                this.f58055d.submit(c4133d6).get(j10, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c4133d6.f58031c) {
            return;
        }
        try {
            c4133d6.a();
            Thread.sleep(Math.max(0L, j10 - (this.f58054c.uptimeMillis() - jUptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f58050f = timeUnit.toMillis(1L);
        f58051g = timeUnit.toMillis(4L);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4172ek
    public final void reportData(int i10, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f58055d;
        Zj zj2 = this.f58053b;
        iCommonExecutor.submit(new On(zj2.f56296b, zj2.f56297c, i10, bundle));
    }

    public C4700zi(C4433p0 c4433p0, Zj zj2) {
        this(c4433p0, zj2, new SystemTimeProvider());
    }

    public final void a(Cf cf2) {
        ICommonExecutor iCommonExecutor = this.f58055d;
        Zj zj2 = this.f58053b;
        iCommonExecutor.submit(new C4521se(zj2.f56296b, zj2.f56297c, cf2));
    }

    public final void b(Cf cf2) {
        ICommonExecutor iCommonExecutor = this.f58055d;
        Zj zj2 = this.f58053b;
        iCommonExecutor.submit(new Fi(zj2.f56296b, zj2.f56297c, cf2));
    }
}
