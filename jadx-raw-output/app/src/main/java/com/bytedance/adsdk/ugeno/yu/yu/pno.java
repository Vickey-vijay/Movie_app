package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pno extends lh {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11071cf;
    private int mwh;
    private int ryl;

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[0]), -1);
            int iOuw2 = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[1]), -1);
            int iOuw3 = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[2]), -1);
            Map<String, String> map = this.fkw;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                map2.put("fromIndex", Integer.valueOf(iOuw));
                map2.put("toIndex", Integer.valueOf(iOuw2));
                map2.put("type", Integer.valueOf(iOuw3));
                Iterator<com.bytedance.adsdk.ugeno.yu.le.ouw> it = this.f11069lh.vt.iterator();
                while (it.hasNext()) {
                    it.next().f11055le = map2;
                }
                this.ouw.ouw(this.f11068le, this.f11069lh.vt);
            } else {
                this.f11071cf = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("fromIndex"), -1);
                this.ryl = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("toIndex"), -1);
                int iOuw4 = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("type"), -1);
                this.mwh = iOuw4;
                if (iOuw == this.f11071cf && iOuw2 == this.ryl && iOuw3 == iOuw4) {
                    this.ouw.ouw(this.f11068le, this.f11069lh.vt);
                }
            }
        }
        return false;
    }

    public pno(Context context) {
        super(context);
        this.f11071cf = -1;
        this.ryl = -1;
        this.mwh = -1;
    }
}
