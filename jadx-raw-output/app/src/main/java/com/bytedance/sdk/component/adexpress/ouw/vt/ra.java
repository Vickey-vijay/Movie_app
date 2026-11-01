package com.bytedance.sdk.component.adexpress.ouw.vt;

/* JADX INFO: loaded from: classes5.dex */
public final class ra {
    public static com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouw;

    public static synchronized com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouw() {
        return ouw;
    }

    public static synchronized void ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar) {
        if (ouwVar != null) {
            if (ouwVar.vt()) {
                ouw = ouwVar;
            }
        }
    }

    public static void vt() {
        lh.vt(yu.le(), ouw(), "temp_pkg_info.json");
        ouw = null;
    }
}
