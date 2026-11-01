package kotlinx.coroutines;

import bk.p;
import kk.k;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import mj.r;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@tj.d(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements p<k<? super g>, rj.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, rj.c<? super JobSupport$children$1> cVar) {
        super(2, cVar);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c<r> create(Object obj, rj.c<?> cVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, cVar);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(k<? super g> kVar, rj.c<? super r> cVar) {
        return ((JobSupport$children$1) create(kVar, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:27:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:27:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r7.L$1
            sk.o r3 = (sk.o) r3
            java.lang.Object r4 = r7.L$0
            kk.k r4 = (kk.k) r4
            kotlin.c.b(r8)
            r8 = r7
            goto L83
        L1f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L27:
            kotlin.c.b(r8)
            goto L88
        L2b:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.L$0
            kk.k r8 = (kk.k) r8
            kotlinx.coroutines.JobSupport r1 = r7.this$0
            java.lang.Object r1 = r1.t0()
            boolean r4 = r1 instanceof nk.s
            if (r4 == 0) goto L49
            nk.s r1 = (nk.s) r1
            nk.t r1 = r1.f64821f
            r7.label = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L88
            return r0
        L49:
            boolean r3 = r1 instanceof nk.o1
            if (r3 == 0) goto L88
            nk.o1 r1 = (nk.o1) r1
            nk.z1 r1 = r1.b()
            if (r1 == 0) goto L88
            java.lang.Object r3 = r1.j()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            ck.p.h(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L65:
            boolean r5 = ck.p.e(r1, r3)
            if (r5 != 0) goto L88
            boolean r5 = r1 instanceof nk.s
            if (r5 == 0) goto L83
            r5 = r1
            nk.s r5 = (nk.s) r5
            nk.t r5 = r5.f64821f
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r5 = r4.a(r5, r8)
            if (r5 != r0) goto L83
            return r0
        L83:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.k()
            goto L65
        L88:
            mj.r r8 = mj.r.f64562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
