package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class le extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final WeakReference<bs> f13330lh;

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* bridge */ /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        return ouw(jSONObject);
    }

    private JSONObject ouw(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        WeakReference<bs> weakReference = this.f13330lh;
        if (weakReference != null && weakReference.get() != null) {
            bs bsVar = this.f13330lh.get();
            vpp vppVar = bsVar.bly;
            try {
                boolean z10 = true;
                int i10 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z10 = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iOptInt2 = (vppVar == null || (jSONObject2 = vppVar.hsa) == null) ? 0 : jSONObject2.optInt("easy_playable_skip_duration", 0);
                if (iOptInt >= 0 && iOptInt2 >= 0) {
                    iOptInt = Math.min(iOptInt, iOptInt2);
                } else if (iOptInt < 0) {
                    iOptInt = iOptInt2 >= 0 ? iOptInt2 : 0;
                }
                if (z10) {
                    com.bytedance.sdk.openadsdk.core.bly.ko koVar = bsVar.f12579cf;
                    if (koVar != null) {
                        koVar.vt(iOptInt);
                    }
                } else {
                    i10 = -1;
                }
                jSONObject3.put("code", i10);
                jSONObject3.put("reduce_duration", iOptInt);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.qbp.lh("InteractiveFinishMethod", e10.getMessage());
            }
        }
        return jSONObject3;
    }

    public le(bs bsVar) {
        this.f13330lh = new WeakReference<>(bsVar);
    }
}
