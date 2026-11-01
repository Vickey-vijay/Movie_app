package io.bidmachine.ads.networks.adaptiverendering;

import ck.p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.iab.mraid.MraidNativeFeature;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import java.util.HashMap;
import kotlin.Metadata;
import nj.n;

/* JADX INFO: compiled from: AdaptiveRenderingAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J0\u0010\u001e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¨\u0006\""}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingAdapter;", "Lio/bidmachine/HeaderBiddingAdapter;", "", "enabled", "Lmj/r;", "setLogging", "Lio/bidmachine/unified/UnifiedBannerAd;", "createBanner", "Lio/bidmachine/unified/UnifiedFullscreenAd;", "createInterstitial", "createRewarded", "Lio/bidmachine/ContextProvider;", "contextProvider", "isNetworkInitialized", "isNetworkInitializationStatusCheckSupported", "Lio/bidmachine/InitializationParams;", "initializationParams", "Lio/bidmachine/NetworkConfigParams;", "networkConfigParams", "Lio/bidmachine/NetworkInitializationCallback;", "callback", "onNetworkInitialize", "Lio/bidmachine/unified/UnifiedAdRequestParams;", "adRequestParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "Lio/bidmachine/HeaderBiddingAdRequestParams;", "hbAdRequestParams", "Lio/bidmachine/HeaderBiddingCollectParamsCallback;", "collectCallback", "onCollectHeaderBiddingParams", "<init>", "()V", VastTagName.COMPANION, "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class AdaptiveRenderingAdapter extends HeaderBiddingAdapter {
    public static final String ADAPTER_SDK_VERSION_NAME = "2.5.2";
    public static final String ADAPTER_VERSION_NAME = "3.3.0.1";
    public static final String KEY = "adaptive_rendering";

    public AdaptiveRenderingAdapter() {
        super(KEY, "2.5.2", "3.3.0.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        p.j(contextProvider, "contextProvider");
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedBannerAd createBanner() {
        return new AdaptiveRenderingBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        return new AdaptiveRenderingFullscreenAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        return new AdaptiveRenderingFullscreenAd();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        p.j(contextProvider, "contextProvider");
        p.j(unifiedAdRequestParams, "adRequestParams");
        p.j(networkAdUnit, "networkAdUnit");
        p.j(headerBiddingAdRequestParams, "hbAdRequestParams");
        p.j(headerBiddingCollectParamsCallback, "collectCallback");
        HashMap map = new HashMap();
        String[] supportedFeatures = MraidNativeFeature.getSupportedFeatures(contextProvider.getApplicationContext());
        p.i(supportedFeatures, "getSupportedFeatures(con….getApplicationContext())");
        map.put("features", n.a0(supportedFeatures, StringUtils.COMMA, null, null, 0, null, null, 62, null));
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        p.j(contextProvider, "contextProvider");
        p.j(initializationParams, "initializationParams");
        p.j(networkConfigParams, "networkConfigParams");
        p.j(networkInitializationCallback, "callback");
        Rendering.initialize(contextProvider.getApplicationContext());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        Rendering.setLoggingEnabled(z10);
    }
}
