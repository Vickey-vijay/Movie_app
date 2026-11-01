package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f83486a;

    public ui(List list, x3 x3Var, l12 l12Var, kn2 kn2Var, x51 x51Var, if1 if1Var) {
        if1 if1Var2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            String strB = oiVar.b();
            if1 if1VarA = oiVar.a();
            if (if1VarA == null) {
                if1Var2 = if1Var;
            } else {
                if1Var2 = if1VarA;
            }
            Pair pairA = mj.h.a(strB, iv.a(x51Var, kn2Var, x3Var, l12Var, oiVar, if1Var2));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        this.f83486a = linkedHashMap;
    }
}
