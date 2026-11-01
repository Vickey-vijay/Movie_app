package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class fkw {
    public ArrayList<ouw> ouw;
    private yu vt;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.core.ryl.yu f12755lh;
        public final String ouw;
        public final String vt;
        public Set<com.bytedance.sdk.openadsdk.core.ryl.tlj> yu;

        public final JSONObject ouw() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vast_url", this.ouw);
            jSONObject.put("vast_content", this.vt);
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar = this.f12755lh;
            if (yuVar != null) {
                jSONObject.put("videoTrackers", yuVar.vt());
            }
            if (this.yu != null) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.ryl.tlj tljVar : this.yu) {
                    if (tljVar != null) {
                        jSONArray.put(tljVar.ouw());
                    }
                }
                jSONObject.put("viewabilityVendor", jSONArray);
            }
            return jSONObject;
        }

        public ouw(JSONObject jSONObject) {
            this.ouw = jSONObject.optString("vast_url");
            this.vt = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar = new com.bytedance.sdk.openadsdk.core.ryl.yu();
                this.f12755lh = yuVar;
                yuVar.ouw(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.yu = com.bytedance.sdk.openadsdk.core.ryl.tlj.ouw(jSONArrayOptJSONArray);
            }
        }
    }

    public final JSONArray ouw() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<ouw> arrayList = this.ouw;
        if (arrayList != null) {
            try {
                Iterator<ouw> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().ouw());
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    @Nullable
    public final yu vt() {
        if (this.vt == null) {
            this.vt = new yu();
            ArrayList<ouw> arrayList = this.ouw;
            if (arrayList != null) {
                for (ouw ouwVar : arrayList) {
                    com.bytedance.sdk.openadsdk.core.ryl.yu yuVar = ouwVar.f12755lh;
                    Set<com.bytedance.sdk.openadsdk.core.ryl.tlj> set = ouwVar.yu;
                    if (yuVar != null) {
                        this.vt.ouw.ouw(yuVar);
                    }
                    if (set != null) {
                        this.vt.vt.addAll(set);
                    }
                }
            }
        }
        return this.vt;
    }

    public fkw(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            ouw ouwVar = new ouw(jSONArray.optJSONObject(i10));
            if (this.ouw == null) {
                this.ouw = new ArrayList<>();
            }
            this.ouw.add(ouwVar);
        }
    }
}
