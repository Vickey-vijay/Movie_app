package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$first$3(c<? super FlowKt__ReduceKt$first$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.q(null, null, this);
    }
}
