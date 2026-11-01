package com.bytedance.adsdk.ugeno.yu.vt;

import com.bytedance.adsdk.ugeno.yu.le;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class vt extends ouw {
    private List<com.bytedance.adsdk.ugeno.yu.ouw.yu> bly;

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        com.bytedance.adsdk.ugeno.yu.ouw.lh lhVarOuw;
        Map<String, String> map = this.f11057le;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f11057le.get("name");
        com.bytedance.adsdk.ugeno.yu.ouw.ouw ouwVar = this.f11058lh.lgp;
        if (ouwVar == null || (lhVarOuw = ouwVar.ouw(str)) == null) {
            return;
        }
        lhVarOuw.ouw();
    }

    public vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
        this.bly = new CopyOnWriteArrayList();
    }
}
