package sk;

import nk.k2;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f71955a = new d0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<Object, kotlin.coroutines.d.b, Object> f71956b = new bk.p() { // from class: sk.h0
        @Override // bk.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo1invoke(Object obj, Object obj2) {
            return k0.d(obj, (kotlin.coroutines.d.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<k2<?>, kotlin.coroutines.d.b, k2<?>> f71957c = new bk.p() { // from class: sk.i0
        @Override // bk.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo1invoke(Object obj, Object obj2) {
            return k0.e((k2) obj, (kotlin.coroutines.d.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<o0, kotlin.coroutines.d.b, o0> f71958d = new bk.p() { // from class: sk.j0
        @Override // bk.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo1invoke(Object obj, Object obj2) {
            return k0.h((o0) obj, (kotlin.coroutines.d.b) obj2);
        }
    };

    public static final Object g(kotlin.coroutines.d dVar) {
        Object objFold = dVar.fold(0, f71956b);
        ck.p.g(objFold);
        return objFold;
    }

    public static final Object d(Object obj, kotlin.coroutines.d.b bVar) {
        if (!(bVar instanceof k2)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    public static final k2<?> e(k2<?> k2Var, kotlin.coroutines.d.b bVar) {
        if (k2Var != null) {
            return k2Var;
        }
        if (bVar instanceof k2) {
            return (k2) bVar;
        }
        return null;
    }

    public static final void f(kotlin.coroutines.d dVar, Object obj) {
        if (obj == f71955a) {
            return;
        }
        if (obj instanceof o0) {
            ((o0) obj).b(dVar);
            return;
        }
        Object objFold = dVar.fold(null, f71957c);
        ck.p.h(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((k2) objFold).f(dVar, obj);
    }

    public static final o0 h(o0 o0Var, kotlin.coroutines.d.b bVar) {
        if (bVar instanceof k2) {
            k2<?> k2Var = (k2) bVar;
            o0Var.a(k2Var, k2Var.O(o0Var.f71971a));
        }
        return o0Var;
    }

    public static final Object i(kotlin.coroutines.d dVar, Object obj) {
        if (obj == null) {
            obj = g(dVar);
        }
        if (obj == 0) {
            return f71955a;
        }
        if (obj instanceof Integer) {
            return dVar.fold(new o0(dVar, ((Number) obj).intValue()), f71958d);
        }
        ck.p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((k2) obj).O(dVar);
    }
}
