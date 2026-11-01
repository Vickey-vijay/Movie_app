package yads;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public final class k61 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l12 f79313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l61 f79314c;

    public k61(l61 l61Var, l12 l12Var) {
        this.f79314c = l61Var;
        this.f79313b = l12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p61 p61Var;
        View viewA = this.f79313b.f79682c.a();
        if (viewA instanceof FrameLayout) {
            oc1 oc1Var = this.f79314c.f79710d;
            FrameLayout frameLayout = (FrameLayout) viewA;
            tb3 tb3VarA = ((k12) oc1Var.f80993a).a(oc1Var.f80994b, frameLayout.getContext(), false);
            m61 m61Var = this.f79314c.f79707a;
            m61Var.getClass();
            boolean z10 = tb3VarA instanceof qb3;
            n61 n61Var = m61Var.f80092a;
            WeakReference weakReference = (WeakReference) n61Var.f80570d.get(frameLayout);
            mq mqVar = weakReference != null ? (mq) weakReference.get() : null;
            if (mqVar == null) {
                mqVar = new mq(frameLayout.getContext(), n61Var.f80569c, new xl0());
                n61Var.f80570d.put(frameLayout, new WeakReference(mqVar));
                frameLayout.addView(mqVar);
            }
            n61Var.f80568b.getClass();
            mqVar.setColor(z10 ? SupportMenu.CATEGORY_MASK : -16711936);
            if (z10) {
                WeakReference weakReference2 = (WeakReference) n61Var.f80571e.get(frameLayout);
                p61Var = weakReference2 != null ? (p61) weakReference2.get() : null;
                if (p61Var == null) {
                    p61Var = new p61(frameLayout.getContext(), new og0());
                    n61Var.f80571e.put(frameLayout, new WeakReference(p61Var));
                    frameLayout.addView(p61Var);
                }
                n61Var.f80567a.getClass();
                p61Var.setDescription(tl3.a(tb3VarA));
            } else {
                WeakReference weakReference3 = (WeakReference) n61Var.f80571e.get(frameLayout);
                p61Var = weakReference3 != null ? (p61) weakReference3.get() : null;
                if (p61Var != null) {
                    n61Var.f80571e.remove(frameLayout);
                    frameLayout.removeView(p61Var);
                }
            }
            l61 l61Var = this.f79314c;
            l61Var.f79708b.postDelayed(new k61(l61Var, this.f79313b), 300L);
        }
    }
}
