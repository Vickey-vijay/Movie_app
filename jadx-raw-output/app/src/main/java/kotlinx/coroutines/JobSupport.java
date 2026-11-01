package kotlinx.coroutines;

import bk.l;
import bk.q;
import ck.p;
import ck.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kk.i;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import mj.r;
import nk.a2;
import nk.b1;
import nk.c2;
import nk.d2;
import nk.e2;
import nk.m0;
import nk.n1;
import nk.o;
import nk.o1;
import nk.q1;
import nk.r1;
import nk.s;
import nk.t;
import nk.t1;
import nk.u1;
import nk.v1;
import nk.y0;
import nk.z;
import nk.z1;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public class JobSupport implements g, t, c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63016b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63017c = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class a<T> extends kotlinx.coroutines.c<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final JobSupport f63018j;

        public a(rj.c<? super T> cVar, JobSupport jobSupport) {
            super(cVar, 1);
            this.f63018j = jobSupport;
        }

        @Override // kotlinx.coroutines.c
        public String R() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.c
        public Throwable w(g gVar) {
            Throwable thE;
            Object objT0 = this.f63018j.t0();
            if (!(objT0 instanceof c) || (thE = ((c) objT0).e()) == null) {
                return objT0 instanceof z ? ((z) objT0).f64844a : gVar.B();
            }
            return thE;
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class b extends u1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final JobSupport f63019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f63020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s f63021h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f63022i;

        @Override // nk.u1
        public boolean u() {
            return false;
        }

        @Override // nk.u1
        public void v(Throwable th2) {
            this.f63019f.h0(this.f63020g, this.f63021h, this.f63022i);
        }

        public b(JobSupport jobSupport, c cVar, s sVar, Object obj) {
            this.f63019f = jobSupport;
            this.f63020g = cVar;
            this.f63021h = sVar;
            this.f63022i = obj;
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class c implements o1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f63023c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f63024d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f63025e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z1 f63026b;

        @Override // nk.o1
        public z1 b() {
            return this.f63026b;
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }

        public c(z1 z1Var, boolean z10, Throwable th2) {
            this.f63026b = z1Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        public final void a(Throwable th2) {
            Throwable thE = e();
            if (thE == null) {
                o(th2);
                return;
            }
            if (th2 == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                n(th2);
                return;
            }
            if (objD instanceof Throwable) {
                if (th2 == objD) {
                    return;
                }
                ArrayList<Throwable> arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th2);
                n(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        public final Object d() {
            return f63025e.get(this);
        }

        public final Throwable e() {
            return (Throwable) f63024d.get(this);
        }

        public final boolean i() {
            if (e() != null) {
                return true;
            }
            return false;
        }

        @Override // nk.o1
        public boolean isActive() {
            if (e() == null) {
                return true;
            }
            return false;
        }

        public final boolean j() {
            if (f63023c.get(this) == 1) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            if (d() == v1.f64829e) {
                return true;
            }
            return false;
        }

        public final List<Throwable> l(Throwable th2) {
            ArrayList<Throwable> arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList<Throwable> arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else if (objD instanceof ArrayList) {
                arrayListC = (ArrayList) objD;
            } else {
                throw new IllegalStateException(("State is " + objD).toString());
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th2 != null && !p.e(th2, thE)) {
                arrayListC.add(th2);
            }
            n(v1.f64829e);
            return arrayListC;
        }

        public final void m(boolean z10) {
            f63023c.set(this, z10 ? 1 : 0);
        }

        public final void n(Object obj) {
            f63025e.set(this, obj);
        }

        public final void o(Throwable th2) {
            f63024d.set(this, th2);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public final class d extends u1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final vk.f<?> f63027f;

        @Override // nk.u1
        public boolean u() {
            return false;
        }

        public d(vk.f<?> fVar) {
            this.f63027f = fVar;
        }

        @Override // nk.u1
        public void v(Throwable th2) {
            Object objT0 = JobSupport.this.t0();
            if (!(objT0 instanceof z)) {
                objT0 = v1.h(objT0);
            }
            this.f63027f.e(JobSupport.this, objT0);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public final class e extends u1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final vk.f<?> f63029f;

        @Override // nk.u1
        public boolean u() {
            return false;
        }

        public e(vk.f<?> fVar) {
            this.f63029f = fVar;
        }

        @Override // nk.u1
        public void v(Throwable th2) {
            this.f63029f.e(JobSupport.this, r.f64562a);
        }
    }

    public boolean A0() {
        return false;
    }

    public final Object D0(Object obj) throws Throwable {
        Throwable thI0 = null;
        while (true) {
            Object objT0 = t0();
            if (objT0 instanceof c) {
                synchronized (objT0) {
                    if (((c) objT0).k()) {
                        return v1.f64828d;
                    }
                    boolean zI = ((c) objT0).i();
                    if (obj != null || !zI) {
                        if (thI0 == null) {
                            thI0 = i0(obj);
                        }
                        ((c) objT0).a(thI0);
                    }
                    Throwable thE = zI ^ true ? ((c) objT0).e() : null;
                    if (thE != null) {
                        I0(((c) objT0).b(), thE);
                    }
                    return v1.f64825a;
                }
            }
            if (!(objT0 instanceof o1)) {
                return v1.f64828d;
            }
            if (thI0 == null) {
                thI0 = i0(obj);
            }
            o1 o1Var = (o1) objT0;
            if (!o1Var.isActive()) {
                Object objB1 = b1(objT0, new z(thI0, false, 2, null));
                if (objB1 == v1.f64825a) {
                    throw new IllegalStateException(("Cannot happen in " + objT0).toString());
                }
                if (objB1 != v1.f64827c) {
                    return objB1;
                }
            } else if (a1(o1Var, thI0)) {
                return v1.f64825a;
            }
        }
    }

    public final void J0(z1 z1Var, Throwable th2) throws Throwable {
        z1Var.f(1);
        Object objJ = z1Var.j();
        p.h(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeK = (LockFreeLinkedListNode) objJ; !p.e(lockFreeLinkedListNodeK, z1Var); lockFreeLinkedListNodeK = lockFreeLinkedListNodeK.k()) {
            if (lockFreeLinkedListNodeK instanceof u1) {
                try {
                    ((u1) lockFreeLinkedListNodeK).v(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        mj.d.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeK + " for " + this, th3);
                        r rVar = r.f64562a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            x0(completionHandlerException);
        }
    }

    public void M0(Throwable th2) {
    }

    public void N0(Object obj) {
    }

    public void O0() {
    }

    public void V(Object obj) {
    }

    public String e0() {
        return "Job was cancelled";
    }

    public boolean n0() {
        return true;
    }

    public boolean p0() {
        return false;
    }

    public boolean w0(Throwable th2) {
        return false;
    }

    public static /* synthetic */ CancellationException X0(JobSupport jobSupport, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return jobSupport.W0(th2, str);
    }

    public final Object C0(rj.c<? super r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        o.a(cVar2, JobKt__JobKt.l(this, false, new e2(cVar2), 1, null));
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB == sj.a.f() ? objB : r.f64562a;
    }

    @Override // kotlinx.coroutines.g
    public final y0 F(l<? super Throwable, r> lVar) {
        return z0(true, new r1(lVar));
    }

    @Override // kotlinx.coroutines.g
    public final nk.r I(t tVar) {
        boolean z10;
        Throwable thE;
        s sVar = new s(tVar);
        sVar.w(this);
        while (true) {
            Object objT0 = t0();
            z10 = true;
            if (!(objT0 instanceof b1)) {
                if (!(objT0 instanceof o1)) {
                    z10 = false;
                    break;
                }
                z1 z1VarB = ((o1) objT0).b();
                if (z1VarB != null) {
                    if (!z1VarB.c(sVar, 7)) {
                        boolean zC = z1VarB.c(sVar, 3);
                        Object objT1 = t0();
                        if (objT1 instanceof c) {
                            thE = ((c) objT1).e();
                        } else {
                            z zVar = objT1 instanceof z ? (z) objT1 : null;
                            thE = zVar != null ? zVar.f64844a : null;
                        }
                        sVar.v(thE);
                        if (zC) {
                            break;
                        }
                        return a2.f64759b;
                    }
                    break;
                }
                p.h(objT0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                Q0((u1) objT0);
            } else {
                b1 b1Var = (b1) objT0;
                if (!b1Var.isActive()) {
                    P0(b1Var);
                } else if (androidx.concurrent.futures.a.a(f63016b, this, objT0, sVar)) {
                    break;
                }
            }
        }
        if (z10) {
            return sVar;
        }
        Object objT2 = t0();
        z zVar2 = objT2 instanceof z ? (z) objT2 : null;
        sVar.v(zVar2 != null ? zVar2.f64844a : null);
        return a2.f64759b;
    }

    public final Object K0(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof z) {
            throw ((z) obj2).f64844a;
        }
        return obj2;
    }

    @Override // kotlinx.coroutines.g
    public final y0 N(boolean z10, boolean z11, l<? super Throwable, r> lVar) {
        return z0(z11, z10 ? new q1(lVar) : new r1(lVar));
    }

    public final void P0(b1 b1Var) {
        z1 z1Var = new z1();
        Object n1Var = z1Var;
        if (!b1Var.isActive()) {
            n1Var = new n1(z1Var);
        }
        androidx.concurrent.futures.a.a(f63016b, this, b1Var, n1Var);
    }

    public final void Q0(u1 u1Var) {
        u1Var.e(new z1());
        androidx.concurrent.futures.a.a(f63016b, this, u1Var, u1Var.k());
    }

    public final int U0(Object obj) {
        if (obj instanceof b1) {
            if (((b1) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.a.a(f63016b, this, obj, v1.f64831g)) {
                return -1;
            }
            O0();
            return 1;
        }
        if (!(obj instanceof n1)) {
            return 0;
        }
        if (!androidx.concurrent.futures.a.a(f63016b, this, obj, ((n1) obj).b())) {
            return -1;
        }
        O0();
        return 1;
    }

    public final String V0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof o1) {
                return ((o1) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.i()) {
            return "Cancelling";
        }
        return cVar.j() ? "Completing" : "Active";
    }

    public final CancellationException W0(Throwable th2, String str) {
        CancellationException jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = e0();
            }
            jobCancellationException = new JobCancellationException(str, th2, this);
        }
        return jobCancellationException;
    }

    public final Object X(rj.c<Object> cVar) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), this);
        aVar.J();
        o.a(aVar, JobKt__JobKt.l(this, false, new d2(aVar), 1, null));
        Object objB = aVar.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB;
    }

    public final String Y0() {
        return G0() + '{' + V0(t0()) + '}';
    }

    @Override // kotlinx.coroutines.g
    public void a(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(e0(), null, this);
        }
        a0(cancellationException);
    }

    public final Object b1(Object obj, Object obj2) {
        if (!(obj instanceof o1)) {
            return v1.f64825a;
        }
        if ((!(obj instanceof b1) && !(obj instanceof u1)) || (obj instanceof s) || (obj2 instanceof z)) {
            return c1((o1) obj, obj2);
        }
        return Z0((o1) obj, obj2) ? obj2 : v1.f64827c;
    }

    public final boolean d1(c cVar, s sVar, Object obj) {
        while (t1.k(sVar.f64821f, false, new b(this, cVar, sVar, obj)) == a2.f64759b) {
            sVar = H0(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    public boolean f0(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return Z(th2) && n0();
    }

    @Override // kotlin.coroutines.d.b
    public final kotlin.coroutines.d.c<?> getKey() {
        return g.E8;
    }

    public final Throwable i0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(e0(), null, this) : th2;
        }
        p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((c2) obj).G();
    }

    public final Object j0(c cVar, Object obj) throws Throwable {
        boolean zI;
        Throwable thM0;
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th2 = zVar != null ? zVar.f64844a : null;
        synchronized (cVar) {
            zI = cVar.i();
            List<Throwable> listL = cVar.l(th2);
            thM0 = m0(cVar, listL);
            if (thM0 != null) {
                U(thM0, listL);
            }
        }
        if (thM0 != null && thM0 != th2) {
            obj = new z(thM0, false, 2, null);
        }
        if (thM0 != null) {
            if (c0(thM0) || w0(thM0)) {
                p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((z) obj).c();
            }
        }
        if (!zI) {
            M0(thM0);
        }
        N0(obj);
        androidx.concurrent.futures.a.a(f63016b, this, cVar, v1.g(obj));
        g0(cVar, obj);
        return obj;
    }

    @Override // kotlinx.coroutines.g
    public final i<g> k() {
        return kk.l.b(new JobSupport$children$1(this, null));
    }

    public final Throwable l0(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f64844a;
        }
        return null;
    }

    public final vk.c<?> o0() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        p.h(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) x.e(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        p.h(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new vk.d(this, qVar, (q) x.e(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    public String toString() {
        return Y0() + '@' + m0.b(this);
    }

    @Override // kotlinx.coroutines.g
    public final vk.a v() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.INSTANCE;
        p.h(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new vk.b(this, (q) x.e(jobSupport$onJoin$1, 3), null, 4, null);
    }

    public final void y0(g gVar) {
        if (gVar == null) {
            T0(a2.f64759b);
            return;
        }
        gVar.start();
        nk.r rVarI = gVar.I(this);
        T0(rVarI);
        if (d()) {
            rVarI.dispose();
            T0(a2.f64759b);
        }
    }

    public JobSupport(boolean z10) {
        this._state$volatile = z10 ? v1.f64831g : v1.f64830f;
    }

    @Override // kotlinx.coroutines.g
    public final CancellationException B() {
        Object objT0 = t0();
        if (objT0 instanceof c) {
            Throwable thE = ((c) objT0).e();
            if (thE != null) {
                CancellationException cancellationExceptionW0 = W0(thE, m0.a(this) + " is cancelling");
                if (cancellationExceptionW0 != null) {
                    return cancellationExceptionW0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objT0 instanceof o1)) {
            if (objT0 instanceof z) {
                return X0(this, ((z) objT0).f64844a, null, 1, null);
            }
            return new JobCancellationException(m0.a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final boolean B0() {
        Object objT0;
        do {
            objT0 = t0();
            if (!(objT0 instanceof o1)) {
                return false;
            }
        } while (U0(objT0) < 0);
        return true;
    }

    public final boolean E0(Object obj) {
        Object objB1;
        do {
            objB1 = b1(t0(), obj);
            if (objB1 == v1.f64825a) {
                return false;
            }
            if (objB1 == v1.f64826b) {
                return true;
            }
        } while (objB1 == v1.f64827c);
        V(objB1);
        return true;
    }

    public final Object F0(Object obj) {
        Object objB1;
        do {
            objB1 = b1(t0(), obj);
            if (objB1 == v1.f64825a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, l0(obj));
            }
        } while (objB1 == v1.f64827c);
        return objB1;
    }

    @Override // nk.c2
    public CancellationException G() {
        Throwable thE;
        Object objT0 = t0();
        CancellationException cancellationException = null;
        if (objT0 instanceof c) {
            thE = ((c) objT0).e();
        } else if (objT0 instanceof z) {
            thE = ((z) objT0).f64844a;
        } else if (!(objT0 instanceof o1)) {
            thE = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + objT0).toString());
        }
        if (thE instanceof CancellationException) {
            cancellationException = (CancellationException) thE;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + V0(objT0), thE, this);
        }
        return cancellationException;
    }

    public String G0() {
        return m0.a(this);
    }

    public final s H0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.p()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.l();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.k();
            if (!lockFreeLinkedListNode.p()) {
                if (lockFreeLinkedListNode instanceof s) {
                    return (s) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof z1) {
                    return null;
                }
            }
        }
    }

    public final void I0(z1 z1Var, Throwable th2) throws Throwable {
        M0(th2);
        z1Var.f(4);
        Object objJ = z1Var.j();
        p.h(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeK = (LockFreeLinkedListNode) objJ; !p.e(lockFreeLinkedListNodeK, z1Var); lockFreeLinkedListNodeK = lockFreeLinkedListNodeK.k()) {
            if ((lockFreeLinkedListNodeK instanceof u1) && ((u1) lockFreeLinkedListNodeK).u()) {
                try {
                    ((u1) lockFreeLinkedListNodeK).v(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        mj.d.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeK + " for " + this, th3);
                        r rVar = r.f64562a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            x0(completionHandlerException);
        }
        c0(th2);
    }

    public final void L0(vk.f<?> fVar, Object obj) {
        Object objT0;
        do {
            objT0 = t0();
            if (!(objT0 instanceof o1)) {
                if (!(objT0 instanceof z)) {
                    objT0 = v1.h(objT0);
                }
                fVar.d(objT0);
                return;
            }
        } while (U0(objT0) < 0);
        fVar.b(JobKt__JobKt.l(this, false, new d(fVar), 1, null));
    }

    public final void R0(vk.f<?> fVar, Object obj) {
        if (!B0()) {
            fVar.d(r.f64562a);
        } else {
            fVar.b(JobKt__JobKt.l(this, false, new e(fVar), 1, null));
        }
    }

    public final void S0(u1 u1Var) {
        Object objT0;
        do {
            objT0 = t0();
            if (objT0 instanceof u1) {
                if (objT0 != u1Var) {
                    return;
                }
            } else {
                if ((objT0 instanceof o1) && ((o1) objT0).b() != null) {
                    u1Var.q();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f63016b, this, objT0, v1.f64831g));
    }

    public final void T0(nk.r rVar) {
        f63017c.set(this, rVar);
    }

    public final void U(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th3 : list) {
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                mj.d.a(th2, th3);
            }
        }
    }

    public final Object W(rj.c<Object> cVar) throws Throwable {
        Object objT0;
        do {
            objT0 = t0();
            if (!(objT0 instanceof o1)) {
                if (!(objT0 instanceof z)) {
                    return v1.h(objT0);
                }
                throw ((z) objT0).f64844a;
            }
        } while (U0(objT0) < 0);
        return X(cVar);
    }

    public final boolean Y(Throwable th2) {
        return Z(th2);
    }

    public final boolean Z(Object obj) throws Throwable {
        Object objD0 = v1.f64825a;
        if (p0() && (objD0 = b0(obj)) == v1.f64826b) {
            return true;
        }
        if (objD0 == v1.f64825a) {
            objD0 = D0(obj);
        }
        if (objD0 == v1.f64825a || objD0 == v1.f64826b) {
            return true;
        }
        if (objD0 == v1.f64828d) {
            return false;
        }
        V(objD0);
        return true;
    }

    public final boolean Z0(o1 o1Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.a.a(f63016b, this, o1Var, v1.g(obj))) {
            return false;
        }
        M0(null);
        N0(obj);
        g0(o1Var, obj);
        return true;
    }

    public void a0(Throwable th2) throws Throwable {
        Z(th2);
    }

    public final boolean a1(o1 o1Var, Throwable th2) throws Throwable {
        z1 z1VarQ0 = q0(o1Var);
        if (z1VarQ0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f63016b, this, o1Var, new c(z1VarQ0, false, th2))) {
            return false;
        }
        I0(z1VarQ0, th2);
        return true;
    }

    public final Object b0(Object obj) {
        Object objB1;
        do {
            Object objT0 = t0();
            if (!(objT0 instanceof o1) || ((objT0 instanceof c) && ((c) objT0).j())) {
                return v1.f64825a;
            }
            objB1 = b1(objT0, new z(i0(obj), false, 2, null));
        } while (objB1 == v1.f64827c);
        return objB1;
    }

    public final boolean c0(Throwable th2) {
        if (A0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        nk.r rVarS0 = s0();
        if (rVarS0 != null && rVarS0 != a2.f64759b) {
            if (rVarS0.a(th2) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.JobSupport] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final Object c1(o1 o1Var, Object obj) throws Throwable {
        c cVar;
        z zVar;
        z1 z1VarQ0 = q0(o1Var);
        if (z1VarQ0 == null) {
            return v1.f64827c;
        }
        ?? r10 = 0;
        if (o1Var instanceof c) {
            cVar = (c) o1Var;
        } else {
            cVar = null;
        }
        boolean z10 = false;
        if (cVar == null) {
            cVar = new c(z1VarQ0, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            if (cVar.j()) {
                return v1.f64825a;
            }
            cVar.m(true);
            if (cVar != o1Var && !androidx.concurrent.futures.a.a(f63016b, this, o1Var, cVar)) {
                return v1.f64827c;
            }
            boolean zI = cVar.i();
            if (obj instanceof z) {
                zVar = (z) obj;
            } else {
                zVar = null;
            }
            if (zVar != null) {
                cVar.a(zVar.f64844a);
            }
            Throwable thE = cVar.e();
            if (!zI) {
                z10 = true;
            }
            if (Boolean.valueOf(z10).booleanValue()) {
                r10 = thE;
            }
            ref$ObjectRef.element = r10;
            r rVar = r.f64562a;
            if (r10 != 0) {
                I0(z1VarQ0, r10);
            }
            s sVarH0 = H0(z1VarQ0);
            if (sVarH0 != null && d1(cVar, sVarH0, obj)) {
                return v1.f64826b;
            }
            z1VarQ0.f(2);
            s sVarH1 = H0(z1VarQ0);
            if (sVarH1 != null && d1(cVar, sVarH1, obj)) {
                return v1.f64826b;
            }
            return j0(cVar, obj);
        }
    }

    @Override // kotlinx.coroutines.g
    public final boolean d() {
        return !(t0() instanceof o1);
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, bk.p<? super R, ? super kotlin.coroutines.d.b, ? extends R> pVar) {
        return (R) g.a.b(this, r10, pVar);
    }

    public final void g0(o1 o1Var, Object obj) throws Throwable {
        z zVar;
        nk.r rVarS0 = s0();
        if (rVarS0 != null) {
            rVarS0.dispose();
            T0(a2.f64759b);
        }
        Throwable th2 = null;
        if (obj instanceof z) {
            zVar = (z) obj;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            th2 = zVar.f64844a;
        }
        if (o1Var instanceof u1) {
            try {
                ((u1) o1Var).v(th2);
                return;
            } catch (Throwable th3) {
                x0(new CompletionHandlerException("Exception in completion handler " + o1Var + " for " + this, th3));
                return;
            }
        }
        z1 z1VarB = o1Var.b();
        if (z1VarB != null) {
            J0(z1VarB, th2);
        }
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <E extends kotlin.coroutines.d.b> E get(kotlin.coroutines.d.c<E> cVar) {
        return (E) g.a.c(this, cVar);
    }

    public final void h0(c cVar, s sVar, Object obj) {
        s sVarH0 = H0(sVar);
        if (sVarH0 != null && d1(cVar, sVarH0, obj)) {
            return;
        }
        cVar.b().f(2);
        s sVarH1 = H0(sVar);
        if (sVarH1 != null && d1(cVar, sVarH1, obj)) {
            return;
        }
        V(j0(cVar, obj));
    }

    @Override // kotlinx.coroutines.g
    public boolean isActive() {
        Object objT0 = t0();
        if ((objT0 instanceof o1) && ((o1) objT0).isActive()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.g
    public final boolean isCancelled() {
        Object objT0 = t0();
        if (!(objT0 instanceof z) && (!(objT0 instanceof c) || !((c) objT0).i())) {
            return false;
        }
        return true;
    }

    public final Object k0() throws Throwable {
        Object objT0 = t0();
        if (!(objT0 instanceof o1)) {
            if (!(objT0 instanceof z)) {
                return v1.h(objT0);
            }
            throw ((z) objT0).f64844a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final Throwable m0(c cVar, List<? extends Throwable> list) {
        Object next;
        boolean z10;
        Object obj = null;
        if (list.isEmpty()) {
            if (!cVar.i()) {
                return null;
            }
            return new JobCancellationException(e0(), null, this);
        }
        Iterator<T> it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            for (Object obj2 : list) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(kotlin.coroutines.d.c<?> cVar) {
        return g.a.d(this, cVar);
    }

    @Override // kotlinx.coroutines.g
    public final Object o(rj.c<? super r> cVar) {
        if (!B0()) {
            t1.h(cVar.getContext());
            return r.f64562a;
        }
        Object objC0 = C0(cVar);
        if (objC0 == sj.a.f()) {
            return objC0;
        }
        return r.f64562a;
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return g.a.e(this, dVar);
    }

    public final z1 q0(o1 o1Var) {
        z1 z1VarB = o1Var.b();
        if (z1VarB == null) {
            if (o1Var instanceof b1) {
                return new z1();
            }
            if (o1Var instanceof u1) {
                Q0((u1) o1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + o1Var).toString());
        }
        return z1VarB;
    }

    public g r0() {
        nk.r rVarS0 = s0();
        if (rVarS0 != null) {
            return rVarS0.getParent();
        }
        return null;
    }

    @Override // nk.t
    public final void s(c2 c2Var) throws Throwable {
        Z(c2Var);
    }

    public final nk.r s0() {
        return (nk.r) f63017c.get(this);
    }

    @Override // kotlinx.coroutines.g
    public final boolean start() {
        int iU0;
        do {
            iU0 = U0(t0());
            if (iU0 == 0) {
                return false;
            }
        } while (iU0 != 1);
        return true;
    }

    public final Object t0() {
        return f63016b.get(this);
    }

    public final y0 z0(boolean z10, u1 u1Var) {
        boolean z11;
        Throwable th2;
        z zVar;
        boolean zC;
        c cVar;
        Throwable thE;
        u1Var.w(this);
        while (true) {
            Object objT0 = t0();
            z11 = true;
            th2 = null;
            if (objT0 instanceof b1) {
                b1 b1Var = (b1) objT0;
                if (b1Var.isActive()) {
                    if (androidx.concurrent.futures.a.a(f63016b, this, objT0, u1Var)) {
                        break;
                    }
                } else {
                    P0(b1Var);
                }
            } else if (objT0 instanceof o1) {
                o1 o1Var = (o1) objT0;
                z1 z1VarB = o1Var.b();
                if (z1VarB == null) {
                    p.h(objT0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q0((u1) objT0);
                } else {
                    if (u1Var.u()) {
                        if (o1Var instanceof c) {
                            cVar = (c) o1Var;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            thE = cVar.e();
                        } else {
                            thE = null;
                        }
                        if (thE == null) {
                            zC = z1VarB.c(u1Var, 5);
                        } else {
                            if (z10) {
                                u1Var.v(thE);
                            }
                            return a2.f64759b;
                        }
                    } else {
                        zC = z1VarB.c(u1Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (z11) {
            return u1Var;
        }
        if (z10) {
            Object objT1 = t0();
            if (objT1 instanceof z) {
                zVar = (z) objT1;
            } else {
                zVar = null;
            }
            if (zVar != null) {
                th2 = zVar.f64844a;
            }
            u1Var.v(th2);
        }
        return a2.f64759b;
    }

    public void x0(Throwable th2) throws Throwable {
        throw th2;
    }
}
