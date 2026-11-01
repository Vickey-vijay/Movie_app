package com.unity3d.ironsourceads.interstitial;

import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.B9;
import com.ironsource.C3541jc;
import com.ironsource.Cb;
import com.ironsource.Fb;
import com.ironsource.V7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class InterstitialAdLoader {
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f45275a = V7.f27797a.c();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cb cb2) {
        p.j(cb2, "$loadTask");
        cb2.start();
    }

    public static final void loadAd(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener) {
        p.j(interstitialAdRequest, "adRequest");
        p.j(interstitialAdLoaderListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("instanceId: " + interstitialAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f45275a, new B9(interstitialAdRequest, interstitialAdLoaderListener, C3541jc.f29275e.a(IronSource.a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Fb fb2) {
        p.j(executor, "executor");
        p.j(fb2, "loadTaskProvider");
        final Cb cbA = fb2.a();
        executor.execute(new Runnable() { // from class: mc.a
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoader.a(cbA);
            }
        });
    }

    private InterstitialAdLoader() {
    }
}
