package qk;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g {
    public static final <T> c<T> a(c<? extends T> cVar, int i10, BufferOverflow bufferOverflow) {
        int i11;
        BufferOverflow bufferOverflow2;
        boolean z10 = true;
        if (!(i10 >= 0 || i10 == -2 || i10 == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == -1) {
            bufferOverflow2 = BufferOverflow.DROP_OLDEST;
            i11 = 0;
        } else {
            i11 = i10;
            bufferOverflow2 = bufferOverflow;
        }
        return cVar instanceof rk.j ? rk.j.a.a((rk.j) cVar, null, i11, bufferOverflow2, 1, null) : new rk.e(cVar, null, i11, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ c b(c cVar, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return e.c(cVar, i10, bufferOverflow);
    }

    public static final void c(kotlin.coroutines.d dVar) {
        if (dVar.get(kotlinx.coroutines.g.E8) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> c<T> d(c<? extends T> cVar, kotlin.coroutines.d dVar) {
        c(dVar);
        if (!ck.p.e(dVar, EmptyCoroutineContext.INSTANCE)) {
            if (cVar instanceof rk.j) {
                return rk.j.a.a((rk.j) cVar, dVar, 0, null, 6, null);
            }
            return new rk.e(cVar, dVar, 0, null, 12, null);
        }
        return cVar;
    }
}
