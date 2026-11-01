package com.bytedance.sdk.component.ouw;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class mwh {
    private final Map<String, Object> ouw = new ConcurrentHashMap();

    public final mwh ouw(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.ouw.put(str, obj);
        }
        return this;
    }

    public final String ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.ouw.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
