package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cf extends lh {
    private final String ouw;
    private final long vt;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.ouw);
            jSONObject.put("preload_size", this.vt);
        } catch (Throwable th2) {
            qbp.lh("LoadVideoStartModel", th2.getMessage());
        }
    }

    public cf(String str, long j10) {
        this.ouw = str;
        this.vt = j10;
    }
}
