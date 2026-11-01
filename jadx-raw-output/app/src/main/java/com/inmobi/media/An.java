package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class An extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bn f22390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public An(Bn bn2, rj.c cVar) {
        super(2, cVar);
        this.f22390b = bn2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new An(this.f22390b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new An(this.f22390b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r6.f22389a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r7)
            goto L44
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.c.b(r7)
            goto L31
        L1e:
            kotlin.c.b(r7)
            com.inmobi.media.Bn r7 = r6.f22390b
            com.inmobi.media.Dn r7 = r7.f22436b
            int r7 = r7.f22550b
            long r4 = (long) r7
            r6.f22389a = r3
            java.lang.Object r7 = nk.s0.a(r4, r6)
            if (r7 != r0) goto L31
            goto L43
        L31:
            com.inmobi.media.Bn r7 = r6.f22390b
            com.inmobi.media.Cn r1 = r7.f22438d
            r1.f22481b = r3
            qk.k r7 = r7.f22437c
            mj.r r1 = mj.r.f64562a
            r6.f22389a = r2
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            mj.r r7 = mj.r.f64562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.An.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
