package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jg extends zih {
    public jg() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw = this.ouw.ouw(map);
        Object objOuw2 = this.vt.ouw(map);
        if (objOuw == null && objOuw2 == null) {
            return Boolean.FALSE;
        }
        if (objOuw == null && objOuw2 != null) {
            return Boolean.TRUE;
        }
        if (objOuw == null || objOuw2 != null) {
            return ((objOuw instanceof Number) && (objOuw2 instanceof Number)) ? Boolean.valueOf(!com.bytedance.adsdk.ouw.vt.fkw.ouw.ouw.ouw((Number) objOuw, (Number) objOuw2)) : Boolean.valueOf(!objOuw.equals(objOuw2));
        }
        return Boolean.TRUE;
    }
}
