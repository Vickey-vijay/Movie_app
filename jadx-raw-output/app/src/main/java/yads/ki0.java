package yads;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.yandex.div.core.DivConfiguration;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes11.dex */
public final class ki0 implements vy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gi0 f79414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f79415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lu2 f79416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zf0 f79417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2 f79418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ph0 f79419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f79420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yg0 f79421h;

    public /* synthetic */ ki0(gi0 gi0Var, d4 d4Var, lu2 lu2Var, jy jyVar, f2 f2Var, ph0 ph0Var, int i10) {
        this(gi0Var, d4Var, lu2Var, jyVar, f2Var, ph0Var, i10, new yg0(((iu3) lu2Var).a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.vy0
    public final se1 a(Context context, v9 v9Var, w02 w02Var, kz kzVar, z00 z00Var) {
        DivConfiguration divConfigurationA;
        zf0 qz1Var;
        gi0 gi0Var = this.f79414a;
        pu puVar = new pu(gi0Var.f77814h);
        zh0 zh0Var = new zh0(puVar);
        yg0 yg0Var = this.f79421h;
        yg0Var.getClass();
        boolean z10 = w02Var instanceof v22;
        if (z10) {
            io2 io2Var = yg0Var.f84948a;
            x03 x03Var = new x03(io2Var);
            v22 v22Var = (v22) w02Var;
            x03Var.f84403e.put(gi0Var.f77811e, new z03(v22Var, io2Var, gi0Var.f77814h, new kh0(), new jq0(), new mj(x02.a(v22Var, xh0.f84595c))));
            yg0Var.f84949b.getClass();
            divConfigurationA = y03.a(context, x03Var, zh0Var);
        } else {
            divConfigurationA = (DivConfiguration) kotlin.b.a(new fi0(context, zh0Var)).getValue();
        }
        DivConfiguration divConfiguration = divConfigurationA;
        oh0 oh0Var = new oh0(context, this.f79415b, this.f79416c, v9Var, kzVar, this.f79419f, zh0Var);
        at1 at1VarA = ((iu3) this.f79416c).a();
        yh0 yh0Var = new yh0(this.f79414a.f77811e, oh0Var, divConfiguration, at1VarA, null, context instanceof LifecycleOwner ? (LifecycleOwner) context : null, 208);
        zf0[] zf0VarArr = new zf0[4];
        zf0VarArr[0] = new jp2(this.f79418e, this.f79420g);
        zf0VarArr[1] = yh0Var;
        if (z10) {
            v22 v22Var2 = (v22) w02Var;
            qz1Var = new u03(v22Var2, kzVar, z00Var, puVar, at1VarA, new ky1(), new mj(x02.a(v22Var2, xh0.f84594b)));
        } else {
            qz1Var = new qz1(w02Var, kzVar, z00Var, puVar, at1VarA, new ky1(), new mj(x02.a(w02Var, null)));
        }
        zf0VarArr[2] = new ry0(qz1Var);
        zf0VarArr[3] = this.f79417d;
        return new se1(R$layout.monetization_ads_internal_divkit, new jy(zf0VarArr), new ji0(v9Var));
    }

    public ki0(gi0 gi0Var, d4 d4Var, lu2 lu2Var, jy jyVar, f2 f2Var, ph0 ph0Var, int i10, yg0 yg0Var) {
        this.f79414a = gi0Var;
        this.f79415b = d4Var;
        this.f79416c = lu2Var;
        this.f79417d = jyVar;
        this.f79418e = f2Var;
        this.f79419f = ph0Var;
        this.f79420g = i10;
        this.f79421h = yg0Var;
    }
}
