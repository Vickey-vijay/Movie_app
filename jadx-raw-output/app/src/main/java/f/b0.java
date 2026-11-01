package f;

import android.view.View;
import gl.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f52733a;

    @Override // d.k
    public final void onVideoAdComplete() {
    }

    @Override // d.k
    public final void onVideoAdPlay() {
    }

    public b0(s sVar) {
        this.f52733a = sVar;
    }

    @Override // d.k
    public final void a() {
        s sVar = this.f52733a;
        sVar.D.onAdShow(r0.b(null, sVar.f61585f));
    }

    @Override // d.k
    public final void onAdClick() {
        this.f52733a.D.onAdClick();
    }

    @Override // d.k
    public final void onAdClose() {
        this.f52733a.D.onAdClose();
    }

    @Override // d.k
    public final void onAdLoaded(View view) {
        this.f52733a.D.onAdLoaded(view);
    }

    @Override // d.k
    public final void onVideoError() {
        this.f52733a.x("");
    }
}
