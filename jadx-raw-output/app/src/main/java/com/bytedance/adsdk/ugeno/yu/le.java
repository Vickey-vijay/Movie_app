package com.bytedance.adsdk.ugeno.yu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class le {
    public ouw ouw;
    public List<ouw> vt;

    public static class ouw {
        public Map<String, String> fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public Map<String, Object> f11055le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f11056lh = "global";
        public String ouw;
        public String vt;
        public String yu;

        public final String toString() {
            return "Action{scheme='" + this.f11056lh + "', name='" + this.yu + "', params=" + this.fkw + ", host='" + this.vt + "', origin='" + this.ouw + "', extra=" + this.f11055le + '}';
        }
    }

    public static le ouw(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        le leVar = new le();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        leVar.ouw = ryl.ouw(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            ouw ouwVarOuw = ryl.ouw(jSONArrayOptJSONArray.optString(i10), jSONObject2);
            if (ouwVarOuw != null) {
                arrayList.add(ouwVarOuw);
            }
        }
        leVar.vt = arrayList;
        return leVar;
    }
}
