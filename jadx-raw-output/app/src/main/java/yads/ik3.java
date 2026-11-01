package yads;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class ik3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk3 f78689a;

    public final void a() {
        View viewB = this.f78689a.b();
        if (viewB == null) {
            return;
        }
        this.f78689a.a(viewB);
    }

    public final void b(Object obj) {
        View viewB = this.f78689a.b();
        if (viewB == null) {
            return;
        }
        this.f78689a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    public ik3(hk3 hk3Var) {
        this.f78689a = hk3Var;
    }

    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        if (this.f78689a.b() == null) {
            return;
        }
        this.f78689a.a(oiVar, kk3Var, obj);
    }

    public final boolean a(Object obj) {
        View viewB = this.f78689a.b();
        return viewB != null && this.f78689a.a(viewB, obj);
    }
}
