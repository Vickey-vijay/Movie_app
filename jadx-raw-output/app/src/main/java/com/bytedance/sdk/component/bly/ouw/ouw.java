package com.bytedance.sdk.component.bly.ouw;

/* JADX INFO: loaded from: classes10.dex */
public class ouw {
    private static volatile ouw vt;
    public volatile vt ouw;

    private ouw() {
    }

    public static ouw ouw() {
        if (vt == null) {
            synchronized (ouw.class) {
                if (vt == null) {
                    vt = new ouw();
                }
            }
        }
        return vt;
    }
}
