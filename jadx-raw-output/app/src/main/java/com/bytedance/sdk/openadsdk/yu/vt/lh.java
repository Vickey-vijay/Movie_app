package com.bytedance.sdk.openadsdk.yu.vt;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lh implements vt {
    public vt ouw;

    @Override // com.bytedance.sdk.openadsdk.yu.vt.vt
    public final void ouw(JSONObject jSONObject, long j10) throws JSONException {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            vtVar.ouw(jSONObject, j10);
        }
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j10);
    }
}
