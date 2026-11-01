package yads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class mt extends pt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f80376g = new jb2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ib2 f80377h = new ib2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80378i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f80379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kt[] f80380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kt f80381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f80382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f80383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public lt f80384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f80385p;

    /* JADX WARN: Code duplicated, block: B:231:0x05e6  */
    public final void g() {
        boolean z10;
        int i10;
        char c10;
        lt ltVar = this.f80384o;
        if (ltVar == null) {
            return;
        }
        int i11 = 2;
        if (ltVar.f79906d != (ltVar.f79904b * 2) - 1) {
            ih1.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f80384o.f79904b * 2) - 1) + ", but current index is " + this.f80384o.f79906d + " (sequence number " + this.f80384o.f79903a + ");");
        }
        ib2 ib2Var = this.f80377h;
        lt ltVar2 = this.f80384o;
        ib2Var.a(ltVar2.f79906d, ltVar2.f79905c);
        boolean z11 = false;
        while (this.f80377h.b() > 0) {
            int i12 = 3;
            int iA = this.f80377h.a(3);
            int iA2 = this.f80377h.a(5);
            int i13 = 7;
            if (iA == 7) {
                this.f80377h.c(i11);
                iA = this.f80377h.a(6);
                if (iA < 7) {
                    kf1.a("Invalid extended service number: ", iA, "Cea708Decoder");
                }
            }
            if (iA2 == 0) {
                if (iA != 0) {
                    ih1.d("Cea708Decoder", "serviceNumber is non-zero (" + iA + ") when blockSize is 0");
                }
                if (z11) {
                    this.f80382m = h();
                }
                this.f80384o = null;
            }
            if (iA != this.f80379j) {
                this.f80377h.d(iA2);
            } else {
                int iD = (iA2 * 8) + this.f80377h.d();
                while (this.f80377h.d() < iD) {
                    int iA3 = this.f80377h.a(8);
                    if (iA3 != 16) {
                        if (iA3 <= 31) {
                            if (iA3 != 0) {
                                if (iA3 == i12) {
                                    this.f80382m = h();
                                } else if (iA3 != 8) {
                                    switch (iA3) {
                                        case 12:
                                            for (int i14 = 0; i14 < 8; i14++) {
                                                this.f80380k[i14].b();
                                            }
                                            break;
                                        case 13:
                                            this.f80381l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iA3 >= 17 && iA3 <= 23) {
                                                kf1.a("Currently unsupported COMMAND_EXT1 Command: ", iA3, "Cea708Decoder");
                                                this.f80377h.c(8);
                                            } else if (iA3 < 24 || iA3 > 31) {
                                                kf1.a("Invalid C0 command: ", iA3, "Cea708Decoder");
                                            } else {
                                                kf1.a("Currently unsupported COMMAND_P16 Command: ", iA3, "Cea708Decoder");
                                                this.f80377h.c(16);
                                            }
                                            break;
                                    }
                                } else {
                                    kt ktVar = this.f80381l;
                                    int length = ktVar.f79539b.length();
                                    if (length > 0) {
                                        ktVar.f79539b.delete(length - 1, length);
                                    }
                                }
                            }
                            i10 = i11;
                            z10 = true;
                        } else {
                            if (iA3 > 127) {
                                if (iA3 <= 159) {
                                    switch (iA3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case 134:
                                        case 135:
                                            z10 = true;
                                            int i15 = iA3 - 128;
                                            if (this.f80385p != i15) {
                                                this.f80385p = i15;
                                                this.f80381l = this.f80380k[i15];
                                            }
                                            break;
                                        case 136:
                                            z10 = true;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (this.f80377h.e()) {
                                                    kt ktVar2 = this.f80380k[8 - i16];
                                                    ktVar2.f79538a.clear();
                                                    ktVar2.f79539b.clear();
                                                    ktVar2.f79553p = -1;
                                                    ktVar2.f79554q = -1;
                                                    ktVar2.f79555r = -1;
                                                    ktVar2.f79557t = -1;
                                                    ktVar2.f79559v = 0;
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (this.f80377h.e()) {
                                                    this.f80380k[8 - i17].f79541d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (this.f80377h.e()) {
                                                    this.f80380k[8 - i18].f79541d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (this.f80377h.e()) {
                                                    kt ktVar3 = this.f80380k[8 - i19];
                                                    ktVar3.f79541d = !ktVar3.f79541d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (this.f80377h.e()) {
                                                    this.f80380k[8 - i20].b();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            this.f80377h.c(8);
                                            z10 = true;
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            for (int i21 = 0; i21 < 8; i21++) {
                                                this.f80380k[i21].b();
                                            }
                                            z10 = true;
                                            break;
                                        case 144:
                                            if (this.f80381l.f79540c) {
                                                this.f80377h.a(4);
                                                this.f80377h.a(2);
                                                this.f80377h.a(2);
                                                boolean zE = this.f80377h.e();
                                                boolean zE2 = this.f80377h.e();
                                                i12 = 3;
                                                this.f80377h.a(3);
                                                this.f80377h.a(3);
                                                this.f80381l.a(zE, zE2);
                                                z10 = true;
                                            } else {
                                                this.f80377h.c(16);
                                                z10 = true;
                                                i12 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.f80381l.f79540c) {
                                                int iA4 = kt.a(this.f80377h.a(2), this.f80377h.a(2), this.f80377h.a(2), this.f80377h.a(2));
                                                int iA5 = kt.a(this.f80377h.a(2), this.f80377h.a(2), this.f80377h.a(2), this.f80377h.a(2));
                                                this.f80377h.c(2);
                                                kt.a(this.f80377h.a(2), this.f80377h.a(2), this.f80377h.a(2), 0);
                                                this.f80381l.a(iA4, iA5);
                                            } else {
                                                this.f80377h.c(24);
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                        case 146:
                                            if (this.f80381l.f79540c) {
                                                this.f80377h.c(4);
                                                int iA6 = this.f80377h.a(4);
                                                this.f80377h.c(2);
                                                this.f80377h.a(6);
                                                kt ktVar4 = this.f80381l;
                                                if (ktVar4.f79559v != iA6) {
                                                    ktVar4.a('\n');
                                                }
                                                ktVar4.f79559v = iA6;
                                            } else {
                                                this.f80377h.c(16);
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            z10 = true;
                                            kf1.a("Invalid C1 command: ", iA3, "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (this.f80381l.f79540c) {
                                                int iA7 = kt.a(this.f80377h.a(2), this.f80377h.a(2), this.f80377h.a(2), this.f80377h.a(2));
                                                this.f80377h.a(2);
                                                kt.a(this.f80377h.a(2), this.f80377h.a(2), this.f80377h.a(2), 0);
                                                this.f80377h.e();
                                                this.f80377h.e();
                                                this.f80377h.a(2);
                                                this.f80377h.a(2);
                                                int iA8 = this.f80377h.a(2);
                                                this.f80377h.c(8);
                                                kt ktVar5 = this.f80381l;
                                                ktVar5.f79552o = iA7;
                                                ktVar5.f79549l = iA8;
                                            } else {
                                                this.f80377h.c(32);
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i22 = iA3 - 152;
                                            kt ktVar6 = this.f80380k[i22];
                                            this.f80377h.c(i11);
                                            boolean zE3 = this.f80377h.e();
                                            boolean zE4 = this.f80377h.e();
                                            this.f80377h.e();
                                            int iA9 = this.f80377h.a(i12);
                                            boolean zE5 = this.f80377h.e();
                                            int iA10 = this.f80377h.a(i13);
                                            int iA11 = this.f80377h.a(8);
                                            int iA12 = this.f80377h.a(4);
                                            int iA13 = this.f80377h.a(4);
                                            this.f80377h.c(i11);
                                            this.f80377h.a(6);
                                            this.f80377h.c(i11);
                                            int iA14 = this.f80377h.a(3);
                                            int iA15 = this.f80377h.a(3);
                                            ktVar6.f79540c = true;
                                            ktVar6.f79541d = zE3;
                                            ktVar6.f79548k = zE4;
                                            ktVar6.f79542e = iA9;
                                            ktVar6.f79543f = zE5;
                                            ktVar6.f79544g = iA10;
                                            ktVar6.f79545h = iA11;
                                            ktVar6.f79546i = iA12;
                                            int i23 = iA13 + 1;
                                            if (ktVar6.f79547j != i23) {
                                                ktVar6.f79547j = i23;
                                                while (true) {
                                                    if ((zE4 && ktVar6.f79538a.size() >= ktVar6.f79547j) || ktVar6.f79538a.size() >= 15) {
                                                        ktVar6.f79538a.remove(0);
                                                    }
                                                }
                                            }
                                            if (iA14 != 0 && ktVar6.f79550m != iA14) {
                                                ktVar6.f79550m = iA14;
                                                int i24 = iA14 - 1;
                                                int i25 = kt.C[i24];
                                                boolean z12 = kt.B[i24];
                                                int i26 = kt.f79537z[i24];
                                                int i27 = kt.A[i24];
                                                int i28 = kt.f79536y[i24];
                                                ktVar6.f79552o = i25;
                                                ktVar6.f79549l = i28;
                                            }
                                            if (iA15 != 0 && ktVar6.f79551n != iA15) {
                                                ktVar6.f79551n = iA15;
                                                int i29 = iA15 - 1;
                                                int i30 = kt.E[i29];
                                                int i31 = kt.D[i29];
                                                ktVar6.a(false, false);
                                                ktVar6.a(kt.f79534w, kt.F[i29]);
                                            }
                                            if (this.f80385p != i22) {
                                                this.f80385p = i22;
                                                this.f80381l = this.f80380k[i22];
                                            }
                                            z10 = true;
                                            i12 = 3;
                                            break;
                                    }
                                    c10 = 6;
                                    z11 = z10;
                                } else {
                                    z10 = true;
                                    if (iA3 <= 255) {
                                        this.f80381l.a((char) (iA3 & 255));
                                    } else {
                                        kf1.a("Invalid base command: ", iA3, "Cea708Decoder");
                                        i13 = 7;
                                        i10 = 2;
                                    }
                                }
                                i13 = 7;
                                i10 = 2;
                                c10 = 6;
                                z11 = z10;
                            } else if (iA3 == 127) {
                                this.f80381l.a((char) 9835);
                            } else {
                                this.f80381l.a((char) (iA3 & 255));
                            }
                            i10 = i11;
                            z10 = true;
                            c10 = 6;
                            z11 = z10;
                        }
                        c10 = 6;
                    } else {
                        z10 = true;
                        int iA16 = this.f80377h.a(8);
                        if (iA16 <= 31) {
                            i13 = 7;
                            if (iA16 > 7) {
                                if (iA16 <= 15) {
                                    this.f80377h.c(8);
                                } else if (iA16 <= 23) {
                                    this.f80377h.c(16);
                                } else if (iA16 <= 31) {
                                    this.f80377h.c(24);
                                }
                            }
                        } else {
                            i13 = 7;
                            if (iA16 <= 127) {
                                if (iA16 == 32) {
                                    this.f80381l.a(' ');
                                } else if (iA16 == 33) {
                                    this.f80381l.a((char) 160);
                                } else if (iA16 == 37) {
                                    this.f80381l.a((char) 8230);
                                } else if (iA16 == 42) {
                                    this.f80381l.a((char) 352);
                                } else if (iA16 == 44) {
                                    this.f80381l.a((char) 338);
                                } else if (iA16 == 63) {
                                    this.f80381l.a((char) 376);
                                } else if (iA16 == 57) {
                                    this.f80381l.a((char) 8482);
                                } else if (iA16 == 58) {
                                    this.f80381l.a((char) 353);
                                } else if (iA16 == 60) {
                                    this.f80381l.a((char) 339);
                                } else if (iA16 != 61) {
                                    switch (iA16) {
                                        case 48:
                                            this.f80381l.a((char) 9608);
                                            break;
                                        case 49:
                                            this.f80381l.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f80381l.a((char) 8217);
                                            break;
                                        case 51:
                                            this.f80381l.a((char) 8220);
                                            break;
                                        case 52:
                                            this.f80381l.a((char) 8221);
                                            break;
                                        case 53:
                                            this.f80381l.a((char) 8226);
                                            break;
                                        default:
                                            switch (iA16) {
                                                case 118:
                                                    this.f80381l.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f80381l.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f80381l.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f80381l.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f80381l.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f80381l.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f80381l.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f80381l.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f80381l.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f80381l.a((char) 9484);
                                                    break;
                                                default:
                                                    kf1.a("Invalid G2 character: ", iA16, "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f80381l.a((char) 8480);
                                }
                                i10 = 2;
                                c10 = 6;
                            } else if (iA16 > 159) {
                                i10 = 2;
                                c10 = 6;
                                if (iA16 > 255) {
                                    kf1.a("Invalid extended command: ", iA16, "Cea708Decoder");
                                } else if (iA16 == 160) {
                                    this.f80381l.a((char) 13252);
                                } else {
                                    kf1.a("Invalid G3 character: ", iA16, "Cea708Decoder");
                                    this.f80381l.a('_');
                                }
                            } else if (iA16 <= 135) {
                                this.f80377h.c(32);
                            } else if (iA16 <= 143) {
                                this.f80377h.c(40);
                            } else if (iA16 <= 159) {
                                i10 = 2;
                                this.f80377h.c(2);
                                c10 = 6;
                                this.f80377h.c(this.f80377h.a(6) * 8);
                            }
                            z11 = z10;
                        }
                        i10 = 2;
                        c10 = 6;
                    }
                    i11 = i10;
                }
            }
        }
        if (z11) {
            this.f80382m = h();
        }
        this.f80384o = null;
    }

    @Override // yads.pt
    public final void a(nt ntVar) {
        ByteBuffer byteBuffer = ntVar.f82568d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        jb2 jb2Var = this.f80376g;
        int iLimit = byteBuffer.limit();
        jb2Var.f78966a = bArrArray;
        jb2Var.f78968c = iLimit;
        jb2Var.f78967b = 0;
        while (true) {
            jb2 jb2Var2 = this.f80376g;
            if (jb2Var2.f78968c - jb2Var2.f78967b < 3) {
                return;
            }
            int iM = jb2Var2.m();
            int i10 = iM & 3;
            boolean z10 = (iM & 4) == 4;
            byte bM = (byte) this.f80376g.m();
            byte bM2 = (byte) this.f80376g.m();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        g();
                        int i11 = (bM & 192) >> 6;
                        int i12 = this.f80378i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            for (int i13 = 0; i13 < 8; i13++) {
                                this.f80380k[i13].b();
                            }
                            ih1.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f80378i + " current=" + i11);
                        }
                        this.f80378i = i11;
                        int i14 = bM & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        lt ltVar = new lt(i11, i14);
                        this.f80384o = ltVar;
                        byte[] bArr = ltVar.f79905c;
                        ltVar.f79906d = 1;
                        bArr[0] = bM2;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalArgumentException();
                        }
                        lt ltVar2 = this.f80384o;
                        if (ltVar2 == null) {
                            ih1.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = ltVar2.f79905c;
                            int i15 = ltVar2.f79906d;
                            bArr2[i15] = bM;
                            ltVar2.f79906d = i15 + 2;
                            bArr2[i15 + 1] = bM2;
                        }
                    }
                    lt ltVar3 = this.f80384o;
                    if (ltVar3.f79906d == (ltVar3.f79904b * 2) - 1) {
                        g();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.pt
    public final qt c() {
        List list = this.f80382m;
        this.f80383n = list;
        list.getClass();
        return new qt(list);
    }

    @Override // yads.pt
    public final boolean f() {
        return this.f80382m != this.f80383n;
    }

    public final List h() {
        jt jtVar;
        Layout.Alignment alignment;
        float f10;
        float f11;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            kt ktVar = this.f80380k[i10];
            if (ktVar.f79540c && (!ktVar.f79538a.isEmpty() || ktVar.f79539b.length() != 0)) {
                kt ktVar2 = this.f80380k[i10];
                if (ktVar2.f79541d) {
                    if (!ktVar2.f79540c || (ktVar2.f79538a.isEmpty() && ktVar2.f79539b.length() == 0)) {
                        jtVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i11 = 0; i11 < ktVar2.f79538a.size(); i11++) {
                            spannableStringBuilder.append((CharSequence) ktVar2.f79538a.get(i11));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) ktVar2.a());
                        int i12 = ktVar2.f79549l;
                        if (i12 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i12 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + ktVar2.f79549l);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        if (ktVar2.f79543f) {
                            f10 = ktVar2.f79545h / 99.0f;
                            f11 = ktVar2.f79544g / 99.0f;
                        } else {
                            f10 = ktVar2.f79545h / 209.0f;
                            f11 = ktVar2.f79544g / 74.0f;
                        }
                        float f12 = (f10 * 0.9f) + 0.05f;
                        float f13 = (f11 * 0.9f) + 0.05f;
                        int i13 = ktVar2.f79546i;
                        int i14 = i13 / 3;
                        int i15 = i13 % 3;
                        jtVar = new jt(spannableStringBuilder, alignment, f13, i14 == 0 ? 0 : i14 == 1 ? 1 : 2, f12, i15 == 0 ? 0 : i15 == 1 ? 1 : 2, ktVar2.f79552o != kt.f79535x, ktVar2.f79552o, ktVar2.f79542e);
                    }
                    jt jtVar2 = jtVar;
                    if (jtVar2 != null) {
                        arrayList.add(jtVar2);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, jt.f79167c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            arrayList2.add(((jt) arrayList.get(i16)).f79168a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public mt(int i10, List list) {
        this.f80379j = i10 == -1 ? 1 : i10;
        if (list != null) {
            jx.a(list);
        }
        this.f80380k = new kt[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f80380k[i11] = new kt();
        }
        this.f80381l = this.f80380k[0];
    }

    @Override // yads.pt, yads.oa0
    public final void flush() {
        super.flush();
        this.f80382m = null;
        this.f80383n = null;
        this.f80385p = 0;
        this.f80381l = this.f80380k[0];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f80380k[i10].b();
        }
        this.f80384o = null;
    }
}
