package com.bytedance.sdk.openadsdk.rn.vt;

import com.bytedance.sdk.component.pno.lh;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.rn.vt;

/* JADX INFO: loaded from: classes6.dex */
public final class ouw implements lh {
    @Override // com.bytedance.sdk.component.pno.lh
    public final void ouw(final com.bytedance.sdk.component.pno.vt.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw();
        com.bytedance.sdk.openadsdk.rn.lh.ouw("stats_sdk_thread_num", false, new vt() { // from class: com.bytedance.sdk.openadsdk.rn.vt.ouw.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                com.bytedance.sdk.component.pno.vt.ouw ouwVar2;
                if (!zih.yu().jae() || (ouwVar2 = ouwVar) == null) {
                    return null;
                }
                ouwVar2.ouw();
                yu yuVar = new yu();
                yuVar.ouw = "stats_sdk_thread_num";
                yuVar.bly = ouwVar.ouw().toString();
                return yuVar;
            }
        });
    }
}
