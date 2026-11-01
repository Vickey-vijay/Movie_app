package f;

import com.applovin.mediation.MaxAd;
import gl.w0;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f52741a;

    public e0(o oVar) {
        this.f52741a = oVar;
    }

    @Override // gl.w0
    public final void a(String str) {
        this.f52741a.v(str);
    }

    @Override // gl.w0
    public final void b(MaxAd maxAd) {
        this.f52741a.f61605z = "applovin_" + maxAd.getNetworkName();
        this.f52741a.r(maxAd);
    }

    @Override // gl.w0
    public final void c(double d10) {
        this.f52741a.f(d10);
    }
}
