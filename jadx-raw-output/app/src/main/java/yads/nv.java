package yads;

import android.content.Context;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class nv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f80813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f80814b;

    public nv(d4 d4Var, lu2 lu2Var) {
        this.f80813a = d4Var;
        this.f80814b = lu2Var;
    }

    public final void a(Context context, e00 e00Var, ih2 ih2Var, Long l10) {
        Map mapJ = kotlin.collections.a.j();
        if (!ck.x.m(mapJ)) {
            mapJ = null;
        }
        if (mapJ == null) {
            mapJ = new LinkedHashMap();
        }
        String str = "undefined";
        if (e00Var == null) {
            mapJ.put("ad_type", "undefined");
        } else {
            mapJ.put("ad_type", e00Var);
        }
        if (l10 == null) {
            mapJ.put("duration", "undefined");
        } else {
            mapJ.put("duration", l10);
        }
        LinkedHashMap linkedHashMapA = kh2.a(ih2Var);
        mapJ.putAll(linkedHashMapA);
        String str2 = (String) linkedHashMapA.get(Q6.G1);
        aq2 aq2Var = new aq2();
        n9 n9Var = new n9();
        d4 d4Var = this.f80813a;
        fo2 fo2VarB = aq2Var.b(null, d4Var);
        fo2 fo2VarA = n9Var.a(d4Var.f76563e);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ck.x.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i10 = d4Var.f76572n;
        if (i10 != 1) {
            if (i10 == 2) {
                str = C3426d4.i.C;
            }
        } else {
            str = C3426d4.i.D;
        }
        linkedHashMap.put("orientation", str);
        fo2 fo2VarA2 = go2.a(fo2VarB, fo2VarA);
        c cVar = fo2VarA2.f77472b;
        if (cVar == null) {
            cVar = null;
        }
        fo2 fo2Var = new fo2(kotlin.collections.a.q(fo2VarA2.f77471a, linkedHashMap), cVar);
        c cVar2 = fo2Var.f77472b;
        Map mapQ = kotlin.collections.a.q(mapJ, fo2Var.f77471a);
        if (!ck.x.m(mapQ)) {
            mapQ = null;
        }
        if (mapQ == null) {
            mapQ = new LinkedHashMap();
        }
        co2 co2Var = co2.I;
        Map mapB = kotlin.collections.a.B(mapQ);
        eo2 eo2Var = new eo2("client_bidding_loading_result", mapB, cVar2);
        ((iu3) this.f80814b).getClass();
        pu3 pu3Var = pu3.f81606a;
        cf.a(context, new cq3(((iu3) this.f80814b).f78817a)).a(eo2Var);
        new we(context).a(co2Var, mapB, str2, null);
    }
}
