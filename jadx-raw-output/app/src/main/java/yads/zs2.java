package yads;

import android.content.Context;
import com.ironsource.Q6;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f85579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f85580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9 f85581c;

    public zs2(d4 d4Var, lu2 lu2Var) {
        n9 n9Var = new n9();
        new aq2();
        new n9();
        new wy();
        this(d4Var, lu2Var, n9Var);
    }

    public final void a(Context context, v9 v9Var, co2 co2Var, fo2 fo2Var) {
        fy1 fy1Var;
        cq2 cq2Var;
        fo2 fo2VarA = this.f85581c.a(this.f85579a.f76563e);
        fo2VarA.b(v9Var.f83813e, "ad_unit_id");
        String str = bo2.f75924a;
        fo2VarA.b(str, Q6.G1);
        e00 e00Var = v9Var.f83809a;
        fo2VarA.b(e00Var != null ? e00Var.f76868b : null, "ad_type");
        d12 d12Var = (d12) v9Var.f83828t;
        if (d12Var != null) {
            List list = d12Var.f76509a;
            String str2 = (list == null || (fy1Var = (fy1) nj.b0.h0(list)) == null || (cq2Var = fy1Var.f77545a) == null) ? null : cq2Var.f76407b;
            if (str2 == null) {
                str2 = "";
            }
            fo2VarA.b(str2, "native_ad_type");
        }
        fo2VarA.b(v9Var.f83820l, "ad_source");
        fo2 fo2VarA2 = go2.a(fo2VarA, fo2Var);
        Map map = fo2VarA2.f77471a;
        c cVar = fo2VarA2.f77472b;
        String str3 = co2Var.f76376b;
        Map mapB = kotlin.collections.a.B(map);
        eo2 eo2Var = new eo2(str3, mapB, cVar);
        ((iu3) this.f85580b).getClass();
        pu3 pu3Var = pu3.f81606a;
        cf.a(context, new cq3(((iu3) this.f85580b).f78817a)).a(eo2Var);
        new we(context).a(co2Var, mapB, str, null);
    }

    public zs2(d4 d4Var, lu2 lu2Var, n9 n9Var) {
        this.f85579a = d4Var;
        this.f85580b = lu2Var;
        this.f85581c = n9Var;
    }

    public final void a(Context context, v9 v9Var, d22 d22Var) {
        Map mapJ;
        fo2 fo2Var = new fo2((Map) null, 3);
        if (d22Var != null) {
            List list = d22Var.f76523a.f76560b.f82018c;
            List list2 = list.isEmpty() ^ true ? list : null;
            if (list2 == null || (mapJ = nj.l0.g(mj.h.a("image_sizes", nj.b0.O0(list2)))) == null) {
                mapJ = kotlin.collections.a.j();
            }
            fo2Var.f77471a.putAll(mapJ);
        }
        a(context, v9Var, co2.f76356g, fo2Var);
    }

    public final void a(Context context, v9 v9Var, e22 e22Var) {
        fo2 fo2Var = new fo2((Map) null, 3);
        do2 do2Var = do2.f76756c;
        fo2Var.b("success", "status");
        a(context, v9Var, co2.f76357h, fo2Var);
    }
}
