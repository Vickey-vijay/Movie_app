package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class vt extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13489lh;
    public long ouw;
    public long vt;
    public int yu;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ouw);
            jSONObject.put("total_duration", this.vt);
            jSONObject.put("vbtt_skip_type", this.f13489lh);
            jSONObject.put("skip_reason", this.yu);
        } catch (Throwable th2) {
            qbp.lh("EndcardSkipModel", th2.getMessage());
        }
    }
}
