package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class pno extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13485lh;
    public long ouw;
    public long vt;
    private final com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh yu;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.ouw);
            jSONObject.put("video_cache_size", this.vt);
            jSONObject.put("is_auto_play", this.f13485lh);
        } catch (Throwable th2) {
            qbp.lh("FeedPlayModel", th2.getMessage());
        }
    }

    public pno(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        this.yu = lhVar;
    }

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(ouw ouwVar) throws Throwable {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar = this.yu;
        if (lhVar.fkw) {
            String str = lhVar.f10446lh;
            String strBly = lhVar.bly();
            File fileOuw = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(str, strBly);
            File fileVt = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.vt(str, strBly);
            if (fileVt.exists()) {
                fileOuw = fileVt;
            }
            try {
                ouwVar.vt().put("moov_box_pos", com.bykv.vk.openvk.ouw.ouw.ouw.ra.yu.ouw(fileOuw));
            } catch (JSONException unused) {
            }
        }
    }
}
