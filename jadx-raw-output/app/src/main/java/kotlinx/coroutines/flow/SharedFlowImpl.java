package kotlinx.coroutines.flow;

import ck.p;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.g;
import nk.o;
import nk.t1;
import nk.y0;
import qk.c;
import qk.k;
import qk.q;
import qk.r;
import rk.j;
import sk.d0;
import tj.d;
import tj.f;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
public class SharedFlowImpl<T> extends rk.a<r> implements k<T>, c, j<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f63129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f63130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BufferOverflow f63131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object[] f63132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f63133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f63134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f63135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f63136m;

    /* JADX INFO: compiled from: SharedFlow.kt */
    public static final class a implements y0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SharedFlowImpl<?> f63137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f63138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f63139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final rj.c<mj.r> f63140e;

        @Override // nk.y0
        public void dispose() {
            this.f63137b.y(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(SharedFlowImpl<?> sharedFlowImpl, long j10, Object obj, rj.c<? super mj.r> cVar) {
            this.f63137b = sharedFlowImpl;
            this.f63138c = j10;
            this.f63139d = obj;
            this.f63140e = cVar;
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @d(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedFlowImpl<T> sharedFlowImpl, rj.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.A(this.this$0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [rj.c<mj.r>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final rj.c<mj.r>[] I(rj.c<mj.r>[] cVarArr) {
        rk.c[] cVarArr2;
        r rVar;
        rj.c<? super mj.r> cVar;
        int length = cVarArr.length;
        if (this.f66784c != 0 && (cVarArr2 = this.f66783b) != null) {
            int i10 = 0;
            int length2 = cVarArr2.length;
            while (i10 < length2) {
                rk.c cVar2 = cVarArr2[i10];
                if (cVar2 == null || (cVar = (rVar = (r) cVar2).f66595b) == null || T(rVar) < 0) {
                    cVarArr = cVarArr;
                } else {
                    if (length >= cVarArr.length) {
                        cVarArr = cVarArr;
                        cVarArr = cVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                        p.i(objArrCopyOf, "copyOf(...)");
                        cVarArr = objArrCopyOf;
                    }
                    cVarArr = cVarArr;
                    cVarArr = cVarArr;
                    ((rj.c[]) cVarArr)[length] = cVar;
                    rVar.f66595b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
            cVarArr = cVarArr;
        }
        return (rj.c[]) cVarArr;
    }

    public final Object[] Q(Object[] objArr, int i10, int i11) {
        if (!(i11 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i11];
        this.f63132i = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jK = K();
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = ((long) i12) + jK;
            q.g(objArr2, j10, q.f(objArr, j10));
        }
        return objArr2;
    }

    @Override // qk.p, qk.c
    public Object collect(qk.d<? super T> dVar, rj.c<?> cVar) {
        return A(this, dVar, cVar);
    }

    @Override // qk.k, qk.d
    public Object emit(T t10, rj.c<? super mj.r> cVar) {
        return F(this, t10, cVar);
    }

    @Override // qk.k
    public void g() {
        synchronized (this) {
            V(J(), this.f63134k, J(), N());
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f63138c < K()) {
                return;
            }
            Object[] objArr = this.f63132i;
            p.g(objArr);
            if (q.f(objArr, aVar.f63138c) != aVar) {
                return;
            }
            q.g(objArr, aVar.f63138c, q.f66593a);
            z();
            mj.r rVar = mj.r.f64562a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ <T> Object A(SharedFlowImpl<T> sharedFlowImpl, qk.d<? super T> dVar, rj.c<?> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SharedFlowImpl<T> sharedFlowImpl2;
        Throwable th2;
        r rVar;
        qk.d<? super T> dVar2;
        g gVar;
        qk.d dVar3;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(sharedFlowImpl, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(sharedFlowImpl, cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                rVar = (r) anonymousClass1.L$2;
                qk.d<? super T> dVar4 = (qk.d) anonymousClass1.L$1;
                SharedFlowImpl<T> sharedFlowImpl3 = (SharedFlowImpl) anonymousClass1.L$0;
                try {
                    kotlin.c.b(obj);
                    dVar2 = dVar4;
                    sharedFlowImpl = sharedFlowImpl3;
                    try {
                        gVar = (g) anonymousClass1.getContext().get(g.E8);
                        dVar3 = dVar2;
                    } catch (Throwable th3) {
                        sharedFlowImpl2 = sharedFlowImpl;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    sharedFlowImpl2 = sharedFlowImpl3;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g gVar2 = (g) anonymousClass1.L$3;
                rVar = (r) anonymousClass1.L$2;
                qk.d dVar5 = (qk.d) anonymousClass1.L$1;
                sharedFlowImpl2 = (SharedFlowImpl) anonymousClass1.L$0;
                try {
                    kotlin.c.b(obj);
                    dVar3 = dVar5;
                    gVar = gVar2;
                    sharedFlowImpl = sharedFlowImpl2;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            sharedFlowImpl2.k(rVar);
            throw th2;
        }
        kotlin.c.b(obj);
        r rVarE = sharedFlowImpl.e();
        try {
            if (dVar instanceof SubscribedFlowCollector) {
                anonymousClass1.L$0 = sharedFlowImpl;
                anonymousClass1.L$1 = dVar;
                anonymousClass1.L$2 = rVarE;
                anonymousClass1.label = 1;
                if (((SubscribedFlowCollector) dVar).b(anonymousClass1) == objF) {
                    return objF;
                }
            }
            dVar2 = dVar;
            rVar = rVarE;
            gVar = (g) anonymousClass1.getContext().get(g.E8);
            dVar3 = dVar2;
        } catch (Throwable th6) {
            sharedFlowImpl2 = sharedFlowImpl;
            th2 = th6;
            rVar = rVarE;
        }
        while (true) {
            Object objU = sharedFlowImpl.U(rVar);
            if (objU == q.f66593a) {
                anonymousClass1.L$0 = sharedFlowImpl;
                anonymousClass1.L$1 = dVar3;
                anonymousClass1.L$2 = rVar;
                anonymousClass1.L$3 = gVar;
                anonymousClass1.label = 2;
                if (sharedFlowImpl.x(rVar, anonymousClass1) == objF) {
                    return objF;
                }
            } else {
                if (gVar != null) {
                    t1.i(gVar);
                }
                anonymousClass1.L$0 = sharedFlowImpl;
                anonymousClass1.L$1 = dVar3;
                anonymousClass1.L$2 = rVar;
                anonymousClass1.L$3 = gVar;
                anonymousClass1.label = 3;
                if (dVar3.emit(objU, anonymousClass1) == objF) {
                    return objF;
                }
            }
        }
    }

    @Override // rk.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public r f() {
        return new r();
    }

    @Override // rk.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public r[] j(int i10) {
        return new r[i10];
    }

    public final void E() {
        Object[] objArr = this.f63132i;
        p.g(objArr);
        q.g(objArr, K(), null);
        this.f63135l--;
        long jK = K() + 1;
        if (this.f63133j < jK) {
            this.f63133j = jK;
        }
        if (this.f63134k < jK) {
            B(jK);
        }
    }

    public final Object G(T t10, rj.c<? super mj.r> cVar) {
        rj.c<mj.r>[] cVarArrI;
        a aVar;
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        rj.c<mj.r>[] cVarArrI2 = rk.b.f66787a;
        synchronized (this) {
            if (R(t10)) {
                Result.a aVar2 = Result.Companion;
                cVar2.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
                cVarArrI = I(cVarArrI2);
                aVar = null;
            } else {
                a aVar3 = new a(this, ((long) P()) + K(), t10, cVar2);
                H(aVar3);
                this.f63136m++;
                if (this.f63130g == 0) {
                    cVarArrI2 = I(cVarArrI2);
                }
                cVarArrI = cVarArrI2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            o.a(cVar2, aVar);
        }
        for (rj.c<mj.r> cVar3 : cVarArrI) {
            if (cVar3 != null) {
                Result.a aVar4 = Result.Companion;
                cVar3.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
            }
        }
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            f.c(cVar);
        }
        return objB == sj.a.f() ? objB : mj.r.f64562a;
    }

    public final long K() {
        return Math.min(this.f63134k, this.f63133j);
    }

    public final T L() {
        Object[] objArr = this.f63132i;
        p.g(objArr);
        return (T) q.f(objArr, (this.f63133j + ((long) O())) - 1);
    }

    public final Object M(long j10) {
        Object[] objArr = this.f63132i;
        p.g(objArr);
        Object objF = q.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f63139d : objF;
    }

    public final int P() {
        return this.f63135l + this.f63136m;
    }

    public final boolean S(T t10) {
        if (this.f63129f == 0) {
            return true;
        }
        H(t10);
        int i10 = this.f63135l + 1;
        this.f63135l = i10;
        if (i10 > this.f63129f) {
            E();
        }
        this.f63134k = K() + ((long) this.f63135l);
        return true;
    }

    public final long T(r rVar) {
        long j10 = rVar.f66594a;
        if (j10 < J()) {
            return j10;
        }
        if (this.f63130g <= 0 && j10 <= K() && this.f63136m != 0) {
            return j10;
        }
        return -1L;
    }

    public final Object U(r rVar) {
        Object obj;
        rj.c<mj.r>[] cVarArrW = rk.b.f66787a;
        synchronized (this) {
            long jT = T(rVar);
            if (jT < 0) {
                obj = q.f66593a;
            } else {
                long j10 = rVar.f66594a;
                Object objM = M(jT);
                rVar.f66594a = jT + 1;
                cVarArrW = W(j10);
                obj = objM;
            }
        }
        for (rj.c<mj.r> cVar : cVarArrW) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
            }
        }
        return obj;
    }

    public final rj.c<mj.r>[] W(long j10) {
        long j11;
        long j12;
        long j13;
        rk.c[] cVarArr;
        if (j10 > this.f63134k) {
            return rk.b.f66787a;
        }
        long jK = K();
        long j14 = ((long) this.f63135l) + jK;
        if (this.f63130g == 0 && this.f63136m > 0) {
            j14++;
        }
        if (this.f66784c != 0 && (cVarArr = this.f66783b) != null) {
            for (rk.c cVar : cVarArr) {
                if (cVar != null) {
                    long j15 = ((r) cVar).f66594a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f63134k) {
            return rk.b.f66787a;
        }
        long J = J();
        int iMin = l() > 0 ? Math.min(this.f63136m, this.f63130g - ((int) (J - j14))) : this.f63136m;
        rj.c<mj.r>[] cVarArr2 = rk.b.f66787a;
        long j16 = ((long) this.f63136m) + J;
        if (iMin > 0) {
            cVarArr2 = new rj.c[iMin];
            Object[] objArr = this.f63132i;
            p.g(objArr);
            long j17 = J;
            int i10 = 0;
            while (true) {
                if (J >= j16) {
                    j11 = j14;
                    j12 = j16;
                    break;
                }
                Object objF = q.f(objArr, J);
                j11 = j14;
                d0 d0Var = q.f66593a;
                if (objF != d0Var) {
                    p.h(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j16;
                    cVarArr2[i10] = aVar.f63140e;
                    q.g(objArr, J, d0Var);
                    q.g(objArr, j17, aVar.f63139d);
                    j13 = 1;
                    j17++;
                    if (i11 >= iMin) {
                        break;
                    }
                    i10 = i11;
                } else {
                    j12 = j16;
                    j13 = 1;
                }
                J += j13;
                j14 = j11;
                j16 = j12;
            }
            J = j17;
        } else {
            j11 = j14;
            j12 = j16;
        }
        int i12 = (int) (J - jK);
        long j18 = l() == 0 ? J : j11;
        long jMax = Math.max(this.f63133j, J - ((long) Math.min(this.f63129f, i12)));
        if (this.f63130g == 0 && jMax < j12) {
            Object[] objArr2 = this.f63132i;
            p.g(objArr2);
            if (p.e(q.f(objArr2, jMax), q.f66593a)) {
                J++;
                jMax++;
            }
        }
        V(jMax, j18, J, j12);
        z();
        return (cVarArr2.length == 0) ^ true ? I(cVarArr2) : cVarArr2;
    }

    public final long X() {
        long j10 = this.f63133j;
        if (j10 < this.f63134k) {
            this.f63134k = j10;
        }
        return j10;
    }

    @Override // qk.k
    public boolean h(T t10) {
        int i10;
        boolean z10;
        rj.c<mj.r>[] cVarArrI = rk.b.f66787a;
        synchronized (this) {
            if (R(t10)) {
                cVarArrI = I(cVarArrI);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (rj.c<mj.r> cVar : cVarArrI) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
            }
        }
        return z10;
    }

    public final Object x(r rVar, rj.c<? super mj.r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        synchronized (this) {
            if (T(rVar) < 0) {
                rVar.f66595b = cVar2;
            } else {
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
            }
            mj.r rVar2 = mj.r.f64562a;
        }
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            f.c(cVar);
        }
        return objB == sj.a.f() ? objB : mj.r.f64562a;
    }

    public final void z() {
        if (this.f63130g != 0 || this.f63136m > 1) {
            Object[] objArr = this.f63132i;
            p.g(objArr);
            while (this.f63136m > 0 && q.f(objArr, (K() + ((long) P())) - 1) == q.f66593a) {
                this.f63136m--;
                q.g(objArr, K() + ((long) P()), null);
            }
        }
    }

    public SharedFlowImpl(int i10, int i11, BufferOverflow bufferOverflow) {
        this.f63129f = i10;
        this.f63130g = i11;
        this.f63131h = bufferOverflow;
    }

    public static /* synthetic */ <T> Object F(SharedFlowImpl<T> sharedFlowImpl, T t10, rj.c<? super mj.r> cVar) {
        if (sharedFlowImpl.h(t10)) {
            return mj.r.f64562a;
        }
        Object objG = sharedFlowImpl.G(t10, cVar);
        if (objG == sj.a.f()) {
            return objG;
        }
        return mj.r.f64562a;
    }

    public final void B(long j10) {
        rk.c[] cVarArr;
        if (this.f66784c != 0 && (cVarArr = this.f66783b) != null) {
            for (rk.c cVar : cVarArr) {
                if (cVar != null) {
                    r rVar = (r) cVar;
                    long j11 = rVar.f66594a;
                    if (j11 >= 0 && j11 < j10) {
                        rVar.f66594a = j10;
                    }
                }
            }
        }
        this.f63134k = j10;
    }

    public final void H(Object obj) {
        int iP = P();
        Object[] objArrQ = this.f63132i;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        q.g(objArrQ, K() + ((long) iP), obj);
    }

    public final long J() {
        return K() + ((long) this.f63135l);
    }

    public final long N() {
        return K() + ((long) this.f63135l) + ((long) this.f63136m);
    }

    public final int O() {
        return (int) ((K() + ((long) this.f63135l)) - this.f63133j);
    }

    public final boolean R(T t10) {
        if (l() == 0) {
            return S(t10);
        }
        if (this.f63135l >= this.f63130g && this.f63134k <= this.f63133j) {
            int i10 = b.$EnumSwitchMapping$0[this.f63131h.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return true;
                }
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return false;
            }
        }
        H(t10);
        int i11 = this.f63135l + 1;
        this.f63135l = i11;
        if (i11 > this.f63130g) {
            E();
        }
        if (O() > this.f63129f) {
            V(this.f63133j + 1, this.f63134k, J(), N());
        }
        return true;
    }

    public final void V(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.f63132i;
            p.g(objArr);
            q.g(objArr, jK, null);
        }
        this.f63133j = j10;
        this.f63134k = j11;
        this.f63135l = (int) (j12 - jMin);
        this.f63136m = (int) (j13 - j12);
    }

    @Override // rk.j
    public c<T> b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return q.e(this, dVar, i10, bufferOverflow);
    }
}
