package com.bytedance.sdk.component.fkw.yu.vt;

import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class fkw implements le {
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        List<com.bytedance.sdk.component.fkw.yu.lh.lh> copyOnWriteArrayList;
        String strRa = lhVar.ra();
        Map<String, List<com.bytedance.sdk.component.fkw.yu.lh.lh>> map = lhVar.qbp.ouw;
        ko.vt("PagImageRequest", "Step 2 look duplicate Request request image key is " + strRa + " result type is " + lhVar.tlj + " url is " + lhVar.ouw);
        synchronized (map) {
            copyOnWriteArrayList = map.get(strRa);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                map.put(strRa, copyOnWriteArrayList);
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(lhVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            ko.vt("PagImageRequest", "Step 2-1 Hit duplicate request image key is " + strRa + " result type is " + lhVar.tlj + " url is " + lhVar.ouw);
            return false;
        }
    }
}
