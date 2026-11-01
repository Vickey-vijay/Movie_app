package com.bytedance.sdk.openadsdk.rn;

import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.openadsdk.core.tc;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    public static void ouw() {
        if (bs.le()) {
            bs.ouw(new pno("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.rn.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    tc.ouw();
                }
            });
        } else {
            tc.ouw();
        }
    }
}
