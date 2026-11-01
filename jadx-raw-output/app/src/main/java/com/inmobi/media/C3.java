package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class C3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f22447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3(long j10, rj.c cVar, bk.l lVar) {
        super(2, cVar);
        this.f22447c = (SuspendLambda) lVar;
        this.f22448d = j10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3 c10 = new C3(this.f22448d, cVar, this.f22447c);
        c10.f22446b = obj;
        return c10;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[PHI: r1 r7
  0x0041: PHI (r1v4 nk.l0) = (r1v3 nk.l0), (r1v5 nk.l0) binds: [B:16:0x0040, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r7v4 com.inmobi.media.C3) = (r7v3 com.inmobi.media.C3), (r7v6 com.inmobi.media.C3) binds: [B:16:0x0040, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[PHI: r1 r7
  0x0054: PHI (r1v5 nk.l0) = (r1v4 nk.l0), (r1v9 nk.l0) binds: [B:20:0x0051, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0054: PHI (r7v6 com.inmobi.media.C3) = (r7v4 com.inmobi.media.C3), (r7v7 com.inmobi.media.C3) binds: [B:20:0x0051, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v3, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:17:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r6.f22445a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L23
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f22446b
            nk.l0 r1 = (nk.l0) r1
            kotlin.c.b(r7)
            r7 = r6
            goto L54
        L23:
            java.lang.Object r1 = r6.f22446b
            nk.l0 r1 = (nk.l0) r1
            kotlin.c.b(r7)
            goto L40
        L2b:
            kotlin.c.b(r7)
            java.lang.Object r7 = r6.f22446b
            nk.l0 r7 = (nk.l0) r7
            r6.f22446b = r7
            r6.f22445a = r4
            r4 = 0
            java.lang.Object r1 = nk.s0.a(r4, r6)
            if (r1 != r0) goto L3f
            goto L60
        L3f:
            r1 = r7
        L40:
            r7 = r6
        L41:
            boolean r4 = kotlinx.coroutines.d.g(r1)
            if (r4 == 0) goto L61
            kotlin.coroutines.jvm.internal.SuspendLambda r4 = r7.f22447c
            r7.f22446b = r1
            r7.f22445a = r3
            java.lang.Object r4 = r4.invoke(r7)
            if (r4 != r0) goto L54
            goto L60
        L54:
            long r4 = r7.f22448d
            r7.f22446b = r1
            r7.f22445a = r2
            java.lang.Object r4 = nk.s0.a(r4, r7)
            if (r4 != r0) goto L41
        L60:
            return r0
        L61:
            mj.r r7 = mj.r.f64562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
