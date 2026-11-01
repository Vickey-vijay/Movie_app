package kotlinx.coroutines.flow;

import bk.p;
import bk.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import rj.c;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
public final class FlowKt__LimitKt$transformWhile$1<R> extends SuspendLambda implements p<qk.d<? super R>, c<? super r>, Object> {
    public final /* synthetic */ qk.c<T> $this_transformWhile;
    public final /* synthetic */ q<qk.d<? super R>, T, c<? super Boolean>, Object> $transform;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(qk.c<? extends T> cVar, q<? super qk.d<? super R>, ? super T, ? super c<? super Boolean>, ? extends Object> qVar, c<? super FlowKt__LimitKt$transformWhile$1> cVar2) {
        super(2, cVar2);
        this.$this_transformWhile = cVar;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.$this_transformWhile, this.$transform, cVar);
        flowKt__LimitKt$transformWhile$1.L$0 = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Object mo1invoke(qk.d<? super R> dVar, c<? super r> cVar) {
        return ((FlowKt__LimitKt$transformWhile$1) create(dVar, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type rj.c to kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1<R> for r5v1 'this'  rj.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r5.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) r0
            kotlin.c.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L13
            goto L44
        L13:
            r6 = move-exception
            goto L3a
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.c.b(r6)
            java.lang.Object r6 = r5.L$0
            qk.d r6 = (qk.d) r6
            qk.c<T> r1 = r5.$this_transformWhile
            bk.q<qk.d<? super R>, T, rj.c<? super java.lang.Boolean>, java.lang.Object> r3 = r5.$transform
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
            r4.<init>(r3, r6)
            r5.L$0 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            r5.label = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            java.lang.Object r6 = r1.collect(r4, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            if (r6 != r0) goto L44
            return r0
        L38:
            r6 = move-exception
            r0 = r4
        L3a:
            rk.i.a(r6, r0)
            kotlin.coroutines.d r6 = r5.getContext()
            nk.t1.h(r6)
        L44:
            mj.r r6 = mj.r.f64562a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
