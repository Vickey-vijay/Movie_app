package dp;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f52266a;

    public o(b0 b0Var) {
        this.f52266a = b0Var;
    }

    @Override // d.k
    public final void a() {
        b0 b0Var = this.f52266a;
        b0Var.F.onAdShow(gl.r0.b(null, b0Var.f61585f));
    }

    @Override // d.k
    public final void onAdClick() {
        this.f52266a.F.onAdClick();
        b0 b0Var = this.f52266a;
        if (b0Var.D) {
            b0Var.C();
            this.f52266a.F.onAdClose();
        }
    }

    @Override // d.k
    public final void onAdClose() {
        this.f52266a.F.onAdClose();
    }

    @Override // d.k
    public final void onAdLoaded(View view) {
        this.f52266a.F.onAdLoaded(view);
    }

    @Override // d.k
    public final void onVideoAdComplete() {
        this.f52266a.F.onAdVideoComplete();
    }

    @Override // d.k
    public final void onVideoAdPlay() {
        this.f52266a.F.onAdVideoStart();
    }

    @Override // d.k
    public final void onVideoError() {
        this.f52266a.x("");
    }
}
