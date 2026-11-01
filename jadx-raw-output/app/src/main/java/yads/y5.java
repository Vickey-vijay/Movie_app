package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f84819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f84820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc2 f84821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final we f84822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ep2 f84823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fq2 f84824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84825g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y5(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f81606a;
        this(d4Var, cf.a(context, iu3Var.b()), new x5(w5Var), new we(context));
    }

    public final void a(Object... objArr) {
        boolean z10 = false;
        for (Object obj : objArr) {
            if (obj != null) {
                z10 = true;
                break;
            }
        }
        this.f84825g = z10;
    }

    public final void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("status", "error");
        map.put("failure_reason", str);
        map.put("reason", str2);
        map.put("durations", this.f84821c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f84825g));
        a(map);
    }

    public y5(d4 d4Var, io2 io2Var, qc2 qc2Var, we weVar) {
        this.f84819a = d4Var;
        this.f84820b = io2Var;
        this.f84821c = qc2Var;
        this.f84822d = weVar;
    }

    public final void a(HashMap map) {
        fo2 fo2Var = new fo2(map, 2);
        ep2 ep2Var = this.f84823e;
        if (ep2Var != null) {
            fo2Var.f77471a.putAll(ep2Var.a());
        }
        fq2 fq2Var = this.f84824f;
        if (fq2Var != null) {
            fo2Var = go2.a(fo2Var, ((i12) fq2Var).a());
        }
        co2 co2Var = co2.f76352c;
        Map map2 = fo2Var.f77471a;
        c cVar = fo2Var.f77472b;
        Map mapB = kotlin.collections.a.B(map2);
        this.f84820b.a(new eo2("ad_loading_result", mapB, cVar));
        if (ck.p.e(map.get("status"), "success")) {
            we weVar = this.f84822d;
            String str = this.f84819a.f76570l;
            if (str == null) {
                str = bo2.f75924a;
            }
            weVar.a(co2Var, mapB, str, null);
        }
    }

    public final void a() {
        HashMap map = new HashMap();
        map.put("status", "success");
        map.put("durations", this.f84821c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f84825g));
        a(map);
    }
}
