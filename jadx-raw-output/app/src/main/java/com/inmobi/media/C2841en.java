package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2841en extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2867fn f24329c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2841en(C2867fn c2867fn, rj.c cVar) {
        super(2, cVar);
        this.f24329c = c2867fn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2841en c2841en = new C2841en(this.f24329c, cVar);
        c2841en.f24328b = obj;
        return c2841en;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C2841en c2841en = new C2841en(this.f24329c, (rj.c) obj2);
        c2841en.f24328b = (nk.l0) obj;
        return c2841en.invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[PHI: r0 r1 r8
  0x0035: PHI (r0v5 java.lang.Object) = (r0v4 java.lang.Object), (r0v0 java.lang.Object) binds: [B:25:0x0060, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r1v6 nk.l0) = (r1v5 nk.l0), (r1v8 nk.l0) binds: [B:25:0x0060, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r8v5 com.inmobi.media.en) = (r8v4 com.inmobi.media.en), (r8v8 com.inmobi.media.en) binds: [B:25:0x0060, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[PHI: r0 r1 r8
  0x0054: PHI (r0v4 java.lang.Object) = (r0v2 java.lang.Object), (r0v5 java.lang.Object), (r0v0 java.lang.Object) binds: [B:23:0x004e, B:19:0x0045, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0054: PHI (r1v5 nk.l0) = (r1v4 nk.l0), (r1v6 nk.l0), (r1v10 nk.l0) binds: [B:23:0x004e, B:19:0x0045, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0054: PHI (r8v4 com.inmobi.media.en) = (r8v3 com.inmobi.media.en), (r8v5 com.inmobi.media.en), (r8v10 com.inmobi.media.en) binds: [B:23:0x004e, B:19:0x0045, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:16:0x0035). Please report as a decompilation issue!!! */
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
            int r1 = r7.f24327a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r7.f24328b
            nk.l0 r1 = (nk.l0) r1
            kotlin.c.b(r8)
            goto L34
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.f24328b
            nk.l0 r1 = (nk.l0) r1
            kotlin.c.b(r8)     // Catch: java.lang.IllegalStateException -> L27
            r8 = r7
            goto L54
        L27:
            r8 = move-exception
            r4 = r1
            r1 = r0
            r0 = r7
            goto L4e
        L2c:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.f24328b
            r1 = r8
            nk.l0 r1 = (nk.l0) r1
        L34:
            r8 = r7
        L35:
            boolean r4 = kotlinx.coroutines.d.g(r1)
            if (r4 == 0) goto L63
            com.inmobi.media.fn r4 = r8.f24329c     // Catch: java.lang.IllegalStateException -> L48
            r8.f24328b = r1     // Catch: java.lang.IllegalStateException -> L48
            r8.f24327a = r3     // Catch: java.lang.IllegalStateException -> L48
            java.lang.Object r4 = com.inmobi.media.C2867fn.a(r4, r8)     // Catch: java.lang.IllegalStateException -> L48
            if (r4 != r0) goto L54
            goto L62
        L48:
            r4 = move-exception
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r6
        L4e:
            r8.toString()
            r8 = r0
            r0 = r1
            r1 = r4
        L54:
            com.inmobi.media.fn r4 = r8.f24329c
            long r4 = r4.f24392c
            r8.f24328b = r1
            r8.f24327a = r2
            java.lang.Object r4 = nk.s0.a(r4, r8)
            if (r4 != r0) goto L35
        L62:
            return r0
        L63:
            mj.r r8 = mj.r.f64562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2841en.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
