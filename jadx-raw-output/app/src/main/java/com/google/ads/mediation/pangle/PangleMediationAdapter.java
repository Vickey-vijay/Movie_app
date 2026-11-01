package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import c3.d;
import com.applovin.mediation.adapters.bytedance.BuildConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import d3.c;
import d3.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f18914j = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f18915b = com.google.ads.mediation.pangle.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f18916c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.b f18917d = new c3.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d3.a f18918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d3.b f18919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f18920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d3.d f18921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f18922i;

    public class a implements BiddingTokenCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SignalCallbacks f18923a;

        public a(SignalCallbacks signalCallbacks) {
            this.f18923a = signalCallbacks;
        }

        @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
        public void onBiddingTokenCollected(String str) {
            this.f18923a.onSuccess(str);
        }
    }

    public class b implements com.google.ads.mediation.pangle.a.InterfaceC0174a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f18925a;

        public b(InitializationCompleteCallback initializationCompleteCallback) {
            this.f18925a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            this.f18925a.onInitializationFailed(adError.getMessage());
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeSuccess() {
            this.f18925a.onInitializationSucceeded();
        }
    }

    @VisibleForTesting
    public static void a(@PAGConstant.PAGGDPRConsentType int i10, d dVar) {
        if (i10 != 1 && i10 != 0 && i10 != -1) {
            Log.w(TAG, "Invalid GDPR value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (dVar.d() && !c3.a.d()) {
            dVar.j(i10);
        }
        f18914j = i10;
    }

    @VisibleForTesting
    public static void b(@PAGConstant.PAGPAConsentType int i10, d dVar) {
        if (i10 == 1 || i10 == 0) {
            dVar.k(i10);
        } else {
            Log.w(TAG, "Invalid PA value. Pangle SDK only accepts 0 or 1.");
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        return getVersionInfo(BuildConfig.VERSION_NAME);
    }

    public static int getGDPRConsent() {
        return f18914j;
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        a(i10, new d());
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
        b(i10, new d());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String strB = this.f18916c.b();
        String[] strArrSplit = strB.split("\\.");
        if (strArrSplit.length < 3) {
            Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strB));
            return new VersionInfo(0, 0, 0);
        }
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        int i12 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new VersionInfo(i10, i11, i12);
    }

    @NonNull
    @VisibleForTesting
    public VersionInfo getVersionInfo(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
            return new VersionInfo(0, 0, 0);
        }
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        int i12 = (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]);
        if (strArrSplit.length >= 5) {
            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new VersionInfo(i10, i11, i12);
    }

    public static int getPAConsent() {
        return PAGConfig.getPAConsent();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        if (c3.a.d()) {
            signalCallbacks.onFailure(c3.a.b());
            return;
        }
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            this.f18916c.l(networkExtras.getString("user_data", ""));
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setAdxId("207");
        this.f18916c.a(rtbSignalData.getContext(), pAGBiddingRequest, new a(signalCallbacks));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (c3.a.d()) {
            initializationCompleteCallback.onInitializationFailed("MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            AdError adErrorA = c3.a.a(101, "Missing or invalid App ID.");
            Log.w(TAG, adErrorA.toString());
            initializationCompleteCallback.onInitializationFailed(adErrorA.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
            }
            this.f18915b.b(context, str, new b(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        if (c3.a.d()) {
            mediationAdLoadCallback.onFailure(c3.a.b());
            return;
        }
        d3.a aVarG = this.f18917d.g(mediationAdLoadCallback, this.f18915b, this.f18916c);
        this.f18918e = aVarG;
        aVarG.g(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (c3.a.d()) {
            mediationAdLoadCallback.onFailure(c3.a.b());
            return;
        }
        d3.b bVarH = this.f18917d.h(mediationAdLoadCallback, this.f18915b, this.f18916c);
        this.f18919f = bVarH;
        bVarH.f(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (c3.a.d()) {
            mediationAdLoadCallback.onFailure(c3.a.b());
            return;
        }
        c cVarI = this.f18917d.i(mediationAdLoadCallback, this.f18915b, this.f18916c);
        this.f18920g = cVarI;
        cVarI.g(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        if (c3.a.d()) {
            mediationAdLoadCallback.onFailure(c3.a.b());
            return;
        }
        d3.d dVarJ = this.f18917d.j(mediationAdLoadCallback, this.f18915b, this.f18916c);
        this.f18921h = dVarJ;
        dVarJ.i(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (c3.a.d()) {
            mediationAdLoadCallback.onFailure(c3.a.b());
            return;
        }
        f fVarK = this.f18917d.k(mediationAdLoadCallback, this.f18915b, this.f18916c);
        this.f18922i = fVarK;
        fVarK.g(mediationRewardedAdConfiguration);
    }
}
