package com.bytedance.adsdk.ugeno.yu.ouw;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class vt implements lh {
    private List<yu> ouw = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.yu.ouw.lh
    public final void ouw(yu yuVar) {
        this.ouw.add(yuVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.ouw.lh
    public final void ouw() {
        if (this.ouw.isEmpty()) {
            return;
        }
        Iterator<yu> it = this.ouw.iterator();
        while (it.hasNext()) {
            it.next().ouw();
        }
    }
}
