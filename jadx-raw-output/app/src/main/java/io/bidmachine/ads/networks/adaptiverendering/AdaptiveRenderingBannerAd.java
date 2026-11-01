package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import ck.p;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.rendering.ad.view.AdView;
import io.bidmachine.rendering.model.CacheType;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;

/* JADX INFO: compiled from: AdaptiveRenderingBannerAd.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingBannerAd;", "Lio/bidmachine/unified/UnifiedBannerAd;", "Lio/bidmachine/ContextProvider;", "contextProvider", "Lio/bidmachine/unified/UnifiedBannerAdCallback;", "callback", "Lio/bidmachine/unified/UnifiedBannerAdRequestParams;", "requestParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "unifiedMediationParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "Lmj/r;", "load", "onDestroy", "Lio/bidmachine/rendering/ad/view/AdView;", "adView", "Lio/bidmachine/rendering/ad/view/AdView;", "<init>", "()V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class AdaptiveRenderingBannerAd extends UnifiedBannerAd {
    private AdView adView;

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(ContextProvider contextProvider, UnifiedBannerAdCallback unifiedBannerAdCallback, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        p.j(contextProvider, "contextProvider");
        p.j(unifiedBannerAdCallback, "callback");
        p.j(unifiedBannerAdRequestParams, "requestParams");
        p.j(unifiedMediationParams, "unifiedMediationParams");
        p.j(networkAdUnit, "networkAdUnit");
        Context applicationContext = contextProvider.getApplicationContext();
        p.i(applicationContext, "contextProvider.getApplicationContext()");
        AdaptiveRenderingParams adaptiveRenderingParams = new AdaptiveRenderingParams(unifiedMediationParams);
        if (adaptiveRenderingParams.isValid(unifiedBannerAdCallback)) {
            if (adaptiveRenderingParams.getAdParams() == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            unifiedBannerAdCallback.setVisibilitySource(adaptiveRenderingParams.getAdParams().getCacheType() == CacheType.FullLoad ? VisibilitySource.BidMachine : VisibilitySource.All);
            AdView adView = new AdView(applicationContext, adaptiveRenderingParams.getAdParams());
            adView.setAdViewListener(new AdaptiveRenderingBannerAdListener(unifiedBannerAdCallback));
            this.adView = adView;
            adView.load();
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        AdView adView = this.adView;
        if (adView != null) {
            adView.destroy();
        }
        this.adView = null;
    }
}
