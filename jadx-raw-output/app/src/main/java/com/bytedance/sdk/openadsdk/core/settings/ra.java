package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.qbp;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class ra {
    private static final AtomicInteger ouw = new AtomicInteger(1);

    public static boolean ouw() {
        return ouw.get() == 1;
    }

    public static void ouw(int i10) {
        boolean z10 = true;
        if (i10 == 1 || i10 == 2) {
            try {
                AtomicInteger atomicInteger = ouw;
                if (atomicInteger.get() != i10) {
                    try {
                        atomicInteger.set(i10);
                    } catch (Throwable th2) {
                        th = th2;
                        qbp.lh("SdkSwitch", th.getMessage());
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            if (z10) {
                Log.e("SdkSwitch", "switch status changed: " + ouw());
                if (ouw()) {
                    com.bytedance.sdk.openadsdk.yu.ouw.vt.vt();
                } else {
                    com.bytedance.sdk.openadsdk.yu.ouw.vt.lh();
                }
            }
        }
    }
}
