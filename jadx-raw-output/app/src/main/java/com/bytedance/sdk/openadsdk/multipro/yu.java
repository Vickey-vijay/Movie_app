package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.zih;

/* JADX INFO: loaded from: classes3.dex */
public final class yu {
    public static String ouw = "com.bytedance.openadsdk";
    public static String vt;

    static {
        vt = "content://" + ouw + ".TTMultiProvider";
        if (zih.ouw() != null) {
            ouw = zih.ouw().getPackageName();
            vt = "content://" + ouw + ".TTMultiProvider";
        }
    }
}
