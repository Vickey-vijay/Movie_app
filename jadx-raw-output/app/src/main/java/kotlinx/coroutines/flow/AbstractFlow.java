package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import mj.r;
import qk.c;
import tj.d;

/* JADX INFO: compiled from: Flow.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractFlow<T> implements c<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.AbstractFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: Flow.kt */
    @d(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ AbstractFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractFlow<T> abstractFlow, rj.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = abstractFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public abstract Object c(qk.d<? super T> dVar, rj.c<? super r> cVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.c
    public final Object collect(qk.d<? super T> dVar, rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th2;
        SafeCollector safeCollector;
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
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector = (SafeCollector) anonymousClass1.L$0;
            try {
                kotlin.c.b(obj);
                safeCollector.releaseIntercepted();
                return r.f64562a;
            } catch (Throwable th3) {
                th2 = th3;
                safeCollector.releaseIntercepted();
                throw th2;
            }
        }
        kotlin.c.b(obj);
        SafeCollector safeCollector2 = new SafeCollector(dVar, anonymousClass1.getContext());
        try {
            anonymousClass1.L$0 = safeCollector2;
            anonymousClass1.label = 1;
            if (c(safeCollector2, anonymousClass1) == objF) {
                return objF;
            }
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            return r.f64562a;
        } catch (Throwable th4) {
            th2 = th4;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th2;
        }
    }
}
