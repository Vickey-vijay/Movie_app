package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3156rd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dd f25262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3156rd(Dd dd2, rj.c cVar) {
        super(2, cVar);
        this.f25262b = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3156rd(this.f25262b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3156rd(this.f25262b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 == r0) goto L36;
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
            int r1 = r12.f25261a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.c.b(r13)
            goto Lb9
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            kotlin.c.b(r13)
            goto L4d
        L23:
            kotlin.c.b(r13)
            goto L42
        L27:
            kotlin.c.b(r13)
            com.inmobi.media.Dd r13 = r12.f25262b
            r12.f25261a = r4
            r13.getClass()
            nk.y1 r1 = nk.w0.c()
            com.inmobi.media.sd r4 = new com.inmobi.media.sd
            r4.<init>(r13, r5)
            java.lang.Object r13 = nk.h.g(r1, r4, r12)
            if (r13 != r0) goto L42
            goto Lb8
        L42:
            com.inmobi.media.pf r13 = com.inmobi.media.C3109pf.f25078a
            r12.f25261a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L4d
            goto Lb8
        L4d:
            com.inmobi.media.Dd r13 = r12.f25262b
            com.inmobi.media.Ec r1 = r13.f22519b
            com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse r1 = r1.f22584b
            com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject r1 = r1.getAssetsObject()
            if (r1 == 0) goto L5e
            com.inmobi.media.ads.network.inmobiJson.model.NativeMedia r1 = r1.getMedia()
            goto L5f
        L5e:
            r1 = r5
        L5f:
            java.lang.String r3 = "NativeLoadingState"
            if (r1 != 0) goto L71
            com.inmobi.media.m9 r13 = r13.l()
            if (r13 == 0) goto L9d
            com.inmobi.media.n9 r13 = (com.inmobi.media.C3053n9) r13
            java.lang.String r1 = "listenToVideoLoadAndErrorEvents - no media assets, skipping"
            r13.a(r3, r1)
            goto L9d
        L71:
            com.inmobi.media.m9 r1 = r13.l()
            if (r1 == 0) goto L7e
            com.inmobi.media.n9 r1 = (com.inmobi.media.C3053n9) r1
            java.lang.String r4 = "listenToVideoLoadAndErrorEvents - media assets found, setting up listener"
            r1.a(r3, r4)
        L7e:
            com.inmobi.media.Ec r1 = r13.f22519b
            mj.g r1 = r1.f22589g
            java.lang.Object r1 = r1.getValue()
            com.inmobi.media.lc r1 = (com.inmobi.media.C3006lc) r1
            qk.k r1 = r1.f24768e
            com.inmobi.media.xd r3 = new com.inmobi.media.xd
            r3.<init>(r1)
            nk.l0 r6 = r13.f22522e
            com.inmobi.media.ud r9 = new com.inmobi.media.ud
            r9.<init>(r3, r5, r13)
            r7 = 0
            r8 = 0
            r10 = 3
            r11 = 0
            nk.h.d(r6, r7, r8, r9, r10, r11)
        L9d:
            com.inmobi.media.Dd r13 = r12.f25262b
            r12.f25261a = r2
            r13.getClass()
            com.inmobi.media.Ad r1 = new com.inmobi.media.Ad
            r1.<init>(r13, r5)
            java.lang.Object r13 = nk.j2.c(r1, r12)
            java.lang.Object r1 = sj.a.f()
            if (r13 != r1) goto Lb4
            goto Lb6
        Lb4:
            mj.r r13 = mj.r.f64562a
        Lb6:
            if (r13 != r0) goto Lb9
        Lb8:
            return r0
        Lb9:
            mj.r r13 = mj.r.f64562a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3156rd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
