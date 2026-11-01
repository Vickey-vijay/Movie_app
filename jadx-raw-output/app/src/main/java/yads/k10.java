package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class k10 implements b10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l10 f79277a;

    public k10(l10 l10Var) {
        this.f79277a = l10Var;
    }

    @Override // yads.b10
    public final void onFinishLoadingImages() {
        w02 w02Var = this.f79277a.I;
        if (w02Var != null) {
            w02Var.a(this);
        }
        h02 h02Var = this.f79277a.H;
        if (h02Var == null) {
            ck.p.B("nativeAdImagesAnimator");
            h02Var = null;
        }
        h02Var.a();
    }
}
