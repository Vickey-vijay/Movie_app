package yads;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class fk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ek3 f77425a;

    public final boolean a() {
        View view = this.f77425a.getView();
        return (view == null || kl3.b(view) || kl3.f79470a.a(view).f84628a < 1) ? false : true;
    }

    public fk3(ek3 ek3Var) {
        this.f77425a = ek3Var;
    }
}
