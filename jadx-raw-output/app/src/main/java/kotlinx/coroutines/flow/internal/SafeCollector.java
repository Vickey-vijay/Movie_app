package kotlinx.coroutines.flow.internal;

import bk.p;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import lk.q;
import mj.r;
import nk.t1;
import qk.d;
import rj.c;
import rk.f;
import rk.k;
import sj.a;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class SafeCollector<T> extends ContinuationImpl implements d<T> {
    public final kotlin.coroutines.d collectContext;
    public final int collectContextSize;
    public final d<T> collector;
    private c<? super r> completion_;
    private kotlin.coroutines.d lastEmissionContext;

    public static final int e(int i10, kotlin.coroutines.d.b bVar) {
        return i10 + 1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(d<? super T> dVar, kotlin.coroutines.d dVar2) {
        super(k.f66790b, EmptyCoroutineContext.INSTANCE);
        this.collector = dVar;
        this.collectContext = dVar2;
        this.collectContextSize = ((Number) dVar2.fold(0, new p() { // from class: rk.n
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return Integer.valueOf(SafeCollector.e(((Integer) obj).intValue(), (kotlin.coroutines.d.b) obj2));
            }
        })).intValue();
    }

    public final void c(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2, T t10) {
        if (dVar2 instanceof f) {
            k((f) dVar2, t10);
        }
        rk.p.b(this, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, tj.c
    public tj.c getCallerFrame() {
        c<? super r> cVar = this.completion_;
        if (cVar instanceof tj.c) {
            return (tj.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, rj.c
    public kotlin.coroutines.d getContext() {
        kotlin.coroutines.d dVar = this.lastEmissionContext;
        return dVar == null ? EmptyCoroutineContext.INSTANCE : dVar;
    }

    public final void k(f fVar, Object obj) {
        throw new IllegalStateException(q.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + fVar.f66789c + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // qk.d
    public Object emit(T t10, c<? super r> cVar) {
        try {
            Object objF = f(cVar, t10);
            if (objF == a.f()) {
                tj.f.c(cVar);
            }
            if (objF == a.f()) {
                return objF;
            }
            return r.f64562a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new f(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object f(c<? super r> cVar, T t10) {
        kotlin.coroutines.d context = cVar.getContext();
        t1.h(context);
        kotlin.coroutines.d dVar = this.lastEmissionContext;
        if (dVar != context) {
            c(context, dVar, t10);
            this.lastEmissionContext = context;
        }
        this.completion_ = cVar;
        bk.q qVar = SafeCollectorKt.f63166a;
        d<T> dVar2 = this.collector;
        ck.p.h(dVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        ck.p.h(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(dVar2, t10, this);
        if (!ck.p.e(objInvoke, a.f())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        if (thM3461exceptionOrNullimpl != null) {
            this.lastEmissionContext = new f(thM3461exceptionOrNullimpl, getContext());
        }
        c<? super r> cVar = this.completion_;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return a.f();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
