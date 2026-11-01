package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58446b;

    public l0(boolean z10, long j10) {
        this.f58445a = z10;
        this.f58446b = j10;
    }

    public final long a() {
        return this.f58446b;
    }

    public final boolean b() {
        return this.f58445a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f58445a + ", delaySeconds=" + this.f58446b + ')';
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
