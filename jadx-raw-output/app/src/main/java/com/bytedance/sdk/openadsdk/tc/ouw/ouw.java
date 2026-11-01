package com.bytedance.sdk.openadsdk.tc.ouw;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.pno;

/* JADX INFO: loaded from: classes6.dex */
public class ouw {
    private static Handler ouw;
    private static HandlerThread vt;

    public static Handler ouw() {
        try {
            HandlerThread handlerThread = vt;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (ouw.class) {
                    HandlerThread handlerThread2 = vt;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        vt = pno.ouw("csj_ev", 0);
                        ouw = new Handler(vt.getLooper());
                    }
                }
            } else if (ouw == null) {
                synchronized (ouw.class) {
                    if (ouw == null) {
                        ouw = new Handler(vt.getLooper());
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return ouw;
    }
}
