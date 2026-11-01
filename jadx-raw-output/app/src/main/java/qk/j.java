package qk;

import kotlinx.coroutines.flow.DistinctFlowImpl;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bk.l<Object, Object> f66586a = new bk.l() { // from class: qk.h
        @Override // bk.l
        public final Object invoke(Object obj) {
            return j.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<Object, Object, Boolean> f66587b = new bk.p() { // from class: qk.i
        @Override // bk.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo1invoke(Object obj, Object obj2) {
            return Boolean.valueOf(j.c(obj, obj2));
        }
    };

    public static final Object d(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> c<T> e(c<? extends T> cVar) {
        return cVar instanceof u ? cVar : f(cVar, f66586a, f66587b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> c<T> f(c<? extends T> cVar, bk.l<? super T, ? extends Object> lVar, bk.p<Object, Object, Boolean> pVar) {
        if (cVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) cVar;
            if (distinctFlowImpl.f63087c == lVar && distinctFlowImpl.f63088d == pVar) {
                return cVar;
            }
        }
        return new DistinctFlowImpl(cVar, lVar, pVar);
    }

    public static final boolean c(Object obj, Object obj2) {
        return ck.p.e(obj, obj2);
    }
}
