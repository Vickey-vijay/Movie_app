package com.bytedance.adsdk.ugeno.yu;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ouw implements pno {
    @Override // com.bytedance.adsdk.ugeno.yu.pno
    public final List<ra> ouw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra("slide") { // from class: com.bytedance.adsdk.ugeno.yu.ouw.1
            @Override // com.bytedance.adsdk.ugeno.yu.ra
            public final com.bytedance.adsdk.ugeno.yu.yu.lh ouw(Context context) {
                return new com.bytedance.adsdk.ugeno.yu.yu.fkw(context);
            }
        });
        arrayList.add(new ra("tap") { // from class: com.bytedance.adsdk.ugeno.yu.ouw.2
            @Override // com.bytedance.adsdk.ugeno.yu.ra
            public final com.bytedance.adsdk.ugeno.yu.yu.lh ouw(Context context) {
                return new com.bytedance.adsdk.ugeno.yu.yu.bly(context);
            }
        });
        arrayList.add(new ra("timer") { // from class: com.bytedance.adsdk.ugeno.yu.ouw.3
            @Override // com.bytedance.adsdk.ugeno.yu.ra
            public final com.bytedance.adsdk.ugeno.yu.yu.lh ouw(Context context) {
                return new com.bytedance.adsdk.ugeno.yu.yu.tlj(context);
            }
        });
        arrayList.add(new ra("touchStart") { // from class: com.bytedance.adsdk.ugeno.yu.ouw.4
            @Override // com.bytedance.adsdk.ugeno.yu.ra
            public final com.bytedance.adsdk.ugeno.yu.yu.lh ouw(Context context) {
                return new com.bytedance.adsdk.ugeno.yu.yu.ryl(context);
            }
        });
        arrayList.add(new ra("touchEnd") { // from class: com.bytedance.adsdk.ugeno.yu.ouw.5
            @Override // com.bytedance.adsdk.ugeno.yu.ra
            public final com.bytedance.adsdk.ugeno.yu.yu.lh ouw(Context context) {
                return new com.bytedance.adsdk.ugeno.yu.yu.cf(context);
            }
        });
        arrayList.add(new ra("animateState") { // from class: com.bytedance.adsdk.ugeno.yu.ouw.6
            @Override // com.bytedance.adsdk.ugeno.yu.ra
            public final com.bytedance.adsdk.ugeno.yu.yu.lh ouw(Context context) {
                return new com.bytedance.adsdk.ugeno.yu.yu.vt(context);
            }
        });
        return arrayList;
    }
}
