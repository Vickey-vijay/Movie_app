package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4715j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58434a;

    public C4715j(boolean z10) {
        this.f58434a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(C4715j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f58434a == ((C4715j) obj).f58434a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58434a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f58434a + ')';
    }

    public C4715j(C4730z c4730z) {
        this(c4730z.a());
    }
}
