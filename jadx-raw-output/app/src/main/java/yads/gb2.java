package yads;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class gb2 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx1 f77721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw1 f77722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f77723c;

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i10) {
        if (i10 == 0) {
            this.f77723c = false;
            return;
        }
        if (i10 != 1) {
            return;
        }
        vw1 vw1Var = this.f77722b;
        if (vw1Var != null) {
            vw1Var.a();
            vw1Var.f84030f = false;
        }
        this.f77723c = true;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i10) {
        if (this.f77723c) {
            bx1 bx1Var = this.f77721a;
            if (bx1Var.f76005d) {
                bx1Var.a("first_user_swipe");
                bx1Var.f76005d = false;
            }
            this.f77723c = false;
        }
    }

    public gb2(bx1 bx1Var, vw1 vw1Var) {
        this.f77721a = bx1Var;
        this.f77722b = vw1Var;
    }
}
