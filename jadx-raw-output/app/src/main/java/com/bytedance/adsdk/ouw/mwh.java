package com.bytedance.adsdk.ouw;

import com.ironsource.mediationsdk.metadata.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mwh implements bly {
    @Override // com.bytedance.adsdk.ouw.bly
    public final /* bridge */ /* synthetic */ Object ouw(JSONObject jSONObject, Object[] objArr) {
        return ouw(objArr);
    }

    private static Number ouw(Object[] objArr) {
        Object obj;
        if (objArr != null && objArr.length != 0 && (obj = objArr[0]) != null) {
            if (obj instanceof Number) {
                return (Number) obj;
            }
            if (obj instanceof Boolean) {
                return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            if (obj instanceof String) {
                try {
                    String strTrim = ((String) obj).trim();
                    if (!strTrim.equalsIgnoreCase("true") && !strTrim.equalsIgnoreCase(a.f29886h)) {
                        return strTrim.contains(".") ? Double.valueOf(Double.parseDouble(strTrim)) : Long.valueOf(Long.parseLong(strTrim));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }
}
