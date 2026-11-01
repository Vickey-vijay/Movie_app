package com.bytedance.sdk.component.le.ouw.le;

import com.bytedance.sdk.component.le.ouw.pno;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {
    private static volatile vt ouw;

    public static vt ouw() {
        if (ouw == null) {
            synchronized (vt.class) {
                if (ouw == null) {
                    ouw = new lh(pno.vt().ouw, new le(pno.vt().ouw));
                }
            }
        }
        return ouw;
    }
}
