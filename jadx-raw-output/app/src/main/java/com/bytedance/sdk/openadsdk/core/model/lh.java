package com.bytedance.sdk.openadsdk.core.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class lh {
    public AdSlot fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f12781le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12782lh = 1;
    public String ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12783ra;
    public int vt;
    public ArrayList<Integer> yu;

    public static void ouw(lh lhVar) {
        int i10;
        if (lhVar == null || lhVar.fkw == null || (i10 = lhVar.vt) >= 0 || i10 == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.rn.lh.ouw();
        com.bytedance.sdk.openadsdk.rn.lh.ouw("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.model.lh.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypedValues.TransitionType.S_FROM, lh.this.f12782lh);
                jSONObject.put("err_code", lh.this.vt);
                jSONObject.put("err_msg", lh.this.f12781le);
                jSONObject.put("ext_from", lh.this.f12783ra);
                jSONObject.put("server_res_str", lh.this.ouw);
                ArrayList<Integer> arrayList = lh.this.yu;
                if (arrayList != null && arrayList.size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) lh.this.yu).toString());
                }
                com.bytedance.sdk.component.utils.ko.vt("AdLogInfoModel", "rd_client_custom_error = ", jSONObject);
                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                yuVar.ouw = "rd_client_custom_error";
                yuVar.yu = lh.this.fkw.getDurationSlotType();
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }
}
