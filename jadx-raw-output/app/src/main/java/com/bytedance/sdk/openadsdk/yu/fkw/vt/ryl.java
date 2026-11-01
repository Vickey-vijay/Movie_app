package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ryl extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f13486lh;
    public String ouw;
    public long vt;
    public long yu;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.ouw);
            jSONObject.put("preload_size", this.vt);
            jSONObject.put("load_time", this.f13486lh);
            jSONObject.put("local_cache", this.yu);
        } catch (Throwable th2) {
            qbp.lh("LoadVideoSuccessModel", th2.getMessage());
        }
    }
}
