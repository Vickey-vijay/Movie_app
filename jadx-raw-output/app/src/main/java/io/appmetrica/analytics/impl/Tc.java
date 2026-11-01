package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55920a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f55920a;
        ArrayList arrayList3 = new ArrayList(nj.t.v(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Sc) it.next()).a());
        }
        arrayList = new ArrayList();
        for (Object obj : arrayList3) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return nj.b0.W(arrayList);
    }

    public final synchronized void a(Sc... scArr) {
        nj.x.D(this.f55920a, scArr);
    }
}
