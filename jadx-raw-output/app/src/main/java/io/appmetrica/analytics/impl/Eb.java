package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Eb;

/* JADX INFO: loaded from: classes5.dex */
public final class Eb implements InterfaceC4100c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4204g0 f55176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final En f55177b = new En();

    public static final void a(Eb eb2, V v10) {
        eb2.f55176a.a(v10);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4100c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArrB;
        En en2 = this.f55177b;
        Thread threadA = en2.f55207a.a();
        try {
            stackTraceElementArrB = en2.f55207a.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        final V v10 = new V((C4655xn) en2.f55208b.apply(threadA, stackTraceElementArrB), en2.a(threadA, null), en2.f55209c.a());
        ((A9) C4105c4.l().f56438c.a()).f54955b.post(new Runnable() { // from class: af.b
            @Override // java.lang.Runnable
            public final void run() {
                Eb.a(this.f3542b, v10);
            }
        });
    }

    public Eb(InterfaceC4204g0 interfaceC4204g0) {
        this.f55176a = interfaceC4204g0;
    }
}
