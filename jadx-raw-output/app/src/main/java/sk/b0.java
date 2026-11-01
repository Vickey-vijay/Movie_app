package sk;

import sk.a0;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b0<S extends a0<S>> {
    public static <S extends a0<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        if (obj != a.f71934a) {
            ck.p.h(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        if (obj == a.f71934a) {
            return true;
        }
        return false;
    }
}
