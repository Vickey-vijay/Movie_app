package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3034mf extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdConfig.OmidConfig f24829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f24830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3034mf(AdConfig.OmidConfig omidConfig, Context context, rj.c cVar) {
        super(2, cVar);
        this.f24829c = omidConfig;
        this.f24830d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3034mf c3034mf = new C3034mf(this.f24829c, this.f24830d, cVar);
        c3034mf.f24828b = obj;
        return c3034mf;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3034mf) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r0 == r2) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = sj.a.f()
            int r0 = r1.f24827a
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L25
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L17
            kotlin.c.b(r18)
            goto Lc0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L1f:
            kotlin.c.b(r18)     // Catch: java.lang.Throwable -> L72
            r0 = r18
            goto L6b
        L25:
            kotlin.c.b(r18)
            java.lang.Object r0 = r1.f24828b
            nk.l0 r0 = (nk.l0) r0
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r0 = r1.f24829c
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L72
            r1.f24827a = r6     // Catch: java.lang.Throwable -> L72
            java.lang.String r9 = r0.getUrl()     // Catch: java.lang.Throwable -> L72
            int r7 = r0.getMaxRetries()     // Catch: java.lang.Throwable -> L72
            int r0 = r0.getRetryInterval()     // Catch: java.lang.Throwable -> L72
            ik.i r8 = com.inmobi.media.Se.f23518a     // Catch: java.lang.Throwable -> L72
            int r0 = r0 * 1000
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L72
            com.inmobi.media.Je r0 = new com.inmobi.media.Je     // Catch: java.lang.Throwable -> L72
            r12 = 0
            r13 = 0
            r14 = 0
            com.inmobi.media.Ai r15 = new com.inmobi.media.Ai     // Catch: java.lang.Throwable -> L72
            r15.<init>(r7, r10, r4)     // Catch: java.lang.Throwable -> L72
            r7 = 0
            r16 = 46
            r8 = r0
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r7
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L72
            nk.h0 r7 = nk.w0.b()     // Catch: java.lang.Throwable -> L72
            com.inmobi.media.tf r8 = new com.inmobi.media.tf     // Catch: java.lang.Throwable -> L72
            r8.<init>(r0, r3)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = nk.h.g(r7, r8, r1)     // Catch: java.lang.Throwable -> L72
            if (r0 != r2) goto L6b
            goto Lbf
        L6b:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = kotlin.Result.m3458constructorimpl(r0)     // Catch: java.lang.Throwable -> L72
            goto L7d
        L72:
            r0 = move-exception
            kotlin.Result$a r7 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.c.a(r0)
            java.lang.Object r0 = kotlin.Result.m3458constructorimpl(r0)
        L7d:
            java.lang.Throwable r7 = kotlin.Result.m3461exceptionOrNullimpl(r0)
            if (r7 == 0) goto L88
            java.util.concurrent.atomic.AtomicInteger r7 = com.inmobi.media.C3109pf.f25079b
            r7.set(r4)
        L88:
            android.content.Context r4 = r1.f24830d
            boolean r7 = kotlin.Result.m3464isSuccessimpl(r0)
            if (r7 == 0) goto Lc0
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.util.concurrent.atomic.AtomicInteger r8 = com.inmobi.media.C3109pf.f25079b
            r8.set(r6)
            com.inmobi.media.sf r6 = com.inmobi.media.C3109pf.f25080c
            if (r6 != 0) goto La3
            com.inmobi.media.sf r6 = new com.inmobi.media.sf
            r6.<init>(r4)
            com.inmobi.media.C3109pf.f25080c = r6
        La3:
            r1.f24828b = r0
            r1.f24827a = r5
            nk.h0 r0 = nk.w0.b()
            com.inmobi.media.rf r4 = new com.inmobi.media.rf
            r4.<init>(r6, r7, r3)
            java.lang.Object r0 = nk.h.g(r0, r4, r1)
            java.lang.Object r3 = sj.a.f()
            if (r0 != r3) goto Lbb
            goto Lbd
        Lbb:
            mj.r r0 = mj.r.f64562a
        Lbd:
            if (r0 != r2) goto Lc0
        Lbf:
            return r2
        Lc0:
            mj.r r0 = mj.r.f64562a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3034mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
