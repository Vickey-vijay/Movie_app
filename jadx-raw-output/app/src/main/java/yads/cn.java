package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class cn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn f76326a;

    public final void a(nv0 nv0Var, rm rmVar) {
        Object next;
        RelativeLayout.LayoutParams layoutParams;
        bn bnVar = this.f76326a;
        we1 we1Var = bnVar.f75905c;
        Context context = bnVar.f75903a;
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
            ue1 ue1Var = bnVar.f75906d;
            ViewGroup viewGroup = bnVar.f75904b;
            ue1Var.getClass();
            Context context2 = viewGroup.getContext();
            int i10 = se1Var.f82622a;
            Class cls = se1Var.f82623b;
            ue1Var.f83443a.getClass();
            ViewGroup viewGroup2 = (ViewGroup) es2.a(context2, cls, i10, viewGroup);
            if (viewGroup2 != null) {
                an anVar = bnVar.f75907e;
                ViewGroup viewGroup3 = bnVar.f75904b;
                lm2 lm2Var = anVar.f75570c;
                jk.k kVar = an.f75567d[0];
                lm2Var.getClass();
                lm2Var.f79854a = new WeakReference(viewGroup2);
                viewGroup3.setVisibility(0);
                viewGroup3.removeAllViews();
                Context context3 = viewGroup3.getContext();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = anVar.f75568a;
                mj.g gVar = mk3.f80242a;
                if (viewGroup3.indexOfChild(viewGroup2) == -1) {
                    if (nv0Var != null) {
                        layoutParams = new RelativeLayout.LayoutParams(kl3.a(context3, nv0Var.c(context3)), ek.b.c(TypedValue.applyDimension(1, nv0Var.a(context3), context3.getResources().getDisplayMetrics())));
                    } else {
                        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    }
                    layoutParams.addRule(13);
                    viewGroup3.setVisibility(0);
                    viewGroup2.setVisibility(0);
                    viewGroup3.addView(viewGroup2, layoutParams);
                    if (onPreDrawListener != null) {
                        wl3 wl3Var = kl3.f79470a;
                        viewGroup2.getViewTreeObserver().addOnPreDrawListener(new jl3(viewGroup2, onPreDrawListener));
                    }
                }
                zf0 zf0Var = se1Var.f82624c;
                anVar.f75569b = zf0Var;
                if (zf0Var != null) {
                    zf0Var.a(viewGroup2);
                }
                rmVar.a();
                return;
            }
        }
        rmVar.a(h9.f78106f);
    }

    public cn(bn bnVar) {
        this.f76326a = bnVar;
    }
}
