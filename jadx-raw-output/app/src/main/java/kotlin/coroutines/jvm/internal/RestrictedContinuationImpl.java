package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import rj.c;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, rj.c
    public d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public RestrictedContinuationImpl(c<Object> cVar) {
        boolean z10;
        super(cVar);
        if (cVar != null) {
            if (cVar.getContext() == EmptyCoroutineContext.INSTANCE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }
}
