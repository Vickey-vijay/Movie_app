package yads;

import android.content.Context;
import com.ironsource.Q6;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class c61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v9 f76178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f76179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j5 f76180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f76181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nt2 f76182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sx f76183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final we f76184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i22 f76185h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c61(Context context, v9 v9Var, d4 d4Var, lu2 lu2Var, j5 j5Var) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f81606a;
        at1 at1VarA = cf.a(context, iu3Var.b());
        Object obj = dw2.f76819j;
        this(v9Var, d4Var, j5Var, at1VarA, cw2.a().a(context), new sx(), new we(context));
    }

    public final fo2 a(qb3 qb3Var) {
        fo2 fo2VarA = a();
        fo2VarA.b(qb3Var.f81798a.f81347b, "reason");
        String str = qb3Var.f81799b;
        if (str != null && str.length() > 0) {
            fo2VarA.b(str, "asset_name");
        }
        String str2 = qb3Var.f81800c;
        if (str2 != null && str2.length() > 0) {
            fo2VarA.b(str2, UnifiedMediationParams.KEY_DESCRIPTION);
        }
        return fo2VarA;
    }

    public c61(v9 v9Var, d4 d4Var, j5 j5Var, io2 io2Var, nt2 nt2Var, sx sxVar, we weVar) {
        this.f76178a = v9Var;
        this.f76179b = d4Var;
        this.f76180c = j5Var;
        this.f76181d = io2Var;
        this.f76182e = nt2Var;
        this.f76183f = sxVar;
        this.f76184g = weVar;
    }

    public final fo2 a() {
        fo2 fo2VarA = this.f76183f.a(this.f76178a, this.f76179b);
        fo2VarA.b(bo2.f75924a, Q6.G1);
        a03 a03Var = this.f76179b.f76562d.f75685a;
        if (a03Var != null) {
            fo2VarA.b(a03Var.b().f85668b, "size_type");
            fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
        }
        nt2 nt2Var = this.f76182e;
        if (nt2Var != null) {
            fo2VarA.b(nt2Var.O, "banner_size_calculation_type");
        }
        i22 i22Var = this.f76185h;
        return i22Var != null ? go2.a(fo2VarA, i22Var.a()) : fo2VarA;
    }

    public final void a(co2 co2Var, fo2 fo2Var) {
        Map map = fo2Var.f77471a;
        c cVar = fo2Var.f77472b;
        String str = co2Var.f76376b;
        Map mapB = kotlin.collections.a.B(map);
        this.f76181d.a(new eo2(str, mapB, cVar));
        this.f76184g.a(co2Var, mapB, bo2.f75924a, this.f76180c);
    }
}
