package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractCallableC4674yh implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4649xh f58028d = new C4649xh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4433p0 f58029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4070al f58030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58031c;

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th2) {
    }

    public final void a(boolean z10) {
        this.f58031c = z10;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f58031c) {
                return;
            }
            this.f58031c = true;
            int i10 = 0;
            do {
                C4433p0 c4433p0 = this.f58029a;
                synchronized (c4433p0) {
                    iAppMetricaService = c4433p0.f57465d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC4070al interfaceC4070al = this.f58030b;
                        if (interfaceC4070al == null || ((C4299ji) interfaceC4070al).a()) {
                            this.f58029a.c();
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i10++;
                if (!c() || P1.f55715e.get()) {
                    return;
                }
            } while (i10 < 3);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public final C4433p0 b() {
        return this.f58029a;
    }

    public boolean c() {
        C4433p0 c4433p0 = this.f58029a;
        synchronized (c4433p0) {
            if (c4433p0.f57465d == null) {
                c4433p0.f57466e = new CountDownLatch(1);
                Intent intentA = c4433p0.f57469h.a(c4433p0.f57462a);
                try {
                    c4433p0.f57468g.b(c4433p0.f57462a);
                    c4433p0.f57462a.bindService(intentA, c4433p0.f57471j, 1);
                } catch (Throwable unused) {
                }
            }
        }
        this.f58029a.a(5000L);
        return true;
    }

    public final boolean d() {
        return this.f58031c;
    }

    public AbstractCallableC4674yh(C4433p0 c4433p0, InterfaceC4070al interfaceC4070al) {
        this.f58029a = c4433p0;
        this.f58030b = interfaceC4070al;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return mj.r.f64562a;
    }
}
