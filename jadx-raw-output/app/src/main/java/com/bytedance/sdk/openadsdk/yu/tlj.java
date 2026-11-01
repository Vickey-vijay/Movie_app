package com.bytedance.sdk.openadsdk.yu;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.ironsource.Z7;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class tlj {
    public static void ouw(vpp vppVar, String str, String str2, String str3) {
        ouw(vppVar, str, str2, str3, null);
    }

    public static void ouw(vpp vppVar, String str, String str2, String str3, JSONObject jSONObject) {
        vt(vppVar, str, str2, str3, jSONObject);
    }

    private static void vt(final vpp vppVar, String str, String str2, final String str3, final JSONObject jSONObject) {
        if (vppVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        lh.ouw(System.currentTimeMillis(), vppVar, str2, str, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.tlj.1
            public final /* synthetic */ int yu = 0;

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                return tlj.ouw(vppVar, str3, this.yu, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                if (jSONObject != null) {
                    long j10 = vppVar.vby;
                    if (j10 >= 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("duration", j10);
                        } catch (Exception e10) {
                            qbp.yu(e10.getMessage(), new Object[0]);
                        }
                        return jSONObject2;
                    }
                }
                return super.vt();
            }
        });
    }

    public static JSONObject ouw(vpp vppVar, String str, int i10, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            jSONObject2.put("ad_show_order", i10 + 1);
            jSONObject2.put("interaction_method", vppVar.bs);
            jSONObject2.put("real_interaction_method", vppVar.fvf);
            jSONObject2.put("render_time_out", com.bytedance.sdk.openadsdk.core.zih.yu().ko());
            jSONObject2.put("has_show_endcard", vppVar.ybr);
            com.bytedance.sdk.openadsdk.core.zih.yu();
            jSONObject2.put("video_skip_result", com.bytedance.sdk.openadsdk.core.settings.cf.bly(String.valueOf(vppVar.fqk())));
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException e10) {
                        com.bytedance.sdk.component.utils.ko.lh("AdEventLog", "Failed to merge key: " + next + " from extra", e10);
                    }
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.lh("CallbackFunnelAnalyzer", "buildPagCoreJson error ", th2);
        }
        return jSONObject2;
    }

    private static String ouw(Throwable th2) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            printWriter.close();
            return stringWriter.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void ouw(String str, boolean z10, boolean z11, vpp vppVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = 1;
            jSONObject.put("has_close_invoke", z10 ? 1 : 2);
            if (!z11) {
                i10 = 2;
            }
            jSONObject.put("has_show_invoke", i10);
            ouw(vppVar, str, vppVar != null ? vppVar.vt() : null, null, jSONObject);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ko.lh("PAGInterstitialAdWrapper", "onAdClose", e10);
        }
    }

    public static void ouw(vpp vppVar, String str, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_trigger", str);
            jSONObject.put("one_slot_multi", z10 ? 1 : 0);
        } catch (JSONException e10) {
            qbp.lh("BVA", "report listen empty error :" + e10.getMessage());
        }
        ouw(vppVar, "show_ad_fail", vppVar != null ? vppVar.vt() : null, "listen_empty", jSONObject);
    }

    public static void ouw(vpp vppVar) {
        String strOuw;
        if (vppVar == null || vppVar.bu) {
            return;
        }
        boolean zOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("is_can_report", false);
        JSONObject jSONObject = new JSONObject();
        if (zOuw) {
            strOuw = ouw(new Throwable());
            if (!TextUtils.isEmpty(strOuw)) {
                try {
                    jSONObject.put(Z7.f27985e, strOuw);
                } catch (Throwable th2) {
                    qbp.lh("BVA", " get stack trace error :" + th2.getMessage());
                }
            }
        } else {
            strOuw = null;
        }
        vt(vppVar, "no_show_but_close", vppVar.vt(), strOuw, null);
    }
}
