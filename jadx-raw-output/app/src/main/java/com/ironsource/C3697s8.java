package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3697s8 implements InterfaceC3680r8, InterfaceC3680r8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f30721a = IronSourceVideoBridge.jsonObjectInit();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f30722b = IronSourceVideoBridge.jsonObjectInit();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f30723c = IronSourceVideoBridge.jsonObjectInit();

    @Override // com.ironsource.InterfaceC3680r8
    public JSONObject a(String str) {
        ck.p.j(str, "configKey");
        Object objE = e(str);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }

    private final Object e(String str) {
        if (this.f30723c.has(str)) {
            return this.f30723c.get(str);
        }
        if (this.f30722b.has(str)) {
            return this.f30722b.get(str);
        }
        if (this.f30721a.has(str)) {
            return this.f30721a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3680r8.a
    public void a(JSONObject jSONObject) {
        ck.p.j(jSONObject, "controllerConfig");
        this.f30721a = jSONObject;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C3426d4.a.f28409b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = IronSourceVideoBridge.jsonObjectInit();
        }
        this.f30722b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.f30721a.optJSONObject(C3426d4.a.f28410c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = IronSourceVideoBridge.jsonObjectInit();
        }
        this.f30723c = jSONObjectOptJSONObject2;
    }

    @Override // com.ironsource.InterfaceC3680r8
    public Integer b(String str) {
        ck.p.j(str, "configKey");
        Object objE = e(str);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3680r8
    public Boolean c(String str) {
        ck.p.j(str, "configKey");
        Object objE = e(str);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3680r8
    public String d(String str) {
        ck.p.j(str, "configKey");
        Object objE = e(str);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }
}
