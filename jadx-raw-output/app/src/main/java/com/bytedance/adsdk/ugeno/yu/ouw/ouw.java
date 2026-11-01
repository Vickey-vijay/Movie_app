package com.bytedance.adsdk.ugeno.yu.ouw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ouw {
    public volatile Map<String, lh> ouw = new HashMap();

    public final lh ouw(String str) {
        if (this.ouw.containsKey(str) && this.ouw.get(str) != null) {
            return this.ouw.get(str);
        }
        vt vtVar = new vt();
        this.ouw.put(str, vtVar);
        return vtVar;
    }
}
