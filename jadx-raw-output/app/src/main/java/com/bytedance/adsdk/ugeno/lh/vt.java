package com.bytedance.adsdk.ugeno.lh;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fkw;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class vt {
    public static String ouw(String str, JSONObject jSONObject) {
        ouw ouwVar;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (!str.startsWith("${") || !str.endsWith(h.f44172e) || (ouwVar = fkw.ouw().yu) == null) {
                    return str;
                }
                return (String) ouwVar.ouw(str.substring(2, str.length() - 1)).ouw(jSONObject);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return str;
    }
}
