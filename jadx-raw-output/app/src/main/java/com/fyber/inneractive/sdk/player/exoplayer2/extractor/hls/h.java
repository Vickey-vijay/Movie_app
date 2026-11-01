package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b {
    public static final AtomicInteger G = new AtomicInteger();
    public int A;
    public int B;
    public boolean C;
    public n D;
    public volatile boolean E;
    public volatile boolean F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f16550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f16551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f16552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f16553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f16554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f16555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f16556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f16557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f16558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f16559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f16560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f16561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n f16562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16563y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f16564z;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar, List list, int i10, Object obj, long j10, long j11, int i11, int i12, boolean z10, v vVar, h hVar2, byte[] bArr, byte[] bArr2) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h aVar2 = (bArr == null || bArr2 == null) ? hVar : new a(hVar, bArr, bArr2);
        super(i10, i11, j10, j11, aVar.f16624b, aVar2, kVar, obj);
        this.f16549k = i12;
        this.f16552n = kVar2;
        this.f16550l = aVar;
        this.f16560v = list;
        this.f16554p = z10;
        this.f16555q = vVar;
        this.f16553o = aVar2 instanceof a;
        String lastPathSegment = kVar.f17747a.getLastPathSegment();
        this.f16556r = lastPathSegment;
        boolean z11 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.f16561w = z11;
        if (hVar2 != null) {
            this.f16562x = hVar2.f16562x;
            this.f16563y = hVar2.f16563y;
            this.f16557s = hVar2.f16564z;
            boolean z12 = hVar2.f16550l != aVar;
            this.f16558t = z12;
            this.f16559u = hVar2.f16549k != i12 || z12;
        } else {
            this.f16562x = z11 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n() : null;
            this.f16563y = z11 ? new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10) : null;
            this.f16557s = null;
            this.f16558t = false;
            this.f16559u = true;
        }
        this.f16551m = hVar;
        this.f16548j = G.getAndIncrement();
    }

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA;
        bVar.f16454e = 0;
        if (!bVar.a(this.f16563y.f17845a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f16563y.c(10);
        if (this.f16563y.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f17490b) {
            return -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f16563y;
        nVar.e(nVar.f17846b + 3);
        int i10 = this.f16563y.i();
        int i11 = i10 + 10;
        if (i11 > this.f16563y.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f16563y;
            byte[] bArr = nVar2.f17845a;
            nVar2.c(i11);
            System.arraycopy(bArr, 0, this.f16563y.f17845a, 0, 10);
        }
        if (!bVar.a(this.f16563y.f17845a, 10, i10, true) || (bVarA = this.f16562x.a(i10, this.f16563y.f17845a)) == null) {
            return -9223372036854775807L;
        }
        int length = bVarA.f17463a.length;
        for (int i12 = 0; i12 < length; i12++) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = bVarA.f17463a[i12];
            if (oVar instanceof q) {
                q qVar = (q) oVar;
                if (io.bidmachine.media3.exoplayer.hls.a.PRIV_TIMESTAMP_FRAME_OWNER.equals(qVar.f17493b)) {
                    System.arraycopy(qVar.f17494c, 0, this.f16563y.f17845a, 0, 8);
                    this.f16563y.c(8);
                    return this.f16563y.g();
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.B;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #3 {, blocks: (B:114:0x01c0, B:116:0x01c6), top: B:153:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:125:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f3 A[Catch: all -> 0x023c, TryCatch #2 {all -> 0x023c, blocks: (B:126:0x01e1, B:128:0x01f3, B:130:0x01fb, B:132:0x0204, B:131:0x0202, B:134:0x020c, B:143:0x022a, B:141:0x021f, B:142:0x0229, B:136:0x0213, B:138:0x0217), top: B:152:0x01e1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01fb A[Catch: all -> 0x023c, TryCatch #2 {all -> 0x023c, blocks: (B:126:0x01e1, B:128:0x01f3, B:130:0x01fb, B:132:0x0204, B:131:0x0202, B:134:0x020c, B:143:0x022a, B:141:0x021f, B:142:0x0229, B:136:0x0213, B:138:0x0217), top: B:152:0x01e1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0202 A[Catch: all -> 0x023c, TryCatch #2 {all -> 0x023c, blocks: (B:126:0x01e1, B:128:0x01f3, B:130:0x01fb, B:132:0x0204, B:131:0x0202, B:134:0x020c, B:143:0x022a, B:141:0x021f, B:142:0x0229, B:136:0x0213, B:138:0x0217), top: B:152:0x01e1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x020c A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #2 {all -> 0x023c, blocks: (B:126:0x01e1, B:128:0x01f3, B:130:0x01fb, B:132:0x0204, B:131:0x0202, B:134:0x020c, B:143:0x022a, B:141:0x021f, B:142:0x0229, B:136:0x0213, B:138:0x0217), top: B:152:0x01e1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0217 A[Catch: all -> 0x021e, TRY_LEAVE, TryCatch #4 {all -> 0x021e, blocks: (B:136:0x0213, B:138:0x0217), top: B:155:0x0213, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x01c0 A[EXC_TOP_SPLITTER, LOOP:3: B:153:0x01c0->B:169:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x022a A[EDGE_INSN: B:171:0x022a->B:143:0x022a BREAK  A[LOOP:4: B:135:0x0211->B:173:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        boolean z10;
        v vVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar;
        long jA;
        long jB;
        v vVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i pVar;
        boolean z11;
        String strA;
        String strA2;
        int iA = 0;
        if (this.f16564z == null && !this.f16561w) {
            if ("text/vtt".equals(this.f16550l.f16624b.f17504f) || this.f16556r.endsWith(".webvtt") || this.f16556r.endsWith(".vtt")) {
                pVar = new p(this.f17544c.f17523y, this.f16555q);
            } else {
                if (this.f16559u) {
                    if (!this.f16556r.endsWith(".mp4")) {
                        String str = this.f16556r;
                        if (!str.startsWith(".m4", str.length() - 4)) {
                            int i10 = 16;
                            List listEmptyList = this.f16560v;
                            if (listEmptyList != null) {
                                i10 = 48;
                            } else {
                                listEmptyList = Collections.emptyList();
                            }
                            String str2 = this.f17544c.f17501c;
                            if (!TextUtils.isEmpty(str2)) {
                                if (str2 != null) {
                                    String[] strArrSplit = str2.split(StringUtils.COMMA);
                                    int length = strArrSplit.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length) {
                                            strA = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(strArrSplit[i11]);
                                            if (strA != null && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(strA))) {
                                                break;
                                            } else {
                                                i11++;
                                            }
                                        } else {
                                            strA = null;
                                            break;
                                        }
                                    }
                                } else {
                                    strA = null;
                                    break;
                                }
                                if (!"audio/mp4a-latm".equals(strA)) {
                                    i10 |= 2;
                                }
                                if (str2 != null) {
                                    String[] strArrSplit2 = str2.split(StringUtils.COMMA);
                                    int length2 = strArrSplit2.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < length2) {
                                            strA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(strArrSplit2[i12]);
                                            if (strA2 != null && "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(strA2))) {
                                                break;
                                            } else {
                                                i12++;
                                            }
                                        } else {
                                            strA2 = null;
                                            break;
                                        }
                                    }
                                } else {
                                    strA2 = null;
                                    break;
                                }
                                if (!"video/avc".equals(strA2)) {
                                    i10 |= 4;
                                }
                            }
                            b0 b0Var = new b0(2, this.f16555q, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e(i10, listEmptyList));
                            z11 = true;
                            pVar = b0Var;
                        }
                    }
                    pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m(this.f16555q);
                } else {
                    pVar = this.f16557s;
                    z11 = false;
                }
                if (z11) {
                    pVar.a(this.D);
                }
                this.f16564z = pVar;
            }
            z11 = true;
            if (z11) {
                pVar.a(this.D);
            }
            this.f16564z = pVar;
        }
        if (this.f16557s != this.f16564z && !this.C && (kVar2 = this.f16552n) != null) {
            int i13 = this.A;
            int i14 = z.f17873a;
            if (i13 != 0) {
                long j10 = kVar2.f17750d;
                long j11 = j10 == -1 ? -1L : j10 - ((long) i13);
                Uri uri = kVar2.f17747a;
                long j12 = kVar2.f17749c + ((long) i13);
                kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri, j12, j12, j11, kVar2.f17751e, kVar2.f17752f);
            }
            try {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f16551m;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, kVar2.f17748b, hVar.a(kVar2));
                int iA2 = 0;
                while (iA2 == 0) {
                    try {
                        if (this.E) {
                            break;
                        } else {
                            iA2 = this.f16564z.a(bVar2, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.o) null);
                        }
                    } catch (Throwable th2) {
                        this.A = (int) (bVar2.f16452c - this.f16552n.f17748b);
                        throw th2;
                    }
                }
                this.A = (int) (bVar2.f16452c - this.f16552n.f17748b);
                z.a(this.f17549h);
                this.C = true;
            } catch (Throwable th3) {
                z.a(this.f17549h);
                throw th3;
            }
        }
        if (this.E) {
            return;
        }
        try {
            if (this.f16553o) {
                kVar = this.f17542a;
                if (this.B != 0) {
                    z10 = true;
                }
                if (this.f16554p) {
                    vVar = this.f16555q;
                    if (vVar.f17869a == Long.MAX_VALUE) {
                        vVar.c(this.f17547f);
                    }
                } else {
                    vVar2 = this.f16555q;
                    synchronized (vVar2) {
                        while (vVar2.f17871c == -9223372036854775807L) {
                            vVar2.wait();
                        }
                    }
                }
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2 = this.f17549h;
                bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar2, kVar.f17748b, hVar2.a(kVar));
                if (this.f16564z == null) {
                    jA = a(bVar);
                    if (jA != -9223372036854775807L) {
                        jB = this.f16555q.b(jA);
                    } else {
                        jB = this.f17547f;
                    }
                    this.f16564z = a(jB);
                }
                if (z10) {
                    bVar.a(this.B);
                }
                while (iA == 0) {
                    try {
                        if (!this.E) {
                            break;
                        } else {
                            iA = this.f16564z.a(bVar, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.o) null);
                        }
                    } catch (Throwable th4) {
                        this.B = (int) (bVar.f16452c - this.f17542a.f17748b);
                        throw th4;
                    }
                }
                this.B = (int) (bVar.f16452c - this.f17542a.f17748b);
                z.a(this.f17549h);
                this.F = true;
                return;
            }
            kVar = this.f17542a;
            int i15 = this.B;
            int i16 = z.f17873a;
            if (i15 != 0) {
                long j13 = kVar.f17750d;
                long j14 = j13 != -1 ? j13 - ((long) i15) : -1L;
                Uri uri2 = kVar.f17747a;
                long j15 = kVar.f17749c + ((long) i15);
                kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri2, j15, j15, j14, kVar.f17751e, kVar.f17752f);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar3 = this.f17549h;
            bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar3, kVar.f17748b, hVar3.a(kVar));
            if (this.f16564z == null) {
                jA = a(bVar);
                if (jA != -9223372036854775807L) {
                    jB = this.f16555q.b(jA);
                } else {
                    jB = this.f17547f;
                }
                this.f16564z = a(jB);
            }
            if (z10) {
                bVar.a(this.B);
            }
            while (iA == 0) {
                if (!this.E) {
                    break;
                    break;
                }
                iA = this.f16564z.a(bVar, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.o) null);
            }
            this.B = (int) (bVar.f16452c - this.f17542a.f17748b);
            z.a(this.f17549h);
            this.F = true;
            return;
        } catch (Throwable th5) {
            z.a(this.f17549h);
            throw th5;
        }
        z10 = false;
        if (this.f16554p) {
            vVar2 = this.f16555q;
            synchronized (vVar2) {
                while (vVar2.f17871c == -9223372036854775807L) {
                    vVar2.wait();
                }
            }
        } else {
            vVar = this.f16555q;
            if (vVar.f17869a == Long.MAX_VALUE) {
                vVar.c(this.f17547f);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.E;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i aVar;
        if (this.f16556r.endsWith(".aac")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(j10);
        } else if (!this.f16556r.endsWith(".ac3") && !this.f16556r.endsWith(".ec3")) {
            if (this.f16556r.endsWith(".mp3")) {
                aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c(j10);
            } else {
                throw new IllegalArgumentException("Unkown extension for audio file: " + this.f16556r);
            }
        } else {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(j10);
        }
        aVar.a(this.D);
        return aVar;
    }
}
