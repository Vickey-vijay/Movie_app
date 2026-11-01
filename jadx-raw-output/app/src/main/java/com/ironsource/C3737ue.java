package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3737ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ne f31415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3770wd f31416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ad f31417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U3 f31418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q5 f31419e;

    public C3737ue(Ne ne2) {
        ck.p.j(ne2, "fullResponse");
        this.f31415a = ne2;
        JSONObject jSONObjectOptJSONObject = ne2.j().optJSONObject("providerOrder");
        this.f31416b = new C3770wd(jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = ne2.j().optJSONObject("providerSettings");
        this.f31417c = new Ad(jSONObjectOptJSONObject2 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = ne2.j().optJSONObject("configurations");
        this.f31418d = new U3(jSONObjectOptJSONObject3 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = ne2.j().optJSONObject(C3754ve.f31473d);
        this.f31419e = new Q5(jSONObjectOptJSONObject4 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject4);
    }

    public final U3 a() {
        return this.f31418d;
    }

    public final Q5 b() {
        return this.f31419e;
    }

    public final Ne c() {
        return this.f31415a;
    }

    public final C3770wd d() {
        return this.f31416b;
    }

    public final Ad e() {
        return this.f31417c;
    }
}
