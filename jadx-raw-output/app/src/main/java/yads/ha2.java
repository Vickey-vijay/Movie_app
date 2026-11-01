package yads;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import yads.ha2;

/* JADX INFO: loaded from: classes3.dex */
public final class ha2 implements fa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f78153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f78154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedCallback f78155c = new OnBackInvokedCallback() { // from class: cp.j2
        @Override // android.window.OnBackInvokedCallback
        public final void onBackInvoked() {
            ha2.a(this.f51385a);
        }
    };

    public static final void a(ha2 ha2Var) {
        w1 w1Var = ha2Var.f78154b;
        if (w1Var == null || !w1Var.f84070c.d()) {
            return;
        }
        ha2Var.f78153a.finish();
    }

    @Override // yads.fa2
    public final void destroy() {
        this.f78153a.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f78155c);
    }

    public ha2(Activity activity, w1 w1Var) {
        this.f78153a = activity;
        this.f78154b = w1Var;
    }

    @Override // yads.fa2
    public final void a() {
        this.f78153a.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f78155c);
    }
}
