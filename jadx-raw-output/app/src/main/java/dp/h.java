package dp;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f52252b;

    public h(a0 a0Var) {
        this.f52252b = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f52252b.C();
        this.f52252b.F.onAdClose();
    }
}
