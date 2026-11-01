package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class mr2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f80335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f80336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f80337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cz1 f80338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d42 f80339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k63 f80340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gi0 f80341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jw f80342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ay0 f80343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kr2 f80344j;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ay0 a32Var;
        View viewC = this.f80338d.c(viewGroup);
        if (viewC != null) {
            kr2 kr2Var = new kr2(this);
            this.f80336b.f75697b.add(kr2Var);
            this.f80344j = kr2Var;
            Context context = viewC.getContext();
            Object obj = dw2.f76819j;
            nt2 nt2VarA = cw2.a().a(context);
            boolean z10 = false;
            boolean z11 = nt2VarA != null && nt2VarA.D;
            eg0[] eg0VarArr = eg0.f77061b;
            if (ck.p.e("divkit", this.f80335a.f83819k) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new jr2(this.f80337c));
            }
            viewC.setVisibility(8);
            lr2 lr2Var = new lr2(new WeakReference(viewC));
            jw jwVar = this.f80342h;
            v9 v9Var = this.f80335a;
            d42 d42Var = this.f80339e;
            k63 k63Var = this.f80340f;
            gi0 gi0Var = this.f80341g;
            jwVar.getClass();
            d62 d62Var = d42Var.f76576a;
            o72 o72Var = d42Var.f76577b;
            ay0 ay0Var = null;
            String str = gi0Var != null ? gi0Var.f77807a : null;
            fg0[] fg0VarArr = fg0.f77387b;
            if (ck.p.e(str, "pack_shot") && k63Var.f79319d.a()) {
                a32Var = new a32(v9Var, lr2Var, k63Var);
            } else if (d62Var != null) {
                a32Var = new b62(d62Var, lr2Var, v9Var.f83818j, k63Var.f79320e, k63Var.f79319d);
            } else if (o72Var != null) {
                a32Var = new m72(o72Var, lr2Var);
            } else {
                a32Var = k63Var.f79319d.a() ? new a32(v9Var, lr2Var, k63Var) : null;
            }
            if (a32Var != null) {
                a32Var.start();
                ay0Var = a32Var;
            }
            this.f80343i = ay0Var;
        }
    }

    @Override // yads.zf0
    public final void c() {
        kr2 kr2Var = this.f80344j;
        if (kr2Var != null) {
            this.f80336b.f75697b.remove(kr2Var);
        }
        ay0 ay0Var = this.f80343i;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
    }

    public mr2(v9 v9Var, b2 b2Var, kz kzVar, ez1 ez1Var, d42 d42Var, k63 k63Var, gi0 gi0Var, jw jwVar) {
        this.f80335a = v9Var;
        this.f80336b = b2Var;
        this.f80337c = kzVar;
        this.f80338d = ez1Var;
        this.f80339e = d42Var;
        this.f80340f = k63Var;
        this.f80341g = gi0Var;
        this.f80342h = jwVar;
    }
}
