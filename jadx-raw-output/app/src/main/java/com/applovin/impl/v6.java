package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class v6 extends q6 {

    public class a implements q0.e {
        public a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (v6.this.h()) {
                com.applovin.impl.sdk.o oVar = v6.this.f7707c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.f7707c.b(v6Var.f7706b, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.o oVar2 = v6.this.f7707c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var2 = v6.this;
                    v6Var2.f7707c.b(v6Var2.f7706b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar3 = v6.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                v6 v6Var3 = v6.this;
                v6Var3.f7707c.a(v6Var3.f7706b, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
            }
            v6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (v6.this.h()) {
                com.applovin.impl.sdk.o oVar = v6.this.f7707c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.f7707c.b(v6Var.f7706b, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar2 = v6.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                v6 v6Var2 = v6.this;
                v6Var2.f7707c.b(v6Var2.f7706b, "Reward validation failed with code " + i10 + " and error: " + str2);
            }
            v6.this.a(i10);
        }
    }

    public abstract void a(o4 o4Var);

    public abstract boolean h();

    private o4 b(JSONObject jSONObject) {
        Map<String, String> mapEmptyMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        r0.c(jSONObject2, this.f7705a);
        r0.b(jSONObject, this.f7705a);
        r0.a(jSONObject, this.f7705a);
        try {
            mapEmptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            mapEmptyMap = Collections.emptyMap();
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return o4.a(string, mapEmptyMap);
    }

    @Override // com.applovin.impl.q6
    public int g() {
        return ((Integer) this.f7705a.a(x4.f9911e1)).intValue();
    }

    public v6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        o4 o4VarB = b(jSONObject);
        a(o4VarB);
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Pending reward handled: " + o4VarB);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }
}
