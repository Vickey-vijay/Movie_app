package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes4.dex */
@tj.d(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public TimeoutKt$withTimeoutOrNull$1(rj.c<? super TimeoutKt$withTimeoutOrNull$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimeoutKt.d(0L, null, this);
    }
}
