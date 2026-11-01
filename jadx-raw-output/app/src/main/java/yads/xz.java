package yads;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xz implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx1 f84756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw1 f84757b;

    public xz(bx1 bx1Var, vw1 vw1Var) {
        this.f84756a = bx1Var;
        this.f84757b = vw1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        vw1 vw1Var = this.f84757b;
        if (vw1Var != null) {
            vw1Var.a();
            vw1Var.f84030f = false;
        }
        bx1 bx1Var = this.f84756a;
        if (bx1Var.f76004c) {
            bx1Var.a("first_click_on_controls");
            bx1Var.f76004c = false;
        }
    }

    public /* synthetic */ xz(bx1 bx1Var, vw1 vw1Var, int i10) {
        this(bx1Var, vw1Var);
    }
}
