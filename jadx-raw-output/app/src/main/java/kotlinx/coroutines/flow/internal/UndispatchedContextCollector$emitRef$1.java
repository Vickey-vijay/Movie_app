package kotlinx.coroutines.flow.internal;

import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import rj.c;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
public final class UndispatchedContextCollector$emitRef$1<T> extends SuspendLambda implements p<T, c<? super r>, Object> {
    public final /* synthetic */ qk.d<T> $downstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(qk.d<? super T> dVar, c<? super UndispatchedContextCollector$emitRef$1> cVar) {
        super(2, cVar);
        this.$downstream = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, cVar);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(T t10, c<? super r> cVar) {
        return ((UndispatchedContextCollector$emitRef$1) create(t10, cVar)).invokeSuspend(r.f64562a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type rj.c to kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1<T> for r3v1 'this'  rj.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.c.b(r4)
            goto L27
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.c.b(r4)
            java.lang.Object r4 = r3.L$0
            qk.d<T> r1 = r3.$downstream
            r3.label = r2
            java.lang.Object r4 = r1.emit(r4, r3)
            if (r4 != r0) goto L27
            return r0
        L27:
            mj.r r4 = mj.r.f64562a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
