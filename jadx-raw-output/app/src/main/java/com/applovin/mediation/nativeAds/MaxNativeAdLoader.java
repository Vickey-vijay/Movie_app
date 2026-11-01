package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f10334a;

    public MaxNativeAdLoader(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f10334a.logApiCall("destroy()");
        this.f10334a.destroy();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->render(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)Z");
        CreativeInfoManager.onMaxNativeAdLoaded(maxNativeAdView, maxAd);
        return safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(maxNativeAdView, maxAd);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f10334a.logApiCall("a()");
        this.f10334a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f10334a.logApiCall("b()");
        this.f10334a.handleNativeAdViewRendered(maxAd);
    }

    public String getAdUnitId() {
        return this.f10334a.getAdUnitId();
    }

    public String getPlacement() {
        this.f10334a.logApiCall("getPlacement()");
        return this.f10334a.getPlacement();
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f10334a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f10334a.loadAd(maxNativeAdView);
    }

    public boolean safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(MaxNativeAdView p10, MaxAd p11) {
        this.f10334a.logApiCall("render(adView=" + p10 + ", ad=" + p11 + ")");
        return this.f10334a.render(p10, p11);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f10334a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f10334a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f10334a.logApiCall("setCustomData(value=" + str + ")");
        this.f10334a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f10334a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f10334a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f10334a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f10334a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f10334a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f10334a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f10334a.logApiCall("setPlacement(placement=" + str + ")");
        this.f10334a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f10334a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f10334a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f10334a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void destroy(MaxAd maxAd) {
        this.f10334a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f10334a.destroy(maxAd);
    }
}
