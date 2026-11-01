package kotlin.coroutines.jvm.internal;

import ck.p;
import kotlin.coroutines.d;
import rj.c;
import tj.b;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final d _context;
    private transient c<Object> intercepted;

    public ContinuationImpl(c<Object> cVar, d dVar) {
        super(cVar);
        this._context = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, rj.c
    public d getContext() {
        d dVar = this._context;
        p.g(dVar);
        return dVar;
    }

    public final c<Object> intercepted() {
        c<Object> cVarInterceptContinuation = this.intercepted;
        if (cVarInterceptContinuation == null) {
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) getContext().get(kotlin.coroutines.c.D8);
            if (cVar == null || (cVarInterceptContinuation = cVar.interceptContinuation(this)) == null) {
                cVarInterceptContinuation = this;
            }
            this.intercepted = cVarInterceptContinuation;
        }
        return cVarInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        c<?> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            d.b bVar = getContext().get(kotlin.coroutines.c.D8);
            p.g(bVar);
            ((kotlin.coroutines.c) bVar).releaseInterceptedContinuation(cVar);
        }
        this.intercepted = b.f72420b;
    }

    public ContinuationImpl(c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
