package yads;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class x42 implements tj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y42 f84449a;

    @Override // yads.tj2
    public final void a(long j10, long j11) {
        y42 y42Var = this.f84449a;
        View view = y42Var.f84818c;
        if (view != null) {
            y42Var.f84816a.a(view, j10, j11);
        }
    }

    public x42(y42 y42Var) {
        this.f84449a = y42Var;
    }

    @Override // yads.tj2
    public final void a() {
        View view = this.f84449a.f84818c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
