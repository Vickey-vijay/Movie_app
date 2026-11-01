package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rm2 extends h11 implements ll3 {
    public boolean A;
    public final qm2 B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tc1 f82316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final xb f82317z;

    public /* synthetic */ rm2(Context context, tc1 tc1Var, w5 w5Var) {
        this(context, tc1Var, w5Var, new xb(tc1Var));
    }

    public final void q() {
        boolean z10 = ad1.f75480a;
        this.f85501g.removeCallbacks(this.B);
        v9 v9Var = this.f85516v;
        if (v9Var == null || !v9Var.K || !this.A || (!this.f85510p.a())) {
            return;
        }
        lm2 lm2Var = this.f82317z.f84519a;
        jk.k kVar = xb.f84518b[0];
        tc1 tc1Var = (tc1) lm2Var.f79854a.get();
        if (tc1Var == null || kl3.b(tc1Var)) {
            return;
        }
        this.f85501g.postDelayed(this.B, v9Var.I);
    }

    public rm2(Context context, tc1 tc1Var, w5 w5Var, xb xbVar) {
        super(context, tc1Var.getAdConfiguration$mobileads_externalRelease(), tc1Var.getSdkEnvironmentModule$mobileads_externalRelease(), w5Var);
        this.f82316y = tc1Var;
        this.f82317z = xbVar;
        this.A = true;
        this.B = new qm2(this);
        tc1Var.addVisibilityChangeListener(this);
    }

    @Override // yads.zn, yads.vc2
    public final void a(rc2 rc2Var) {
        super.a(rc2Var);
        q();
    }

    @Override // yads.zn
    public final void b(l4 l4Var) {
        super.b(l4Var);
        int i10 = l4Var.f79697a;
        if (5 != i10 && 2 != i10) {
            q();
        }
    }

    @Override // yads.zn
    public void c() {
        super.c();
        this.f82316y.removeVisibilityChangeListener(this);
        boolean z10 = ad1.f75480a;
        this.A = false;
        this.f85501g.removeCallbacks(this.B);
    }

    @Override // yads.zn
    public final void j() {
        super.j();
        q();
    }

    public final void p() {
        q();
    }
}
