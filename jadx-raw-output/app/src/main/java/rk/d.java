package rk;

import ck.x;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector;
import sk.k0;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static /* synthetic */ Object c(kotlin.coroutines.d dVar, Object obj, Object obj2, bk.p pVar, rj.c cVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = k0.g(dVar);
        }
        return b(dVar, obj, obj2, pVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> qk.d<T> d(qk.d<? super T> dVar, kotlin.coroutines.d dVar2) {
        return ((dVar instanceof q) || (dVar instanceof l)) ? dVar : new UndispatchedContextCollector(dVar, dVar2);
    }

    public static final <T, V> Object b(kotlin.coroutines.d dVar, V v10, Object obj, bk.p<? super V, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        Object objMo1invoke;
        Object objI = k0.i(dVar, obj);
        try {
            r rVar = new r(cVar, dVar);
            if (!(pVar instanceof BaseContinuationImpl)) {
                objMo1invoke = IntrinsicsKt__IntrinsicsJvmKt.d(pVar, v10, rVar);
            } else {
                objMo1invoke = ((bk.p) x.e(pVar, 2)).mo1invoke(v10, rVar);
            }
            k0.f(dVar, objI);
            if (objMo1invoke == sj.a.f()) {
                tj.f.c(cVar);
            }
            return objMo1invoke;
        } catch (Throwable th2) {
            k0.f(dVar, objI);
            throw th2;
        }
    }
}
