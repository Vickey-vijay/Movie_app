package yads;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class m02 extends zn {
    public final n43 A;
    public final mz1 B;
    public final l02 C;
    public final a02 D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a12 f80019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v02 f80020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f12 f80021y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i12 f80022z;

    public m02(Context context, lu2 lu2Var, a12 a12Var, d4 d4Var, v02 v02Var, w5 w5Var, nk.l0 l0Var, f12 f12Var, i12 i12Var, n43 n43Var, mz1 mz1Var) {
        super(context, w5Var, d4Var, lu2Var, l0Var);
        this.f80019w = a12Var;
        this.f80020x = v02Var;
        this.f80021y = f12Var;
        this.f80022z = i12Var;
        this.A = n43Var;
        this.B = mz1Var;
        this.C = new l02(this);
        this.D = new a02(context, lu2Var, this, this);
        v02Var.a(i12Var);
    }

    @Override // yads.zn
    public final pn a(String str, String str2) {
        JSONObject jSONObjectA;
        a02 a02Var = this.D;
        a12 a12Var = this.f80019w;
        yo2 yo2Var = a12Var.f75364c;
        d4 d4Var = this.f85497c;
        g9 g9Var = a12Var.f75362a;
        a02Var.getClass();
        zz1 zz1Var = new zz1(a02Var.f75352a, d4Var, ((iu3) a02Var.f75353b).a(), str, str2, a02Var.f75354c, a02Var.f75355d, new u02(yo2Var), new c12());
        String str3 = g9Var.f77703h;
        a02Var.f75357f.getClass();
        String strOptString = (str3 == null || (jSONObjectA = ge1.a(str3)) == null || !jSONObjectA.has("response")) ? null : jSONObjectA.optString("response");
        String str4 = g9Var.f77704i;
        if (strOptString == null) {
            strOptString = str4;
        }
        if (strOptString != null) {
            hm2 hm2Var = a02Var.f75356e;
            hm2Var.getClass();
            synchronized (hm2.f78285c) {
                hm2Var.f78287a.put(zz1Var, strOptString);
                mj.r rVar = mj.r.f64562a;
            }
        }
        return zz1Var;
    }

    @Override // yads.zn
    public final boolean a(g9 g9Var) {
        return true;
    }

    @Override // yads.zn
    public final synchronized void b(g9 g9Var) {
        throw null;
    }

    @Override // yads.zn
    public final l4 o() {
        return (l4) nj.b0.h0(this.f85504j.a());
    }

    @Override // yads.zn
    public final void a(l4 l4Var) {
        this.f80020x.a(l4Var);
    }

    @Override // yads.up2
    public final void a(Object obj) {
        x22 tv2Var;
        v9 v9Var = (v9) obj;
        synchronized (this) {
            this.f85496b.a(v5.f83759s);
            this.f85516v = v9Var;
        }
        this.f80022z.f78451d = v9Var;
        if (this.f85512r == z5.f85211b) {
            return;
        }
        f12 f12Var = this.f80021y;
        f12Var.getClass();
        hq1 hq1Var = v9Var.f83825q;
        if (hq1Var != null) {
            tv2Var = new pp1(v9Var, hq1Var);
        } else {
            tv2Var = new tv2(f12Var.f77266a, f12Var.f77267b);
        }
        w22 w22VarA = tv2Var.a(this);
        Context contextA = j1.a();
        if (contextA != null) {
            boolean z10 = ad1.f75480a;
        }
        if (contextA == null) {
            contextA = this.f85495a;
        }
        w22VarA.a(contextA, v9Var);
    }
}
