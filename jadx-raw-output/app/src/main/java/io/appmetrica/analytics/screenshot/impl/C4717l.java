package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4717l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4718m f58444b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(C4717l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C4717l c4717l = (C4717l) obj;
        return this.f58443a == c4717l.f58443a && ck.p.e(this.f58444b, c4717l.f58444b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f58443a) * 31;
        C4718m c4718m = this.f58444b;
        return iHashCode + (c4718m != null ? c4718m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f58443a + ", config=" + this.f58444b + ')';
    }

    public C4717l(boolean z10, C4718m c4718m) {
        this.f58443a = z10;
        this.f58444b = c4718m;
    }
}
