package yads;

import android.widget.ProgressBar;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class hf1 implements tj2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f78215d = {ck.s.f(new MutablePropertyReference1Impl(hf1.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gf1 f78216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff f78217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f78218c;

    public /* synthetic */ hf1() {
        this(new gf1(), new ff());
    }

    @Override // yads.tj2
    public final void a(long j10, long j11) {
        lm2 lm2Var = this.f78218c;
        jk.k kVar = f78215d[0];
        ProgressBar progressBar = (ProgressBar) lm2Var.f79854a.get();
        if (progressBar != null) {
            this.f78217b.getClass();
            ff.a(progressBar, j10, j11);
        }
    }

    public hf1(gf1 gf1Var, ff ffVar) {
        this.f78216a = gf1Var;
        this.f78217b = ffVar;
        this.f78218c = mm2.a(null);
    }

    @Override // yads.tj2
    public final void a() {
        lm2 lm2Var = this.f78218c;
        jk.k kVar = f78215d[0];
        ProgressBar progressBar = (ProgressBar) lm2Var.f79854a.get();
        if (progressBar != null) {
            long max = progressBar.getMax();
            this.f78217b.getClass();
            ff.a(progressBar, max, max);
        }
    }
}
