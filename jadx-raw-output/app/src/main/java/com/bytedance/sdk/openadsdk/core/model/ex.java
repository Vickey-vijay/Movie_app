package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ex {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public JSONObject f12744cf;
    public int fkw;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public pd f12746ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12747le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12748lh;
    public int mwh;
    public int ouw;
    public String pno;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public vt f12750rn;
    public int ryl;
    public boolean tlj;
    public int yu;
    private JSONObject zih;
    public int vt = 10;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12749ra = 1;
    public ouw bly = new ouw();

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f12745jg = 1;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f12752vm = "Next Ad";

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private String f12751th = "Next ad in %1$ds";

    public static class ouw {
        public int fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f12753lh;
        public int ouw;
        public int vt;
        public int yu;

        public final JSONObject ouw() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.ouw);
                jSONObject.put("padding_right", this.vt);
                jSONObject.put("padding_top", this.f12753lh);
                jSONObject.put("padding_bottom", this.yu);
                jSONObject.put("card_spacing", this.fkw);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public static class vt {
        public float fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12754lh;
        public int ouw;
        public String vt;
        public float yu;
    }

    public static ex ouw(String str) {
        ex exVar = new ex();
        if (str == null) {
            return exVar;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            exVar.ouw = jSONObjectJsonObjectInit.optInt("auto_switch");
            exVar.vt = jSONObjectJsonObjectInit.optInt("playable_preload_count");
            exVar.f12748lh = jSONObjectJsonObjectInit.optInt("disable_on_interaction");
            exVar.yu = jSONObjectJsonObjectInit.optInt("ceiling_type");
            exVar.fkw = jSONObjectJsonObjectInit.optInt("can_loop");
            exVar.f12747le = jSONObjectJsonObjectInit.optInt("multi_skip_time", -1);
            exVar.f12749ra = jSONObjectJsonObjectInit.optInt("load_more_strategy");
            exVar.f12745jg = jSONObjectJsonObjectInit.optInt("report_show_by_percent", 1);
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("gesture_tpl_info");
            exVar.zih = jSONObjectOptJSONObject;
            if (jSONObjectOptJSONObject != null) {
                pd pdVarOuw = pd.ouw(jSONObjectOptJSONObject);
                exVar.f12746ko = pdVarOuw;
                if (pdVarOuw != null && !TextUtils.isEmpty(pdVarOuw.f12797lh)) {
                    com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
                    pd pdVar = exVar.f12746ko;
                    ouwVar.ouw = pdVar.ouw;
                    ouwVar.vt = pdVar.vt;
                    ouwVar.f12650lh = pdVar.f12797lh;
                    ouwVar.yu = pdVar.yu;
                    com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVar, "guide");
                }
                int iOptInt = exVar.zih.optInt("delay_show_time", 5);
                exVar.ryl = iOptInt;
                if (iOptInt < 0) {
                    exVar.ryl = 5;
                }
                int iOptInt2 = exVar.zih.optInt("dismiss_after_idle_time", 3);
                exVar.mwh = iOptInt2;
                if (iOptInt2 <= 0) {
                    exVar.mwh = 3;
                }
            }
            exVar.pno = jSONObjectJsonObjectInit.optString("agg_endcard_url");
            exVar.tlj = jSONObjectJsonObjectInit.optBoolean("has_more");
            exVar.f12744cf = jSONObjectJsonObjectInit.optJSONObject("session_params");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectJsonObjectInit.optJSONObject("layout_config");
            ouw ouwVar2 = new ouw();
            if (jSONObjectOptJSONObject2 != null) {
                ouwVar2.ouw = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_left", 0));
                ouwVar2.vt = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_right", 0));
                ouwVar2.f12753lh = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_top", 0));
                ouwVar2.yu = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_bottom", 0));
                ouwVar2.fkw = Math.max(0, jSONObjectOptJSONObject2.optInt("card_spacing", 0));
            }
            exVar.bly = ouwVar2;
            JSONObject jSONObjectOptJSONObject3 = jSONObjectJsonObjectInit.optJSONObject("progress_config");
            vt vtVar = new vt();
            if (jSONObjectOptJSONObject3 != null) {
                vtVar.ouw = jSONObjectOptJSONObject3.optInt("progress_type", 0);
                vtVar.vt = jSONObjectOptJSONObject3.optString("progress_color");
                vtVar.f12754lh = jSONObjectOptJSONObject3.optString("progress_background_color");
                vtVar.yu = jSONObjectOptJSONObject3.optInt("progress_size", 0);
                vtVar.fkw = jSONObjectOptJSONObject3.optInt("bar_radius", 0);
            }
            exVar.f12750rn = vtVar;
        } catch (JSONException unused) {
        }
        return exVar;
    }

    public final JSONObject vt() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.ouw);
            jSONObject.put("playable_preload_count", this.vt);
            jSONObject.put("disable_on_interaction", this.f12748lh);
            jSONObject.put("ceiling_type", this.yu);
            jSONObject.put("can_loop", this.fkw);
            jSONObject.put("multi_skip_time", this.f12747le);
            jSONObject.put("load_more_strategy", this.f12749ra);
            jSONObject.put("report_show_by_percent", this.f12745jg);
            jSONObject.put("gesture_tpl_info", this.zih);
            jSONObject.put("agg_endcard_url", this.pno);
            jSONObject.put("layoutConfig", this.bly.ouw());
            jSONObject.put("has_more", this.tlj);
            jSONObject.put("session_params", this.f12744cf);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final JSONObject ouw() {
        pd pdVar = this.f12746ko;
        if (pdVar == null) {
            return null;
        }
        try {
            String str = pdVar.yu;
            if (!TextUtils.isEmpty(str)) {
                return PangleVideoBridge.jsonObjectInit(str);
            }
            com.bytedance.sdk.openadsdk.core.cf.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw();
            pd pdVar2 = this.f12746ko;
            String strOuw = vtVarOuw.ouw("guide", pdVar2.ouw, pdVar2.vt);
            if (TextUtils.isEmpty(strOuw)) {
                return null;
            }
            return PangleVideoBridge.jsonObjectInit(strOuw);
        } catch (JSONException unused) {
            return null;
        }
    }
}
