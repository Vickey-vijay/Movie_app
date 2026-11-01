package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes2.dex */
public final class vt {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.vpp> ouw;
    private static Boolean vt;

    public static boolean ouw() {
        try {
            if (vt == null) {
                boolean z10 = true;
                if (com.bytedance.sdk.openadsdk.vpp.ouw.ouw("enable_get_ad_new", 0) != 1) {
                    z10 = false;
                }
                vt = Boolean.valueOf(z10);
            }
            return vt.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.vpp vt() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.vpp> softReference = ouw;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return;
        }
        ouw = new SoftReference<>(vppVar);
    }
}
