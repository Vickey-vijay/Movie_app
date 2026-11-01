package yads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class mz implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f80468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f80469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z3 f80470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d42 f80471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k63 f80472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gi0 f80473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nz f80474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hf1 f80475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ay0 f80476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lz f80477j;

    public /* synthetic */ mz(v9 v9Var, b2 b2Var, z3 z3Var, d42 d42Var, k63 k63Var, gi0 gi0Var) {
        this(v9Var, b2Var, z3Var, d42Var, k63Var, gi0Var, new nz(), new hf1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ay0 n72Var;
        lz lzVar = new lz(this);
        this.f80469b.f75697b.add(lzVar);
        this.f80477j = lzVar;
        hf1 hf1Var = this.f80475h;
        hf1Var.f78216a.getClass();
        View viewFindViewWithTag = viewGroup.findViewWithTag("linear_progress_view");
        ProgressBar progressBar = viewFindViewWithTag instanceof ProgressBar ? (ProgressBar) viewFindViewWithTag : null;
        lm2 lm2Var = hf1Var.f78218c;
        jk.k kVar = hf1.f78215d[0];
        lm2Var.getClass();
        lm2Var.f79854a = new WeakReference(progressBar);
        nz nzVar = this.f80474g;
        v9 v9Var = this.f80468a;
        z3 z3Var = this.f80470c;
        d42 d42Var = this.f80471d;
        k63 k63Var = this.f80472e;
        gi0 gi0Var = this.f80473f;
        hf1 hf1Var2 = this.f80475h;
        nzVar.getClass();
        d62 d62Var = d42Var.f76576a;
        o72 o72Var = d42Var.f76577b;
        String str = gi0Var != null ? gi0Var.f77807a : null;
        fg0[] fg0VarArr = fg0.f77387b;
        if (ck.p.e(str, "pack_shot")) {
            n72Var = new e32(z3Var, k63Var, hf1Var2);
        } else if (d62Var != null) {
            n72Var = new c62(d62Var, z3Var, hf1Var2, v9Var.f83827s);
        } else {
            n72Var = o72Var != null ? new n72(o72Var, z3Var) : new e32(z3Var, k63Var, hf1Var2);
        }
        n72Var.start();
        this.f80476i = n72Var;
    }

    @Override // yads.zf0
    public final void c() {
        lz lzVar = this.f80477j;
        if (lzVar != null) {
            this.f80469b.f75697b.remove(lzVar);
        }
        ay0 ay0Var = this.f80476i;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
        lm2 lm2Var = this.f80475h.f78218c;
        jk.k kVar = hf1.f78215d[0];
        lm2Var.getClass();
        lm2Var.f79854a = new WeakReference(null);
    }

    public mz(v9 v9Var, b2 b2Var, z3 z3Var, d42 d42Var, k63 k63Var, gi0 gi0Var, nz nzVar, hf1 hf1Var) {
        this.f80468a = v9Var;
        this.f80469b = b2Var;
        this.f80470c = z3Var;
        this.f80471d = d42Var;
        this.f80472e = k63Var;
        this.f80473f = gi0Var;
        this.f80474g = nzVar;
        this.f80475h = hf1Var;
    }
}
