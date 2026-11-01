package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bu2 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f75967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yo2 f75968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f75969y;

    public bu2(Context context, String str, cu2 cu2Var, Map map, du2 du2Var, du2 du2Var2) {
        super(context, 0, str, du2Var2, du2Var);
        this.f75967w = context;
        this.f75968x = cu2Var;
        this.f75969y = map;
        l();
        m();
    }

    @Override // yads.po, yads.po2
    public final im3 a(im3 im3Var) {
        m4 m4Var;
        boolean z10 = ad1.f75480a;
        int i10 = h4.f78053d;
        e82 e82Var = im3Var.f78724b;
        Integer numValueOf = e82Var != null ? Integer.valueOf(e82Var.f76976a) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            m4Var = (500 > iIntValue || iIntValue > 599) ? m4.f80062e : m4.f80063f;
        } else if (im3Var instanceof b92) {
            m4Var = m4.f80069l;
        } else if (im3Var instanceof v63) {
            m4Var = m4.f80070m;
        } else if (im3Var instanceof pl) {
            m4Var = m4.f80071n;
        } else if (im3Var instanceof ov) {
            m4Var = m4.f80072o;
        } else {
            m4Var = im3Var instanceof mb2 ? m4.f80073p : m4.f80074q;
        }
        return new h4(m4Var, e82Var);
    }

    @Override // yads.po2
    public final Map d() {
        HashMap map = new HashMap();
        Context context = this.f75967w;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && nt2VarA.f80805z) {
            u11 u11Var = u11.f83300c;
            map.put("encrypted-request", "1");
        }
        map.putAll(this.f75969y);
        return map;
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        m4 m4Var;
        if (200 == e82Var.f76976a) {
            nt2 nt2Var = (nt2) this.f75968x.a(e82Var);
            if (nt2Var != null) {
                Map mapJ = e82Var.f76978c;
                if (mapJ == null) {
                    mapJ = kotlin.collections.a.j();
                }
                String strC = t01.c(mapJ, u11.R);
                if (strC != null) {
                    tx2 tx2Var = ux2.f83685a;
                    Context context = this.f81479s;
                    tx2Var.getClass();
                    ((tg1) ((vx2) tx2.a(context)).f84040b).a("ServerSideClientIP", strC);
                }
                return new vp2(nt2Var, v11.a(e82Var));
            }
            m4Var = m4.f80060c;
        } else {
            m4Var = m4.f80062e;
        }
        return new vp2(new h4(m4Var, e82Var));
    }
}
