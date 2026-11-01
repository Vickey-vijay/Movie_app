package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58413b;

    public a0(boolean z10, long j10) {
        this.f58412a = z10;
        this.f58413b = j10;
    }

    public final long a() {
        return this.f58413b;
    }

    public final boolean b() {
        return this.f58412a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f58412a + ", delaySeconds=" + this.f58413b + ')';
    }

    public a0() {
        this(new P().f58388a, new P().f58389b);
    }
}
