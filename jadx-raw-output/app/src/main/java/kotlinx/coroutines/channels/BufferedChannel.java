package kotlinx.coroutines.channels;

import bk.l;
import bk.q;
import ck.p;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jk.g;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.c;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import mj.r;
import nj.s;
import nk.o;
import nk.q2;
import pk.d;
import pk.i;
import sk.a0;
import sk.b0;
import sk.c0;
import sk.k;
import sk.w;
import vk.f;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public class BufferedChannel<E> implements d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f63040e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f63041f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f63042g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f63043h = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63044i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63045j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63046k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63047l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63048m = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63049b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<E, r> f63050c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> f63051d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: BufferedChannel.kt */
    public final class a implements pk.f<E>, q2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f63052b = BufferedChannelKt.f63072p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<? super Boolean> f63053c;

        public a() {
        }

        @Override // pk.f
        public Object a(rj.c<? super Boolean> cVar) throws Throwable {
            i<E> iVar;
            boolean zG = true;
            if (this.f63052b == BufferedChannelKt.f63072p || this.f63052b == BufferedChannelKt.z()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                i<E> iVar2 = (i) BufferedChannel.g0().get(bufferedChannel);
                while (!bufferedChannel.u0()) {
                    long andIncrement = BufferedChannel.h0().getAndIncrement(bufferedChannel);
                    int i10 = BufferedChannelKt.f63058b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (iVar2.f71936d != j10) {
                        i<E> iVarX = bufferedChannel.X(j10, iVar2);
                        if (iVarX == null) {
                            continue;
                        } else {
                            iVar = iVarX;
                        }
                    } else {
                        iVar = iVar2;
                    }
                    Object objH1 = bufferedChannel.h1(iVar, i11, andIncrement, null);
                    if (objH1 == BufferedChannelKt.f63069m) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    if (objH1 == BufferedChannelKt.f63071o) {
                        if (andIncrement < bufferedChannel.m0()) {
                            iVar.c();
                        }
                        iVar2 = iVar;
                    } else {
                        if (objH1 == BufferedChannelKt.f63070n) {
                            return f(iVar, i11, andIncrement, cVar);
                        }
                        iVar.c();
                        this.f63052b = objH1;
                    }
                }
                zG = g();
            }
            return tj.a.a(zG);
        }

        @Override // nk.q2
        public void c(a0<?> a0Var, int i10) {
            c<? super Boolean> cVar = this.f63053c;
            if (cVar != null) {
                cVar.c(a0Var, i10);
            }
        }

        public final Object f(i<E> iVar, int i10, long j10, rj.c<? super Boolean> cVar) {
            Boolean boolA;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            c cVarB = o.b(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
            try {
                this.f63053c = cVarB;
                Object objH1 = bufferedChannel.h1(iVar, i10, j10, this);
                if (objH1 != BufferedChannelKt.f63069m) {
                    q qVarG = null;
                    if (objH1 == BufferedChannelKt.f63071o) {
                        if (j10 < bufferedChannel.m0()) {
                            iVar.c();
                        }
                        i iVar2 = (i) BufferedChannel.g0().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.u0()) {
                                h();
                                break;
                            }
                            long andIncrement = BufferedChannel.h0().getAndIncrement(bufferedChannel);
                            int i11 = BufferedChannelKt.f63058b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (iVar2.f71936d != j11) {
                                i iVarX = bufferedChannel.X(j11, iVar2);
                                if (iVarX != null) {
                                    iVar2 = iVarX;
                                }
                            }
                            Object objH2 = bufferedChannel.h1(iVar2, i12, andIncrement, this);
                            if (objH2 == BufferedChannelKt.f63069m) {
                                bufferedChannel.P0(this, iVar2, i12);
                                break;
                            }
                            if (objH2 == BufferedChannelKt.f63071o) {
                                if (andIncrement < bufferedChannel.m0()) {
                                    iVar2.c();
                                }
                            } else {
                                if (objH2 == BufferedChannelKt.f63070n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                iVar2.c();
                                this.f63052b = objH2;
                                this.f63053c = null;
                                boolA = tj.a.a(true);
                                l<E, r> lVar = bufferedChannel.f63050c;
                                if (lVar != null) {
                                    qVarG = bufferedChannel.G(lVar, objH2);
                                }
                            }
                        }
                    } else {
                        iVar.c();
                        this.f63052b = objH1;
                        this.f63053c = null;
                        boolA = tj.a.a(true);
                        l<E, r> lVar2 = bufferedChannel.f63050c;
                        if (lVar2 != null) {
                            qVarG = bufferedChannel.G(lVar2, objH1);
                        }
                    }
                    cVarB.M(boolA, qVarG);
                    break;
                }
                bufferedChannel.P0(this, iVar, i10);
                Object objB = cVarB.B();
                if (objB == sj.a.f()) {
                    tj.f.c(cVar);
                }
                return objB;
            } catch (Throwable th2) {
                cVarB.T();
                throw th2;
            }
        }

        public final void h() {
            c<? super Boolean> cVar = this.f63053c;
            p.g(cVar);
            this.f63053c = null;
            this.f63052b = BufferedChannelKt.z();
            Throwable thC0 = BufferedChannel.this.c0();
            if (thC0 == null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(thC0)));
            }
        }

        public final boolean i(E e10) {
            c<? super Boolean> cVar = this.f63053c;
            p.g(cVar);
            this.f63053c = null;
            this.f63052b = e10;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            l<E, r> lVar = bufferedChannel.f63050c;
            return BufferedChannelKt.B(cVar, bool, lVar != null ? bufferedChannel.G(lVar, e10) : null);
        }

        public final void j() {
            c<? super Boolean> cVar = this.f63053c;
            p.g(cVar);
            this.f63053c = null;
            this.f63052b = BufferedChannelKt.z();
            Throwable thC0 = BufferedChannel.this.c0();
            if (thC0 == null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(thC0)));
            }
        }

        @Override // pk.f
        public E next() throws Throwable {
            E e10 = (E) this.f63052b;
            if (!(e10 != BufferedChannelKt.f63072p)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f63052b = BufferedChannelKt.f63072p;
            if (e10 != BufferedChannelKt.z()) {
                return e10;
            }
            throw c0.a(BufferedChannel.this.f0());
        }

        public final boolean g() throws Throwable {
            this.f63052b = BufferedChannelKt.z();
            Throwable thC0 = BufferedChannel.this.c0();
            if (thC0 == null) {
                return false;
            }
            throw c0.a(thC0);
        }
    }

    /* JADX INFO: compiled from: BufferedChannel.kt */
    public static final class b implements q2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<Boolean> f63055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nk.l<Boolean> f63056c;

        @Override // nk.q2
        public void c(a0<?> a0Var, int i10) {
            this.f63055b.c(a0Var, i10);
        }

        public final nk.l<Boolean> a() {
            return this.f63056c;
        }
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater g0() {
        return f63045j;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater h0() {
        return f63041f;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater k0() {
        return f63044i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater l0() {
        return f63040e;
    }

    public void G0() {
    }

    @Override // pk.q
    public boolean J(Throwable th2) {
        return Q(th2, false);
    }

    @Override // pk.p
    public Object L(rj.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar) {
        return S0(this, cVar);
    }

    public void L0() {
    }

    public void M0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(i<E> iVar, long j10) {
        Object objB = k.b(null, 1, null);
        loop0: while (iVar != null) {
            for (int i10 = BufferedChannelKt.f63058b - 1; -1 < i10; i10--) {
                if ((iVar.f71936d * ((long) BufferedChannelKt.f63058b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = iVar.B(i10);
                    if (objB2 != null && objB2 != BufferedChannelKt.f63061e) {
                        if (!(objB2 instanceof pk.r)) {
                            if (!(objB2 instanceof q2)) {
                                break;
                            }
                            if (iVar.v(i10, objB2, BufferedChannelKt.z())) {
                                objB = k.c(objB, objB2);
                                iVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (iVar.v(i10, objB2, BufferedChannelKt.z())) {
                                objB = k.c(objB, ((pk.r) objB2).f66161a);
                                iVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (iVar.v(i10, objB2, BufferedChannelKt.z())) {
                            iVar.t();
                            break;
                        }
                    }
                }
            }
            iVar = (i) iVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                W0((q2) objB);
                return;
            }
            p.h(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                W0((q2) arrayList.get(size));
            }
        }
    }

    public final i<E> W(long j10, i<E> iVar, long j11) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63046k;
        bk.p pVar = (bk.p) BufferedChannelKt.y();
        do {
            objC = sk.a.c(iVar, j10, pVar);
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
        if (b0.c(objC)) {
            T();
            D0(j10, iVar);
            q0(this, 0L, 1, null);
            return null;
        }
        i<E> iVar2 = (i) b0.b(objC);
        if (iVar2.f71936d <= j10) {
            return iVar2;
        }
        long j12 = iVar2.f71936d;
        int i10 = BufferedChannelKt.f63058b;
        if (f63042g.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            p0((iVar2.f71936d * ((long) i10)) - j11);
            return null;
        }
        q0(this, 0L, 1, null);
        return null;
    }

    public final void W0(q2 q2Var) {
        Y0(q2Var, true);
    }

    public final void X0(q2 q2Var) {
        Y0(q2Var, false);
    }

    @Override // pk.p
    public Object e(rj.c<? super E> cVar) {
        return R0(this, cVar);
    }

    @Override // pk.q
    public Object u(E e10, rj.c<? super r> cVar) {
        return Z0(this, e10, cVar);
    }

    public final boolean v0(long j10) {
        return t0(j10, true);
    }

    public final boolean w0(long j10) {
        return t0(j10, false);
    }

    public boolean x0() {
        return false;
    }

    public static final q N0(final BufferedChannel bufferedChannel, final f fVar, Object obj, final Object obj2) {
        return new q() { // from class: pk.c
            @Override // bk.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return BufferedChannel.O0(obj2, bufferedChannel, fVar, (Throwable) obj3, obj4, (kotlin.coroutines.d) obj5);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ <E> Object S0(BufferedChannel<E> bufferedChannel, rj.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar) throws Throwable {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        i<E> iVar;
        if (cVar instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) cVar;
            int i10 = bufferedChannel$receiveCatching$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i10 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, cVar);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, cVar);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.result;
        Object objF = sj.a.f();
        int i11 = bufferedChannel$receiveCatching$2.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return ((kotlinx.coroutines.channels.a) obj).k();
        }
        kotlin.c.b(obj);
        i<E> iVar2 = (i) g0().get(bufferedChannel);
        while (!bufferedChannel.u0()) {
            long andIncrement = h0().getAndIncrement(bufferedChannel);
            int i12 = BufferedChannelKt.f63058b;
            long j10 = andIncrement / ((long) i12);
            int i13 = (int) (andIncrement % ((long) i12));
            if (iVar2.f71936d != j10) {
                i<E> iVarX = bufferedChannel.X(j10, iVar2);
                if (iVarX == null) {
                    continue;
                } else {
                    iVar = iVarX;
                }
            } else {
                iVar = iVar2;
            }
            Object objH1 = bufferedChannel.h1(iVar, i13, andIncrement, null);
            if (objH1 == BufferedChannelKt.f63069m) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (objH1 != BufferedChannelKt.f63071o) {
                if (objH1 != BufferedChannelKt.f63070n) {
                    iVar.c();
                    return kotlinx.coroutines.channels.a.f63077b.c(objH1);
                }
                bufferedChannel$receiveCatching$2.label = 1;
                Object objT0 = bufferedChannel.T0(iVar, i13, andIncrement, bufferedChannel$receiveCatching$2);
                return objT0 == objF ? objF : objT0;
            }
            if (andIncrement < bufferedChannel.m0()) {
                iVar.c();
            }
            iVar2 = iVar;
        }
        return kotlinx.coroutines.channels.a.f63077b.a(bufferedChannel.c0());
    }

    public static /* synthetic */ void q0(BufferedChannel bufferedChannel, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bufferedChannel.p0(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(long j10, i<E> iVar) {
        boolean z10;
        i<E> iVar2;
        i<E> iVar3;
        while (iVar.f71936d < j10 && (iVar3 = (i) iVar.f()) != null) {
            iVar = iVar3;
        }
        while (true) {
            if (!iVar.k() || (iVar2 = (i) iVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63046k;
                while (true) {
                    a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (a0Var.f71936d >= iVar.f71936d) {
                        break;
                    }
                    if (!iVar.u()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, a0Var, iVar)) {
                        if (!a0Var.p()) {
                            break;
                        }
                        a0Var.n();
                        break;
                    } else if (iVar.p()) {
                        iVar.n();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                iVar = iVar2;
            }
        }
    }

    public final void E0(Throwable th2, Object obj, kotlin.coroutines.d dVar) {
        l<E, r> lVar = this.f63050c;
        p.g(lVar);
        Object objF = kotlinx.coroutines.channels.a.f(obj);
        p.g(objF);
        w.a(lVar, objF, dVar);
    }

    public final void F0(Throwable th2, E e10, kotlin.coroutines.d dVar) {
        l<E, r> lVar = this.f63050c;
        p.g(lVar);
        w.a(lVar, e10, dVar);
    }

    public final q<Throwable, Object, kotlin.coroutines.d, r> G(final l<? super E, r> lVar, final E e10) {
        return new q() { // from class: pk.a
            @Override // bk.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.I(lVar, e10, (Throwable) obj, obj2, (kotlin.coroutines.d) obj3);
            }
        };
    }

    public final g<r> H(l<? super E, r> lVar) {
        return new BufferedChannel$bindCancellationFun$2(this);
    }

    public final void H0(nk.l<? super kotlinx.coroutines.channels.a<? extends E>> lVar) {
        Result.a aVar = Result.Companion;
        lVar.resumeWith(Result.m3458constructorimpl(kotlinx.coroutines.channels.a.b(kotlinx.coroutines.channels.a.f63077b.a(c0()))));
    }

    public final void I0(nk.l<? super E> lVar) {
        Result.a aVar = Result.Companion;
        lVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(f0())));
    }

    public final Object J0(E e10, rj.c<? super r> cVar) {
        UndeliveredElementException undeliveredElementExceptionC;
        c cVar2 = new c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        l<E, r> lVar = this.f63050c;
        if (lVar == null || (undeliveredElementExceptionC = w.c(lVar, e10, null, 2, null)) == null) {
            Throwable thJ0 = j0();
            Result.a aVar = Result.Companion;
            cVar2.resumeWith(Result.m3458constructorimpl(kotlin.c.a(thJ0)));
        } else {
            mj.d.a(undeliveredElementExceptionC, j0());
            Result.a aVar2 = Result.Companion;
            cVar2.resumeWith(Result.m3458constructorimpl(kotlin.c.a(undeliveredElementExceptionC)));
        }
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB == sj.a.f() ? objB : r.f64562a;
    }

    public final g<r> K(l<? super E, r> lVar) {
        return new BufferedChannel$bindCancellationFunResult$1(this);
    }

    public final void K0(E e10, nk.l<? super r> lVar) {
        l<E, r> lVar2 = this.f63050c;
        if (lVar2 != null) {
            w.a(lVar2, e10, lVar.getContext());
        }
        Throwable thJ0 = j0();
        Result.a aVar = Result.Companion;
        lVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(thJ0)));
    }

    public boolean N(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return Q(th2, true);
    }

    public boolean Q(Throwable th2, boolean z10) {
        if (z10) {
            A0();
        }
        boolean zA = androidx.concurrent.futures.a.a(f63047l, this, BufferedChannelKt.f63075s, th2);
        if (z10) {
            B0();
        } else {
            C0();
        }
        T();
        G0();
        if (zA) {
            r0();
        }
        return zA;
    }

    public final void Q0(q2 q2Var, i<E> iVar, int i10) {
        q2Var.c(iVar, i10 + BufferedChannelKt.f63058b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object T0(i<E> iVar, int i10, long j10, rj.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        kotlinx.coroutines.channels.a aVarB;
        q qVar;
        if (cVar instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) cVar;
            int i11 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, cVar);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, cVar);
        }
        Object objB = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        Object objF = sj.a.f();
        int i12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i12 == 0) {
            kotlin.c.b(objB);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = iVar;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i10;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j10;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            c cVarB = o.b(IntrinsicsKt__IntrinsicsJvmKt.c(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                p.h(cVarB, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                pk.o oVar = new pk.o(cVarB);
                Object objH1 = h1(iVar, i10, j10, oVar);
                if (objH1 != BufferedChannelKt.f63069m) {
                    if (objH1 == BufferedChannelKt.f63071o) {
                        if (j10 < m0()) {
                            iVar.c();
                        }
                        i iVar2 = (i) g0().get(this);
                        while (true) {
                            if (u0()) {
                                H0(cVarB);
                                break;
                            }
                            long andIncrement = h0().getAndIncrement(this);
                            int i13 = BufferedChannelKt.f63058b;
                            long j11 = andIncrement / ((long) i13);
                            int i14 = (int) (andIncrement % ((long) i13));
                            if (iVar2.f71936d != j11) {
                                i iVarX = X(j11, iVar2);
                                if (iVarX != null) {
                                    iVar2 = iVarX;
                                }
                            }
                            Object objH2 = h1(iVar2, i14, andIncrement, oVar);
                            if (objH2 == BufferedChannelKt.f63069m) {
                                P0(oVar, iVar2, i14);
                                break;
                            }
                            if (objH2 == BufferedChannelKt.f63071o) {
                                if (andIncrement < m0()) {
                                    iVar2.c();
                                }
                            } else {
                                if (objH2 == BufferedChannelKt.f63070n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                iVar2.c();
                                aVarB = kotlinx.coroutines.channels.a.b(kotlinx.coroutines.channels.a.f63077b.c(objH2));
                                l<E, r> lVar = this.f63050c;
                                qVar = (q) (lVar != null ? K(lVar) : null);
                            }
                        }
                    } else {
                        iVar.c();
                        aVarB = kotlinx.coroutines.channels.a.b(kotlinx.coroutines.channels.a.f63077b.c(objH1));
                        l<E, r> lVar2 = this.f63050c;
                        qVar = (q) (lVar2 != null ? K(lVar2) : null);
                    }
                    cVarB.M(aVarB, qVar);
                    break;
                }
                P0(oVar, iVar, i10);
                objB = cVarB.B();
                if (objB == sj.a.f()) {
                    tj.f.c(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1);
                }
                if (objB == objF) {
                    return objF;
                }
            } catch (Throwable th2) {
                cVarB.T();
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objB);
        }
        return ((kotlinx.coroutines.channels.a) objB).k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(i<E> iVar) {
        l<E, r> lVar = this.f63050c;
        UndeliveredElementException undeliveredElementExceptionB = null;
        Object objB = k.b(null, 1, null);
        loop0: do {
            for (int i10 = BufferedChannelKt.f63058b - 1; -1 < i10; i10--) {
                long j10 = (iVar.f71936d * ((long) BufferedChannelKt.f63058b)) + ((long) i10);
                while (true) {
                    Object objB2 = iVar.B(i10);
                    if (objB2 == BufferedChannelKt.f63065i) {
                        break loop0;
                    }
                    if (objB2 != BufferedChannelKt.f63060d) {
                        if (objB2 != BufferedChannelKt.f63061e && objB2 != null) {
                            if (!(objB2 instanceof q2) && !(objB2 instanceof pk.r)) {
                                if (objB2 != BufferedChannelKt.f63063g && objB2 != BufferedChannelKt.f63062f) {
                                    if (objB2 != BufferedChannelKt.f63063g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j10 < i0()) {
                                    break loop0;
                                }
                                q2 q2Var = objB2 instanceof pk.r ? ((pk.r) objB2).f66161a : (q2) objB2;
                                if (iVar.v(i10, objB2, BufferedChannelKt.z())) {
                                    if (lVar != null) {
                                        undeliveredElementExceptionB = w.b(lVar, iVar.A(i10), undeliveredElementExceptionB);
                                    }
                                    objB = k.c(objB, q2Var);
                                    iVar.w(i10);
                                    iVar.t();
                                    break;
                                }
                            }
                        } else {
                            if (iVar.v(i10, objB2, BufferedChannelKt.z())) {
                                iVar.t();
                                break;
                            }
                        }
                    } else {
                        if (j10 < i0()) {
                            break loop0;
                        }
                        if (iVar.v(i10, objB2, BufferedChannelKt.z())) {
                            if (lVar != null) {
                                undeliveredElementExceptionB = w.b(lVar, iVar.A(i10), undeliveredElementExceptionB);
                            }
                            iVar.w(i10);
                            iVar.t();
                            break;
                        }
                    }
                }
            }
            iVar = (i) iVar.h();
        } while (iVar != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                p.h(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    X0((q2) arrayList.get(size));
                }
            } else {
                X0((q2) objB);
            }
        }
        if (undeliveredElementExceptionB != null) {
            throw undeliveredElementExceptionB;
        }
    }

    public final void Y0(q2 q2Var, boolean z10) {
        if (q2Var instanceof b) {
            nk.l<Boolean> lVarA = ((b) q2Var).a();
            Result.a aVar = Result.Companion;
            lVarA.resumeWith(Result.m3458constructorimpl(Boolean.FALSE));
            return;
        }
        if (q2Var instanceof nk.l) {
            rj.c cVar = (rj.c) q2Var;
            Result.a aVar2 = Result.Companion;
            cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(z10 ? f0() : j0())));
        } else if (q2Var instanceof pk.o) {
            c<kotlinx.coroutines.channels.a<? extends E>> cVar2 = ((pk.o) q2Var).f66160b;
            Result.a aVar3 = Result.Companion;
            cVar2.resumeWith(Result.m3458constructorimpl(kotlinx.coroutines.channels.a.b(kotlinx.coroutines.channels.a.f63077b.a(c0()))));
        } else if (q2Var instanceof a) {
            ((a) q2Var).j();
        } else {
            if (q2Var instanceof f) {
                ((f) q2Var).e(this, BufferedChannelKt.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + q2Var).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    public final Object a1(i<E> iVar, int i10, E e10, long j10, rj.c<? super r> cVar) {
        Object objM3458constructorimpl;
        Object objB;
        i iVar2;
        c cVarB = o.b(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        try {
            int iJ1 = j1(iVar, i10, e10, j10, cVarB, false);
            if (iJ1 == 0) {
                iVar.c();
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            } else {
                if (iJ1 != 1) {
                    if (iJ1 != 2) {
                        if (iJ1 != 4) {
                            if (iJ1 != 5) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            iVar.c();
                            i iVar3 = (i) k0().get(this);
                            while (true) {
                                long andIncrement = l0().getAndIncrement(this);
                                long j11 = andIncrement & 1152921504606846975L;
                                boolean zW0 = w0(andIncrement);
                                int i11 = BufferedChannelKt.f63058b;
                                long j12 = j11 / ((long) i11);
                                int i12 = (int) (j11 % ((long) i11));
                                if (iVar3.f71936d != j12) {
                                    i iVarY = Y(j12, iVar3);
                                    if (iVarY != null) {
                                        iVar2 = iVarY;
                                    } else if (zW0) {
                                    }
                                } else {
                                    iVar2 = iVar3;
                                }
                                i iVar4 = iVar2;
                                int iJ2 = j1(iVar2, i12, e10, j11, cVarB, zW0);
                                if (iJ2 == 0) {
                                    iVar4.c();
                                    Result.a aVar2 = Result.Companion;
                                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                                } else if (iJ2 == 1) {
                                    Result.a aVar3 = Result.Companion;
                                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                                } else if (iJ2 == 2) {
                                    if (!zW0) {
                                        c cVar2 = cVarB instanceof q2 ? cVarB : null;
                                        if (cVar2 == null) {
                                            break;
                                        }
                                        Q0(cVar2, iVar4, i12);
                                        break;
                                    }
                                    iVar4.t();
                                } else {
                                    if (iJ2 == 3) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    if (iJ2 != 4) {
                                        if (iJ2 == 5) {
                                            iVar4.c();
                                        }
                                        iVar3 = iVar4;
                                    } else if (j11 < i0()) {
                                        iVar4.c();
                                    }
                                }
                            }
                        } else if (j10 < i0()) {
                            iVar.c();
                        }
                        K0(e10, cVarB);
                        break;
                    } else {
                        Q0(cVarB, iVar, i10);
                    }
                    objB = cVarB.B();
                    if (objB == sj.a.f()) {
                        tj.f.c(cVar);
                    }
                    if (objB == sj.a.f()) {
                        return objB;
                    }
                    return r.f64562a;
                }
                Result.a aVar4 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            }
            cVarB.resumeWith(objM3458constructorimpl);
            objB = cVarB.B();
            if (objB == sj.a.f()) {
                tj.f.c(cVar);
            }
            if (objB == sj.a.f()) {
                return objB;
            }
            return r.f64562a;
        } catch (Throwable th2) {
            cVarB.T();
            throw th2;
        }
    }

    public final boolean c1(Object obj, E e10) {
        if (obj instanceof f) {
            return ((f) obj).e(this, e10);
        }
        if (obj instanceof pk.o) {
            p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            c<kotlinx.coroutines.channels.a<? extends E>> cVar = ((pk.o) obj).f66160b;
            kotlinx.coroutines.channels.a aVarB = kotlinx.coroutines.channels.a.b(kotlinx.coroutines.channels.a.f63077b.c(e10));
            l<E, r> lVar = this.f63050c;
            return BufferedChannelKt.B(cVar, aVarB, (q) (lVar != null ? K(lVar) : null));
        }
        if (obj instanceof a) {
            p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (obj instanceof nk.l) {
            p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            nk.l lVar2 = (nk.l) obj;
            l<E, r> lVar3 = this.f63050c;
            return BufferedChannelKt.B(lVar2, e10, (q) (lVar3 != null ? H(lVar3) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final boolean d1(Object obj, i<E> iVar, int i10) {
        if (obj instanceof nk.l) {
            p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.C((nk.l) obj, r.f64562a, null, 2, null);
        }
        if (obj instanceof f) {
            p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailedResultX = ((SelectImplementation) obj).x(this, r.f64562a);
            if (trySelectDetailedResultX == TrySelectDetailedResult.REREGISTER) {
                iVar.w(i10);
            }
            return trySelectDetailedResultX == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return BufferedChannelKt.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object e1(E e10) {
        i iVar;
        Object obj = BufferedChannelKt.f63060d;
        i iVar2 = (i) k0().get(this);
        while (true) {
            long andIncrement = l0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zW0 = w0(andIncrement);
            int i10 = BufferedChannelKt.f63058b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (iVar2.f71936d != j11) {
                i iVarY = Y(j11, iVar2);
                if (iVarY != null) {
                    iVar = iVarY;
                } else if (zW0) {
                    return kotlinx.coroutines.channels.a.f63077b.a(j0());
                }
            } else {
                iVar = iVar2;
            }
            int iJ1 = j1(iVar, i11, e10, j10, obj, zW0);
            if (iJ1 == 0) {
                iVar.c();
                return kotlinx.coroutines.channels.a.f63077b.c(r.f64562a);
            }
            if (iJ1 == 1) {
                return kotlinx.coroutines.channels.a.f63077b.c(r.f64562a);
            }
            if (iJ1 == 2) {
                if (zW0) {
                    iVar.t();
                    return kotlinx.coroutines.channels.a.f63077b.a(j0());
                }
                q2 q2Var = obj instanceof q2 ? (q2) obj : null;
                if (q2Var != null) {
                    Q0(q2Var, iVar, i11);
                }
                U((iVar.f71936d * ((long) i10)) + ((long) i11));
                return kotlinx.coroutines.channels.a.f63077b.c(r.f64562a);
            }
            if (iJ1 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iJ1 == 4) {
                if (j10 < i0()) {
                    iVar.c();
                }
                return kotlinx.coroutines.channels.a.f63077b.a(j0());
            }
            if (iJ1 == 5) {
                iVar.c();
            }
            iVar2 = iVar;
        }
    }

    @Override // pk.p
    public pk.f<E> iterator() {
        return new a();
    }

    public final void n1(long j10) {
        long j11;
        long j12;
        if (y0()) {
            return;
        }
        while (a0() <= j10) {
        }
        int i10 = BufferedChannelKt.f63059c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jA0 = a0();
            if (jA0 == (f63043h.get(this) & 4611686018427387903L) && jA0 == a0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63043h;
        do {
            j11 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, BufferedChannelKt.v(j11 & 4611686018427387903L, true)));
        while (true) {
            long jA1 = a0();
            long j13 = f63043h.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (jA1 == j14 && jA1 == a0()) {
                break;
            } else if (!z10) {
                f63043h.compareAndSet(this, j13, BufferedChannelKt.v(j14, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f63043h;
        do {
            j12 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, BufferedChannelKt.v(j12 & 4611686018427387903L, false)));
    }

    public final boolean t0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            S(j10 & 1152921504606846975L);
            if (z10 && o0()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            R(j10 & 1152921504606846975L);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f63040e.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f63049b + ',');
        sb2.append("data=[");
        int i11 = 0;
        List listN = s.n(f63045j.get(this), f63044i.get(this), f63046k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (((i) obj) != BufferedChannelKt.f63057a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((i) next).f71936d;
            do {
                Object next2 = it.next();
                long j11 = ((i) next2).f71936d;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        i iVar = (i) next;
        long jI0 = i0();
        long jM0 = m0();
        loop2: while (true) {
            int i12 = BufferedChannelKt.f63058b;
            for (int i13 = i11; i13 < i12; i13++) {
                long j12 = (iVar.f71936d * ((long) BufferedChannelKt.f63058b)) + ((long) i13);
                if (j12 >= jM0 && j12 >= jI0) {
                    break loop2;
                }
                Object objB = iVar.B(i13);
                Object objA = iVar.A(i13);
                if (objB instanceof nk.l) {
                    string = (j12 >= jI0 || j12 < jM0) ? (j12 >= jM0 || j12 < jI0) ? "cont" : "send" : "receive";
                } else if (objB instanceof f) {
                    string = (j12 >= jI0 || j12 < jM0) ? (j12 >= jM0 || j12 < jI0) ? "select" : "onSend" : "onReceive";
                } else if (objB instanceof pk.o) {
                    string = "receiveCatching";
                } else if (objB instanceof b) {
                    string = "sendBroadcast";
                } else if (objB instanceof pk.r) {
                    string = "EB(" + objB + ')';
                } else if (p.e(objB, BufferedChannelKt.f63062f) || p.e(objB, BufferedChannelKt.f63063g)) {
                    string = "resuming_sender";
                } else {
                    if (objB != null && !p.e(objB, BufferedChannelKt.f63061e) && !p.e(objB, BufferedChannelKt.f63065i) && !p.e(objB, BufferedChannelKt.f63064h) && !p.e(objB, BufferedChannelKt.f63067k) && !p.e(objB, BufferedChannelKt.f63066j) && !p.e(objB, BufferedChannelKt.z())) {
                        string = objB.toString();
                    }
                }
                if (objA != null) {
                    sb2.append('(' + string + ',' + objA + "),");
                } else {
                    sb2.append(string + ',');
                }
            }
            iVar = (i) iVar.f();
            if (iVar == null) {
                break;
            }
            i11 = 0;
        }
        if (lk.c0.t1(sb2) == ',') {
            p.i(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long z0(i<E> iVar) {
        do {
            int i10 = BufferedChannelKt.f63058b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (iVar.f71936d * ((long) BufferedChannelKt.f63058b)) + ((long) i10);
                    if (j10 >= i0()) {
                        while (true) {
                            Object objB = iVar.B(i10);
                            if (objB != null && objB != BufferedChannelKt.f63061e) {
                                if (objB != BufferedChannelKt.f63060d) {
                                    break;
                                }
                                return j10;
                            }
                            if (iVar.v(i10, objB, BufferedChannelKt.z())) {
                                iVar.t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            iVar = (i) iVar.h();
        } while (iVar != null);
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i10, l<? super E, r> lVar) {
        boolean z10;
        q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> qVar;
        this.f63049b = i10;
        this.f63050c = lVar;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.bufferEnd$volatile = BufferedChannelKt.A(i10);
            this.completedExpandBuffersAndPauseFlag$volatile = a0();
            i iVar = new i(0L, null, this, 3);
            this.sendSegment$volatile = iVar;
            this.receiveSegment$volatile = iVar;
            if (y0()) {
                iVar = BufferedChannelKt.f63057a;
                p.h(iVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = iVar;
            if (lVar != 0) {
                qVar = new q() { // from class: pk.b
                    @Override // bk.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BufferedChannel.N0(this.f66151b, (vk.f) obj, obj2, obj3);
                    }
                };
            } else {
                qVar = null;
            }
            this.f63051d = qVar;
            this._closeCause$volatile = BufferedChannelKt.f63075s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    public static final r I(l lVar, Object obj, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        w.a(lVar, obj, dVar);
        return r.f64562a;
    }

    public static final r O0(Object obj, BufferedChannel bufferedChannel, f fVar, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        if (obj != BufferedChannelKt.z()) {
            w.a(bufferedChannel.f63050c, obj, fVar.getContext());
        }
        return r.f64562a;
    }

    public static /* synthetic */ <E> Object R0(BufferedChannel<E> bufferedChannel, rj.c<? super E> cVar) throws Throwable {
        i<E> iVar = (i) g0().get(bufferedChannel);
        while (!bufferedChannel.u0()) {
            long andIncrement = h0().getAndIncrement(bufferedChannel);
            int i10 = BufferedChannelKt.f63058b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (iVar.f71936d != j10) {
                i<E> iVarX = bufferedChannel.X(j10, iVar);
                if (iVarX == null) {
                    continue;
                } else {
                    iVar = iVarX;
                }
            }
            Object objH1 = bufferedChannel.h1(iVar, i11, andIncrement, null);
            if (objH1 != BufferedChannelKt.f63069m) {
                if (objH1 == BufferedChannelKt.f63071o) {
                    if (andIncrement < bufferedChannel.m0()) {
                        iVar.c();
                    }
                } else {
                    if (objH1 == BufferedChannelKt.f63070n) {
                        return bufferedChannel.U0(iVar, i11, andIncrement, cVar);
                    }
                    iVar.c();
                    return objH1;
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw c0.a(bufferedChannel.f0());
    }

    public static /* synthetic */ <E> Object Z0(BufferedChannel<E> bufferedChannel, E e10, rj.c<? super r> cVar) {
        i<E> iVar = (i) k0().get(bufferedChannel);
        while (true) {
            long andIncrement = l0().getAndIncrement(bufferedChannel);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zW0 = bufferedChannel.w0(andIncrement);
            int i10 = BufferedChannelKt.f63058b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (iVar.f71936d != j11) {
                i<E> iVarY = bufferedChannel.Y(j11, iVar);
                if (iVarY == null) {
                    if (zW0) {
                        Object objJ0 = bufferedChannel.J0(e10, cVar);
                        if (objJ0 != sj.a.f()) {
                            break;
                        }
                        return objJ0;
                    }
                } else {
                    iVar = iVarY;
                }
            }
            int iJ1 = bufferedChannel.j1(iVar, i11, e10, j10, null, zW0);
            if (iJ1 != 0) {
                if (iJ1 != 1) {
                    if (iJ1 != 2) {
                        if (iJ1 != 3) {
                            if (iJ1 != 4) {
                                if (iJ1 == 5) {
                                    iVar.c();
                                }
                            } else {
                                if (j10 < bufferedChannel.i0()) {
                                    iVar.c();
                                }
                                Object objJ1 = bufferedChannel.J0(e10, cVar);
                                if (objJ1 != sj.a.f()) {
                                    break;
                                }
                                return objJ1;
                            }
                        } else {
                            Object objA1 = bufferedChannel.a1(iVar, i11, e10, j10, cVar);
                            if (objA1 != sj.a.f()) {
                                break;
                            }
                            return objA1;
                        }
                    } else {
                        if (!zW0) {
                            break;
                        }
                        iVar.t();
                        Object objJ2 = bufferedChannel.J0(e10, cVar);
                        if (objJ2 != sj.a.f()) {
                            break;
                        }
                        return objJ2;
                    }
                } else {
                    break;
                }
            } else {
                iVar.c();
                break;
            }
        }
        return r.f64562a;
    }

    public final void A0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63040e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.w(1152921504606846975L & j10, 1)));
    }

    public final void B0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63040e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.w(1152921504606846975L & j10, 3)));
    }

    @Override // pk.q
    public void C(l<? super Throwable, r> lVar) {
        if (androidx.concurrent.futures.a.a(f63048m, this, null, lVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63048m;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.f63073q) {
                if (obj == BufferedChannelKt.f63074r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f63048m, this, BufferedChannelKt.f63073q, BufferedChannelKt.f63074r));
        lVar.invoke(c0());
    }

    public final void C0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63040e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = BufferedChannelKt.w(j10 & 1152921504606846975L, 2);
            } else if (i10 == 1) {
                jW = BufferedChannelKt.w(j10 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    public final boolean M(long j10) {
        if (j10 >= a0() && j10 >= i0() + ((long) this.f63049b)) {
            return false;
        }
        return true;
    }

    public final i<E> P() {
        Object obj = f63046k.get(this);
        i iVar = (i) f63044i.get(this);
        if (iVar.f71936d > ((i) obj).f71936d) {
            obj = iVar;
        }
        i iVar2 = (i) f63045j.get(this);
        if (iVar2.f71936d > ((i) obj).f71936d) {
            obj = iVar2;
        }
        return (i) sk.a.b((sk.b) obj);
    }

    public final void P0(q2 q2Var, i<E> iVar, int i10) {
        M0();
        q2Var.c(iVar, i10);
    }

    public final void R(long j10) {
        V0(S(j10));
    }

    public final i<E> S(long j10) {
        i<E> iVarP = P();
        if (x0()) {
            long jZ0 = z0(iVarP);
            if (jZ0 != -1) {
                U(jZ0);
            }
        }
        O(iVarP, j10);
        return iVarP;
    }

    public final void T() {
        w();
    }

    public final void U(long j10) {
        UndeliveredElementException undeliveredElementExceptionC;
        i<E> iVar = (i) f63045j.get(this);
        while (true) {
            long j11 = f63041f.get(this);
            if (j10 < Math.max(((long) this.f63049b) + j11, a0())) {
                return;
            }
            if (f63041f.compareAndSet(this, j11, j11 + 1)) {
                int i10 = BufferedChannelKt.f63058b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (iVar.f71936d != j12) {
                    i<E> iVarX = X(j12, iVar);
                    if (iVarX == null) {
                        continue;
                    } else {
                        iVar = iVarX;
                    }
                }
                Object objH1 = h1(iVar, i11, j11, null);
                if (objH1 == BufferedChannelKt.f63071o) {
                    if (j11 < m0()) {
                        iVar.c();
                    }
                } else {
                    iVar.c();
                    l<E, r> lVar = this.f63050c;
                    if (lVar != null && (undeliveredElementExceptionC = w.c(lVar, objH1, null, 2, null)) != null) {
                        throw undeliveredElementExceptionC;
                    }
                }
            }
        }
    }

    public final Object U0(i<E> iVar, int i10, long j10, rj.c<? super E> cVar) {
        q qVar;
        c cVarB = o.b(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        try {
            Object objH1 = h1(iVar, i10, j10, cVarB);
            if (objH1 == BufferedChannelKt.f63069m) {
                P0(cVarB, iVar, i10);
            } else {
                g gVarH = null;
                g gVarH2 = null;
                c cVar2 = null;
                if (objH1 == BufferedChannelKt.f63071o) {
                    if (j10 < m0()) {
                        iVar.c();
                    }
                    i iVar2 = (i) g0().get(this);
                    while (true) {
                        if (u0()) {
                            I0(cVarB);
                            break;
                        }
                        long andIncrement = h0().getAndIncrement(this);
                        int i11 = BufferedChannelKt.f63058b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (iVar2.f71936d != j11) {
                            i iVarX = X(j11, iVar2);
                            if (iVarX != null) {
                                iVar2 = iVarX;
                            }
                        }
                        objH1 = h1(iVar2, i12, andIncrement, cVarB);
                        if (objH1 == BufferedChannelKt.f63069m) {
                            if (cVarB instanceof q2) {
                                cVar2 = cVarB;
                            }
                            if (cVar2 == null) {
                                break;
                            }
                            P0(cVar2, iVar2, i12);
                            break;
                        }
                        if (objH1 == BufferedChannelKt.f63071o) {
                            if (andIncrement < m0()) {
                                iVar2.c();
                            }
                        } else if (objH1 != BufferedChannelKt.f63070n) {
                            iVar2.c();
                            l<E, r> lVar = this.f63050c;
                            if (lVar != null) {
                                gVarH2 = H(lVar);
                            }
                            qVar = (q) gVarH2;
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    }
                } else {
                    iVar.c();
                    l<E, r> lVar2 = this.f63050c;
                    if (lVar2 != null) {
                        gVarH = H(lVar2);
                    }
                    qVar = (q) gVarH;
                }
                cVarB.M(objH1, qVar);
                break;
            }
            Object objB = cVarB.B();
            if (objB == sj.a.f()) {
                tj.f.c(cVar);
            }
            return objB;
        } catch (Throwable th2) {
            cVarB.T();
            throw th2;
        }
    }

    public final void V() {
        if (y0()) {
            return;
        }
        i<E> iVar = (i) f63046k.get(this);
        while (true) {
            long andIncrement = f63042g.getAndIncrement(this);
            int i10 = BufferedChannelKt.f63058b;
            long j10 = andIncrement / ((long) i10);
            if (m0() <= andIncrement) {
                if (iVar.f71936d < j10 && iVar.f() != 0) {
                    D0(j10, iVar);
                }
                q0(this, 0L, 1, null);
                return;
            }
            if (iVar.f71936d != j10) {
                i<E> iVarW = W(j10, iVar, andIncrement);
                if (iVarW == null) {
                    continue;
                } else {
                    iVar = iVarW;
                }
            }
            if (f1(iVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                q0(this, 0L, 1, null);
                return;
            }
            q0(this, 0L, 1, null);
        }
    }

    public final i<E> X(long j10, i<E> iVar) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63045j;
        bk.p pVar = (bk.p) BufferedChannelKt.y();
        do {
            objC = sk.a.c(iVar, j10, pVar);
            if (!b0.c(objC)) {
                a0 a0VarB = b0.b(objC);
                while (true) {
                    a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (a0Var.f71936d >= a0VarB.f71936d) {
                        break;
                    }
                    if (!a0VarB.u()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, a0Var, a0VarB)) {
                        if (!a0Var.p()) {
                            break;
                        }
                        a0Var.n();
                        break;
                    }
                    if (a0VarB.p()) {
                        a0VarB.n();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (b0.c(objC)) {
            T();
            if (iVar.f71936d * ((long) BufferedChannelKt.f63058b) >= m0()) {
                return null;
            }
            iVar.c();
            return null;
        }
        i<E> iVar2 = (i) b0.b(objC);
        if (!y0() && j10 <= a0() / ((long) BufferedChannelKt.f63058b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f63046k;
            while (true) {
                a0 a0Var2 = (a0) atomicReferenceFieldUpdater2.get(this);
                if (a0Var2.f71936d >= iVar2.f71936d || !iVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, a0Var2, iVar2)) {
                    if (!a0Var2.p()) {
                        break;
                    }
                    a0Var2.n();
                    break;
                }
                if (iVar2.p()) {
                    iVar2.n();
                }
            }
        }
        long j11 = iVar2.f71936d;
        if (j11 > j10) {
            int i10 = BufferedChannelKt.f63058b;
            l1(j11 * ((long) i10));
            if (iVar2.f71936d * ((long) i10) >= m0()) {
                return null;
            }
            iVar2.c();
            return null;
        }
        return iVar2;
    }

    public final i<E> Y(long j10, i<E> iVar) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63044i;
        bk.p pVar = (bk.p) BufferedChannelKt.y();
        do {
            objC = sk.a.c(iVar, j10, pVar);
            if (!b0.c(objC)) {
                a0 a0VarB = b0.b(objC);
                while (true) {
                    a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (a0Var.f71936d >= a0VarB.f71936d) {
                        break;
                    }
                    if (!a0VarB.u()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, a0Var, a0VarB)) {
                        if (!a0Var.p()) {
                            break;
                        }
                        a0Var.n();
                        break;
                    }
                    if (a0VarB.p()) {
                        a0VarB.n();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (b0.c(objC)) {
            T();
            if (iVar.f71936d * ((long) BufferedChannelKt.f63058b) >= i0()) {
                return null;
            }
            iVar.c();
            return null;
        }
        i<E> iVar2 = (i) b0.b(objC);
        long j11 = iVar2.f71936d;
        if (j11 > j10) {
            int i10 = BufferedChannelKt.f63058b;
            m1(j11 * ((long) i10));
            if (iVar2.f71936d * ((long) i10) >= i0()) {
                return null;
            }
            iVar2.c();
            return null;
        }
        return iVar2;
    }

    @Override // pk.p
    public final void a(CancellationException cancellationException) {
        N(cancellationException);
    }

    public final long a0() {
        return f63042g.get(this);
    }

    public final boolean b1(long j10) {
        if (w0(j10)) {
            return false;
        }
        return !M(j10 & 1152921504606846975L);
    }

    public final Throwable c0() {
        return (Throwable) f63047l.get(this);
    }

    public final Throwable f0() {
        Throwable thC0 = c0();
        if (thC0 == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return thC0;
    }

    public final boolean f1(i<E> iVar, int i10, long j10) {
        Object objB = iVar.B(i10);
        if ((objB instanceof q2) && j10 >= f63041f.get(this) && iVar.v(i10, objB, BufferedChannelKt.f63063g)) {
            if (d1(objB, iVar, i10)) {
                iVar.F(i10, BufferedChannelKt.f63060d);
                return true;
            }
            iVar.F(i10, BufferedChannelKt.f63066j);
            iVar.C(i10, false);
            return false;
        }
        return g1(iVar, i10, j10);
    }

    public final boolean g1(i<E> iVar, int i10, long j10) {
        while (true) {
            Object objB = iVar.B(i10);
            if (objB instanceof q2) {
                if (j10 < f63041f.get(this)) {
                    if (iVar.v(i10, objB, new pk.r((q2) objB))) {
                        return true;
                    }
                } else if (iVar.v(i10, objB, BufferedChannelKt.f63063g)) {
                    if (d1(objB, iVar, i10)) {
                        iVar.F(i10, BufferedChannelKt.f63060d);
                        return true;
                    }
                    iVar.F(i10, BufferedChannelKt.f63066j);
                    iVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == BufferedChannelKt.f63066j) {
                    return false;
                }
                if (objB == null) {
                    if (iVar.v(i10, objB, BufferedChannelKt.f63061e)) {
                        return true;
                    }
                } else {
                    if (objB == BufferedChannelKt.f63060d || objB == BufferedChannelKt.f63064h || objB == BufferedChannelKt.f63065i || objB == BufferedChannelKt.f63067k || objB == BufferedChannelKt.z()) {
                        return true;
                    }
                    if (objB != BufferedChannelKt.f63062f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    public final Object h1(i<E> iVar, int i10, long j10, Object obj) {
        Object objB = iVar.B(i10);
        if (objB == null) {
            if (j10 >= (f63040e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.f63070n;
                }
                if (iVar.v(i10, objB, obj)) {
                    V();
                    return BufferedChannelKt.f63069m;
                }
            }
        } else if (objB == BufferedChannelKt.f63060d && iVar.v(i10, objB, BufferedChannelKt.f63065i)) {
            V();
            return iVar.D(i10);
        }
        return i1(iVar, i10, j10, obj);
    }

    public final long i0() {
        return f63041f.get(this);
    }

    public final Object i1(i<E> iVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = iVar.B(i10);
            if (objB != null && objB != BufferedChannelKt.f63061e) {
                if (objB == BufferedChannelKt.f63060d) {
                    if (iVar.v(i10, objB, BufferedChannelKt.f63065i)) {
                        V();
                        return iVar.D(i10);
                    }
                } else {
                    if (objB != BufferedChannelKt.f63066j && objB != BufferedChannelKt.f63064h) {
                        if (objB == BufferedChannelKt.z()) {
                            V();
                            return BufferedChannelKt.f63071o;
                        }
                        if (objB != BufferedChannelKt.f63063g && iVar.v(i10, objB, BufferedChannelKt.f63062f)) {
                            boolean z10 = objB instanceof pk.r;
                            if (z10) {
                                objB = ((pk.r) objB).f66161a;
                            }
                            if (d1(objB, iVar, i10)) {
                                iVar.F(i10, BufferedChannelKt.f63065i);
                                V();
                                return iVar.D(i10);
                            }
                            iVar.F(i10, BufferedChannelKt.f63066j);
                            iVar.C(i10, false);
                            if (z10) {
                                V();
                            }
                            return BufferedChannelKt.f63071o;
                        }
                    }
                    return BufferedChannelKt.f63071o;
                }
            } else if (j10 < (f63040e.get(this) & 1152921504606846975L)) {
                if (iVar.v(i10, objB, BufferedChannelKt.f63064h)) {
                    V();
                    return BufferedChannelKt.f63071o;
                }
            } else {
                if (obj == null) {
                    return BufferedChannelKt.f63070n;
                }
                if (iVar.v(i10, objB, obj)) {
                    V();
                    return BufferedChannelKt.f63069m;
                }
            }
        }
    }

    public final Throwable j0() {
        Throwable thC0 = c0();
        if (thC0 == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return thC0;
    }

    public final int j1(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        iVar.G(i10, e10);
        if (z10) {
            return k1(iVar, i10, e10, j10, obj, z10);
        }
        Object objB = iVar.B(i10);
        if (objB == null) {
            if (M(j10)) {
                if (iVar.v(i10, null, BufferedChannelKt.f63060d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (iVar.v(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (objB instanceof q2) {
            iVar.w(i10);
            if (c1(objB, e10)) {
                iVar.F(i10, BufferedChannelKt.f63065i);
                L0();
                return 0;
            }
            if (iVar.x(i10, BufferedChannelKt.f63067k) != BufferedChannelKt.f63067k) {
                iVar.C(i10, true);
            }
            return 5;
        }
        return k1(iVar, i10, e10, j10, obj, z10);
    }

    public final int k1(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object objB = iVar.B(i10);
            if (objB == null) {
                if (M(j10) && !z10) {
                    if (iVar.v(i10, null, BufferedChannelKt.f63060d)) {
                        return 1;
                    }
                } else if (z10) {
                    if (iVar.v(i10, null, BufferedChannelKt.f63066j)) {
                        iVar.C(i10, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (iVar.v(i10, null, obj)) {
                        return 2;
                    }
                }
            } else if (objB == BufferedChannelKt.f63061e) {
                if (iVar.v(i10, objB, BufferedChannelKt.f63060d)) {
                    return 1;
                }
            } else {
                if (objB == BufferedChannelKt.f63067k) {
                    iVar.w(i10);
                    return 5;
                }
                if (objB == BufferedChannelKt.f63064h) {
                    iVar.w(i10);
                    return 5;
                }
                if (objB == BufferedChannelKt.z()) {
                    iVar.w(i10);
                    T();
                    return 4;
                }
                iVar.w(i10);
                if (objB instanceof pk.r) {
                    objB = ((pk.r) objB).f66161a;
                }
                if (c1(objB, e10)) {
                    iVar.F(i10, BufferedChannelKt.f63065i);
                    L0();
                    return 0;
                }
                if (iVar.x(i10, BufferedChannelKt.f63067k) != BufferedChannelKt.f63067k) {
                    iVar.C(i10, true);
                }
                return 5;
            }
        }
    }

    public final void l1(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63041f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f63041f.compareAndSet(this, j11, j10));
    }

    public final long m0() {
        return f63040e.get(this) & 1152921504606846975L;
    }

    public final void m1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63040e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 < j10) {
            } else {
                return;
            }
        } while (!f63040e.compareAndSet(this, j11, BufferedChannelKt.w(j12, (int) (j11 >> 60))));
    }

    @Override // pk.q
    public Object n(E e10) {
        i iVar;
        q2 q2Var;
        if (!b1(f63040e.get(this))) {
            Object obj = BufferedChannelKt.f63066j;
            i iVar2 = (i) k0().get(this);
            while (true) {
                long andIncrement = l0().getAndIncrement(this);
                long j10 = andIncrement & 1152921504606846975L;
                boolean zW0 = w0(andIncrement);
                int i10 = BufferedChannelKt.f63058b;
                long j11 = j10 / ((long) i10);
                int i11 = (int) (j10 % ((long) i10));
                if (iVar2.f71936d != j11) {
                    i iVarY = Y(j11, iVar2);
                    if (iVarY == null) {
                        if (zW0) {
                            break;
                        }
                    } else {
                        iVar = iVarY;
                    }
                } else {
                    iVar = iVar2;
                }
                int iJ1 = j1(iVar, i11, e10, j10, obj, zW0);
                if (iJ1 != 0) {
                    if (iJ1 != 1) {
                        if (iJ1 != 2) {
                            if (iJ1 != 3) {
                                if (iJ1 != 4) {
                                    if (iJ1 == 5) {
                                        iVar.c();
                                    }
                                    iVar2 = iVar;
                                } else {
                                    if (j10 >= i0()) {
                                        break;
                                    }
                                    iVar.c();
                                    break;
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        } else {
                            if (zW0) {
                                iVar.t();
                                break;
                            }
                            if (obj instanceof q2) {
                                q2Var = (q2) obj;
                            } else {
                                q2Var = null;
                            }
                            if (q2Var != null) {
                                Q0(q2Var, iVar, i11);
                            }
                            iVar.t();
                            return kotlinx.coroutines.channels.a.f63077b.b();
                        }
                    }
                } else {
                    iVar.c();
                }
                return kotlinx.coroutines.channels.a.f63077b.c(r.f64562a);
            }
            return kotlinx.coroutines.channels.a.f63077b.a(j0());
        }
        return kotlinx.coroutines.channels.a.f63077b.b();
    }

    public final boolean o0() {
        while (true) {
            i<E> iVarX = (i) f63045j.get(this);
            long jI0 = i0();
            if (m0() <= jI0) {
                return false;
            }
            int i10 = BufferedChannelKt.f63058b;
            long j10 = jI0 / ((long) i10);
            if (iVarX.f71936d != j10 && (iVarX = X(j10, iVarX)) == null) {
                if (((i) f63045j.get(this)).f71936d < j10) {
                    return false;
                }
            } else {
                iVarX.c();
                if (s0(iVarX, (int) (jI0 % ((long) i10)), jI0)) {
                    return true;
                }
                f63041f.compareAndSet(this, jI0, 1 + jI0);
            }
        }
    }

    public final void p0(long j10) {
        boolean z10;
        boolean z11;
        if ((f63043h.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            do {
                if ((f63043h.get(this) & 4611686018427387904L) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } while (z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pk.p
    public Object q() {
        i iVar;
        q2 q2Var;
        long j10 = f63041f.get(this);
        long j11 = f63040e.get(this);
        if (v0(j11)) {
            return kotlinx.coroutines.channels.a.f63077b.a(c0());
        }
        if (j10 < (j11 & 1152921504606846975L)) {
            Object obj = BufferedChannelKt.f63067k;
            i iVar2 = (i) g0().get(this);
            while (!u0()) {
                long andIncrement = h0().getAndIncrement(this);
                int i10 = BufferedChannelKt.f63058b;
                long j12 = andIncrement / ((long) i10);
                int i11 = (int) (andIncrement % ((long) i10));
                if (iVar2.f71936d != j12) {
                    i iVarX = X(j12, iVar2);
                    if (iVarX == null) {
                        continue;
                    } else {
                        iVar = iVarX;
                    }
                } else {
                    iVar = iVar2;
                }
                Object objH1 = h1(iVar, i11, andIncrement, obj);
                if (objH1 == BufferedChannelKt.f63069m) {
                    if (obj instanceof q2) {
                        q2Var = (q2) obj;
                    } else {
                        q2Var = null;
                    }
                    if (q2Var != null) {
                        P0(q2Var, iVar, i11);
                    }
                    n1(andIncrement);
                    iVar.t();
                    return kotlinx.coroutines.channels.a.f63077b.b();
                }
                if (objH1 == BufferedChannelKt.f63071o) {
                    if (andIncrement < m0()) {
                        iVar.c();
                    }
                    iVar2 = iVar;
                } else {
                    if (objH1 != BufferedChannelKt.f63070n) {
                        iVar.c();
                        return kotlinx.coroutines.channels.a.f63077b.c(objH1);
                    }
                    throw new IllegalStateException("unexpected".toString());
                }
            }
            return kotlinx.coroutines.channels.a.f63077b.a(c0());
        }
        return kotlinx.coroutines.channels.a.f63077b.b();
    }

    public final void r0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63048m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f63073q : BufferedChannelKt.f63074r));
        if (obj == null) {
            return;
        }
        ((l) obj).invoke(c0());
    }

    public final boolean s0(i<E> iVar, int i10, long j10) {
        Object objB;
        do {
            objB = iVar.B(i10);
            if (objB != null && objB != BufferedChannelKt.f63061e) {
                if (objB == BufferedChannelKt.f63060d) {
                    return true;
                }
                if (objB == BufferedChannelKt.f63066j || objB == BufferedChannelKt.z() || objB == BufferedChannelKt.f63065i || objB == BufferedChannelKt.f63064h) {
                    return false;
                }
                if (objB == BufferedChannelKt.f63063g) {
                    return true;
                }
                if (objB == BufferedChannelKt.f63062f || j10 != i0()) {
                    return false;
                }
                return true;
            }
        } while (!iVar.v(i10, objB, BufferedChannelKt.f63064h));
        V();
        return false;
    }

    public boolean u0() {
        return v0(f63040e.get(this));
    }

    @Override // pk.q
    public boolean w() {
        return w0(f63040e.get(this));
    }

    public final boolean y0() {
        long jA0 = a0();
        if (jA0 != 0 && jA0 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }
}
