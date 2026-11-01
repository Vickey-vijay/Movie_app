package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Qc {
    public static final List a(Rc rc2) {
        ArrayList arrayList;
        ck.p.j(rc2, "<this>");
        C3015ll c3015ll = rc2.f23449a;
        if (c3015ll != null) {
            ArrayList arrayList2 = c3015ll.f24788b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (ck.p.e(((C3257ve) obj).f25569b, "click")) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(nj.t.v(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3257ve) it.next()).f25568a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? nj.s.k() : arrayList;
    }
}
