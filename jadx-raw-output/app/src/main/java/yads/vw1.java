package yads;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes7.dex */
public final class vw1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f84024g = {wb.a(vw1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx1 f84025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bx1 f84026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f84027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f84028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ph1 f84029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84030f = true;

    public final void a() {
        ph1 ph1Var = this.f84029e;
        if (ph1Var != null) {
            ph1Var.f81415a.removeCallbacksAndMessages(null);
        }
        this.f84029e = null;
    }

    public vw1(ViewPager2 viewPager2, jx1 jx1Var, bx1 bx1Var, qh1 qh1Var) {
        this.f84025a = jx1Var;
        this.f84026b = bx1Var;
        this.f84027c = qh1Var;
        this.f84028d = mm2.a(viewPager2);
    }
}
