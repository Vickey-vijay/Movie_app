package com.applovin.mediation.adapters;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.bidmachine.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsFormat;
import io.bidmachine.BidMachine;
import io.bidmachine.BidTokenCallback;
import io.bidmachine.ImageData;
import io.bidmachine.InitializationCallback;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerRequest;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.interstitial.InterstitialRequest;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.NativeRequest;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.rewarded.RewardedRequest;
import io.bidmachine.utils.BMError;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class BidMachineMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 10;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private BannerView adView;
    private InterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private RewardedAd rewardedAd;

    public class AdViewListener implements BannerListener {
        private final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // io.bidmachine.banner.BannerListener, io.bidmachine.AdListener
        public void onAdClicked(@NonNull BannerView bannerView) {
            BidMachineMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // io.bidmachine.banner.BannerListener, io.bidmachine.AdListener
        public void onAdExpired(@NonNull BannerView bannerView) {
            BidMachineMediationAdapter.this.log("AdView ad expired");
        }

        @Override // io.bidmachine.banner.BannerListener, io.bidmachine.AdListener
        public void onAdImpression(@NonNull BannerView bannerView) {
            BidMachineMediationAdapter.this.log("AdView ad impression");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // io.bidmachine.banner.BannerListener, io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull BannerView bannerView, @NonNull BMError bMError) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(bMError);
            BidMachineMediationAdapter.this.log("AdView ad failed to load with error (" + maxError + ")");
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.banner.BannerListener, io.bidmachine.AdListener
        public void onAdLoaded(@NonNull BannerView bannerView) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("AdView ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(bannerView.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onAdViewAdLoaded(bannerView, bundle);
        }

        @Override // io.bidmachine.banner.BannerListener, io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull BannerView bannerView, @NonNull BMError bMError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, bMError.getCode(), bMError.getMessage());
            BidMachineMediationAdapter.this.log("AdView ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }
    }

    public class InterstitialAdListener implements InterstitialListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
        public void onAdClicked(@NonNull InterstitialAd interstitialAd) {
            BidMachineMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdFullScreenListener
        public void onAdClosed(@NonNull InterstitialAd interstitialAd, boolean z10) {
            BidMachineMediationAdapter.this.log("Interstitial ad closed");
            this.listener.onInterstitialAdHidden();
        }

        @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
        public void onAdExpired(@NonNull InterstitialAd interstitialAd) {
            BidMachineMediationAdapter.this.log("Interstitial ad expired");
        }

        @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
        public void onAdImpression(@NonNull InterstitialAd interstitialAd) {
            BidMachineMediationAdapter.this.log("Interstitial ad impression");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull InterstitialAd interstitialAd, @NonNull BMError bMError) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(bMError);
            BidMachineMediationAdapter.this.log("Interstitial ad failed to load with error (" + maxError + ")");
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("Interstitial ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(interstitialAd.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onInterstitialAdLoaded(bundle);
        }

        @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull InterstitialAd interstitialAd, @NonNull BMError bMError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, bMError.getCode(), bMError.getMessage());
            BidMachineMediationAdapter.this.log("Interstitial ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }
    }

    public class MaxBidMachineNativeAd extends MaxNativeAd {
        public MaxBidMachineNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            NativeAd nativeAd = BidMachineMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                BidMachineMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            BidMachineMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            HashSet hashSet = new HashSet(list);
            ImageView imageView = null;
            for (View view : list) {
                if (view instanceof ImageView) {
                    imageView = (ImageView) view;
                    break;
                }
            }
            nativeAd.registerView(viewGroup, imageView, (NativeMediaView) getMediaView(), hashSet);
            return true;
        }
    }

    public class NativeAdListener implements NativeListener {
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        public NativeAdListener(Bundle bundle, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = bundle;
            this.listener = maxNativeAdAdapterListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleNativeAdLoaded(@NonNull final NativeAd nativeAd, final MaxNativeAd.MaxNativeAdImage maxNativeAdImage) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.NativeAdListener.2
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAd.Builder mediaView = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(nativeAd.getTitle()).setBody(nativeAd.getDescription()).setCallToAction(nativeAd.getCallToAction()).setIcon(maxNativeAdImage).setOptionsView(nativeAd.getProviderView(BidMachineMediationAdapter.this.getApplicationContext())).setMediaView(new NativeMediaView(BidMachineMediationAdapter.this.getApplicationContext()));
                    if (nativeAd.getMainImage() != null) {
                        mediaView.setMainImage(new MaxNativeAd.MaxNativeAdImage(nativeAd.getMainImage().getImage()));
                    }
                    MaxBidMachineNativeAd maxBidMachineNativeAd = BidMachineMediationAdapter.this.new MaxBidMachineNativeAd(mediaView);
                    String creativeId = BidMachineMediationAdapter.this.getCreativeId(nativeAd.getAuctionResult());
                    Bundle bundle = null;
                    if (!TextUtils.isEmpty(creativeId)) {
                        bundle = new Bundle(1);
                        bundle.putString("creative_id", creativeId);
                    }
                    NativeAdListener.this.listener.onNativeAdLoaded(maxBidMachineNativeAd, bundle);
                }
            });
        }

        @Override // io.bidmachine.nativead.NativeListener, io.bidmachine.AdListener
        public void onAdClicked(@NonNull NativeAd nativeAd) {
            BidMachineMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // io.bidmachine.nativead.NativeListener, io.bidmachine.AdListener
        public void onAdExpired(@NonNull NativeAd nativeAd) {
            BidMachineMediationAdapter.this.log("Native ad expired");
        }

        @Override // io.bidmachine.nativead.NativeListener, io.bidmachine.AdListener
        public void onAdImpression(@NonNull NativeAd nativeAd) {
            BidMachineMediationAdapter.this.log("Native ad impression");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // io.bidmachine.nativead.NativeListener, io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull NativeAd nativeAd, @NonNull BMError bMError) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(bMError);
            BidMachineMediationAdapter.this.log("Native ad failed to load with error (" + maxError + ")");
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.nativead.NativeListener, io.bidmachine.AdListener
        public void onAdLoaded(@NonNull final NativeAd nativeAd) {
            BidMachineMediationAdapter.this.log("Native ad loaded");
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(nativeAd.getTitle())) {
                BidMachineMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            ImageData icon = nativeAd.getIcon();
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage = null;
            if (icon == null) {
                handleNativeAdLoaded(nativeAd, null);
                return;
            }
            Drawable image = icon.getImage();
            Uri localUri = icon.getLocalUri();
            final String remoteUrl = icon.getRemoteUrl();
            if (image != null) {
                maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(image);
            } else if (localUri != null) {
                maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(localUri);
            } else if (remoteUrl != null) {
                BidMachineMediationAdapter.this.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.NativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Drawable drawable;
                        BidMachineMediationAdapter.this.log("Adding native ad icon (" + remoteUrl + ") to queue to be fetched");
                        BidMachineMediationAdapter bidMachineMediationAdapter = BidMachineMediationAdapter.this;
                        try {
                            drawable = bidMachineMediationAdapter.createDrawableFuture(remoteUrl, bidMachineMediationAdapter.getApplicationContext().getResources()).get(BundleUtils.getInt("image_task_timeout_seconds", 10, NativeAdListener.this.serverParameters), TimeUnit.SECONDS);
                        } catch (Throwable th2) {
                            BidMachineMediationAdapter.this.e("Failed to fetch icon image", th2);
                            drawable = null;
                        }
                        NativeAdListener.this.handleNativeAdLoaded(nativeAd, new MaxNativeAd.MaxNativeAdImage(drawable));
                    }
                });
                return;
            }
            handleNativeAdLoaded(nativeAd, maxNativeAdImage);
        }

        @Override // io.bidmachine.nativead.NativeListener, io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull NativeAd nativeAd, @NonNull BMError bMError) {
            BidMachineMediationAdapter.this.log("Native ad failed to show with error (" + bMError + ")");
        }
    }

    public class RewardedAdListener implements RewardedListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
        public void onAdClicked(@NonNull RewardedAd rewardedAd) {
            BidMachineMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdFullScreenListener
        public void onAdClosed(@NonNull RewardedAd rewardedAd, boolean z10) {
            BidMachineMediationAdapter.this.log("Rewarded ad closed");
            if (this.hasGrantedReward || BidMachineMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = BidMachineMediationAdapter.this.getReward();
                BidMachineMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
        public void onAdExpired(@NonNull RewardedAd rewardedAd) {
            BidMachineMediationAdapter.this.log("Rewarded ad expired");
        }

        @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
        public void onAdImpression(@NonNull RewardedAd rewardedAd) {
            BidMachineMediationAdapter.this.log("Rewarded ad impression");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull RewardedAd rewardedAd, @NonNull BMError bMError) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(bMError);
            BidMachineMediationAdapter.this.log("Rewarded ad failed to load with error (" + maxError + ")");
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("Rewarded ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(rewardedAd.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onRewardedAdLoaded(bundle);
        }

        @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdRewardedListener
        public void onAdRewarded(@NonNull RewardedAd rewardedAd) {
            BidMachineMediationAdapter.this.log("Rewarded ad should grant reward");
            this.hasGrantedReward = true;
        }

        @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull RewardedAd rewardedAd, @NonNull BMError bMError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, bMError.getCode(), bMError.getMessage());
            BidMachineMediationAdapter.this.log("Rewarded ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String getCreativeId(@Nullable AuctionResult auctionResult) {
        if (auctionResult != null) {
            return auctionResult.getCreativeId();
        }
        return null;
    }

    private BannerSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return BannerSize.Size_320x50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return BannerSize.Size_728x90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return BannerSize.Size_300x250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal for " + maxAdapterSignalCollectionParameters.getAdFormat().getLabel() + " ad...");
        updateSettings(maxAdapterSignalCollectionParameters);
        AdsFormat adsFormat = toAdsFormat(maxAdapterSignalCollectionParameters);
        if (adsFormat == null) {
            log("Signal collection failed with error: invalid ad format - ad format is null");
            maxSignalCollectionListener.onSignalCollectionFailed("invalid ad format - ad format is null");
            return;
        }
        String adUnitId = maxAdapterSignalCollectionParameters.getAdUnitId();
        AdPlacementConfig.Builder builder = new AdPlacementConfig.Builder(adsFormat);
        Bundle bundle = BundleUtils.getBundle("placement_ids", Bundle.EMPTY, maxAdapterSignalCollectionParameters.getServerParameters());
        if (AppLovinSdkUtils.isValidString(adUnitId)) {
            String string = bundle.getString(adUnitId);
            if (AppLovinSdkUtils.isValidString(string)) {
                builder.withPlacementId(string);
            } else {
                log("No valid slot ID found during signal collection");
            }
        }
        BidMachine.getBidToken(getApplicationContext(), builder.build(), new BidTokenCallback() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.2
            @Override // io.bidmachine.BidTokenCallback
            public void onCollected(@NonNull String str) {
                BidMachineMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(BidMachine.class, "VERSION");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        final String string = maxAdapterInitializationParameters.getServerParameters().getString("source_id");
        log("Initializing BidMachine SDK with source id: " + string);
        BidMachine.setLoggingEnabled(maxAdapterInitializationParameters.isTesting());
        BidMachine.setTestMode(maxAdapterInitializationParameters.isTesting());
        updateSettings(maxAdapterInitializationParameters);
        BidMachine.initialize(getApplicationContext(), string, new InitializationCallback() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.1
            @Override // io.bidmachine.InitializationCallback
            public void onInitialized() {
                BidMachineMediationAdapter.this.log("BidMachine SDK successfully finished initialization with source id: " + string);
                MaxAdapter.InitializationStatus unused = BidMachineMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(BidMachineMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        log("Loading " + maxAdFormat.getLabel() + " ad...");
        updateSettings(maxAdapterResponseParameters);
        BannerView bannerView = new BannerView(getApplicationContext());
        this.adView = bannerView;
        bannerView.setListener(new AdViewListener(maxAdViewAdapterListener));
        this.adView.load((BannerRequest) ((BannerRequest.Builder) new BannerRequest.Builder().setSize(toAdSize(maxAdFormat)).setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Loading interstitial ad...");
        updateSettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(getApplicationContext());
        this.interstitialAd = interstitialAd;
        interstitialAd.setListener(new InterstitialAdListener(maxInterstitialAdapterListener));
        this.interstitialAd.load((InterstitialRequest) ((InterstitialRequest.Builder) new InterstitialRequest.Builder().setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        log("Loading native ad...");
        updateSettings(maxAdapterResponseParameters);
        NativeAd nativeAd = new NativeAd(getApplicationContext());
        this.nativeAd = nativeAd;
        nativeAd.setListener(new NativeAdListener(maxAdapterResponseParameters.getServerParameters(), maxNativeAdAdapterListener));
        this.nativeAd.load((NativeRequest) ((NativeRequest.Builder) new NativeRequest.Builder().setMediaAssetTypes(MediaAssetType.All).setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Loading rewarded ad...");
        updateSettings(maxAdapterResponseParameters);
        RewardedAd rewardedAd = new RewardedAd(getApplicationContext());
        this.rewardedAd = rewardedAd;
        rewardedAd.setListener(new RewardedAdListener(maxRewardedAdapterListener));
        this.rewardedAd.load((RewardedRequest) ((RewardedRequest.Builder) new RewardedRequest.Builder().setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setListener(null);
            this.interstitialAd.destroy();
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setListener(null);
            this.rewardedAd.destroy();
            this.rewardedAd = null;
        }
        BannerView bannerView = this.adView;
        if (bannerView != null) {
            bannerView.setListener(null);
            this.adView.destroy();
            this.adView = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.nativeAd.setListener(null);
            this.nativeAd.destroy();
            this.nativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        if (this.interstitialAd.isExpired()) {
            log("Unable to show interstitial - ad expired");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (this.interstitialAd.canShow()) {
            this.interstitialAd.show();
            return;
        }
        log("Unable to show interstitial - ad not ready");
        MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAd.isExpired()) {
            log("Unable to show rewarded ad - ad expired");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (this.rewardedAd.canShow()) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
        } else {
            log("Unable to show rewarded ad - ad not ready");
            MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
        }
    }

    public BidMachineMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @Nullable
    private AdsFormat toAdsFormat(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        if (adFormat == MaxAdFormat.BANNER) {
            return AdsFormat.Banner_320x50;
        }
        if (adFormat == MaxAdFormat.MREC) {
            return AdsFormat.Banner_300x250;
        }
        if (adFormat == MaxAdFormat.LEADER) {
            return AdsFormat.Banner_728x90;
        }
        if (adFormat == MaxAdFormat.NATIVE) {
            return AdsFormat.Native;
        }
        if (adFormat == MaxAdFormat.INTERSTITIAL) {
            return AdsFormat.Interstitial;
        }
        if (adFormat == MaxAdFormat.REWARDED) {
            return AdsFormat.Rewarded;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    public MaxAdapterError toMaxError(BMError bMError) {
        int code = bMError.getCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (code != 200) {
            switch (code) {
                case 100:
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                    break;
                case 101:
                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                    break;
                case 102:
                    maxAdapterError = MaxAdapterError.TIMEOUT;
                    break;
                case 103:
                    maxAdapterError = MaxAdapterError.NO_FILL;
                    break;
                default:
                    switch (code) {
                        case 106:
                        case 108:
                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                            break;
                        case 107:
                            maxAdapterError = MaxAdapterError.AD_EXPIRED;
                            break;
                        case 109:
                            maxAdapterError = MaxAdapterError.SERVER_ERROR;
                            break;
                        case 110:
                            maxAdapterError = MaxAdapterError.BAD_REQUEST;
                            break;
                    }
                    break;
            }
        } else {
            maxAdapterError = MaxAdapterError.SERVER_ERROR;
        }
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getMessage(), code, bMError.getMessage());
    }

    private void updateSettings(MaxAdapterParameters maxAdapterParameters) {
        String str;
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            BidMachine.setConsentConfig(boolHasUserConsent.booleanValue(), null);
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            if (boolIsDoNotSell.booleanValue()) {
                str = "1YY-";
            } else {
                str = "1YN-";
            }
            BidMachine.setUSPrivacyString(str);
            return;
        }
        BidMachine.setUSPrivacyString("1---");
    }
}
