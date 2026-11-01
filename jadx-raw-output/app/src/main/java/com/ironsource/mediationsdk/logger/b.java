package com.ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3676r4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f29867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29870d;

    public int a() {
        return this.f29870d;
    }

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i10) {
        this.f29867a = ironSourceTag;
        this.f29868b = str;
        this.f29869c = str2;
        this.f29870d = i10;
    }

    public JSONObject b() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("timestamp", this.f29868b);
            jSONObjectJsonObjectInit.put("tag", this.f29867a);
            jSONObjectJsonObjectInit.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f29870d);
            jSONObjectJsonObjectInit.put("message", this.f29869c);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }
}
