package x2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.applovin.mediation.AppLovinExtras;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* JADX INFO: compiled from: IronSourceRtbInterstitialAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class j implements MediationInterstitialAd, InterstitialAdLoaderListener, InterstitialAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public MediationInterstitialAdCallback f74267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f74268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterstitialAd f74269d = null;

    public final void b(@NonNull AdError adError) {
        Log.e(d.f74253a, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f74267b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdClicked(@NonNull InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f74267b;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdDismissed(@NonNull InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f74267b;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public void onInterstitialAdLoadFailed(@NonNull IronSourceError ironSourceError) {
        Log.e(d.f74253a, ironSourceError.toString());
        this.f74268c.onFailure(a.b(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public void onInterstitialAdLoaded(@NonNull InterstitialAd interstitialAd) {
        this.f74269d = interstitialAd;
        this.f74267b = this.f74268c.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdShown(@NonNull InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f74267b;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
        this.f74267b.reportAdImpression();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        if (this.f74269d == null) {
            b(a.a(107, "ad is null"));
            return;
        }
        try {
            Log.d(d.f74253a, "Showing IronSource interstitial ad");
            this.f74269d.setListener(this);
            this.f74269d.show((Activity) context);
        } catch (ClassCastException unused) {
            b(a.a(102, "IronSource requires an Activity context to load ads."));
        }
    }

    public j(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f74268c = mediationAdLoadCallback;
    }

    public void a(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            this.f74268c.onFailure(a.a(101, "Missing or invalid instance ID."));
        } else {
            String watermark = mediationInterstitialAdConfiguration.getWatermark();
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinExtras.Keys.KEY_WATERMARK, watermark);
            InterstitialAdLoader.loadAd(new InterstitialAdRequest.Builder(string, mediationInterstitialAdConfiguration.getBidResponse()).withExtraParams(bundle).build(), this);
        }
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public void onInterstitialAdFailedToShow(@NonNull InterstitialAd interstitialAd, @NonNull IronSourceError ironSourceError) {
        b(a.b(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }
}
