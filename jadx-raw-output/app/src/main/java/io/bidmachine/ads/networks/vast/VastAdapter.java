package io.bidmachine.ads.networks.vast;

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
import io.bidmachine.iab.utils.Logger;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VideoType;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedFullscreenAd;
import java.util.HashMap;
import of.a;

/* JADX INFO: loaded from: classes11.dex */
public class VastAdapter extends HeaderBiddingAdapter {

    @NonNull
    public static final String ADAPTER_SDK_VERSION_NAME = "2.5.2";

    @NonNull
    public static final String ADAPTER_VERSION_NAME = "3.3.0.1";

    @NonNull
    public static final String KEY = "vast";

    public VastAdapter() {
        super("vast", "2.5.2", "3.3.0.1", 1, new AdsType[]{AdsType.Interstitial, AdsType.Rewarded});
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
    public UnifiedFullscreenAd createInterstitial() {
        return new a(VideoType.NonRewarded);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        return new a(VideoType.Rewarded);
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        headerBiddingCollectParamsCallback.onCollectFinished(new HashMap());
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        VastLog.setLoggingLevel(z10 ? Logger.LogLevel.debug : Logger.LogLevel.none);
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    public void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        OMSDKSettings.initialize(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }
}
