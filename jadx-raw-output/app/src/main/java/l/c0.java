package l;

import com.applovin.mediation.MaxAd;
import gl.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f63320a;

    public c0(l lVar) {
        this.f63320a = lVar;
    }

    @Override // gl.w0
    public final void a(String str) {
        this.f63320a.v(str);
    }

    @Override // gl.w0
    public final void b(MaxAd maxAd) {
        this.f63320a.f61605z = "applovin_" + maxAd.getNetworkName();
        this.f63320a.r(maxAd);
    }

    @Override // gl.w0
    public final void c(double d10) {
        this.f63320a.f(d10);
    }
}
