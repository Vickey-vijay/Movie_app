package com.bytedance.adsdk.ugeno.yu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tlj {
    private static Map<String, ra> ouw = new HashMap();

    public static void ouw(List<ra> list) {
        if (list.size() <= 0) {
            return;
        }
        for (ra raVar : list) {
            if (raVar != null) {
                ouw.put(raVar.vt, raVar);
            }
        }
    }

    public static ra ouw(String str) {
        return ouw.get(str);
    }
}
