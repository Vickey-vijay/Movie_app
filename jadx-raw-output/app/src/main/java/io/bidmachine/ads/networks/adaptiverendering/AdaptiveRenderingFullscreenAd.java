package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import ck.p;
import com.ironsource.C3605n2;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.rendering.ad.fullscreen.FullScreenAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;
import kotlin.Metadata;

/* JADX INFO: compiled from: AdaptiveRenderingFullscreenAd.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingFullscreenAd;", "Lio/bidmachine/unified/UnifiedFullscreenAd;", "Lio/bidmachine/ContextProvider;", "contextProvider", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "callback", "Lio/bidmachine/unified/UnifiedFullscreenAdRequestParams;", "requestParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "unifiedMediationParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "Lmj/r;", "load", C3605n2.f30216v, "onDestroy", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;", "fullScreenAd", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;", "<init>", "()V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class AdaptiveRenderingFullscreenAd extends UnifiedFullscreenAd {
    private FullScreenAd fullScreenAd;

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        p.j(contextProvider, "contextProvider");
        p.j(unifiedFullscreenAdCallback, "callback");
        p.j(unifiedFullscreenAdRequestParams, "requestParams");
        p.j(unifiedMediationParams, "unifiedMediationParams");
        p.j(networkAdUnit, "networkAdUnit");
        Context applicationContext = contextProvider.getApplicationContext();
        p.i(applicationContext, "contextProvider.getApplicationContext()");
        AdaptiveRenderingParams adaptiveRenderingParams = new AdaptiveRenderingParams(unifiedMediationParams);
        if (adaptiveRenderingParams.isValid(unifiedFullscreenAdCallback)) {
            if (adaptiveRenderingParams.getAdParams() == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            FullScreenAd fullScreenAd = new FullScreenAd(applicationContext, adaptiveRenderingParams.getAdParams());
            fullScreenAd.setFullScreenAdListener(new AdaptiveRenderingFullscreenAdListener(applicationContext, unifiedFullscreenAdCallback));
            this.fullScreenAd = fullScreenAd;
            fullScreenAd.load();
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        FullScreenAd fullScreenAd = this.fullScreenAd;
        if (fullScreenAd != null) {
            fullScreenAd.destroy();
        }
        this.fullScreenAd = null;
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        p.j(contextProvider, "contextProvider");
        p.j(unifiedFullscreenAdCallback, "callback");
        FullScreenAd fullScreenAd = this.fullScreenAd;
        if (fullScreenAd == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("AdaptiveRendering fullscreen object is null"));
            return;
        }
        if (!fullScreenAd.isLoaded()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("AdaptiveRendering fullscreen object not loaded"));
        } else if (fullScreenAd.isFinished()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("AdaptiveRendering fullscreen object already is finished"));
        } else {
            fullScreenAd.show(contextProvider.getApplicationContext());
        }
    }
}
