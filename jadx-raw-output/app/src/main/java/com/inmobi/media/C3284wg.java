package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3284wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nn f25646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qk.l f25647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk.l0 f25648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3334yg f25649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.g f25650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25651f;

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:17:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.inmobi.media.C3284wg r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.inmobi.media.C3234ug
            if (r0 == 0) goto L16
            r0 = r8
            com.inmobi.media.ug r0 = (com.inmobi.media.C3234ug) r0
            int r1 = r0.f25481c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f25481c = r1
            goto L1b
        L16:
            com.inmobi.media.ug r0 = new com.inmobi.media.ug
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f25479a
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f25481c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            goto L38
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.c.b(r8)
            goto L56
        L38:
            kotlin.c.b(r8)
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f25651f
            boolean r8 = r8.get()
            if (r8 != 0) goto L64
            nk.y1 r8 = nk.w0.c()
            com.inmobi.media.vg r2 = new com.inmobi.media.vg
            r5 = 0
            r2.<init>(r7, r5)
            r0.f25481c = r4
            java.lang.Object r8 = nk.h.g(r8, r2, r0)
            if (r8 != r1) goto L56
            goto L63
        L56:
            com.inmobi.media.yg r8 = r7.f25649d
            int r8 = r8.f25798a
            long r5 = (long) r8
            r0.f25481c = r3
            java.lang.Object r8 = nk.s0.a(r5, r0)
            if (r8 != r1) goto L3b
        L63:
            return r1
        L64:
            mj.r r7 = mj.r.f64562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3284wg.a(com.inmobi.media.wg, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public C3284wg(nk.l0 l0Var, C3334yg c3334yg, Nn nn2) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(c3334yg, "pollingVisibilityTrackerConfig");
        ck.p.j(nn2, "visibilityTrackedView");
        ck.p.j(nn2, "visibilityTrackedView");
        this.f25646a = nn2;
        this.f25647b = qk.v.a(Mn.HIDDEN);
        this.f25648c = l0Var;
        this.f25649d = c3334yg;
        this.f25651f = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.f25651f.get() || this.f25650e != null) {
            return;
        }
        this.f25650e = nk.j.d(this.f25648c, null, null, new C3209tg(this, null), 3, null);
    }
}
