package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ko implements com.bytedance.adsdk.ouw.vt.vt.ouw {
    private Number ouw;

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.NUMBER;
    }

    public final String toString() {
        return this.ouw.toString();
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return this.ouw.toString();
    }

    public ko(String str) {
        if (str.indexOf(46) >= 0) {
            Float fValueOf = Float.valueOf(str);
            this.ouw = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.ouw = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.ouw = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.ouw = Long.valueOf(str);
        }
    }
}
