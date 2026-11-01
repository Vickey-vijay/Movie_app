package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3809z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hb f31684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G1 f31685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D1 f31687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K1 f31688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3775x1 f31689f;

    public C3809z1(JSONObject jSONObject) {
        ck.p.j(jSONObject, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("loggers");
        this.f31684a = new Hb(jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("events");
        this.f31685b = new G1(jSONObjectOptJSONObject2 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject2);
        this.f31686c = jSONObject.optBoolean("integration", false);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("crashReporter");
        this.f31687d = new D1(jSONObjectOptJSONObject3 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("settings");
        this.f31688e = new K1(jSONObjectOptJSONObject4 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject4);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("auction");
        this.f31689f = new C3775x1(jSONObjectOptJSONObject5 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject5);
    }

    public final C3775x1 a() {
        return this.f31689f;
    }

    public final D1 b() {
        return this.f31687d;
    }

    public final G1 c() {
        return this.f31685b;
    }

    public final K1 d() {
        return this.f31688e;
    }

    public final boolean e() {
        return this.f31686c;
    }

    public final Hb f() {
        return this.f31684a;
    }
}
