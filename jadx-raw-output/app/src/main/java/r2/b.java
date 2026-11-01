package r2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.e;

/* JADX INFO: compiled from: FacebookRtbInterstitialAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements MediationInterstitialAd, InterstitialAdExtendedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f66662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f66663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterstitialAd f66664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationInterstitialAdCallback f66665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f66666f = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f66667g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f66668h;

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    public void a() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f66662b.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f66663c.onFailure(adError);
        } else {
            FacebookMediationAdapter.setMixedAudience(this.f66662b);
            this.f66664d = this.f66668h.a(this.f66662b.getContext(), placementID);
            if (!TextUtils.isEmpty(this.f66662b.getWatermark())) {
                this.f66664d.setExtraHints(new ExtraHints.Builder().mediationData(this.f66662b.getWatermark()).build());
            }
            InterstitialAd interstitialAd = this.f66664d;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(this.f66662b.getBidResponse()).withAdListener(this).build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66665e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.f66665e.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f66665e = this.f66663c.onSuccess(this);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f66667g.getAndSet(true) || (mediationInterstitialAdCallback = this.f66665e) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f66667g.getAndSet(true) || (mediationInterstitialAdCallback = this.f66665e) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66665e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66665e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f66666f.set(true);
        if (this.f66664d.show()) {
            return;
        }
        AdError adError = new AdError(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66665e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    public b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, e eVar) {
        this.f66662b = mediationInterstitialAdConfiguration;
        this.f66663c = mediationAdLoadCallback;
        this.f66668h = eVar;
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (this.f66666f.get()) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66665e;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adError2);
                return;
            }
            return;
        }
        this.f66663c.onFailure(adError2);
    }
}
