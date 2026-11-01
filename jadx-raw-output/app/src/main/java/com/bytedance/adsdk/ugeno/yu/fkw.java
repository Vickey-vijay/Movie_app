package com.bytedance.adsdk.ugeno.yu;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fkw implements lh {
    @Override // com.bytedance.adsdk.ugeno.yu.lh
    public final List<vt> ouw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vt("update") { // from class: com.bytedance.adsdk.ugeno.yu.fkw.1
            @Override // com.bytedance.adsdk.ugeno.yu.vt
            public final com.bytedance.adsdk.ugeno.yu.vt.ouw ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
                return new com.bytedance.adsdk.ugeno.yu.vt.fkw(lhVar, str, ouwVar);
            }
        });
        arrayList.add(new vt("emit") { // from class: com.bytedance.adsdk.ugeno.yu.fkw.2
            @Override // com.bytedance.adsdk.ugeno.yu.vt
            public final com.bytedance.adsdk.ugeno.yu.vt.ouw ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
                return new com.bytedance.adsdk.ugeno.yu.vt.vt(lhVar, str, ouwVar);
            }
        });
        arrayList.add(new vt("startAnimate") { // from class: com.bytedance.adsdk.ugeno.yu.fkw.3
            @Override // com.bytedance.adsdk.ugeno.yu.vt
            public final com.bytedance.adsdk.ugeno.yu.vt.ouw ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
                return new com.bytedance.adsdk.ugeno.yu.vt.yu(lhVar, str, ouwVar);
            }
        });
        return arrayList;
    }
}
