package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class or1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f81135a;

    public final ArrayList a(List list) {
        com.monetization.ads.mediation.base.a aVar;
        ar1 ar1Var;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pq1 pq1Var = (pq1) it.next();
            List<oq1> list2 = pq1Var.f81541c;
            ArrayList arrayList2 = new ArrayList(nj.t.v(list2, 10));
            for (oq1 oq1Var : list2) {
                try {
                    aVar = (com.monetization.ads.mediation.base.a) om2.a(oq1Var.f81127b, new Object[0]);
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    ar1Var = new ar1(oq1Var.f81126a, null, false);
                } else {
                    fo1 fo1Var = new fo1(aVar);
                    if (this.f81135a == null) {
                        this.f81135a = fo1Var.b().getNetworkSdkVersion();
                    }
                    ar1Var = new ar1(oq1Var.f81126a, fo1Var.b().getAdapterVersion(), true);
                }
                arrayList2.add(ar1Var);
            }
            String str = this.f81135a;
            this.f81135a = null;
            arrayList.add(new br1(pq1Var.f81539a, pq1Var.f81540b.f78331b, str, arrayList2));
        }
        return arrayList;
    }
}
