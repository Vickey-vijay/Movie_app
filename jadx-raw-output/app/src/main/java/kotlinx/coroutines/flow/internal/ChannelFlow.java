package kotlinx.coroutines.flow.internal;

import bk.p;
import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import mj.r;
import nj.b0;
import nk.l0;
import nk.m0;
import pk.n;
import qk.e;
import rj.c;
import rk.j;
import sj.a;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ChannelFlow<T> implements j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f63155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferOverflow f63157d;

    public String c() {
        return null;
    }

    @Override // qk.c
    public Object collect(qk.d<? super T> dVar, c<? super r> cVar) {
        return d(this, dVar, cVar);
    }

    public abstract Object e(n<? super T> nVar, c<? super r> cVar);

    public abstract ChannelFlow<T> f(d dVar, int i10, BufferOverflow bufferOverflow);

    public qk.c<T> j() {
        return null;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @tj.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ qk.d<T> $collector;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ChannelFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(qk.d<? super T> dVar, ChannelFlow<T> channelFlow, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$collector = dVar;
            this.this$0 = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$collector, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.L$0;
                qk.d<T> dVar = this.$collector;
                pk.p<T> pVarM = this.this$0.m(l0Var);
                this.label = 1;
                if (e.m(dVar, pVarM, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public static /* synthetic */ <T> Object d(ChannelFlow<T> channelFlow, qk.d<? super T> dVar, c<? super r> cVar) {
        Object objE = kotlinx.coroutines.d.e(new AnonymousClass2(dVar, channelFlow, null), cVar);
        return objE == a.f() ? objE : r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[PHI: r4
  0x0013: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:8:0x0011, B:13:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // rk.j
    public qk.c<T> b(d dVar, int i10, BufferOverflow bufferOverflow) {
        d dVarPlus = dVar.plus(this.f63155b);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i11 = this.f63156c;
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 != -2 && (i11 = i11 + i10) < 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i11;
                    }
                }
            }
            bufferOverflow = this.f63157d;
        }
        return (ck.p.e(dVarPlus, this.f63155b) && i10 == this.f63156c && bufferOverflow == this.f63157d) ? this : f(dVarPlus, i10, bufferOverflow);
    }

    public final p<n<? super T>, c<? super r>, Object> k() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int l() {
        int i10 = this.f63156c;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public pk.p<T> m(l0 l0Var) {
        return ProduceKt.f(l0Var, this.f63155b, l(), this.f63157d, CoroutineStart.ATOMIC, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        if (this.f63155b != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f63155b);
        }
        if (this.f63156c != -3) {
            arrayList.add("capacity=" + this.f63156c);
        }
        if (this.f63157d != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f63157d);
        }
        return m0.a(this) + '[' + b0.p0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public ChannelFlow(d dVar, int i10, BufferOverflow bufferOverflow) {
        this.f63155b = dVar;
        this.f63156c = i10;
        this.f63157d = bufferOverflow;
    }
}
