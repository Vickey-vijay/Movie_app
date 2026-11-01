package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes9.dex */
public final class u12 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f83325e = {wb.a(u12.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o32 f83326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p12 f83327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o12 f83328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f83329d;

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        lm2 lm2Var = this.f83329d;
        jk.k[] kVarArr = f83325e;
        jk.k kVar = kVarArr[0];
        View view = (View) lm2Var.f79854a.get();
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        lm2 lm2Var2 = this.f83329d;
        jk.k kVar2 = kVarArr[0];
        View view2 = (View) lm2Var2.f79854a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            p12 p12Var = this.f83327b;
            o32 o32Var = this.f83326a;
            p12Var.getClass();
            o12 o12Var = new o12(view2, o32Var);
            this.f83328c = o12Var;
            lm2 lm2Var3 = o12Var.f80892b;
            jk.k kVar3 = o12.f80890d[0];
            View view3 = (View) lm2Var3.f79854a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(o12Var);
        }
    }

    public final void b() {
        o12 o12Var = this.f83328c;
        if (o12Var != null) {
            o12Var.a();
        }
        this.f83328c = null;
        lm2 lm2Var = this.f83329d;
        jk.k kVar = f83325e[0];
        View view = (View) lm2Var.f79854a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        this.f83326a.f80925a.g();
        lm2 lm2Var = this.f83329d;
        jk.k kVar = f83325e[0];
        View view2 = (View) lm2Var.f79854a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            p12 p12Var = this.f83327b;
            o32 o32Var = this.f83326a;
            p12Var.getClass();
            o12 o12Var = new o12(view2, o32Var);
            this.f83328c = o12Var;
            lm2 lm2Var2 = o12Var.f80892b;
            jk.k kVar2 = o12.f80890d[0];
            View view3 = (View) lm2Var2.f79854a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(o12Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        o12 o12Var = this.f83328c;
        if (o12Var != null) {
            o12Var.a();
        }
        this.f83328c = null;
        this.f83326a.f80925a.h();
    }

    public u12(View view, o32 o32Var, p12 p12Var) {
        this.f83326a = o32Var;
        this.f83327b = p12Var;
        this.f83329d = mm2.a(view);
    }
}
