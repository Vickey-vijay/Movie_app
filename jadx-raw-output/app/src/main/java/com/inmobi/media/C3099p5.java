package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3099p5 extends AbstractC2935ig {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2782cf f25037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3099p5(C3085og c3085og) {
        super(c3085og);
        ck.p.j(c3085og, "dao");
        this.f25037d = new C2782cf(c3085og, new C3049n5(this), this.f24560c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r13.a(r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.Rf r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.inmobi.media.C3074o5
            if (r0 == 0) goto L13
            r0 = r14
            com.inmobi.media.o5 r0 = (com.inmobi.media.C3074o5) r0
            int r1 = r0.f24955d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24955d = r1
            goto L18
        L13:
            com.inmobi.media.o5 r0 = new com.inmobi.media.o5
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f24953b
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f24955d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.c.b(r14)
            goto Lb4
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            kotlin.c.b(r14)
            goto La9
        L3d:
            com.inmobi.media.Rf r13 = r0.f24952a
            kotlin.c.b(r14)
            goto L5c
        L43:
            kotlin.c.b(r14)
            java.lang.String r14 = "p5"
            java.lang.String r2 = "TAG"
            ck.p.i(r14, r2)
            java.lang.String r14 = r13.f23453b
            java.lang.String r14 = r13.f23456e
            r0.f24952a = r13
            r0.f24955d = r5
            java.lang.Object r14 = r12.a(r14, r0)
            if (r14 != r1) goto L5c
            goto Lb3
        L5c:
            r8 = r13
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            r14 = 0
            if (r13 != 0) goto L8a
            java.util.concurrent.ConcurrentHashMap r13 = r12.f24559b
            java.lang.String r0 = r8.f23459h
            java.lang.Object r13 = r13.get(r0)
            java.lang.ref.WeakReference r13 = (java.lang.ref.WeakReference) r13
            if (r13 == 0) goto L7a
            java.lang.Object r13 = r13.get()
            com.inmobi.media.fg r13 = (com.inmobi.media.InterfaceC2860fg) r13
            r11 = r13
            goto L7b
        L7a:
            r11 = r14
        L7b:
            long r9 = java.lang.System.currentTimeMillis()
            r5 = 0
            r7 = 2248(0x8c8, float:3.15E-42)
            java.lang.String r6 = "Database capacity exceeded for pings"
            com.inmobi.media.AbstractC2935ig.a(r5, r6, r7, r8, r9, r11)
            mj.r r13 = mj.r.f64562a
            return r13
        L8a:
            com.inmobi.media.og r13 = r12.f24558a
            r0.f24952a = r14
            r0.f24955d = r4
            com.inmobi.media.g9 r13 = r13.f24997a
            android.content.ContentValues r14 = com.inmobi.media.AbstractC3110pg.a(r8)
            r2 = 4
            java.lang.String r4 = "pings"
            java.lang.Object r13 = r13.a(r4, r14, r2, r0)
            java.lang.Object r14 = sj.a.f()
            if (r13 != r14) goto La4
            goto La6
        La4:
            mj.r r13 = mj.r.f64562a
        La6:
            if (r13 != r1) goto La9
            goto Lb3
        La9:
            com.inmobi.media.cf r13 = r12.f25037d
            r0.f24955d = r3
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            mj.r r13 = mj.r.f64562a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3099p5.a(com.inmobi.media.Rf, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
