package l;

import android.view.View;
import gl.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f63344a;

    public n(m mVar) {
        this.f63344a = mVar;
    }

    @Override // d.k
    public final void a() {
        m mVar = this.f63344a;
        mVar.B.onAdShow(r0.b(null, mVar.f61585f));
    }

    @Override // d.k
    public final void onAdClick() {
        this.f63344a.B.onAdClick();
    }

    @Override // d.k
    public final void onAdClose() {
        this.f63344a.B.onAdClose();
    }

    @Override // d.k
    public final void onAdLoaded(View view) {
        this.f63344a.B.onAdLoaded(view);
    }

    @Override // d.k
    public final void onVideoAdComplete() {
        this.f63344a.B.onAdVideoComplete();
    }

    @Override // d.k
    public final void onVideoAdPlay() {
        this.f63344a.B.onAdVideoStart();
    }

    @Override // d.k
    public final void onVideoError() {
        this.f63344a.x("");
    }
}
