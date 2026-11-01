package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;

/* JADX INFO: loaded from: classes11.dex */
public final class yb1 implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f84876a;

    public yb1(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f84876a = integrationInspectorActivity;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        p90 p90Var = (p90) obj;
        q90 q90VarC = IntegrationInspectorActivity.c(this.f84876a);
        q90VarC.getClass();
        if (p90Var.f81314c) {
            q90VarC.f81775a.submitList(nj.s.k());
            q90VarC.f81777c.setVisibility(0);
        } else {
            q90VarC.f81775a.submitList(p90Var.f81315d);
            q90VarC.f81777c.setVisibility(8);
        }
        q90VarC.f81776b.setText(p90Var.f81313b.f82547a);
        return mj.r.f64562a;
    }
}
