package com.bytedance.sdk.openadsdk.yu.ouw;

import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;

/* JADX INFO: loaded from: classes11.dex */
final class bly implements com.bytedance.sdk.openadsdk.rn.lh.lh {
    public static final bly ouw = new bly();

    @Override // com.bytedance.sdk.openadsdk.rn.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.rn.vt vtVar) {
        ouw(vtVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.rn.lh.lh
    public final void ouw(final com.bytedance.sdk.openadsdk.rn.vt vtVar, final boolean z10) {
        ouw(new com.bytedance.sdk.component.pno.pno("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.yu.ouw.bly.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.bytedance.sdk.openadsdk.rn.ouw.lh lhVarOuw = vtVar.ouw();
                    if (lhVarOuw == null) {
                        return;
                    }
                    com.bytedance.sdk.component.le.ouw.yu.ouw.ouw ouwVar = new com.bytedance.sdk.component.le.ouw.yu.ouw.ouw(ex.ouw(), lhVarOuw.ouw());
                    ouwVar.yu = (byte) 0;
                    ouwVar.vt = z10 ? (byte) 2 : (byte) 3;
                    ouwVar.ouw = (byte) 1;
                    if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
                        vt.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh());
                    }
                    com.bytedance.sdk.component.le.ouw.vt.ouw(ouwVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private bly() {
    }

    private static void ouw(com.bytedance.sdk.component.pno.pno pnoVar) {
        if (!bs.ra()) {
            bs.vt(pnoVar, 5);
        } else {
            pnoVar.run();
        }
    }
}
