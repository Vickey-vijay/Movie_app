package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z5 extends r5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f10264i;

    @Override // com.applovin.impl.r5
    public i5 a(JSONObject jSONObject) {
        return new g6(jSONObject, this.f10264i, this.f7705a);
    }

    @Override // com.applovin.impl.r5
    public void a(int i10, String str) {
        super.a(i10, str);
        this.f10264i.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }

    @Override // com.applovin.impl.r5
    public String e() {
        return r0.d(this.f7705a);
    }

    @Override // com.applovin.impl.r5
    public String f() {
        return r0.e(this.f7705a);
    }

    public z5(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(uVar, str, kVar);
        this.f10264i = appLovinNativeAdLoadListener;
    }
}
