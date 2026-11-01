package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class y0 extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f10119c;

    public Map f() {
        return this.f10119c;
    }

    public String g() {
        return JsonUtils.getString(this.f9720b, "name", null);
    }

    @Override // com.applovin.impl.v0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", name=" + g() + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public y0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }
}
