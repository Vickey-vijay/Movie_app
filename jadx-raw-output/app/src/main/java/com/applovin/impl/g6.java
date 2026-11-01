package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class g6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f7546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f7547h;

    public g6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f7546g = jSONObject;
        this.f7547h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f7546g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Processing ad...");
            }
            this.f7705a.q0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f7546g, this.f7547h, this.f7705a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.k(this.f7706b, "No ads were returned from the server");
        }
        n7.a("native_native", MaxAdFormat.NATIVE, this.f7546g, this.f7705a);
        this.f7547h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
