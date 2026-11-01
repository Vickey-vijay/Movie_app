package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class y5 extends r5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f10141i;

    public y5(u uVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(uVar, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    @Override // com.applovin.impl.r5
    public i5 a(JSONObject jSONObject) {
        return new e6(jSONObject, this.f8973g, this.f10141i, this.f7705a);
    }

    public y5(u uVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(uVar, str, kVar);
        this.f10141i = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.r5
    public void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f10141i;
        if (!(appLovinAdLoadListener instanceof m2)) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        } else {
            ((m2) this.f10141i).failedToReceiveAdV2(new AppLovinError(i10, str));
        }
    }

    @Override // com.applovin.impl.r5
    public String e() {
        return r0.a(this.f7705a);
    }

    @Override // com.applovin.impl.r5
    public String f() {
        return r0.b(this.f7705a);
    }
}
