package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x02 {
    public static Set a(w02 w02Var, xh0 xh0Var) {
        List listD = w02Var.d();
        if (listD != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                nj.x.C(arrayList, ((gi0) it.next()).f77813g);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                wh0 wh0Var = (wh0) obj;
                if (xh0Var == null || wh0Var.f84211a == xh0Var) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(nj.t.v(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((wh0) it2.next()).f84212b);
            }
            Set setT0 = nj.b0.T0(arrayList3);
            if (setT0 != null) {
                return setT0;
            }
        }
        return nj.q0.f();
    }
}
