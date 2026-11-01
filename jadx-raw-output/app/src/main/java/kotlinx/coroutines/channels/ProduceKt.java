package kotlinx.coroutines.channels;

import bk.l;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ProduceKt;
import mj.r;
import nk.f0;
import nk.l0;
import pk.g;
import pk.m;
import pk.n;
import pk.p;
import rj.c;
import tj.f;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ProduceKt {

    /* JADX INFO: compiled from: Produce.kt */
    public static final class a implements l<Throwable, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nk.l<r> f63076b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(nk.l<? super r> lVar) {
            this.f63076b = lVar;
        }

        public final void a(Throwable th2) {
            nk.l<r> lVar = this.f63076b;
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(r.f64562a));
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
            a(th2);
            return r.f64562a;
        }
    }

    public static final <E> p<E> e(l0 l0Var, d dVar, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l<? super Throwable, r> lVar, bk.p<? super n<? super E>, ? super c<? super r>, ? extends Object> pVar) {
        m mVar = new m(f0.k(l0Var, dVar), g.b(i10, bufferOverflow, null, 4, null));
        if (lVar != null) {
            mVar.F(lVar);
        }
        mVar.h1(coroutineStart, mVar, pVar);
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(n<?> nVar, bk.a<r> aVar, c<? super r> cVar) throws Throwable {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (cVar instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) cVar;
            int i10 = produceKt$awaitClose$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.label = i10 - Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(cVar);
            }
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(cVar);
        }
        Object obj = produceKt$awaitClose$1.result;
        Object objF = sj.a.f();
        int i11 = produceKt$awaitClose$1.label;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                if (!(produceKt$awaitClose$1.getContext().get(kotlinx.coroutines.g.E8) == nVar)) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                produceKt$awaitClose$1.L$0 = nVar;
                produceKt$awaitClose$1.L$1 = aVar;
                produceKt$awaitClose$1.label = 1;
                kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(produceKt$awaitClose$1), 1);
                cVar2.J();
                nVar.C(new a(cVar2));
                Object objB = cVar2.B();
                if (objB == sj.a.f()) {
                    f.c(produceKt$awaitClose$1);
                }
                if (objB == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (bk.a) produceKt$awaitClose$1.L$1;
                kotlin.c.b(obj);
            }
            aVar.invoke();
            return r.f64562a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }

    public static /* synthetic */ Object c(n nVar, bk.a aVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new bk.a() { // from class: pk.l
                @Override // bk.a
                public final Object invoke() {
                    return ProduceKt.d();
                }
            };
        }
        return b(nVar, aVar, cVar);
    }

    public static final r d() {
        return r.f64562a;
    }

    public static /* synthetic */ p f(l0 l0Var, d dVar, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l lVar, bk.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        d dVar2 = dVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i11 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return e(l0Var, dVar2, i12, bufferOverflow2, coroutineStart2, lVar, pVar);
    }
}
