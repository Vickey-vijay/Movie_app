package e;

import com.applovin.mediation.MaxAd;
import gl.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f52307a;

    public t(p pVar) {
        this.f52307a = pVar;
    }

    @Override // gl.w0
    public final void a(String str) {
        this.f52307a.v(str);
    }

    @Override // gl.w0
    public final void b(MaxAd maxAd) {
        this.f52307a.f61605z = "applovin_" + maxAd.getNetworkName();
        this.f52307a.r(maxAd);
    }

    @Override // gl.w0
    public final void c(double d10) {
        this.f52307a.f(d10);
    }
}
