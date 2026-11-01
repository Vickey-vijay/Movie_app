package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class bly extends zih {
    public bly() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.LT);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw;
        Object objOuw2 = this.ouw.ouw(map);
        if (objOuw2 == null || (objOuw = this.vt.ouw(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.ouw.vt.fkw.ouw.lh.ouw(objOuw2, (Number) objOuw);
    }
}
