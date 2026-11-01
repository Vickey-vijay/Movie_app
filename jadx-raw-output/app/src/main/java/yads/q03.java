package yads;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes8.dex */
public final class q03 implements zf0, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j7 f81670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f81671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cz1 f81672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f03 f81673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ue0 f81674e;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        k7 k7Var;
        View viewB = this.f81672c.b(viewGroup);
        if (viewB != null) {
            this.f81671b.f75697b.add(this);
            f03 f03Var = this.f81673d;
            j7 j7Var = this.f81670a;
            Long lValueOf = (j7Var == null || (k7Var = j7Var.f78927b) == null) ? null : Long.valueOf(k7Var.f79323c);
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            zb2 zb2VarA = bc2.a();
            ue0 ue0Var = new ue0(viewB, f03Var, jLongValue, zb2VarA);
            this.f81674e = ue0Var;
            lm2 lm2Var = ue0Var.f83442b;
            jk.k kVar = ue0.f83440c[0];
            View view = (View) lm2Var.f79854a.get();
            if (view != null) {
                te0 te0Var = new te0(view, f03Var);
                if (jLongValue == 0) {
                    f03Var.b(view);
                } else {
                    zb2VarA.a(jLongValue, te0Var);
                }
            }
            if (viewB.getTag() == null) {
                viewB.setTag("skip_button");
            }
        }
    }

    @Override // yads.c2
    public final void b() {
        ue0 ue0Var = this.f81674e;
        if (ue0Var != null) {
            ((zb2) ue0Var.f83441a).b();
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f81671b.f75697b.remove(this);
        ue0 ue0Var = this.f81674e;
        if (ue0Var != null) {
            ((zb2) ue0Var.f83441a).a();
        }
    }

    public q03(j7 j7Var, b2 b2Var, cz1 cz1Var, f03 f03Var) {
        this.f81670a = j7Var;
        this.f81671b = b2Var;
        this.f81672c = cz1Var;
        this.f81673d = f03Var;
    }

    @Override // yads.c2
    public final void a() {
        ue0 ue0Var = this.f81674e;
        if (ue0Var != null) {
            ((zb2) ue0Var.f83441a).d();
        }
    }
}
