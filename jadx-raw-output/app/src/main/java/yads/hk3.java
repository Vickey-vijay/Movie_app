package yads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hk3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f78271b = {wb.a(hk3.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f78272a;

    public void a() {
    }

    public void a(View view) {
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public abstract boolean a(View view, Object obj);

    public abstract void b(View view, Object obj);

    public final View b() {
        lm2 lm2Var = this.f78272a;
        jk.k kVar = f78271b[0];
        return (View) lm2Var.f79854a.get();
    }

    public hk3(View view) {
        this.f78272a = mm2.a(view);
    }

    public final boolean c() {
        View viewB = b();
        if (viewB != null && !kl3.b(viewB) && viewB.getWidth() >= 1 && viewB.getHeight() >= 1) {
            return true;
        }
        return false;
    }

    public void a(oi oiVar, kk3 kk3Var, Object obj) {
        View viewB = b();
        if (viewB == null) {
            return;
        }
        kk3Var.a(viewB, oiVar);
        kk3Var.a(oiVar, new jk3(viewB));
    }
}
