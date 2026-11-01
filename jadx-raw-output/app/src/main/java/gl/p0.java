package gl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.ironsource.Z7;
import com.yk.e.object.ThirdAdLifeListener;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends ThirdAdLifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f53576a;

    public p0(n0 n0Var) {
        this.f53576a = n0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        this.f53576a.getClass();
        n0 n0Var = this.f53576a;
        MaxNativeAdLoader maxNativeAdLoader = n0Var.f53558p;
        if (maxNativeAdLoader != null) {
            maxNativeAdLoader.destroy(n0Var.f53560r);
            this.f53576a.f53558p.destroy();
        }
        m mVarA = m.a();
        String str = this.f53576a.f53544b;
        synchronized (mVarA) {
            try {
                d0 d0Var = (d0) mVarA.f53536a.get(str);
                if (d0Var != null) {
                    MaxAd maxAd = d0Var.f53472c;
                    MaxNativeAdLoader maxNativeAdLoader2 = d0Var.f53470a;
                    maxNativeAdLoader2.destroy(maxAd);
                    maxNativeAdLoader2.destroy();
                    mVarA.f53536a.remove(str);
                    AdLog.d("OktMaxNativeCacheUtil", "destroy " + str + Z7.f27998r + mVarA.f53536a.toString());
                }
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        }
    }
}
