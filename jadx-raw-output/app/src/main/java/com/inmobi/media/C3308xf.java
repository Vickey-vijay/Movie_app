package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3308xf extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3333yf f25725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3308xf(C3333yf c3333yf, rj.c cVar) {
        super(2, cVar);
        this.f25725b = c3333yf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3308xf(this.f25725b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3308xf(this.f25725b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.a(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r4.f25724a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r5)
            goto L37
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.c.b(r5)
            goto L2c
        L1e:
            kotlin.c.b(r5)
            com.inmobi.media.yf r5 = r4.f25725b
            r4.f25724a = r3
            java.lang.Object r5 = com.inmobi.media.C3333yf.a(r5, r4)
            if (r5 != r0) goto L2c
            goto L36
        L2c:
            com.inmobi.media.pf r5 = com.inmobi.media.C3109pf.f25078a
            r4.f25724a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L37
        L36:
            return r0
        L37:
            mj.r r5 = mj.r.f64562a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3308xf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
