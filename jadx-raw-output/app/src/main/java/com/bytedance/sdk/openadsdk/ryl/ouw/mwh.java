package com.bytedance.sdk.openadsdk.ryl.ouw;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class mwh extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private WeakReference<com.bytedance.sdk.component.bly.le> f13332lh;

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* bridge */ /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        return ouw(jSONObject);
    }

    private JSONObject ouw(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.bly.le leVar = this.f13332lh.get();
            if (leVar != null) {
                leVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }

    public mwh(com.bytedance.sdk.component.bly.le leVar) {
        this.f13332lh = new WeakReference<>(leVar);
    }
}
