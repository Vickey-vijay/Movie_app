package kotlin.coroutines.jvm.internal;

import ck.m;
import ck.p;
import ck.s;
import rj.c;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements m<Object> {
    private final int arity;

    public RestrictedSuspendLambda(int i10, c<Object> cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // ck.m
    public int getArity() {
        return this.arity;
    }

    public RestrictedSuspendLambda(int i10) {
        this(i10, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() == null) {
            String strJ = s.j(this);
            p.i(strJ, "renderLambdaToString(...)");
            return strJ;
        }
        return super.toString();
    }
}
