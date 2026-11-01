package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yu extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13490lh;
    public long ouw;
    public long vt;
    public int yu = 0;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.ouw);
            jSONObject.put("buffers_time", this.vt);
            jSONObject.put("break_reason", this.f13490lh);
            jSONObject.put("video_backup", this.yu);
        } catch (Throwable th2) {
            qbp.lh("FeedBreakModel", th2.getMessage());
        }
    }
}
