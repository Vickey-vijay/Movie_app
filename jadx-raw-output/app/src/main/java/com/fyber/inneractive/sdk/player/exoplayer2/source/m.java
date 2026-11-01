package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f17569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f17570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f17571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.o f17572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f17573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f17577j;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f17573f = true;
    }

    public m(p pVar, Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar) {
        this.f17577j = pVar;
        uri.getClass();
        this.f17568a = uri;
        hVar.getClass();
        this.f17569b = hVar;
        nVar.getClass();
        this.f17570c = nVar;
        this.f17571d = eVar;
        this.f17572e = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.o();
        this.f17574g = true;
        this.f17576i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f17573f;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0092 */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void load() throws java.lang.Throwable {
        /*
            r22 = this;
            r1 = r22
            r0 = 0
            r2 = r0
        L4:
            if (r2 != 0) goto Lba
            boolean r3 = r1.f17573f
            if (r3 != 0) goto Lba
            r4 = 1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r5 = r1.f17572e     // Catch: java.lang.Throwable -> La8
            long r14 = r5.f17021a     // Catch: java.lang.Throwable -> La8
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r5 = r1.f17569b     // Catch: java.lang.Throwable -> La8
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r12 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k     // Catch: java.lang.Throwable -> La8
            android.net.Uri r7 = r1.f17568a     // Catch: java.lang.Throwable -> La8
            r16 = -1
            com.fyber.inneractive.sdk.player.exoplayer2.source.p r6 = r1.f17577j     // Catch: java.lang.Throwable -> La8
            java.lang.String r13 = r6.f17590h     // Catch: java.lang.Throwable -> La8
            r18 = 0
            r6 = r12
            r8 = r14
            r10 = r14
            r3 = r12
            r19 = r13
            r12 = r16
            r20 = r14
            r14 = r19
            r15 = r18
            r6.<init>(r7, r8, r10, r12, r14, r15)     // Catch: java.lang.Throwable -> La8
            long r5 = r5.a(r3)     // Catch: java.lang.Throwable -> La8
            r1.f17576i = r5     // Catch: java.lang.Throwable -> La8
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r12 = r20
            if (r3 == 0) goto L3f
            long r5 = r5 + r12
            r1.f17576i = r5     // Catch: java.lang.Throwable -> La8
        L3f:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b     // Catch: java.lang.Throwable -> La8
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r5 = r1.f17569b     // Catch: java.lang.Throwable -> La8
            long r10 = r1.f17576i     // Catch: java.lang.Throwable -> La8
            r6 = r3
            r7 = r5
            r8 = r12
            r6.<init>(r7, r8, r10)     // Catch: java.lang.Throwable -> La8
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r6 = r1.f17570c     // Catch: java.lang.Throwable -> L92
            r5.a()     // Catch: java.lang.Throwable -> L92
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.i r5 = r6.a(r3)     // Catch: java.lang.Throwable -> L92
            boolean r6 = r1.f17574g     // Catch: java.lang.Throwable -> L92
            if (r6 == 0) goto L5f
            long r6 = r1.f17575h     // Catch: java.lang.Throwable -> L92
            r5.a(r12, r6)     // Catch: java.lang.Throwable -> L92
            r1.f17574g = r0     // Catch: java.lang.Throwable -> L92
        L5f:
            r14 = r12
        L60:
            if (r2 != 0) goto L97
            boolean r6 = r1.f17573f     // Catch: java.lang.Throwable -> L92
            if (r6 != 0) goto L97
            com.fyber.inneractive.sdk.player.exoplayer2.util.e r6 = r1.f17571d     // Catch: java.lang.Throwable -> L92
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L92
        L69:
            boolean r7 = r6.f17818a     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L71
            r6.wait()     // Catch: java.lang.Throwable -> L94
            goto L69
        L71:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L92
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r6 = r1.f17572e     // Catch: java.lang.Throwable -> L92
            int r2 = r5.a(r3, r6)     // Catch: java.lang.Throwable -> L92
            long r6 = r3.f16452c     // Catch: java.lang.Throwable -> L92
            r8 = 1048576(0x100000, double:5.180654E-318)
            long r8 = r8 + r14
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L60
            com.fyber.inneractive.sdk.player.exoplayer2.util.e r8 = r1.f17571d     // Catch: java.lang.Throwable -> L92
            r8.a()     // Catch: java.lang.Throwable -> L92
            com.fyber.inneractive.sdk.player.exoplayer2.source.p r8 = r1.f17577j     // Catch: java.lang.Throwable -> L92
            android.os.Handler r9 = r8.f17596n     // Catch: java.lang.Throwable -> L92
            com.fyber.inneractive.sdk.player.exoplayer2.source.j r8 = r8.f17595m     // Catch: java.lang.Throwable -> L92
            r9.post(r8)     // Catch: java.lang.Throwable -> L92
            r14 = r6
            goto L60
        L92:
            r0 = move-exception
            goto Laa
        L94:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L92
            throw r0     // Catch: java.lang.Throwable -> L92
        L97:
            if (r2 != r4) goto L9b
            r2 = r0
            goto La1
        L9b:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r4 = r1.f17572e
            long r5 = r3.f16452c
            r4.f17021a = r5
        La1:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r3 = r1.f17569b
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(r3)
            goto L4
        La8:
            r0 = move-exception
            r3 = 0
        Laa:
            if (r2 == r4) goto Lb4
            if (r3 == 0) goto Lb4
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r2 = r1.f17572e
            long r3 = r3.f16452c
            r2.f17021a = r3
        Lb4:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r2 = r1.f17569b
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(r2)
            throw r0
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.source.m.load():void");
    }
}
