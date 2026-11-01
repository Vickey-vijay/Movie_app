package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class j6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f7761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f7762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f7763i;

    public j6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f7761g = jSONObject;
        this.f7762h = jSONObject2;
        this.f7763i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f7761g, this.f7762h, this.f7705a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f7761g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f7761g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        m5 m5Var = new m5(aVar, this.f7705a, this.f7763i);
        m5Var.c(zBooleanValue2);
        m5Var.b(zBooleanValue);
        this.f7705a.q0().a((i5) m5Var, d6.b.CACHING);
    }
}
