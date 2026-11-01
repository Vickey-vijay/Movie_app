package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class qbp implements com.bytedance.adsdk.ouw.vt.vt.ouw {
    private final String ouw;

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.STRING;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return "'" + this.ouw + "'";
    }

    public qbp(String str) {
        this.ouw = str;
    }

    public final String toString() {
        return vt();
    }
}
