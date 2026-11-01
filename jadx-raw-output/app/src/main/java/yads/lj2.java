package yads;

import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public final class lj2 implements ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f79818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f79819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw f79820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kw f79821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z30 f79822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sj2 f79823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f79824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zb2 f79825h = vb2.a(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kj2 f79826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jj2 f79827j;

    @Override // yads.ew
    public final void a() {
        this.f79825h.d();
    }

    @Override // yads.ew
    public final void b() {
        this.f79825h.b();
    }

    @Override // yads.ew
    public final void c() {
        kw kwVar = this.f79821d;
        ProgressBar progressBar = this.f79819b;
        int i10 = (int) this.f79824g;
        int i11 = (int) this.f79823f.f82669a;
        kwVar.getClass();
        progressBar.setMax(i10);
        progressBar.setVisibility(0);
        progressBar.setProgress(i11);
        long jMax = Math.max(0L, this.f79824g - this.f79823f.f82669a);
        if (jMax != 0) {
            this.f79820c.a(this.f79818a);
            zb2 zb2Var = this.f79825h;
            zb2Var.f85305e = this.f79827j;
            zb2Var.a(jMax, this.f79826i);
            this.f79822e.a(y30.f84800d);
        }
    }

    public final View d() {
        return this.f79818a;
    }

    @Override // yads.ew
    public final void invalidate() {
        this.f79825h.a();
    }

    public lj2(View view, ProgressBar progressBar, am0 am0Var, kw kwVar, z30 z30Var, sj2 sj2Var, long j10) {
        this.f79818a = view;
        this.f79819b = progressBar;
        this.f79820c = am0Var;
        this.f79821d = kwVar;
        this.f79822e = z30Var;
        this.f79823f = sj2Var;
        this.f79824g = j10;
        this.f79826i = new kj2(d(), am0Var, z30Var);
        this.f79827j = new jj2(progressBar, kwVar, j10);
    }
}
