package bl;

import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w<T> implements l1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.p<jk.c<Object>, List<? extends jk.n>, xk.b<T>> f5477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, k1<T>> f5478b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(bk.p<? super jk.c<Object>, ? super List<? extends jk.n>, ? extends xk.b<T>> pVar) {
        ck.p.j(pVar, "compute");
        this.f5477a = pVar;
        this.f5478b = new ConcurrentHashMap<>();
    }

    @Override // bl.l1
    public Object a(jk.c<Object> cVar, List<? extends jk.n> list) {
        Object objM3458constructorimpl;
        k1<T> k1VarPutIfAbsent;
        ck.p.j(cVar, C3426d4.i.W);
        ck.p.j(list, "types");
        ConcurrentHashMap<Class<?>, k1<T>> concurrentHashMap = this.f5478b;
        Class<?> clsA = ak.a.a(cVar);
        k1<T> k1Var = concurrentHashMap.get(clsA);
        if (k1Var == null && (k1VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (k1Var = new k1<>()))) != null) {
            k1Var = k1VarPutIfAbsent;
        }
        k1<T> k1Var2 = k1Var;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new r0((jk.n) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = k1Var2.f5431a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(this.f5477a.mo1invoke(cVar, list));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            Result resultM3457boximpl = Result.m3457boximpl(objM3458constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, resultM3457boximpl);
            obj = objPutIfAbsent == null ? resultM3457boximpl : objPutIfAbsent;
        }
        ck.p.i(obj, "serializers.getOrPut(wra… { producer() }\n        }");
        return ((Result) obj).m3466unboximpl();
    }
}
