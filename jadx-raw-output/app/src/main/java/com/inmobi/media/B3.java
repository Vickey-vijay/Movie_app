package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class B3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(long j10, bk.l lVar, long j11, rj.c cVar) {
        super(2, cVar);
        this.f22397c = j10;
        this.f22398d = lVar;
        this.f22399e = j11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [bk.l, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        B3 b10 = new B3(this.f22397c, this.f22398d, this.f22399e, cVar);
        b10.f22396b = obj;
        return b10;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((B3) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[PHI: r1 r8
  0x0041: PHI (r1v4 nk.l0) = (r1v3 nk.l0), (r1v5 nk.l0) binds: [B:16:0x0040, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r8v4 com.inmobi.media.B3) = (r8v3 com.inmobi.media.B3), (r8v6 com.inmobi.media.B3) binds: [B:16:0x0040, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[PHI: r1 r8
  0x0054: PHI (r1v5 nk.l0) = (r1v4 nk.l0), (r1v9 nk.l0) binds: [B:20:0x0051, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0054: PHI (r8v6 com.inmobi.media.B3) = (r8v4 com.inmobi.media.B3), (r8v7 com.inmobi.media.B3) binds: [B:20:0x0051, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bk.l, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:17:0x0041). Please report as a decompilation issue!!! */
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
            int r1 = r7.f22395a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L23
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f22396b
            nk.l0 r1 = (nk.l0) r1
            kotlin.c.b(r8)
            r8 = r7
            goto L54
        L23:
            java.lang.Object r1 = r7.f22396b
            nk.l0 r1 = (nk.l0) r1
            kotlin.c.b(r8)
            goto L40
        L2b:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.f22396b
            nk.l0 r8 = (nk.l0) r8
            long r5 = r7.f22397c
            r7.f22396b = r8
            r7.f22395a = r4
            java.lang.Object r1 = nk.s0.a(r5, r7)
            if (r1 != r0) goto L3f
            goto L60
        L3f:
            r1 = r8
        L40:
            r8 = r7
        L41:
            boolean r4 = kotlinx.coroutines.d.g(r1)
            if (r4 == 0) goto L61
            java.lang.Object r4 = r8.f22398d
            r8.f22396b = r1
            r8.f22395a = r3
            java.lang.Object r4 = r4.invoke(r8)
            if (r4 != r0) goto L54
            goto L60
        L54:
            long r4 = r8.f22399e
            r8.f22396b = r1
            r8.f22395a = r2
            java.lang.Object r4 = nk.s0.a(r4, r8)
            if (r4 != r0) goto L41
        L60:
            return r0
        L61:
            mj.r r8 = mj.r.f64562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.B3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
