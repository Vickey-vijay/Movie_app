package kotlinx.coroutines.flow;

import com.ironsource.C3702sd;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {53}, m = C3702sd.f30729d)
public final class FlowKt__ReduceKt$single$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$single$1(c<? super FlowKt__ReduceKt$single$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.F(null, this);
    }
}
