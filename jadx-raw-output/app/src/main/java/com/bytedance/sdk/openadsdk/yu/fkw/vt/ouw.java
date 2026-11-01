package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw {
    private JSONObject fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private JSONObject f13483le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public lh f13484lh;
    public vpp ouw;
    public String vt;
    public boolean yu = false;

    public final JSONObject ouw() {
        if (this.fkw == null) {
            this.fkw = new JSONObject();
        }
        return this.fkw;
    }

    public final JSONObject vt() {
        if (this.f13483le == null) {
            this.f13483le = new JSONObject();
        }
        return this.f13483le;
    }

    public ouw(vpp vppVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.ouw = vppVar;
        this.vt = str;
        this.fkw = jSONObject;
        this.f13483le = jSONObject2;
    }
}
