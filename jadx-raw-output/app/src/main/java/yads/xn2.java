package yads;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class xn2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk3 f84649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r62 f84650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vn2 f84651c;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e72 e72Var = (e72) this.f84649a.b();
        if (e72Var != null) {
            un2 un2Var = e72Var.f76956c.f80563a;
            this.f84651c.getClass();
            vn2.a(un2Var);
            s62 s62Var = this.f84650b.f82113a;
            s62Var.a(s62Var.f82539g);
        }
    }

    public xn2(dk3 dk3Var, r62 r62Var, vn2 vn2Var) {
        this.f84649a = dk3Var;
        this.f84650b = r62Var;
        this.f84651c = vn2Var;
    }
}
