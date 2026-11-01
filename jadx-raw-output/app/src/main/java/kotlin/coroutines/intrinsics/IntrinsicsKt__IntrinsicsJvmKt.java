package kotlin.coroutines.intrinsics;

import bk.p;
import bk.q;
import ck.x;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import mj.r;
import rj.c;
import tj.f;

/* JADX INFO: compiled from: IntrinsicsJvm.kt */
/* JADX INFO: loaded from: classes8.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R, T> c<r> a(final p<? super R, ? super c<? super T>, ? extends Object> pVar, final R r10, c<? super T> cVar) {
        ck.p.j(pVar, "<this>");
        ck.p.j(cVar, "completion");
        final c<?> cVarA = f.a(cVar);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r10, cVarA);
        }
        final d context = cVarA.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(cVarA, pVar, r10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            public final /* synthetic */ Object $receiver$inlined;
            public final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVarA);
                this.$this_createCoroutineUnintercepted$inlined = pVar;
                this.$receiver$inlined = r10;
                ck.p.h(cVarA, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.label;
                if (i10 == 0) {
                    this.label = 1;
                    kotlin.c.b(obj);
                    ck.p.h(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((p) x.e(this.$this_createCoroutineUnintercepted$inlined, 2)).mo1invoke(this.$receiver$inlined, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 2;
                kotlin.c.b(obj);
                return obj;
            }
        } : new ContinuationImpl(cVarA, context, pVar, r10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            public final /* synthetic */ Object $receiver$inlined;
            public final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVarA, context);
                this.$this_createCoroutineUnintercepted$inlined = pVar;
                this.$receiver$inlined = r10;
                ck.p.h(cVarA, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.label;
                if (i10 == 0) {
                    this.label = 1;
                    kotlin.c.b(obj);
                    ck.p.h(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((p) x.e(this.$this_createCoroutineUnintercepted$inlined, 2)).mo1invoke(this.$receiver$inlined, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 2;
                kotlin.c.b(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> c<T> c(c<? super T> cVar) {
        c<T> cVar2;
        ck.p.j(cVar, "<this>");
        ContinuationImpl continuationImpl = cVar instanceof ContinuationImpl ? (ContinuationImpl) cVar : null;
        return (continuationImpl == null || (cVar2 = (c<T>) continuationImpl.intercepted()) == null) ? cVar : cVar2;
    }

    public static final <R, T> Object d(p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, c<? super T> cVar) {
        ck.p.j(pVar, "<this>");
        ck.p.j(cVar, "completion");
        return ((p) x.e(pVar, 2)).mo1invoke(r10, b(f.a(cVar)));
    }

    public static final <R, P, T> Object e(q<? super R, ? super P, ? super c<? super T>, ? extends Object> qVar, R r10, P p10, c<? super T> cVar) {
        ck.p.j(qVar, "<this>");
        ck.p.j(cVar, "completion");
        return ((q) x.e(qVar, 3)).invoke(r10, p10, b(f.a(cVar)));
    }

    public static final <T> c<T> b(final c<? super T> cVar) {
        final d context = cVar.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(cVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(cVar);
                    ck.p.h(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) throws Throwable {
                    kotlin.c.b(obj);
                    return obj;
                }
            };
        }
        return new ContinuationImpl(cVar, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar, context);
                ck.p.h(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                kotlin.c.b(obj);
                return obj;
            }
        };
    }
}
