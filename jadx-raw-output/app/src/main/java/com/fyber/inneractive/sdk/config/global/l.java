package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3754ve;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15103a = new HashMap();

    public static l a(JSONObject jSONObject) throws JSONException {
        l lVar = new l();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("features");
        int i10 = 0;
        int i11 = 0;
        while (i11 < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
            q qVar = new q();
            qVar.f15106b = jSONObject2.getString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                qVar.f15105a = new o(jSONObjectOptJSONObject);
            } else {
                Object[] objArr = new Object[1];
                objArr[i10] = qVar.f15106b;
                IAlog.a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(C3754ve.f31473d);
            if (jSONArrayOptJSONArray2 != null) {
                int i12 = i10;
                while (i12 < jSONArrayOptJSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i12);
                    b bVar = new b();
                    bVar.f15077a = jSONObject3.getString("id");
                    bVar.f15078b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i13 = i10; i13 < jSONArray.length(); i13++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i13);
                        k kVar = new k();
                        kVar.f15101b = jSONObject4.getString("id");
                        kVar.f15102c = jSONObject4.getInt("perc");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("params");
                        if (jSONObjectOptJSONObject2 != null) {
                            kVar.f15105a = new o(jSONObjectOptJSONObject2);
                        }
                        bVar.f15079c.add(kVar);
                    }
                    b.a(bVar, jSONObject3.optJSONObject("include"), true);
                    b.a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.f15107c.put(bVar.f15077a, bVar);
                    i12++;
                    i10 = 0;
                }
            }
            lVar.f15103a.put(qVar.f15106b, qVar);
            i11++;
            i10 = i10;
        }
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f15103a.equals(((l) obj).f15103a);
    }

    public final int hashCode() {
        return this.f15103a.hashCode();
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.f15103a.values());
    }
}
