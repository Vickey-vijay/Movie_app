package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class j5 extends i5 {

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            j5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r0.a(i10, this.f7705a);
        }
    }

    public j5(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f7705a.o0().a(x4.f9918f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f7705a.o0().a(x4.f9954j, JsonUtils.getString(jSONObject2, "device_token", ""));
        r0.a(jSONObject2, this.f7705a);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.l lVarA = this.f7705a.A();
        Map mapP = lVarA.p();
        n7.a("platform", "type", mapP);
        n7.a("api_level", "sdk_version", mapP);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapP));
        Map mapG = lVarA.G();
        n7.a("sdk_version", "applovin_sdk_version", mapG);
        n7.a("ia", "installed_at", mapG);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapG));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.d(this.f7706b, "Submitting user data...");
        }
        Map mapC = r0.c(this.f7705a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f7705a.a(x4.F5)).booleanValue() || ((Boolean) this.f7705a.a(x4.f10091z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f7705a).b(r0.b("2.0/device", this.f7705a)).a(r0.a("2.0/device", this.f7705a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f7705a.a(x4.M5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f7705a.a(x4.Z2)).intValue()).a(u4.a.a(((Integer) this.f7705a.a(x4.f10067w5)).intValue())).a(), this.f7705a);
        aVar.c(x4.f9990n0);
        aVar.b(x4.f9998o0);
        this.f7705a.q0().a(aVar);
    }
}
