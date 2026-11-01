package com.bytedance.sdk.component.fkw.yu.lh;

import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;
import com.ironsource.C3426d4;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ouw<T> {
    private lh ouw;
    private th vt;

    public final void ouw(cf<T> cfVar) {
        try {
            th thVar = this.vt;
            if (thVar != null) {
                thVar.ouw("success", this.ouw);
            }
            String strRa = this.ouw.ra();
            Map<String, List<lh>> map = this.ouw.qbp.ouw;
            List<lh> list = map.get(strRa);
            if (list == null) {
                rn rnVar = this.ouw.yu;
                if (rnVar != null) {
                    ko.vt("PagImageRequest", "not repeat request listener is " + rnVar + " key is " + this.ouw.vt);
                    rnVar.ouw(cfVar);
                }
            } else {
                synchronized (list) {
                    ko.vt("PagImageRequest", "repeat request listener is " + list.size());
                    for (lh lhVar : list) {
                        rn rnVar2 = lhVar.yu;
                        if (rnVar2 != null) {
                            ko.vt("PagImageRequest", "repeat request listener is " + rnVar2 + " key is " + lhVar.vt);
                            rnVar2.ouw(cfVar);
                        }
                    }
                    list.clear();
                    map.remove(strRa);
                }
            }
            th thVar2 = this.vt;
            if (thVar2 != null) {
                thVar2.ouw("success");
            }
        } catch (Throwable unused) {
        }
    }

    public ouw(lh lhVar, th thVar) {
        this.ouw = lhVar;
        this.vt = thVar;
    }

    public final void ouw(int i10, String str, Throwable th2) {
        try {
            th thVar = this.vt;
            if (thVar != null) {
                thVar.ouw(C3426d4.i.f28566t, this.ouw);
            }
            String strRa = this.ouw.ra();
            Map<String, List<lh>> map = this.ouw.qbp.ouw;
            List<lh> list = map.get(strRa);
            if (list == null) {
                rn rnVar = this.ouw.yu;
                if (rnVar != null) {
                    rnVar.ouw(i10, str, th2);
                }
            } else {
                synchronized (list) {
                    Iterator<lh> it = list.iterator();
                    while (it.hasNext()) {
                        rn rnVar2 = it.next().yu;
                        if (rnVar2 != null) {
                            ko.vt("PagImageRequest", "repeat request listener is ".concat(String.valueOf(rnVar2)));
                            rnVar2.ouw(i10, str, th2);
                        }
                    }
                    list.clear();
                    map.remove(strRa);
                }
            }
            th thVar2 = this.vt;
            if (thVar2 != null) {
                thVar2.ouw(C3426d4.i.f28566t);
            }
        } catch (Throwable unused) {
        }
    }
}
