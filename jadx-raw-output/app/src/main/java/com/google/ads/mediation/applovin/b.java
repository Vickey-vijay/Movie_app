package com.google.ads.mediation.applovin;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdSize;

/* JADX INFO: compiled from: AppLovinAdViewWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppLovinAdView f18805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f18806b;

    public static b b(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, AdSize adSize, Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        return new b(appLovinSdk, appLovinAdSize, frameLayout, context);
    }

    public FrameLayout a() {
        return this.f18806b;
    }

    public void c(AppLovinAd appLovinAd) {
        this.f18805a.renderAd(appLovinAd);
    }

    public void d(AppLovinAdClickListener appLovinAdClickListener) {
        this.f18805a.setAdClickListener(appLovinAdClickListener);
    }

    public void e(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f18805a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void f(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f18805a.setAdViewEventListener(appLovinAdViewEventListener);
    }

    public b(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, FrameLayout frameLayout, Context context) {
        AppLovinAdView appLovinAdView = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
        this.f18805a = appLovinAdView;
        this.f18806b = frameLayout;
        frameLayout.addView(appLovinAdView);
    }
}
