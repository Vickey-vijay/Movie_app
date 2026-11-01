package yads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class cc0 {
    public static HashMap a(String str) {
        int[] iArrA = dc0.a(str);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        sm2 sm2Var = dc0.f76611n;
        map.put(2, (Long) sm2Var.get(iArrA[0]));
        map.put(3, (Long) dc0.f76612o.get(iArrA[1]));
        map.put(4, (Long) dc0.f76613p.get(iArrA[2]));
        map.put(5, (Long) dc0.f76614q.get(iArrA[3]));
        map.put(10, (Long) dc0.f76615r.get(iArrA[4]));
        map.put(9, (Long) dc0.f76616s.get(iArrA[5]));
        map.put(7, (Long) sm2Var.get(iArrA[0]));
        return map;
    }
}
