package com.applovin.impl;

import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public class x3 implements MaxAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3 f9873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9874b;

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return "";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return 0L;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return "undefined";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdUnitId() {
        return this.f9873a.b();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return this.f9873a.a();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getPlacement() {
        return this.f9874b;
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return new MaxAdWaterfallInfoImpl(null, "", "", 0L, new ArrayList(), this.f9873a, Collections.EMPTY_LIST, "", "");
    }

    public String toString() {
        return "MaxAd{adUnitId=" + this.f9873a.b() + ", format=" + this.f9873a.a() + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public x3(String str, MaxAdFormat maxAdFormat, String str2) {
        this.f9873a = new a3(str, maxAdFormat, Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), new h(-1, -1, -1, -1));
        this.f9874b = str2;
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        return getFormat().getSize();
    }
}
