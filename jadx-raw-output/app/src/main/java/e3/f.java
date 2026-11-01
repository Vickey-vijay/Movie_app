package e3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import com.google.ads.mediation.unity.UnityMediationBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: compiled from: UnityInterstitialAd.java */
/* JADX INFO: loaded from: classes10.dex */
public class f implements MediationInterstitialAd, IUnityAdsLoadListener, IUnityAdsShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f52326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f52327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f52328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e3.a f52329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public MediationInterstitialAdCallback f52330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f52331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f52332h;

    /* JADX INFO: compiled from: UnityInterstitialAd.java */
    public class a implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f52333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f52334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f52335c;

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() throws JSONException {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", this.f52333a, f.this.f52331g));
            UnityAdsAdapterUtils.l(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.f52334b);
            f.this.f52326b = UUID.randomUUID().toString();
            UnityAdsLoadOptions unityAdsLoadOptionsA = f.this.f52329e.a(f.this.f52326b);
            String str = this.f52335c;
            if (str != null) {
                unityAdsLoadOptionsA.setAdMarkup(str);
            }
            f.this.f52329e.c(f.this.f52331g, unityAdsLoadOptionsA, f.this);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsInitializationError, String.format(UnityMediationBannerAd.ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID, this.f52333a, str));
            Log.w(UnityMediationAdapter.TAG, adErrorC.toString());
            f.this.f52327c.onFailure(adErrorC);
        }

        public a(String str, Context context, String str2) {
            this.f52333a = str;
            this.f52334b = context;
            this.f52335c = str2;
        }
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str));
        this.f52331g = str;
        this.f52330f = this.f52327c.onSuccess(this);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad was clicked for placement ID: %s", str));
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f52330f;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
        this.f52330f.onAdLeftApplication();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad finished playing for placement ID: %s", str));
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f52330f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad started for placement ID: %s", str));
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f52330f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f52331g = str;
        AdError adErrorD = UnityAdsAdapterUtils.d(unityAdsLoadError, str2);
        Log.w(UnityMediationAdapter.TAG, adErrorD.toString());
        this.f52327c.onFailure(adErrorD);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        if (this.f52331g == null) {
            Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
        }
        UnityAdsShowOptions unityAdsShowOptionsB = this.f52329e.b(this.f52326b);
        unityAdsShowOptionsB.set("watermark", this.f52332h);
        this.f52329e.d((Activity) context, this.f52331g, unityAdsShowOptionsB, this);
    }

    public f(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull e eVar, @NonNull e3.a aVar) {
        this.f52332h = mediationInterstitialAdConfiguration.getWatermark();
        this.f52327c = mediationAdLoadCallback;
        this.f52328d = eVar;
        this.f52329e = aVar;
    }

    public void f(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) throws JSONException {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("gameId");
        String string2 = serverParameters.getString(UnityMediationAdapter.KEY_PLACEMENT_ID);
        this.f52331g = string2;
        if (!UnityAdsAdapterUtils.a(string, string2)) {
            this.f52327c.onFailure(new AdError(101, UnityMediationAdapter.ERROR_MSG_MISSING_PARAMETERS, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            this.f52328d.b(context, string, new a(string, context, mediationInterstitialAdConfiguration.getBidResponse()));
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        AdError adErrorE = UnityAdsAdapterUtils.e(unityAdsShowError, str2);
        Log.w(UnityMediationAdapter.TAG, adErrorE.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f52330f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorE);
        }
    }
}
