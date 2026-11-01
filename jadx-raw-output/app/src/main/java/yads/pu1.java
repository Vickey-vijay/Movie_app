package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@xk.f
public final class pu1 {
    public static final ou1 Companion = new ou1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xk.b[] f81600e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f81602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f81603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f81604d;

    public /* synthetic */ pu1(int i10, long j10, Integer num, Map map, String str) {
        if (15 != (i10 & 15)) {
            bl.o1.a(i10, 15, nu1.f80809a.getDescriptor());
        }
        this.f81601a = j10;
        this.f81602b = num;
        this.f81603c = map;
        this.f81604d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu1)) {
            return false;
        }
        pu1 pu1Var = (pu1) obj;
        return this.f81601a == pu1Var.f81601a && ck.p.e(this.f81602b, pu1Var.f81602b) && ck.p.e(this.f81603c, pu1Var.f81603c) && ck.p.e(this.f81604d, pu1Var.f81604d);
    }

    static {
        bl.d2 d2Var = bl.d2.f5397a;
        f81600e = new xk.b[]{null, null, new bl.u0(d2Var, yk.a.t(d2Var)), null};
    }

    public pu1(long j10, Integer num, Map map, String str) {
        this.f81601a = j10;
        this.f81602b = num;
        this.f81603c = map;
        this.f81604d = str;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f81601a) * 31;
        Integer num = this.f81602b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.f81603c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f81604d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.f81601a + ", statusCode=" + this.f81602b + ", headers=" + this.f81603c + ", body=" + this.f81604d + ")";
    }
}
