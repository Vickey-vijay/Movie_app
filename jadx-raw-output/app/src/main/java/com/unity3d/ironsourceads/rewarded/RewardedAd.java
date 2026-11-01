package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.ironsource.Nd;
import com.ironsource.Od;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class RewardedAd implements Od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Nd f45284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RewardedAdListener f45285b;

    public RewardedAd(Nd nd2) {
        p.j(nd2, "rewardedAdInternal");
        this.f45284a = nd2;
        nd2.a(this);
    }

    public final RewardedAdInfo getAdInfo() {
        return this.f45284a.b();
    }

    public final RewardedAdListener getListener() {
        return this.f45285b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f45284a.d();
    }

    @Override // com.ironsource.Od
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f45285b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f45285b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f45285b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdFailedToShow(IronSourceError ironSourceError) {
        p.j(ironSourceError, "error");
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + ironSourceError + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f45285b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, ironSourceError);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f45285b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Od
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f45285b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(RewardedAdListener rewardedAdListener) {
        this.f45285b = rewardedAdListener;
    }

    public final void show(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog.API.info();
        this.f45284a.a(activity);
    }
}
