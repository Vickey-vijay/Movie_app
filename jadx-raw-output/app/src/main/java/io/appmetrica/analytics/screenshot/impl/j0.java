package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f58436b;

    public j0(boolean z10, k0 k0Var) {
        this.f58435a = z10;
        this.f58436b = k0Var;
    }

    public final k0 a() {
        return this.f58436b;
    }

    public final boolean b() {
        return this.f58435a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f58435a + ", config=" + this.f58436b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(J j10) {
        boolean zB = j10.b();
        W wA = j10.a();
        this(zB, wA != null ? new k0(wA) : null);
    }
}
