package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f17082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f17085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f17086r;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f17082n = null;
            this.f17085q = null;
            this.f17086r = null;
        }
        this.f17083o = 0;
        this.f17084p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        byte b10 = nVar.f17845a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        n nVar2 = this.f17082n;
        if (!nVar2.f17080c[(b10 >> 1) & (255 >>> (8 - nVar2.f17081d))].f17087a) {
            i10 = nVar2.f17078a.f17091d;
        } else {
            i10 = nVar2.f17078a.f17092e;
        }
        long j10 = this.f17084p ? (this.f17083o + i10) / 4 : 0;
        nVar.d(nVar.f17847c + 4);
        byte[] bArr = nVar.f17845a;
        int i11 = nVar.f17847c;
        bArr[i11 - 4] = (byte) (j10 & 255);
        bArr[i11 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr[i11 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr[i11 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f17084p = true;
        this.f17083o = i10;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        long jFloor;
        if (this.f17082n != null) {
            return false;
        }
        n nVar2 = null;
        if (this.f17085q == null) {
            this.f17085q = s.a(nVar);
        } else if (this.f17086r == null) {
            s.a(3, nVar, false);
            nVar.b((int) nVar.e());
            long jE = nVar.e();
            String[] strArr = new String[(int) jE];
            for (int i10 = 0; i10 < jE; i10++) {
                strArr[i10] = nVar.b((int) nVar.e());
            }
            if ((nVar.j() & 1) != 0) {
                this.f17086r = new p();
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("framing bit expected to be set");
            }
        } else {
            int i11 = nVar.f17847c;
            byte[] bArr = new byte[i11];
            System.arraycopy(nVar.f17845a, 0, bArr, 0, i11);
            int i12 = this.f17085q.f17088a;
            int i13 = 5;
            s.a(5, nVar, false);
            int iJ = nVar.j() + 1;
            m mVar = new m(nVar.f17845a);
            mVar.b(nVar.f17846b * 8);
            int i14 = 0;
            while (i14 < iJ) {
                if (mVar.a(24) == 5653314) {
                    int iA = mVar.a(16);
                    int iA2 = mVar.a(24);
                    long[] jArr = new long[iA2];
                    long j11 = 0;
                    if (!mVar.a()) {
                        boolean zA = mVar.a();
                        for (int i15 = 0; i15 < iA2; i15++) {
                            if (zA) {
                                if (mVar.a()) {
                                    jArr[i15] = mVar.a(i13) + 1;
                                } else {
                                    jArr[i15] = 0;
                                }
                            } else {
                                jArr[i15] = mVar.a(i13) + 1;
                            }
                        }
                    } else {
                        int iA3 = mVar.a(i13) + 1;
                        int i16 = 0;
                        while (i16 < iA2) {
                            int i17 = 0;
                            for (int i18 = iA2 - i16; i18 > 0; i18 >>>= 1) {
                                i17++;
                            }
                            int iA4 = mVar.a(i17);
                            int i19 = 0;
                            while (i19 < iA4 && i16 < iA2) {
                                jArr[i16] = iA3;
                                i16++;
                                i19++;
                                iJ = iJ;
                            }
                            iA3++;
                            iJ = iJ;
                        }
                    }
                    int i20 = iJ;
                    int iA5 = mVar.a(4);
                    if (iA5 > 2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("lookup type greater than 2 not decodable: ", iA5));
                    }
                    if (iA5 == 1 || iA5 == 2) {
                        mVar.b(32);
                        mVar.b(32);
                        int iA6 = mVar.a(4) + 1;
                        mVar.b(1);
                        if (iA5 == 1) {
                            if (iA != 0) {
                                jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / ((double) iA)));
                            }
                            mVar.b((int) (((long) iA6) * j11));
                        } else {
                            jFloor = iA2 * iA;
                        }
                        j11 = jFloor;
                        mVar.b((int) (((long) iA6) * j11));
                    }
                    i14++;
                    iJ = i20;
                    i13 = 5;
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected code book to start with [0x56, 0x43, 0x42] at " + ((mVar.f17076c * 8) + mVar.f17077d));
                }
            }
            int i21 = 6;
            int iA7 = mVar.a(6) + 1;
            for (int i22 = 0; i22 < iA7; i22++) {
                if (mVar.a(16) != 0) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("placeholder of time domain transforms not zeroed out");
                }
            }
            int iA8 = mVar.a(6) + 1;
            int i23 = 0;
            while (i23 < iA8) {
                int iA9 = mVar.a(16);
                if (iA9 == 0) {
                    int i24 = 8;
                    mVar.b(8);
                    mVar.b(16);
                    mVar.b(16);
                    mVar.b(6);
                    mVar.b(8);
                    int iA10 = mVar.a(4) + 1;
                    int i25 = 0;
                    while (i25 < iA10) {
                        mVar.b(i24);
                        i25++;
                        i24 = 8;
                    }
                } else if (iA9 == 1) {
                    int iA11 = mVar.a(5);
                    int i26 = -1;
                    int[] iArr = new int[iA11];
                    for (int i27 = 0; i27 < iA11; i27++) {
                        int iA12 = mVar.a(4);
                        iArr[i27] = iA12;
                        if (iA12 > i26) {
                            i26 = iA12;
                        }
                    }
                    int i28 = i26 + 1;
                    int[] iArr2 = new int[i28];
                    for (int i29 = 0; i29 < i28; i29++) {
                        iArr2[i29] = mVar.a(3) + 1;
                        int iA13 = mVar.a(2);
                        int i30 = 8;
                        if (iA13 > 0) {
                            mVar.b(8);
                        }
                        int i31 = 0;
                        while (i31 < (1 << iA13)) {
                            mVar.b(i30);
                            i31++;
                            i30 = 8;
                        }
                    }
                    mVar.b(2);
                    int iA14 = mVar.a(4);
                    int i32 = 0;
                    int i33 = 0;
                    for (int i34 = 0; i34 < iA11; i34++) {
                        i32 += iArr2[iArr[i34]];
                        while (i33 < i32) {
                            mVar.b(iA14);
                            i33++;
                        }
                    }
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("floor type greater than 1 not decodable: ", iA9));
                }
                i23++;
                i21 = 6;
            }
            int iA15 = mVar.a(i21) + 1;
            int i35 = 0;
            while (i35 < iA15) {
                if (mVar.a(16) <= 2) {
                    mVar.b(24);
                    mVar.b(24);
                    mVar.b(24);
                    int iA16 = mVar.a(i21) + 1;
                    int i36 = 8;
                    mVar.b(8);
                    int[] iArr3 = new int[iA16];
                    for (int i37 = 0; i37 < iA16; i37++) {
                        iArr3[i37] = ((mVar.a() ? mVar.a(5) : 0) * 8) + mVar.a(3);
                    }
                    int i38 = 0;
                    while (i38 < iA16) {
                        int i39 = 0;
                        while (i39 < i36) {
                            if ((iArr3[i38] & (1 << i39)) != 0) {
                                mVar.b(i36);
                            }
                            i39++;
                            i36 = 8;
                        }
                        i38++;
                        i36 = 8;
                    }
                    i35++;
                    i21 = 6;
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("residueType greater than 2 is not decodable");
                }
            }
            int iA17 = mVar.a(i21) + 1;
            for (int i40 = 0; i40 < iA17; i40++) {
                int iA18 = mVar.a(16);
                if (iA18 != 0) {
                    Log.e("VorbisUtil", "mapping type other than 0 not supported: " + iA18);
                } else {
                    int iA19 = mVar.a() ? mVar.a(4) + 1 : 1;
                    if (mVar.a()) {
                        int iA20 = mVar.a(8) + 1;
                        for (int i41 = 0; i41 < iA20; i41++) {
                            int i42 = i12 - 1;
                            int i43 = 0;
                            for (int i44 = i42; i44 > 0; i44 >>>= 1) {
                                i43++;
                            }
                            mVar.b(i43);
                            int i45 = 0;
                            while (i42 > 0) {
                                i45++;
                                i42 >>>= 1;
                            }
                            mVar.b(i45);
                        }
                    }
                    if (mVar.a(2) != 0) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("to reserved bits must be zero after mapping coupling steps");
                    }
                    if (iA19 > 1) {
                        for (int i46 = 0; i46 < i12; i46++) {
                            mVar.b(4);
                        }
                    }
                    for (int i47 = 0; i47 < iA19; i47++) {
                        mVar.b(8);
                        mVar.b(8);
                        mVar.b(8);
                    }
                }
            }
            int iA21 = mVar.a(6);
            int i48 = iA21 + 1;
            q[] qVarArr = new q[i48];
            for (int i49 = 0; i49 < i48; i49++) {
                boolean zA2 = mVar.a();
                mVar.a(16);
                mVar.a(16);
                mVar.a(8);
                qVarArr[i49] = new q(zA2);
            }
            if (mVar.a()) {
                int i50 = 0;
                while (iA21 > 0) {
                    i50++;
                    iA21 >>>= 1;
                }
                nVar2 = new n(this.f17085q, bArr, qVarArr, i50);
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("framing bit after modes not set as expected");
            }
        }
        this.f17082n = nVar2;
        if (nVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f17082n.f17078a.f17093f);
        arrayList.add(this.f17082n.f17079b);
        r rVar = this.f17082n.f17078a;
        jVar.f17059a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/vorbis", rVar.f17090c, -1, rVar.f17088a, (int) rVar.f17089b, arrayList, null, null);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(long j10) {
        this.f17067g = j10;
        this.f17084p = j10 != 0;
        r rVar = this.f17085q;
        this.f17083o = rVar != null ? rVar.f17091d : 0;
    }
}
