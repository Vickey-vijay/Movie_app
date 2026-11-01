package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Rk extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rk(boolean z10, rj.c cVar) {
        super(1, cVar);
        this.f23472b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Rk(this.f23472b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Rk(this.f23472b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r5.b(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (com.inmobi.media.Yk.a(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r0;
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
            int r1 = r4.f23471a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.c.b(r5)
            goto L36
        L1b:
            kotlin.c.b(r5)
            boolean r5 = r4.f23472b
            if (r5 == 0) goto L2d
            com.inmobi.media.Yk r5 = com.inmobi.media.Yk.f23865a
            r4.f23471a = r3
            java.lang.Object r5 = r5.b(r4)
            if (r5 != r0) goto L36
            goto L35
        L2d:
            r4.f23471a = r2
            java.lang.Object r5 = com.inmobi.media.Yk.a(r4)
            if (r5 != r0) goto L36
        L35:
            return r0
        L36:
            mj.r r5 = mj.r.f64562a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
