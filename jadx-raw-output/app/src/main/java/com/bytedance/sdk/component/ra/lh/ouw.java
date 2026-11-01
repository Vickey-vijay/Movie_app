package com.bytedance.sdk.component.ra.lh;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {
    /* JADX WARN: Code duplicated, block: B:7:0x001f A[PHI: r0
  0x001f: PHI (r0v1 java.lang.String) = (r0v0 java.lang.String), (r0v3 java.lang.String) binds: [B:3:0x000c, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean ouw(Map<String, String> map) {
        String str;
        String str2 = "content-type";
        if (TextUtils.isEmpty(map.get("content-type"))) {
            str2 = "Content-Type";
            if (TextUtils.isEmpty(map.get("Content-Type"))) {
                str = "";
            } else {
                str = map.get(str2);
            }
        } else {
            str = map.get(str2);
        }
        return str.contains("application/octet-stream");
    }
}
