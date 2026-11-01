package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes11.dex */
public final class xw1 extends dt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f84721g = {wb.a(xw1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx1 f84722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bx1 f84723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2 f84724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ww1 f84725f = ww1.f84365b;

    @Override // java.lang.Runnable
    public final void run() {
        mj.r rVar;
        ViewPager2 viewPager2;
        lm2 lm2Var = this.f84724e;
        jk.k kVar = f84721g[0];
        ViewPager2 viewPager3 = (ViewPager2) lm2Var.f79854a.get();
        if (viewPager3 != null) {
            if (kl3.f79470a.a(viewPager3).f84628a > 0) {
                RecyclerView.Adapter adapter = viewPager3.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager3.getCurrentItem();
                    if (currentItem == 0) {
                        this.f84725f = ww1.f84365b;
                    } else if (currentItem == itemCount - 1) {
                        this.f84725f = ww1.f84366c;
                    }
                } else {
                    this.f76794b = ct.f76417c;
                }
                int iOrdinal = this.f84725f.ordinal();
                if (iOrdinal == 0) {
                    ViewPager2 viewPager4 = (ViewPager2) this.f84722c.f79225a.get();
                    if (viewPager4 != null) {
                        viewPager4.setCurrentItem(viewPager4.getCurrentItem() + 1, true);
                    }
                } else if (iOrdinal == 1 && (viewPager2 = (ViewPager2) this.f84722c.f79225a.get()) != null) {
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
                }
                bx1 bx1Var = this.f84723d;
                if (bx1Var.f76006e) {
                    bx1Var.a("first_auto_swipe");
                    bx1Var.f76006e = false;
                }
            }
            rVar = mj.r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f76794b = ct.f76417c;
        }
    }

    public xw1(ViewPager2 viewPager2, jx1 jx1Var, bx1 bx1Var) {
        this.f84722c = jx1Var;
        this.f84723d = bx1Var;
        this.f84724e = mm2.a(viewPager2);
    }
}
