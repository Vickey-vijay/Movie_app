package u2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;
import t2.g;
import t2.j;

/* JADX INFO: compiled from: InMobiRewardedAd.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends InterstitialAdEventListener implements MediationRewardedAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f72540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f72541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.ads.mediation.inmobi.a f72542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationRewardedAdCallback f72543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t2.b f72544f;

    public abstract void b(@NonNull j jVar, @NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(@NonNull InMobiInterstitial inMobiInterstitial, Map map) {
        onAdClicked2(inMobiInterstitial, (Map<Object, Object>) map);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreated(byte[] bArr) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreationFailed(@NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(@NonNull InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f72543e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(@NonNull InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f72543e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(@NonNull InMobiInterstitial inMobiInterstitial) {
        AdError adErrorA = g.a(106, "InMobi rewarded ad failed to show.");
        Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f72543e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorA);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been shown.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f72543e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f72543e.onVideoStart();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdFetchSuccessful(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi SDK fetched the rewarded ad successfully, but the ad contents still need to be loaded.");
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(@NonNull InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has logged an impression.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f72543e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorB = g.b(t2.d.f(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        Log.w(InMobiMediationAdapter.TAG, adErrorB.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f72541c;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adErrorB);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been loaded.");
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f72541c;
        if (mediationAdLoadCallback != null) {
            this.f72543e = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(@NonNull InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad will be shown.");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(@NonNull InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
        if (this.f72543e != null) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad credited the user with a reward.");
            this.f72543e.onVideoComplete();
            this.f72543e.onUserEarnedReward();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(@NonNull InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad left application.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        if (this.f72540b.a().booleanValue()) {
            this.f72540b.g();
            return;
        }
        AdError adErrorA = g.a(105, "InMobi rewarded ad is not yet ready to be shown.");
        Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f72543e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorA);
        }
    }

    public d(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        this.f72541c = mediationAdLoadCallback;
        this.f72542d = aVar;
        this.f72544f = bVar;
    }

    public void a(@NonNull Context context, @NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.f72540b = this.f72544f.c(context, Long.valueOf(t2.d.g(mediationRewardedAdConfiguration.getServerParameters())), this);
        t2.d.h();
        t2.d.a(mediationRewardedAdConfiguration.getMediationExtras());
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            this.f72540b.f(new WatermarkData(watermark, 0.3f));
        }
        b(this.f72540b, mediationRewardedAdConfiguration);
    }
}
