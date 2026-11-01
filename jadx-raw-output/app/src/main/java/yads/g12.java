package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz1 f77585a;

    public /* synthetic */ g12() {
        this(new pz1());
    }

    public static ArrayList b(d12 d12Var) {
        List list = d12Var.f76509a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((fy1) it.next()).f77547c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List a(d12 d12Var) {
        List<fy1> list = d12Var.f76509a;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        for (fy1 fy1Var : list) {
            kj kjVar = this.f77585a.f81660a;
            List list2 = fy1Var.f77546b;
            kjVar.getClass();
            Set setA = kj.a(list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = setA.iterator();
            while (it.hasNext()) {
                String str = ((u41) it.next()).f83369d;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            arrayList.add(nj.b0.O0(arrayList3));
        }
        return nj.t.x(arrayList);
    }

    public g12(pz1 pz1Var) {
        this.f77585a = pz1Var;
    }
}
