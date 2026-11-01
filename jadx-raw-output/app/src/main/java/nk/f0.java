package nk;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class f0 {
    public static final String g(kotlin.coroutines.d dVar) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.d] */
    public static final kotlin.coroutines.d e(Ref$ObjectRef ref$ObjectRef, boolean z10, kotlin.coroutines.d dVar, kotlin.coroutines.d.b bVar) {
        if (!(bVar instanceof b0)) {
            return dVar.plus(bVar);
        }
        kotlin.coroutines.d.b bVar2 = ((kotlin.coroutines.d) ref$ObjectRef.element).get(bVar.getKey());
        if (bVar2 == null) {
            return dVar.plus(z10 ? ((b0) bVar).m() : (b0) bVar);
        }
        ref$ObjectRef.element = ((kotlin.coroutines.d) ref$ObjectRef.element).minusKey(bVar.getKey());
        return dVar.plus(((b0) bVar).c(bVar2));
    }

    public static final kotlin.coroutines.d f(kotlin.coroutines.d dVar, kotlin.coroutines.d.b bVar) {
        return bVar instanceof b0 ? dVar.plus(((b0) bVar).m()) : dVar.plus(bVar);
    }

    public static final boolean h(kotlin.coroutines.d dVar) {
        return ((Boolean) dVar.fold(Boolean.FALSE, new bk.p() { // from class: nk.e0
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return Boolean.valueOf(f0.i(((Boolean) obj).booleanValue(), (kotlin.coroutines.d.b) obj2));
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z10, kotlin.coroutines.d.b bVar) {
        return z10 || (bVar instanceof b0);
    }

    public static final o2<?> l(tj.c cVar) {
        while (!(cVar instanceof kotlinx.coroutines.e) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof o2) {
                return (o2) cVar;
            }
        }
        return null;
    }

    public static final o2<?> m(rj.c<?> cVar, kotlin.coroutines.d dVar, Object obj) {
        if (!(cVar instanceof tj.c)) {
            return null;
        }
        if (!(dVar.get(p2.f64814b) != null)) {
            return null;
        }
        o2<?> o2VarL = l((tj.c) cVar);
        if (o2VarL != null) {
            o2VarL.l1(dVar, obj);
        }
        return o2VarL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final kotlin.coroutines.d d(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2, final boolean z10) {
        boolean zH = h(dVar);
        boolean zH2 = h(dVar2);
        if (!zH && !zH2) {
            return dVar.plus(dVar2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = dVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        kotlin.coroutines.d dVar3 = (kotlin.coroutines.d) dVar.fold(emptyCoroutineContext, new bk.p() { // from class: nk.c0
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return f0.e(ref$ObjectRef, z10, (kotlin.coroutines.d) obj, (kotlin.coroutines.d.b) obj2);
            }
        });
        if (zH2) {
            ref$ObjectRef.element = ((kotlin.coroutines.d) ref$ObjectRef.element).fold(emptyCoroutineContext, new bk.p() { // from class: nk.d0
                @Override // bk.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo1invoke(Object obj, Object obj2) {
                    return f0.f((kotlin.coroutines.d) obj, (kotlin.coroutines.d.b) obj2);
                }
            });
        }
        return dVar3.plus((kotlin.coroutines.d) ref$ObjectRef.element);
    }

    public static final kotlin.coroutines.d j(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2) {
        if (!h(dVar2)) {
            return dVar.plus(dVar2);
        }
        return d(dVar, dVar2, false);
    }

    public static final kotlin.coroutines.d k(l0 l0Var, kotlin.coroutines.d dVar) {
        kotlin.coroutines.d dVarD = d(l0Var.getCoroutineContext(), dVar, true);
        if (dVarD != w0.a() && dVarD.get(kotlin.coroutines.c.D8) == null) {
            return dVarD.plus(w0.a());
        }
        return dVarD;
    }
}
