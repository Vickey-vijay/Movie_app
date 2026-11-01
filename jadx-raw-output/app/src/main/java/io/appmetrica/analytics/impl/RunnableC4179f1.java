package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC4179f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56707b;

    public RunnableC4179f1(C4558u1 c4558u1, String str) {
        this.f56707b = c4558u1;
        this.f56706a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f56707b).b(this.f56706a);
    }
}
