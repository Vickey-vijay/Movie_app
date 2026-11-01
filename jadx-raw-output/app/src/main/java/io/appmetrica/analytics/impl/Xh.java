package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class Xh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f56163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56164c;

    public Xh(C4248hi c4248hi, String str, byte[] bArr) {
        this.f56164c = c4248hi;
        this.f56162a = str;
        this.f56163b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56164c;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).setSessionExtra(this.f56162a, this.f56163b);
    }
}
