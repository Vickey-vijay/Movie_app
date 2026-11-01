package h3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;

/* JADX INFO: compiled from: VungleRtbInterstitialAd.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements MediationInterstitialAd, InterstitialAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f53666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MediationInterstitialAdCallback f53667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterstitialAd f53668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.ads.mediation.vungle.b f53669e;

    /* JADX INFO: compiled from: VungleRtbInterstitialAd.java */
    public class a implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f53670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f53671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdConfig f53672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f53673d;

        public a(Context context, String str, AdConfig adConfig, String str2) {
            this.f53670a = context;
            this.f53671b = str;
            this.f53672c = adConfig;
            this.f53673d = str2;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeError(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            c.this.f53666b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeSuccess() {
            c cVar = c.this;
            cVar.f53668d = cVar.f53669e.c(this.f53670a, this.f53671b, this.f53672c);
            c.this.f53668d.setAdListener(c.this);
            c.this.f53668d.load(this.f53673d);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NonNull BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f53667c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NonNull BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f53667c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NonNull BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f53667c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NonNull BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f53667c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NonNull BaseAd baseAd) {
        this.f53667c = this.f53666b.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NonNull BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f53667c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        InterstitialAd interstitialAd = this.f53668d;
        if (interstitialAd != null) {
            interstitialAd.play(context);
        } else if (this.f53667c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f53667c.onAdFailedToShow(adError);
        }
    }

    public c(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f53666b = mediationAdLoadCallback;
        this.f53669e = bVar;
    }

    public void e(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f53666b.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f53666b.onFailure(adError2);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdConfig adConfigA = this.f53669e.a();
        if (mediationExtras.containsKey("adOrientation")) {
            adConfigA.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfigA.setWatermark(watermark);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, adConfigA, bidResponse));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f53666b.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f53667c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }
}
