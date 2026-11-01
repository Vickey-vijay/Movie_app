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
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* JADX INFO: compiled from: IronSourceRtbRewardedAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class k implements MediationRewardedAd, RewardedAdLoaderListener, RewardedAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public MediationRewardedAdCallback f74270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f74271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RewardedAd f74272d = null;

    public final void b(@NonNull AdError adError) {
        Log.w(d.f74253a, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f74270b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdClicked(@NonNull RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f74270b;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdDismissed(@NonNull RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f74270b;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public void onRewardedAdLoaded(@NonNull RewardedAd rewardedAd) {
        this.f74272d = rewardedAd;
        this.f74270b = this.f74271c.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdShown(@NonNull RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f74270b;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.f74270b.onVideoStart();
        this.f74270b.reportAdImpression();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onUserEarnedReward(@NonNull RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f74270b;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
        this.f74270b.onUserEarnedReward();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        if (this.f74272d == null) {
            b(a.a(107, "ad is null"));
            return;
        }
        try {
            Log.d(d.f74253a, "Showing IronSource rewarded ad");
            this.f74272d.setListener(this);
            this.f74272d.show((Activity) context);
        } catch (ClassCastException unused) {
            b(a.a(102, "IronSource requires an Activity context to load ads."));
        }
    }

    public k(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f74271c = mediationAdLoadCallback;
    }

    public void a(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            this.f74271c.onFailure(a.a(101, "Missing or invalid instance ID."));
        } else {
            String watermark = mediationRewardedAdConfiguration.getWatermark();
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinExtras.Keys.KEY_WATERMARK, watermark);
            RewardedAdLoader.loadAd(new RewardedAdRequest.Builder(string, mediationRewardedAdConfiguration.getBidResponse()).withExtraParams(bundle).build(), this);
        }
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public void onRewardedAdFailedToShow(@NonNull RewardedAd rewardedAd, @NonNull IronSourceError ironSourceError) {
        b(a.b(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public void onRewardedAdLoadFailed(@NonNull IronSourceError ironSourceError) {
        this.f74271c.onFailure(a.b(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()));
    }
}
