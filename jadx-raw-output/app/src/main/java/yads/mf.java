package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes10.dex */
public final class mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f80165a;

    /* JADX WARN: Code duplicated, block: B:24:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0009 A[SYNTHETIC] */
    public final ArrayList a(ArrayList arrayList) {
        nb2 nb2Var;
        StackTraceElement[] stackTraceElementArr;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lf lfVar = (lf) it.next();
            try {
                mj.g gVar = sf.f82626a;
                LinkedHashMap linkedHashMapA = sf.a(lfVar.f79767c);
                Thread thread = (Thread) nj.b0.g0(linkedHashMapA.keySet());
                if (thread != null && (stackTraceElementArr = (StackTraceElement[]) linkedHashMapA.get(thread)) != null) {
                    Set set = h33.f78052a;
                    nb2Var = h33.a(stackTraceElementArr, this.f80165a) ? new nb2(lfVar, linkedHashMapA) : null;
                    if (nb2Var != null) {
                        arrayList2.add(nb2Var);
                    }
                }
            } catch (Throwable unused) {
            }
            if (nb2Var != null) {
                arrayList2.add(nb2Var);
            }
        }
        return arrayList2;
    }

    public mf(Set set) {
        this.f80165a = set;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            for (String str : SequencesKt___SequencesKt.Q(lk.a0.t0(((lf) obj).f79767c), 50)) {
                if (lk.x.R(lk.a0.k1(str).toString(), "at ", false, 2, null)) {
                    Set set = h33.f78052a;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (lk.a0.X(str, (String) it.next(), false, 2, null)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
