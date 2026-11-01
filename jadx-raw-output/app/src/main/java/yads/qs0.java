package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$layout;
import yads.qs0;

/* JADX INFO: loaded from: classes2.dex */
public final class qs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi2 f81948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f81949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lu2 f81950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh0 f81951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ve1 f81952e;

    public static final void a() {
    }

    public final se1 a(Context context, v9 v9Var, v22 v22Var, z00 z00Var, lh3 lh3Var) {
        hi2 hi2Var = this.f81948a;
        pu puVar = hi2Var.f78250c;
        zh0 zh0Var = hi2Var.f78251d;
        kz kzVar = new kz() { // from class: cp.z8
            @Override // yads.kz
            public final void e() {
                qs0.a();
            }
        };
        wm wmVar = new wm();
        at1 at1VarA = ((iu3) this.f81950c).a();
        this.f81951d.getClass();
        jy jyVar = new jy(new st0(this.f81948a, new oh0(context, this.f81949b, this.f81950c, v9Var, kzVar, wmVar, zh0Var), at1VarA), qh0.a(v22Var, kzVar, z00Var, puVar, at1VarA), new n22(v22Var.O, lh3Var));
        ji0 ji0Var = new ji0(v9Var);
        ve1 ve1Var = this.f81952e;
        int i10 = R$layout.monetization_ads_internal_divkit;
        ve1Var.getClass();
        return new se1(i10, jyVar, ji0Var);
    }

    public qs0(hi2 hi2Var, d4 d4Var, lu2 lu2Var, qh0 qh0Var, ve1 ve1Var) {
        this.f81948a = hi2Var;
        this.f81949b = d4Var;
        this.f81950c = lu2Var;
        this.f81951d = qh0Var;
        this.f81952e = ve1Var;
    }
}
