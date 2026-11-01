package yads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a21 extends ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho f75370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb3 f75371b;

    @Override // yads.ho
    public final y11 a(po2 po2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        u11 u11Var = u11.f83300c;
        map2.put("User-Agent", ((l53) this.f75371b.f77342a).a());
        return this.f75370a.a(po2Var, map2);
    }

    public a21(qt1 qt1Var, fb3 fb3Var) {
        this.f75370a = qt1Var;
        this.f75371b = fb3Var;
    }
}
