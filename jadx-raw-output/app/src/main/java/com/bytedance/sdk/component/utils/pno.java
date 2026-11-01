package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class pno {
    public static HandlerThread ouw;

    public static HandlerThread ouw(String str, int i10) {
        if (com.bytedance.sdk.component.pno.bly.yu) {
            return ouw;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i10) { // from class: com.bytedance.sdk.component.utils.pno.1
                public boolean ouw = false;

                @Override // java.lang.Thread
                public final synchronized void start() {
                    if (this.ouw) {
                        return;
                    }
                    this.ouw = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th2) {
            qbp.ouw("HandlerThreadUtils", "new handlerThread error", th2);
            return ouw;
        }
    }
}
