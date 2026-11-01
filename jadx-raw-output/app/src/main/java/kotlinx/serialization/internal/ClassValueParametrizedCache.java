package kotlinx.serialization.internal;

import ak.a;
import bk.p;
import bl.d1;
import bl.k1;
import bl.l1;
import bl.r0;
import bl.s;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jk.c;
import jk.n;
import kotlin.Result;
import nj.t;
import xk.b;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ClassValueParametrizedCache<T> implements l1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<c<Object>, List<? extends n>, b<T>> f63252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s<k1<T>> f63253b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueParametrizedCache(p<? super c<Object>, ? super List<? extends n>, ? extends b<T>> pVar) {
        ck.p.j(pVar, "compute");
        this.f63252a = pVar;
        this.f63253b = new s<>();
    }

    @Override // bl.l1
    public Object a(c<Object> cVar, List<? extends n> list) {
        Object objM3458constructorimpl;
        ck.p.j(cVar, C3426d4.i.W);
        ck.p.j(list, "types");
        k1<T> k1Var = this.f63253b.get(a.a(cVar));
        ck.p.i(k1Var, "get(key)");
        d1 d1Var = (d1) k1Var;
        T t10 = d1Var.f5396a.get();
        if (t10 == null) {
            t10 = (T) d1Var.a(new bk.a<T>() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
                @Override // bk.a
                public final T invoke() {
                    return (T) new k1();
                }
            });
        }
        k1 k1Var2 = t10;
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new r0((n) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = k1Var2.f5431a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(this.f63252a.mo1invoke(cVar, list));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            Result resultM3457boximpl = Result.m3457boximpl(objM3458constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultM3457boximpl);
            obj = objPutIfAbsent == null ? resultM3457boximpl : objPutIfAbsent;
        }
        ck.p.i(obj, "serializers.getOrPut(wra… { producer() }\n        }");
        return ((Result) obj).m3466unboximpl();
    }
}
