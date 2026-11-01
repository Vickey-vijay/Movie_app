package com.bytedance.adsdk.ouw;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jg implements bly {
    @Override // com.bytedance.adsdk.ouw.bly
    public final /* synthetic */ Object ouw(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        return null;
    }
}
