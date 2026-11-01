package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ryl {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12804lh;
    public String ouw;
    public String vt;

    @Nullable
    public final JSONObject ouw() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.ouw);
            jSONObject.put("ft", this.f12804lh);
            jSONObject.put("fu", this.vt);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
