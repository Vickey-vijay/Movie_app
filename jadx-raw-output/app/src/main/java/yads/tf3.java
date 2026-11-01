package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll2 f83014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj2 f83015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc3 f83016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc3 f83017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ql3 f83018e;

    public final void a(rf3 rf3Var, boolean z10) {
        if (!z10) {
            nj.x.D(rf3Var.f82251a, new qf3[]{this.f83016c});
        } else {
            nj.x.D(rf3Var.f82251a, new qf3[]{this.f83014a, this.f83015b, this.f83017d, this.f83016c, this.f83018e});
            nj.x.D(rf3Var.f82252b, new sf3[]{this.f83018e});
        }
    }

    public tf3(Context context, je3 je3Var, ek3 ek3Var, jg3 jg3Var, zj3 zj3Var, hf3 hf3Var, af3 af3Var) {
        this.f83014a = new ll2(zj3Var);
        this.f83015b = new rj2(context, je3Var);
        this.f83016c = new jc3(je3Var, ek3Var, zj3Var, af3Var);
        this.f83017d = new uc3(ek3Var, zj3Var, hf3Var);
        this.f83018e = new ql3(je3Var, ek3Var, jg3Var, zj3Var, af3Var);
    }
}
