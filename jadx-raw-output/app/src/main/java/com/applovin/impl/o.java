package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8 f8564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8567f = false;

    public List a() {
        return this.f8565d;
    }

    private k8 a(JSONObject jSONObject) {
        return new k8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    public String b() {
        return this.f8563b;
    }

    public String c() {
        return this.f8562a;
    }

    public k8 d() {
        return this.f8564c;
    }

    public List e() {
        return this.f8566e;
    }

    public boolean f() {
        return this.f8567f;
    }

    public o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f8562a = JsonUtils.getString(jSONObject, "name", "");
        this.f8563b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f8564c = a(jSONObject);
        this.f8565d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f8566e = a(com.ironsource.mediationsdk.d.f29596h, jSONObject, map, maxAdFormat, kVar);
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        e3 e3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (e3Var = (e3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (e3Var.C()) {
                    this.f8567f = true;
                }
                arrayList.add(new i8(jSONObject2, maxAdFormat, e3Var, kVar));
            }
        }
        return arrayList;
    }
}
