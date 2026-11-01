package com.bytedance.sdk.openadsdk.core.cf.le;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class le {
    private final String ouw = "UGenV3OpenLinks";
    private final String vt = "landingStyle";

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final String f12607lh = "url";
    private final String yu = "fallbackUrl";

    public static JSONObject ouw(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
