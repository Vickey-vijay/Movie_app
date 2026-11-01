package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC4145di implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56599c;

    public RunnableC4145di(C4248hi c4248hi, String str, String str2) {
        this.f56599c = c4248hi;
        this.f56597a = str;
        this.f56598b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56599c;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).putAppEnvironmentValue(this.f56597a, this.f56598b);
    }
}
