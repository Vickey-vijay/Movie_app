package yads;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class ai0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh0 f75525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci0 f75526b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            this.f75525a.a(this.f75526b.f76285a, view);
        }
    }

    public ai0(zh0 zh0Var, ci0 ci0Var) {
        this.f75525a = zh0Var;
        this.f75526b = ci0Var;
    }
}
