package dp;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f52242b;

    public b(m0 m0Var) {
        this.f52242b = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f52242b.C();
        this.f52242b.G.onAdClose();
    }
}
