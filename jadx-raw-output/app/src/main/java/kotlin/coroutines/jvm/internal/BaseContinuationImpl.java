package kotlin.coroutines.jvm.internal;

import ck.p;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.d;
import mj.r;
import rj.c;
import sj.a;
import tj.e;
import tj.f;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseContinuationImpl implements c<Object>, tj.c, Serializable {
    private final c<Object> completion;

    public c<r> create(c<?> cVar) {
        p.j(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // rj.c
    public abstract /* synthetic */ d getContext();

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // rj.c
    public final void resumeWith(Object obj) {
        c<Object> cVar = this;
        while (true) {
            f.b(cVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            c<Object> cVar2 = baseContinuationImpl.completion;
            p.g(cVar2);
            try {
                Object objInvokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (objInvokeSuspend == a.f()) {
                    return;
                } else {
                    obj = Result.m3458constructorimpl(objInvokeSuspend);
                }
            } catch (Throwable th2) {
                Result.a aVar = Result.Companion;
                obj = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(cVar2 instanceof BaseContinuationImpl)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public c<r> create(Object obj, c<?> cVar) {
        p.j(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // tj.c
    public tj.c getCallerFrame() {
        c<Object> cVar = this.completion;
        if (cVar instanceof tj.c) {
            return (tj.c) cVar;
        }
        return null;
    }

    public final c<Object> getCompletion() {
        return this.completion;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public BaseContinuationImpl(c<Object> cVar) {
        this.completion = cVar;
    }

    public StackTraceElement getStackTraceElement() {
        return e.d(this);
    }
}
