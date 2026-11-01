package com.fyber.inneractive.sdk.ignite;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public enum m {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP("st"),
    NONE("none");

    private static final Map<String, m> CONSTANTS = new HashMap();
    private final String value;

    public final String a() {
        return this.value;
    }

    static {
        for (m mVar : values()) {
            CONSTANTS.put(mVar.value, mVar);
        }
    }

    public static m a(String str) {
        return CONSTANTS.get(str);
    }

    m(String str) {
        this.value = str;
    }
}
