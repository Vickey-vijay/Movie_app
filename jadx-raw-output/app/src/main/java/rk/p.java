package rk;

import kotlinx.coroutines.flow.internal.SafeCollector;
import sk.z;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class p {
    public static final void b(final SafeCollector<?> safeCollector, kotlin.coroutines.d dVar) {
        if (((Number) dVar.fold(0, new bk.p() { // from class: rk.o
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return Integer.valueOf(p.c(safeCollector, ((Integer) obj).intValue(), (kotlin.coroutines.d.b) obj2));
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + dVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final kotlinx.coroutines.g d(kotlinx.coroutines.g gVar, kotlinx.coroutines.g gVar2) {
        while (gVar != null) {
            if (gVar == gVar2) {
                return gVar;
            }
            if (!(gVar instanceof z)) {
                return gVar;
            }
            gVar = ((z) gVar).r0();
        }
        return null;
    }

    public static final int c(SafeCollector safeCollector, int i10, kotlin.coroutines.d.b bVar) {
        kotlin.coroutines.d.c<?> key = bVar.getKey();
        kotlin.coroutines.d.b bVar2 = safeCollector.collectContext.get(key);
        if (key != kotlinx.coroutines.g.E8) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) bVar2;
        ck.p.h(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        kotlinx.coroutines.g gVarD = d((kotlinx.coroutines.g) bVar, gVar);
        if (gVarD == gVar) {
            if (gVar != null) {
                return i10 + 1;
            }
            return i10;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + gVarD + ", expected child of " + gVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
