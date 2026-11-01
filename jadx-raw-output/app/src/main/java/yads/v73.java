package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class v73 extends po {
    public final we A;
    public final o9 B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d4 f83801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f83802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fp2 f83803y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final io2 f83804z;

    public /* synthetic */ v73(Context context, d4 d4Var, int i10, String str, oo ooVar, Object obj, fp2 fp2Var, uo2 uo2Var, at1 at1Var, int i11) {
        this(context, d4Var, i10, str, ooVar, obj, fp2Var, (i11 & 128) != 0 ? null : uo2Var, at1Var, new we(context), new o9());
    }

    @Override // yads.po, yads.po2
    public im3 a(im3 im3Var) {
        try {
            e82 e82Var = im3Var.f78724b;
            this.f83804z.a(this.f83803y.a(null, e82Var != null ? e82Var.f76976a : -1, this.f83802x));
            return im3Var;
        } catch (Throwable th2) {
            this.f83804z.reportError("Failed to parse network error", th2);
            return new h4(m4.f80073p, null);
        }
    }

    public abstract vp2 a(e82 e82Var, int i10);

    public final void n() {
        eo2 eo2VarA = this.f83803y.a(this.f83802x);
        this.f83804z.a(eo2VarA);
        String str = eo2VarA.f77158a;
        co2 co2Var = co2.f76360k;
        if (ck.p.e(str, "ad_request")) {
            this.A.a(co2Var, eo2VarA.f77159b, null, null);
        }
    }

    @Override // yads.po2
    public Map d() {
        Map mapD = nj.l0.d();
        mapD.putAll(this.f83801w.f76560b.f82016a.f79098c);
        return nj.l0.c(mapD);
    }

    public v73(Context context, d4 d4Var, int i10, String str, oo ooVar, Object obj, fp2 fp2Var, uo2 uo2Var, at1 at1Var, we weVar, o9 o9Var) {
        super(context, i10, str, ooVar, uo2Var);
        this.f83801w = d4Var;
        this.f83802x = obj;
        this.f83803y = fp2Var;
        this.f83804z = at1Var;
        this.A = weVar;
        this.B = o9Var;
        a(context);
        l();
        m();
        n();
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        try {
            int i10 = e82Var.f76976a;
            vp2 vp2VarA = a(e82Var, i10);
            a(e82Var, vp2VarA, i10);
            return vp2VarA;
        } catch (Throwable th2) {
            this.f83804z.reportError("Failed to parse network response", th2);
            return new vp2(new h4(m4.f80073p, null));
        }
    }

    public final void a(e82 e82Var, vp2 vp2Var, int i10) {
        eo2 eo2VarA = this.f83803y.a(vp2Var, i10, this.f83802x);
        Map linkedHashMap = eo2VarA.f77159b;
        if (!ck.x.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strC = t01.c(e82Var.f76978c, u11.f83314q);
        if (strC != null) {
            linkedHashMap.put("server_log_id", strC);
        }
        Map map = e82Var.f76978c;
        if (map != null) {
            w9.a(map);
        }
        this.f83804z.a(eo2VarA);
    }

    public final void a(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && (num2 = nt2VarA.f80794t0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = x11.f84412a;
        }
        this.B.f80974a.getClass();
        nt2 nt2VarA2 = cw2.a().a(context);
        this.f81501o = new qe0(1.0f, iIntValue, (nt2VarA2 == null || (num = nt2VarA2.J) == null) ? 0 : num.intValue());
    }
}
