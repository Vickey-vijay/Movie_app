package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class td3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kg3 f82984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ip3 f82985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f82986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f82988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f82989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f82990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ol3 f82991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f82992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f82993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f82994l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f82995m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f82996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public de3 f82997o;

    public final td3 a(Map map) {
        if (map == null) {
            map = kotlin.collections.a.j();
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List listK = (List) entry.getValue();
            if (listK == null) {
                listK = nj.s.k();
            }
            for (String str2 : nj.b0.c0(listK)) {
                LinkedHashMap linkedHashMap = this.f82996n;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(str2);
            }
        }
        return this;
    }

    public td3(boolean z10, kg3 kg3Var) {
        this.f82983a = z10;
        this.f82984b = kg3Var;
        kotlin.collections.a.j();
        this.f82996n = new LinkedHashMap();
        this.f82997o = new de3();
    }

    public final ud3 a() {
        kg3 kg3Var = this.f82984b;
        Map mapB = this.f82996n;
        ol3 ol3Var = this.f82991i;
        kg3Var.getClass();
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(kg3Var.f79411a);
        if (nt2VarA == null || !nt2VarA.f80777l) {
            mapB = kotlin.collections.a.B(mapB);
            List list = ol3Var != null ? ol3Var.f81099a : null;
            List list2 = (List) mapB.get("impression");
            if (list != null) {
                mapB.put("impression", list);
            } else {
                mapB.remove("impression");
            }
            if (list2 != null) {
                mapB.put("render_impression", list2);
            } else {
                mapB.remove("render_impression");
            }
        }
        return new ud3(this.f82983a, this.f82994l, this.f82996n, this.f82997o, this.f82986d, this.f82987e, this.f82988f, this.f82989g, this.f82990h, this.f82991i, this.f82992j, this.f82993k, this.f82985c, this.f82995m, mapB);
    }
}
