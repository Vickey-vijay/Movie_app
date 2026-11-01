package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import e3.c;
import e3.d;
import e3.e;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class UnityMediationBannerAd implements MediationBannerAd, BannerView.IListener {
    public static final String ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID = "Unity Ads initialization failed for game ID '%s' with error message: %s";
    public static final String ERROR_MSG_NO_MATCHING_AD_SIZE = "There is no matching Unity Ads ad size for Google ad size: ";
    private String bannerPlacementId;
    private String gameId;

    @Nullable
    private MediationBannerAdCallback mediationBannerAdCallback;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationBannerAdLoadCallback;
    private final e3.a unityAdsLoader;
    private final c unityBannerViewFactory;

    @Nullable
    private d unityBannerViewWrapper;
    private final e unityInitializer;

    public class a implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f18944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f18945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UnityBannerSize f18946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f18947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f18948e;

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() throws JSONException {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load banner ad with placement ID: %s", UnityMediationBannerAd.this.gameId, UnityMediationBannerAd.this.bannerPlacementId));
            UnityAdsAdapterUtils.l(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.f18944a);
            if (UnityMediationBannerAd.this.unityBannerViewWrapper == null) {
                UnityMediationBannerAd unityMediationBannerAd = UnityMediationBannerAd.this;
                unityMediationBannerAd.unityBannerViewWrapper = unityMediationBannerAd.unityBannerViewFactory.a(this.f18945b, UnityMediationBannerAd.this.bannerPlacementId, this.f18946c);
            }
            UnityMediationBannerAd.this.unityBannerViewWrapper.c(UnityMediationBannerAd.this);
            UnityAdsLoadOptions unityAdsLoadOptionsA = UnityMediationBannerAd.this.unityAdsLoader.a(UUID.randomUUID().toString());
            unityAdsLoadOptionsA.set("watermark", this.f18947d.getWatermark());
            String str = this.f18948e;
            if (str != null) {
                unityAdsLoadOptionsA.setAdMarkup(str);
            }
            UnityMediationBannerAd.this.unityBannerViewWrapper.b(unityAdsLoadOptionsA);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsInitializationError, String.format(UnityMediationBannerAd.ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID, UnityMediationBannerAd.this.gameId, str));
            Log.w(UnityMediationAdapter.TAG, adErrorC.toString());
            UnityMediationBannerAd.this.mediationBannerAdLoadCallback.onFailure(adErrorC);
        }

        public a(Context context, Activity activity, UnityBannerSize unityBannerSize, MediationBannerAdConfiguration mediationBannerAdConfiguration, String str) {
            this.f18944a = context;
            this.f18945b = activity;
            this.f18946c = unityBannerSize;
            this.f18947d = mediationBannerAdConfiguration;
            this.f18948e = str;
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerClick(BannerView bannerView) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad was clicked for placement ID: %s", bannerView.getPlacementId()));
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.reportAdClicked();
        this.mediationBannerAdCallback.onAdOpened();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLeftApplication(BannerView bannerView) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad left application for placement ID: %s", bannerView.getPlacementId()));
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLoaded(BannerView bannerView) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads finished loading banner ad for placement ID: %s", bannerView.getPlacementId()));
        this.mediationBannerAdCallback = this.mediationBannerAdLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerShown(BannerView bannerView) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad was shown for placement ID: %s", bannerView.getPlacementId()));
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.unityBannerViewWrapper.a();
    }

    public UnityMediationBannerAd(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull e eVar, @NonNull c cVar, @NonNull e3.a aVar) {
        this.mediationBannerAdLoadCallback = mediationAdLoadCallback;
        this.unityBannerViewFactory = cVar;
        this.unityInitializer = eVar;
        this.unityAdsLoader = aVar;
    }

    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) throws JSONException {
        Context context = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        this.gameId = serverParameters.getString("gameId");
        String string = serverParameters.getString(UnityMediationAdapter.KEY_PLACEMENT_ID);
        this.bannerPlacementId = string;
        if (!UnityAdsAdapterUtils.a(this.gameId, string)) {
            AdError adError = new AdError(101, UnityMediationAdapter.ERROR_MSG_MISSING_PARAMETERS, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            Log.w(UnityMediationAdapter.TAG, adError.toString());
            this.mediationBannerAdLoadCallback.onFailure(adError);
            return;
        }
        if (!(context instanceof Activity)) {
            AdError adError2 = new AdError(105, UnityMediationAdapter.ERROR_MSG_NON_ACTIVITY, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            Log.w(UnityMediationAdapter.TAG, adError2.toString());
            this.mediationBannerAdLoadCallback.onFailure(adError2);
            return;
        }
        Activity activity = (Activity) context;
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        UnityBannerSize unityBannerSizeK = UnityAdsAdapterUtils.k(context, adSize, !TextUtils.isEmpty(bidResponse));
        if (unityBannerSizeK == null) {
            AdError adError3 = new AdError(110, ERROR_MSG_NO_MATCHING_AD_SIZE + adSize, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            Log.w(UnityMediationAdapter.TAG, adError3.toString());
            this.mediationBannerAdLoadCallback.onFailure(adError3);
            return;
        }
        this.unityInitializer.b(context, this.gameId, new a(context, activity, unityBannerSizeK, mediationBannerAdConfiguration, bidResponse));
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        AdError adErrorB = UnityAdsAdapterUtils.b(UnityAdsAdapterUtils.j(bannerErrorInfo), bannerErrorInfo.errorMessage);
        Log.w(UnityMediationAdapter.TAG, adErrorB.toString());
        this.mediationBannerAdLoadCallback.onFailure(adErrorB);
    }
}
