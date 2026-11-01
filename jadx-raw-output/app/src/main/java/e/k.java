package e;

import android.view.View;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f52300a;

    @Override // d.k
    public final void onVideoAdComplete() {
    }

    @Override // d.k
    public final void onVideoAdPlay() {
    }

    public k(h0 h0Var) {
        this.f52300a = h0Var;
    }

    @Override // d.k
    public final void a() {
        h0 h0Var = this.f52300a;
        h0Var.M.onAdShow(r0.b(null, h0Var.f61585f));
    }

    @Override // d.k
    public final void onAdClick() {
        this.f52300a.M.onAdClick();
    }

    @Override // d.k
    public final void onAdClose() {
        this.f52300a.M.onAdClose();
    }

    @Override // d.k
    public final void onAdLoaded(View view) {
        this.f52300a.M.onAdLoaded(view);
    }

    @Override // d.k
    public final void onVideoError() {
        this.f52300a.x("");
    }
}
