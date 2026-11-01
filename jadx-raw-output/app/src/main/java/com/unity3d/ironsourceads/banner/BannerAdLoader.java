package com.unity3d.ironsourceads.banner;

import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3461f3;
import com.ironsource.C3541jc;
import com.ironsource.Cb;
import com.ironsource.Fb;
import com.ironsource.V7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class BannerAdLoader {
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f45241a = V7.f27797a.c();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cb cb2) {
        p.j(cb2, "$loadTask");
        cb2.start();
    }

    public static final void loadAd(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener) {
        p.j(bannerAdRequest, "adRequest");
        p.j(bannerAdLoaderListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("instanceId: " + bannerAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f45241a, new C3461f3(bannerAdRequest, bannerAdLoaderListener, C3541jc.f29275e.a(IronSource.a.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Fb fb2) {
        p.j(executor, "executor");
        p.j(fb2, "loadTaskProvider");
        final Cb cbA = fb2.a();
        executor.execute(new Runnable() { // from class: lc.a
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdLoader.a(cbA);
            }
        });
    }

    private BannerAdLoader() {
    }
}
