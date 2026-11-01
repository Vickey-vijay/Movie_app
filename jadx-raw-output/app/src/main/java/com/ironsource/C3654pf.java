package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3654pf extends K4 {
    @Override // com.ironsource.G
    public boolean a(A a10, yg ygVar) {
        ck.p.j(a10, C3605n2.f30210p);
        ck.p.j(ygVar, "waterfallInstances");
        return a(ygVar) < b(a10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3654pf(AbstractC3757w0 abstractC3757w0, yg ygVar) {
        super(abstractC3757w0, ygVar);
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(ygVar, "waterfallInstances");
    }

    private final int a(yg ygVar) {
        Integer num;
        List<A> listB = ygVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((A) obj).w()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(b((A) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(b((A) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private final int b(A a10) {
        return a10.h().l();
    }
}
