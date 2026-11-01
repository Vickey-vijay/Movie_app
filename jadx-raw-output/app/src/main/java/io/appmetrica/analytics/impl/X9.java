package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class X9 {
    public static boolean a(JSONObject jSONObject, String str, boolean z10) {
        Boolean boolValueOf;
        if (jSONObject.has(str)) {
            boolValueOf = Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled"));
        } else {
            boolValueOf = null;
        }
        return ((Boolean) WrapUtils.getOrDefault(boolValueOf, Boolean.valueOf(z10))).booleanValue();
    }
}
