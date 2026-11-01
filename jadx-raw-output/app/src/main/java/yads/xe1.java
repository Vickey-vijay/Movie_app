package yads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class xe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f84558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f84559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we1 f84560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue1 f84561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final te1 f84562e;

    public final boolean a() {
        Object next;
        we1 we1Var = this.f84560c;
        Context context = this.f84558a;
        Iterator it = we1Var.f84179a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((se1) next).f82625d.a(context));
        se1 se1Var = (se1) next;
        if (se1Var != null) {
            ue1 ue1Var = this.f84561d;
            ViewGroup viewGroup = this.f84559b;
            ue1Var.getClass();
            Context context2 = viewGroup.getContext();
            int i10 = se1Var.f82622a;
            Class cls = se1Var.f82623b;
            ue1Var.f83443a.getClass();
            ViewGroup viewGroup2 = (ViewGroup) es2.a(context2, cls, i10, viewGroup);
            if (viewGroup2 != null) {
                te1 te1Var = this.f84562e;
                ViewGroup viewGroup3 = this.f84559b;
                te1Var.getClass();
                try {
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    viewGroup3.removeAllViews();
                    viewGroup3.addView(viewGroup2, layoutParams);
                } catch (Throwable unused) {
                }
                zf0 zf0Var = se1Var.f82624c;
                te1Var.f83001a = zf0Var;
                if (zf0Var != null) {
                    zf0Var.a(viewGroup2);
                }
                return true;
            }
        }
        return false;
    }

    public final void b() {
        te1 te1Var = this.f84562e;
        ViewGroup viewGroup = this.f84559b;
        te1Var.getClass();
        try {
            viewGroup.removeAllViews();
            zf0 zf0Var = te1Var.f83001a;
            if (zf0Var != null) {
                zf0Var.c();
            }
        } catch (Throwable unused) {
        }
    }

    public xe1(Context context, ViewGroup viewGroup, we1 we1Var, ue1 ue1Var, te1 te1Var) {
        this.f84558a = context;
        this.f84559b = viewGroup;
        this.f84560c = we1Var;
        this.f84561d = ue1Var;
        this.f84562e = te1Var;
    }
}
