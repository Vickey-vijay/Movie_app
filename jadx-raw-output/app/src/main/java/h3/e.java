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
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;

/* JADX INFO: compiled from: VungleRtbRewardedAd.java */
/* JADX INFO: loaded from: classes11.dex */
public class e implements MediationRewardedAd, RewardedAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f53687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MediationRewardedAdCallback f53688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RewardedAd f53689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.ads.mediation.vungle.b f53690e;

    /* JADX INFO: compiled from: VungleRtbRewardedAd.java */
    public class a implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f53691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f53692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdConfig f53693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f53694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f53695e;

        public a(Context context, String str, AdConfig adConfig, String str2, String str3) {
            this.f53691a = context;
            this.f53692b = str;
            this.f53693c = adConfig;
            this.f53694d = str2;
            this.f53695e = str3;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeError(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            e.this.f53687b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeSuccess() {
            e eVar = e.this;
            eVar.f53689d = eVar.f53690e.e(this.f53691a, this.f53692b, this.f53693c);
            e.this.f53689d.setAdListener(e.this);
            if (!TextUtils.isEmpty(this.f53694d)) {
                e.this.f53689d.setUserId(this.f53694d);
            }
            e.this.f53689d.load(this.f53695e);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NonNull BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f53688c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f53688c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f53688c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.f53688c.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NonNull BaseAd baseAd) {
        this.f53688c = this.f53687b.onSuccess(this);
    }

    @Override // com.vungle.ads.RewardedAdListener
    public void onAdRewarded(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f53688c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f53688c.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f53688c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        RewardedAd rewardedAd = this.f53689d;
        if (rewardedAd != null) {
            rewardedAd.play(context);
        } else if (this.f53688c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f53688c.onAdFailedToShow(adError);
        }
    }

    public e(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f53687b = mediationAdLoadCallback;
        this.f53690e = bVar;
    }

    public void e(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string2)) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f53687b.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f53687b.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdConfig adConfigA = this.f53690e.a();
        if (mediationExtras.containsKey("adOrientation")) {
            adConfigA.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfigA.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        com.google.ads.mediation.vungle.c.a().b(string2, context, new a(context, string3, adConfigA, string, bidResponse));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f53687b.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f53688c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
