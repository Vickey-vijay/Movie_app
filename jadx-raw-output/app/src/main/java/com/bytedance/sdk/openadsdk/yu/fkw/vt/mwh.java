package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class mwh extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f13482lh;
    public long ouw;
    public int vt;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ouw);
            jSONObject.put("buffers_count", this.vt);
            jSONObject.put("total_duration", this.f13482lh);
        } catch (Throwable th2) {
            qbp.lh("PlayBufferModel", th2.getMessage());
        }
    }
}
