package gl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.yk.e.util.AdLog;
import com.yk.e.util.UsLocalSaveHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends MaxNativeAdListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f53533g;

    public l0(n0 n0Var) {
        this.f53533g = n0Var;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdClicked(MaxAd maxAd) {
        super.onNativeAdClicked(maxAd);
        this.f53533g.f53557o.onAdClick();
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdExpired(MaxAd maxAd) {
        super.onNativeAdExpired(maxAd);
        n0.c(this.f53533g, "onNativeAdExpired");
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoadFailed(String str, MaxError maxError) {
        super.onNativeAdLoadFailed(str, maxError);
        n0 n0Var = this.f53533g;
        if (n0Var.f53559q == 0) {
            n0Var.d("applovin native retry");
            n0 n0Var2 = this.f53533g;
            n0Var2.b(n0Var2.f53543a);
            this.f53533g.f53559q++;
            return;
        }
        n0.c(n0Var, maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        super.onNativeAdLoaded(maxNativeAdView, maxAd);
        try {
            n0 n0Var = this.f53533g;
            if (n0Var.f53562t) {
                return;
            }
            n0Var.f53561s = true;
            if (maxAd.getNativeAd() != null && maxAd.getNativeAd().isExpired()) {
                this.f53533g.f53558p.destroy(maxAd);
                n0 n0Var2 = this.f53533g;
                n0Var2.f53558p.loadAd(n0.a(n0Var2).f51760b);
                return;
            }
            n0 n0Var3 = this.f53533g;
            if (n0Var3.f53563u) {
                d0 d0Var = new d0();
                d0Var.f53470a = n0Var3.f53558p;
                d0Var.f53472c = maxAd;
                d0Var.f53471b = maxNativeAdView;
                m mVarA = m.a();
                String str = this.f53533g.f53544b;
                mVarA.getClass();
                try {
                    mVarA.f53536a.putIfAbsent(str, d0Var);
                    AdLog.d("OktMaxNativeCacheUtil", "putCache, cacheAdMap " + mVarA.f53536a.toString());
                } catch (Exception e10) {
                    AdLog.e(e10.getMessage(), e10);
                }
                this.f53533g.f53563u = false;
                return;
            }
            w0 w0Var = n0Var3.f53552j;
            if (w0Var != null) {
                w0Var.b(maxAd);
            }
            n0 n0Var4 = this.f53533g;
            n0Var4.f53560r = maxAd;
            double revenue = maxAd.getRevenue();
            w0 w0Var2 = n0Var4.f53552j;
            if (w0Var2 != null) {
                w0Var2.c(revenue);
            }
            h.a(maxNativeAdView);
            this.f53533g.f53557o.onAdLoaded(maxNativeAdView);
            if (UsLocalSaveHelper.getInstance().useNativeCache() && !UsLocalSaveHelper.getInstance().isClientBidding()) {
                this.f53533g.d("load next max native ad");
                n0 n0Var5 = this.f53533g;
                n0Var5.f53558p.loadAd(n0.a(n0Var5).f51760b);
                this.f53533g.f53563u = true;
            }
        } catch (Exception e11) {
            AdLog.e(e11.getMessage(), e11);
            n0.c(this.f53533g, e11.getMessage());
        }
    }
}
