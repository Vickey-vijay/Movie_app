package kotlinx.coroutines.flow;

import bk.p;
import kotlinx.coroutines.flow.internal.SafeCollector;
import mj.r;
import qk.d;
import rj.c;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SubscribedFlowCollector<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<T> f63147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<d<? super T>, c<? super r>, Object> f63148c;

    @Override // qk.d
    public Object emit(T t10, c<? super r> cVar) {
        return this.f63147b.emit(t10, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final Object b(c<? super r> cVar) throws Throwable {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        SafeCollector safeCollector;
        SubscribedFlowCollector<T> subscribedFlowCollector;
        if (cVar instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) cVar;
            int i10 = subscribedFlowCollector$onSubscription$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.label = i10 - Integer.MIN_VALUE;
            } else {
                subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, cVar);
            }
        } else {
            subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, cVar);
        }
        Object obj = subscribedFlowCollector$onSubscription$1.result;
        Object objF = sj.a.f();
        ?? r10 = subscribedFlowCollector$onSubscription$1.label;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    safeCollector = (SafeCollector) subscribedFlowCollector$onSubscription$1.L$1;
                    subscribedFlowCollector = (SubscribedFlowCollector) subscribedFlowCollector$onSubscription$1.L$0;
                    kotlin.c.b(obj);
                } else {
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return r.f64562a;
            }
            kotlin.c.b(obj);
            safeCollector = new SafeCollector(this.f63147b, subscribedFlowCollector$onSubscription$1.getContext());
            p<d<? super T>, c<? super r>, Object> pVar = this.f63148c;
            subscribedFlowCollector$onSubscription$1.L$0 = this;
            subscribedFlowCollector$onSubscription$1.L$1 = safeCollector;
            subscribedFlowCollector$onSubscription$1.label = 1;
            if (pVar.mo1invoke(safeCollector, subscribedFlowCollector$onSubscription$1) == objF) {
                return objF;
            }
            subscribedFlowCollector = this;
            safeCollector.releaseIntercepted();
            d<T> dVar = subscribedFlowCollector.f63147b;
            r10 = dVar instanceof SubscribedFlowCollector;
            if (r10 == 0) {
                return r.f64562a;
            }
            subscribedFlowCollector$onSubscription$1.L$0 = null;
            subscribedFlowCollector$onSubscription$1.L$1 = null;
            subscribedFlowCollector$onSubscription$1.label = 2;
            if (((SubscribedFlowCollector) dVar).b(subscribedFlowCollector$onSubscription$1) == objF) {
                return objF;
            }
            return r.f64562a;
        } catch (Throwable th2) {
            r10.releaseIntercepted();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(d<? super T> dVar, p<? super d<? super T>, ? super c<? super r>, ? extends Object> pVar) {
        this.f63147b = dVar;
        this.f63148c = pVar;
    }
}
