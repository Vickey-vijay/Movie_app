package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fw2 implements a83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f92 f77527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final in2 f77528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l61 f77529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wc2 f77530d;

    @Override // yads.a83
    public final void a(l12 l12Var) {
        l61 l61Var = this.f77529c;
        l61Var.f79708b.removeCallbacksAndMessages(null);
        View viewA = l12Var.f79682c.a();
        if (viewA instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewA;
            n61 n61Var = l61Var.f79707a.f80092a;
            WeakReference weakReference = (WeakReference) n61Var.f80570d.get(frameLayout);
            mq mqVar = weakReference != null ? (mq) weakReference.get() : null;
            if (mqVar != null) {
                n61Var.f80570d.remove(frameLayout);
                frameLayout.removeView(mqVar);
            }
            WeakReference weakReference2 = (WeakReference) n61Var.f80571e.get(frameLayout);
            p61 p61Var = weakReference2 != null ? (p61) weakReference2.get() : null;
            if (p61Var != null) {
                n61Var.f80571e.remove(frameLayout);
                frameLayout.removeView(p61Var);
            }
        }
    }

    public fw2(tw1 tw1Var, in2 in2Var, l61 l61Var, wc2 wc2Var) {
        this.f77527a = tw1Var;
        this.f77528b = in2Var;
        this.f77529c = l61Var;
        this.f77530d = wc2Var;
    }

    @Override // yads.a83
    public final void a(d61 d61Var) {
        ((tw1) this.f77527a).f83225j = d61Var;
    }

    @Override // yads.a83
    public final void a(m42 m42Var) {
        this.f77528b.f78741d.f78290c.f77871g = m42Var;
    }

    @Override // yads.a83
    public final void a(Context context, m32 m32Var, l12 l12Var) {
        boolean z10;
        in2 in2Var = this.f77528b;
        if (!in2Var.f78743f) {
            in2Var.f78743f = true;
            fn2 fn2Var = in2Var.f78742e;
            fn2Var.f77462c.post(new en2(fn2Var, fn2Var.f77460a));
        }
        ((tw1) this.f77527a).a();
        this.f77530d.a(m32Var);
        if (l12Var != null) {
            l61 l61Var = this.f77529c;
            l61Var.f79709c.getClass();
            Object obj = dw2.f76819j;
            dw2 dw2VarA = cw2.a();
            nt2 nt2VarA = dw2VarA.a(context);
            Boolean bool = nt2VarA != null ? nt2VarA.N : null;
            synchronized (dw2.f76819j) {
                z10 = dw2VarA.f76824d;
            }
            boolean zC = dw2VarA.c();
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return;
                }
            } else if ((!z10 || !ub.a(context)) && !zC) {
                return;
            }
            l61Var.f79708b.post(new k61(l61Var, l12Var));
        }
    }

    @Override // yads.a83
    public final void a(m32 m32Var) {
        in2 in2Var = this.f77528b;
        in2Var.f78743f = false;
        in2Var.f78742e.f77462c.removeCallbacksAndMessages(null);
        ((tw1) this.f77527a).b();
        this.f77530d.b(m32Var);
        this.f77529c.f79708b.removeCallbacksAndMessages(null);
    }

    @Override // yads.a83
    public final void a(v9 v9Var, List list) {
        ((tw1) this.f77527a).a(v9Var, list);
    }
}
