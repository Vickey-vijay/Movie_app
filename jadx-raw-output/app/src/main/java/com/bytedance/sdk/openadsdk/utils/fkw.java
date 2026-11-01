package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class fkw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static boolean f13386lh;
    public static WeakReference<com.bytedance.sdk.openadsdk.core.model.vpp> ouw;
    public static long vt;

    public static void ouw(final long j10) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.vpp> weakReference = ouw;
        if (weakReference == null || j10 <= 0 || (vppVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, vppVar.vt(), "store_duration", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.utils.fkw.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        ouw = null;
        f13386lh = false;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
        if (leVar == null || TextUtils.isEmpty(leVar.ouw)) {
            return;
        }
        ouw = new WeakReference<>(vppVar);
    }
}
