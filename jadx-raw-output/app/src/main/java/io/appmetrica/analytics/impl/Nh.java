package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class Nh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55639b;

    public Nh(C4248hi c4248hi, String str) {
        this.f55639b = c4248hi;
        this.f55638a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55639b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).setUserProfileID(this.f55638a);
    }
}
