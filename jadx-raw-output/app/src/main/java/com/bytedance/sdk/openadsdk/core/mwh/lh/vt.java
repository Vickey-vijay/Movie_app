package com.bytedance.sdk.openadsdk.core.mwh.lh;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class vt {
    public static void ouw(vpp vppVar) {
        if (od.vt(vppVar)) {
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void ouw(vpp vppVar, int i10, String str) {
        if (vppVar != null) {
            if (od.lh(vppVar) || od.vt(vppVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e10) {
                    qbp.ouw("PlayableEvent", "onFail json error", e10);
                }
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
