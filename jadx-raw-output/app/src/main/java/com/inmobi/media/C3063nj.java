package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3063nj extends T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3053n9 f24907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24908c;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (nk.h.g(r13, r14, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3063nj r12, java.lang.String r13, com.inmobi.media.Cj r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof com.inmobi.media.C2988kj
            if (r0 == 0) goto L16
            r0 = r15
            com.inmobi.media.kj r0 = (com.inmobi.media.C2988kj) r0
            int r1 = r0.f24693e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f24693e = r1
            goto L1b
        L16:
            com.inmobi.media.kj r0 = new com.inmobi.media.kj
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.f24691c
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f24693e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.c.b(r15)
            goto L77
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            com.inmobi.media.Cj r14 = r0.f24690b
            java.lang.String r13 = r0.f24689a
            kotlin.c.b(r15)
            goto L59
        L40:
            kotlin.c.b(r15)
            nk.y1 r15 = nk.w0.c()
            com.inmobi.media.mj r2 = new com.inmobi.media.mj
            r2.<init>(r12, r5)
            r0.f24689a = r13
            r0.f24690b = r14
            r0.f24693e = r4
            java.lang.Object r15 = nk.h.g(r15, r2, r0)
            if (r15 != r1) goto L59
            goto L76
        L59:
            r9 = r13
            r7 = r14
            r10 = r15
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            nk.h0 r13 = nk.w0.b()
            com.inmobi.media.lj r14 = new com.inmobi.media.lj
            r11 = 0
            r6 = r14
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f24689a = r5
            r0.f24690b = r5
            r0.f24693e = r3
            java.lang.Object r12 = nk.h.g(r13, r14, r0)
            if (r12 != r1) goto L77
        L76:
            return r1
        L77:
            mj.r r12 = mj.r.f64562a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3063nj.a(com.inmobi.media.nj, java.lang.String, com.inmobi.media.Cj, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public C3063nj(Context context, C3053n9 c3053n9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f24906a = context;
        this.f24907b = c3053n9;
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        this.f24908c = "Static-Companion-" + string;
    }

    public final Object a(C3261vi c3261vi, J3 j10) throws C2779cc {
        if (URLUtil.isNetworkUrl(c3261vi.f25577a)) {
            return nk.h.g(nk.w0.c(), new C2963jj(this, c3261vi, null), j10);
        }
        throw new C2779cc("Companion Invalid Resource Error");
    }
}
