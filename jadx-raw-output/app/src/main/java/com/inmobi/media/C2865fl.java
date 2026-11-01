package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2865fl extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f24385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2865fl(long j10, rj.c cVar, bk.l lVar) {
        super(2, cVar);
        this.f24384b = j10;
        this.f24385c = (SuspendLambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2865fl(this.f24384b, cVar, this.f24385c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2865fl(this.f24384b, (rj.c) obj2, this.f24385c).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.invoke(r6) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r7v2, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r6.f24383a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r7)
            goto L37
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.c.b(r7)
            goto L2c
        L1e:
            kotlin.c.b(r7)
            long r4 = r6.f24384b
            r6.f24383a = r3
            java.lang.Object r7 = nk.s0.a(r4, r6)
            if (r7 != r0) goto L2c
            goto L36
        L2c:
            kotlin.coroutines.jvm.internal.SuspendLambda r7 = r6.f24385c
            r6.f24383a = r2
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L37
        L36:
            return r0
        L37:
            mj.r r7 = mj.r.f64562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2865fl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
