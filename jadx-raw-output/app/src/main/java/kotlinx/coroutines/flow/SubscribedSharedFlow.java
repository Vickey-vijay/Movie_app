package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import qk.d;
import qk.p;
import rj.c;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscribedSharedFlow<T> implements p<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<T> f63149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.p<d<? super T>, c<? super r>, Object> f63150c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @tj.d(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {408}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SubscribedSharedFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscribedSharedFlow<T> subscribedSharedFlow, c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = subscribedSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.p, qk.c
    public Object collect(d<? super T> dVar, c<?> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            p<T> pVar = this.f63149b;
            SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(dVar, this.f63150c);
            anonymousClass1.label = 1;
            if (pVar.collect(subscribedFlowCollector, anonymousClass1) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedSharedFlow(p<? extends T> pVar, bk.p<? super d<? super T>, ? super c<? super r>, ? extends Object> pVar2) {
        this.f63149b = pVar;
        this.f63150c = pVar2;
    }
}
