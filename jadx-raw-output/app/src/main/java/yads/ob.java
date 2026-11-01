package yads;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class ob implements kk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l12 f80984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv f80985b;

    @Override // yads.kk3
    public final void a(View view, oi oiVar) {
    }

    @Override // yads.kk3
    public final void a(oi oiVar, fv fvVar) {
        if1 if1Var = oiVar.f81051d;
        gv gvVar = this.f80985b;
        l12 l12Var = this.f80984a;
        gvVar.getClass();
        if (!oiVar.f81052e || if1Var == null) {
            return;
        }
        fvVar.a(if1Var, new hv(oiVar, gvVar.f77944a, l12Var, gvVar.f77945b, gvVar.f77946c));
    }

    public ob(l12 l12Var, gv gvVar) {
        this.f80984a = l12Var;
        this.f80985b = gvVar;
    }
}
