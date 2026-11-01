package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f85095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85096c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr1)) {
            return false;
        }
        yr1 yr1Var = (yr1) obj;
        return ck.p.e(this.f85094a, yr1Var.f85094a) && ck.p.e(this.f85095b, yr1Var.f85095b) && this.f85096c == yr1Var.f85096c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f85096c) + eb.a(this.f85095b, this.f85094a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnitSettings(adUnitId=" + this.f85094a + ", networks=" + this.f85095b + ", loadTimeoutMillis=" + this.f85096c + ")";
    }

    public yr1(long j10, String str, List list) {
        this.f85094a = str;
        this.f85095b = list;
        this.f85096c = j10;
    }
}
