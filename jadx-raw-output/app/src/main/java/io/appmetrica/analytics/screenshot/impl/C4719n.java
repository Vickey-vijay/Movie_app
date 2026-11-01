package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4719n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58451b;

    public C4719n(boolean z10, long j10) {
        this.f58450a = z10;
        this.f58451b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(C4719n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C4719n c4719n = (C4719n) obj;
        return this.f58450a == c4719n.f58450a && this.f58451b == c4719n.f58451b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58451b) + (Boolean.hashCode(this.f58450a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f58450a + ", delaySeconds=" + this.f58451b + ')';
    }

    public C4719n(H h10) {
        this(h10.b(), h10.a());
    }
}
