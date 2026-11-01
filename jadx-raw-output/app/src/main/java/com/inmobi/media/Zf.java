package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3085og f23914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vf f23915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cif f23916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Wf f23917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f23918e;

    public static Xf a(Rf rf2, Ne ne2) {
        String str = rf2.f23452a;
        ne2.c();
        ne2.e();
        return new Xf(rf2, ne2.c(), ne2.e());
    }

    public abstract mj.r b();

    public Zf(C3085og c3085og, Vf vf2, Cif cif) {
        ck.p.j(c3085og, "dao");
        ck.p.j(cif, "networkHandler");
        this.f23914a = c3085og;
        this.f23915b = vf2;
        this.f23916c = cif;
        this.f23917d = Wf.STOPPED;
        this.f23918e = new ConcurrentHashMap();
    }

    public static AdConfig.PingsV2Config a() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f23815a.a(AdConfig.class)).getPingsV2Config();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r5.mo1invoke(r2, r3) == r4) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.Rf r18, bk.p r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof com.inmobi.media.Yf
            if (r3 == 0) goto L19
            r3 = r2
            com.inmobi.media.Yf r3 = (com.inmobi.media.Yf) r3
            int r4 = r3.f23853e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f23853e = r4
            goto L1e
        L19:
            com.inmobi.media.Yf r3 = new com.inmobi.media.Yf
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f23851c
            java.lang.Object r4 = sj.a.f()
            int r5 = r3.f23853e
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4a
            if (r5 == r7) goto L3d
            if (r5 != r6) goto L35
            com.inmobi.media.Rf r1 = r3.f23849a
            kotlin.c.b(r2)
            goto Lb4
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            bk.p r1 = r3.f23850b
            com.inmobi.media.Rf r5 = r3.f23849a
            kotlin.c.b(r2)
            r16 = r5
            r5 = r1
            r1 = r16
            goto La0
        L4a:
            kotlin.c.b(r2)
            com.inmobi.media.Wf r2 = r0.f23917d
            com.inmobi.media.Wf r5 = com.inmobi.media.Wf.STARTED
            if (r2 != r5) goto Lbe
            java.util.concurrent.ConcurrentHashMap r2 = r0.f23918e
            java.lang.String r5 = r1.f23453b
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L60
            mj.r r1 = mj.r.f64562a
            return r1
        L60:
            java.util.concurrent.ConcurrentHashMap r2 = r0.f23918e
            java.lang.String r5 = r1.f23453b
            java.lang.String r8 = r1.f23452a
            r2.put(r5, r8)
            com.inmobi.media.if r2 = r0.f23916c
            r3.f23849a = r1
            r5 = r19
            r3.f23850b = r5
            r3.f23853e = r7
            r2.getClass()
            java.util.HashMap r10 = new java.util.HashMap
            java.util.Map r7 = r1.f23454c
            r10.<init>(r7)
            java.lang.String r7 = com.inmobi.media.Ji.c()
            java.lang.String r8 = "user-agent"
            r10.put(r8, r7)
            com.inmobi.media.Je r7 = new com.inmobi.media.Je
            java.lang.String r9 = r1.f23452a
            r11 = 0
            r12 = 0
            r13 = 0
            boolean r14 = r1.f23455d
            r15 = 28
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            com.inmobi.media.u9 r2 = r2.f24557a
            com.inmobi.media.x4 r2 = r2.f25449a
            java.lang.Object r2 = r2.a(r7, r3)
            if (r2 != r4) goto La0
            goto Lb3
        La0:
            com.inmobi.media.Ne r2 = (com.inmobi.media.Ne) r2
            com.inmobi.media.Xf r2 = a(r1, r2)
            r3.f23849a = r1
            r7 = 0
            r3.f23850b = r7
            r3.f23853e = r6
            java.lang.Object r2 = r5.mo1invoke(r2, r3)
            if (r2 != r4) goto Lb4
        Lb3:
            return r4
        Lb4:
            java.util.concurrent.ConcurrentHashMap r2 = r0.f23918e
            java.lang.String r1 = r1.f23453b
            r2.remove(r1)
            mj.r r1 = mj.r.f64562a
            return r1
        Lbe:
            mj.r r1 = mj.r.f64562a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Zf.a(com.inmobi.media.Rf, bk.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(ContinuationImpl continuationImpl) {
        Wf wf2 = this.f23917d;
        Wf wf3 = Wf.STARTED;
        Wf wf4 = Wf.STOPPED;
        Objects.toString(wf2);
        if (this.f23917d == wf4) {
            this.f23917d = wf3;
            mj.r rVarB = b();
            return rVarB == sj.a.f() ? rVarB : mj.r.f64562a;
        }
        return mj.r.f64562a;
    }
}
