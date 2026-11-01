package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC4153e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56628c;

    public RunnableC4153e1(C4558u1 c4558u1, String str, String str2) {
        this.f56628c = c4558u1;
        this.f56626a = str;
        this.f56627b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f56628c).b(this.f56626a, this.f56627b);
    }
}
