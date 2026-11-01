package uk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f72911b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f72912c = AtomicIntegerFieldUpdater.newUpdater(k.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f72913d = AtomicIntegerFieldUpdater.newUpdater(k.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f72914e = AtomicIntegerFieldUpdater.newUpdater(k.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<g> f72915a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final g l() {
        return o(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int i10, Ref$ObjectRef<g> ref$ObjectRef) {
        g gVarP;
        T t10;
        g gVarM;
        if (i10 == 3) {
            gVarM = m();
        } else {
            gVarP = p(i10);
        }
        if (t10 == 0) {
            t10 = gVarP;
            t10 = gVarM;
            return s(i10, ref$ObjectRef);
        }
        t10 = gVarP;
        t10 = gVarM;
        ref$ObjectRef.element = t10;
        return -1L;
    }

    public final g a(g gVar, boolean z10) {
        if (z10) {
            return b(gVar);
        }
        g gVar2 = (g) f72911b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final void c(g gVar) {
        if (gVar == null || !gVar.f72902c) {
            return;
        }
        f72914e.decrementAndGet(this);
    }

    public final g q(int i10, boolean z10) {
        int i11 = i10 & 127;
        g gVar = this.f72915a.get(i11);
        if (gVar == null || gVar.f72902c != z10 || !pk.h.a(this.f72915a, i11, gVar, null)) {
            return null;
        }
        if (z10) {
            f72914e.decrementAndGet(this);
        }
        return gVar;
    }

    public final g b(g gVar) {
        if (e() == 127) {
            return gVar;
        }
        if (gVar.f72902c) {
            f72914e.incrementAndGet(this);
        }
        int i10 = f72912c.get(this) & 127;
        while (this.f72915a.get(i10) != null) {
            Thread.yield();
        }
        this.f72915a.lazySet(i10, gVar);
        f72912c.incrementAndGet(this);
        return null;
    }

    public final int e() {
        return f72912c.get(this) - f72913d.get(this);
    }

    public final int i() {
        if (f72911b.get(this) != null) {
            return e() + 1;
        }
        return e();
    }

    public final void j(c cVar) {
        g gVar = (g) f72911b.getAndSet(this, null);
        if (gVar != null) {
            cVar.a(gVar);
        }
        while (n(cVar)) {
        }
    }

    public final g k() {
        g gVar = (g) f72911b.getAndSet(this, null);
        if (gVar == null) {
            return m();
        }
        return gVar;
    }

    public final g m() {
        g andSet;
        while (true) {
            int i10 = f72913d.get(this);
            if (i10 - f72912c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f72913d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f72915a.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    public final boolean n(c cVar) {
        g gVarM = m();
        if (gVarM == null) {
            return false;
        }
        cVar.a(gVarM);
        return true;
    }

    public final g o(boolean z10) {
        g gVar;
        do {
            gVar = (g) f72911b.get(this);
            if (gVar == null || gVar.f72902c != z10) {
                int i10 = f72913d.get(this);
                int i11 = f72912c.get(this);
                while (i10 != i11) {
                    if (z10 && f72914e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    g gVarQ = q(i11, z10);
                    if (gVarQ != null) {
                        return gVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.a.a(f72911b, this, gVar, null));
        return gVar;
    }

    public final g p(int i10) {
        int i11 = f72913d.get(this);
        int i12 = f72912c.get(this);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        while (i11 != i12) {
            if (z10 && f72914e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            g gVarQ = q(i11, z10);
            if (gVarQ == null) {
                i11 = i13;
            } else {
                return gVarQ;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, uk.g] */
    public final long s(int i10, Ref$ObjectRef<g> ref$ObjectRef) {
        ?? r10;
        int i11;
        do {
            r10 = (g) f72911b.get(this);
            if (r10 == 0) {
                return -2L;
            }
            if (r10.f72902c) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            if ((i11 & i10) == 0) {
                return -2L;
            }
            long jA = i.f72909f.a() - r10.f72901b;
            long j10 = i.f72905b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.a.a(f72911b, this, r10, null));
        ref$ObjectRef.element = r10;
        return -1L;
    }
}
