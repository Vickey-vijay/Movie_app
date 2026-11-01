package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4501rj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f57611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f57612c;

    public C4501rj(String str, String str2, Throwable th2) {
        this.f57610a = str;
        this.f57611b = str2;
        this.f57612c = th2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportError(this.f57610a, this.f57611b, this.f57612c);
    }
}
