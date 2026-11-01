package com.bytedance.sdk.component.fkw.fkw;

import com.bytedance.sdk.component.fkw.rn;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mwh<T> extends ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f11662lh;
    private T ouw;
    private com.bytedance.sdk.component.fkw.le vt;

    private Map<String, String> vt() {
        com.bytedance.sdk.component.fkw.le leVar = this.vt;
        if (leVar != null) {
            return leVar.fkw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "success";
    }

    public mwh(T t10, com.bytedance.sdk.component.fkw.le leVar, boolean z10) {
        this.ouw = t10;
        this.vt = leVar;
        this.f11662lh = z10;
    }

    private void vt(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        rn rnVar = lhVar.yu;
        if (rnVar != null) {
            rnVar.ouw(new com.bytedance.sdk.component.fkw.lh.yu().ouw(lhVar, this.ouw, vt(), this.f11662lh));
        }
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        String strRa = lhVar.ra();
        Map<String, List<com.bytedance.sdk.component.fkw.lh.lh>> map = lhVar.jqy.ouw;
        List<com.bytedance.sdk.component.fkw.lh.lh> list = map.get(strRa);
        if (list == null) {
            vt(lhVar);
            return;
        }
        synchronized (list) {
            Iterator<com.bytedance.sdk.component.fkw.lh.lh> it = list.iterator();
            while (it.hasNext()) {
                vt(it.next());
            }
            list.clear();
            map.remove(strRa);
        }
    }
}
