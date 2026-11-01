package yads;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes7.dex */
public final class rh3 implements qh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f82280a;

    @Override // yads.qh3
    public final void a() {
    }

    @Override // yads.qh3
    public final void a(ph3 ph3Var) {
        ph3Var.a(this.f82280a.getDefaultDisplay());
    }

    public rh3(WindowManager windowManager) {
        this.f82280a = windowManager;
    }
}
