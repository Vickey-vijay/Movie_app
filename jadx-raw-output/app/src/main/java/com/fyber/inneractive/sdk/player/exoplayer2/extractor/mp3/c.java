package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f16779m = z.a("Xing");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f16780n = z.a("Info");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f16781o = z.a("VBRI");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16782a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f16786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f16787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f16789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f16790i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16793l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f16783b = new n(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f16784c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f16785d = new m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16791j = -9223372036854775807L;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return a(bVar, true);
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        int i10;
        int i11;
        int iA;
        int i12 = z10 ? 16384 : 131072;
        bVar.f16454e = 0;
        if (bVar.f16452c == 0) {
            int i13 = 0;
            while (true) {
                bVar.a(this.f16783b.f17845a, 0, 10, false);
                this.f16783b.e(0);
                if (this.f16783b.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f17490b) {
                    break;
                }
                n nVar = this.f16783b;
                nVar.e(nVar.f17846b + 3);
                int i14 = this.f16783b.i();
                int i15 = i14 + 10;
                if (this.f16789h == null) {
                    byte[] bArr = new byte[i15];
                    System.arraycopy(this.f16783b.f17845a, 0, bArr, 0, 10);
                    bVar.a(bArr, 10, i14, false);
                    com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n(null).a(i15, bArr);
                    this.f16789h = bVarA;
                    if (bVarA != null) {
                        this.f16785d.a(bVarA);
                    }
                } else {
                    bVar.a(i14, false);
                }
                i13 += i15;
            }
            bVar.f16454e = 0;
            bVar.a(i13, false);
            i10 = (int) (bVar.f16452c + ((long) bVar.f16454e));
            if (!z10) {
                bVar.a(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i16 = i11;
        int i17 = i16;
        while (true) {
            if (!bVar.a(this.f16783b.f17845a, 0, 4, i11 > 0)) {
                break;
            }
            this.f16783b.e(0);
            int iB = this.f16783b.b();
            if ((i16 == 0 || ((-128000) & iB) == (((long) i16) & (-128000))) && (iA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB, this.f16784c);
                    i16 = iB;
                }
                bVar.a(iA - 4, false);
            } else {
                int i18 = i17 + 1;
                if (i17 == i12) {
                    if (z10) {
                        return false;
                    }
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Searched too many bytes.");
                }
                if (z10) {
                    bVar.f16454e = 0;
                    bVar.a(i10 + i18, false);
                } else {
                    bVar.a(1);
                }
                i16 = 0;
                i17 = i18;
                i11 = 0;
            }
        }
        if (z10) {
            bVar.a(i10 + i17);
        } else {
            bVar.f16454e = 0;
        }
        this.f16788g = i16;
        return true;
    }

    public final a b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        bVar.a(this.f16783b.f17845a, 0, 4, false);
        this.f16783b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f16783b.b(), this.f16784c);
        return new a(this.f16784c.f17019f, bVar.f16452c, bVar.f16451b);
    }

    public c(long j10) {
        this.f16782a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f16786e = jVar;
        this.f16787f = jVar.a(0, 1);
        this.f16786e.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f16788g = 0;
        this.f16791j = -9223372036854775807L;
        this.f16792k = 0L;
        this.f16793l = 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        int i10;
        int i11;
        int iB;
        int iB2;
        int i12;
        b bVarB;
        int iM;
        d dVar;
        int iJ;
        long j10;
        long jMin;
        if (this.f16788g == 0) {
            try {
                a(bVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f16790i == null) {
            n nVar = new n(this.f16784c.f17016c);
            bVar.a(nVar.f17845a, 0, this.f16784c.f17016c, false);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.f16784c;
            if ((nVar2.f17014a & 1) != 0) {
                if (nVar2.f17018e != 1) {
                    i11 = 36;
                } else {
                    i11 = 21;
                }
            } else if (nVar2.f17018e != 1) {
                i11 = 21;
            } else {
                i11 = 13;
            }
            if (nVar.f17847c >= i11 + 4) {
                nVar.e(i11);
                iB = nVar.b();
                if (iB != f16779m && iB != f16780n) {
                    if (nVar.f17847c >= 40) {
                        nVar.e(36);
                        iB2 = nVar.b();
                        i12 = f16781o;
                        if (iB2 == i12) {
                            iB = i12;
                        } else {
                            iB = 0;
                        }
                    } else {
                        iB = 0;
                    }
                }
            } else if (nVar.f17847c >= 40) {
                nVar.e(36);
                iB2 = nVar.b();
                i12 = f16781o;
                if (iB2 == i12) {
                    iB = i12;
                } else {
                    iB = 0;
                }
            } else {
                iB = 0;
            }
            if (iB != f16779m && iB != f16780n) {
                if (iB == f16781o) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar3 = this.f16784c;
                    long j11 = bVar.f16452c;
                    long j12 = bVar.f16451b;
                    nVar.e(nVar.f17846b + 10);
                    int iB3 = nVar.b();
                    if (iB3 <= 0) {
                        dVar = null;
                        break;
                    }
                    int i13 = nVar3.f17017d;
                    long jA = z.a(iB3, ((long) (i13 >= 32000 ? 1152 : 576)) * 1000000, i13);
                    int iO = nVar.o();
                    int iO2 = nVar.o();
                    int iO3 = nVar.o();
                    int i14 = 2;
                    nVar.e(nVar.f17846b + 2);
                    long j13 = j11 + ((long) nVar3.f17016c);
                    int i15 = iO + 1;
                    long[] jArr = new long[i15];
                    long[] jArr2 = new long[i15];
                    jArr[0] = 0;
                    jArr2[0] = j13;
                    long j14 = j13;
                    int i16 = 1;
                    while (true) {
                        if (i16 < i15) {
                            if (iO3 == 1) {
                                iJ = nVar.j();
                            } else if (iO3 == i14) {
                                iJ = nVar.o();
                            } else if (iO3 != 3) {
                                if (iO3 != 4) {
                                    dVar = null;
                                    break;
                                }
                                iJ = nVar.m();
                            } else {
                                iJ = nVar.l();
                            }
                            long j15 = j12;
                            long j16 = j14 + ((long) (iJ * iO2));
                            int i17 = i15;
                            int i18 = iO2;
                            int i19 = iO3;
                            jArr[i16] = (((long) i16) * jA) / ((long) iO);
                            if (j15 == -1) {
                                jMin = j16;
                                j10 = j15;
                            } else {
                                j10 = j15;
                                jMin = Math.min(j10, j16);
                            }
                            jArr2[i16] = jMin;
                            i16++;
                            iO2 = i18;
                            iO3 = i19;
                            long j17 = j10;
                            i15 = i17;
                            j14 = j16;
                            i14 = 2;
                            j12 = j17;
                        } else {
                            dVar = new d(jArr, jArr2, jA);
                            break;
                        }
                    }
                    bVar.a(this.f16784c.f17016c);
                    bVarB = dVar;
                } else {
                    bVar.f16454e = 0;
                    bVarB = null;
                }
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar4 = this.f16784c;
                long j18 = bVar.f16452c;
                long j19 = bVar.f16451b;
                int i20 = nVar4.f17020g;
                int i21 = nVar4.f17017d;
                long j20 = j18 + ((long) nVar4.f17016c);
                int iB4 = nVar.b();
                if ((iB4 & 1) != 1 || (iM = nVar.m()) == 0) {
                    bVarB = null;
                } else {
                    long jA2 = z.a(iM, ((long) i20) * 1000000, i21);
                    if ((iB4 & 6) != 6) {
                        bVarB = new e(j20, jA2, j19, null, 0L, 0);
                    } else {
                        long jM = nVar.m();
                        nVar.e(nVar.f17846b + 1);
                        long[] jArr3 = new long[99];
                        for (int i22 = 0; i22 < 99; i22++) {
                            jArr3[i22] = nVar.j();
                        }
                        bVarB = new e(j20, jA2, j19, jArr3, jM, nVar4.f17016c);
                    }
                }
                if (bVarB != null) {
                    m mVar = this.f16785d;
                    if (mVar.f16704a == -1 || mVar.f16705b == -1) {
                        bVar.f16454e = 0;
                        bVar.a(i11 + 141, false);
                        bVar.a(this.f16783b.f17845a, 0, 3, false);
                        this.f16783b.e(0);
                        m mVar2 = this.f16785d;
                        int iL = this.f16783b.l();
                        mVar2.getClass();
                        int i23 = iL >> 12;
                        int i24 = iL & 4095;
                        if (i23 > 0 || i24 > 0) {
                            mVar2.f16704a = i23;
                            mVar2.f16705b = i24;
                        }
                    }
                }
                bVar.a(this.f16784c.f17016c);
                if (bVarB != null && !bVarB.a() && iB == f16780n) {
                    bVarB = b(bVar);
                }
            }
            this.f16790i = bVarB;
            if (bVarB == null) {
                this.f16790i = b(bVar);
            }
            this.f16786e.a(this.f16790i);
            r rVar = this.f16787f;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar5 = this.f16784c;
            String str = nVar5.f17015b;
            int i25 = nVar5.f17018e;
            int i26 = nVar5.f17017d;
            m mVar3 = this.f16785d;
            rVar.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str, -1, 4096, i25, i26, -1, mVar3.f16704a, mVar3.f16705b, null, null, 0, null, this.f16789h));
        }
        if (this.f16793l == 0) {
            bVar.f16454e = 0;
            if (bVar.a(this.f16783b.f17845a, 0, 4, true)) {
                this.f16783b.e(0);
                int iB5 = this.f16783b.b();
                if (((-128000) & iB5) == (((long) this.f16788g) & (-128000)) && com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB5) != -1) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB5, this.f16784c);
                    if (this.f16791j == -9223372036854775807L) {
                        this.f16791j = this.f16790i.b(bVar.f16452c);
                        if (this.f16782a != -9223372036854775807L) {
                            this.f16791j = (this.f16782a - this.f16790i.b(0L)) + this.f16791j;
                        }
                    }
                    this.f16793l = this.f16784c.f17016c;
                } else {
                    bVar.a(1);
                    this.f16788g = 0;
                }
                return 0;
            }
            i10 = -1;
            return i10;
        }
        int iA = this.f16787f.a(bVar, this.f16793l, true);
        i10 = -1;
        if (iA != -1) {
            int i27 = this.f16793l - iA;
            this.f16793l = i27;
            if (i27 <= 0) {
                long j21 = this.f16791j;
                long j22 = this.f16792k * 1000000;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar6 = this.f16784c;
                this.f16787f.a((j22 / ((long) nVar6.f17017d)) + j21, 1, nVar6.f17016c, 0, null);
                this.f16792k += (long) this.f16784c.f17020g;
                this.f16793l = 0;
                return 0;
            }
            return 0;
        }
        return i10;
    }
}
