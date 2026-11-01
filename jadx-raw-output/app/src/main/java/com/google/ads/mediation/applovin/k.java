package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: AppLovinWaterfallInterstitialAd.java */
/* JADX INFO: loaded from: classes7.dex */
public class k extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    public static final HashMap<String, WeakReference<k>> f18834d = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppLovinSdk f18835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18836c;

    /* JADX INFO: compiled from: AppLovinWaterfallInterstitialAd.java */
    public class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f18837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f18838b;

        public a(Bundle bundle, Context context) {
            this.f18837a = bundle;
            this.f18838b = context;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public void onInitializeSuccess() {
            k.this.zoneId = AppLovinUtils.retrieveZoneId(this.f18837a);
            HashMap<String, WeakReference<k>> map = k.f18834d;
            if (map.containsKey(k.this.zoneId) && map.get(k.this.zoneId).get() != null) {
                AdError adError = new AdError(105, e.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(e.TAG, adError.getMessage());
                k.this.interstitialAdLoadCallback.onFailure(adError);
                return;
            }
            map.put(k.this.zoneId, new WeakReference<>(k.this));
            k kVar = k.this;
            kVar.f18835b = kVar.appLovinInitializer.c(this.f18838b);
            Log.d(e.TAG, "Requesting interstitial for zone: " + k.this.zoneId);
            if (TextUtils.isEmpty(k.this.zoneId)) {
                k.this.f18835b.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, k.this);
                return;
            }
            AppLovinAdService adService = k.this.f18835b.getAdService();
            k kVar2 = k.this;
            adService.loadNextAdForZoneId(kVar2.zoneId, kVar2);
        }
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (this.f18836c) {
            c();
        }
        super.adReceived(appLovinAd);
    }

    public void c() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap<String, WeakReference<k>> map = f18834d;
        if (map.containsKey(this.zoneId) && equals(map.get(this.zoneId).get())) {
            map.remove(this.zoneId);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f18835b.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogD = this.appLovinAdFactory.d(this.f18835b, context);
        appLovinInterstitialAdDialogD.setAdDisplayListener(this);
        appLovinInterstitialAdDialogD.setAdClickListener(this);
        appLovinInterstitialAdDialogD.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd == null) {
            String str = e.TAG;
            Log.d(str, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                Log.d(str, "Showing interstitial preloaded by SDK.");
                appLovinInterstitialAdDialogD.show();
                return;
            }
            return;
        }
        Log.d(e.TAG, "Showing interstitial for zone: " + this.zoneId);
        appLovinInterstitialAdDialogD.showAndRender(this.appLovinInterstitialAd);
    }

    public k(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull d dVar, @NonNull com.google.ads.mediation.applovin.a aVar) {
        super(mediationAdLoadCallback, dVar, aVar);
        this.f18836c = false;
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        c();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        c();
        super.failedToReceiveAd(i10);
    }

    @Override // com.google.ads.mediation.applovin.e
    public void loadAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, AppLovinMediationAdapter.ERROR_MSG_MISSING_SDK, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(e.TAG, adError.getMessage());
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f18836c = true;
            }
            this.networkExtras = mediationInterstitialAdConfiguration.getMediationExtras();
            this.appLovinInitializer.b(context, string, new a(serverParameters, context));
        }
    }
}
