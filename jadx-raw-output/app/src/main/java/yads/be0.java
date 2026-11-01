package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class be0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl2 f75790a;

    public /* synthetic */ be0() {
        this(new zl2());
    }

    public be0(zl2 zl2Var) {
        this.f75790a = zl2Var;
    }

    public final String a(String str, Map map) {
        Map mapQ = kotlin.collections.a.q(map, nj.l0.g(mj.h.a("{CLIENT_TIME}", String.valueOf(System.currentTimeMillis()))));
        this.f75790a.getClass();
        String strN = str;
        for (Map.Entry entry : mapQ.entrySet()) {
            strN = lk.x.N(strN, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strN;
    }
}
