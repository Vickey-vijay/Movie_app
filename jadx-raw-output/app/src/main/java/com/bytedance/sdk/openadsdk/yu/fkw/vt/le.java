package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class le extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13481lh = 0;
    public long ouw;
    public long vt;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.ouw);
            jSONObject.put("buffers_time", this.vt);
            jSONObject.put("video_backup", this.f13481lh);
        } catch (Throwable th2) {
            qbp.lh("FeedOverModel", th2.getMessage());
        }
    }
}
