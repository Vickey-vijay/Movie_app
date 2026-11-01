package e3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import com.google.ads.mediation.unity.UnityMediationBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: compiled from: UnityRewardedAd.java */
/* JADX INFO: loaded from: classes8.dex */
public class i implements MediationRewardedAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f52339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f52340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e3.a f52341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MediationRewardedAdCallback f52342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f52343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f52344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f52345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public final IUnityAdsLoadListener f52346i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @VisibleForTesting
    public final IUnityAdsShowListener f52347j = new b();

    /* JADX INFO: compiled from: UnityRewardedAd.java */
    public class a implements IUnityAdsLoadListener {
        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", str));
            i.this.f52343f = str;
            i iVar = i.this;
            iVar.f52342e = (MediationRewardedAdCallback) iVar.f52339b.onSuccess(i.this);
        }

        public a() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            i.this.f52343f = str;
            AdError adErrorD = UnityAdsAdapterUtils.d(unityAdsLoadError, str2);
            Log.w(UnityMediationAdapter.TAG, adErrorD.toString());
            i.this.f52339b.onFailure(adErrorD);
        }
    }

    /* JADX INFO: compiled from: UnityRewardedAd.java */
    public class b implements IUnityAdsShowListener {
        public b() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            if (i.this.f52342e != null) {
                i.this.f52342e.reportAdClicked();
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (i.this.f52342e == null) {
                return;
            }
            if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                i.this.f52342e.onVideoComplete();
                i.this.f52342e.onUserEarnedReward();
            }
            i.this.f52342e.onAdClosed();
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            if (i.this.f52342e != null) {
                i.this.f52342e.onAdFailedToShow(UnityAdsAdapterUtils.e(unityAdsShowError, str2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            if (i.this.f52342e == null) {
                return;
            }
            i.this.f52342e.onAdOpened();
            i.this.f52342e.reportAdImpression();
            i.this.f52342e.onVideoStart();
        }
    }

    /* JADX INFO: compiled from: UnityRewardedAd.java */
    public class c implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f52350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f52352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f52353d;

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() throws JSONException {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", this.f52351b, this.f52352c));
            UnityAdsAdapterUtils.l(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.f52350a);
            i.this.f52344g = UUID.randomUUID().toString();
            UnityAdsLoadOptions unityAdsLoadOptionsA = i.this.f52341d.a(i.this.f52344g);
            String str = this.f52353d;
            if (str != null) {
                unityAdsLoadOptionsA.setAdMarkup(str);
            }
            i.this.f52341d.c(this.f52352c, unityAdsLoadOptionsA, i.this.f52346i);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsInitializationError, String.format(UnityMediationBannerAd.ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID, this.f52351b, str));
            Log.w(UnityMediationAdapter.TAG, adErrorC.toString());
            i.this.f52339b.onFailure(adErrorC);
        }

        public c(Context context, String str, @Nullable String str2, String str3) {
            this.f52350a = context;
            this.f52351b = str;
            this.f52352c = str2;
            this.f52353d = str3;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (this.f52343f == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAdsShowOptions unityAdsShowOptionsB = this.f52341d.b(this.f52344g);
            unityAdsShowOptionsB.set("watermark", this.f52345h);
            this.f52341d.d(activity, this.f52343f, unityAdsShowOptionsB, this.f52347j);
            return;
        }
        AdError adError = new AdError(105, UnityMediationAdapter.ERROR_MSG_NON_ACTIVITY, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
        Log.e(UnityMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f52342e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    public i(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull e eVar, @NonNull e3.a aVar) {
        this.f52345h = mediationRewardedAdConfiguration.getWatermark();
        this.f52339b = mediationAdLoadCallback;
        this.f52340c = eVar;
        this.f52341d = aVar;
    }

    public void h(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) throws JSONException {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("gameId");
        String string2 = serverParameters.getString(UnityMediationAdapter.KEY_PLACEMENT_ID);
        if (!UnityAdsAdapterUtils.a(string, string2)) {
            AdError adError = new AdError(101, UnityMediationAdapter.ERROR_MSG_MISSING_PARAMETERS, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            Log.w(UnityMediationAdapter.TAG, adError.toString());
            this.f52339b.onFailure(adError);
        } else {
            this.f52340c.b(context, string, new c(context, string, string2, mediationRewardedAdConfiguration.getBidResponse()));
        }
    }
}
