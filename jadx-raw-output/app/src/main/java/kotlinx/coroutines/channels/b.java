package kotlinx.coroutines.channels;

import bk.l;
import ck.s;
import kotlinx.coroutines.internal.UndeliveredElementException;
import mj.d;
import mj.r;
import rj.c;
import sk.w;

/* JADX INFO: compiled from: ConflatedBufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b<E> extends BufferedChannel<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f63081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final BufferOverflow f63082o;

    public static /* synthetic */ <E> Object o1(b<E> bVar, E e10, c<? super r> cVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionC;
        Object objQ1 = bVar.q1(e10, true);
        if (!(objQ1 instanceof a.C0563a)) {
            return r.f64562a;
        }
        a.e(objQ1);
        l<E, r> lVar = bVar.f63050c;
        if (lVar == null || (undeliveredElementExceptionC = w.c(lVar, e10, null, 2, null)) == null) {
            throw bVar.j0();
        }
        d.a(undeliveredElementExceptionC, bVar.j0());
        throw undeliveredElementExceptionC;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, pk.q
    public Object n(E e10) {
        return q1(e10, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, pk.q
    public Object u(E e10, c<? super r> cVar) {
        return o1(this, e10, cVar);
    }

    public final Object q1(E e10, boolean z10) {
        return this.f63082o == BufferOverflow.DROP_LATEST ? p1(e10, z10) : e1(e10);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean x0() {
        return this.f63082o == BufferOverflow.DROP_OLDEST;
    }

    public b(int i10, BufferOverflow bufferOverflow, l<? super E, r> lVar) {
        boolean z10;
        super(i10, lVar);
        this.f63081n = i10;
        this.f63082o = bufferOverflow;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + s.b(BufferedChannel.class).i() + " instead").toString());
    }

    public final Object p1(E e10, boolean z10) {
        l<E, r> lVar;
        UndeliveredElementException undeliveredElementExceptionC;
        Object objN = super.n(e10);
        if (!a.i(objN) && !a.h(objN)) {
            if (z10 && (lVar = this.f63050c) != null && (undeliveredElementExceptionC = w.c(lVar, e10, null, 2, null)) != null) {
                throw undeliveredElementExceptionC;
            }
            return a.f63077b.c(r.f64562a);
        }
        return objN;
    }
}
