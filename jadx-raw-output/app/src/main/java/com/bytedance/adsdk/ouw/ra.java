package com.bytedance.adsdk.ouw;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ra implements bly {
    private static Number ouw(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static int vt(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    @Override // com.bytedance.adsdk.ouw.bly
    public final /* synthetic */ Object ouw(JSONObject jSONObject, Object[] objArr) {
        boolean zBooleanValue;
        BigDecimal scale;
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberOuw = ouw(objArr[0]);
        int iVt = vt(objArr[1]);
        Object obj = objArr[2];
        if (obj instanceof Boolean) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else {
            zBooleanValue = obj instanceof String ? Boolean.parseBoolean((String) obj) : false;
        }
        if (numberOuw == null) {
            return null;
        }
        int iMax = Math.max(iVt, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(numberOuw.doubleValue());
        if (zBooleanValue) {
            scale = bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP);
        } else {
            scale = bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        }
        if (iMax != 0 && scale.stripTrailingZeros().scale() > 0) {
            return Double.valueOf(scale.doubleValue());
        }
        return Long.valueOf(scale.longValue());
    }
}
