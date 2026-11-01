package com.google.ads.mediation.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
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
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import x2.b;
import x2.d;
import x2.e;
import x2.g;
import x2.i;
import x2.j;
import x2.k;

/* JADX INFO: loaded from: classes8.dex */
public class IronSourceMediationAdapter extends RtbAdapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.ironsource";
    public static final int ERROR_AD_ALREADY_LOADED = 103;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 105;
    public static final int ERROR_CALL_SHOW_BEFORE_LOADED_SUCCESS = 107;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 102;
    public static final int ERROR_SDK_NOT_INITIALIZED = 106;
    public static final String IRONSOURCE_SDK_ERROR_DOMAIN = "com.ironsource.mediationsdk";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f18895b = new AtomicBoolean(false);

    public class a implements InitListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f18896a;

        public a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f18896a = initializationCompleteCallback;
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(@NonNull IronSourceError ironSourceError) {
            this.f18896a.onInitializationFailed(ironSourceError.getErrorMessage());
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
            IronSourceMediationAdapter.f18895b.set(true);
            this.f18896a.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (f18895b.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ADAPTER_ERROR_DOMAIN).getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ADAPTER_ERROR_DOMAIN).getMessage());
            return;
        }
        if (size > 1) {
            Log.w(d.f74253a, String.format("Multiple '%s' entries found: %s. Using app key '%s' to initialize the IronSource SDK.", "appKey", hashSet, str));
        }
        IronSource.setMediationType(x2.a.g());
        Log.d(d.f74253a, "Initializing IronSource SDK with app key: " + str);
        IronSourceAds.init(context, new InitRequest.Builder(str).withLegacyAdFormats(new ArrayList(Arrays.asList(IronSourceAds.AdFormat.BANNER, IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED))).build(), new a(initializationCompleteCallback));
        IronSource.setISDemandOnlyInterstitialListener(e.c());
        IronSource.setISDemandOnlyRewardedVideoListener(g.b());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (f18895b.get()) {
            new b(mediationAdLoadCallback).h(mediationBannerAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource banner ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(d.f74253a, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (f18895b.get()) {
            new e(mediationInterstitialAdConfiguration, mediationAdLoadCallback).g(mediationInterstitialAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(d.f74253a, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (f18895b.get()) {
            new g(mediationRewardedAdConfiguration, mediationAdLoadCallback).g(mediationRewardedAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource rewarded ad since IronSource SDK is not initialized.", ADAPTER_ERROR_DOMAIN);
        Log.w(d.f74253a, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(d.f74253a, "IronSource adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from IronSource.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new i(mediationAdLoadCallback).a(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new j(mediationAdLoadCallback).a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new k(mediationAdLoadCallback).a(mediationRewardedAdConfiguration);
    }

    @VisibleForTesting
    public void setIsInitialized(boolean z10) {
        f18895b.set(z10);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(IronSource.getISDemandOnlyBiddingData(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = IronSourceAds.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            int i10 = Integer.parseInt(strArrSplit[0]);
            int i11 = Integer.parseInt(strArrSplit[1]);
            int i12 = Integer.parseInt(strArrSplit[2]);
            if (strArrSplit.length >= 4) {
                i12 = (i12 * 100) + Integer.parseInt(strArrSplit[3]);
            }
            return new VersionInfo(i10, i11, i12);
        }
        Log.w(d.f74253a, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String strE = x2.a.e();
        String[] strArrSplit = strE.split("\\.");
        if (strArrSplit.length >= 4) {
            int i10 = Integer.parseInt(strArrSplit[0]);
            int i11 = Integer.parseInt(strArrSplit[1]);
            int i12 = (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]);
            if (strArrSplit.length >= 5) {
                i12 = (i12 * 100) + Integer.parseInt(strArrSplit[4]);
            }
            return new VersionInfo(i10, i11, i12);
        }
        Log.w(d.f74253a, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", strE));
        return new VersionInfo(0, 0, 0);
    }
}
