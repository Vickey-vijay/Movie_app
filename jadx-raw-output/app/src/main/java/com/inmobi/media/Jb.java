package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f22922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f22923g;

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x0067->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Fb
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Fb r0 = (com.inmobi.media.Fb) r0
            int r1 = r0.f22637e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22637e = r1
            goto L18
        L13:
            com.inmobi.media.Fb r0 = new com.inmobi.media.Fb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f22635c
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f22637e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r6 = r0.f22634b
            android.content.Context r2 = r0.f22633a
            kotlin.c.b(r7)
            goto L67
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            android.content.Context r6 = r0.f22633a
            kotlin.c.b(r7)
            goto L5f
        L3e:
            kotlin.c.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f22923g
            boolean r7 = r7.get()
            if (r7 == 0) goto L4c
            mj.r r6 = mj.r.f64562a
            return r6
        L4c:
            mj.g r7 = com.inmobi.media.AbstractC3329yb.f25781a
            java.lang.Object r7 = r7.getValue()
            com.inmobi.media.xb r7 = (com.inmobi.media.C3304xb) r7
            r0.f22633a = r6
            r0.f22637e = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5f
            goto L81
        L5f:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
            r6 = r7
        L67:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()
            com.inmobi.media.qb r7 = (com.inmobi.media.C3130qb) r7
            java.lang.String r4 = r5.f22917a
            r0.f22633a = r2
            r0.f22634b = r6
            r0.f22637e = r3
            java.lang.Object r7 = r5.b(r4, r7, r0)
            if (r7 != r1) goto L67
        L81:
            return r1
        L82:
            mj.r r6 = mj.r.f64562a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.a(android.content.Context, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public Jb(Context context, String str, long j10, long j11, int i10, int i11) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "url");
        this.f22917a = str;
        this.f22918b = j10;
        this.f22919c = j11;
        this.f22920d = i10;
        this.f22921e = i11;
        WeakReference weakReference = new WeakReference(context);
        this.f22922f = weakReference;
        this.f22923g = new AtomicBoolean(false);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            nk.l0 l0Var = Sb.f23496a;
            Rb.a(new Ib(this, context2, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[PHI: r1 r2 r4 r5 r6 r7
  0x0064: PHI (r1v4 com.inmobi.media.qb) = (r1v7 com.inmobi.media.qb), (r1v17 com.inmobi.media.qb) binds: [B:49:0x010c, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r2v2 com.inmobi.media.qb) = (r2v6 com.inmobi.media.qb), (r2v12 com.inmobi.media.qb) binds: [B:49:0x010c, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r4v3 com.inmobi.media.Hb) = (r4v5 com.inmobi.media.Hb), (r4v2 com.inmobi.media.Hb) binds: [B:49:0x010c, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r5v1 java.lang.Object) = (r5v3 java.lang.Object), (r5v0 java.lang.Object) binds: [B:49:0x010c, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r6v6 java.lang.String) = (r6v8 java.lang.String), (r6v22 java.lang.String) binds: [B:49:0x010c, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r7v3 com.inmobi.media.Jb) = (r7v4 com.inmobi.media.Jb), (r7v8 com.inmobi.media.Jb) binds: [B:49:0x010c, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0120 -> B:55:0x0128). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r25, com.inmobi.media.C3130qb r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.b(java.lang.String, com.inmobi.media.qb, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, C3130qb c3130qb, ContinuationImpl continuationImpl) throws Throwable {
        Gb gb2;
        if (continuationImpl instanceof Gb) {
            gb2 = (Gb) continuationImpl;
            int i10 = gb2.f22730c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gb2.f22730c = i10 - Integer.MIN_VALUE;
            } else {
                gb2 = new Gb(this, continuationImpl);
            }
        } else {
            gb2 = new Gb(this, continuationImpl);
        }
        Object obj = gb2.f22728a;
        Object objF = sj.a.f();
        int i11 = gb2.f22730c;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return obj;
            }
            kotlin.c.b(obj);
            C3227u9 c3227u9 = (C3227u9) He.f22817h.getValue();
            ck.p.j(str, "loggingUrl");
            ck.p.j(c3130qb, "data");
            ck.p.j(str, "url");
            Le le2 = new Le(str, null, null, new S6(c3130qb.f25161a), null, 54);
            gb2.f22730c = 1;
            Object objA = c3227u9.f25449a.a(le2, gb2);
            return objA == objF ? objF : objA;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r7.a(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b7 -> B:38:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C3130qb r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.a(com.inmobi.media.qb, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
