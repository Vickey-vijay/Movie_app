package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ErrorsKt$catchImpl$1(c<? super FlowKt__ErrorsKt$catchImpl$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.g(null, null, this);
    }
}
