package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2796d3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f24214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HandlerC2873g3 f24215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2796d3(S2 s10, HandlerC2873g3 handlerC2873g3, rj.c cVar) {
        super(2, cVar);
        this.f24214b = s10;
        this.f24215c = handlerC2873g3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2796d3(this.f24214b, this.f24215c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2796d3(this.f24214b, this.f24215c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r7.f24213a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r2) goto L13
            kotlin.c.b(r8)
            goto L6e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.c.b(r8)
            goto L4e
        L1f:
            kotlin.c.b(r8)
            mj.g r8 = com.inmobi.media.C3271w3.f25611b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.W2 r8 = (com.inmobi.media.W2) r8
            com.inmobi.media.S2 r1 = r7.f24214b
            int r1 = r1.f23478a
            r7.f24213a = r4
            com.inmobi.media.g9 r8 = r8.f23722a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r5 = new java.lang.String[r4]
            r5[r3] = r1
            java.lang.String r1 = "click"
            java.lang.String r6 = "id=?"
            java.lang.Object r8 = r8.a(r1, r6, r5, r7)
            java.lang.Object r1 = sj.a.f()
            if (r8 != r1) goto L49
            goto L4b
        L49:
            mj.r r8 = mj.r.f64562a
        L4b:
            if (r8 != r0) goto L4e
            goto L6d
        L4e:
            java.util.List r8 = com.inmobi.media.C3271w3.f25615f
            com.inmobi.media.S2 r1 = r7.f24214b
            r8.remove(r1)
            java.util.List r8 = com.inmobi.media.C3271w3.f25615f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L98
            mj.g r8 = com.inmobi.media.C3271w3.f25611b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.W2 r8 = (com.inmobi.media.W2) r8
            r7.f24213a = r2
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L6e
        L6d:
            return r0
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L87
            android.os.Message r8 = android.os.Message.obtain()
            r8.what = r4
            com.inmobi.media.g3 r0 = r7.f24215c
            boolean r8 = r0.sendMessage(r8)
            java.lang.Boolean r8 = tj.a.a(r8)
            return r8
        L87:
            com.inmobi.media.w3 r8 = com.inmobi.media.C3271w3.f25610a
            java.lang.String r8 = "w3"
            java.lang.String r0 = "access$getTAG$p(...)"
            ck.p.i(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r8 = com.inmobi.media.C3271w3.f25616g
            r8.set(r3)
            mj.r r8 = mj.r.f64562a
            return r8
        L98:
            com.inmobi.media.g3 r8 = r7.f24215c
            java.util.List r0 = com.inmobi.media.C3271w3.f25615f
            java.lang.Object r0 = r0.get(r3)
            com.inmobi.media.S2 r0 = (com.inmobi.media.S2) r0
            int r1 = com.inmobi.media.HandlerC2873g3.f24402a
            android.os.Message r1 = android.os.Message.obtain()
            if (r0 == 0) goto Laf
            boolean r3 = r0.f23482e
            if (r3 != r4) goto Laf
            r2 = 3
        Laf:
            r1.what = r2
            r1.obj = r0
            r8.sendMessage(r1)
            mj.r r8 = mj.r.f64562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2796d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
