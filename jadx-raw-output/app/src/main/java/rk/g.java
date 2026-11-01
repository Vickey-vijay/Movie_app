package rk;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import sk.z;

/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g<T> extends z<T> {
    @Override // kotlinx.coroutines.JobSupport
    public boolean f0(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return Z(th2);
    }

    public g(kotlin.coroutines.d dVar, rj.c<? super T> cVar) {
        super(dVar, cVar);
    }
}
