package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vm {
    public static int ouw = 1;
    public static int vt = 2;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12838lh = 5;
    public int yu = 30;
    public int fkw = 70;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12837le = 1;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12839ra = ouw;
    public int pno = 0;
    public int bly = 0;
    public int tlj = 3;

    public final JSONObject ouw(JSONObject jSONObject) {
        try {
            jSONObject.put("ceiling_time", this.f12838lh);
            jSONObject.put("ceiling_ratio", this.yu);
            jSONObject.put("expand_ratio", this.fkw);
            jSONObject.put("back_type", this.f12837le);
            jSONObject.put("boc_return_type", this.f12839ra);
            jSONObject.put("pre_render_status", this.pno);
            jSONObject.put("pre_render_use_gecko", this.bly);
            jSONObject.put("pre_render_add_type", this.tlj);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("InteractionParams", th2.getMessage());
        }
        return jSONObject;
    }
}
