package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@xk.f
public final class mu1 {
    public static final lu1 Companion = new lu1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xk.b[] f80390f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f80391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f80394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f80395e;

    public /* synthetic */ mu1(int i10, long j10, String str, String str2, Map map, String str3) {
        if (31 != (i10 & 31)) {
            bl.o1.a(i10, 31, ku1.f79571a.getDescriptor());
        }
        this.f80391a = j10;
        this.f80392b = str;
        this.f80393c = str2;
        this.f80394d = map;
        this.f80395e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu1)) {
            return false;
        }
        mu1 mu1Var = (mu1) obj;
        return this.f80391a == mu1Var.f80391a && ck.p.e(this.f80392b, mu1Var.f80392b) && ck.p.e(this.f80393c, mu1Var.f80393c) && ck.p.e(this.f80394d, mu1Var.f80394d) && ck.p.e(this.f80395e, mu1Var.f80395e);
    }

    static {
        bl.d2 d2Var = bl.d2.f5397a;
        f80390f = new xk.b[]{null, null, null, new bl.u0(d2Var, yk.a.t(d2Var)), null};
    }

    public mu1(long j10, String str, String str2, Map map, String str3) {
        this.f80391a = j10;
        this.f80392b = str;
        this.f80393c = str2;
        this.f80394d = map;
        this.f80395e = str3;
    }

    public final int hashCode() {
        int iA = k4.a(this.f80393c, k4.a(this.f80392b, Long.hashCode(this.f80391a) * 31, 31), 31);
        Map map = this.f80394d;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f80395e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkRequestLog(timestamp=" + this.f80391a + ", method=" + this.f80392b + ", url=" + this.f80393c + ", headers=" + this.f80394d + ", body=" + this.f80395e + ")";
    }
}
