package sk;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class q<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f71976e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71977f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f71978g = AtomicLongFieldUpdater.newUpdater(q.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d0 f71979h = new d0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f71983d;

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f71983d;
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | (((long) i10) << 0);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f71984a;

        public b(int i10) {
            this.f71984a = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q<E> b(long j10) {
        q<E> qVar = new q<>(this.f71980a * 2, this.f71981b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f71982c;
            if ((i10 & i12) == (i12 & i11)) {
                f71978g.set(qVar, f71976e.d(j10, 1152921504606846976L));
                return qVar;
            }
            Object bVar = f().get(this.f71982c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            qVar.f().set(qVar.f71982c & i10, bVar);
            i10++;
        }
    }

    public q(int i10, boolean z10) {
        boolean z11;
        this.f71980a = i10;
        this.f71981b = z10;
        int i11 = i10 - 1;
        this.f71982c = i11;
        this.f71983d = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((i10 & i11) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(E e10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71978g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return f71976e.a(j10);
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f71982c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f71981b && f().get(i11 & i12) != null) {
                int i13 = this.f71980a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f71978g.compareAndSet(this, j10, f71976e.c(j10, (i11 + 1) & 1073741823))) {
                f().set(i11 & i12, e10);
                q<E> qVarE = this;
                while ((f71978g.get(qVarE) & 1152921504606846976L) != 0 && (qVarE = qVarE.l().e(i11, e10)) != null) {
                }
                return 0;
            }
        }
    }

    public final q<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71977f;
        while (true) {
            q<E> qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar != null) {
                return qVar;
            }
            androidx.concurrent.futures.a.a(f71977f, this, null, b(j10));
        }
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71978g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final q<E> e(int i10, E e10) {
        Object obj = f().get(this.f71982c & i10);
        if ((obj instanceof b) && ((b) obj).f71984a == i10) {
            f().set(i10 & this.f71982c, e10);
            return this;
        }
        return null;
    }

    public final int g() {
        long j10 = f71978g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean j() {
        long j10 = f71978g.get(this);
        if (((int) ((1073741823 & j10) >> 0)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
            return false;
        }
        return true;
    }

    public final long k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71978g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    public final q<E> l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71978g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f71979h;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = this.f71982c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = f().get(this.f71982c & i10);
            if (obj == null) {
                if (this.f71981b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f71978g.compareAndSet(this, j10, f71976e.b(j10, i12))) {
                    f().set(this.f71982c & i10, null);
                    return obj;
                }
                if (this.f71981b) {
                    q<E> qVarN = this;
                    do {
                        qVarN = qVarN.n(i10, i12);
                    } while (qVarN != null);
                    return obj;
                }
            }
        }
    }

    public final q<E> n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f71978g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f71978g.compareAndSet(this, j10, f71976e.b(j10, i11)));
        f().set(this.f71982c & i12, null);
        return null;
    }
}
