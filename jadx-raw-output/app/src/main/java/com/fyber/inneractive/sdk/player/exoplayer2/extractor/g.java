package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f16504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f16506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingDeque f16507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f16508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f16510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f16512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a f16514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f16517n;

    public final void a(boolean z10) {
        int andSet = this.f16510g.getAndSet(z10 ? 0 : 2);
        a();
        e eVar = this.f16506c;
        eVar.f16473m = Long.MIN_VALUE;
        eVar.f16474n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f16512i = null;
        }
    }

    public final void b() {
        if (this.f16510g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.f16510g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public final long d() {
        long jMax;
        e eVar = this.f16506c;
        synchronized (eVar) {
            jMax = Math.max(eVar.f16473m, eVar.f16474n);
        }
        return jMax;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.o e() {
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        e eVar = this.f16506c;
        synchronized (eVar) {
            oVar = eVar.f16476p ? null : eVar.f16477q;
        }
        return oVar;
    }

    public final void f() {
        long j10;
        e eVar = this.f16506c;
        synchronized (eVar) {
            int i10 = eVar.f16469i;
            if (i10 == 0) {
                j10 = -1;
            } else {
                int i11 = eVar.f16471k + i10;
                int i12 = eVar.f16461a;
                int i13 = (i11 - 1) % i12;
                eVar.f16471k = i11 % i12;
                eVar.f16470j += i10;
                eVar.f16469i = 0;
                j10 = eVar.f16463c[i13] + ((long) eVar.f16464d[i13]);
            }
        }
        if (j10 != -1) {
            a(j10);
        }
    }

    public g(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f16504a = bVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).getClass();
        this.f16505b = 65536;
        this.f16506c = new e();
        this.f16507d = new LinkedBlockingDeque();
        this.f16508e = new d();
        this.f16509f = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);
        this.f16510g = new AtomicInteger();
        this.f16515l = 65536;
    }

    public final boolean a(boolean z10, long j10) {
        long j11;
        e eVar = this.f16506c;
        synchronized (eVar) {
            if (eVar.f16469i != 0) {
                long[] jArr = eVar.f16466f;
                int i10 = eVar.f16471k;
                if (j10 < jArr[i10]) {
                    j11 = -1;
                } else {
                    if (j10 <= eVar.f16474n || z10) {
                        int i11 = -1;
                        int i12 = 0;
                        while (i10 != eVar.f16472l && eVar.f16466f[i10] <= j10) {
                            if ((eVar.f16465e[i10] & 1) != 0) {
                                i11 = i12;
                            }
                            i10 = (i10 + 1) % eVar.f16461a;
                            i12++;
                        }
                        if (i11 != -1) {
                            int i13 = (eVar.f16471k + i11) % eVar.f16461a;
                            eVar.f16471k = i13;
                            eVar.f16470j += i11;
                            eVar.f16469i -= i11;
                            j11 = eVar.f16463c[i13];
                        }
                    }
                    j11 = -1;
                }
            } else {
                j11 = -1;
            }
        }
        if (j11 == -1) {
            return false;
        }
        a(j11);
        return true;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10, boolean z11, long j10) {
        int iO;
        long j11;
        byte b10;
        e eVar = this.f16506c;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f16512i;
        d dVar = this.f16508e;
        synchronized (eVar) {
            iO = 1;
            if (eVar.f16469i != 0) {
                if (!z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = eVar.f16468h;
                    int i10 = eVar.f16471k;
                    if (oVarArr[i10] == oVar) {
                        if (cVar.f16432c == null && cVar.f16434e == 0) {
                            b10 = -3;
                        } else {
                            long j12 = eVar.f16466f[i10];
                            cVar.f16433d = j12;
                            cVar.f16430a = eVar.f16465e[i10];
                            dVar.f16457a = eVar.f16464d[i10];
                            dVar.f16458b = eVar.f16463c[i10];
                            dVar.f16460d = eVar.f16467g[i10];
                            eVar.f16473m = Math.max(eVar.f16473m, j12);
                            int i11 = eVar.f16469i - 1;
                            eVar.f16469i = i11;
                            int i12 = eVar.f16471k + 1;
                            eVar.f16471k = i12;
                            eVar.f16470j++;
                            if (i12 == eVar.f16461a) {
                                eVar.f16471k = 0;
                            }
                            if (i11 > 0) {
                                j11 = eVar.f16463c[eVar.f16471k];
                            } else {
                                j11 = dVar.f16458b + ((long) dVar.f16457a);
                            }
                            dVar.f16459c = j11;
                            b10 = -4;
                        }
                    }
                }
                pVar.f17525a = eVar.f16468h[eVar.f16471k];
                b10 = -5;
            } else if (z11) {
                cVar.f16430a = 4;
                b10 = -4;
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f16477q;
                if (oVar2 == null || (!z10 && oVar2 == oVar)) {
                    b10 = -3;
                } else {
                    pVar.f17525a = oVar2;
                    b10 = -5;
                }
            }
        }
        if (b10 == -5) {
            this.f16512i = pVar.f17525a;
            return -5;
        }
        if (b10 != -4) {
            if (b10 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (cVar.b(4)) {
            return -4;
        }
        if (cVar.f16433d < j10) {
            cVar.f16430a = Integer.MIN_VALUE | cVar.f16430a;
        }
        if (cVar.b(1073741824)) {
            d dVar2 = this.f16508e;
            long j13 = dVar2.f16458b;
            this.f16509f.c(1);
            a(j13, this.f16509f.f17845a, 1);
            long j14 = j13 + 1;
            byte b11 = this.f16509f.f17845a[0];
            boolean z12 = (b11 & 128) != 0;
            int i13 = b11 & 127;
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar = cVar.f16431b;
            if (bVar.f16425a == null) {
                bVar.f16425a = new byte[16];
            }
            a(j14, bVar.f16425a, i13);
            long j15 = j14 + ((long) i13);
            if (z12) {
                this.f16509f.c(2);
                a(j15, this.f16509f.f17845a, 2);
                j15 += 2;
                iO = this.f16509f.o();
            }
            int i14 = iO;
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar2 = cVar.f16431b;
            int[] iArr = bVar2.f16426b;
            if (iArr == null || iArr.length < i14) {
                iArr = new int[i14];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = bVar2.f16427c;
            if (iArr3 == null || iArr3.length < i14) {
                iArr3 = new int[i14];
            }
            int[] iArr4 = iArr3;
            if (z12) {
                int i15 = i14 * 6;
                this.f16509f.c(i15);
                a(j15, this.f16509f.f17845a, i15);
                j15 += (long) i15;
                this.f16509f.e(0);
                for (int i16 = 0; i16 < i14; i16++) {
                    iArr2[i16] = this.f16509f.o();
                    iArr4[i16] = this.f16509f.m();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = dVar2.f16457a - ((int) (j15 - dVar2.f16458b));
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar3 = cVar.f16431b;
            bVar3.a(i14, iArr2, iArr4, dVar2.f16460d, bVar3.f16425a);
            long j16 = dVar2.f16458b;
            int i17 = (int) (j15 - j16);
            dVar2.f16458b = j16 + ((long) i17);
            dVar2.f16457a -= i17;
        }
        int i18 = this.f16508e.f16457a;
        ByteBuffer byteBuffer = cVar.f16432c;
        if (byteBuffer == null) {
            cVar.f16432c = cVar.a(i18);
        } else {
            int iCapacity = byteBuffer.capacity();
            int iPosition = cVar.f16432c.position();
            int i19 = i18 + iPosition;
            if (iCapacity < i19) {
                ByteBuffer byteBufferA = cVar.a(i19);
                if (iPosition > 0) {
                    cVar.f16432c.position(0);
                    cVar.f16432c.limit(iPosition);
                    byteBufferA.put(cVar.f16432c);
                }
                cVar.f16432c = byteBufferA;
            }
        }
        d dVar3 = this.f16508e;
        long j17 = dVar3.f16458b;
        ByteBuffer byteBuffer2 = cVar.f16432c;
        int i20 = dVar3.f16457a;
        while (i20 > 0) {
            a(j17);
            int i21 = (int) (j17 - this.f16511h);
            int iMin = Math.min(i20, this.f16505b - i21);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f16507d.peek();
            byteBuffer2.put(aVar.f17652a, aVar.f17653b + i21, iMin);
            j17 += (long) iMin;
            i20 -= iMin;
        }
        a(this.f16508e.f16459c);
        return -4;
    }

    public final void a(long j10, byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            a(j10);
            int i12 = (int) (j10 - this.f16511h);
            int iMin = Math.min(i10 - i11, this.f16505b - i12);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f16507d.peek();
            System.arraycopy(aVar.f17652a, aVar.f17653b + i12, bArr, i11, iMin);
            j10 += (long) iMin;
            i11 += iMin;
        }
    }

    public final void a(long j10) {
        int i10 = ((int) (j10 - this.f16511h)) / this.f16505b;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f16504a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f16507d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar;
            synchronized (lVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f17753a;
                aVarArr[0] = aVar;
                lVar.a(aVarArr);
            }
            this.f16511h += (long) this.f16505b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        if (oVar == null) {
            oVar = null;
        }
        e eVar = this.f16506c;
        synchronized (eVar) {
            z10 = true;
            try {
                if (oVar == null) {
                    eVar.f16476p = true;
                } else {
                    eVar.f16476p = false;
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f16477q;
                    int i10 = z.f17873a;
                    if (!oVar.equals(oVar2)) {
                        eVar.f16477q = oVar;
                    }
                }
                z10 = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f fVar = this.f16517n;
        if (fVar == null || !z10) {
            return;
        }
        fVar.e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i10, boolean z10) throws InterruptedException, EOFException {
        int iA = 0;
        if (!this.f16510g.compareAndSet(0, 1)) {
            int iMin = Math.min(bVar.f16455f, i10);
            bVar.b(iMin);
            if (iMin == 0) {
                iMin = bVar.a(b.f16449g, 0, Math.min(i10, 4096), 0, true);
            }
            if (iMin != -1) {
                bVar.f16452c += (long) iMin;
            }
            if (iMin != -1) {
                return iMin;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int iA2 = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f16514k;
            byte[] bArr = aVar.f17652a;
            int i11 = aVar.f17653b + this.f16515l;
            int i12 = bVar.f16455f;
            if (i12 != 0) {
                int iMin2 = Math.min(i12, iA2);
                System.arraycopy(bVar.f16453d, 0, bArr, i11, iMin2);
                bVar.b(iMin2);
                iA = iMin2;
            }
            if (iA == 0) {
                iA = bVar.a(bArr, i11, iA2, 0, true);
            }
            if (iA != -1) {
                bVar.f16452c += (long) iA;
            }
            if (iA == -1) {
                if (z10) {
                    c();
                    return -1;
                }
                throw new EOFException();
            }
            this.f16515l += iA;
            this.f16513j += (long) iA;
            c();
            return iA;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (!this.f16510g.compareAndSet(0, 1)) {
            nVar.e(nVar.f17846b + i10);
            return;
        }
        while (i10 > 0) {
            int iA = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f16514k;
            nVar.a(aVar.f17652a, aVar.f17653b + this.f16515l, iA);
            this.f16515l += iA;
            this.f16513j += (long) iA;
            i10 -= iA;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j10, int i10, int i11, int i12, byte[] bArr) {
        if (!this.f16510g.compareAndSet(0, 1)) {
            e eVar = this.f16506c;
            synchronized (eVar) {
                eVar.f16474n = Math.max(eVar.f16474n, j10);
            }
            return;
        }
        try {
            if (this.f16516m) {
                if ((i10 & 1) != 0 && this.f16506c.a(j10)) {
                    this.f16516m = false;
                }
                return;
            }
            this.f16506c.a(j10, i10, (this.f16513j - ((long) i11)) - ((long) i12), i11, bArr);
        } finally {
            c();
        }
    }

    public final void a() {
        e eVar = this.f16506c;
        eVar.f16470j = 0;
        eVar.f16471k = 0;
        eVar.f16472l = 0;
        eVar.f16469i = 0;
        eVar.f16475o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f16504a;
        LinkedBlockingDeque linkedBlockingDeque = this.f16507d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.f16507d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f16504a).a();
        this.f16511h = 0L;
        this.f16513j = 0L;
        this.f16514k = null;
        this.f16515l = this.f16505b;
    }

    public final int a(int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.f16515l == this.f16505b) {
            this.f16515l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f16504a;
            synchronized (lVar) {
                lVar.f17755c++;
                int i11 = lVar.f17756d;
                if (i11 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f17757e;
                    int i12 = i11 - 1;
                    lVar.f17756d = i12;
                    aVar = aVarArr[i12];
                    aVarArr[i12] = null;
                } else {
                    aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(0, new byte[65536]);
                }
            }
            this.f16514k = aVar;
            this.f16507d.add(aVar);
        }
        return Math.min(i10, this.f16505b - this.f16515l);
    }
}
