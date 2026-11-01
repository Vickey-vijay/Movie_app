package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class le extends zih {
    public le() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.GT);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw;
        Object objOuw2 = this.ouw.ouw(map);
        if (objOuw2 == null || (objOuw = this.vt.ouw(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.ouw.vt.fkw.ouw.vt.ouw(objOuw2, (Number) objOuw);
    }
}
