package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2981kc extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3006lc f24667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3324y6 f24668c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2981kc(C3006lc c3006lc, AbstractC3324y6 abstractC3324y6, rj.c cVar) {
        super(2, cVar);
        this.f24667b = c3006lc;
        this.f24668c = abstractC3324y6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2981kc(this.f24667b, this.f24668c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2981kc(this.f24667b, this.f24668c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r1.a(r13, r12) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r12.f24666a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r13)
            goto L7c
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.c.b(r13)
            goto L6b
        L1e:
            kotlin.c.b(r13)
            com.inmobi.media.lc r13 = r12.f24667b
            com.inmobi.media.x6 r1 = r13.f24767d
            com.inmobi.media.y6 r4 = r12.f24668c
            r1.getClass()
            java.lang.String r5 = "experienceModel"
            ck.p.j(r4, r5)
            boolean r5 = r4 instanceof com.inmobi.media.C3312xj
            if (r5 == 0) goto L45
            com.inmobi.media.wj r5 = new com.inmobi.media.wj
            android.content.Context r7 = r1.f25705a
            nk.l0 r8 = r1.f25706b
            r9 = r4
            com.inmobi.media.xj r9 = (com.inmobi.media.C3312xj) r9
            qk.k r10 = r1.f25707c
            com.inmobi.media.n9 r11 = r1.f25708d
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L5a
        L45:
            boolean r5 = r4 instanceof com.inmobi.media.C3116pm
            if (r5 == 0) goto L81
            com.inmobi.media.om r5 = new com.inmobi.media.om
            android.content.Context r7 = r1.f25705a
            nk.l0 r8 = r1.f25706b
            r9 = r4
            com.inmobi.media.pm r9 = (com.inmobi.media.C3116pm) r9
            qk.k r10 = r1.f25707c
            com.inmobi.media.n9 r11 = r1.f25708d
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
        L5a:
            r13.f24765b = r5
            com.inmobi.media.lc r13 = r12.f24667b
            com.inmobi.media.j2 r13 = r13.f24765b
            if (r13 == 0) goto L6b
            r12.f24666a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L6b
            goto L7b
        L6b:
            com.inmobi.media.lc r13 = r12.f24667b
            com.inmobi.media.j2 r1 = r13.f24765b
            if (r1 == 0) goto L7c
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.f24766c
            r12.f24666a = r2
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L7c
        L7b:
            return r0
        L7c:
            com.inmobi.media.lc r13 = r12.f24667b
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.f24766c
            return r13
        L81:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2981kc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
