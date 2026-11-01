package kotlinx.coroutines.sync;

import bk.q;
import ck.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import mj.r;
import nk.l;
import nk.q2;
import pk.h;
import sk.a;
import sk.a0;
import sk.b0;
import vk.f;
import wk.i;
import wk.j;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes9.dex */
public class SemaphoreAndMutexImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63216c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f63217d = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63218e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f63219f = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63220g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q<Throwable, r, d, r> f63222b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public final boolean r() {
        Object objC;
        boolean z10;
        j jVar = (j) f63216c.get(this);
        long andIncrement = f63217d.getAndIncrement(this);
        long j10 = andIncrement / ((long) i.f74151f);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63216c;
        do {
            objC = a.c(jVar, j10, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (b0.c(objC)) {
                break;
            }
            a0 a0VarB = b0.b(objC);
            while (true) {
                a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
                if (a0Var.f71936d < a0VarB.f71936d) {
                    if (!a0VarB.u()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, a0Var, a0VarB)) {
                        if (a0Var.p()) {
                            a0Var.n();
                        }
                    } else if (a0VarB.p()) {
                        a0VarB.n();
                    }
                }
                z10 = true;
                break;
            }
        } while (!z10);
        j jVar2 = (j) b0.b(objC);
        jVar2.c();
        if (jVar2.f71936d > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) i.f74151f));
        Object andSet = jVar2.v().getAndSet(i10, i.f74147b);
        if (andSet != null) {
            if (andSet == i.f74150e) {
                return false;
            }
            return q(andSet);
        }
        int i11 = i.f74146a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (jVar2.v().get(i10) == i.f74148c) {
                return true;
            }
        }
        return !h.a(jVar2.v(), i10, i.f74147b, i.f74149d);
    }

    public final boolean e(q2 q2Var) {
        Object objC;
        boolean z10;
        j jVar = (j) f63218e.get(this);
        long andIncrement = f63219f.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63218e;
        long j10 = andIncrement / ((long) i.f74151f);
        do {
            objC = a.c(jVar, j10, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!b0.c(objC)) {
                a0 a0VarB = b0.b(objC);
                while (true) {
                    a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
                    if (a0Var.f71936d < a0VarB.f71936d) {
                        if (!a0VarB.u()) {
                            z10 = false;
                            break;
                        }
                        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, a0Var, a0VarB)) {
                            if (a0Var.p()) {
                                a0Var.n();
                            }
                        } else if (a0VarB.p()) {
                            a0VarB.n();
                        }
                    }
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        } while (!z10);
        j jVar2 = (j) b0.b(objC);
        int i10 = (int) (andIncrement % ((long) i.f74151f));
        if (h.a(jVar2.v(), i10, null, q2Var)) {
            q2Var.c(jVar2, i10);
            return true;
        }
        if (!h.a(jVar2.v(), i10, i.f74147b, i.f74148c)) {
            return false;
        }
        if (q2Var instanceof l) {
            p.h(q2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((l) q2Var).M(r.f64562a, this.f63222b);
            return true;
        }
        if (q2Var instanceof f) {
            ((f) q2Var).d(r.f64562a);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + q2Var).toString());
    }

    public final boolean q(Object obj) {
        if (!(obj instanceof l)) {
            if (obj instanceof f) {
                return ((f) obj).e(this, r.f64562a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        l lVar = (l) obj;
        Object objR = lVar.r(r.f64562a, null, this.f63222b);
        if (objR == null) {
            return false;
        }
        lVar.x(objR);
        return true;
    }

    public SemaphoreAndMutexImpl(int i10, int i11) {
        boolean z10;
        this.f63221a = i10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0 && i11 <= i10) {
                j jVar = new j(0L, null, 2);
                this.head$volatile = jVar;
                this.tail$volatile = jVar;
                this._availablePermits$volatile = i10 - i11;
                this.f63222b = new q() { // from class: wk.h
                    @Override // bk.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SemaphoreAndMutexImpl.n(this.f74145b, (Throwable) obj, (r) obj2, (kotlin.coroutines.d) obj3);
                    }
                };
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
    }

    public static final r n(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th2, r rVar, d dVar) {
        semaphoreAndMutexImpl.o();
        return r.f64562a;
    }

    public final void d(l<? super r> lVar) {
        while (g() <= 0) {
            p.h(lVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((q2) lVar)) {
                return;
            }
        }
        lVar.M(r.f64562a, this.f63222b);
    }

    public final void f() {
        int i10;
        do {
            i10 = f63220g.get(this);
            if (i10 <= this.f63221a) {
                return;
            }
        } while (!f63220g.compareAndSet(this, i10, this.f63221a));
    }

    public final int g() {
        int andDecrement;
        do {
            andDecrement = f63220g.getAndDecrement(this);
        } while (andDecrement > this.f63221a);
        return andDecrement;
    }

    public final int h() {
        return Math.max(f63220g.get(this), 0);
    }

    public final void o() {
        do {
            int andIncrement = f63220g.getAndIncrement(this);
            if (andIncrement < this.f63221a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f63221a).toString());
            }
        } while (!r());
    }

    public final boolean p() {
        while (true) {
            int i10 = f63220g.get(this);
            if (i10 > this.f63221a) {
                f();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f63220g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
