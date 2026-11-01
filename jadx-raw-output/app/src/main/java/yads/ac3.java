package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ac3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf3 f75466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ek3 f75467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je3 f75468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jg3 f75469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yj3 f75470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5 f75471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yf3 f75472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vf3 f75473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ze3 f75474i;

    public final void a() {
        this.f75466a.a(this.f75474i);
        this.f75466a.a(this.f75468c);
        this.f75471f.a(v5.f83762v, null);
        View view = this.f75467b.getView();
        if (view != null) {
            this.f75470e.a(view, this.f75467b.a());
        }
        eg3 eg3Var = this.f75472g.f84941d;
        if (!eg3Var.f77069e && !eg3Var.f77068d) {
            eg3Var.f77069e = true;
            eg3Var.f77067c.post(new dg3(eg3Var));
        }
        this.f75469d.a(hg3.f78221c);
    }

    public ac3(Context context, lu2 lu2Var, hf3 hf3Var, ek3 ek3Var, je3 je3Var, bj3 bj3Var, jg3 jg3Var, zj3 zj3Var, rf3 rf3Var, af3 af3Var, v9 v9Var, boolean z10) {
        this.f75466a = hf3Var;
        this.f75467b = ek3Var;
        this.f75468c = je3Var;
        this.f75469d = jg3Var;
        this.f75470e = zj3Var;
        w5 w5Var = new w5();
        this.f75471f = w5Var;
        yf3 yf3Var = new yf3(context, lu2Var, v9Var, je3Var, w5Var, jg3Var, ek3Var, bj3Var, zj3Var);
        this.f75472g = yf3Var;
        vf3 vf3Var = new vf3(hf3Var, rf3Var);
        this.f75473h = vf3Var;
        this.f75474i = new ze3(je3Var, hf3Var, vf3Var, yf3Var, jg3Var, w5Var, zj3Var, af3Var, z10);
        new tf3(context, je3Var, ek3Var, jg3Var, zj3Var, hf3Var, af3Var).a(rf3Var, z10);
    }

    public final void a(ag3 ag3Var) {
        yf3 yf3Var = this.f75472g;
        yf3Var.f84946i.setValue(yf3Var, yf3.f84936k[0], ag3Var);
    }
}
