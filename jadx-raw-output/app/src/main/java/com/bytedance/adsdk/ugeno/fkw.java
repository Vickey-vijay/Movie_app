package com.bytedance.adsdk.ugeno;

import com.bytedance.adsdk.ugeno.yu.pno;
import com.bytedance.adsdk.ugeno.yu.tlj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fkw {

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static volatile fkw f10847ra;
    public com.bytedance.adsdk.ugeno.core.vt.yu fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.core.ouw.ouw f10848le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ouw f10849lh;
    public List<com.bytedance.adsdk.ugeno.core.vt> ouw;
    public com.bytedance.adsdk.ugeno.core.lh vt;
    public com.bytedance.adsdk.ugeno.lh.ouw yu;

    public static fkw ouw() {
        if (f10847ra == null) {
            synchronized (fkw.class) {
                if (f10847ra == null) {
                    f10847ra = new fkw();
                }
            }
        }
        return f10847ra;
    }

    private fkw() {
    }

    public static void ouw(pno pnoVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.yu.ouw().ouw());
        arrayList.addAll(pnoVar.ouw());
        tlj.ouw(arrayList);
    }

    public static void ouw(com.bytedance.adsdk.ugeno.yu.lh lhVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.yu.fkw().ouw());
        arrayList.addAll(lhVar.ouw());
        com.bytedance.adsdk.ugeno.yu.yu.ouw(arrayList);
    }
}
