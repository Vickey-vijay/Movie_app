package androidx.work;

import ck.n;
import ck.p;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q5.i;
import rj.c;
import sj.a;
import tj.d;
import tj.f;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Landroidx/work/Operation;", "Landroidx/work/Operation$State$SUCCESS;", "await", "(Landroidx/work/Operation;Lrj/c;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class OperationKt {

    /* JADX INFO: renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @d(c = "androidx.work.OperationKt", f = "Operation.kt", l = {39}, m = "await")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object await(Operation operation, c<? super Operation.State.SUCCESS> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object obj;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objB = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objB);
            i<Operation.State.SUCCESS> result = operation.getResult();
            p.i(result, "result");
            if (result.isDone()) {
                try {
                    obj = result.get();
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    if (cause == null) {
                        throw e10;
                    }
                    throw cause;
                }
            } else {
                anonymousClass1.L$0 = result;
                anonymousClass1.label = 1;
                kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(anonymousClass1), 1);
                cVar2.J();
                result.addListener(new ListenableFutureKt$await$2$1(cVar2, result), DirectExecutor.INSTANCE);
                objB = cVar2.B();
                if (objB == a.f()) {
                    f.c(anonymousClass1);
                }
                if (objB == objF) {
                    return objF;
                }
            }
            p.i(obj, "result.await()");
            return obj;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(objB);
        obj = objB;
        p.i(obj, "result.await()");
        return obj;
    }

    private static final Object await$$forInline(Operation operation, c<? super Operation.State.SUCCESS> cVar) throws Throwable {
        Object objB;
        i<Operation.State.SUCCESS> result = operation.getResult();
        p.i(result, "result");
        if (result.isDone()) {
            try {
                objB = result.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            n.c(0);
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            result.addListener(new ListenableFutureKt$await$2$1(cVar2, result), DirectExecutor.INSTANCE);
            objB = cVar2.B();
            if (objB == a.f()) {
                f.c(cVar);
            }
            n.c(1);
        }
        p.i(objB, "result.await()");
        return objB;
    }
}
