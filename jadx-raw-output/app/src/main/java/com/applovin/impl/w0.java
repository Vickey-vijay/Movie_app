package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class w0 extends v0 {
    public List f() {
        x0 x0VarA;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f9720b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject != null && (x0VarA = x0.a(jSONObject, this.f9719a)) != null) {
                arrayList.add(x0VarA);
            }
        }
        return arrayList;
    }

    public String g() {
        return b("message");
    }

    public String h() {
        return b("title");
    }

    @Override // com.applovin.impl.v0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", title=" + h() + ", message=" + g() + ", actions=" + f() + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public w0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }
}
