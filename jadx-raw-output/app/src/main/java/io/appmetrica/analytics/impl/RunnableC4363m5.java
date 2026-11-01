package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4363m5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4089be f57247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4388n5 f57248b;

    public RunnableC4363m5(C4388n5 c4388n5, InterfaceC4089be interfaceC4089be) {
        this.f57248b = c4388n5;
        this.f57247a = interfaceC4089be;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f57248b) {
            C4388n5 c4388n5 = this.f57248b;
            Object obj = c4388n5.f57310a;
            if (obj == null) {
                c4388n5.f57311b.add(this.f57247a);
            } else {
                this.f57247a.consume(obj);
            }
        }
    }
}
