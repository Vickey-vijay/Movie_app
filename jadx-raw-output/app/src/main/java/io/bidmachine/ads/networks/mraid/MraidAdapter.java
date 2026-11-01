package io.bidmachine.ads.networks.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.iab.bridge.JsBridgeHandler;
import io.bidmachine.iab.bridge.NativeStorageJsBridge;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidType;
import io.bidmachine.iab.utils.Logger;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mf.a;
import mf.g;

/* JADX INFO: loaded from: classes7.dex */
public class MraidAdapter extends HeaderBiddingAdapter {

    @NonNull
    public static final String ADAPTER_SDK_VERSION_NAME = "2.5.2";

    @NonNull
    public static final String ADAPTER_VERSION_NAME = "3.3.0.1";

    @NonNull
    private static final AtomicBoolean IS_JS_BRIDGE_ADDED = new AtomicBoolean(false);

    @NonNull
    public static final String KEY = "mraid";

    public MraidAdapter() {
        super("mraid", "2.5.2", "3.3.0.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    public boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedBannerAd createBanner() {
        return new a();
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        return new g(MraidType.Static);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        return new g(MraidType.Rewarded);
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        headerBiddingCollectParamsCallback.onCollectFinished(new HashMap());
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    public void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        if (IS_JS_BRIDGE_ADDED.compareAndSet(false, true)) {
            JsBridgeHandler.addBridge(new NativeStorageJsBridge());
        }
        OMSDKSettings.initialize(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        MraidLog.setLoggingLevel(z10 ? Logger.LogLevel.debug : Logger.LogLevel.none);
    }
}
