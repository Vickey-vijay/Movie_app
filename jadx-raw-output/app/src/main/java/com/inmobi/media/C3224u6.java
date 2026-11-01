package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3224u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExoPlayer f25432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk.l0 f25433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qk.k f25434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.g f25436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f25437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f25439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f25440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rl[] f25441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f25442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f25443l;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        if (r9.a(r2, r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3224u6 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.inmobi.media.C3149r6
            if (r0 == 0) goto L16
            r0 = r10
            com.inmobi.media.r6 r0 = (com.inmobi.media.C3149r6) r0
            int r1 = r0.f25239d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f25239d = r1
            goto L1b
        L16:
            com.inmobi.media.r6 r0 = new com.inmobi.media.r6
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f25237b
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f25239d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.c.b(r10)
            goto Lab
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            int r2 = r0.f25236a
            kotlin.c.b(r10)
            goto La2
        L3e:
            kotlin.c.b(r10)
            androidx.media3.exoplayer.ExoPlayer r10 = r9.f25432a
            boolean r10 = r10.isPlaying()
            if (r10 != 0) goto L4c
            mj.r r9 = mj.r.f64562a
            return r9
        L4c:
            androidx.media3.exoplayer.ExoPlayer r10 = r9.f25432a
            long r5 = r10.getDuration()
            int r10 = (int) r5
            if (r10 > 0) goto L58
            mj.r r9 = mj.r.f64562a
            return r9
        L58:
            androidx.media3.exoplayer.ExoPlayer r2 = r9.f25432a
            long r5 = r2.getCurrentPosition()
            int r2 = (int) r5
            int r2 = r2 * 100
            int r2 = r2 / r10
            int r5 = r9.f25438g
            r6 = 0
            if (r5 != r3) goto L7d
            int[] r5 = r9.f25440i
            r5 = r5[r6]
            if (r2 >= r5) goto L7d
            r5 = -1
            r9.f25438g = r5
            r5 = 4
            boolean[] r7 = new boolean[r5]
            r8 = r6
        L74:
            if (r8 >= r5) goto L7b
            r7[r8] = r6
            int r8 = r8 + 1
            goto L74
        L7b:
            r9.f25439h = r7
        L7d:
            r0.f25236a = r2
            r0.f25239d = r4
            int r4 = r9.f25438g
            if (r4 < 0) goto L88
            mj.r r10 = mj.r.f64562a
            goto L9f
        L88:
            r9.f25438g = r6
            qk.k r4 = r9.f25434c
            com.inmobi.media.kn r5 = new com.inmobi.media.kn
            float r10 = (float) r10
            r5.<init>(r10)
            java.lang.Object r10 = r4.emit(r5, r0)
            java.lang.Object r4 = sj.a.f()
            if (r10 != r4) goto L9d
            goto L9f
        L9d:
            mj.r r10 = mj.r.f64562a
        L9f:
            if (r10 != r1) goto La2
            goto Laa
        La2:
            r0.f25239d = r3
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            mj.r r9 = mj.r.f64562a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3224u6.a(com.inmobi.media.u6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public C3224u6(ExoPlayer exoPlayer, AdConfig.HybridNativeConfig hybridNativeConfig, nk.l0 l0Var, long j10, qk.k kVar, TrackPercentage trackPercentage) {
        ck.p.j(exoPlayer, "player");
        ck.p.j(hybridNativeConfig, "hybridNativeConfig");
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(kVar, "progressEvents");
        ck.p.j(trackPercentage, "trackPercentage");
        this.f25432a = exoPlayer;
        this.f25433b = l0Var;
        this.f25434c = kVar;
        this.f25435d = new AtomicBoolean(false);
        this.f25438g = -1;
        boolean[] zArr = new boolean[4];
        for (int i10 = 0; i10 < 4; i10++) {
            zArr[i10] = false;
        }
        this.f25439h = zArr;
        this.f25440i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.f25441j = new Rl[]{C3315xm.f25742a, C2942in.f24569a, C3166rn.f25283a, C3340ym.f25814a};
        this.f25442k = 200L;
        this.f25443l = ik.k.e(j10, hybridNativeConfig.getMinProgressInterval());
    }

    public final void a() {
        if (this.f25435d.getAndSet(false)) {
            H6.a(this.f25436e);
            H6.a(this.f25437f);
            this.f25436e = null;
            this.f25437f = null;
        }
    }

    public static final Object a(C3224u6 c3224u6, C3199t6 c3199t6) {
        Object objEmit;
        if (!c3224u6.f25432a.isPlaying()) {
            return mj.r.f64562a;
        }
        long duration = c3224u6.f25432a.getDuration();
        if (duration <= 0) {
            return mj.r.f64562a;
        }
        return (c3224u6.f25438g != 2 && (objEmit = c3224u6.f25434c.emit(new C3002l8(c3224u6.f25432a.getCurrentPosition(), duration), c3199t6)) == sj.a.f()) ? objEmit : mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:23:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:23:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:23:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0047
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.inmobi.media.C3100p6
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.p6 r0 = (com.inmobi.media.C3100p6) r0
            int r1 = r0.f25043f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25043f = r1
            goto L18
        L13:
            com.inmobi.media.p6 r0 = new com.inmobi.media.p6
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f25041d
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f25043f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r9 = r0.f25040c
            int r2 = r0.f25039b
            int r4 = r0.f25038a
            kotlin.c.b(r10)
            r10 = r4
            r4 = r8
            goto L6a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.c.b(r10)
            r10 = 0
            int[] r2 = r8.f25440i
            int r2 = r2.length
            r4 = r8
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
        L45:
            if (r2 >= r9) goto L6c
            int[] r5 = r4.f25440i
            r5 = r5[r2]
            if (r10 < r5) goto L6a
            boolean[] r5 = r4.f25439h
            boolean r6 = r5[r2]
            if (r6 != 0) goto L6a
            r5[r2] = r3
            qk.k r5 = r4.f25434c
            com.inmobi.media.Rl[] r6 = r4.f25441j
            r6 = r6[r2]
            r0.f25038a = r10
            r0.f25039b = r2
            r0.f25040c = r9
            r0.f25043f = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            int r2 = r2 + r3
            goto L45
        L6c:
            mj.r r9 = mj.r.f64562a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3224u6.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
