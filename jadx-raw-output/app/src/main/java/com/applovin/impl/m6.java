package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class m6 extends o6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7978g;

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f7978g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f7978g.P());
        String clCode = this.f7978g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/cr";
    }

    public m6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f7978g = bVar;
    }

    @Override // com.applovin.impl.o6
    public o4 h() {
        return this.f7978g.i();
    }

    @Override // com.applovin.impl.o6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Reported reward successfully for ad: " + this.f7978g);
        }
    }

    @Override // com.applovin.impl.o6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "No reward result was found for ad: " + this.f7978g);
        }
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "Failed to report reward for ad: " + this.f7978g + " - error code: " + i10);
        }
        this.f7705a.g().a(d2.H, this.f7978g);
    }
}
