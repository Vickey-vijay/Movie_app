package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public final class qw implements zf0, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f82000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f82001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw f82002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kz f82003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cz1 f82004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z30 f82005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k63 f82006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ew f82007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sj2 f82008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yv f82009j;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        View viewC = this.f82004e.c(viewGroup);
        ProgressBar progressBarA = this.f82004e.a(viewGroup);
        if (viewC != null) {
            this.f82001b.f75697b.add(this);
            Context context = viewC.getContext();
            Object obj = dw2.f76819j;
            nt2 nt2VarA = cw2.a().a(context);
            boolean z10 = false;
            boolean z11 = nt2VarA != null && nt2VarA.D;
            eg0[] eg0VarArr = eg0.f77061b;
            if (ck.p.e("divkit", this.f82000a.f83819k) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new pw(this.f82003d, this.f82005f));
            }
            a(viewC, progressBarA);
            if (viewC.getTag() == null) {
                viewC.setTag("close");
            }
        }
    }

    @Override // yads.c2
    public final void b() {
        ew ewVar = this.f82007h;
        if (ewVar != null) {
            ewVar.b();
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f82001b.f75697b.remove(this);
        ew ewVar = this.f82007h;
        if (ewVar != null) {
            ewVar.invalidate();
        }
    }

    public qw(v9 v9Var, b2 b2Var, cw cwVar, kz kzVar, cz1 cz1Var, z30 z30Var, k63 k63Var) {
        this.f82000a = v9Var;
        this.f82001b = b2Var;
        this.f82002c = cwVar;
        this.f82003d = kzVar;
        this.f82004e = cz1Var;
        this.f82005f = z30Var;
        this.f82006g = k63Var;
        this.f82008i = k63Var.d();
        this.f82009j = k63Var.a();
    }

    public final void a(View view, ProgressBar progressBar) {
        ew gc0Var;
        Long l10 = this.f82000a.f83818j;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        if (progressBar != null) {
            gc0Var = new lj2(view, progressBar, new am0(), new kw(new ff()), this.f82005f, this.f82008i, jLongValue);
        } else if (this.f82009j.a()) {
            gc0Var = new gc0(view, this.f82002c, this.f82005f, jLongValue, this.f82006g.f79320e, vb2.a(true));
        } else {
            gc0Var = null;
        }
        this.f82007h = gc0Var;
        if (gc0Var != null) {
            gc0Var.c();
        }
    }

    @Override // yads.c2
    public final void a() {
        ew ewVar = this.f82007h;
        if (ewVar != null) {
            ewVar.a();
        }
    }
}
