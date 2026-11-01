package pk;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannelKt;
import nk.q2;
import sk.a0;
import sk.w;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class i<E> extends a0<i<E>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BufferedChannel<E> f66158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f66159g;

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f66159g;
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().n1((this.f71936d * ((long) BufferedChannelKt.f63058b)) + ((long) i10));
        }
        t();
    }

    @Override // sk.a0
    public int r() {
        return BufferedChannelKt.f63058b;
    }

    @Override // sk.a0
    public void s(int i10, Throwable th2, kotlin.coroutines.d dVar) {
        bk.l<E, mj.r> lVar;
        bk.l<E, mj.r> lVar2;
        int i11 = BufferedChannelKt.f63058b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        E eA = A(i10);
        while (true) {
            Object objB = B(i10);
            if ((objB instanceof q2) || (objB instanceof r)) {
                if (v(i10, objB, z10 ? BufferedChannelKt.f63066j : BufferedChannelKt.f63067k)) {
                    w(i10);
                    C(i10, !z10);
                    if (!z10 || (lVar = y().f63050c) == null) {
                        return;
                    }
                    w.a(lVar, eA, dVar);
                    return;
                }
            } else {
                if (objB == BufferedChannelKt.f63066j || objB == BufferedChannelKt.f63067k) {
                    break;
                }
                if (objB != BufferedChannelKt.f63063g && objB != BufferedChannelKt.f63062f) {
                    if (objB == BufferedChannelKt.f63065i || objB == BufferedChannelKt.f63060d || objB == BufferedChannelKt.z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objB).toString());
                }
            }
        }
        w(i10);
        if (!z10 || (lVar2 = y().f63050c) == null) {
            return;
        }
        w.a(lVar2, eA, dVar);
    }

    public final BufferedChannel<E> y() {
        BufferedChannel<E> bufferedChannel = this.f66158f;
        ck.p.g(bufferedChannel);
        return bufferedChannel;
    }

    public i(long j10, i<E> iVar, BufferedChannel<E> bufferedChannel, int i10) {
        super(j10, iVar, i10);
        this.f66158f = bufferedChannel;
        this.f66159g = new AtomicReferenceArray(BufferedChannelKt.f63058b * 2);
    }

    public final E A(int i10) {
        return (E) z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final E D(int i10) {
        E eA = A(i10);
        w(i10);
        return eA;
    }

    public final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, E e10) {
        E(i10, e10);
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return h.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }
}
