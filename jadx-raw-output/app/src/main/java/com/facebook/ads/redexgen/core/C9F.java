package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9F implements InterfaceC2502mM, InterfaceC2503mN {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC2503mN A03;
    public C2506mQ[] A04 = new C2506mQ[0];
    public final InterfaceC2502mM A05;

    public C9F(InterfaceC2502mM interfaceC2502mM, boolean z10, long j10, long j11) {
        this.A05 = interfaceC2502mM;
        this.A02 = z10 ? j10 : -9223372036854775807L;
        this.A01 = j10;
        this.A00 = j11;
    }

    private C7I A00(long j10, C7I c7i) {
        long toleranceBeforeUs = AbstractC09664a.A0T(c7i.A01, 0L, j10 - this.A01);
        long jA0T = AbstractC09664a.A0T(c7i.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j10);
        if (toleranceBeforeUs == c7i.A01) {
            long j11 = c7i.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (jA0T == j11) {
                return c7i;
            }
        }
        return new C7I(toleranceBeforeUs, jA0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Cu
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ACs(InterfaceC2502mM interfaceC2502mM) {
        ((InterfaceC2503mN) C3M.A01(this.A03)).ACs(this);
    }

    public static boolean A02(long j10, InterfaceC2464lj[] interfaceC2464ljArr) {
        if (j10 != 0) {
            for (InterfaceC2464lj interfaceC2464lj : interfaceC2464ljArr) {
                if (interfaceC2464lj != null) {
                    C2654or c2654orA8u = interfaceC2464lj.A8u();
                    if (!AbstractC09212h.A0G(c2654orA8u.A0W, c2654orA8u.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1179Cv
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4k(long j10) {
        this.A05.A4k(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final boolean A54(long j10) {
        return this.A05.A54(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final void A5s(long j10, boolean z10) {
        this.A05.A5s(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final long A6j(long j10, C7I c7i) {
        if (j10 == this.A01) {
            return this.A01;
        }
        return this.A05.A6j(j10, A00(j10, c7i));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1179Cv
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A6y(long j10) {
        return this.A05.A6y(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final long A70() {
        long jA70 = this.A05.A70();
        if (jA70 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA70 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA70;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final long A8T() {
        long jA8T = this.A05.A8T();
        if (jA8T != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || jA8T < this.A00) {
                return jA8T;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final C2491mA A9E() {
        return this.A05.A9E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final void ABt() throws IOException {
        if (0 == 0) {
            this.A05.ABt();
            return;
        }
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2503mN
    public final void AEk(InterfaceC2502mM interfaceC2502mM) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC2503mN) C3M.A01(this.A03)).AEk(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final void AGL(InterfaceC2503mN interfaceC2503mN, long j10) {
        this.A03 = interfaceC2503mN;
        this.A05.AGL(this, j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final long AGg() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long jAGg = AGg();
            return jAGg != -9223372036854775807L ? jAGg : childDiscontinuityUs;
        }
        InterfaceC2502mM interfaceC2502mM = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long jAGg2 = interfaceC2502mM.AGg();
        if (jAGg2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long discontinuityUs = this.A01;
        boolean z10 = true;
        C3M.A08(jAGg2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (jAGg2 > discontinuityUs2) {
                z10 = false;
            }
        }
        C3M.A08(z10);
        return jAGg2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final void AGm(long j10) {
        this.A05.AGm(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final long AIO(@MetaExoPlayerCustomization long j10, boolean z10) {
        this.A02 = -9223372036854775807L;
        boolean z11 = false;
        for (C2506mQ c2506mQ : this.A04) {
            if (c2506mQ != null) {
                c2506mQ.A00();
            }
        }
        long jAIO = this.A05.AIO(j10, z10);
        if (jAIO == j10 || (jAIO >= this.A01 && (this.A00 == Long.MIN_VALUE || jAIO <= this.A00))) {
            z11 = true;
        }
        C3M.A08(z11);
        return jAIO;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011d A[EDGE_INSN: B:58:0x011d->B:54:0x011d BREAK  A[LOOP:1: B:31:0x0097->B:50:0x010e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x011d A[EDGE_INSN: B:60:0x011d->B:54:0x011d BREAK  A[LOOP:1: B:31:0x0097->B:50:0x010e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x010e A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2502mM
    public final long AIP(InterfaceC2464lj[] interfaceC2464ljArr, boolean[] zArr, InterfaceC1175Cr[] interfaceC1175CrArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        int i10;
        int length;
        InterfaceC1175Cr[] childStreams;
        InterfaceC1175Cr interfaceC1175Cr;
        InterfaceC1175Cr interfaceC1175Cr2;
        C2506mQ[] c2506mQArr;
        String[] strArr;
        this.A04 = new C2506mQ[interfaceC1175CrArr.length];
        InterfaceC1175Cr[] interfaceC1175CrArr2 = new InterfaceC1175Cr[interfaceC1175CrArr.length];
        int i11 = 0;
        while (true) {
            InterfaceC1175Cr interfaceC1175Cr3 = null;
            if (i11 >= interfaceC1175CrArr.length) {
                break;
            }
            this.A04[i11] = (C2506mQ) interfaceC1175CrArr[i11];
            InterfaceC1175Cr[] childStreams2 = this.A04;
            if (childStreams2[i11] != null) {
                interfaceC1175Cr3 = this.A04[i11].A01;
            }
            interfaceC1175CrArr2[i11] = interfaceC1175Cr3;
            i11++;
        }
        long jAIP = this.A05.AIP(interfaceC2464ljArr, zArr, interfaceC1175CrArr2, zArr2, j10);
        if (!A03() || j10 != this.A01) {
            j11 = -9223372036854775807L;
            this.A02 = j11;
            if (jAIP != j10 || (jAIP >= this.A01 && (this.A00 == Long.MIN_VALUE || jAIP <= this.A00))) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3M.A08(z10);
            i10 = 0;
            while (true) {
                length = interfaceC1175CrArr.length;
                if (A06[1].length() != 30) {
                    String[] strArr2 = A06;
                    strArr2[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                    strArr2[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                    if (i10 >= length) {
                        break;
                    }
                    if (interfaceC1175CrArr2[i10] == null) {
                        c2506mQArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c2506mQArr[i10] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i10] != null) {
                            interfaceC1175Cr = this.A04[i10].A01;
                            interfaceC1175Cr2 = interfaceC1175CrArr2[i10];
                            if (A06[1].length() != 30) {
                                String[] strArr3 = A06;
                                strArr3[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr3[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (interfaceC1175Cr != interfaceC1175Cr2) {
                                    this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                                }
                            } else if (interfaceC1175Cr != interfaceC1175Cr2) {
                                this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                            }
                        } else {
                            this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                        }
                    }
                    InterfaceC1175Cr[] childStreams3 = this.A04;
                    interfaceC1175CrArr[i10] = childStreams3[i10];
                    i10++;
                } else {
                    if (i10 >= length) {
                        break;
                    }
                    if (interfaceC1175CrArr2[i10] == null) {
                        c2506mQArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c2506mQArr[i10] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i10] != null) {
                            interfaceC1175Cr = this.A04[i10].A01;
                            interfaceC1175Cr2 = interfaceC1175CrArr2[i10];
                            if (A06[1].length() != 30) {
                                String[] strArr4 = A06;
                                strArr4[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr4[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (interfaceC1175Cr != interfaceC1175Cr2) {
                                    this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                                }
                            } else if (interfaceC1175Cr != interfaceC1175Cr2) {
                                this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                            }
                        } else {
                            this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                        }
                    }
                    InterfaceC1175Cr[] childStreams4 = this.A04;
                    interfaceC1175CrArr[i10] = childStreams4[i10];
                    i10++;
                }
            }
            return jAIP;
        }
        long j12 = this.A01;
        String[] strArr5 = A06;
        if (strArr5[4].charAt(5) == strArr5[3].charAt(5)) {
            String[] strArr6 = A06;
            strArr6[7] = "en1LL2zHQFU7eKPWWtw7tqDicZnmZ9l5";
            strArr6[5] = "t66o2OzEfyctLQHjRBlZ897u0IFgDWGZ";
            if (!A02(j12, interfaceC2464ljArr)) {
                j11 = -9223372036854775807L;
            } else {
                j11 = jAIP;
            }
            this.A02 = j11;
            if (jAIP != j10) {
                z10 = true;
            } else {
                z10 = true;
            }
            C3M.A08(z10);
            i10 = 0;
            while (true) {
                length = interfaceC1175CrArr.length;
                if (A06[1].length() != 30) {
                    String[] strArr7 = A06;
                    strArr7[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                    strArr7[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                    if (i10 >= length) {
                        break;
                        break;
                    }
                    if (interfaceC1175CrArr2[i10] == null) {
                        c2506mQArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c2506mQArr[i10] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i10] != null) {
                            interfaceC1175Cr = this.A04[i10].A01;
                            interfaceC1175Cr2 = interfaceC1175CrArr2[i10];
                            if (A06[1].length() != 30) {
                                String[] strArr8 = A06;
                                strArr8[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr8[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (interfaceC1175Cr != interfaceC1175Cr2) {
                                    this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                                }
                            } else if (interfaceC1175Cr != interfaceC1175Cr2) {
                                this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                            }
                        } else {
                            this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                        }
                    }
                    InterfaceC1175Cr[] childStreams5 = this.A04;
                    interfaceC1175CrArr[i10] = childStreams5[i10];
                    i10++;
                } else {
                    if (i10 >= length) {
                        break;
                        break;
                    }
                    if (interfaceC1175CrArr2[i10] == null) {
                        c2506mQArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c2506mQArr[i10] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i10] != null) {
                            interfaceC1175Cr = this.A04[i10].A01;
                            interfaceC1175Cr2 = interfaceC1175CrArr2[i10];
                            if (A06[1].length() != 30) {
                                String[] strArr9 = A06;
                                strArr9[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr9[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (interfaceC1175Cr != interfaceC1175Cr2) {
                                    this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                                }
                            } else if (interfaceC1175Cr != interfaceC1175Cr2) {
                                this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                            }
                        } else {
                            this.A04[i10] = new C2506mQ(this, interfaceC1175CrArr2[i10]);
                        }
                    }
                    InterfaceC1175Cr[] childStreams6 = this.A04;
                    interfaceC1175CrArr[i10] = childStreams6[i10];
                    i10++;
                }
            }
            return jAIP;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1179Cv
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIs(boolean z10) {
        this.A05.AIs(z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1179Cv
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJq(byte b10) {
        this.A05.AJq(b10);
    }
}
