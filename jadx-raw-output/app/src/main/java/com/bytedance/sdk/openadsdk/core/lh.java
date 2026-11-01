package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes2.dex */
public class lh {
    private static volatile lh ouw;

    public static lh ouw() {
        if (ouw == null) {
            synchronized (lh.class) {
                if (ouw == null) {
                    ouw = new lh();
                }
            }
        }
        return ouw;
    }

    public static String vt(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("ttopenadsdk", str, str2);
    }

    public static int vt(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, i10);
    }

    private lh() {
    }

    public static void ouw(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, str2);
    }

    public static void ouw(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public static void ouw(String str, long j10) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, Long.valueOf(j10));
    }

    public static Long ouw(String str) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, 0L));
    }
}
