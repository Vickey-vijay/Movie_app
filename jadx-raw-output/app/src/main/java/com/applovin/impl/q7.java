package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.bidmachine.ads.networks.adaptiverendering.measurer.AdMeasurerFactory;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class q7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8868a;

    public static q7 a(p8 p8Var, q7 q7Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        try {
            List listB = q7Var != null ? q7Var.b() : new ArrayList();
            Iterator it = p8Var.a(VastTagName.VERIFICATION).iterator();
            while (it.hasNext()) {
                p7 p7VarA = p7.a((p8) it.next(), s7Var, kVar);
                if (p7VarA != null) {
                    listB.add(p7VarA);
                }
            }
            return new q7(listB);
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerifications", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastAdVerifications", th2);
            return null;
        }
    }

    public List b() {
        return this.f8868a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q7) {
            return this.f8868a.equals(((q7) obj).f8868a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8868a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f8868a + "'}";
    }

    private q7(List list) {
        this.f8868a = list;
    }

    public static q7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, AdMeasurerFactory.VERIFICATIONS, new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            p7 p7VarA = p7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (p7VarA != null) {
                arrayList.add(p7VarA);
            }
        }
        return new q7(arrayList);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f8868a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f8868a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((p7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, AdMeasurerFactory.VERIFICATIONS, jSONArray);
        }
        return jSONObject;
    }
}
