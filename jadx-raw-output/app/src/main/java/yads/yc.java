package yads;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class yc implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f84881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke1 f84882b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f84882b.getClass();
        ke1.a(view);
        ng0.a(this.f84881a);
    }

    public yc(Dialog dialog, ke1 ke1Var) {
        this.f84881a = dialog;
        this.f84882b = ke1Var;
    }
}
