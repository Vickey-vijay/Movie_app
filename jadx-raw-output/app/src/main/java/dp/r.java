package dp;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f52273b;

    public r(i0 i0Var) {
        this.f52273b = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f52273b.C();
        this.f52273b.F.onAdClose();
    }
}
