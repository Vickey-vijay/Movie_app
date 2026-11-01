package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f22 implements t22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aq2 f77278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f77279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f77280c;

    public /* synthetic */ f22() {
        this(new aq2(), new n9(), new wy());
    }

    @Override // yads.t22
    public final fo2 a(v9 v9Var, d4 d4Var, d12 d12Var) {
        aq2 aq2Var = this.f77278a;
        fo2 fo2VarA = aq2Var.a(v9Var, d4Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ck.x.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (d12Var != null) {
            List listA = aq2Var.f75595b.a(d12Var);
            if (!listA.isEmpty()) {
                linkedHashMap.put("image_sizes", listA);
            }
            aq2Var.f75595b.getClass();
            List list = d12Var.f76509a;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((fy1) it.next()).f77545a.f76407b);
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("native_ad_types", arrayList);
            }
            aq2Var.f75595b.getClass();
            ArrayList arrayListB = g12.b(d12Var);
            Object objH0 = nj.b0.h0(arrayListB);
            if (objH0 == null) {
                linkedHashMap.put(CreativeInfo.f44321c, "undefined");
            } else {
                linkedHashMap.put(CreativeInfo.f44321c, objH0);
            }
            if (!(!arrayListB.isEmpty())) {
                arrayListB = null;
            }
            if (arrayListB == null) {
                linkedHashMap.put("ad_ids", "undefined");
            } else {
                linkedHashMap.put("ad_ids", arrayListB);
            }
        }
        c cVar = fo2VarA.f77472b;
        if (cVar == null) {
            cVar = null;
        }
        Map mapQ = kotlin.collections.a.q(fo2VarA.f77471a, linkedHashMap);
        if (!ck.x.m(mapQ)) {
            mapQ = null;
        }
        if (mapQ == null) {
            mapQ = new LinkedHashMap();
        }
        fo2 fo2VarA2 = this.f77279b.a(d4Var.f76563e);
        fo2 fo2VarA3 = this.f77280c.a(d4Var);
        if (cVar == null) {
            cVar = fo2VarA2.f77472b;
        }
        Map mapQ2 = kotlin.collections.a.q(mapQ, fo2VarA2.f77471a);
        Map linkedHashMap2 = ck.x.m(mapQ2) ? mapQ2 : null;
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        if (cVar == null) {
            cVar = fo2VarA3.f77472b;
        }
        return new fo2(kotlin.collections.a.q(linkedHashMap2, fo2VarA3.f77471a), cVar);
    }

    public f22(aq2 aq2Var, n9 n9Var, wy wyVar) {
        this.f77278a = aq2Var;
        this.f77279b = n9Var;
        this.f77280c = wyVar;
    }
}
