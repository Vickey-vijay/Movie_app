package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4718m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4715j f58447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4719n f58448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4716k f58449c;

    public C4718m(C4715j c4715j, C4719n c4719n, C4716k c4716k) {
        this.f58447a = c4715j;
        this.f58448b = c4719n;
        this.f58449c = c4716k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(C4718m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C4718m c4718m = (C4718m) obj;
        return ck.p.e(this.f58447a, c4718m.f58447a) && ck.p.e(this.f58448b, c4718m.f58448b) && ck.p.e(this.f58449c, c4718m.f58449c);
    }

    public final int hashCode() {
        C4715j c4715j = this.f58447a;
        int iHashCode = (c4715j != null ? c4715j.hashCode() : 0) * 31;
        C4719n c4719n = this.f58448b;
        int iHashCode2 = (iHashCode + (c4719n != null ? c4719n.hashCode() : 0)) * 31;
        C4716k c4716k = this.f58449c;
        return iHashCode2 + (c4716k != null ? c4716k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f58447a + ", serviceCaptorConfig=" + this.f58448b + ", contentObserverCaptorConfig=" + this.f58449c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4718m(F f10) {
        C4730z c4730zA = f10.a();
        C4715j c4715j = c4730zA != null ? new C4715j(c4730zA) : null;
        H hC = f10.c();
        C4719n c4719n = hC != null ? new C4719n(hC) : null;
        B b10 = f10.b();
        this(c4715j, c4719n, b10 != null ? new C4716k(b10) : null);
    }
}
