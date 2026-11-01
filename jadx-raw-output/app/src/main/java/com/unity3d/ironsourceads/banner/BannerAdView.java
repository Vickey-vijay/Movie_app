package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import ck.p;
import com.ironsource.P2;
import com.ironsource.Q2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class BannerAdView extends FrameLayout implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private P2 f45254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BannerAdViewListener f45255b;

    private BannerAdView(Context context) {
        super(context);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(P2 p10) {
        p.j(p10, "bannerAdViewInternal");
        Context context = p10.d().getContext();
        p.i(context, "bannerAdViewInternal.container.context");
        this(context);
        this.f45254a = p10;
        p10.a(new WeakReference<>(this));
        p10.b(new WeakReference<>(this));
    }

    public final BannerAdInfo getAdInfo() {
        P2 p10 = this.f45254a;
        if (p10 == null) {
            p.B("bannerAdViewInternal");
            p10 = null;
        }
        return p10.c();
    }

    public final BannerAdViewListener getListener() {
        return this.f45255b;
    }

    @Override // com.ironsource.Q2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f45255b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.Q2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f45255b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(BannerAdViewListener bannerAdViewListener) {
        this.f45255b = bannerAdViewListener;
    }
}
