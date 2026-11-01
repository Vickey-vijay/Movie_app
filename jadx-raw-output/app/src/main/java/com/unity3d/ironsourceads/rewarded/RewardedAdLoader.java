package com.unity3d.ironsourceads.rewarded;

import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3541jc;
import com.ironsource.Cb;
import com.ironsource.Fb;
import com.ironsource.Sd;
import com.ironsource.V7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class RewardedAdLoader {
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f45288a = V7.f27797a.c();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cb cb2) {
        p.j(cb2, "$loadTask");
        cb2.start();
    }

    public static final void loadAd(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener) {
        p.j(rewardedAdRequest, "adRequest");
        p.j(rewardedAdLoaderListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("instanceId: " + rewardedAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f45288a, new Sd(rewardedAdRequest, rewardedAdLoaderListener, C3541jc.f29275e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Fb fb2) {
        p.j(executor, "executor");
        p.j(fb2, "loadTaskProvider");
        final Cb cbA = fb2.a();
        executor.execute(new Runnable() { // from class: nc.a
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoader.a(cbA);
            }
        });
    }

    private RewardedAdLoader() {
    }
}
