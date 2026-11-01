package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u2 f7728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a4 f7729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f7730c;

    public a4 a() {
        return this.f7729b;
    }

    public u2 b() {
        return this.f7728a;
    }

    public List c() {
        return this.f7730c;
    }

    public boolean d() {
        return this.f7729b != null;
    }

    public i8(JSONObject jSONObject, MaxAdFormat maxAdFormat, e3 e3Var, com.applovin.impl.sdk.k kVar) {
        boolean z10;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f7729b = new a4(jSONObject2, kVar);
        } else {
            this.f7729b = null;
        }
        String string = JsonUtils.getString(jSONObject, "name", "");
        String string2 = JsonUtils.getString(jSONObject, "display_name", "");
        if (jSONObject2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7728a = new u2(string, string2, z10, e3Var);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f7730c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f7730c.add(new a4(jSONObject3, kVar));
            }
        }
    }
}
