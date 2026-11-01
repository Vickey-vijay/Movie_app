package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2782cf extends Zf {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wk.a f24132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.g f24133g;

    @Override // com.inmobi.media.Zf
    public final mj.r b() {
        nk.j.d(A9.f22351c, null, null, new Ye(this, null), 3, null);
        return mj.r.f64562a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2782cf(C3085og c3085og, C3049n5 c3049n5, Cif cif) {
        super(c3085og, c3049n5, cif);
        ck.p.j(c3085og, "dao");
        ck.p.j(c3049n5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ck.p.j(cif, "networkHandler");
        this.f24132f = wk.g.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r12.isCancelled() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.inmobi.media.Ze
            if (r0 == 0) goto L13
            r0 = r12
            com.inmobi.media.Ze r0 = (com.inmobi.media.Ze) r0
            int r1 = r0.f23913d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23913d = r1
            goto L18
        L13:
            com.inmobi.media.Ze r0 = new com.inmobi.media.Ze
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f23911b
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f23913d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            wk.a r0 = r0.f23910a
            kotlin.c.b(r12)
            goto L45
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            kotlin.c.b(r12)
            wk.a r12 = r11.f24132f
            r0.f23910a = r12
            r0.f23913d = r3
            java.lang.Object r0 = r12.a(r4, r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r12
        L45:
            kotlinx.coroutines.g r12 = r11.f24133g     // Catch: java.lang.Throwable -> L95
            if (r12 == 0) goto L63
            ck.p.g(r12)     // Catch: java.lang.Throwable -> L95
            boolean r12 = r12.d()     // Catch: java.lang.Throwable -> L95
            if (r12 == 0) goto L5d
            kotlinx.coroutines.g r12 = r11.f24133g     // Catch: java.lang.Throwable -> L95
            ck.p.g(r12)     // Catch: java.lang.Throwable -> L95
            boolean r12 = r12.isCancelled()     // Catch: java.lang.Throwable -> L95
            if (r12 != 0) goto L63
        L5d:
            mj.r r12 = mj.r.f64562a     // Catch: java.lang.Throwable -> L95
            r0.b(r4)
            return r12
        L63:
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config r12 = com.inmobi.media.Zf.a()     // Catch: java.lang.Throwable -> L95
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config$PingIntervalConfig r12 = r12.getInterval()     // Catch: java.lang.Throwable -> L95
            int r12 = r12.getNormal()     // Catch: java.lang.Throwable -> L95
            long r1 = (long) r12     // Catch: java.lang.Throwable -> L95
            r5 = 0
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 > 0) goto L7c
            mj.r r12 = mj.r.f64562a     // Catch: java.lang.Throwable -> L95
            r0.b(r4)
            return r12
        L7c:
            nk.l0 r5 = com.inmobi.media.A9.f22351c     // Catch: java.lang.Throwable -> L95
            r6 = 0
            r12 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r12     // Catch: java.lang.Throwable -> L95
            long r8 = r8 * r1
            com.inmobi.media.af r10 = new com.inmobi.media.af     // Catch: java.lang.Throwable -> L95
            r10.<init>(r11, r4)     // Catch: java.lang.Throwable -> L95
            kotlinx.coroutines.g r12 = com.inmobi.media.F3.a(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L95
            r11.f24133g = r12     // Catch: java.lang.Throwable -> L95
            mj.r r12 = mj.r.f64562a     // Catch: java.lang.Throwable -> L95
            r0.b(r4)
            return r12
        L95:
            r12 = move-exception
            r0.b(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2782cf.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) {
        C2756bf c2756bf;
        wk.a aVar;
        if (continuationImpl instanceof C2756bf) {
            c2756bf = (C2756bf) continuationImpl;
            int i10 = c2756bf.f24074d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2756bf.f24074d = i10 - Integer.MIN_VALUE;
            } else {
                c2756bf = new C2756bf(this, continuationImpl);
            }
        } else {
            c2756bf = new C2756bf(this, continuationImpl);
        }
        Object obj = c2756bf.f24072b;
        Object objF = sj.a.f();
        int i11 = c2756bf.f24074d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = this.f24132f;
            c2756bf.f24071a = aVar2;
            c2756bf.f24074d = 1;
            if (aVar2.a(null, c2756bf) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c2756bf.f24071a;
            kotlin.c.b(obj);
        }
        try {
            kotlinx.coroutines.g gVar = this.f24133g;
            if (gVar != null) {
                kotlinx.coroutines.g.a.a(gVar, null, 1, null);
            }
            this.f24133g = null;
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5 A[PHI: r2 r14
  0x00a5: PHI (r2v8 java.util.List) = (r2v6 java.util.List), (r2v11 java.util.List) binds: [B:31:0x00a2, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r14v16 java.lang.Object) = (r14v13 java.lang.Object), (r14v1 java.lang.Object) binds: [B:31:0x00a2, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[LOOP:0: B:47:0x00d5->B:49:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        if (r14 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2782cf.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
