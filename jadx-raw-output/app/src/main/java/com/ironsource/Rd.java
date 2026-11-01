package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;

/* JADX INFO: loaded from: classes5.dex */
public final class Rd implements U<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tf f27554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RewardedAdLoaderListener f27555b;

    @Override // com.ironsource.U
    public void b(final IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + ironSourceError);
        this.f27554a.a(new Runnable() { // from class: com.ironsource.jj
            @Override // java.lang.Runnable
            public final void run() {
                Rd.a(this.f29296b, ironSourceError);
            }
        });
    }

    public Rd(Tf tf2, RewardedAdLoaderListener rewardedAdLoaderListener) {
        ck.p.j(tf2, "threadManager");
        ck.p.j(rewardedAdLoaderListener, "publisherListener");
        this.f27554a = tf2;
        this.f27555b = rewardedAdLoaderListener;
    }

    @Override // com.ironsource.U
    public void a(final RewardedAd rewardedAd) {
        ck.p.j(rewardedAd, "adObject");
        this.f27554a.a(new Runnable() { // from class: com.ironsource.ij
            @Override // java.lang.Runnable
            public final void run() {
                Rd.a(rewardedAd, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd rewardedAd, Rd rd2) {
        ck.p.j(rewardedAd, "$adObject");
        ck.p.j(rd2, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + rewardedAd.getAdInfo());
        rd2.f27555b.onRewardedAdLoaded(rewardedAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Rd rd2, IronSourceError ironSourceError) {
        ck.p.j(rd2, "this$0");
        ck.p.j(ironSourceError, "$error");
        rd2.f27555b.onRewardedAdLoadFailed(ironSourceError);
    }
}
