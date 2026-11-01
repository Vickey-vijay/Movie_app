package com.bytedance.adsdk.ouw;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lh implements com.bytedance.adsdk.ugeno.lh.ouw {

    public static class ouw implements com.bytedance.adsdk.ugeno.lh.ouw.InterfaceC0070ouw {
        private com.bytedance.adsdk.ouw.vt.ouw ouw;
        private String vt;

        @Override // com.bytedance.adsdk.ugeno.lh.ouw.InterfaceC0070ouw
        public final Object ouw(JSONObject jSONObject) {
            bly blyVarOuw;
            com.bytedance.adsdk.ouw.vt.ouw ouwVar = this.ouw;
            if (ouwVar == null) {
                return this.vt;
            }
            Object objOuw = ouwVar.ouw(jSONObject);
            if (objOuw instanceof String) {
                return objOuw;
            }
            if (!(objOuw instanceof com.bytedance.adsdk.ouw.vt.ouw.ouw)) {
                if (objOuw == null || !objOuw.getClass().isArray()) {
                    return String.valueOf(objOuw);
                }
                try {
                    return new JSONArray(objOuw).toString();
                } catch (JSONException unused) {
                    return String.valueOf(objOuw);
                }
            }
            com.bytedance.adsdk.ouw.vt.ouw.ouw ouwVar2 = (com.bytedance.adsdk.ouw.vt.ouw.ouw) objOuw;
            Object objOuw2 = null;
            if (ouwVar2 != null && (blyVarOuw = rn.ouw(ouwVar2.ouw)) != null) {
                objOuw2 = blyVarOuw.ouw(null, ouwVar2.vt);
            }
            return String.valueOf(objOuw2);
        }

        public ouw(String str) {
            this.vt = str;
            this.ouw = com.bytedance.adsdk.ouw.vt.ouw.ouw(str);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lh.ouw
    public final com.bytedance.adsdk.ugeno.lh.ouw.InterfaceC0070ouw ouw(String str) {
        return new ouw(str);
    }
}
