package yads;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class vb implements kk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l12 f83868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv f83869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final if1 f83870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hl3 f83871d;

    @Override // yads.kk3
    public final void a(oi oiVar, fv fvVar) {
        if1 if1Var = oiVar.f81051d;
        if (if1Var == null) {
            if1Var = this.f83870c;
        }
        gv gvVar = this.f83869b;
        l12 l12Var = this.f83868a;
        gvVar.getClass();
        if (!oiVar.f81052e || if1Var == null) {
            return;
        }
        fvVar.a(if1Var, new hv(oiVar, gvVar.f77944a, l12Var, gvVar.f77945b, gvVar.f77946c));
    }

    public vb(l12 l12Var, gv gvVar, if1 if1Var, hl3 hl3Var) {
        this.f83868a = l12Var;
        this.f83869b = gvVar;
        this.f83870c = if1Var;
        this.f83871d = hl3Var;
    }

    @Override // yads.kk3
    public final void a(View view, oi oiVar) {
        if (view.getTag() == null) {
            hl3 hl3Var = this.f83871d;
            String str = oiVar.f81048a;
            hl3Var.getClass();
            view.setTag(hl3.a(str));
        }
    }
}
