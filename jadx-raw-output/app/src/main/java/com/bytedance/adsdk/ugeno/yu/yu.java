package com.bytedance.adsdk.ugeno.yu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class yu {
    private static Map<String, vt> ouw = new HashMap();

    public static void ouw(List<vt> list) {
        if (list.size() <= 0) {
            return;
        }
        for (vt vtVar : list) {
            if (vtVar != null) {
                ouw.put(vtVar.ouw, vtVar);
            }
        }
    }

    public static vt ouw(String str) {
        return ouw.get(str);
    }
}
