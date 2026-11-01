package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.Q6;
import com.safedk.android.utils.SdksMapping;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class w5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q0.e f9823g;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            w5.this.f9823g.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            w5.this.f9823g.a(str, i10, str2, jSONObject);
        }
    }

    public w5(q0.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f9823g = eVar;
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, w3.b(this.f7705a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a aVarF = this.f7705a.A().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapK0 = this.f7705a.k0();
        if (!CollectionUtils.isEmpty(mapK0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapK0));
        }
        return jSONObject;
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f7705a.a(x4.f9969k5)).booleanValue()) {
            map.put("sdk_key", this.f7705a.i0());
        }
        Map mapG = this.f7705a.A().G();
        map.put("package_name", String.valueOf(mapG.get("package_name")));
        map.put("app_version", String.valueOf(mapG.get("app_version")));
        Map mapN = this.f7705a.A().N();
        map.put("platform", String.valueOf(mapN.get("platform")));
        map.put(Q6.F, String.valueOf(mapN.get(Q6.F)));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f7705a.a(x4.C5)).booleanValue() || ((Boolean) this.f7705a.a(x4.f10091z5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f7705a).c("POST").b(l3.i(this.f7705a)).a(l3.h(this.f7705a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f7705a.a(r3.f8956t7)).intValue()).a(u4.a.a(((Integer) this.f7705a.a(x4.f10027r5)).intValue())).a(), this.f7705a, d());
        aVar.c(r3.f8948p7);
        aVar.b(r3.f8950q7);
        this.f7705a.q0().a(aVar);
    }
}
