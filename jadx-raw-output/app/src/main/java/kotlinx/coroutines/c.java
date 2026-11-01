package kotlinx.coroutines;

import bk.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import mj.r;
import nk.a2;
import nk.b2;
import nk.h0;
import nk.j0;
import nk.l;
import nk.m0;
import nk.n;
import nk.o;
import nk.p;
import nk.q2;
import nk.u0;
import nk.y;
import nk.y0;
import nk.z;
import sk.a0;
import sk.d0;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
public class c<T> extends f<T> implements l<T>, tj.c, q2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63033g = AtomicIntegerFieldUpdater.newUpdater(c.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63034h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63035i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rj.c<T> f63036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlin.coroutines.d f63037f;

    public String R() {
        return "CancellableContinuation";
    }

    public static /* synthetic */ void X(c cVar, Object obj, int i10, q qVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        cVar.W(obj, i10, qVar);
    }

    @Override // nk.l
    public Object D(Throwable th2) {
        return a0(new z(th2, false, 2, null), null, null);
    }

    @Override // nk.l
    public void K(T t10, final bk.l<? super Throwable, r> lVar) {
        W(t10, this.f63084d, lVar != null ? new q() { // from class: nk.m
            @Override // bk.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return kotlinx.coroutines.c.V(lVar, (Throwable) obj, obj2, (kotlin.coroutines.d) obj3);
            }
        } : null);
    }

    @Override // nk.l
    public <R extends T> void M(R r10, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
        W(r10, this.f63084d, qVar);
    }

    public final void N(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63034h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof nk.c) {
                if (androidx.concurrent.futures.a.a(f63034h, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof b) || (obj2 instanceof a0)) {
                Q(obj, obj2);
            } else {
                boolean z10 = obj2 instanceof z;
                if (z10) {
                    z zVar = (z) obj2;
                    if (!zVar.c()) {
                        Q(obj, obj2);
                    }
                    if (obj2 instanceof p) {
                        if (!z10) {
                            zVar = null;
                        }
                        Throwable th2 = zVar != null ? zVar.f64844a : null;
                        if (obj instanceof b) {
                            m((b) obj, th2);
                            return;
                        } else {
                            ck.p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            o((a0) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof y) {
                    y yVar = (y) obj2;
                    if (yVar.f64839b != null) {
                        Q(obj, obj2);
                    }
                    if (obj instanceof a0) {
                        return;
                    }
                    ck.p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    b bVar = (b) obj;
                    if (yVar.c()) {
                        m(bVar, yVar.f64842e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.a.a(f63034h, this, obj2, y.b(yVar, null, bVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof a0) {
                        return;
                    }
                    ck.p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.a.a(f63034h, this, obj2, new y(obj2, (b) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean P() {
        if (u0.c(this.f63084d)) {
            rj.c<T> cVar = this.f63036e;
            ck.p.h(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((sk.g) cVar).q()) {
                return true;
            }
        }
        return false;
    }

    public final void Q(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void T() {
        Throwable thV;
        rj.c<T> cVar = this.f63036e;
        sk.g gVar = cVar instanceof sk.g ? (sk.g) cVar : null;
        if (gVar == null || (thV = gVar.v(this)) == null) {
            return;
        }
        s();
        j(thV);
    }

    public final <R> Object Y(b2 b2Var, R r10, int i10, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar, Object obj) {
        if (r10 instanceof z) {
            return r10;
        }
        if (!u0.b(i10) && obj == null) {
            return r10;
        }
        if (qVar == null && !(b2Var instanceof b) && obj == null) {
            return r10;
        }
        return new y(r10, b2Var instanceof b ? (b) b2Var : null, qVar, obj, null, 16, null);
    }

    @Override // kotlinx.coroutines.f
    public void a(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63034h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof b2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof z) {
                return;
            }
            if (obj2 instanceof y) {
                y yVar = (y) obj2;
                if (!(!yVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.a.a(f63034h, this, obj2, y.b(yVar, null, null, null, null, th2, 15, null))) {
                    yVar.d(this, th2);
                    return;
                }
            } else if (androidx.concurrent.futures.a.a(f63034h, this, obj2, new y(obj2, null, null, null, th2, 14, null))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.f
    public final rj.c<T> e() {
        return this.f63036e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.f
    public <T> T g(Object obj) {
        return obj instanceof y ? (T) ((y) obj).f64838a : obj;
    }

    @Override // tj.c
    public tj.c getCallerFrame() {
        rj.c<T> cVar = this.f63036e;
        if (cVar instanceof tj.c) {
            return (tj.c) cVar;
        }
        return null;
    }

    @Override // nk.l, rj.c
    public kotlin.coroutines.d getContext() {
        return this.f63037f;
    }

    public final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    @Override // nk.l
    public void p(bk.l<? super Throwable, r> lVar) {
        o.c(this, new b.a(lVar));
    }

    public String toString() {
        return R() + '(' + m0.c(this.f63036e) + "){" + F() + "}@" + m0.b(this);
    }

    @Override // nk.l
    public void x(Object obj) {
        v(this.f63084d);
    }

    @Override // nk.l
    public void z(h0 h0Var, T t10) {
        rj.c<T> cVar = this.f63036e;
        sk.g gVar = cVar instanceof sk.g ? (sk.g) cVar : null;
        X(this, t10, (gVar != null ? gVar.f71947e : null) == h0Var ? 4 : this.f63084d, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(rj.c<? super T> cVar, int i10) {
        super(i10);
        this.f63036e = cVar;
        this.f63037f = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = nk.c.f64761b;
    }

    public static final r V(bk.l lVar, Throwable th2, Object obj, kotlin.coroutines.d dVar) {
        lVar.invoke(th2);
        return r.f64562a;
    }

    public final Object B() {
        g gVar;
        boolean zP = P();
        if (b0()) {
            if (y() == null) {
                L();
            }
            if (zP) {
                T();
            }
            return sj.a.f();
        }
        if (zP) {
            T();
        }
        Object objC = C();
        if (!(objC instanceof z)) {
            if (u0.b(this.f63084d) && (gVar = (g) getContext().get(g.E8)) != null && !gVar.isActive()) {
                CancellationException cancellationExceptionB = gVar.B();
                a(objC, cancellationExceptionB);
                throw cancellationExceptionB;
            }
            return g(objC);
        }
        throw ((z) objC).f64844a;
    }

    public final Object C() {
        return f63034h.get(this);
    }

    public final String F() {
        Object objC = C();
        if (objC instanceof b2) {
            return "Active";
        }
        if (objC instanceof p) {
            return "Cancelled";
        }
        return "Completed";
    }

    public void J() {
        y0 y0VarL = L();
        if (y0VarL != null && d()) {
            y0VarL.dispose();
            f63035i.set(this, a2.f64759b);
        }
    }

    public final y0 L() {
        g gVar = (g) getContext().get(g.E8);
        if (gVar != null) {
            y0 y0VarL = JobKt__JobKt.l(gVar, false, new nk.q(this), 1, null);
            androidx.concurrent.futures.a.a(f63035i, this, null, y0VarL);
            return y0VarL;
        }
        return null;
    }

    public final void O(b bVar) {
        N(bVar);
    }

    public final void S(Throwable th2) {
        if (q(th2)) {
            return;
        }
        j(th2);
        u();
    }

    public final boolean U() {
        Object obj = f63034h.get(this);
        if ((obj instanceof y) && ((y) obj).f64841d != null) {
            s();
            return false;
        }
        f63033g.set(this, 536870911);
        f63034h.set(this, nk.c.f64761b);
        return true;
    }

    public final <R> void W(R r10, int i10, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63034h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b2) {
            } else {
                if (obj instanceof p) {
                    p pVar = (p) obj;
                    if (pVar.e()) {
                        if (qVar != null) {
                            n(qVar, pVar.f64844a, r10);
                            return;
                        }
                        return;
                    }
                }
                l(r10);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.a.a(f63034h, this, obj, Y((b2) obj, r10, i10, qVar, null)));
        u();
        v(i10);
    }

    public final boolean Z() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f63033g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f63033g.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    public final <R> d0 a0(R r10, Object obj, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63034h;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof b2) {
            } else {
                if (!(obj2 instanceof y) || obj == null || ((y) obj2).f64841d != obj) {
                    return null;
                }
                return n.f64804a;
            }
        } while (!androidx.concurrent.futures.a.a(f63034h, this, obj2, Y((b2) obj2, r10, this.f63084d, qVar, obj)));
        u();
        return n.f64804a;
    }

    public final boolean b0() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f63033g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f63033g.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // nk.q2
    public void c(a0<?> a0Var, int i10) {
        int i11;
        boolean z10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f63033g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) == 536870911) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        N(a0Var);
    }

    @Override // nk.l
    public boolean d() {
        return !(C() instanceof b2);
    }

    @Override // kotlinx.coroutines.f
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF == null) {
            return null;
        }
        return thF;
    }

    @Override // kotlinx.coroutines.f
    public Object i() {
        return C();
    }

    @Override // nk.l
    public boolean isActive() {
        return C() instanceof b2;
    }

    @Override // nk.l
    public boolean j(Throwable th2) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63034h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof b2)) {
                return false;
            }
            if ((obj instanceof b) || (obj instanceof a0)) {
                z10 = true;
            }
        } while (!androidx.concurrent.futures.a.a(f63034h, this, obj, new p(this, th2, z10)));
        b2 b2Var = (b2) obj;
        if (b2Var instanceof b) {
            m((b) obj, th2);
        } else if (b2Var instanceof a0) {
            o((a0) obj, th2);
        }
        u();
        v(this.f63084d);
        return true;
    }

    public final void m(b bVar, Throwable th2) {
        try {
            bVar.a(th2);
        } catch (Throwable th3) {
            j0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void n(q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar, Throwable th2, R r10) {
        try {
            qVar.invoke(th2, r10, getContext());
        } catch (Throwable th3) {
            j0.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void o(a0<?> a0Var, Throwable th2) {
        boolean z10;
        int i10 = f63033g.get(this) & 536870911;
        if (i10 != 536870911) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                a0Var.s(i10, th2, getContext());
                return;
            } catch (Throwable th3) {
                j0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    public final boolean q(Throwable th2) {
        if (!P()) {
            return false;
        }
        rj.c<T> cVar = this.f63036e;
        ck.p.h(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((sk.g) cVar).s(th2);
    }

    @Override // nk.l
    public <R extends T> Object r(R r10, Object obj, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
        return a0(r10, obj, qVar);
    }

    @Override // rj.c
    public void resumeWith(Object obj) {
        X(this, nk.a0.c(obj, this), this.f63084d, null, 4, null);
    }

    public final void s() {
        y0 y0VarY = y();
        if (y0VarY == null) {
            return;
        }
        y0VarY.dispose();
        f63035i.set(this, a2.f64759b);
    }

    public final void u() {
        if (!P()) {
            s();
        }
    }

    public final void v(int i10) {
        if (Z()) {
            return;
        }
        u0.a(this, i10);
    }

    public Throwable w(g gVar) {
        return gVar.B();
    }

    public final y0 y() {
        return (y0) f63035i.get(this);
    }
}
