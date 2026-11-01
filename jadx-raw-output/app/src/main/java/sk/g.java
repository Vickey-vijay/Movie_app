package sk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nk.c1;
import nk.l2;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g<T> extends kotlinx.coroutines.f<T> implements tj.c, rj.c<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71946i = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nk.h0 f71947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rj.c<T> f71948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f71949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f71950h;

    /* JADX WARN: Multi-variable type inference failed */
    public g(nk.h0 h0Var, rj.c<? super T> cVar) {
        super(-1);
        this.f71947e = h0Var;
        this.f71948f = cVar;
        this.f71949g = h.f71951a;
        this.f71950h = k0.g(getContext());
    }

    @Override // kotlinx.coroutines.f
    public rj.c<T> e() {
        return this;
    }

    @Override // rj.c
    public kotlin.coroutines.d getContext() {
        return this.f71948f.getContext();
    }

    @Override // tj.c
    public tj.c getCallerFrame() {
        rj.c<T> cVar = this.f71948f;
        if (cVar instanceof tj.c) {
            return (tj.c) cVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.f
    public Object i() {
        Object obj = this.f71949g;
        this.f71949g = h.f71951a;
        return obj;
    }

    public final void m(kotlin.coroutines.d dVar, T t10) {
        this.f71949g = t10;
        this.f63084d = 1;
        this.f71947e.dispatchYield(dVar, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f71947e + ", " + nk.m0.c(this.f71948f) + ']';
    }

    public final void k() {
        while (f71946i.get(this) == h.f71952b) {
        }
    }

    public final kotlinx.coroutines.c<T> l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71946i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f71946i.set(this, h.f71952b);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.c) {
                if (androidx.concurrent.futures.a.a(f71946i, this, obj, h.f71952b)) {
                    return (kotlinx.coroutines.c) obj;
                }
            } else if (obj != h.f71952b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final kotlinx.coroutines.c<?> n() {
        Object obj = f71946i.get(this);
        if (obj instanceof kotlinx.coroutines.c) {
            return (kotlinx.coroutines.c) obj;
        }
        return null;
    }

    public final boolean q() {
        if (f71946i.get(this) != null) {
            return true;
        }
        return false;
    }

    @Override // rj.c
    public void resumeWith(Object obj) {
        Object objB = nk.a0.b(obj);
        if (h.d(this.f71947e, getContext())) {
            this.f71949g = objB;
            this.f63084d = 0;
            h.c(this.f71947e, getContext(), this);
            return;
        }
        c1 c1VarB = l2.f64799a.b();
        if (c1VarB.C()) {
            this.f71949g = objB;
            this.f63084d = 0;
            c1VarB.r(this);
            return;
        }
        c1VarB.x(true);
        try {
            kotlin.coroutines.d context = getContext();
            Object objI = k0.i(context, this.f71950h);
            try {
                this.f71948f.resumeWith(obj);
                mj.r rVar = mj.r.f64562a;
                k0.f(context, objI);
                while (c1VarB.K()) {
                }
            } catch (Throwable th2) {
                k0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                h(th3);
            } finally {
                c1VarB.n(true);
            }
        }
    }

    public final boolean s(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71946i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            d0 d0Var = h.f71952b;
            if (ck.p.e(obj, d0Var)) {
                if (androidx.concurrent.futures.a.a(f71946i, this, d0Var, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f71946i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void u() {
        k();
        kotlinx.coroutines.c<?> cVarN = n();
        if (cVarN != null) {
            cVarN.s();
        }
    }

    public final Throwable v(nk.l<?> lVar) {
        d0 d0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71946i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            d0Var = h.f71952b;
            if (obj != d0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f71946i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f71946i, this, d0Var, lVar));
        return null;
    }
}
