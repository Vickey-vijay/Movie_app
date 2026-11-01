package dp;

import com.applovin.mediation.MaxAd;
import gl.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f52262a;

    public l(g gVar) {
        this.f52262a = gVar;
    }

    @Override // gl.w0
    public final void a(String str) {
        this.f52262a.v(str);
    }

    @Override // gl.w0
    public final void b(MaxAd maxAd) {
        this.f52262a.f61605z = "applovin_" + maxAd.getNetworkName();
        this.f52262a.r(maxAd);
    }

    @Override // gl.w0
    public final void c(double d10) {
        this.f52262a.f(d10);
    }
}
