package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3688s f27738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3688s f27739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T2 f27740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rb f27741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3809z1 f27742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C3688s> f27743f;

    public final Map<LevelPlay.AdFormat, C3688s> a() {
        return this.f27743f;
    }

    public U3(JSONObject jSONObject) {
        ck.p.j(jSONObject, "configurations");
        C3688s c3688s = new C3688s(a(jSONObject, "rewarded"));
        this.f27738a = c3688s;
        C3688s c3688s2 = new C3688s(a(jSONObject, "interstitial"));
        this.f27739b = c3688s2;
        this.f27740c = new T2(a(jSONObject, "banner"));
        this.f27741d = new Rb(a(jSONObject, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("application");
        this.f27742e = new C3809z1(jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject);
        this.f27743f = kotlin.collections.a.m(mj.h.a(LevelPlay.AdFormat.INTERSTITIAL, c3688s2), mj.h.a(LevelPlay.AdFormat.REWARDED, c3688s));
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
        return jSONObjectOptJSONObject2 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject2;
    }

    public final C3809z1 b() {
        return this.f27742e;
    }

    public final T2 c() {
        return this.f27740c;
    }

    public final Rb d() {
        return this.f27741d;
    }
}
