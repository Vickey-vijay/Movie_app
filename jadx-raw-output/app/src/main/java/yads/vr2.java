package yads;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class vr2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f83995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x63 f83996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y42 f83997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f83998d;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        b2 b2Var = this.f83995a;
        b2Var.f75697b.add(this.f83998d);
        this.f83996b.getClass();
        View viewFindViewWithTag = viewGroup.findViewWithTag("timer_container");
        if (!(viewFindViewWithTag instanceof View)) {
            viewFindViewWithTag = null;
        }
        y42 y42Var = this.f83997c;
        y42Var.f84818c = viewFindViewWithTag;
        ay0 ay0Var = y42Var.f84817b;
        if (ay0Var != null) {
            ay0Var.start();
        }
    }

    @Override // yads.zf0
    public final void c() {
        b2 b2Var = this.f83995a;
        b2Var.f75697b.remove(this.f83998d);
        y42 y42Var = this.f83997c;
        y42Var.f84818c = null;
        ay0 ay0Var = y42Var.f84817b;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
    }

    public vr2(b2 b2Var, x63 x63Var, y42 y42Var, c2 c2Var) {
        this.f83995a = b2Var;
        this.f83996b = x63Var;
        this.f83997c = y42Var;
        this.f83998d = c2Var;
    }
}
