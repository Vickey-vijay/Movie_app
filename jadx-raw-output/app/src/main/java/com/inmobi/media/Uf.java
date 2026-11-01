package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class Uf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static F8 f23647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3099p5 f23648c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uf f23646a = new Uf();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f23649d = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if (r7 == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Uf.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r7 == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Tf
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Tf r0 = (com.inmobi.media.Tf) r0
            int r1 = r0.f23563c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23563c = r1
            goto L18
        L13:
            com.inmobi.media.Tf r0 = new com.inmobi.media.Tf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f23561a
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f23563c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.c.b(r7)
            goto Lae
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.c.b(r7)
            goto L76
        L39:
            kotlin.c.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = com.inmobi.media.Uf.f23649d
            r2 = 0
            boolean r7 = r7.compareAndSet(r4, r2)
            if (r7 == 0) goto Lb1
            com.inmobi.media.F8 r7 = com.inmobi.media.Uf.f23647b
            if (r7 == 0) goto L76
            r0.f23563c = r4
            com.inmobi.media.m7 r7 = r7.f22624d
            r7.getClass()
            com.inmobi.media.Wf r2 = com.inmobi.media.Wf.STOPPED
            com.inmobi.media.Wf r4 = r7.f23917d
            com.inmobi.media.Wf r5 = com.inmobi.media.Wf.STARTED
            if (r4 != r5) goto L68
            r7.f23917d = r2
            java.lang.Object r7 = r7.e(r0)
            java.lang.Object r2 = sj.a.f()
            if (r7 != r2) goto L65
            goto L6a
        L65:
            mj.r r7 = mj.r.f64562a
            goto L6a
        L68:
            mj.r r7 = mj.r.f64562a
        L6a:
            java.lang.Object r2 = sj.a.f()
            if (r7 != r2) goto L71
            goto L73
        L71:
            mj.r r7 = mj.r.f64562a
        L73:
            if (r7 != r1) goto L76
            goto Lad
        L76:
            com.inmobi.media.p5 r7 = com.inmobi.media.Uf.f23648c
            if (r7 == 0) goto Lb1
            r0.f23563c = r3
            java.lang.String r2 = "p5"
            java.lang.String r3 = "TAG"
            ck.p.i(r2, r3)
            com.inmobi.media.cf r7 = r7.f25037d
            r7.getClass()
            com.inmobi.media.Wf r2 = com.inmobi.media.Wf.STOPPED
            com.inmobi.media.Wf r3 = r7.f23917d
            com.inmobi.media.Wf r4 = com.inmobi.media.Wf.STARTED
            if (r3 != r4) goto La0
            r7.f23917d = r2
            java.lang.Object r7 = r7.d(r0)
            java.lang.Object r0 = sj.a.f()
            if (r7 != r0) goto L9d
            goto La2
        L9d:
            mj.r r7 = mj.r.f64562a
            goto La2
        La0:
            mj.r r7 = mj.r.f64562a
        La2:
            java.lang.Object r0 = sj.a.f()
            if (r7 != r0) goto La9
            goto Lab
        La9:
            mj.r r7 = mj.r.f64562a
        Lab:
            if (r7 != r1) goto Lae
        Lad:
            return r1
        Lae:
            mj.r r7 = mj.r.f64562a
            return r7
        Lb1:
            mj.r r7 = mj.r.f64562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Uf.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
