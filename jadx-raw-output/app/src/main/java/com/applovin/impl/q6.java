package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q6 extends i5 {

    public class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ q0.e f8866m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, q0.e eVar) {
            super(aVar, kVar);
            this.f8866m = eVar;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f8866m.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f8866m.a(str, i10, str2, jSONObject);
        }
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, q0.e eVar) {
        Map mapC = r0.c(this.f7705a);
        if (((Boolean) this.f7705a.a(x4.G5)).booleanValue() || ((Boolean) this.f7705a.a(x4.f10091z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f7705a).b(r0.b(f(), this.f7705a)).a(r0.a(f(), this.f7705a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f7705a.a(x4.P5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(u4.a.a(((Integer) this.f7705a.a(x4.f10075x5)).intValue())).a(), this.f7705a, eVar);
        aVar.c(x4.f9990n0);
        aVar.b(x4.f9998o0);
        this.f7705a.q0().a(aVar);
    }

    public abstract String f();

    public abstract int g();

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f7705a.w0().e();
        if (((Boolean) this.f7705a.a(x4.B3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f7705a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f7705a.u());
        }
        if (((Boolean) this.f7705a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f7705a.h0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public q6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public void a(int i10) {
        r0.a(i10, this.f7705a);
    }
}
