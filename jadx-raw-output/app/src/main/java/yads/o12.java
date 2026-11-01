package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes7.dex */
public final class o12 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f80890d = {wb.a(o12.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o32 f80891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f80892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f80893c;

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        lm2 lm2Var = this.f80892b;
        jk.k kVar = f80890d[0];
        View view = (View) lm2Var.f79854a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        lm2 lm2Var = this.f80892b;
        jk.k kVar = f80890d[0];
        View view = (View) lm2Var.f79854a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.f80893c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.f80893c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.f80891a.f80925a.g();
            } else {
                this.f80891a.f80925a.h();
            }
        }
    }

    public o12(View view, o32 o32Var) {
        this.f80891a = o32Var;
        this.f80892b = mm2.a(view);
    }
}
