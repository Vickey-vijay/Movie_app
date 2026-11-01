package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public class Kn implements Hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55490c = 0;

    public final void c() {
        this.f55490c = 0;
    }

    public final int a() {
        return this.f55489b;
    }

    public final boolean b() {
        int i10 = this.f55490c;
        this.f55490c = i10 + 1;
        return i10 < this.f55488a;
    }

    public Kn(int i10, int i11) {
        this.f55488a = i10;
        this.f55489b = i11;
    }
}
