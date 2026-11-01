package q2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: FacebookRewardedAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements MediationRewardedAd, RewardedVideoAdExtendedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f66395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f66396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RewardedVideoAd f66397d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationRewardedAdCallback f66399f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f66401h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f66398e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f66400g = new AtomicBoolean();

    @NonNull
    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public void b() {
        Context context = this.f66395b.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(this.f66395b.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f66396c.onFailure(adError);
        } else {
            FacebookMediationAdapter.setMixedAudience(this.f66395b);
            this.f66397d = this.f66401h.d(context, placementID);
            if (!TextUtils.isEmpty(this.f66395b.getWatermark())) {
                this.f66397d.setExtraHints(new ExtraHints.Builder().mediationData(this.f66395b.getWatermark()).build());
            }
            RewardedVideoAd rewardedVideoAd = this.f66397d;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(this.f66395b.getBidResponse()).withAdExperience(a()).build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f66399f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f66396c;
        if (mediationAdLoadCallback != null) {
            this.f66399f = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f66399f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f66400g.getAndSet(true) && (mediationRewardedAdCallback = this.f66399f) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f66397d;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f66400g.getAndSet(true) && (mediationRewardedAdCallback = this.f66399f) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f66397d;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.f66399f.onVideoComplete();
        this.f66399f.onUserEarnedReward();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.f66398e.set(true);
        if (this.f66397d.show()) {
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f66399f;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onVideoStart();
                this.f66399f.onAdOpened();
                return;
            }
            return;
        }
        AdError adError = new AdError(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f66399f;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onAdFailedToShow(adError);
        }
        this.f66397d.destroy();
    }

    public b(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, e eVar) {
        this.f66395b = mediationRewardedAdConfiguration;
        this.f66396c = mediationAdLoadCallback;
        this.f66401h = eVar;
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f66398e.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f66399f;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f66396c;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.f66397d.destroy();
    }
}
