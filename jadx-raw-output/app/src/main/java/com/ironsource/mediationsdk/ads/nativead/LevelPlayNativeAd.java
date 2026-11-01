package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3398bc;
import com.ironsource.C3489gd;
import com.ironsource.C3676r4;
import com.ironsource.Zb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import mj.r;

/* JADX INFO: loaded from: classes10.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3489gd f29548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LevelPlayNativeAdListener f29549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Zb f29550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdapterNativeAdData f29551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdapterNativeAdViewBinder f29552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f29553g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LevelPlayNativeAdListener f29555b;

        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f29555b;
        }

        public final String getMPlacementName$mediationsdk_release() {
            return this.f29554a;
        }

        public final void setMListener$mediationsdk_release(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f29555b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(String str) {
            this.f29554a = str;
        }

        public final Builder withListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            p.j(levelPlayNativeAdListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f29555b = levelPlayNativeAdListener;
            return this;
        }

        public final Builder withPlacementName(String str) {
            this.f29554a = str;
            return this;
        }

        public final Builder withActivity(Activity activity) {
            int iHashCode;
            ContextProvider.getInstance().updateActivity(activity);
            IronLog ironLog = IronLog.INTERNAL;
            if (activity != null) {
                iHashCode = activity.hashCode();
            } else {
                iHashCode = 0;
            }
            ironLog.verbose("activity is updated to: " + iHashCode);
            return this;
        }
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, i iVar) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd) {
        r rVar;
        p.j(levelPlayNativeAd, "this$0");
        levelPlayNativeAd.b();
        Zb zb2 = levelPlayNativeAd.f29550d;
        if (zb2 != null) {
            zb2.a(levelPlayNativeAd.f29548b);
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            levelPlayNativeAd.a();
        }
    }

    private final void b() {
        if (this.f29553g.compareAndSet(false, true)) {
            Zb zbF = com.ironsource.mediationsdk.r.m().f();
            this.f29550d = zbF;
            if (zbF != null) {
                zbF.a(this);
                C3398bc c3398bcM = com.ironsource.mediationsdk.r.m().m(this.f29547a);
                p.i(c3398bcM, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.f29548b = new C3489gd(c3398bcM);
            }
        }
    }

    private LevelPlayNativeAd(Builder builder) {
        this.f29553g = new AtomicBoolean(false);
        this.f29547a = builder.getMPlacementName$mediationsdk_release();
        this.f29549c = builder.getMListener$mediationsdk_release();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            Zb zb2 = this.f29550d;
            if (zb2 != null) {
                zb2.M();
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f29551e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f29551e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f29551e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f29551e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f29552f;
    }

    public final UUID getObjectId() {
        Zb zb2 = this.f29550d;
        if (zb2 != null) {
            return zb2.k();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f29551e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String strE = com.ironsource.mediationsdk.r.m().e();
        p.i(strE, "initError");
        if (strE.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new Runnable() { // from class: g7.a
                @Override // java.lang.Runnable
                public final void run() {
                    LevelPlayNativeAd.a(this.f53183b);
                }
            });
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f29549c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): " + strE, IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: g7.e
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f53192b, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: g7.b
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.b(this.f53184b, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(final IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: g7.d
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f53190b, ironSourceError);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(final AdInfo adInfo, final AdapterNativeAdData adapterNativeAdData, final AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        p.j(adapterNativeAdData, "adapterNativeAdData");
        p.j(adapterNativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: g7.c
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f53186b, adapterNativeAdData, adapterNativeAdViewBinder, adInfo);
            }
        }, 0L, 2, null);
    }

    public final void setListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f29549c = levelPlayNativeAdListener;
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f29549c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        p.j(levelPlayNativeAd, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f29549c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder, AdInfo adInfo) {
        p.j(levelPlayNativeAd, "this$0");
        p.j(adapterNativeAdData, "$adapterNativeAdData");
        p.j(adapterNativeAdViewBinder, "$nativeAdViewBinder");
        levelPlayNativeAd.f29551e = adapterNativeAdData;
        levelPlayNativeAd.f29552f = adapterNativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f29549c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, IronSourceError ironSourceError) {
        p.j(levelPlayNativeAd, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f29549c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(levelPlayNativeAd, ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        p.j(levelPlayNativeAd, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f29549c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(levelPlayNativeAd, adInfo);
        }
    }
}
