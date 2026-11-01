package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class jd0 implements tl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f78992a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f78993b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb3 f78994c = new wb3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sl0 f78995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78998g;

    public final void a(xi1 xi1Var) {
        this.f78995d = xi1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:211:0x0464  */
    /* JADX WARN: Code duplicated, block: B:217:0x0479  */
    /* JADX WARN: Failed to find 'out' block for switch in B:284:0x05c5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(ld0 ld0Var) throws ob2, EOFException, InterruptedIOException {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        kh1 kh1Var;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        String str;
        boolean z13;
        int i17;
        int i18;
        int i19;
        boolean z14;
        int i20;
        int i21;
        int i22;
        long j10;
        int i23;
        int i24;
        int i25;
        int iA;
        long j11;
        if (this.f78995d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            id0 id0Var = (id0) this.f78993b.peek();
            int i26 = 1;
            if (id0Var != null && ld0Var.f79757d >= id0Var.f78594b) {
                ((xi1) this.f78995d).f84602a.b(((id0) this.f78993b.pop()).f78593a);
                return true;
            }
            int i27 = 4;
            int i28 = 0;
            if (this.f78996e == 0) {
                long jA = this.f78994c.a(ld0Var, true, false, 4);
                if (jA == -2) {
                    ld0Var.f79759f = 0;
                    while (true) {
                        ld0Var.b(this.f78992a, 0, 4, false);
                        byte b10 = this.f78992a[0];
                        i25 = 0;
                        do {
                            long[] jArr = wb3.f84150d;
                            if (i25 < 8) {
                                j11 = jArr[i25] & ((long) b10);
                                i25++;
                            } else {
                                i25 = -1;
                            }
                            if (i25 == -1 && i25 <= 4) {
                                iA = (int) wb3.a(this.f78992a, i25, false);
                                ((xi1) this.f78995d).f84602a.getClass();
                                if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                }
                            }
                            ld0Var.a(1);
                        } while (j11 == 0);
                        if (i25 == -1) {
                        }
                        ld0Var.a(1);
                    }
                    ld0Var.a(i25);
                    jA = iA;
                }
                if (jA == -1) {
                    return false;
                }
                this.f78997f = (int) jA;
                this.f78996e = 1;
            }
            if (this.f78996e == 1) {
                this.f78998g = this.f78994c.a(ld0Var, false, true, 8);
                this.f78996e = 2;
            }
            sl0 sl0Var = this.f78995d;
            int i29 = this.f78997f;
            ((xi1) sl0Var).f84602a.getClass();
            int i30 = 3;
            switch (i29) {
                case MRAID_JS_WRITE_FAILED_VALUE:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i10 = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i10 = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i10 = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i10 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i10 = 5;
                    break;
                default:
                    i10 = 0;
                    break;
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    long j12 = ld0Var.f79757d;
                    this.f78993b.push(new id0(this.f78997f, this.f78998g + j12));
                    sl0 sl0Var2 = this.f78995d;
                    int i31 = this.f78997f;
                    long j13 = this.f78998g;
                    zi1 zi1Var = ((xi1) sl0Var2).f84602a;
                    pq0 pq0Var = zi1Var.f85413b0;
                    if (pq0Var == null) {
                        throw new IllegalStateException();
                    }
                    if (i31 == 160) {
                        i11 = 0;
                        zi1Var.Q = false;
                        zi1Var.R = 0L;
                    } else if (i31 == 174) {
                        i11 = 0;
                        zi1Var.f85432u = new yi1();
                    } else if (i31 != 187) {
                        if (i31 == 19899) {
                            zi1Var.f85434w = -1;
                            zi1Var.f85435x = -1L;
                        } else if (i31 == 20533) {
                            zi1Var.a(i31);
                            zi1Var.f85432u.f84980h = true;
                        } else if (i31 == 21968) {
                            zi1Var.a(i31);
                            zi1Var.f85432u.f84996x = true;
                        } else if (i31 == 408125543) {
                            long j14 = zi1Var.f85428q;
                            if (j14 != -1 && j14 != j12) {
                                throw new ob2("Multiple Segment elements not supported", null, true, 1);
                            }
                            zi1Var.f85428q = j12;
                            zi1Var.f85427p = j13;
                        } else if (i31 == 475249515) {
                            zi1Var.C = new kh1(0);
                            zi1Var.D = new kh1(0);
                        } else if (i31 == 524531317 && !zi1Var.f85433v) {
                            if (!zi1Var.f85415d || zi1Var.f85437z == -1) {
                                pq0Var.a(new uw2(zi1Var.f85431t, 0L));
                                zi1Var.f85433v = true;
                            } else {
                                zi1Var.f85436y = true;
                            }
                        }
                        i11 = 0;
                    } else {
                        i11 = 0;
                        zi1Var.E = false;
                    }
                    this.f78996e = i11;
                    return true;
                }
                byte b11 = 255;
                if (i10 == 2) {
                    long j15 = this.f78998g;
                    if (j15 > 8) {
                        throw new ob2("Invalid integer size: " + this.f78998g, null, true, 1);
                    }
                    sl0 sl0Var3 = this.f78995d;
                    int i32 = this.f78997f;
                    int i33 = (int) j15;
                    ld0Var.a(this.f78992a, 0, i33, false);
                    int i34 = 0;
                    long j16 = 0;
                    while (i34 < i33) {
                        j16 = (j16 << 8) | ((long) (this.f78992a[i34] & b11));
                        i34++;
                        b11 = 255;
                    }
                    zi1 zi1Var2 = ((xi1) sl0Var3).f84602a;
                    zi1Var2.getClass();
                    if (i32 != 20529) {
                        if (i32 != 20530) {
                            switch (i32) {
                                case MRAID_JS_WRITE_FAILED_VALUE:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84976d = (int) j16;
                                    break;
                                case 136:
                                    long j17 = j16;
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.V = j17 == 1;
                                    break;
                                case 155:
                                    zi1Var2.I = zi1Var2.a(j16);
                                    break;
                                case 159:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.O = (int) j16;
                                    break;
                                case 176:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84985m = (int) j16;
                                    break;
                                case 179:
                                    long j18 = j16;
                                    kh1 kh1Var2 = zi1Var2.C;
                                    if (kh1Var2 == null || zi1Var2.D == null) {
                                        throw new ob2("Element " + i32 + " must be in a Cues", null, true, 1);
                                    }
                                    kh1Var2.a(zi1Var2.a(j18));
                                    break;
                                case 186:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84986n = (int) j16;
                                    break;
                                case AD_RESPONSE_EMPTY_VALUE:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84975c = (int) j16;
                                    break;
                                case 231:
                                    zi1Var2.B = zi1Var2.a(j16);
                                    break;
                                case 238:
                                    zi1Var2.P = (int) j16;
                                    break;
                                case 241:
                                    long j19 = j16;
                                    z11 = true;
                                    if (!zi1Var2.E) {
                                        if (zi1Var2.C == null || (kh1Var = zi1Var2.D) == null) {
                                            throw new ob2("Element " + i32 + " must be in a Cues", null, true, 1);
                                        }
                                        kh1Var.a(j19);
                                        zi1Var2.E = true;
                                    }
                                    z10 = z11;
                                    break;
                                case 251:
                                    z11 = true;
                                    zi1Var2.Q = true;
                                    z10 = z11;
                                    break;
                                case 16871:
                                    z11 = true;
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84979g = (int) j16;
                                    z10 = z11;
                                    break;
                                case 16980:
                                    long j20 = j16;
                                    if (j20 != 3) {
                                        throw new ob2("ContentCompAlgo " + j20 + " not supported", null, true, 1);
                                    }
                                    break;
                                case 17029:
                                    long j21 = j16;
                                    if (j21 < 1 || j21 > 2) {
                                        throw new ob2("DocTypeReadVersion " + j21 + " not supported", null, true, 1);
                                    }
                                    break;
                                case 17143:
                                    long j22 = j16;
                                    if (j22 != 1) {
                                        throw new ob2("EBMLReadVersion " + j22 + " not supported", null, true, 1);
                                    }
                                    break;
                                case 18401:
                                    long j23 = j16;
                                    if (j23 != 5) {
                                        throw new ob2("ContentEncAlgo " + j23 + " not supported", null, true, 1);
                                    }
                                    break;
                                case 18408:
                                    long j24 = j16;
                                    if (j24 != 1) {
                                        throw new ob2("AESSettingsCipherMode " + j24 + " not supported", null, true, 1);
                                    }
                                    break;
                                case 21420:
                                    zi1Var2.f85435x = j16 + zi1Var2.f85428q;
                                    break;
                                case 21432:
                                    int i35 = (int) j16;
                                    zi1Var2.a(i32);
                                    if (i35 == 0) {
                                        i13 = 0;
                                        zi1Var2.f85432u.f84995w = 0;
                                        i12 = i13;
                                        z10 = true;
                                        this.f78996e = i12;
                                        return z10;
                                    }
                                    z12 = true;
                                    if (i35 != 1) {
                                        if (i35 == 3) {
                                            zi1Var2.f85432u.f84995w = 1;
                                        } else if (i35 == 15) {
                                            zi1Var2.f85432u.f84995w = 3;
                                        }
                                        z10 = z12;
                                    } else {
                                        zi1Var2.f85432u.f84995w = 2;
                                    }
                                    break;
                                    break;
                                case 21680:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84987o = (int) j16;
                                    break;
                                case 21682:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84989q = (int) j16;
                                    break;
                                case 21690:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84988p = (int) j16;
                                    break;
                                case 21930:
                                    long j25 = j16;
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.U = j25 == 1;
                                    break;
                                case 21998:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84978f = (int) j16;
                                    break;
                                case 22186:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.R = j16;
                                    break;
                                case 22203:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.S = j16;
                                    break;
                                case 25188:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.P = (int) j16;
                                    break;
                                case 30114:
                                    zi1Var2.R = j16;
                                    break;
                                case 30321:
                                    zi1Var2.a(i32);
                                    int i36 = (int) j16;
                                    if (i36 == 0) {
                                        i13 = 0;
                                        zi1Var2.f85432u.f84990r = 0;
                                        i12 = i13;
                                        z10 = true;
                                        this.f78996e = i12;
                                        return z10;
                                    }
                                    z12 = true;
                                    if (i36 == 1) {
                                        zi1Var2.f85432u.f84990r = 1;
                                    } else if (i36 == 2) {
                                        zi1Var2.f85432u.f84990r = 2;
                                    } else if (i36 == 3) {
                                        zi1Var2.f85432u.f84990r = 3;
                                    }
                                    z10 = z12;
                                    break;
                                    break;
                                case 2352003:
                                    zi1Var2.a(i32);
                                    zi1Var2.f85432u.f84977e = (int) j16;
                                    break;
                                case 2807729:
                                    zi1Var2.f85429r = j16;
                                    break;
                                default:
                                    switch (i32) {
                                        case 21945:
                                            zi1Var2.a(i32);
                                            int i37 = (int) j16;
                                            z12 = true;
                                            if (i37 != 1) {
                                                if (i37 == 2) {
                                                    zi1Var2.f85432u.A = 1;
                                                }
                                                z10 = z12;
                                            } else {
                                                zi1Var2.f85432u.A = 2;
                                            }
                                            break;
                                        case 21946:
                                            zi1Var2.a(i32);
                                            int i38 = (int) j16;
                                            wq wqVar = mx.f80412g;
                                            if (i38 == 1) {
                                                i14 = -1;
                                            } else {
                                                if (i38 == 16) {
                                                    i30 = 6;
                                                } else if (i38 == 18) {
                                                    i30 = 7;
                                                } else if (i38 != 6 && i38 != 7) {
                                                    i14 = -1;
                                                    i30 = -1;
                                                }
                                                i14 = -1;
                                            }
                                            if (i30 != i14) {
                                                zi1Var2.f85432u.f84998z = i30;
                                            }
                                            break;
                                        case 21947:
                                            zi1Var2.a(i32);
                                            yi1 yi1Var = zi1Var2.f85432u;
                                            yi1Var.f84996x = true;
                                            int i39 = (int) j16;
                                            wq wqVar2 = mx.f80412g;
                                            if (i39 == 1) {
                                                i15 = -1;
                                                i16 = 1;
                                            } else if (i39 == 9) {
                                                i15 = -1;
                                                i16 = 6;
                                            } else if (i39 == 4 || i39 == 5 || i39 == 6 || i39 == 7) {
                                                i15 = -1;
                                                i16 = 2;
                                            } else {
                                                i15 = -1;
                                                i16 = -1;
                                            }
                                            if (i16 != i15) {
                                                yi1Var.f84997y = i16;
                                            }
                                            break;
                                        case 21948:
                                            zi1Var2.a(i32);
                                            zi1Var2.f85432u.B = (int) j16;
                                            break;
                                        case 21949:
                                            zi1Var2.a(i32);
                                            zi1Var2.f85432u.C = (int) j16;
                                            break;
                                    }
                                    this.f78996e = i12;
                                    return z10;
                            }
                        } else {
                            long j26 = j16;
                            if (j26 != 1) {
                                throw new ob2("ContentEncodingScope " + j26 + " not supported", null, true, 1);
                            }
                        }
                        i12 = 0;
                        z10 = true;
                        this.f78996e = i12;
                        return z10;
                    }
                    long j27 = j16;
                    z10 = true;
                    if (j27 != 0) {
                        throw new ob2("ContentEncodingOrder " + j27 + " not supported", null, true, 1);
                    }
                    i12 = 0;
                    this.f78996e = i12;
                    return z10;
                }
                if (i10 == 3) {
                    long j28 = this.f78998g;
                    if (j28 > 2147483647L) {
                        throw new ob2("String element size: " + this.f78998g, null, true, 1);
                    }
                    sl0 sl0Var4 = this.f78995d;
                    int i40 = this.f78997f;
                    int i41 = (int) j28;
                    if (i41 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i41];
                        ld0Var.a(bArr, 0, i41, false);
                        while (i41 > 0 && bArr[i41 - 1] == 0) {
                            i41--;
                        }
                        str = new String(bArr, 0, i41);
                    }
                    zi1 zi1Var3 = ((xi1) sl0Var4).f84602a;
                    zi1Var3.getClass();
                    if (i40 != 134) {
                        if (i40 != 17026) {
                            if (i40 == 21358) {
                                zi1Var3.a(i40);
                                zi1Var3.f85432u.f84973a = str;
                            } else if (i40 == 2274716) {
                                zi1Var3.a(i40);
                                zi1Var3.f85432u.W = str;
                            }
                        } else if ("webm".equals(str)) {
                            z13 = true;
                        } else if (!"matroska".equals(str)) {
                            throw new ob2("DocType " + str + " not supported", null, true, 1);
                        }
                        i17 = 0;
                        z13 = true;
                        this.f78996e = i17;
                        return z13;
                    }
                    z13 = true;
                    zi1Var3.a(i40);
                    zi1Var3.f85432u.f84974b = str;
                    i17 = 0;
                    this.f78996e = i17;
                    return z13;
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new ob2(mg2.a("Invalid element type ", i10), null, true, 1);
                    }
                    long j29 = this.f78998g;
                    if (j29 != 4 && j29 != 8) {
                        throw new ob2("Invalid float size: " + this.f78998g, null, true, 1);
                    }
                    sl0 sl0Var5 = this.f78995d;
                    int i42 = this.f78997f;
                    int i43 = (int) j29;
                    ld0Var.a(this.f78992a, 0, i43, false);
                    long j30 = 0;
                    for (int i44 = 0; i44 < i43; i44++) {
                        j30 = ((long) (this.f78992a[i44] & 255)) | (j30 << 8);
                    }
                    double dIntBitsToFloat = i43 == 4 ? Float.intBitsToFloat((int) j30) : Double.longBitsToDouble(j30);
                    zi1 zi1Var4 = ((xi1) sl0Var5).f84602a;
                    if (i42 == 181) {
                        zi1Var4.a(i42);
                        zi1Var4.f85432u.Q = (int) dIntBitsToFloat;
                    } else if (i42 != 17545) {
                        switch (i42) {
                            case 21969:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.D = (float) dIntBitsToFloat;
                                break;
                            case 21970:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.E = (float) dIntBitsToFloat;
                                break;
                            case 21971:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.F = (float) dIntBitsToFloat;
                                break;
                            case 21972:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.G = (float) dIntBitsToFloat;
                                break;
                            case 21973:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.H = (float) dIntBitsToFloat;
                                break;
                            case 21974:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.I = (float) dIntBitsToFloat;
                                break;
                            case 21975:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.J = (float) dIntBitsToFloat;
                                break;
                            case 21976:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.K = (float) dIntBitsToFloat;
                                break;
                            case 21977:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.L = (float) dIntBitsToFloat;
                                break;
                            case 21978:
                                zi1Var4.a(i42);
                                zi1Var4.f85432u.M = (float) dIntBitsToFloat;
                                break;
                            default:
                                switch (i42) {
                                    case 30323:
                                        zi1Var4.a(i42);
                                        zi1Var4.f85432u.f84991s = (float) dIntBitsToFloat;
                                        break;
                                    case 30324:
                                        zi1Var4.a(i42);
                                        zi1Var4.f85432u.f84992t = (float) dIntBitsToFloat;
                                        break;
                                    case 30325:
                                        zi1Var4.a(i42);
                                        zi1Var4.f85432u.f84993u = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        zi1Var4.getClass();
                                        break;
                                }
                                break;
                        }
                    } else {
                        zi1Var4.f85430s = (long) dIntBitsToFloat;
                    }
                    this.f78996e = 0;
                    return true;
                }
                sl0 sl0Var6 = this.f78995d;
                int i45 = this.f78997f;
                int i46 = (int) this.f78998g;
                zi1 zi1Var5 = ((xi1) sl0Var6).f84602a;
                zi1Var5.getClass();
                if (i45 == 161 || i45 == 163) {
                    if (zi1Var5.G == 0) {
                        zi1Var5.M = (int) zi1Var5.f85412b.a(ld0Var, false, true, 8);
                        zi1Var5.N = zi1Var5.f85412b.f84153c;
                        zi1Var5.I = -9223372036854775807L;
                        zi1Var5.G = 1;
                        zi1Var5.f85418g.c(0);
                    }
                    yi1 yi1Var2 = (yi1) zi1Var5.f85414c.get(zi1Var5.M);
                    if (yi1Var2 == null) {
                        ld0Var.a(i46 - zi1Var5.N);
                        zi1Var5.G = 0;
                    } else {
                        yi1Var2.X.getClass();
                        if (zi1Var5.G == 1) {
                            zi1Var5.a(ld0Var, 3);
                            int i47 = (zi1Var5.f85418g.f78966a[2] & 6) >> 1;
                            if (i47 == 0) {
                                zi1Var5.K = 1;
                                int[] iArr = zi1Var5.L;
                                if (iArr == null) {
                                    iArr = new int[1];
                                } else if (iArr.length < 1) {
                                    iArr = new int[Math.max(iArr.length * 2, 1)];
                                }
                                zi1Var5.L = iArr;
                                iArr[0] = (i46 - zi1Var5.N) - 3;
                            } else {
                                zi1Var5.a(ld0Var, 4);
                                int i48 = (zi1Var5.f85418g.f78966a[3] & 255) + 1;
                                zi1Var5.K = i48;
                                int[] iArr2 = zi1Var5.L;
                                if (iArr2 == null) {
                                    iArr2 = new int[i48];
                                } else if (iArr2.length < i48) {
                                    iArr2 = new int[Math.max(iArr2.length * 2, i48)];
                                }
                                zi1Var5.L = iArr2;
                                if (i47 == 2) {
                                    int i49 = (i46 - zi1Var5.N) - 4;
                                    int i50 = zi1Var5.K;
                                    Arrays.fill(iArr2, 0, i50, i49 / i50);
                                } else {
                                    if (i47 == 1) {
                                        int i51 = 0;
                                        int i52 = 0;
                                        while (true) {
                                            int i53 = zi1Var5.K - 1;
                                            if (i51 < i53) {
                                                zi1Var5.L[i51] = 0;
                                                while (true) {
                                                    i23 = i27 + 1;
                                                    zi1Var5.a(ld0Var, i23);
                                                    int i54 = zi1Var5.f85418g.f78966a[i27] & 255;
                                                    int[] iArr3 = zi1Var5.L;
                                                    i24 = iArr3[i51] + i54;
                                                    iArr3[i51] = i24;
                                                    if (i54 != 255) {
                                                        break;
                                                    }
                                                    i27 = i23;
                                                }
                                                i52 += i24;
                                                i51++;
                                                i27 = i23;
                                            } else {
                                                zi1Var5.L[i53] = ((i46 - zi1Var5.N) - i27) - i52;
                                            }
                                        }
                                    } else {
                                        if (i47 != 3) {
                                            throw new ob2(mg2.a("Unexpected lacing value: ", i47), null, true, 1);
                                        }
                                        int i55 = 0;
                                        int i56 = 0;
                                        while (true) {
                                            int i57 = zi1Var5.K - i26;
                                            if (i55 < i57) {
                                                zi1Var5.L[i55] = i28;
                                                int i58 = i27 + 1;
                                                zi1Var5.a(ld0Var, i58);
                                                if (zi1Var5.f85418g.f78966a[i27] == 0) {
                                                    boolean z15 = i26;
                                                    throw new ob2("No valid varint length mask found", null, z15, z15 ? 1 : 0);
                                                }
                                                int i59 = i28;
                                                int i60 = 8;
                                                while (true) {
                                                    if (i59 < i60) {
                                                        int i61 = i26 << (7 - i59);
                                                        if ((zi1Var5.f85418g.f78966a[i27] & i61) != 0) {
                                                            int i62 = i58 + i59;
                                                            zi1Var5.a(ld0Var, i62);
                                                            long j31 = (~i61) & zi1Var5.f85418g.f78966a[i27] & 255;
                                                            while (i58 < i62) {
                                                                j31 = (j31 << 8) | ((long) (zi1Var5.f85418g.f78966a[i58] & 255));
                                                                i58++;
                                                                i45 = i45;
                                                            }
                                                            i22 = i45;
                                                            j10 = i55 > 0 ? j31 - ((1 << ((i59 * 7) + 6)) - 1) : j31;
                                                            i27 = i62;
                                                        } else {
                                                            i59++;
                                                            i26 = 1;
                                                            i60 = 8;
                                                        }
                                                    } else {
                                                        i22 = i45;
                                                        i27 = i58;
                                                        j10 = 0;
                                                    }
                                                }
                                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                                    throw new ob2("EBML lacing sample size out of range.", null, true, 1);
                                                }
                                                int i63 = (int) j10;
                                                int[] iArr4 = zi1Var5.L;
                                                if (i55 != 0) {
                                                    i63 += iArr4[i55 - 1];
                                                }
                                                iArr4[i55] = i63;
                                                i56 += i63;
                                                i55++;
                                                i45 = i22;
                                                i26 = 1;
                                                i28 = 0;
                                            } else {
                                                i21 = i45;
                                                zi1Var5.L[i57] = ((i46 - zi1Var5.N) - i27) - i56;
                                            }
                                        }
                                    }
                                    byte[] bArr2 = zi1Var5.f85418g.f78966a;
                                    zi1Var5.H = zi1Var5.a((bArr2[1] & 255) | (bArr2[0] << 8)) + zi1Var5.B;
                                    if (yi1Var2.f84976d != 2) {
                                        i18 = i21;
                                        int i64 = (i18 == 163 || (zi1Var5.f85418g.f78966a[2] & 128) != 128) ? 0 : 1;
                                        zi1Var5.O = i64;
                                        zi1Var5.G = 2;
                                        zi1Var5.J = 0;
                                        i19 = 163;
                                    } else {
                                        i18 = i21;
                                    }
                                    zi1Var5.O = i64;
                                    zi1Var5.G = 2;
                                    zi1Var5.J = 0;
                                    i19 = 163;
                                }
                            }
                            i21 = i45;
                            byte[] bArr3 = zi1Var5.f85418g.f78966a;
                            zi1Var5.H = zi1Var5.a((bArr3[1] & 255) | (bArr3[0] << 8)) + zi1Var5.B;
                            if (yi1Var2.f84976d != 2) {
                                i18 = i21;
                                if (i18 == 163) {
                                }
                                zi1Var5.O = i64;
                                zi1Var5.G = 2;
                                zi1Var5.J = 0;
                                i19 = 163;
                            } else {
                                i18 = i21;
                            }
                            zi1Var5.O = i64;
                            zi1Var5.G = 2;
                            zi1Var5.J = 0;
                            i19 = 163;
                        } else {
                            i18 = i45;
                            i19 = 163;
                        }
                        if (i18 == i19) {
                            while (true) {
                                int i65 = zi1Var5.J;
                                if (i65 < zi1Var5.K) {
                                    zi1Var5.a(yi1Var2, zi1Var5.H + ((long) ((zi1Var5.J * yi1Var2.f84977e) / 1000)), zi1Var5.O, zi1Var5.a(ld0Var, yi1Var2, zi1Var5.L[i65], false), 0);
                                    zi1Var5.J++;
                                } else {
                                    z14 = true;
                                    zi1Var5.G = 0;
                                    i20 = 0;
                                }
                            }
                        } else {
                            z14 = true;
                            while (true) {
                                int i66 = zi1Var5.J;
                                if (i66 < zi1Var5.K) {
                                    int[] iArr5 = zi1Var5.L;
                                    iArr5[i66] = zi1Var5.a(ld0Var, yi1Var2, iArr5[i66], true);
                                    zi1Var5.J++;
                                } else {
                                    i20 = 0;
                                }
                            }
                        }
                    }
                    this.f78996e = i20;
                    return z14;
                }
                if (i45 != 165) {
                    if (i45 == 16877) {
                        zi1Var5.a(i45);
                        yi1 yi1Var3 = zi1Var5.f85432u;
                        int i67 = yi1Var3.f84979g;
                        if (i67 == 1685485123 || i67 == 1685480259) {
                            byte[] bArr4 = new byte[i46];
                            yi1Var3.N = bArr4;
                            ld0Var.a(bArr4, 0, i46, false);
                        } else {
                            ld0Var.a(i46);
                        }
                    } else if (i45 == 16981) {
                        zi1Var5.a(i45);
                        byte[] bArr5 = new byte[i46];
                        zi1Var5.f85432u.f84981i = bArr5;
                        ld0Var.a(bArr5, 0, i46, false);
                    } else if (i45 == 18402) {
                        byte[] bArr6 = new byte[i46];
                        ld0Var.a(bArr6, 0, i46, false);
                        zi1Var5.a(i45);
                        zi1Var5.f85432u.f84982j = new l73(1, 0, 0, bArr6);
                    } else if (i45 == 21419) {
                        Arrays.fill(zi1Var5.f85420i.f78966a, (byte) 0);
                        ld0Var.a(zi1Var5.f85420i.f78966a, 4 - i46, i46, false);
                        zi1Var5.f85420i.e(0);
                        zi1Var5.f85434w = (int) zi1Var5.f85420i.n();
                    } else if (i45 == 25506) {
                        zi1Var5.a(i45);
                        byte[] bArr7 = new byte[i46];
                        zi1Var5.f85432u.f84983k = bArr7;
                        ld0Var.a(bArr7, 0, i46, false);
                    } else {
                        if (i45 != 30322) {
                            throw new ob2(mg2.a("Unexpected id: ", i45), null, true, 1);
                        }
                        zi1Var5.a(i45);
                        byte[] bArr8 = new byte[i46];
                        zi1Var5.f85432u.f84994v = bArr8;
                        ld0Var.a(bArr8, 0, i46, false);
                    }
                } else if (zi1Var5.G == 2) {
                    yi1 yi1Var4 = (yi1) zi1Var5.f85414c.get(zi1Var5.M);
                    if (zi1Var5.P == 4 && "V_VP9".equals(yi1Var4.f84974b)) {
                        zi1Var5.f85425n.c(i46);
                        ld0Var.a(zi1Var5.f85425n.f78966a, 0, i46, false);
                    } else {
                        ld0Var.a(i46);
                    }
                }
                z14 = true;
                i20 = 0;
                this.f78996e = i20;
                return z14;
            }
            ld0Var.a((int) this.f78998g);
            this.f78996e = 0;
        }
    }

    public final void a() {
        this.f78996e = 0;
        this.f78993b.clear();
        wb3 wb3Var = this.f78994c;
        wb3Var.f84152b = 0;
        wb3Var.f84153c = 0;
    }
}
