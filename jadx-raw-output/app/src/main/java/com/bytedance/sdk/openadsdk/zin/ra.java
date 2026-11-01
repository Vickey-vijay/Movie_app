package com.bytedance.sdk.openadsdk.zin;

/* JADX INFO: loaded from: classes8.dex */
public final class ra {
    public static ouw ouw;

    public interface ouw {
        void ouw(String str, String str2);

        void ouw(String str, String str2, Throwable th2);
    }

    public static boolean ouw() {
        return ouw != null;
    }

    public static void ouw(String str, String str2) {
        ouw ouwVar = ouw;
        if (ouwVar == null) {
            return;
        }
        ouwVar.ouw(str, str2);
    }

    public static void ouw(String str, String str2, Throwable th2) {
        ouw ouwVar = ouw;
        if (ouwVar == null) {
            return;
        }
        ouwVar.ouw(str, str2, th2);
    }
}
