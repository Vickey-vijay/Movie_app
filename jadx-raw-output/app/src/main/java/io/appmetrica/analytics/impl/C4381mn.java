package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C4381mn implements InterfaceC4378mk, InterfaceC4616w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fa f57293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ll f57294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f57295c = new AtomicBoolean(false);

    public void a() {
    }

    public void g() {
    }

    public final void a(NetworkTask networkTask) {
        C4418oa.I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }

    public final void b() {
        if (this.f57295c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f57295c.get()) {
            return;
        }
        f();
        a();
    }

    public final Fa d() {
        return this.f57293a;
    }

    public final boolean e() {
        return this.f57295c.get();
    }

    public void f() {
        this.f57294b.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4378mk
    public final void onCreate() {
        this.f57295c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4378mk
    public final void onDestroy() {
        if (this.f57295c.compareAndSet(false, true)) {
            a();
        }
    }

    public C4381mn(Fa fa2, Ll ll2) {
        this.f57293a = fa2;
        this.f57294b = ll2;
        Objects.toString(fa2.b());
    }
}
