package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gb f54951a;

    public A4() {
        this(C4418oa.k().l());
    }

    public static F4 a(C4661y4 c4661y4) {
        return new F4(new D4(c4661y4), c4661y4);
    }

    public A4(Gb gb2) {
        this.f54951a = gb2;
    }

    public final C4381mn a(C4661y4 c4661y4, Bm bm2) {
        C4381mn c4381mn = new C4381mn(c4661y4, new Jg(bm2));
        Gb gb2 = this.f54951a;
        synchronized (gb2) {
            gb2.f55264c.add(c4381mn);
        }
        return c4381mn;
    }
}
