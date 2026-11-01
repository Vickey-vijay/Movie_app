package yads;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class y52 implements fg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f84827a;

    @Override // yads.fg3
    public final Map a() {
        Pair[] pairArr = new Pair[2];
        String str = this.f84827a.f76561c.f78158a;
        if (str == null || lk.a0.n0(str)) {
            str = "undefined";
        }
        pairArr[0] = mj.h.a("ad_unit_id", str);
        pairArr[1] = mj.h.a("ad_type", this.f84827a.f76559a.f76868b);
        return kotlin.collections.a.m(pairArr);
    }

    public y52(d4 d4Var) {
        this.f84827a = d4Var;
    }
}
