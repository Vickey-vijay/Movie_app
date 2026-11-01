package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4434p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f57473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57474c;

    public RunnableC4434p1(C4558u1 c4558u1, String str, String str2) {
        this.f57474c = c4558u1;
        this.f57472a = str;
        this.f57473b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57474c).reportEvent(this.f57472a, this.f57473b);
    }
}
