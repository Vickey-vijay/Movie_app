package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class lv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f79934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f79935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final az1 f79936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f79937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sx f79938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final we f79939f;

    public lv(v9 v9Var, d4 d4Var, az1 az1Var, io2 io2Var, sx sxVar, we weVar) {
        this.f79934a = v9Var;
        this.f79935b = d4Var;
        this.f79936c = az1Var;
        this.f79937d = io2Var;
        this.f79938e = sxVar;
        this.f79939f = weVar;
    }

    public final eo2 a(co2 co2Var, Map map) {
        Map linkedHashMap = null;
        if (!ck.x.m(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = bo2.f75924a;
        if (str == null) {
            map.put(Q6.G1, "undefined");
        } else {
            map.put(Q6.G1, str);
        }
        fo2 fo2VarA = this.f79938e.a(this.f79934a, this.f79935b);
        c cVar = fo2VarA.f77472b;
        Map mapQ = kotlin.collections.a.q(map, fo2VarA.f77471a);
        if (ck.x.m(mapQ)) {
            linkedHashMap = mapQ;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        a03 a03Var = this.f79935b.f76562d.f75685a;
        if (a03Var != null) {
            String str2 = a03Var.b().f85668b;
            if (str2 == null) {
                linkedHashMap.put("size_type", "undefined");
            } else {
                linkedHashMap.put("size_type", str2);
            }
            linkedHashMap.put("width", Integer.valueOf(a03Var.getWidth()));
            linkedHashMap.put("height", Integer.valueOf(a03Var.getHeight()));
        }
        az1 az1Var = this.f79936c;
        if (az1Var != null) {
            Map mapD = nj.l0.d();
            mapD.put("asset_name", az1Var.f75663a);
            mapD.put("action_type", az1Var.f75664b);
            i22 i22Var = az1Var.f75665c;
            if (i22Var != null) {
                mapD.putAll(i22Var.a().f77471a);
            }
            Map map2 = az1Var.f75666d.f84932a;
            if (map2 != null) {
                mapD.putAll(map2);
            }
            linkedHashMap.putAll(nj.l0.c(mapD));
        }
        return new eo2(co2Var.f76376b, kotlin.collections.a.B(linkedHashMap), cVar);
    }
}
