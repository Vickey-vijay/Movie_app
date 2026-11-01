package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zm3 extends z33 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ym3 f85490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f85491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cn3 f85493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public an3 f85494r;

    @Override // yads.z33
    public final void a(long j10) {
        this.f85201g = j10;
        this.f85492p = j10 != 0;
        cn3 cn3Var = this.f85493q;
        this.f85491o = cn3Var != null ? cn3Var.f76338e : 0;
    }

    @Override // yads.z33
    public final long a(jb2 jb2Var) {
        int i10;
        byte[] bArr = jb2Var.f78966a;
        byte b10 = bArr[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        ym3 ym3Var = this.f85490n;
        if (ym3Var != null) {
            if (!ym3Var.f85060d[(b10 >> 1) & (255 >>> (8 - ym3Var.f85061e))].f75915a) {
                i10 = ym3Var.f85057a.f76338e;
            } else {
                i10 = ym3Var.f85057a.f76339f;
            }
            long j10 = this.f85492p ? (this.f85491o + i10) / 4 : 0;
            int length = bArr.length;
            int i11 = jb2Var.f78968c + 4;
            if (length < i11) {
                jb2Var.a(Arrays.copyOf(bArr, i11));
            } else {
                jb2Var.d(i11);
            }
            byte[] bArr2 = jb2Var.f78966a;
            int i12 = jb2Var.f78968c;
            bArr2[i12 - 4] = (byte) (j10 & 255);
            bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
            bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
            bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
            this.f85492p = true;
            this.f85491o = i10;
            return j10;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0387 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:167:0x0389  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v48 */
    @Override // yads.z33
    public final boolean a(jb2 jb2Var, long j10, x33 x33Var) throws ob2 {
        ym3 ym3Var;
        tm3 tm3Var;
        tm3 tm3Var2;
        boolean z10;
        if (this.f85490n != null) {
            x33Var.f84445a.getClass();
            return false;
        }
        cn3 cn3Var = this.f85493q;
        boolean z11 = true;
        if (cn3Var == null) {
            this.f85493q = dn3.a(jb2Var);
        } else {
            an3 an3Var = this.f85494r;
            if (an3Var == null) {
                this.f85494r = dn3.a(jb2Var, true, true);
            } else {
                int i10 = jb2Var.f78968c;
                byte[] bArr = new byte[i10];
                System.arraycopy(jb2Var.f78966a, 0, bArr, 0, i10);
                int i11 = cn3Var.f76334a;
                int i12 = 5;
                dn3.a(5, jb2Var, false);
                int iM = jb2Var.m() + 1;
                tm3 tm3Var3 = new tm3(jb2Var.f78966a);
                tm3Var3.b(jb2Var.f78967b * 8);
                int i13 = 0;
                while (i13 < iM) {
                    if (tm3Var3.a(24) == 5653314) {
                        int iA = tm3Var3.a(16);
                        int iA2 = tm3Var3.a(24);
                        long[] jArr = new long[iA2];
                        long jFloor = 0;
                        if (!tm3Var3.a()) {
                            boolean zA = tm3Var3.a();
                            int i14 = 0;
                            while (i14 < iA2) {
                                if (zA) {
                                    if (tm3Var3.a()) {
                                        jArr[i14] = tm3Var3.a(i12) + 1;
                                    } else {
                                        jArr[i14] = 0;
                                    }
                                    tm3Var2 = tm3Var3;
                                    z10 = true;
                                } else {
                                    int i15 = i12;
                                    tm3Var2 = tm3Var3;
                                    z10 = true;
                                    jArr[i14] = tm3Var2.a(i15) + 1;
                                }
                                i14++;
                                tm3Var3 = tm3Var2;
                                i12 = 5;
                            }
                            tm3Var = tm3Var3;
                        } else {
                            int i16 = i12;
                            tm3Var = tm3Var3;
                            int iA3 = tm3Var.a(i16) + 1;
                            int i17 = 0;
                            while (i17 < iA2) {
                                int i18 = 0;
                                for (int i19 = iA2 - i17; i19 > 0; i19 >>>= 1) {
                                    i18++;
                                }
                                int iA4 = tm3Var.a(i18);
                                int i20 = 0;
                                while (i20 < iA4 && i17 < iA2) {
                                    jArr[i17] = iA3;
                                    i17++;
                                    i20++;
                                    an3Var = an3Var;
                                    bArr = bArr;
                                }
                                iA3++;
                                an3Var = an3Var;
                                bArr = bArr;
                            }
                        }
                        an3 an3Var2 = an3Var;
                        byte[] bArr2 = bArr;
                        int iA5 = tm3Var.a(4);
                        if (iA5 > 2) {
                            throw new ob2(mg2.a("lookup type greater than 2 not decodable: ", iA5), null, true, 1);
                        }
                        if (iA5 == 1 || iA5 == 2) {
                            tm3Var.b(32);
                            tm3Var.b(32);
                            int iA6 = tm3Var.a(4) + 1;
                            tm3Var.b(1);
                            if (iA5 != 1) {
                                jFloor = ((long) iA2) * ((long) iA);
                            } else if (iA != 0) {
                                jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / ((double) iA)));
                            }
                            tm3Var.b((int) (((long) iA6) * jFloor));
                        }
                        i13++;
                        tm3Var3 = tm3Var;
                        an3Var = an3Var2;
                        bArr = bArr2;
                        i12 = 5;
                        z11 = true;
                    } else {
                        tm3 tm3Var4 = tm3Var3;
                        throw new ob2("expected code book to start with [0x56, 0x43, 0x42] at " + ((tm3Var4.f83102c * 8) + tm3Var4.f83103d), null, true, 1);
                    }
                }
                an3 an3Var3 = an3Var;
                byte[] bArr3 = bArr;
                boolean z12 = z11;
                tm3 tm3Var5 = tm3Var3;
                int i21 = 6;
                int iA7 = tm3Var5.a(6) + (z12 ? 1 : 0);
                for (int i22 = 0; i22 < iA7; i22++) {
                    if (tm3Var5.a(16) != 0) {
                        throw new ob2("placeholder of time domain transforms not zeroed out", null, z12, z12 ? 1 : 0);
                    }
                }
                int iA8 = tm3Var5.a(6) + (z12 ? 1 : 0);
                int i23 = 0;
                ?? r10 = z12;
                while (true) {
                    int i24 = 3;
                    if (i23 < iA8) {
                        int iA9 = tm3Var5.a(16);
                        if (iA9 == 0) {
                            int i25 = 8;
                            tm3Var5.b(8);
                            tm3Var5.b(16);
                            tm3Var5.b(16);
                            tm3Var5.b(6);
                            tm3Var5.b(8);
                            ?? A = tm3Var5.a(4) + r10;
                            int i26 = 0;
                            while (i26 < A) {
                                tm3Var5.b(i25);
                                i26++;
                                i25 = 8;
                            }
                        } else if (iA9 == r10) {
                            int iA10 = tm3Var5.a(5);
                            int i27 = -1;
                            int[] iArr = new int[iA10];
                            for (int i28 = 0; i28 < iA10; i28++) {
                                int iA11 = tm3Var5.a(4);
                                iArr[i28] = iA11;
                                if (iA11 > i27) {
                                    i27 = iA11;
                                }
                            }
                            int i29 = i27 + 1;
                            int[] iArr2 = new int[i29];
                            int i30 = 0;
                            while (i30 < i29) {
                                iArr2[i30] = tm3Var5.a(i24) + 1;
                                int iA12 = tm3Var5.a(2);
                                int i31 = 8;
                                if (iA12 > 0) {
                                    tm3Var5.b(8);
                                }
                                int i32 = 0;
                                for (int i33 = 1; i32 < (i33 << iA12); i33 = 1) {
                                    tm3Var5.b(i31);
                                    i32++;
                                    i31 = 8;
                                }
                                i30++;
                                i24 = 3;
                            }
                            tm3Var5.b(2);
                            int iA13 = tm3Var5.a(4);
                            int i34 = 0;
                            int i35 = 0;
                            for (int i36 = 0; i36 < iA10; i36++) {
                                i34 += iArr2[iArr[i36]];
                                while (i35 < i34) {
                                    tm3Var5.b(iA13);
                                    i35++;
                                }
                            }
                        } else {
                            throw new ob2(mg2.a("floor type greater than 1 not decodable: ", iA9), null, true, 1);
                        }
                        i23++;
                        i21 = 6;
                        r10 = 1;
                    } else {
                        int i37 = 1;
                        int iA14 = tm3Var5.a(i21) + 1;
                        int i38 = 0;
                        while (i38 < iA14) {
                            if (tm3Var5.a(16) <= 2) {
                                tm3Var5.b(24);
                                tm3Var5.b(24);
                                tm3Var5.b(24);
                                int iA15 = tm3Var5.a(i21) + i37;
                                int i39 = 8;
                                tm3Var5.b(8);
                                int[] iArr3 = new int[iA15];
                                for (int i40 = 0; i40 < iA15; i40++) {
                                    iArr3[i40] = ((tm3Var5.a() ? tm3Var5.a(5) : 0) * 8) + tm3Var5.a(3);
                                }
                                int i41 = 0;
                                while (i41 < iA15) {
                                    int i42 = 0;
                                    while (i42 < i39) {
                                        if ((iArr3[i41] & (1 << i42)) != 0) {
                                            tm3Var5.b(i39);
                                        }
                                        i42++;
                                        i39 = 8;
                                    }
                                    i41++;
                                    i39 = 8;
                                }
                                i38++;
                                i21 = 6;
                                i37 = 1;
                            } else {
                                throw new ob2("residueType greater than 2 is not decodable", null, true, 1);
                            }
                        }
                        int iA16 = tm3Var5.a(i21) + i37;
                        for (int i43 = 0; i43 < iA16; i43++) {
                            int iA17 = tm3Var5.a(16);
                            if (iA17 != 0) {
                                ih1.b("VorbisUtil", "mapping type other than 0 not supported: " + iA17);
                            } else {
                                int iA18 = tm3Var5.a() ? tm3Var5.a(4) + 1 : 1;
                                if (tm3Var5.a()) {
                                    int iA19 = tm3Var5.a(8) + 1;
                                    for (int i44 = 0; i44 < iA19; i44++) {
                                        int i45 = i11 - 1;
                                        int i46 = 0;
                                        for (int i47 = i45; i47 > 0; i47 >>>= 1) {
                                            i46++;
                                        }
                                        tm3Var5.b(i46);
                                        int i48 = 0;
                                        while (i45 > 0) {
                                            i48++;
                                            i45 >>>= 1;
                                        }
                                        tm3Var5.b(i48);
                                    }
                                }
                                if (tm3Var5.a(2) != 0) {
                                    throw new ob2("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                }
                                if (iA18 > 1) {
                                    for (int i49 = 0; i49 < i11; i49++) {
                                        tm3Var5.b(4);
                                    }
                                }
                                for (int i50 = 0; i50 < iA18; i50++) {
                                    tm3Var5.b(8);
                                    tm3Var5.b(8);
                                    tm3Var5.b(8);
                                }
                            }
                        }
                        int iA20 = tm3Var5.a(6);
                        int i51 = iA20 + 1;
                        bn3[] bn3VarArr = new bn3[i51];
                        for (int i52 = 0; i52 < i51; i52++) {
                            boolean zA2 = tm3Var5.a();
                            tm3Var5.a(16);
                            tm3Var5.a(16);
                            tm3Var5.a(8);
                            bn3VarArr[i52] = new bn3(zA2);
                        }
                        if (tm3Var5.a()) {
                            int i53 = 0;
                            while (iA20 > 0) {
                                i53++;
                                iA20 >>>= 1;
                            }
                            ym3Var = new ym3(cn3Var, an3Var3, bArr3, bn3VarArr, i53);
                            break;
                        }
                        throw new ob2("framing bit after modes not set as expected", null, true, 1);
                    }
                }
            }
            this.f85490n = ym3Var;
            if (ym3Var == null) {
                return true;
            }
            cn3 cn3Var2 = ym3Var.f85057a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cn3Var2.f76340g);
            arrayList.add(ym3Var.f85059c);
            ts1 ts1VarA = dn3.a(p51.b(ym3Var.f85058b.f75578a));
            lx0 lx0Var = new lx0();
            lx0Var.f79967k = "audio/vorbis";
            lx0Var.f79962f = cn3Var2.f76337d;
            lx0Var.f79963g = cn3Var2.f76336c;
            lx0Var.f79980x = cn3Var2.f76334a;
            lx0Var.f79981y = cn3Var2.f76335b;
            lx0Var.f79969m = arrayList;
            lx0Var.f79965i = ts1VarA;
            x33Var.f84445a = new mx0(lx0Var);
            return true;
        }
        ym3Var = null;
        this.f85490n = ym3Var;
        if (ym3Var == null) {
            return true;
        }
        cn3 cn3Var3 = ym3Var.f85057a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cn3Var3.f76340g);
        arrayList2.add(ym3Var.f85059c);
        ts1 ts1VarA2 = dn3.a(p51.b(ym3Var.f85058b.f75578a));
        lx0 lx0Var2 = new lx0();
        lx0Var2.f79967k = "audio/vorbis";
        lx0Var2.f79962f = cn3Var3.f76337d;
        lx0Var2.f79963g = cn3Var3.f76336c;
        lx0Var2.f79980x = cn3Var3.f76334a;
        lx0Var2.f79981y = cn3Var3.f76335b;
        lx0Var2.f79969m = arrayList2;
        lx0Var2.f79965i = ts1VarA2;
        x33Var.f84445a = new mx0(lx0Var2);
        return true;
    }

    @Override // yads.z33
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f85490n = null;
            this.f85493q = null;
            this.f85494r = null;
        }
        this.f85491o = 0;
        this.f85492p = false;
    }
}
