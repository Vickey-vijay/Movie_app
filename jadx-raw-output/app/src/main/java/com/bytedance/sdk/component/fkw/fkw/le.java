package com.bytedance.sdk.component.fkw.fkw;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class le extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        byte[] bArrOuw;
        String str = lhVar.f11678lh;
        lhVar.jqy.vt(lhVar.f11683tc);
        Collection<com.bytedance.sdk.component.fkw.lh> collectionOuw = lhVar.jqy.ouw();
        if (collectionOuw == null) {
            bArrOuw = null;
            break;
        }
        Iterator<com.bytedance.sdk.component.fkw.lh> it = collectionOuw.iterator();
        do {
            if (!it.hasNext()) {
                bArrOuw = null;
                break;
            }
            bArrOuw = it.next().ouw(str);
        } while (bArrOuw == null);
        if (bArrOuw == null) {
            lhVar.ouw(new cf());
        } else {
            lhVar.ouw(new vt(bArrOuw, null));
            lhVar.jqy.ouw(lhVar.f11683tc).ouw(str, bArrOuw);
        }
    }
}
