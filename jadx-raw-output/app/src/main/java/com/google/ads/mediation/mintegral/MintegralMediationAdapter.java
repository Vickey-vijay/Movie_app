package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import b3.b;
import b3.c;
import b3.d;
import b3.e;
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
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import y2.i;
import y2.k;

/* JADX INFO: loaded from: classes5.dex */
public class MintegralMediationAdapter extends RtbAdapter {
    public static final String TAG = "MintegralMediationAdapter";
    public static final Map<i, WeakReference<Object>> loadedSlotIdentifiers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static MBridgeSDK f18898n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f18899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f18900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f18901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f18902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b3.a f18903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a3.b f18904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a3.c f18905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a3.e f18906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a3.d f18907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a3.a f18908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ExecutorService f18909l = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y2.a f18910m = new y2.a();

    public class a implements SDKInitStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f18911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f18912b;

        public a(Context context, InitializationCompleteCallback initializationCompleteCallback) {
            this.f18911a = context;
            this.f18912b = initializationCompleteCallback;
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitFail(String str) {
            AdError adErrorB = y2.d.b(105, str);
            this.f18912b.onInitializationFailed(adErrorB.getMessage());
            Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitSuccess() {
            k.a(this.f18911a, MintegralMediationAdapter.f18898n);
            this.f18912b.onInitializationSucceeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Map map, Context context, InitializationCompleteCallback initializationCompleteCallback) {
        f18898n.init((Map<String, String>) map, context, new a(context, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        if (this.f18910m.a()) {
            Iterator<i> it = k.d(rtbSignalData).iterator();
            while (it.hasNext()) {
                WeakReference<Object> weakReference = loadedSlotIdentifiers.get(it.next());
                if (weakReference != null && weakReference.get() != null) {
                    signalCallbacks.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                    return;
                }
            }
        }
        signalCallbacks.onSuccess(BidManager.getBuyerUid(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull final Context context, @NonNull final InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            Bundle serverParameters = it.next().getServerParameters();
            String string = serverParameters.getString("app_id");
            String string2 = serverParameters.getString(MBridgeConstans.APP_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                hashSet2.add(string2);
            }
        }
        int size = hashSet.size();
        int size2 = hashSet2.size();
        if (size <= 0 || size2 <= 0) {
            AdError adErrorA = y2.d.a(101, "Missing or invalid App ID or App Key configured for this ad source instance in the AdMob or Ad Manager UI");
            Log.e(TAG, adErrorA.toString());
            initializationCompleteCallback.onInitializationFailed(adErrorA.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        String str2 = (String) hashSet2.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Mintegral SDK.", hashSet, str));
        }
        if (size2 > 1) {
            Log.w(TAG, String.format("Found multiple App Keys in %s. Using %s to initialize Mintegral SDK.", hashSet2, str2));
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        f18898n = mBridgeSDK;
        final Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(str, str2);
        try {
            Aa aa2 = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod("b", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa2, "Y+H6DFttYrPQYcIBiQKwJQKQYrN=");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f18909l.submit(new Runnable() { // from class: y2.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f75251b.c(mBConfigurationMap, context, initializationCompleteCallback);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        b3.a aVar = new b3.a(mediationAdLoadCallback, this.f18910m);
        this.f18903f = aVar;
        aVar.a(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        b bVar = new b(mediationAdLoadCallback);
        this.f18899b = bVar;
        bVar.b(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        c cVar = new c(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.f18910m);
        this.f18900c = cVar;
        cVar.a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        d dVar = new d(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.f18902e = dVar;
        dVar.c(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        e eVar = new e(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f18910m);
        this.f18901d = eVar;
        eVar.a(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        a3.a aVar = new a3.a(mediationAdLoadCallback, this.f18910m);
        this.f18908k = aVar;
        aVar.a(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        a3.b bVar = new a3.b(mediationAdLoadCallback);
        this.f18904g = bVar;
        bVar.b(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        a3.c cVar = new a3.c(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.f18910m);
        this.f18905h = cVar;
        cVar.a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        a3.d dVar = new a3.d(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.f18907j = dVar;
        dVar.c(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        a3.e eVar = new a3.e(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f18910m);
        this.f18906i = eVar;
        eVar.a(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String strE = k.e();
        String[] strArrSplit = strE.split("_");
        if (strArrSplit.length > 1) {
            String[] strArrSplit2 = strArrSplit[1].split("\\.");
            if (strArrSplit2.length >= 3) {
                return new VersionInfo(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]), Integer.parseInt(strArrSplit2[2]));
            }
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strE));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String strC = k.c();
        String[] strArrSplit = strC.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", strC));
        return new VersionInfo(0, 0, 0);
    }
}
