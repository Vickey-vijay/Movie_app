package com.bytedance.adsdk.ouw.vt.yu;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public enum ouw implements fkw {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, ouw> yu = new HashMap(128);

    static {
        for (ouw ouwVar : values()) {
            yu.put(ouwVar.name().toLowerCase(), ouwVar);
        }
    }

    public static ouw ouw(String str) {
        return yu.get(str.toLowerCase());
    }
}
