package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zin {
    public String ouw = "horizontal";
    public int vt = 1;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12897lh = 1;
    public int yu = 0;
    public int fkw = 0;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12896le = 0;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12898ra = 0;
    public int pno = 5000;
    public int bly = 500;
    public int tlj = 0;

    public static zin ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zin();
        }
        zin zinVar = new zin();
        zinVar.ouw = jSONObject.optString("direction", "horizontal");
        zinVar.vt = jSONObject.optInt("auto_loop", 1);
        zinVar.f12897lh = jSONObject.optInt("allow_manual_loop", 1);
        zinVar.yu = jSONObject.optInt("unlimited_loop", 0);
        zinVar.fkw = jSONObject.optInt("left_margin", 0);
        zinVar.f12896le = jSONObject.optInt("right_margin", 0);
        zinVar.f12898ra = jSONObject.optInt("ad_margin", 0);
        zinVar.pno = jSONObject.optInt("loop_interval_time", 5000);
        zinVar.bly = jSONObject.optInt("flip_speed", 500);
        zinVar.tlj = jSONObject.optInt("stop_auto_loop", 0);
        return zinVar;
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("direction", this.ouw);
            jSONObject.put("auto_loop", this.vt);
            jSONObject.put("allow_manual_loop", this.f12897lh);
            jSONObject.put("unlimited_loop", this.yu);
            jSONObject.put("left_margin", this.fkw);
            jSONObject.put("right_margin", this.f12896le);
            jSONObject.put("ad_margin", this.f12898ra);
            jSONObject.put("loop_interval_time", this.pno);
            jSONObject.put("flip_speed", this.bly);
            jSONObject.put("stop_auto_loop", this.tlj);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
