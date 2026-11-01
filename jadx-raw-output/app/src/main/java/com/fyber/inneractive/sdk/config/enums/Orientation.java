package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public enum Orientation {
    LANDSCAPE(C3426d4.i.C, false),
    PORTRAIT(C3426d4.i.D, false),
    USER("user", true),
    NONE("none", true);

    private static final Map<String, Orientation> CONSTANTS = new HashMap();
    public boolean allowOrientationChange;
    private final String value;

    static {
        for (Orientation orientation : values()) {
            CONSTANTS.put(orientation.value, orientation);
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    Orientation(String str, boolean z10) {
        this.value = str;
        this.allowOrientationChange = z10;
    }

    public static Orientation fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }
}
