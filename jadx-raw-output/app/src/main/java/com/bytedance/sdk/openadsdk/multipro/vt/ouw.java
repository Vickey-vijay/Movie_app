package com.bytedance.sdk.openadsdk.multipro.vt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ouw {
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f13265le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13266lh;
    public boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f13267ra;
    public boolean vt;
    public boolean yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.vt.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0144ouw {
        ouw ra();
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.ouw);
            jSONObject.put("isFromVideoDetailPage", this.vt);
            jSONObject.put("isFromDetailPage", this.f13266lh);
            jSONObject.put("duration", this.fkw);
            jSONObject.put("totalPlayDuration", this.f13265le);
            jSONObject.put("currentPlayPosition", this.f13267ra);
            jSONObject.put("isAutoPlay", this.yu);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static ouw ouw(JSONObject jSONObject) {
        ouw ouwVar = new ouw();
        ouwVar.ouw = jSONObject.optBoolean("isCompleted");
        ouwVar.vt = jSONObject.optBoolean("isFromVideoDetailPage");
        ouwVar.f13266lh = jSONObject.optBoolean("isFromDetailPage");
        ouwVar.fkw = jSONObject.optLong("duration");
        ouwVar.f13265le = jSONObject.optLong("totalPlayDuration");
        ouwVar.f13267ra = jSONObject.optLong("currentPlayPosition");
        ouwVar.yu = jSONObject.optBoolean("isAutoPlay");
        return ouwVar;
    }
}
