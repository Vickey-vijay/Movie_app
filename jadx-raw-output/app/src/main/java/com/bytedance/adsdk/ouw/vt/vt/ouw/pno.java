package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class pno extends zih {
    public pno() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.LT_EQ);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw;
        Object objOuw2 = this.ouw.ouw(map);
        if (objOuw2 == null || (objOuw = this.vt.ouw(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.ouw.vt.fkw.ouw.vt.ouw(objOuw2, (Number) objOuw)).booleanValue());
    }
}
