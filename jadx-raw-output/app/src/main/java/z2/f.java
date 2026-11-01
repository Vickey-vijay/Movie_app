package z2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import y2.i;
import y2.k;

/* JADX INFO: compiled from: MintegralRewardedAd.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends RewardVideoWithCodeListener implements MediationRewardedAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f85919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f85920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationRewardedAdCallback f85921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f85922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y2.a f85923f;

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.f85921d == null) {
            return;
        }
        if (rewardInfo == null || !rewardInfo.isCompleteView()) {
            Log.w(MintegralMediationAdapter.TAG, "Mintegral SDK failed to reward user due to missing rewarded settings or rewarded ad playback not completed.");
        } else {
            this.f85921d.onUserEarnedReward();
        }
        this.f85921d.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdShow(MBridgeIds mBridgeIds) {
        i iVar;
        if (this.f85923f.a() && (iVar = this.f85920c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f85921d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f85921d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        i iVar;
        if (this.f85923f.a() && (iVar = this.f85920c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        AdError adErrorB = y2.d.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f85921d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f85921d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        i iVar;
        if (this.f85923f.a() && (iVar = this.f85920c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        AdError adErrorB = y2.d.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f85919b.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f85921d = this.f85919b.onSuccess(this);
    }

    public f(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, y2.a aVar) {
        this.f85922e = k.f(mediationRewardedAdConfiguration.getMediationExtras());
        this.f85919b = mediationAdLoadCallback;
        this.f85923f = aVar;
    }
}
