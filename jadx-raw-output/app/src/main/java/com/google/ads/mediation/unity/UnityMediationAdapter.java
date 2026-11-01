package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.applovin.mediation.adapters.unityads.BuildConfig;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import e3.b;
import e3.c;
import e3.e;
import e3.f;
import e3.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class UnityMediationAdapter extends RtbAdapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.unity";
    public static final int ERROR_AD_NOT_READY = 106;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 110;
    public static final int ERROR_CONTEXT_NOT_ACTIVITY = 105;
    public static final int ERROR_FINISH = 109;
    public static final int ERROR_INITIALIZATION_FAILURE = 111;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final String ERROR_MSG_CONTEXT_NULL = "Activity context is null.";
    public static final String ERROR_MSG_INITIALIZATION_FAILURE = "Unity Ads initialization failed: [%s] %s";
    public static final String ERROR_MSG_MISSING_PARAMETERS = "Missing or invalid server parameters.";
    public static final String ERROR_MSG_NON_ACTIVITY = "Unity Ads requires an Activity context to load ads.";
    public static final int ERROR_NULL_CONTEXT = 104;
    public static final int ERROR_PLACEMENT_STATE_DISABLED = 103;
    public static final int ERROR_PLACEMENT_STATE_NO_FILL = 102;
    public static final int ERROR_UNITY_ADS_NOT_SUPPORTED = 107;
    public static final String KEY_GAME_ID = "gameId";
    public static final String KEY_PLACEMENT_ID = "zoneId";
    public static final String KEY_WATERMARK = "watermark";
    public static final String SDK_ERROR_DOMAIN = "com.unity3d.ads";
    public static final String TAG = "UnityMediationAdapter";
    private UnityMediationBannerAd bannerAd;
    private UnityMediationBannerAd bannerRtbAd;
    private f interstitialAd;
    private f interstitialRtbAd;
    private i rewardedAd;
    private i rewardedRtbAd;
    private final e3.a unityAdsLoader;
    private final b unityAdsWrapper;
    private final c unityBannerViewFactory;
    private final e unityInitializer;

    public class a implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f18942a;

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsInitializationError, String.format(UnityMediationAdapter.ERROR_MSG_INITIALIZATION_FAILURE, unityAdsInitializationError, str));
            Log.d(UnityMediationAdapter.TAG, adErrorC.toString());
            this.f18942a.onInitializationFailed(adErrorC.toString());
        }

        public a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f18942a = initializationCompleteCallback;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, "Unity Ads initialized successfully.");
            this.f18942a.onInitializationSucceeded();
        }
    }

    public UnityMediationAdapter() {
        this.unityInitializer = e.a();
        this.unityAdsWrapper = new b();
        this.unityBannerViewFactory = new c();
        this.unityAdsLoader = new e3.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$collectSignals$0(SignalCallbacks signalCallbacks, String str) {
        if (str == null) {
            str = "";
        }
        signalCallbacks.onSuccess(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$collectSignals$1(SignalCallbacks signalCallbacks, String str) {
        if (str == null) {
            str = "";
        }
        signalCallbacks.onSuccess(str);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = BuildConfig.VERSION_NAME.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", BuildConfig.VERSION_NAME));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) throws JSONException {
        String str;
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("gameId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the UnityAds SDK", "gameId", hashSet, str));
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid Game ID.", ADAPTER_ERROR_DOMAIN).toString());
        } else {
            this.unityInitializer.b(context, str, new a(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) throws JSONException {
        UnityMediationBannerAd unityMediationBannerAd = new UnityMediationBannerAd(mediationAdLoadCallback, this.unityInitializer, this.unityBannerViewFactory, this.unityAdsLoader);
        this.bannerAd = unityMediationBannerAd;
        unityMediationBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) throws JSONException {
        f fVar = new f(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.interstitialAd = fVar;
        fVar.f(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) throws JSONException {
        i iVar = new i(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.rewardedAd = iVar;
        iVar.h(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) throws JSONException {
        UnityMediationBannerAd unityMediationBannerAd = new UnityMediationBannerAd(mediationAdLoadCallback, this.unityInitializer, this.unityBannerViewFactory, this.unityAdsLoader);
        this.bannerRtbAd = unityMediationBannerAd;
        unityMediationBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public final void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) throws JSONException {
        f fVar = new f(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.interstitialRtbAd = fVar;
        fVar.f(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) throws JSONException {
        i iVar = new i(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.rewardedRtbAd = iVar;
        iVar.h(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull final SignalCallbacks signalCallbacks) {
        AdFormat adFormat;
        com.google.android.gms.ads.AdFormat adFormatF = UnityAdsAdapterUtils.f(rtbSignalData);
        com.google.android.gms.ads.AdFormat adFormat2 = com.google.android.gms.ads.AdFormat.BANNER;
        if (adFormatF == adFormat2 && !(rtbSignalData.getContext() instanceof Activity)) {
            signalCallbacks.onFailure(new AdError(105, "Unity Ads RTB Banner ads require activity context", ADAPTER_ERROR_DOMAIN));
            return;
        }
        if (adFormatF == adFormat2) {
            adFormat = AdFormat.BANNER;
        } else if (adFormatF != com.google.android.gms.ads.AdFormat.REWARDED && adFormatF != com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL) {
            if (adFormatF == com.google.android.gms.ads.AdFormat.INTERSTITIAL) {
                adFormat = AdFormat.INTERSTITIAL;
            } else {
                Log.w(TAG, "Unsupported ad format for Unity Ads: " + adFormatF);
                adFormat = null;
            }
        } else {
            adFormat = AdFormat.REWARDED;
        }
        if (adFormat != null) {
            this.unityAdsWrapper.c(new TokenConfiguration(adFormat), new IUnityAdsTokenListener() { // from class: e3.g
                @Override // com.unity3d.ads.IUnityAdsTokenListener
                public final void onUnityAdsTokenReady(String str) {
                    UnityMediationAdapter.lambda$collectSignals$0(signalCallbacks, str);
                }
            });
        } else {
            this.unityAdsWrapper.b(new IUnityAdsTokenListener() { // from class: e3.h
                @Override // com.unity3d.ads.IUnityAdsTokenListener
                public final void onUnityAdsTokenReady(String str) {
                    UnityMediationAdapter.lambda$collectSignals$1(signalCallbacks, str);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String version = UnityAds.getVersion();
        String[] strArrSplit = version.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version));
        return new VersionInfo(0, 0, 0);
    }

    @VisibleForTesting
    public UnityMediationAdapter(e eVar, b bVar, c cVar, e3.a aVar) {
        this.unityInitializer = eVar;
        this.unityAdsWrapper = bVar;
        this.unityBannerViewFactory = cVar;
        this.unityAdsLoader = aVar;
    }
}
