package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class o6 extends q6 {

    public class a implements q0.e {
        public a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            o6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            o6.this.a(i10);
        }
    }

    public abstract void b(JSONObject jSONObject);

    public abstract o4 h();

    public abstract void i();

    @Override // com.applovin.impl.q6
    public int g() {
        return ((Integer) this.f7705a.a(x4.f9920f1)).intValue();
    }

    public o6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(o4 o4Var) {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", o4Var.b());
        Map mapA = o4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    @Override // java.lang.Runnable
    public void run() {
        o4 o4VarH = h();
        if (o4VarH != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Reporting pending reward: " + o4VarH + "...");
            }
            a(a(o4VarH), new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "Pending reward not found");
        }
        i();
    }
}
