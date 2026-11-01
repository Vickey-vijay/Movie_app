package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: compiled from: AppLovinBannerAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f18807i = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f18808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppLovinSdk f18809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f18811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.ads.mediation.applovin.a f18812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f18813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediationBannerAdCallback f18814h;

    /* JADX INFO: compiled from: AppLovinBannerAd.java */
    public class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f18815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f18816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AppLovinAdSize f18817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdSize f18818d;

        public a(Context context, Bundle bundle, AppLovinAdSize appLovinAdSize, AdSize adSize) {
            this.f18815a = context;
            this.f18816b = bundle;
            this.f18817c = appLovinAdSize;
            this.f18818d = adSize;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public void onInitializeSuccess() {
            c cVar = c.this;
            cVar.f18809c = cVar.f18811e.c(this.f18815a);
            c.this.f18810d = AppLovinUtils.retrieveZoneId(this.f18816b);
            Log.d(c.f18807i, "Requesting banner of size " + this.f18817c + " for zone: " + c.this.f18810d);
            c cVar2 = c.this;
            cVar2.f18808b = cVar2.f18812f.a(c.this.f18809c, this.f18817c, this.f18818d, this.f18815a);
            c.this.f18808b.e(c.this);
            c.this.f18808b.d(c.this);
            c.this.f18808b.f(c.this);
            if (TextUtils.isEmpty(c.this.f18810d)) {
                c.this.f18809c.getAdService().loadNextAd(this.f18817c, c.this);
            } else {
                c.this.f18809c.getAdService().loadNextAdForZoneId(c.this.f18810d, c.this);
            }
        }
    }

    public static c k(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull d dVar, @NonNull com.google.ads.mediation.applovin.a aVar) {
        return new c(mediationAdLoadCallback, dVar, aVar);
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(f18807i, "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f18814h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f18807i, "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f18814h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(f18807i, "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f18814h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(f18807i, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(f18807i, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f18807i, "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f18814h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f18807i, "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f18814h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(f18807i, "Banner did load ad for zone: " + this.f18810d);
        this.f18808b.c(appLovinAd);
        this.f18814h = this.f18813g.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f18808b.a();
    }

    public c(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull d dVar, @NonNull com.google.ads.mediation.applovin.a aVar) {
        this.f18813g = mediationAdLoadCallback;
        this.f18811e = dVar;
        this.f18812f = aVar;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        Log.w(f18807i, "Failed to load banner ad with error: " + i10);
        this.f18813g.onFailure(adError);
    }

    public void j(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, AppLovinMediationAdapter.ERROR_MSG_MISSING_SDK, AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(f18807i, adError.getMessage());
            this.f18813g.onFailure(adError);
            return;
        }
        AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize == null) {
            AdError adError2 = new AdError(101, AppLovinMediationAdapter.ERROR_MSG_BANNER_SIZE_MISMATCH, AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(f18807i, adError2.getMessage());
            this.f18813g.onFailure(adError2);
            return;
        }
        this.f18811e.b(context, string, new a(context, serverParameters, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, adSize));
    }
}
