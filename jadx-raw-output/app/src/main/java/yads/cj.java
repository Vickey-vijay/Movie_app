package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f76286a;

    public cj(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Pair pairA = mj.h.a(oiVar.b(), oiVar.c());
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        this.f76286a = linkedHashMap;
    }
}
