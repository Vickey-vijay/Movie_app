package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* JADX INFO: loaded from: classes3.dex */
public final class vt {
    public static Boolean ouw;

    public static boolean lh() {
        Boolean bool = ouw;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!jg.fkw()) {
            return false;
        }
        if (ouw == null) {
            ouw = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_info", "is_support_multi_process", false));
        }
        return ouw.booleanValue();
    }

    public static void ouw() {
        Boolean bool = Boolean.TRUE;
        ouw = bool;
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_info", "is_support_multi_process", bool);
    }

    public static void vt() {
        ouw = Boolean.FALSE;
        BinderPoolService.ouw = true;
    }
}
