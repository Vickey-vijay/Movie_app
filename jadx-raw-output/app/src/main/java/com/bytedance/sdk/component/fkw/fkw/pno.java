package com.bytedance.sdk.component.fkw.fkw;

import com.bytedance.sdk.component.fkw.rn;
import com.ironsource.C3426d4;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class pno extends ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f11663lh;
    private Throwable ouw;
    private int vt;

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return C3426d4.i.f28566t;
    }

    private void vt(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        rn rnVar = lhVar.yu;
        if (rnVar != null) {
            rnVar.ouw(this.vt, this.f11663lh, this.ouw);
        }
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        lhVar.ex = new com.bytedance.sdk.component.fkw.lh.ouw(this.vt, this.f11663lh, this.ouw);
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

    public pno(int i10, String str, Throwable th2) {
        this.vt = i10;
        this.f11663lh = str;
        this.ouw = th2;
    }
}
