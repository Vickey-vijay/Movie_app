package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17023a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f17026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17034l;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, IOException {
        g gVar;
        long jMin;
        int i10;
        int i11 = this.f17027e;
        long j10 = 0;
        if (i11 == 0) {
            long j11 = bVar.f16452c;
            this.f17029g = j11;
            this.f17027e = 1;
            long j12 = this.f17025c - 65307;
            if (j12 > j11) {
                return j12;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j13 = this.f17030h;
            if (j13 == 0) {
                i10 = 3;
            } else {
                long j14 = this.f17031i;
                long j15 = this.f17032j;
                if (j14 == j15) {
                    jMin = -(this.f17033k + 2);
                } else {
                    long j16 = bVar.f16452c;
                    if (a(bVar, j15)) {
                        this.f17023a.a(bVar, false);
                        bVar.f16454e = 0;
                        g gVar2 = this.f17023a;
                        long j17 = gVar2.f17050b;
                        long j18 = j13 - j17;
                        int i12 = gVar2.f17052d + gVar2.f17053e;
                        if (j18 < 0 || j18 > 72000) {
                            if (j18 < 0) {
                                this.f17032j = j16;
                                this.f17034l = j17;
                            } else {
                                long j19 = i12;
                                long j20 = bVar.f16452c + j19;
                                this.f17031i = j20;
                                this.f17033k = j17;
                                if ((this.f17032j - j20) + j19 < 100000) {
                                    bVar.a(i12);
                                    jMin = -(this.f17033k + 2);
                                }
                                j10 = 0;
                            }
                            long j21 = this.f17032j;
                            long j22 = this.f17031i;
                            long j23 = j21 - j22;
                            if (j23 < 100000) {
                                this.f17032j = j22;
                                jMin = j22;
                            } else {
                                jMin = Math.min(Math.max(((j23 * j18) / (this.f17034l - this.f17033k)) + (bVar.f16452c - ((long) (i12 * (j18 <= 0 ? 2 : 1)))), j22), this.f17032j - 1);
                            }
                            j10 = 0;
                        } else {
                            bVar.a(i12);
                            jMin = -(this.f17023a.f17050b + 2);
                        }
                    } else {
                        jMin = this.f17031i;
                        if (jMin == j16) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                if (jMin >= j10) {
                    return jMin;
                }
                long j24 = this.f17030h;
                long j25 = -(jMin + 2);
                this.f17023a.a(bVar, false);
                while (true) {
                    g gVar3 = this.f17023a;
                    if (gVar3.f17050b >= j24) {
                        break;
                    }
                    bVar.a(gVar3.f17052d + gVar3.f17053e);
                    g gVar4 = this.f17023a;
                    long j26 = gVar4.f17050b;
                    gVar4.a(bVar, false);
                    j25 = j26;
                }
                bVar.f16454e = 0;
                j10 = j25;
                i10 = 3;
            }
            this.f17027e = i10;
            return -(j10 + 2);
        }
        if (!a(bVar, this.f17025c)) {
            throw new EOFException();
        }
        g gVar5 = this.f17023a;
        gVar5.f17049a = 0;
        gVar5.f17050b = 0L;
        gVar5.f17051c = 0;
        gVar5.f17052d = 0;
        gVar5.f17053e = 0;
        while (true) {
            gVar = this.f17023a;
            if ((gVar.f17049a & 4) == 4 || bVar.f16452c >= this.f17025c) {
                break;
            }
            gVar.a(bVar, false);
            g gVar6 = this.f17023a;
            bVar.a(gVar6.f17052d + gVar6.f17053e);
        }
        this.f17028f = gVar.f17050b;
        this.f17027e = 3;
        return this.f17029g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        if (this.f17028f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        int i10 = this.f17027e;
        if (i10 != 3 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        long j11 = j10 == 0 ? 0L : (((long) this.f17026d.f17069i) * j10) / 1000000;
        this.f17030h = j11;
        this.f17027e = 2;
        this.f17031i = this.f17024b;
        this.f17032j = this.f17025c;
        this.f17033k = 0L;
        this.f17034l = this.f17028f;
        return j11;
    }

    public b(long j10, long j11, l lVar, int i10, long j12) {
        if (j10 >= 0 && j11 > j10) {
            this.f17026d = lVar;
            this.f17024b = j10;
            this.f17025c = j11;
            if (i10 == j11 - j10) {
                this.f17028f = j12;
                this.f17027e = 3;
                return;
            } else {
                this.f17027e = 0;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, long j10) throws InterruptedException, EOFException {
        int i10;
        long jMin = Math.min(j10 + 3, this.f17025c);
        int i11 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j11 = bVar.f16452c;
            int i12 = 0;
            if (((long) i11) + j11 > jMin && (i11 = (int) (jMin - j11)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i11, false);
            while (true) {
                i10 = i11 - 3;
                if (i12 < i10) {
                    if (bArr[i12] == 79 && bArr[i12 + 1] == 103 && bArr[i12 + 2] == 103 && bArr[i12 + 3] == 83) {
                        bVar.a(i12);
                        return true;
                    }
                    i12++;
                }
            }
            bVar.a(i10);
        }
    }
}
