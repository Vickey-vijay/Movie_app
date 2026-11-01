package com.bytedance.sdk.component.fkw.fkw;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ra extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        List<com.bytedance.sdk.component.fkw.lh.lh> linkedList;
        String strRa = lhVar.ra();
        Map<String, List<com.bytedance.sdk.component.fkw.lh.lh>> map = lhVar.jqy.ouw;
        synchronized (map) {
            linkedList = map.get(strRa);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
        }
        synchronized (linkedList) {
            linkedList.add(lhVar);
            map.put(strRa, linkedList);
            if (linkedList.size() <= 1) {
                lhVar.ouw(new yu());
            }
        }
    }
}
