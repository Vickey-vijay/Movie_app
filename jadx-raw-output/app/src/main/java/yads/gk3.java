package yads;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class gk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ek3 f77841a;

    public final boolean a() {
        View view = this.f77841a.getView();
        return (view == null || kl3.b(view) || kl3.a(view) < 50) ? false : true;
    }

    public gk3(ek3 ek3Var) {
        this.f77841a = ek3Var;
    }
}
