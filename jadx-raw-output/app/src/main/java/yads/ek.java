package yads;

import android.util.Pair;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f77101a = ib3.c("OpusHead");

    public static zj a(int i10, jb2 jb2Var) {
        jb2Var.e(i10 + 12);
        jb2Var.e(jb2Var.f78967b + 1);
        a(jb2Var);
        jb2Var.e(jb2Var.f78967b + 2);
        int iM = jb2Var.m();
        if ((iM & 128) != 0) {
            jb2Var.e(jb2Var.f78967b + 2);
        }
        if ((iM & 64) != 0) {
            jb2Var.e(jb2Var.f78967b + jb2Var.m());
        }
        if ((iM & 32) != 0) {
            jb2Var.e(jb2Var.f78967b + 2);
        }
        jb2Var.e(jb2Var.f78967b + 1);
        a(jb2Var);
        String strA = ht1.a(jb2Var.m());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return new zj(strA, null, -1L, -1L);
        }
        jb2Var.e(jb2Var.f78967b + 4);
        long jN = jb2Var.n();
        long jN2 = jb2Var.n();
        jb2Var.e(jb2Var.f78967b + 1);
        int iA = a(jb2Var);
        byte[] bArr = new byte[iA];
        jb2Var.a(bArr, 0, iA);
        if (jN2 <= 0) {
            jN2 = -1;
        }
        return new zj(strA, bArr, jN2, jN > 0 ? jN : -1L);
    }

    public static int a(jb2 jb2Var) {
        int iM = jb2Var.m();
        int i10 = iM & 127;
        while ((iM & 128) == 128) {
            iM = jb2Var.m();
            i10 = (i10 << 7) | (iM & 127);
        }
        return i10;
    }

    public static Pair a(int i10, int i11, jb2 jb2Var) throws ob2 {
        f73 f73Var;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = jb2Var.f78967b;
        while (i14 - i10 < i11) {
            jb2Var.e(i14);
            int iB = jb2Var.b();
            qq0.a("childAtomSize must be positive", iB > 0);
            if (jb2Var.b() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String strA = null;
                Integer numValueOf = null;
                while (i15 - i14 < iB) {
                    jb2Var.e(i15);
                    int iB2 = jb2Var.b();
                    int iB3 = jb2Var.b();
                    if (iB3 == 1718775137) {
                        numValueOf = Integer.valueOf(jb2Var.b());
                    } else if (iB3 == 1935894637) {
                        jb2Var.e(jb2Var.f78967b + 4);
                        strA = jb2Var.a(4, bu.f75964c);
                    } else if (iB3 == 1935894633) {
                        i17 = i15;
                        i16 = iB2;
                    }
                    i15 += iB2;
                }
                if ("cenc".equals(strA) || "cbc1".equals(strA) || "cens".equals(strA) || "cbcs".equals(strA)) {
                    qq0.a("frma atom is mandatory", numValueOf != null);
                    qq0.a("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            f73Var = null;
                            break;
                        }
                        jb2Var.e(i18);
                        int iB4 = jb2Var.b();
                        if (jb2Var.b() == 1952804451) {
                            int iB5 = (jb2Var.b() >> 24) & 255;
                            jb2Var.e(jb2Var.f78967b + 1);
                            if (iB5 == 0) {
                                jb2Var.e(jb2Var.f78967b + 1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iM = jb2Var.m();
                                int i19 = (iM & 240) >> 4;
                                i12 = iM & 15;
                                i13 = i19;
                            }
                            boolean z10 = jb2Var.m() == 1;
                            int iM2 = jb2Var.m();
                            byte[] bArr2 = new byte[16];
                            jb2Var.a(bArr2, 0, 16);
                            if (z10 && iM2 == 0) {
                                int iM3 = jb2Var.m();
                                byte[] bArr3 = new byte[iM3];
                                jb2Var.a(bArr3, 0, iM3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            f73Var = new f73(z10, strA, iM2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i18 += iB4;
                    }
                    qq0.a("tenc atom is mandatory", f73Var != null);
                    int i20 = ib3.f78556a;
                    pairCreate = Pair.create(numValueOf, f73Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iB;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:232:0x037d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0388  */
    /* JADX WARN: Code duplicated, block: B:235:0x038a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0399  */
    /* JADX WARN: Code duplicated, block: B:239:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:241:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:249:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:251:0x041f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0426  */
    /* JADX WARN: Code duplicated, block: B:255:0x0454  */
    /* JADX WARN: Code duplicated, block: B:266:0x0480  */
    /* JADX WARN: Code duplicated, block: B:268:0x049c  */
    /* JADX WARN: Code duplicated, block: B:270:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:272:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:273:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:275:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:277:0x04e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:281:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:283:0x0503  */
    /* JADX WARN: Code duplicated, block: B:284:0x0521  */
    /* JADX WARN: Code duplicated, block: B:286:0x0526  */
    /* JADX WARN: Code duplicated, block: B:287:0x053f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0544  */
    /* JADX WARN: Code duplicated, block: B:290:0x0572  */
    /* JADX WARN: Code duplicated, block: B:292:0x0578  */
    /* JADX WARN: Code duplicated, block: B:293:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:295:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:297:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:299:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:300:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:304:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:306:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:307:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:311:0x05fb A[LOOP:2: B:302:0x05de->B:311:0x05fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:314:0x0601  */
    /* JADX WARN: Code duplicated, block: B:316:0x060b  */
    /* JADX WARN: Code duplicated, block: B:318:0x0613  */
    /* JADX WARN: Code duplicated, block: B:319:0x0627  */
    /* JADX WARN: Code duplicated, block: B:322:0x0636  */
    /* JADX WARN: Code duplicated, block: B:331:0x0679  */
    /* JADX WARN: Code duplicated, block: B:544:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x05d1 A[EDGE_INSN: B:552:0x05d1->B:296:0x05d1 BREAK  A[LOOP:2: B:302:0x05de->B:311:0x05fb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x05fd A[SYNTHETIC] */
    public static bk a(jb2 jb2Var, int i10, int i11, String str, kk0 kk0Var, boolean z10) throws ob2 {
        int i12;
        int i13;
        int i14;
        kk0 kk0Var2;
        String str2;
        int i15;
        float f10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        List list;
        String str3;
        String str4;
        int iR;
        int iR2;
        int iB;
        int iRound;
        kk0 kk0Var3;
        String str5;
        String str6;
        int i22;
        String str7;
        int i23;
        String str8;
        List listA;
        zj zjVar;
        String str9;
        List list2;
        int i24;
        lx0 lx0Var;
        int iB2;
        boolean z11;
        int iB3;
        int i25;
        int i26;
        List listA2;
        int i27;
        boolean z12;
        int iB4;
        boolean z13;
        zj zjVarA;
        String str10;
        byte[] bArr;
        char c10;
        int i28;
        int iM;
        int i29;
        String str11;
        int iM2;
        int i30;
        String str12;
        sm2 sm2VarA;
        jb2Var.e(12);
        int iB5 = jb2Var.b();
        bk bkVar = new bk(iB5);
        int i31 = 0;
        while (i31 < iB5) {
            int i32 = jb2Var.f78967b;
            int iB6 = jb2Var.b();
            String str13 = "childAtomSize must be positive";
            qq0.a("childAtomSize must be positive", iB6 > 0);
            int iB7 = jb2Var.b();
            if (iB7 == 1635148593 || iB7 == 1635148595 || iB7 == 1701733238 || iB7 == 1831958048 || iB7 == 1836070006 || iB7 == 1752589105 || iB7 == 1751479857 || iB7 == 1932670515 || iB7 == 1211250227 || iB7 == 1987063864 || iB7 == 1987063865 || iB7 == 1635135537 || iB7 == 1685479798 || iB7 == 1685479729 || iB7 == 1685481573 || iB7 == 1685481521) {
                i12 = iB5;
                i31 = i31;
                jb2Var.e(i32 + 16);
                jb2Var.e(jb2Var.f78967b + 16);
                int iR3 = jb2Var.r();
                int iR4 = jb2Var.r();
                jb2Var.e(jb2Var.f78967b + 50);
                int i33 = jb2Var.f78967b;
                if (iB7 == 1701733238) {
                    Pair pairA = a(i14, i13, jb2Var);
                    if (pairA != null) {
                        iB7 = ((Integer) pairA.first).intValue();
                        if (kk0Var == null) {
                            i13 = iB6;
                            i14 = i32;
                            kk0Var2 = null;
                        } else {
                            String str14 = ((f73) pairA.second).f77321b;
                            if (ib3.a(kk0Var.f79437d, str14)) {
                                i13 = iB6;
                                i14 = i32;
                                kk0Var2 = kk0Var;
                            } else {
                                i13 = iB6;
                                i14 = i32;
                                kk0Var2 = new kk0(str14, false, kk0Var.f79435b);
                            }
                        }
                        bkVar.f75849a[i31] = (f73) pairA.second;
                    } else {
                        i13 = iB6;
                        i14 = i32;
                        kk0Var2 = kk0Var;
                    }
                    jb2Var.e(i33);
                } else {
                    i13 = iB6;
                    i14 = i32;
                    kk0Var2 = kk0Var;
                }
                if (iB7 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iB7 == 1211250227 ? "video/3gpp" : null;
                }
                int i34 = i33;
                String str15 = str2;
                kk0 kk0Var4 = kk0Var2;
                float fP = 1.0f;
                String str16 = null;
                int i35 = -1;
                byte[] bArrCopyOfRange = null;
                ByteBuffer byteBufferOrder = null;
                zj zjVar2 = null;
                int i36 = -1;
                boolean z14 = false;
                int i37 = -1;
                int i38 = -1;
                List listA3 = null;
                while (true) {
                    if (i34 - i14 >= i13) {
                        i15 = i35;
                        bArrCopyOfRange = bArrCopyOfRange;
                        break;
                    }
                    jb2Var.e(i34);
                    int i39 = jb2Var.f78967b;
                    i15 = i35;
                    int iB8 = jb2Var.b();
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (iB8 == 0 && jb2Var.f78967b - i14 == i13) {
                        break;
                    }
                    qq0.a(str13, iB8 > 0);
                    int iB9 = jb2Var.b();
                    String str17 = str13;
                    if (iB9 == 1635148611) {
                        qq0.a(null, str15 == null);
                        jb2Var.e(i39 + 8);
                        ul ulVarA = ul.a(jb2Var);
                        list = ulVarA.f83526a;
                        bkVar.f75851c = ulVarA.f83527b;
                        if (!z14) {
                            fP = ulVarA.f83530e;
                        }
                        str3 = ulVarA.f83531f;
                        str4 = "video/avc";
                    } else {
                        if (iB9 == 1752589123) {
                            qq0.a(null, str15 == null);
                            jb2Var.e(i39 + 8);
                            w01 w01VarA = w01.a(jb2Var);
                            list = w01VarA.f84063a;
                            bkVar.f75851c = w01VarA.f84064b;
                            if (!z14) {
                                fP = w01VarA.f84065c;
                            }
                            str3 = w01VarA.f84066d;
                            str4 = "video/hevc";
                        } else {
                            if (iB9 == 1685480259 || iB9 == 1685485123) {
                                iR4 = iR4;
                                bkVar = bkVar;
                                fP = fP;
                                i16 = i14;
                                i17 = i13;
                                i18 = iB7;
                                dj0 dj0VarA = dj0.a(jb2Var);
                                if (dj0VarA != null) {
                                    str16 = dj0VarA.f76686a;
                                    str15 = "video/dolby-vision";
                                }
                            } else {
                                if (iB9 == 1987076931) {
                                    qq0.a(null, str15 == null);
                                    str15 = iB7 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                } else if (iB9 == 1635135811) {
                                    qq0.a(null, str15 == null);
                                    str15 = "video/av01";
                                } else if (iB9 == 1668050025) {
                                    if (byteBufferOrder == null) {
                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    byteBufferOrder.position(21);
                                    byteBufferOrder.putShort(jb2Var.k());
                                    byteBufferOrder.putShort(jb2Var.k());
                                } else {
                                    if (iB9 == 1835295606) {
                                        if (byteBufferOrder == null) {
                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        short sK = jb2Var.k();
                                        short sK2 = jb2Var.k();
                                        short sK3 = jb2Var.k();
                                        i18 = iB7;
                                        short sK4 = jb2Var.k();
                                        i16 = i14;
                                        short sK5 = jb2Var.k();
                                        i17 = i13;
                                        short sK6 = jb2Var.k();
                                        bkVar = bkVar;
                                        short sK7 = jb2Var.k();
                                        fP = fP;
                                        short sK8 = jb2Var.k();
                                        long jN = jb2Var.n();
                                        long jN2 = jb2Var.n();
                                        iR4 = iR4;
                                        byteBufferOrder.position(1);
                                        byteBufferOrder.putShort(sK5);
                                        byteBufferOrder.putShort(sK6);
                                        byteBufferOrder.putShort(sK);
                                        byteBufferOrder.putShort(sK2);
                                        byteBufferOrder.putShort(sK3);
                                        byteBufferOrder.putShort(sK4);
                                        byteBufferOrder.putShort(sK7);
                                        byteBufferOrder.putShort(sK8);
                                        byteBufferOrder.putShort((short) (jN / 10000));
                                        byteBufferOrder.putShort((short) (jN2 / 10000));
                                    } else {
                                        iR4 = iR4;
                                        bkVar = bkVar;
                                        fP = fP;
                                        i16 = i14;
                                        i17 = i13;
                                        i18 = iB7;
                                        if (iB9 == 1681012275) {
                                            qq0.a(null, str15 == null);
                                            str15 = "video/3gpp";
                                        } else if (iB9 == 1702061171) {
                                            qq0.a(null, str15 == null);
                                            zj zjVarA2 = a(i39, jb2Var);
                                            String str18 = zjVarA2.f85438a;
                                            byte[] bArr2 = zjVarA2.f85439b;
                                            zjVar2 = zjVarA2;
                                            str15 = str18;
                                            listA3 = bArr2 != null ? p51.a(bArr2) : listA3;
                                            bArrCopyOfRange = bArrCopyOfRange;
                                        } else if (iB9 == 1885434736) {
                                            jb2Var.e(i39 + 8);
                                            fP = jb2Var.p() / jb2Var.p();
                                            bArrCopyOfRange = bArrCopyOfRange;
                                            z14 = true;
                                        } else if (iB9 == 1937126244) {
                                            int i40 = i39 + 8;
                                            while (true) {
                                                if (i40 - i39 >= iB8) {
                                                    bArrCopyOfRange = null;
                                                    break;
                                                }
                                                jb2Var.e(i40);
                                                int iB10 = jb2Var.b();
                                                if (jb2Var.b() == 1886547818) {
                                                    bArrCopyOfRange = Arrays.copyOfRange(jb2Var.f78966a, i40, iB10 + i40);
                                                    break;
                                                }
                                                i40 += iB10;
                                            }
                                        } else if (iB9 == 1936995172) {
                                            int iM3 = jb2Var.m();
                                            jb2Var.e(jb2Var.f78967b + 3);
                                            if (iM3 == 0) {
                                                int iM4 = jb2Var.m();
                                                if (iM4 == 0) {
                                                    i15 = 0;
                                                } else if (iM4 == 1) {
                                                    bArrCopyOfRange = bArrCopyOfRange;
                                                    fP = fP;
                                                    i15 = 1;
                                                } else if (iM4 == 2) {
                                                    bArrCopyOfRange = bArrCopyOfRange;
                                                    fP = fP;
                                                    i15 = 2;
                                                } else if (iM4 == 3) {
                                                    i15 = 3;
                                                }
                                                bArrCopyOfRange = bArrCopyOfRange;
                                            }
                                        } else if (iB9 == 1668246642) {
                                            int iB11 = jb2Var.b();
                                            if (iB11 != 1852009592 && iB11 != 1852009571) {
                                                ih1.d("AtomParsers", "Unsupported color type: " + xj.a(iB11));
                                            } else {
                                                int iR5 = jb2Var.r();
                                                int iR6 = jb2Var.r();
                                                jb2Var.e(jb2Var.f78967b + 2);
                                                boolean z15 = iB8 == 19 && (jb2Var.m() & 128) != 0;
                                                wq wqVar = mx.f80412g;
                                                int i41 = 7;
                                                if (iR5 == 1) {
                                                    i19 = 1;
                                                } else if (iR5 != 9) {
                                                    i19 = (iR5 == 4 || iR5 == 5 || iR5 == 6 || iR5 == 7) ? 2 : -1;
                                                } else {
                                                    i19 = 6;
                                                }
                                                if (z15) {
                                                    i21 = 1;
                                                    i20 = 1;
                                                } else {
                                                    i20 = 2;
                                                    i21 = 1;
                                                }
                                                if (iR6 != i21) {
                                                    if (iR6 == 16) {
                                                        i41 = 6;
                                                    } else if (iR6 != 18) {
                                                        if (iR6 != 6 && iR6 != 7) {
                                                            i41 = -1;
                                                        }
                                                    }
                                                    i36 = i19;
                                                    i38 = i41;
                                                    i37 = i20;
                                                }
                                                i41 = 3;
                                                i36 = i19;
                                                i38 = i41;
                                                i37 = i20;
                                            }
                                        }
                                    }
                                    fP = fP;
                                }
                                i16 = i14;
                                i17 = i13;
                                i18 = iB7;
                            }
                            bArrCopyOfRange = bArrCopyOfRange;
                            fP = fP;
                        }
                        i34 += iB8;
                        i35 = i15;
                        str13 = str17;
                        iB7 = i18;
                        i14 = i16;
                        i13 = i17;
                        bkVar = bkVar;
                        iR4 = iR4;
                    }
                    iR4 = iR4;
                    bkVar = bkVar;
                    listA3 = list;
                    i16 = i14;
                    i17 = i13;
                    i18 = iB7;
                    bArrCopyOfRange = bArrCopyOfRange;
                    String str19 = str4;
                    str16 = str3;
                    str15 = str19;
                    i34 += iB8;
                    i35 = i15;
                    str13 = str17;
                    iB7 = i18;
                    i14 = i16;
                    i13 = i17;
                    bkVar = bkVar;
                    iR4 = iR4;
                }
                if (str15 == null) {
                    bkVar = bkVar;
                } else {
                    lx0 lx0Var2 = new lx0();
                    lx0Var2.f79957a = Integer.toString(i10);
                    lx0Var2.f79967k = str15;
                    lx0Var2.f79964h = str16;
                    lx0Var2.f79972p = iR3;
                    lx0Var2.f79973q = iR4;
                    lx0Var2.f79976t = f10;
                    lx0Var2.f79975s = i11;
                    lx0Var2.f79977u = bArrCopyOfRange;
                    lx0Var2.f79978v = i15;
                    lx0Var2.f79969m = listA3;
                    lx0Var2.f79970n = kk0Var4;
                    int i42 = i36;
                    int i43 = i37;
                    int i44 = i38;
                    if (i42 != -1 || i43 != -1 || i44 != -1 || byteBufferOrder != null) {
                        f10 = fP;
                        lx0Var2.f79979w = new mx(i42, i43, i44, byteBufferOrder != null ? byteBufferOrder.array() : null);
                    }
                    if (zjVar2 != null) {
                        zj zjVar3 = zjVar2;
                        lx0Var2.f79962f = td1.b(zjVar3.f85440c);
                        lx0Var2.f79963g = td1.b(zjVar3.f85441d);
                    }
                    mx0 mx0Var = new mx0(lx0Var2);
                    bkVar = bkVar;
                    bkVar.f75850b = mx0Var;
                }
            } else {
                if (iB7 == 1836069985 || iB7 == 1701733217 || iB7 == 1633889587 || iB7 == 1700998451 || iB7 == 1633889588 || iB7 == 1835823201 || iB7 == 1685353315 || iB7 == 1685353317 || iB7 == 1685353320 || iB7 == 1685353324 || iB7 == 1685353336 || iB7 == 1935764850 || iB7 == 1935767394 || iB7 == 1819304813 || iB7 == 1936684916 || iB7 == 1953984371 || iB7 == 778924082 || iB7 == 778924083 || iB7 == 1835557169 || iB7 == 1835560241 || iB7 == 1634492771 || iB7 == 1634492791 || iB7 == 1970037111 || iB7 == 1332770163 || iB7 == 1716281667) {
                    jb2Var.e(i32 + 16);
                    if (z10) {
                        iR = jb2Var.r();
                        jb2Var.e(jb2Var.f78967b + 6);
                    } else {
                        jb2Var.e(jb2Var.f78967b + 8);
                        iR = 0;
                    }
                    if (iR == 0 || iR == 1) {
                        iR2 = jb2Var.r();
                        jb2Var.e(jb2Var.f78967b + 6);
                        byte[] bArr3 = jb2Var.f78966a;
                        int i45 = jb2Var.f78967b;
                        int i46 = ((bArr3[i45] & 255) << 8) | (bArr3[i45 + 1] & 255);
                        jb2Var.f78967b = i45 + 4;
                        jb2Var.e(i45);
                        iB = jb2Var.b();
                        if (iR == 1) {
                            jb2Var.e(jb2Var.f78967b + 16);
                        }
                        iRound = i46;
                    } else if (iR == 2) {
                        jb2Var.e(jb2Var.f78967b + 16);
                        iRound = (int) Math.round(Double.longBitsToDouble(jb2Var.i()));
                        iR2 = jb2Var.p();
                        jb2Var.e(jb2Var.f78967b + 20);
                        iB = 0;
                    }
                    int i47 = jb2Var.f78967b;
                    if (iB7 == 1701733217) {
                        Pair pairA2 = a(i32, iB6, jb2Var);
                        if (pairA2 != null) {
                            int iIntValue = ((Integer) pairA2.first).intValue();
                            if (kk0Var == 0) {
                                i12 = iB5;
                                kk0Var3 = null;
                            } else {
                                String str20 = ((f73) pairA2.second).f77321b;
                                i12 = iB5;
                                kk0Var3 = ib3.a(kk0Var.f79437d, str20) ? kk0Var : new kk0(str20, false, kk0Var.f79435b);
                            }
                            bkVar.f75849a[i31] = (f73) pairA2.second;
                            iB7 = iIntValue;
                        } else {
                            i12 = iB5;
                            iRound = iRound;
                            kk0Var3 = kk0Var;
                        }
                        jb2Var.e(i47);
                    } else {
                        i12 = iB5;
                        iRound = iRound;
                        kk0Var3 = kk0Var;
                    }
                    if (iB7 == 1633889587) {
                        str5 = "audio/ac3";
                    } else if (iB7 == 1700998451) {
                        str5 = "audio/eac3";
                    } else if (iB7 == 1633889588) {
                        str5 = "audio/ac4";
                    } else if (iB7 == 1685353315) {
                        str5 = "audio/vnd.dts";
                    } else if (iB7 == 1685353320 || iB7 == 1685353324) {
                        str5 = "audio/vnd.dts.hd";
                    } else if (iB7 == 1685353317) {
                        str5 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (iB7 == 1685353336) {
                        str5 = "audio/vnd.dts.uhd;profile=p2";
                    } else if (iB7 == 1935764850) {
                        str5 = "audio/3gpp";
                    } else if (iB7 == 1935767394) {
                        str5 = "audio/amr-wb";
                    } else {
                        if (iB7 == 1819304813 || iB7 == 1936684916) {
                            str6 = "audio/raw";
                            i22 = 2;
                        } else if (iB7 == 1953984371) {
                            i22 = 268435456;
                            str6 = "audio/raw";
                        } else if (iB7 == 778924082 || iB7 == 778924083) {
                            str5 = "audio/mpeg";
                        } else if (iB7 == 1835557169) {
                            str5 = "audio/mha1";
                        } else if (iB7 == 1835560241) {
                            str5 = "audio/mhm1";
                        } else if (iB7 == 1634492771) {
                            str5 = "audio/alac";
                        } else if (iB7 == 1634492791) {
                            str5 = "audio/g711-alaw";
                        } else if (iB7 == 1970037111) {
                            str5 = "audio/g711-mlaw";
                        } else if (iB7 == 1332770163) {
                            str5 = "audio/opus";
                        } else if (iB7 == 1716281667) {
                            str5 = "audio/flac";
                        } else if (iB7 == 1835823201) {
                            str5 = "audio/true-hd";
                        } else {
                            i22 = -1;
                            str6 = null;
                        }
                        str7 = str6;
                        i23 = iRound;
                        str8 = null;
                        listA = null;
                        zjVar = null;
                        while (i47 - i32 < iB6) {
                            jb2Var.e(i47);
                            iB2 = jb2Var.b();
                            int i48 = iB6;
                            if (iB2 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            qq0.a("childAtomSize must be positive", z11);
                            iB3 = jb2Var.b();
                            int i49 = i32;
                            if (iB3 == 1835557187) {
                                int i50 = iB2 - 13;
                                byte[] bArr4 = new byte[i50];
                                jb2Var.e(i47 + 13);
                                jb2Var.a(bArr4, 0, i50);
                                i25 = i22;
                                listA = p51.a(bArr4);
                            } else {
                                i25 = i22;
                                if (iB3 == 1702061171) {
                                    i26 = 1702061171;
                                } else if (z10 || iB3 != 2002876005) {
                                    if (iB3 == 1684103987) {
                                        jb2Var.e(i47 + 8);
                                        String string = Integer.toString(i10);
                                        int i51 = h0.f77992b[(jb2Var.m() & 192) >> 6];
                                        iM2 = jb2Var.m();
                                        i30 = h0.f77994d[(iM2 & 56) >> 3];
                                        if ((iM2 & 4) != 0) {
                                            i30++;
                                        }
                                        int i52 = i30;
                                        listA = listA;
                                        lx0 lx0Var3 = new lx0();
                                        lx0Var3.f79957a = string;
                                        lx0Var3.f79967k = "audio/ac3";
                                        lx0Var3.f79980x = i52;
                                        lx0Var3.f79981y = i51;
                                        lx0Var3.f79970n = kk0Var3;
                                        lx0Var3.f79959c = str;
                                        bkVar.f75850b = new mx0(lx0Var3);
                                        str8 = str8;
                                    } else {
                                        listA = listA;
                                        if (iB3 == 1684366131) {
                                            jb2Var.e(i47 + 8);
                                            String string2 = Integer.toString(i10);
                                            jb2Var.e(jb2Var.f78967b + 2);
                                            int i53 = h0.f77992b[(jb2Var.m() & 192) >> 6];
                                            iM = jb2Var.m();
                                            i29 = h0.f77994d[(iM & 14) >> 1];
                                            if ((iM & 1) != 0) {
                                                i29++;
                                            }
                                            if (((jb2Var.m() & 30) >> 1) > 0 && (jb2Var.m() & 2) != 0) {
                                                i29 += 2;
                                            }
                                            str8 = str8;
                                            if (jb2Var.f78968c - jb2Var.f78967b > 0 || (jb2Var.m() & 1) == 0) {
                                                str11 = "audio/eac3";
                                            } else {
                                                str11 = "audio/eac3-joc";
                                            }
                                            lx0 lx0Var4 = new lx0();
                                            lx0Var4.f79957a = string2;
                                            lx0Var4.f79967k = str11;
                                            lx0Var4.f79980x = i29;
                                            lx0Var4.f79981y = i53;
                                            lx0Var4.f79970n = kk0Var3;
                                            lx0Var4.f79959c = str;
                                            bkVar.f75850b = new mx0(lx0Var4);
                                        } else {
                                            str8 = str8;
                                            if (iB3 == 1684103988) {
                                                jb2Var.e(i47 + 8);
                                                String string3 = Integer.toString(i10);
                                                jb2Var.e(jb2Var.f78967b + 1);
                                                if (((jb2Var.m() & 32) >> 5) == 1) {
                                                    i28 = 48000;
                                                } else {
                                                    i28 = 44100;
                                                }
                                                lx0 lx0Var5 = new lx0();
                                                lx0Var5.f79957a = string3;
                                                lx0Var5.f79967k = "audio/ac4";
                                                lx0Var5.f79980x = 2;
                                                lx0Var5.f79981y = i28;
                                                lx0Var5.f79970n = kk0Var3;
                                                lx0Var5.f79959c = str;
                                                bkVar.f75850b = new mx0(lx0Var5);
                                            } else if (iB3 == 1684892784) {
                                                if (iB > 0) {
                                                    throw new ob2(mg2.a("Invalid sample rate for Dolby TrueHD MLP stream: ", iB), null, true, 1);
                                                }
                                                i23 = iB;
                                                listA = listA;
                                                str8 = str8;
                                                iR2 = 2;
                                            } else if (iB3 == 1684305011) {
                                                lx0 lx0Var6 = new lx0();
                                                lx0Var6.f79957a = Integer.toString(i10);
                                                lx0Var6.f79967k = str7;
                                                lx0Var6.f79980x = iR2;
                                                lx0Var6.f79981y = i23;
                                                lx0Var6.f79970n = kk0Var3;
                                                lx0Var6.f79959c = str;
                                                bkVar.f75850b = new mx0(lx0Var6);
                                            } else {
                                                if (iB3 == 1682927731) {
                                                    int i54 = iB2 - 8;
                                                    byte[] bArr5 = f77101a;
                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + i54);
                                                    jb2Var.e(i47 + 8);
                                                    jb2Var.a(bArrCopyOf, bArr5.length, i54);
                                                    listA2 = ra2.a(bArrCopyOf);
                                                } else {
                                                    if (iB3 == 1684425825) {
                                                        byte[] bArr6 = new byte[iB2 - 8];
                                                        bArr6[0] = 102;
                                                        bArr6[1] = 76;
                                                        bArr6[2] = 97;
                                                        bArr6[3] = 67;
                                                        jb2Var.e(i47 + 12);
                                                        jb2Var.a(bArr6, 4, iB2 - 12);
                                                        listA2 = p51.a(bArr6);
                                                    } else if (iB3 == 1634492771) {
                                                        int i55 = iB2 - 12;
                                                        byte[] bArr7 = new byte[i55];
                                                        jb2Var.e(i47 + 12);
                                                        jb2Var.a(bArr7, 0, i55);
                                                        jb2 jb2Var2 = new jb2(bArr7);
                                                        jb2Var2.e(9);
                                                        int iM5 = jb2Var2.m();
                                                        jb2Var2.e(20);
                                                        Pair pairCreate = Pair.create(Integer.valueOf(jb2Var2.p()), Integer.valueOf(iM5));
                                                        int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                                        iR2 = ((Integer) pairCreate.second).intValue();
                                                        i23 = iIntValue2;
                                                        listA = p51.a(bArr7);
                                                    }
                                                    str8 = str8;
                                                }
                                                listA = listA2;
                                                str8 = str8;
                                            }
                                        }
                                    }
                                    listA = listA;
                                    str8 = str8;
                                } else {
                                    i26 = 1702061171;
                                }
                                if (iB3 == i26) {
                                    i27 = jb2Var.f78967b;
                                    if (i27 >= i47) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    qq0.a(null, z12);
                                    while (true) {
                                        if (i27 - i47 < iB2) {
                                            i27 = -1;
                                            break;
                                        }
                                        jb2Var.e(i27);
                                        iB4 = jb2Var.b();
                                        if (iB4 > 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        qq0.a("childAtomSize must be positive", z13);
                                        if (jb2Var.b() == 1702061171) {
                                            break;
                                        }
                                        i27 += iB4;
                                    }
                                } else {
                                    i27 = i47;
                                }
                                if (i27 != -1) {
                                    zjVarA = a(i27, jb2Var);
                                    str10 = zjVarA.f85438a;
                                    bArr = zjVarA.f85439b;
                                    if (bArr != null) {
                                        if ("audio/mp4a-latm".equals(str10)) {
                                            c10 = 0;
                                            a aVarA = b.a(new ib2(bArr.length, bArr), false);
                                            i23 = aVarA.f75341a;
                                            iR2 = aVarA.f75342b;
                                            str8 = aVarA.f75343c;
                                        } else {
                                            c10 = 0;
                                        }
                                        Object[] objArr = new Object[1];
                                        objArr[c10] = bArr;
                                        listA2 = p51.a(objArr);
                                        zjVar = zjVarA;
                                        str7 = str10;
                                        listA = listA2;
                                        str8 = str8;
                                    } else {
                                        zjVar = zjVarA;
                                        str7 = str10;
                                    }
                                }
                                listA = listA;
                                str8 = str8;
                            }
                            i47 += iB2;
                            iB6 = i48;
                            i32 = i49;
                            i22 = i25;
                        }
                        str9 = str8;
                        list2 = listA;
                        int i56 = i32;
                        int i57 = iB6;
                        i24 = i22;
                        if (bkVar.f75850b == null && str7 != null) {
                            lx0Var = new lx0();
                            lx0Var.f79957a = Integer.toString(i10);
                            lx0Var.f79967k = str7;
                            lx0Var.f79964h = str9;
                            lx0Var.f79980x = iR2;
                            lx0Var.f79981y = i23;
                            lx0Var.f79982z = i24;
                            lx0Var.f79969m = list2;
                            lx0Var.f79970n = kk0Var3;
                            lx0Var.f79959c = str;
                            if (zjVar != null) {
                                zj zjVar4 = zjVar;
                                lx0Var.f79962f = td1.b(zjVar4.f85440c);
                                lx0Var.f79963g = td1.b(zjVar4.f85441d);
                            }
                            bkVar.f75850b = new mx0(lx0Var);
                        }
                        i13 = i57;
                        i14 = i56;
                    }
                    str6 = str5;
                    i22 = -1;
                    str7 = str6;
                    i23 = iRound;
                    str8 = null;
                    listA = null;
                    zjVar = null;
                    while (i47 - i32 < iB6) {
                        jb2Var.e(i47);
                        iB2 = jb2Var.b();
                        int i410 = iB6;
                        if (iB2 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        qq0.a("childAtomSize must be positive", z11);
                        iB3 = jb2Var.b();
                        int i411 = i32;
                        if (iB3 == 1835557187) {
                            int i58 = iB2 - 13;
                            byte[] bArr8 = new byte[i58];
                            jb2Var.e(i47 + 13);
                            jb2Var.a(bArr8, 0, i58);
                            i25 = i22;
                            listA = p51.a(bArr8);
                        } else {
                            i25 = i22;
                            if (iB3 == 1702061171) {
                                if (z10) {
                                }
                                if (iB3 == 1684103987) {
                                    jb2Var.e(i47 + 8);
                                    String string4 = Integer.toString(i10);
                                    int i59 = h0.f77992b[(jb2Var.m() & 192) >> 6];
                                    iM2 = jb2Var.m();
                                    i30 = h0.f77994d[(iM2 & 56) >> 3];
                                    if ((iM2 & 4) != 0) {
                                        i30++;
                                    }
                                    int i510 = i30;
                                    listA = listA;
                                    lx0 lx0Var7 = new lx0();
                                    lx0Var7.f79957a = string4;
                                    lx0Var7.f79967k = "audio/ac3";
                                    lx0Var7.f79980x = i510;
                                    lx0Var7.f79981y = i59;
                                    lx0Var7.f79970n = kk0Var3;
                                    lx0Var7.f79959c = str;
                                    bkVar.f75850b = new mx0(lx0Var7);
                                    str8 = str8;
                                } else {
                                    listA = listA;
                                    if (iB3 == 1684366131) {
                                        jb2Var.e(i47 + 8);
                                        String string5 = Integer.toString(i10);
                                        jb2Var.e(jb2Var.f78967b + 2);
                                        int i511 = h0.f77992b[(jb2Var.m() & 192) >> 6];
                                        iM = jb2Var.m();
                                        i29 = h0.f77994d[(iM & 14) >> 1];
                                        if ((iM & 1) != 0) {
                                            i29++;
                                        }
                                        if (((jb2Var.m() & 30) >> 1) > 0) {
                                            i29 += 2;
                                        }
                                        str8 = str8;
                                        if (jb2Var.f78968c - jb2Var.f78967b > 0) {
                                            str11 = "audio/eac3";
                                        } else {
                                            str11 = "audio/eac3";
                                        }
                                        lx0 lx0Var8 = new lx0();
                                        lx0Var8.f79957a = string5;
                                        lx0Var8.f79967k = str11;
                                        lx0Var8.f79980x = i29;
                                        lx0Var8.f79981y = i511;
                                        lx0Var8.f79970n = kk0Var3;
                                        lx0Var8.f79959c = str;
                                        bkVar.f75850b = new mx0(lx0Var8);
                                    } else {
                                        str8 = str8;
                                        if (iB3 == 1684103988) {
                                            jb2Var.e(i47 + 8);
                                            String string6 = Integer.toString(i10);
                                            jb2Var.e(jb2Var.f78967b + 1);
                                            if (((jb2Var.m() & 32) >> 5) == 1) {
                                                i28 = 48000;
                                            } else {
                                                i28 = 44100;
                                            }
                                            lx0 lx0Var9 = new lx0();
                                            lx0Var9.f79957a = string6;
                                            lx0Var9.f79967k = "audio/ac4";
                                            lx0Var9.f79980x = 2;
                                            lx0Var9.f79981y = i28;
                                            lx0Var9.f79970n = kk0Var3;
                                            lx0Var9.f79959c = str;
                                            bkVar.f75850b = new mx0(lx0Var9);
                                        } else if (iB3 == 1684892784) {
                                            if (iB > 0) {
                                                throw new ob2(mg2.a("Invalid sample rate for Dolby TrueHD MLP stream: ", iB), null, true, 1);
                                            }
                                            i23 = iB;
                                            listA = listA;
                                            str8 = str8;
                                            iR2 = 2;
                                        } else if (iB3 == 1684305011) {
                                            lx0 lx0Var10 = new lx0();
                                            lx0Var10.f79957a = Integer.toString(i10);
                                            lx0Var10.f79967k = str7;
                                            lx0Var10.f79980x = iR2;
                                            lx0Var10.f79981y = i23;
                                            lx0Var10.f79970n = kk0Var3;
                                            lx0Var10.f79959c = str;
                                            bkVar.f75850b = new mx0(lx0Var10);
                                        } else {
                                            if (iB3 == 1682927731) {
                                                int i512 = iB2 - 8;
                                                byte[] bArr9 = f77101a;
                                                byte[] bArrCopyOf2 = Arrays.copyOf(bArr9, bArr9.length + i512);
                                                jb2Var.e(i47 + 8);
                                                jb2Var.a(bArrCopyOf2, bArr9.length, i512);
                                                listA2 = ra2.a(bArrCopyOf2);
                                            } else {
                                                if (iB3 == 1684425825) {
                                                    byte[] bArr10 = new byte[iB2 - 8];
                                                    bArr10[0] = 102;
                                                    bArr10[1] = 76;
                                                    bArr10[2] = 97;
                                                    bArr10[3] = 67;
                                                    jb2Var.e(i47 + 12);
                                                    jb2Var.a(bArr10, 4, iB2 - 12);
                                                    listA2 = p51.a(bArr10);
                                                } else if (iB3 == 1634492771) {
                                                    int i513 = iB2 - 12;
                                                    byte[] bArr11 = new byte[i513];
                                                    jb2Var.e(i47 + 12);
                                                    jb2Var.a(bArr11, 0, i513);
                                                    jb2 jb2Var3 = new jb2(bArr11);
                                                    jb2Var3.e(9);
                                                    int iM6 = jb2Var3.m();
                                                    jb2Var3.e(20);
                                                    Pair pairCreate2 = Pair.create(Integer.valueOf(jb2Var3.p()), Integer.valueOf(iM6));
                                                    int iIntValue3 = ((Integer) pairCreate2.first).intValue();
                                                    iR2 = ((Integer) pairCreate2.second).intValue();
                                                    i23 = iIntValue3;
                                                    listA = p51.a(bArr11);
                                                }
                                                str8 = str8;
                                            }
                                            listA = listA2;
                                            str8 = str8;
                                        }
                                    }
                                }
                                listA = listA;
                                str8 = str8;
                            } else {
                                i26 = 1702061171;
                            }
                            if (iB3 == i26) {
                                i27 = jb2Var.f78967b;
                                if (i27 >= i47) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                qq0.a(null, z12);
                                while (true) {
                                    if (i27 - i47 < iB2) {
                                        i27 = -1;
                                        break;
                                    }
                                    jb2Var.e(i27);
                                    iB4 = jb2Var.b();
                                    if (iB4 > 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    qq0.a("childAtomSize must be positive", z13);
                                    if (jb2Var.b() == 1702061171) {
                                        break;
                                        break;
                                    }
                                    i27 += iB4;
                                }
                            } else {
                                i27 = i47;
                            }
                            if (i27 != -1) {
                                zjVarA = a(i27, jb2Var);
                                str10 = zjVarA.f85438a;
                                bArr = zjVarA.f85439b;
                                if (bArr != null) {
                                    if ("audio/mp4a-latm".equals(str10)) {
                                        c10 = 0;
                                        a aVarA2 = b.a(new ib2(bArr.length, bArr), false);
                                        i23 = aVarA2.f75341a;
                                        iR2 = aVarA2.f75342b;
                                        str8 = aVarA2.f75343c;
                                    } else {
                                        c10 = 0;
                                    }
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c10] = bArr;
                                    listA2 = p51.a(objArr2);
                                    zjVar = zjVarA;
                                    str7 = str10;
                                    listA = listA2;
                                    str8 = str8;
                                } else {
                                    zjVar = zjVarA;
                                    str7 = str10;
                                }
                            }
                            listA = listA;
                            str8 = str8;
                        }
                        i47 += iB2;
                        iB6 = i410;
                        i32 = i411;
                        i22 = i25;
                    }
                    str9 = str8;
                    list2 = listA;
                    int i514 = i32;
                    int i515 = iB6;
                    i24 = i22;
                    if (bkVar.f75850b == null) {
                        lx0Var = new lx0();
                        lx0Var.f79957a = Integer.toString(i10);
                        lx0Var.f79967k = str7;
                        lx0Var.f79964h = str9;
                        lx0Var.f79980x = iR2;
                        lx0Var.f79981y = i23;
                        lx0Var.f79982z = i24;
                        lx0Var.f79969m = list2;
                        lx0Var.f79970n = kk0Var3;
                        lx0Var.f79959c = str;
                        if (zjVar != null) {
                            zj zjVar5 = zjVar;
                            lx0Var.f79962f = td1.b(zjVar5.f85440c);
                            lx0Var.f79963g = td1.b(zjVar5.f85441d);
                        }
                        bkVar.f75850b = new mx0(lx0Var);
                    }
                    i13 = i515;
                    i14 = i514;
                } else if (iB7 == 1414810956 || iB7 == 1954034535 || iB7 == 2004251764 || iB7 == 1937010800 || iB7 == 1664495672) {
                    jb2Var.e(i32 + 16);
                    long j10 = Long.MAX_VALUE;
                    if (iB7 == 1414810956) {
                        str12 = "application/ttml+xml";
                    } else {
                        if (iB7 == 1954034535) {
                            int i60 = iB6 - 16;
                            byte[] bArr12 = new byte[i60];
                            jb2Var.a(bArr12, 0, i60);
                            sm2VarA = p51.a(bArr12);
                            str12 = "application/x-quicktime-tx3g";
                        } else if (iB7 == 2004251764) {
                            str12 = "application/x-mp4-vtt";
                        } else if (iB7 == 1937010800) {
                            j10 = 0;
                            str12 = "application/ttml+xml";
                        } else if (iB7 == 1664495672) {
                            bkVar.f75852d = 1;
                            str12 = "application/x-mp4-cea-608";
                        } else {
                            throw new IllegalStateException();
                        }
                        lx0 lx0Var11 = new lx0();
                        lx0Var11.f79957a = Integer.toString(i10);
                        lx0Var11.f79967k = str12;
                        lx0Var11.f79959c = str;
                        lx0Var11.f79971o = j10;
                        lx0Var11.f79969m = sm2VarA;
                        bkVar.f75850b = new mx0(lx0Var11);
                    }
                    sm2VarA = null;
                    lx0 lx0Var12 = new lx0();
                    lx0Var12.f79957a = Integer.toString(i10);
                    lx0Var12.f79967k = str12;
                    lx0Var12.f79959c = str;
                    lx0Var12.f79971o = j10;
                    lx0Var12.f79969m = sm2VarA;
                    bkVar.f75850b = new mx0(lx0Var12);
                } else if (iB7 == 1835365492) {
                    jb2Var.e(i32 + 16);
                    if (iB7 == 1835365492) {
                        jb2Var.j();
                        String strJ = jb2Var.j();
                        if (strJ != null) {
                            lx0 lx0Var13 = new lx0();
                            lx0Var13.f79957a = Integer.toString(i10);
                            lx0Var13.f79967k = strJ;
                            bkVar.f75850b = new mx0(lx0Var13);
                        }
                    }
                } else if (iB7 == 1667329389) {
                    lx0 lx0Var14 = new lx0();
                    lx0Var14.f79957a = Integer.toString(i10);
                    lx0Var14.f79967k = "application/x-camera-motion";
                    bkVar.f75850b = new mx0(lx0Var14);
                }
                i12 = iB5;
                i14 = i32;
                i13 = iB6;
            }
            jb2Var.e(i14 + i13);
            i31++;
            bkVar = bkVar;
            iB5 = i12;
        }
        return bkVar;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:126:0x031d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0325  */
    /* JADX WARN: Code duplicated, block: B:129:0x032e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0339  */
    /* JADX WARN: Code duplicated, block: B:134:0x0354  */
    /* JADX WARN: Code duplicated, block: B:136:0x035d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0369  */
    /* JADX WARN: Code duplicated, block: B:140:0x038d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0390  */
    /* JADX WARN: Code duplicated, block: B:144:0x039a  */
    /* JADX WARN: Code duplicated, block: B:145:0x039d  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:151:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:153:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0404  */
    /* JADX WARN: Code duplicated, block: B:171:0x0407  */
    /* JADX WARN: Code duplicated, block: B:174:0x0413 A[LOOP:1: B:172:0x040d->B:174:0x0413, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x0426 A[LOOP:2: B:176:0x0424->B:177:0x0426, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x0442  */
    /* JADX WARN: Code duplicated, block: B:182:0x0456 A[LOOP:4: B:181:0x0454->B:182:0x0456, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:188:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:190:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:192:0x04d5 A[LOOP:11: B:189:0x04cd->B:192:0x04d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x050e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:197:0x0510 A[ADDED_TO_REGION, LOOP:12: B:197:0x0510->B:199:0x0514, LOOP_START, PHI: r16 r43 r44
  0x0510: PHI (r16v11 int) = (r16v3 int), (r16v12 int) binds: [B:196:0x050e, B:199:0x0514] A[DONT_GENERATE, DONT_INLINE]
  0x0510: PHI (r43v4 int) = (r43v1 int), (r43v5 int) binds: [B:196:0x050e, B:199:0x0514] A[DONT_GENERATE, DONT_INLINE]
  0x0510: PHI (r44v3 int) = (r44v1 int), (r44v5 int) binds: [B:196:0x050e, B:199:0x0514] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x052f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0531  */
    /* JADX WARN: Code duplicated, block: B:207:0x0539  */
    /* JADX WARN: Code duplicated, block: B:208:0x053b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0540  */
    /* JADX WARN: Code duplicated, block: B:213:0x0547  */
    /* JADX WARN: Code duplicated, block: B:216:0x0556 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x0582 A[DONT_INVERT, LOOP:13: B:222:0x0582->B:226:0x058c, LOOP_START, PHI: r16
  0x0582: PHI (r16v8 int) = (r16v3 int), (r16v9 int) binds: [B:221:0x0580, B:226:0x058c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:223:0x0584  */
    /* JADX WARN: Code duplicated, block: B:226:0x058c A[LOOP:13: B:222:0x0582->B:226:0x058c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x0592 A[EDGE_INSN: B:227:0x0592->B:228:0x0593 BREAK  A[LOOP:13: B:222:0x0582->B:226:0x058c]] */
    /* JADX WARN: Code duplicated, block: B:229:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:240:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:241:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:246:0x0609  */
    /* JADX WARN: Code duplicated, block: B:247:0x061c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0620  */
    /* JADX WARN: Code duplicated, block: B:271:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:274:0x06df  */
    /* JADX WARN: Code duplicated, block: B:276:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:279:0x06f1 A[LOOP:5: B:277:0x06ee->B:279:0x06f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x0720  */
    /* JADX WARN: Code duplicated, block: B:284:0x0726  */
    /* JADX WARN: Code duplicated, block: B:285:0x0728  */
    /* JADX WARN: Code duplicated, block: B:289:0x073d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0746  */
    /* JADX WARN: Code duplicated, block: B:294:0x076e  */
    /* JADX WARN: Code duplicated, block: B:299:0x077f  */
    /* JADX WARN: Code duplicated, block: B:300:0x0781  */
    /* JADX WARN: Code duplicated, block: B:302:0x0789  */
    /* JADX WARN: Code duplicated, block: B:306:0x079c  */
    /* JADX WARN: Code duplicated, block: B:307:0x079f  */
    /* JADX WARN: Code duplicated, block: B:310:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:311:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:313:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:314:0x07af  */
    /* JADX WARN: Code duplicated, block: B:316:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:318:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:319:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:323:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:325:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:326:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:329:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:331:0x0822  */
    /* JADX WARN: Code duplicated, block: B:345:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0798 A[EDGE_INSN: B:354:0x0798->B:304:0x0798 BREAK  A[LOOP:6: B:287:0x0738->B:303:0x078f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0779 A[ADDED_TO_REGION, EDGE_INSN: B:357:0x0779->B:297:0x0779 BREAK  A[LOOP:7: B:292:0x0768->B:296:0x0773], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0828 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0576 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0564 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x04ea A[EDGE_INSN: B:370:0x04ea->B:193:0x04ea BREAK  A[LOOP:11: B:189:0x04cd->B:192:0x04d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x058a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0592 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList a(vj vjVar, zy0 zy0Var, long j10, kk0 kk0Var, boolean z10, boolean z11, wy0 wy0Var) {
        int i10;
        long jN;
        int i11;
        long[] jArr;
        long[] jArr2;
        e73 e73Var;
        int i12;
        vj vjVarB;
        Pair pairCreate;
        e73 e73Var2;
        vj vjVarB2;
        wj wjVarC;
        wj wjVarC2;
        ak dkVar;
        int iB;
        wj wjVarC3;
        boolean z12;
        wj wjVarC4;
        jb2 jb2Var;
        wj wjVarC5;
        jb2 jb2Var2;
        yj yjVar;
        int iP;
        int iP2;
        int iP3;
        int iP4;
        int iP5;
        int iP6;
        int iA;
        boolean z13;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int iP7;
        int i13;
        int i14;
        int i15;
        long j11;
        long j12;
        int i16;
        int iB2;
        int iP8;
        int iB3;
        int i17;
        int iP9;
        int i18;
        int i19;
        long j13;
        boolean z14;
        int i20;
        e73 e73Var3;
        String str;
        int[] iArr;
        long[] jArr3;
        long[] jArr4;
        int[] iArr2;
        int i21;
        boolean zA;
        int i22;
        int i23;
        jb2 jb2Var3;
        int iC;
        int i24;
        int i25;
        long jA;
        long[] jArr5;
        long j14;
        long[] jArr6;
        int i26;
        boolean z15;
        int[] iArr3;
        int[] iArr4;
        long[] jArr7;
        int i27;
        int i28;
        int i29;
        long[] jArr8;
        int[] iArr5;
        int i30;
        int i31;
        long[] jArr9;
        int[] iArr6;
        int[] iArr7;
        long[] jArr10;
        int i32;
        int i33;
        int i34;
        long j15;
        n73 n73Var;
        long j16;
        int i35;
        int i36;
        int[] iArr8;
        long j17;
        int i37;
        int i38;
        int i39;
        int i40;
        long j18;
        int i41;
        int i42;
        long[] jArr11;
        int[] iArr9;
        long j19;
        int i43;
        int i44;
        int i45;
        long[] jArr12;
        int[] iArr10;
        int[] iArr11;
        int i46;
        int i47;
        int i48;
        long j20;
        int iMax;
        int i49;
        int i50;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i51 = 0;
        while (i51 < vjVar.f83939d.size()) {
            vj vjVar2 = (vj) vjVar.f83939d.get(i51);
            if (vjVar2.f84603a != 1953653099) {
                arrayList = arrayList2;
                i51 = i51;
            } else {
                wj wjVarC6 = vjVar.c(1836476516);
                wjVarC6.getClass();
                vj vjVarB3 = vjVar2.b(1835297121);
                vjVarB3.getClass();
                wj wjVarC7 = vjVarB3.c(1751411826);
                wjVarC7.getClass();
                jb2 jb2Var4 = wjVarC7.f84218b;
                jb2Var4.e(16);
                int iB4 = jb2Var4.b();
                if (iB4 == 1936684398) {
                    i10 = 1;
                } else if (iB4 == 1986618469) {
                    i10 = 2;
                } else if (iB4 == 1952807028 || iB4 == 1935832172 || iB4 == 1937072756 || iB4 == 1668047728) {
                    i10 = 3;
                } else {
                    i10 = iB4 == 1835365473 ? 5 : -1;
                }
                String str2 = "";
                if (i10 == -1) {
                    arrayList2 = arrayList2;
                    i51 = i51;
                    str2 = "";
                } else {
                    wj wjVarC8 = vjVar2.c(1953196132);
                    wjVarC8.getClass();
                    jb2 jb2Var5 = wjVarC8.f84218b;
                    jb2Var5.e(8);
                    int iB5 = (jb2Var5.b() >> 24) & 255;
                    jb2Var5.e(jb2Var5.f78967b + (iB5 == 0 ? 8 : 16));
                    int iB6 = jb2Var5.b();
                    jb2Var5.e(jb2Var5.f78967b + 4);
                    int i52 = jb2Var5.f78967b;
                    int i53 = iB5 == 0 ? 4 : 8;
                    int i54 = 0;
                    while (true) {
                        if (i54 < i53) {
                            if (jb2Var5.f78966a[i52 + i54] != -1) {
                                jN = iB5 == 0 ? jb2Var5.n() : jb2Var5.q();
                                if (jN != 0) {
                                    break;
                                }
                                break;
                            }
                            i54++;
                        } else {
                            jb2Var5.e(jb2Var5.f78967b + i53);
                        }
                        jN = -9223372036854775807L;
                        break;
                    }
                    jb2Var5.e(jb2Var5.f78967b + 16);
                    int iB7 = jb2Var5.b();
                    int iB8 = jb2Var5.b();
                    jb2Var5.e(jb2Var5.f78967b + 4);
                    int iB9 = jb2Var5.b();
                    int iB10 = jb2Var5.b();
                    long j21 = jN;
                    if (iB7 == 0 && iB8 == 65536 && iB9 == -65536 && iB10 == 0) {
                        i11 = 90;
                    } else if (iB7 == 0 && iB8 == -65536 && iB9 == 65536 && iB10 == 0) {
                        i11 = 270;
                    } else {
                        i11 = (iB7 == -65536 && iB8 == 0 && iB9 == 0 && iB10 == -65536) ? BaseTransientBottomBar.ANIMATION_FADE_DURATION : 0;
                    }
                    long j22 = j10 == -9223372036854775807L ? j21 : j10;
                    jb2 jb2Var6 = wjVarC6.f84218b;
                    jb2Var6.e(8);
                    jb2Var6.e(jb2Var6.f78967b + (((jb2Var6.b() >> 24) & 255) == 0 ? 8 : 16));
                    long jN2 = jb2Var6.n();
                    long jA2 = j22 == -9223372036854775807L ? -9223372036854775807L : ib3.a(j22, 1000000L, jN2);
                    vj vjVarB4 = vjVarB3.b(1835626086);
                    vjVarB4.getClass();
                    vj vjVarB5 = vjVarB4.b(1937007212);
                    vjVarB5.getClass();
                    wj wjVarC9 = vjVarB3.c(1835296868);
                    wjVarC9.getClass();
                    jb2 jb2Var7 = wjVarC9.f84218b;
                    jb2Var7.e(8);
                    int iB11 = (jb2Var7.b() >> 24) & 255;
                    jb2Var7.e(jb2Var7.f78967b + (iB11 == 0 ? 8 : 16));
                    long jN3 = jb2Var7.n();
                    jb2Var7.e(jb2Var7.f78967b + (iB11 == 0 ? 4 : 8));
                    int iR = jb2Var7.r();
                    Pair pairCreate2 = Pair.create(Long.valueOf(jN3), "" + ((char) (((iR >> 10) & 31) + 96)) + ((char) (((iR >> 5) & 31) + 96)) + ((char) ((iR & 31) + 96)));
                    wj wjVarC10 = vjVarB5.c(1937011556);
                    wjVarC10.getClass();
                    bk bkVarA = a(wjVarC10.f84218b, iB6, i11, (String) pairCreate2.second, kk0Var, z11);
                    if (z10 || (vjVarB = vjVar2.b(1701082227)) == null) {
                        arrayList2 = arrayList2;
                        i51 = i51;
                        str2 = "";
                    } else {
                        wj wjVarC11 = vjVarB.c(1701606260);
                        if (wjVarC11 == null) {
                            pairCreate = null;
                        } else {
                            jb2 jb2Var8 = wjVarC11.f84218b;
                            jb2Var8.e(8);
                            int iB12 = (jb2Var8.b() >> 24) & 255;
                            int iP10 = jb2Var8.p();
                            long[] jArr13 = new long[iP10];
                            long[] jArr14 = new long[iP10];
                            int i55 = 0;
                            while (i55 < iP10) {
                                int i56 = iP10;
                                jArr13[i55] = iB12 == 1 ? jb2Var8.q() : jb2Var8.n();
                                jArr14[i55] = iB12 == 1 ? jb2Var8.i() : jb2Var8.b();
                                if (jb2Var8.k() == 1) {
                                    jb2Var8.e(jb2Var8.f78967b + 2);
                                    i55++;
                                    iP10 = i56;
                                    iB12 = iB12;
                                } else {
                                    throw new IllegalArgumentException("Unsupported media rate.");
                                }
                            }
                            pairCreate = Pair.create(jArr13, jArr14);
                        }
                        if (pairCreate != null) {
                            long[] jArr15 = (long[]) pairCreate.first;
                            jArr2 = (long[]) pairCreate.second;
                            jArr = jArr15;
                        }
                        if (bkVarA.f75850b == null) {
                            i12 = 1937007212;
                            e73Var = new e73(iB6, i10, ((Long) pairCreate2.first).longValue(), jN2, jA2, bkVarA.f75850b, bkVarA.f75852d, bkVarA.f75849a, bkVarA.f75851c, jArr, jArr2);
                        }
                        e73Var2 = (e73) wy0Var.apply(e73Var);
                        if (e73Var2 == null) {
                            arrayList = arrayList2;
                        } else {
                            vj vjVarB6 = vjVar2.b(1835297121);
                            vjVarB6.getClass();
                            vj vjVarB7 = vjVarB6.b(1835626086);
                            vjVarB7.getClass();
                            vjVarB2 = vjVarB7.b(i12);
                            vjVarB2.getClass();
                            wjVarC = vjVarB2.c(1937011578);
                            if (wjVarC != null) {
                                dkVar = new ck(wjVarC, e73Var2.f76964f);
                            } else {
                                wjVarC2 = vjVarB2.c(1937013298);
                                if (wjVarC2 != null) {
                                    dkVar = new dk(wjVarC2);
                                } else {
                                    throw new ob2("Track has no sample table size information", null, true, 1);
                                }
                            }
                            iB = dkVar.b();
                            if (iB == 0) {
                                n73Var = new n73(e73Var2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                            } else {
                                wjVarC3 = vjVarB2.c(1937007471);
                                if (wjVarC3 == null) {
                                    wjVarC3 = vjVarB2.c(1668232756);
                                    wjVarC3.getClass();
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                jb2 jb2Var9 = wjVarC3.f84218b;
                                wj wjVarC12 = vjVarB2.c(1937011555);
                                wjVarC12.getClass();
                                jb2 jb2Var10 = wjVarC12.f84218b;
                                wj wjVarC13 = vjVarB2.c(1937011827);
                                wjVarC13.getClass();
                                jb2 jb2Var11 = wjVarC13.f84218b;
                                wjVarC4 = vjVarB2.c(1937011571);
                                if (wjVarC4 != null) {
                                    jb2Var = wjVarC4.f84218b;
                                } else {
                                    jb2Var = null;
                                }
                                wjVarC5 = vjVarB2.c(1668576371);
                                if (wjVarC5 != null) {
                                    jb2Var2 = wjVarC5.f84218b;
                                } else {
                                    jb2Var2 = null;
                                }
                                yjVar = new yj(jb2Var10, jb2Var9, z12);
                                jb2Var11.e(12);
                                iP = jb2Var11.p() - 1;
                                iP2 = jb2Var11.p();
                                iP3 = jb2Var11.p();
                                if (jb2Var2 != null) {
                                    jb2Var2.e(12);
                                    iP4 = jb2Var2.p();
                                } else {
                                    iP4 = 0;
                                }
                                if (jb2Var != null) {
                                    jb2Var.e(12);
                                    iP5 = jb2Var.p();
                                    if (iP5 > 0) {
                                        iP6 = jb2Var.p() - 1;
                                    } else {
                                        jb2Var = null;
                                    }
                                    iA = dkVar.a();
                                    String str3 = e73Var2.f76964f.f80429m;
                                    if (iA == -1 && (("audio/raw".equals(str3) || "audio/g711-mlaw".equals(str3) || "audio/g711-alaw".equals(str3)) && iP == 0 && iP4 == 0 && iP5 == 0)) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        i42 = yjVar.f85002a;
                                        jArr11 = new long[i42];
                                        iArr9 = new int[i42];
                                        while (yjVar.a()) {
                                            int i57 = yjVar.f85003b;
                                            jArr11[i57] = yjVar.f85005d;
                                            iArr9[i57] = yjVar.f85004c;
                                        }
                                        j19 = iP3;
                                        i43 = 8192 / iA;
                                        i45 = 0;
                                        for (i44 = 0; i44 < i42; i44++) {
                                            int i58 = iArr9[i44];
                                            int i59 = ib3.f78556a;
                                            i45 += ((i58 + i43) - 1) / i43;
                                        }
                                        jArr12 = new long[i45];
                                        iArr10 = new int[i45];
                                        jArr3 = new long[i45];
                                        iArr11 = new int[i45];
                                        i46 = 0;
                                        i47 = 0;
                                        i21 = 0;
                                        i48 = 0;
                                        while (i46 < i42) {
                                            int i60 = iArr9[i46];
                                            j20 = jArr11[i46];
                                            int i61 = i48;
                                            int i62 = i42;
                                            iMax = i21;
                                            i49 = i61;
                                            long[] jArr16 = jArr11;
                                            i50 = i60;
                                            while (i50 > 0) {
                                                int iMin = Math.min(i43, i50);
                                                jArr12[i49] = j20;
                                                int[] iArr12 = iArr9;
                                                int i63 = iA * iMin;
                                                iArr10[i49] = i63;
                                                iMax = Math.max(iMax, i63);
                                                jArr3[i49] = ((long) i47) * j19;
                                                iArr11[i49] = 1;
                                                j20 += (long) iArr10[i49];
                                                i47 += iMin;
                                                i50 -= iMin;
                                                i49++;
                                                i43 = i43;
                                                iArr9 = iArr12;
                                                jArr12 = jArr12;
                                            }
                                            i46++;
                                            jArr11 = jArr16;
                                            iArr9 = iArr9;
                                            int i64 = i49;
                                            i21 = iMax;
                                            i42 = i62;
                                            i48 = i64;
                                        }
                                        iArr = iArr11;
                                        iArr2 = iArr10;
                                        e73Var3 = e73Var2;
                                        jArr4 = jArr12;
                                        j13 = j19 * ((long) i47);
                                    } else {
                                        jArrCopyOf = new long[iB];
                                        iArrCopyOf = new int[iB];
                                        jArrCopyOf2 = new long[iB];
                                        int i65 = iP5;
                                        iArrCopyOf2 = new int[iB];
                                        int i66 = iP;
                                        iP7 = iP6;
                                        i13 = i65;
                                        i14 = 0;
                                        i15 = 0;
                                        j11 = 0;
                                        j12 = 0;
                                        i16 = 0;
                                        iB2 = 0;
                                        iP8 = 0;
                                        iB3 = iP3;
                                        i17 = iP4;
                                        iP9 = iP2;
                                        while (true) {
                                            if (i15 < iB) {
                                                i18 = i14;
                                                i19 = i16;
                                                break;
                                            }
                                            zA = true;
                                            while (i16 == 0) {
                                                zA = yjVar.a();
                                                if (zA) {
                                                    break;
                                                }
                                                int i67 = i14;
                                                long j23 = yjVar.f85005d;
                                                i16 = yjVar.f85004c;
                                                j12 = j23;
                                                jb2Var = jb2Var;
                                                i14 = i67;
                                                iB = iB;
                                            }
                                            i22 = iB;
                                            i23 = i14;
                                            jb2Var3 = jb2Var;
                                            if (!zA) {
                                                ih1.d("AtomParsers", "Unexpected end of chunk data");
                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                                                iB = i15;
                                                i19 = i16;
                                                i18 = i23;
                                                break;
                                            }
                                            if (jb2Var2 != null) {
                                                while (iP8 == 0 && i17 > 0) {
                                                    iP8 = jb2Var2.p();
                                                    iB2 = jb2Var2.b();
                                                    i17--;
                                                }
                                                iP8--;
                                            }
                                            int i68 = iB2;
                                            jArrCopyOf[i15] = j12;
                                            iC = dkVar.c();
                                            iArrCopyOf[i15] = iC;
                                            if (iC > i23) {
                                                i24 = iC;
                                            } else {
                                                i24 = i23;
                                            }
                                            jArrCopyOf2[i15] = j11 + ((long) i68);
                                            if (jb2Var3 == null) {
                                                i25 = 1;
                                            } else {
                                                i25 = 0;
                                            }
                                            iArrCopyOf2[i15] = i25;
                                            if (i15 == iP7) {
                                                iArrCopyOf2[i15] = 1;
                                                i13--;
                                                if (i13 > 0) {
                                                    jb2Var3.getClass();
                                                    iP7 = jb2Var3.p() - 1;
                                                }
                                            }
                                            j11 += (long) iB3;
                                            iP9--;
                                            if (iP9 != 0 && i66 > 0) {
                                                i66--;
                                                iP9 = jb2Var11.p();
                                                iB3 = jb2Var11.b();
                                            }
                                            j12 += (long) iArrCopyOf[i15];
                                            i16--;
                                            i15++;
                                            iB2 = i68;
                                            i14 = i24;
                                            jb2Var = jb2Var3;
                                            iB = i22;
                                        }
                                        j13 = j11 + ((long) iB2);
                                        if (jb2Var2 != null) {
                                            z14 = true;
                                            break;
                                        }
                                        while (true) {
                                            if (i17 > 0) {
                                                z14 = true;
                                                break;
                                            }
                                            if (jb2Var2.p() != 0) {
                                                z14 = false;
                                                break;
                                            }
                                            jb2Var2.b();
                                            i17--;
                                        }
                                        if (i13 != 0 && iP9 == 0 && i19 == 0 && i66 == 0) {
                                            i20 = iP8;
                                            if (i20 == 0 && z14) {
                                                e73Var3 = e73Var2;
                                            }
                                            iArr = iArrCopyOf2;
                                            jArr3 = jArrCopyOf2;
                                            jArr4 = jArrCopyOf;
                                            iArr2 = iArrCopyOf;
                                            i21 = i18;
                                        } else {
                                            i20 = iP8;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                        e73Var3 = e73Var2;
                                        sb2.append(e73Var3.f76959a);
                                        sb2.append(": remainingSynchronizationSamples ");
                                        sb2.append(i13);
                                        sb2.append(", remainingSamplesAtTimestampDelta ");
                                        sb2.append(iP9);
                                        sb2.append(", remainingSamplesInChunk ");
                                        sb2.append(i19);
                                        sb2.append(", remainingTimestampDeltaChanges ");
                                        sb2.append(i66);
                                        sb2.append(", remainingSamplesAtTimestampOffset ");
                                        sb2.append(i20);
                                        if (z14) {
                                            str = str2;
                                        } else {
                                            str = ", ctts invalid";
                                        }
                                        sb2.append(str);
                                        ih1.d("AtomParsers", sb2.toString());
                                        iArr = iArrCopyOf2;
                                        jArr3 = jArrCopyOf2;
                                        jArr4 = jArrCopyOf;
                                        iArr2 = iArrCopyOf;
                                        i21 = i18;
                                    }
                                    jA = ib3.a(j13, 1000000L, e73Var3.f76961c);
                                    jArr5 = e73Var3.f76966h;
                                    if (jArr5 == null) {
                                        ib3.a(jArr3, e73Var3.f76961c);
                                        n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, jA);
                                    } else if (jArr5.length != 1 && e73Var3.f76960b == 1 && jArr3.length >= 2) {
                                        long[] jArr17 = e73Var3.f76967i;
                                        jArr17.getClass();
                                        long j24 = jArr17[0];
                                        long jA3 = j24 + ib3.a(e73Var3.f76966h[0], e73Var3.f76961c, e73Var3.f76962d);
                                        int length = jArr3.length - 1;
                                        int iMax2 = Math.max(0, Math.min(4, length));
                                        int iMax3 = Math.max(0, Math.min(jArr3.length - 4, length));
                                        long j25 = jArr3[0];
                                        if (j25 > j24 || j24 >= jArr3[iMax2] || jArr3[iMax3] >= jA3 || jA3 > j13) {
                                            j14 = 0;
                                        } else {
                                            long jA4 = ib3.a(j24 - j25, e73Var3.f76964f.A, e73Var3.f76961c);
                                            long jA5 = ib3.a(j13 - jA3, e73Var3.f76964f.A, e73Var3.f76961c);
                                            j14 = 0;
                                            if ((jA4 != 0 || jA5 != 0) && jA4 <= 2147483647L && jA5 <= 2147483647L) {
                                                zy0Var.f85653a = (int) jA4;
                                                zy0Var.f85654b = (int) jA5;
                                                ib3.a(jArr3, e73Var3.f76961c);
                                                n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(e73Var3.f76966h[0], 1000000L, e73Var3.f76962d));
                                            }
                                        }
                                        jArr6 = e73Var3.f76966h;
                                        if (jArr6.length == 1) {
                                            i26 = 0;
                                            if (jArr6[0] == j14) {
                                                long[] jArr18 = e73Var3.f76967i;
                                                jArr18.getClass();
                                                j18 = jArr18[0];
                                                for (i41 = 0; i41 < jArr3.length; i41++) {
                                                    jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                                }
                                                n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                            }
                                        } else {
                                            i26 = 0;
                                        }
                                        if (e73Var3.f76960b == 1) {
                                            z15 = 1;
                                        } else {
                                            z15 = i26;
                                        }
                                        iArr3 = new int[jArr6.length];
                                        iArr4 = new int[jArr6.length];
                                        jArr7 = e73Var3.f76967i;
                                        jArr7.getClass();
                                        i27 = i26;
                                        i28 = i27;
                                        i29 = i28;
                                        while (true) {
                                            jArr8 = e73Var3.f76966h;
                                            if (i27 < jArr8.length) {
                                                break;
                                                break;
                                            }
                                            int i69 = iB;
                                            j17 = jArr7[i27];
                                            if (j17 != -1) {
                                                int i70 = i28;
                                                long jA6 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                                i37 = 1;
                                                iArr3[i27] = ib3.b(jArr3, j17, true);
                                                iArr4[i27] = ib3.a(jArr3, j17 + jA6, z15);
                                                while (true) {
                                                    i38 = iArr3[i27];
                                                    i39 = iArr4[i27];
                                                    if (i38 >= i39) {
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i27] = i38 + 1;
                                                    i37 = 1;
                                                }
                                                int i71 = (i39 - i38) + i70;
                                                if (i26 != i38) {
                                                    i40 = 1;
                                                } else {
                                                    i40 = 0;
                                                }
                                                i29 |= i40;
                                                i26 = i39;
                                                i28 = i71;
                                            }
                                            i27++;
                                            iB = i69;
                                            iArr2 = iArr2;
                                        }
                                        iArr5 = iArr2;
                                        if (i28 != iB) {
                                            i30 = 1;
                                        } else {
                                            i30 = 0;
                                        }
                                        i31 = i29 | i30;
                                        if (i31 != 0) {
                                            jArr9 = new long[i28];
                                        } else {
                                            jArr9 = jArr4;
                                        }
                                        if (i31 != 0) {
                                            iArr6 = new int[i28];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i31 != 0) {
                                            i21 = 0;
                                        }
                                        if (i31 != 0) {
                                            iArr7 = new int[i28];
                                        } else {
                                            iArr7 = iArr;
                                        }
                                        jArr10 = new long[i28];
                                        i32 = i21;
                                        i33 = 0;
                                        i34 = 0;
                                        j15 = 0;
                                        while (i33 < e73Var3.f76966h.length) {
                                            j16 = e73Var3.f76967i[i33];
                                            i35 = iArr3[i33];
                                            int[] iArr13 = iArr3;
                                            i36 = iArr4[i33];
                                            if (i31 != 0) {
                                                int i72 = i36 - i35;
                                                System.arraycopy(jArr4, i35, jArr9, i34, i72);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i35, iArr6, i34, i72);
                                                System.arraycopy(iArr, i35, iArr7, i34, i72);
                                            } else {
                                                iArr8 = iArr5;
                                            }
                                            int i73 = i32;
                                            while (i35 < i36) {
                                                long[] jArr19 = jArr9;
                                                int[] iArr14 = iArr7;
                                                long[] jArr20 = jArr3;
                                                long j26 = j15;
                                                int i74 = i36;
                                                int i75 = i33;
                                                jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                                if (i31 == 0) {
                                                }
                                                i34++;
                                                i35++;
                                                i33 = i75;
                                                i36 = i74;
                                                jArr3 = jArr20;
                                                j15 = j26;
                                                jArr9 = jArr19;
                                                iArr7 = iArr14;
                                            }
                                            int i76 = i33;
                                            i32 = i73;
                                            j15 += e73Var3.f76966h[i76];
                                            i33 = i76 + 1;
                                            jArr3 = jArr3;
                                            jArr9 = jArr9;
                                            iArr3 = iArr13;
                                            iArr4 = iArr4;
                                            iArr7 = iArr7;
                                            iArr5 = iArr8;
                                            jArr4 = jArr4;
                                        }
                                        n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                                    } else {
                                        j14 = 0;
                                        jArr6 = e73Var3.f76966h;
                                        if (jArr6.length == 1) {
                                            i26 = 0;
                                            if (jArr6[0] == j14) {
                                                long[] jArr110 = e73Var3.f76967i;
                                                jArr110.getClass();
                                                j18 = jArr110[0];
                                                while (i41 < jArr3.length) {
                                                    jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                                }
                                                n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                            }
                                        } else {
                                            i26 = 0;
                                        }
                                        if (e73Var3.f76960b == 1) {
                                            z15 = 1;
                                        } else {
                                            z15 = i26;
                                        }
                                        iArr3 = new int[jArr6.length];
                                        iArr4 = new int[jArr6.length];
                                        jArr7 = e73Var3.f76967i;
                                        jArr7.getClass();
                                        i27 = i26;
                                        i28 = i27;
                                        i29 = i28;
                                        while (true) {
                                            jArr8 = e73Var3.f76966h;
                                            if (i27 < jArr8.length) {
                                                break;
                                            }
                                            int i610 = iB;
                                            j17 = jArr7[i27];
                                            if (j17 != -1) {
                                                int i77 = i28;
                                                long jA7 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                                i37 = 1;
                                                iArr3[i27] = ib3.b(jArr3, j17, true);
                                                iArr4[i27] = ib3.a(jArr3, j17 + jA7, z15);
                                                while (true) {
                                                    i38 = iArr3[i27];
                                                    i39 = iArr4[i27];
                                                    if (i38 >= i39 || (iArr[i38] & i37) != 0) {
                                                        break;
                                                    }
                                                    iArr3[i27] = i38 + 1;
                                                    i37 = 1;
                                                }
                                                int i78 = (i39 - i38) + i77;
                                                if (i26 != i38) {
                                                    i40 = 1;
                                                } else {
                                                    i40 = 0;
                                                }
                                                i29 |= i40;
                                                i26 = i39;
                                                i28 = i78;
                                            }
                                            i27++;
                                            iB = i610;
                                            iArr2 = iArr2;
                                        }
                                        iArr5 = iArr2;
                                        if (i28 != iB) {
                                            i30 = 1;
                                        } else {
                                            i30 = 0;
                                        }
                                        i31 = i29 | i30;
                                        if (i31 != 0) {
                                            jArr9 = new long[i28];
                                        } else {
                                            jArr9 = jArr4;
                                        }
                                        if (i31 != 0) {
                                            iArr6 = new int[i28];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i31 != 0) {
                                            i21 = 0;
                                        }
                                        if (i31 != 0) {
                                            iArr7 = new int[i28];
                                        } else {
                                            iArr7 = iArr;
                                        }
                                        jArr10 = new long[i28];
                                        i32 = i21;
                                        i33 = 0;
                                        i34 = 0;
                                        j15 = 0;
                                        while (i33 < e73Var3.f76966h.length) {
                                            j16 = e73Var3.f76967i[i33];
                                            i35 = iArr3[i33];
                                            int[] iArr15 = iArr3;
                                            i36 = iArr4[i33];
                                            if (i31 != 0) {
                                                int i79 = i36 - i35;
                                                System.arraycopy(jArr4, i35, jArr9, i34, i79);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i35, iArr6, i34, i79);
                                                System.arraycopy(iArr, i35, iArr7, i34, i79);
                                            } else {
                                                iArr8 = iArr5;
                                            }
                                            int i710 = i32;
                                            while (i35 < i36) {
                                                long[] jArr111 = jArr9;
                                                int[] iArr16 = iArr7;
                                                long[] jArr21 = jArr3;
                                                long j27 = j15;
                                                int i711 = i36;
                                                int i712 = i33;
                                                jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                                if (i31 == 0 && iArr6[i34] > i710) {
                                                    i710 = iArr8[i35];
                                                }
                                                i34++;
                                                i35++;
                                                i33 = i712;
                                                i36 = i711;
                                                jArr3 = jArr21;
                                                j15 = j27;
                                                jArr9 = jArr111;
                                                iArr7 = iArr16;
                                            }
                                            int i713 = i33;
                                            i32 = i710;
                                            j15 += e73Var3.f76966h[i713];
                                            i33 = i713 + 1;
                                            jArr3 = jArr3;
                                            jArr9 = jArr9;
                                            iArr3 = iArr15;
                                            iArr4 = iArr4;
                                            iArr7 = iArr7;
                                            iArr5 = iArr8;
                                            jArr4 = jArr4;
                                        }
                                        n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                                    }
                                } else {
                                    iP5 = 0;
                                }
                                iP6 = -1;
                                iA = dkVar.a();
                                String str4 = e73Var2.f76964f.f80429m;
                                if (iA == -1) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    i42 = yjVar.f85002a;
                                    jArr11 = new long[i42];
                                    iArr9 = new int[i42];
                                    while (yjVar.a()) {
                                        int i510 = yjVar.f85003b;
                                        jArr11[i510] = yjVar.f85005d;
                                        iArr9[i510] = yjVar.f85004c;
                                    }
                                    j19 = iP3;
                                    i43 = 8192 / iA;
                                    i45 = 0;
                                    while (i44 < i42) {
                                        int i511 = iArr9[i44];
                                        int i512 = ib3.f78556a;
                                        i45 += ((i511 + i43) - 1) / i43;
                                    }
                                    jArr12 = new long[i45];
                                    iArr10 = new int[i45];
                                    jArr3 = new long[i45];
                                    iArr11 = new int[i45];
                                    i46 = 0;
                                    i47 = 0;
                                    i21 = 0;
                                    i48 = 0;
                                    while (i46 < i42) {
                                        int i611 = iArr9[i46];
                                        j20 = jArr11[i46];
                                        int i612 = i48;
                                        int i613 = i42;
                                        iMax = i21;
                                        i49 = i612;
                                        long[] jArr112 = jArr11;
                                        i50 = i611;
                                        while (i50 > 0) {
                                            int iMin2 = Math.min(i43, i50);
                                            jArr12[i49] = j20;
                                            int[] iArr17 = iArr9;
                                            int i614 = iA * iMin2;
                                            iArr10[i49] = i614;
                                            iMax = Math.max(iMax, i614);
                                            jArr3[i49] = ((long) i47) * j19;
                                            iArr11[i49] = 1;
                                            j20 += (long) iArr10[i49];
                                            i47 += iMin2;
                                            i50 -= iMin2;
                                            i49++;
                                            i43 = i43;
                                            iArr9 = iArr17;
                                            jArr12 = jArr12;
                                        }
                                        i46++;
                                        jArr11 = jArr112;
                                        iArr9 = iArr9;
                                        int i615 = i49;
                                        i21 = iMax;
                                        i42 = i613;
                                        i48 = i615;
                                    }
                                    iArr = iArr11;
                                    iArr2 = iArr10;
                                    e73Var3 = e73Var2;
                                    jArr4 = jArr12;
                                    j13 = j19 * ((long) i47);
                                } else {
                                    jArrCopyOf = new long[iB];
                                    iArrCopyOf = new int[iB];
                                    jArrCopyOf2 = new long[iB];
                                    int i616 = iP5;
                                    iArrCopyOf2 = new int[iB];
                                    int i617 = iP;
                                    iP7 = iP6;
                                    i13 = i616;
                                    i14 = 0;
                                    i15 = 0;
                                    j11 = 0;
                                    j12 = 0;
                                    i16 = 0;
                                    iB2 = 0;
                                    iP8 = 0;
                                    iB3 = iP3;
                                    i17 = iP4;
                                    iP9 = iP2;
                                    while (true) {
                                        if (i15 < iB) {
                                            i18 = i14;
                                            i19 = i16;
                                            break;
                                        }
                                        zA = true;
                                        while (i16 == 0) {
                                            zA = yjVar.a();
                                            if (zA) {
                                                break;
                                                break;
                                            }
                                            int i618 = i14;
                                            long j28 = yjVar.f85005d;
                                            i16 = yjVar.f85004c;
                                            j12 = j28;
                                            jb2Var = jb2Var;
                                            i14 = i618;
                                            iB = iB;
                                        }
                                        i22 = iB;
                                        i23 = i14;
                                        jb2Var3 = jb2Var;
                                        if (!zA) {
                                            ih1.d("AtomParsers", "Unexpected end of chunk data");
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                                            iB = i15;
                                            i19 = i16;
                                            i18 = i23;
                                            break;
                                        }
                                        if (jb2Var2 != null) {
                                            while (iP8 == 0) {
                                                iP8 = jb2Var2.p();
                                                iB2 = jb2Var2.b();
                                                i17--;
                                            }
                                            iP8--;
                                        }
                                        int i619 = iB2;
                                        jArrCopyOf[i15] = j12;
                                        iC = dkVar.c();
                                        iArrCopyOf[i15] = iC;
                                        if (iC > i23) {
                                            i24 = iC;
                                        } else {
                                            i24 = i23;
                                        }
                                        jArrCopyOf2[i15] = j11 + ((long) i619);
                                        if (jb2Var3 == null) {
                                            i25 = 1;
                                        } else {
                                            i25 = 0;
                                        }
                                        iArrCopyOf2[i15] = i25;
                                        if (i15 == iP7) {
                                            iArrCopyOf2[i15] = 1;
                                            i13--;
                                            if (i13 > 0) {
                                                jb2Var3.getClass();
                                                iP7 = jb2Var3.p() - 1;
                                            }
                                        }
                                        j11 += (long) iB3;
                                        iP9--;
                                        if (iP9 != 0) {
                                        }
                                        j12 += (long) iArrCopyOf[i15];
                                        i16--;
                                        i15++;
                                        iB2 = i619;
                                        i14 = i24;
                                        jb2Var = jb2Var3;
                                        iB = i22;
                                    }
                                    j13 = j11 + ((long) iB2);
                                    if (jb2Var2 != null) {
                                        z14 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i17 > 0) {
                                            z14 = true;
                                            break;
                                        }
                                        if (jb2Var2.p() != 0) {
                                            z14 = false;
                                            break;
                                        }
                                        jb2Var2.b();
                                        i17--;
                                    }
                                    if (i13 != 0) {
                                        i20 = iP8;
                                        StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                        e73Var3 = e73Var2;
                                        sb3.append(e73Var3.f76959a);
                                        sb3.append(": remainingSynchronizationSamples ");
                                        sb3.append(i13);
                                        sb3.append(", remainingSamplesAtTimestampDelta ");
                                        sb3.append(iP9);
                                        sb3.append(", remainingSamplesInChunk ");
                                        sb3.append(i19);
                                        sb3.append(", remainingTimestampDeltaChanges ");
                                        sb3.append(i617);
                                        sb3.append(", remainingSamplesAtTimestampOffset ");
                                        sb3.append(i20);
                                        if (z14) {
                                            str = ", ctts invalid";
                                        } else {
                                            str = str2;
                                        }
                                        sb3.append(str);
                                        ih1.d("AtomParsers", sb3.toString());
                                    } else {
                                        i20 = iP8;
                                        StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                        e73Var3 = e73Var2;
                                        sb4.append(e73Var3.f76959a);
                                        sb4.append(": remainingSynchronizationSamples ");
                                        sb4.append(i13);
                                        sb4.append(", remainingSamplesAtTimestampDelta ");
                                        sb4.append(iP9);
                                        sb4.append(", remainingSamplesInChunk ");
                                        sb4.append(i19);
                                        sb4.append(", remainingTimestampDeltaChanges ");
                                        sb4.append(i617);
                                        sb4.append(", remainingSamplesAtTimestampOffset ");
                                        sb4.append(i20);
                                        if (z14) {
                                            str = ", ctts invalid";
                                        } else {
                                            str = str2;
                                        }
                                        sb4.append(str);
                                        ih1.d("AtomParsers", sb4.toString());
                                    }
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf2;
                                    jArr4 = jArrCopyOf;
                                    iArr2 = iArrCopyOf;
                                    i21 = i18;
                                }
                                jA = ib3.a(j13, 1000000L, e73Var3.f76961c);
                                jArr5 = e73Var3.f76966h;
                                if (jArr5 == null) {
                                    ib3.a(jArr3, e73Var3.f76961c);
                                    n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, jA);
                                } else if (jArr5.length != 1) {
                                    j14 = 0;
                                    jArr6 = e73Var3.f76966h;
                                    if (jArr6.length == 1) {
                                        i26 = 0;
                                        if (jArr6[0] == j14) {
                                            long[] jArr113 = e73Var3.f76967i;
                                            jArr113.getClass();
                                            j18 = jArr113[0];
                                            while (i41 < jArr3.length) {
                                                jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                            }
                                            n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                        }
                                    } else {
                                        i26 = 0;
                                    }
                                    if (e73Var3.f76960b == 1) {
                                        z15 = 1;
                                    } else {
                                        z15 = i26;
                                    }
                                    iArr3 = new int[jArr6.length];
                                    iArr4 = new int[jArr6.length];
                                    jArr7 = e73Var3.f76967i;
                                    jArr7.getClass();
                                    i27 = i26;
                                    i28 = i27;
                                    i29 = i28;
                                    while (true) {
                                        jArr8 = e73Var3.f76966h;
                                        if (i27 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        int i6110 = iB;
                                        j17 = jArr7[i27];
                                        if (j17 != -1) {
                                            int i714 = i28;
                                            long jA8 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                            i37 = 1;
                                            iArr3[i27] = ib3.b(jArr3, j17, true);
                                            iArr4[i27] = ib3.a(jArr3, j17 + jA8, z15);
                                            while (true) {
                                                i38 = iArr3[i27];
                                                i39 = iArr4[i27];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i27] = i38 + 1;
                                                i37 = 1;
                                            }
                                            int i715 = (i39 - i38) + i714;
                                            if (i26 != i38) {
                                                i40 = 1;
                                            } else {
                                                i40 = 0;
                                            }
                                            i29 |= i40;
                                            i26 = i39;
                                            i28 = i715;
                                        }
                                        i27++;
                                        iB = i6110;
                                        iArr2 = iArr2;
                                    }
                                    iArr5 = iArr2;
                                    if (i28 != iB) {
                                        i30 = 1;
                                    } else {
                                        i30 = 0;
                                    }
                                    i31 = i29 | i30;
                                    if (i31 != 0) {
                                        jArr9 = new long[i28];
                                    } else {
                                        jArr9 = jArr4;
                                    }
                                    if (i31 != 0) {
                                        iArr6 = new int[i28];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i31 != 0) {
                                        i21 = 0;
                                    }
                                    if (i31 != 0) {
                                        iArr7 = new int[i28];
                                    } else {
                                        iArr7 = iArr;
                                    }
                                    jArr10 = new long[i28];
                                    i32 = i21;
                                    i33 = 0;
                                    i34 = 0;
                                    j15 = 0;
                                    while (i33 < e73Var3.f76966h.length) {
                                        j16 = e73Var3.f76967i[i33];
                                        i35 = iArr3[i33];
                                        int[] iArr18 = iArr3;
                                        i36 = iArr4[i33];
                                        if (i31 != 0) {
                                            int i716 = i36 - i35;
                                            System.arraycopy(jArr4, i35, jArr9, i34, i716);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i35, iArr6, i34, i716);
                                            System.arraycopy(iArr, i35, iArr7, i34, i716);
                                        } else {
                                            iArr8 = iArr5;
                                        }
                                        int i717 = i32;
                                        while (i35 < i36) {
                                            long[] jArr114 = jArr9;
                                            int[] iArr19 = iArr7;
                                            long[] jArr22 = jArr3;
                                            long j29 = j15;
                                            int i718 = i36;
                                            int i719 = i33;
                                            jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                            if (i31 == 0) {
                                            }
                                            i34++;
                                            i35++;
                                            i33 = i719;
                                            i36 = i718;
                                            jArr3 = jArr22;
                                            j15 = j29;
                                            jArr9 = jArr114;
                                            iArr7 = iArr19;
                                        }
                                        int i7110 = i33;
                                        i32 = i717;
                                        j15 += e73Var3.f76966h[i7110];
                                        i33 = i7110 + 1;
                                        jArr3 = jArr3;
                                        jArr9 = jArr9;
                                        iArr3 = iArr18;
                                        iArr4 = iArr4;
                                        iArr7 = iArr7;
                                        iArr5 = iArr8;
                                        jArr4 = jArr4;
                                    }
                                    n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                                } else {
                                    j14 = 0;
                                    jArr6 = e73Var3.f76966h;
                                    if (jArr6.length == 1) {
                                        i26 = 0;
                                        if (jArr6[0] == j14) {
                                            long[] jArr115 = e73Var3.f76967i;
                                            jArr115.getClass();
                                            j18 = jArr115[0];
                                            while (i41 < jArr3.length) {
                                                jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                            }
                                            n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                        }
                                    } else {
                                        i26 = 0;
                                    }
                                    if (e73Var3.f76960b == 1) {
                                        z15 = 1;
                                    } else {
                                        z15 = i26;
                                    }
                                    iArr3 = new int[jArr6.length];
                                    iArr4 = new int[jArr6.length];
                                    jArr7 = e73Var3.f76967i;
                                    jArr7.getClass();
                                    i27 = i26;
                                    i28 = i27;
                                    i29 = i28;
                                    while (true) {
                                        jArr8 = e73Var3.f76966h;
                                        if (i27 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        int i6111 = iB;
                                        j17 = jArr7[i27];
                                        if (j17 != -1) {
                                            int i7111 = i28;
                                            long jA9 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                            i37 = 1;
                                            iArr3[i27] = ib3.b(jArr3, j17, true);
                                            iArr4[i27] = ib3.a(jArr3, j17 + jA9, z15);
                                            while (true) {
                                                i38 = iArr3[i27];
                                                i39 = iArr4[i27];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i27] = i38 + 1;
                                                i37 = 1;
                                            }
                                            int i7112 = (i39 - i38) + i7111;
                                            if (i26 != i38) {
                                                i40 = 1;
                                            } else {
                                                i40 = 0;
                                            }
                                            i29 |= i40;
                                            i26 = i39;
                                            i28 = i7112;
                                        }
                                        i27++;
                                        iB = i6111;
                                        iArr2 = iArr2;
                                    }
                                    iArr5 = iArr2;
                                    if (i28 != iB) {
                                        i30 = 1;
                                    } else {
                                        i30 = 0;
                                    }
                                    i31 = i29 | i30;
                                    if (i31 != 0) {
                                        jArr9 = new long[i28];
                                    } else {
                                        jArr9 = jArr4;
                                    }
                                    if (i31 != 0) {
                                        iArr6 = new int[i28];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i31 != 0) {
                                        i21 = 0;
                                    }
                                    if (i31 != 0) {
                                        iArr7 = new int[i28];
                                    } else {
                                        iArr7 = iArr;
                                    }
                                    jArr10 = new long[i28];
                                    i32 = i21;
                                    i33 = 0;
                                    i34 = 0;
                                    j15 = 0;
                                    while (i33 < e73Var3.f76966h.length) {
                                        j16 = e73Var3.f76967i[i33];
                                        i35 = iArr3[i33];
                                        int[] iArr110 = iArr3;
                                        i36 = iArr4[i33];
                                        if (i31 != 0) {
                                            int i7113 = i36 - i35;
                                            System.arraycopy(jArr4, i35, jArr9, i34, i7113);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i35, iArr6, i34, i7113);
                                            System.arraycopy(iArr, i35, iArr7, i34, i7113);
                                        } else {
                                            iArr8 = iArr5;
                                        }
                                        int i7114 = i32;
                                        while (i35 < i36) {
                                            long[] jArr116 = jArr9;
                                            int[] iArr111 = iArr7;
                                            long[] jArr23 = jArr3;
                                            long j210 = j15;
                                            int i7115 = i36;
                                            int i7116 = i33;
                                            jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                            if (i31 == 0) {
                                            }
                                            i34++;
                                            i35++;
                                            i33 = i7116;
                                            i36 = i7115;
                                            jArr3 = jArr23;
                                            j15 = j210;
                                            jArr9 = jArr116;
                                            iArr7 = iArr111;
                                        }
                                        int i7117 = i33;
                                        i32 = i7114;
                                        j15 += e73Var3.f76966h[i7117];
                                        i33 = i7117 + 1;
                                        jArr3 = jArr3;
                                        jArr9 = jArr9;
                                        iArr3 = iArr110;
                                        iArr4 = iArr4;
                                        iArr7 = iArr7;
                                        iArr5 = iArr8;
                                        jArr4 = jArr4;
                                    }
                                    n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                                }
                            }
                            arrayList = arrayList2;
                            arrayList.add(n73Var);
                        }
                    }
                    jArr = null;
                    jArr2 = null;
                    if (bkVarA.f75850b == null) {
                        i12 = 1937007212;
                        e73Var = new e73(iB6, i10, ((Long) pairCreate2.first).longValue(), jN2, jA2, bkVarA.f75850b, bkVarA.f75852d, bkVarA.f75849a, bkVarA.f75851c, jArr, jArr2);
                    }
                    e73Var2 = (e73) wy0Var.apply(e73Var);
                    if (e73Var2 == null) {
                        arrayList = arrayList2;
                    } else {
                        vj vjVarB8 = vjVar2.b(1835297121);
                        vjVarB8.getClass();
                        vj vjVarB9 = vjVarB8.b(1835626086);
                        vjVarB9.getClass();
                        vjVarB2 = vjVarB9.b(i12);
                        vjVarB2.getClass();
                        wjVarC = vjVarB2.c(1937011578);
                        if (wjVarC != null) {
                            dkVar = new ck(wjVarC, e73Var2.f76964f);
                        } else {
                            wjVarC2 = vjVarB2.c(1937013298);
                            if (wjVarC2 != null) {
                                dkVar = new dk(wjVarC2);
                            } else {
                                throw new ob2("Track has no sample table size information", null, true, 1);
                            }
                        }
                        iB = dkVar.b();
                        if (iB == 0) {
                            n73Var = new n73(e73Var2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        } else {
                            wjVarC3 = vjVarB2.c(1937007471);
                            if (wjVarC3 == null) {
                                wjVarC3 = vjVarB2.c(1668232756);
                                wjVarC3.getClass();
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            jb2 jb2Var12 = wjVarC3.f84218b;
                            wj wjVarC14 = vjVarB2.c(1937011555);
                            wjVarC14.getClass();
                            jb2 jb2Var13 = wjVarC14.f84218b;
                            wj wjVarC15 = vjVarB2.c(1937011827);
                            wjVarC15.getClass();
                            jb2 jb2Var14 = wjVarC15.f84218b;
                            wjVarC4 = vjVarB2.c(1937011571);
                            if (wjVarC4 != null) {
                                jb2Var = wjVarC4.f84218b;
                            } else {
                                jb2Var = null;
                            }
                            wjVarC5 = vjVarB2.c(1668576371);
                            if (wjVarC5 != null) {
                                jb2Var2 = wjVarC5.f84218b;
                            } else {
                                jb2Var2 = null;
                            }
                            yjVar = new yj(jb2Var13, jb2Var12, z12);
                            jb2Var14.e(12);
                            iP = jb2Var14.p() - 1;
                            iP2 = jb2Var14.p();
                            iP3 = jb2Var14.p();
                            if (jb2Var2 != null) {
                                jb2Var2.e(12);
                                iP4 = jb2Var2.p();
                            } else {
                                iP4 = 0;
                            }
                            if (jb2Var != null) {
                                jb2Var.e(12);
                                iP5 = jb2Var.p();
                                if (iP5 > 0) {
                                    iP6 = jb2Var.p() - 1;
                                } else {
                                    jb2Var = null;
                                }
                                iA = dkVar.a();
                                String str5 = e73Var2.f76964f.f80429m;
                                if (iA == -1) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    i42 = yjVar.f85002a;
                                    jArr11 = new long[i42];
                                    iArr9 = new int[i42];
                                    while (yjVar.a()) {
                                        int i513 = yjVar.f85003b;
                                        jArr11[i513] = yjVar.f85005d;
                                        iArr9[i513] = yjVar.f85004c;
                                    }
                                    j19 = iP3;
                                    i43 = 8192 / iA;
                                    i45 = 0;
                                    while (i44 < i42) {
                                        int i514 = iArr9[i44];
                                        int i515 = ib3.f78556a;
                                        i45 += ((i514 + i43) - 1) / i43;
                                    }
                                    jArr12 = new long[i45];
                                    iArr10 = new int[i45];
                                    jArr3 = new long[i45];
                                    iArr11 = new int[i45];
                                    i46 = 0;
                                    i47 = 0;
                                    i21 = 0;
                                    i48 = 0;
                                    while (i46 < i42) {
                                        int i6112 = iArr9[i46];
                                        j20 = jArr11[i46];
                                        int i6113 = i48;
                                        int i6114 = i42;
                                        iMax = i21;
                                        i49 = i6113;
                                        long[] jArr117 = jArr11;
                                        i50 = i6112;
                                        while (i50 > 0) {
                                            int iMin3 = Math.min(i43, i50);
                                            jArr12[i49] = j20;
                                            int[] iArr112 = iArr9;
                                            int i6115 = iA * iMin3;
                                            iArr10[i49] = i6115;
                                            iMax = Math.max(iMax, i6115);
                                            jArr3[i49] = ((long) i47) * j19;
                                            iArr11[i49] = 1;
                                            j20 += (long) iArr10[i49];
                                            i47 += iMin3;
                                            i50 -= iMin3;
                                            i49++;
                                            i43 = i43;
                                            iArr9 = iArr112;
                                            jArr12 = jArr12;
                                        }
                                        i46++;
                                        jArr11 = jArr117;
                                        iArr9 = iArr9;
                                        int i6116 = i49;
                                        i21 = iMax;
                                        i42 = i6114;
                                        i48 = i6116;
                                    }
                                    iArr = iArr11;
                                    iArr2 = iArr10;
                                    e73Var3 = e73Var2;
                                    jArr4 = jArr12;
                                    j13 = j19 * ((long) i47);
                                } else {
                                    jArrCopyOf = new long[iB];
                                    iArrCopyOf = new int[iB];
                                    jArrCopyOf2 = new long[iB];
                                    int i6117 = iP5;
                                    iArrCopyOf2 = new int[iB];
                                    int i6118 = iP;
                                    iP7 = iP6;
                                    i13 = i6117;
                                    i14 = 0;
                                    i15 = 0;
                                    j11 = 0;
                                    j12 = 0;
                                    i16 = 0;
                                    iB2 = 0;
                                    iP8 = 0;
                                    iB3 = iP3;
                                    i17 = iP4;
                                    iP9 = iP2;
                                    while (true) {
                                        if (i15 < iB) {
                                            i18 = i14;
                                            i19 = i16;
                                            break;
                                        }
                                        zA = true;
                                        while (i16 == 0) {
                                            zA = yjVar.a();
                                            if (zA) {
                                                break;
                                                break;
                                            }
                                            int i6119 = i14;
                                            long j211 = yjVar.f85005d;
                                            i16 = yjVar.f85004c;
                                            j12 = j211;
                                            jb2Var = jb2Var;
                                            i14 = i6119;
                                            iB = iB;
                                        }
                                        i22 = iB;
                                        i23 = i14;
                                        jb2Var3 = jb2Var;
                                        if (!zA) {
                                            ih1.d("AtomParsers", "Unexpected end of chunk data");
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                                            iB = i15;
                                            i19 = i16;
                                            i18 = i23;
                                            break;
                                        }
                                        if (jb2Var2 != null) {
                                            while (iP8 == 0) {
                                                iP8 = jb2Var2.p();
                                                iB2 = jb2Var2.b();
                                                i17--;
                                            }
                                            iP8--;
                                        }
                                        int i6120 = iB2;
                                        jArrCopyOf[i15] = j12;
                                        iC = dkVar.c();
                                        iArrCopyOf[i15] = iC;
                                        if (iC > i23) {
                                            i24 = iC;
                                        } else {
                                            i24 = i23;
                                        }
                                        jArrCopyOf2[i15] = j11 + ((long) i6120);
                                        if (jb2Var3 == null) {
                                            i25 = 1;
                                        } else {
                                            i25 = 0;
                                        }
                                        iArrCopyOf2[i15] = i25;
                                        if (i15 == iP7) {
                                            iArrCopyOf2[i15] = 1;
                                            i13--;
                                            if (i13 > 0) {
                                                jb2Var3.getClass();
                                                iP7 = jb2Var3.p() - 1;
                                            }
                                        }
                                        j11 += (long) iB3;
                                        iP9--;
                                        if (iP9 != 0) {
                                        }
                                        j12 += (long) iArrCopyOf[i15];
                                        i16--;
                                        i15++;
                                        iB2 = i6120;
                                        i14 = i24;
                                        jb2Var = jb2Var3;
                                        iB = i22;
                                    }
                                    j13 = j11 + ((long) iB2);
                                    if (jb2Var2 != null) {
                                        z14 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i17 > 0) {
                                            z14 = true;
                                            break;
                                        }
                                        if (jb2Var2.p() != 0) {
                                            z14 = false;
                                            break;
                                        }
                                        jb2Var2.b();
                                        i17--;
                                    }
                                    if (i13 != 0) {
                                        i20 = iP8;
                                        StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                        e73Var3 = e73Var2;
                                        sb5.append(e73Var3.f76959a);
                                        sb5.append(": remainingSynchronizationSamples ");
                                        sb5.append(i13);
                                        sb5.append(", remainingSamplesAtTimestampDelta ");
                                        sb5.append(iP9);
                                        sb5.append(", remainingSamplesInChunk ");
                                        sb5.append(i19);
                                        sb5.append(", remainingTimestampDeltaChanges ");
                                        sb5.append(i6118);
                                        sb5.append(", remainingSamplesAtTimestampOffset ");
                                        sb5.append(i20);
                                        if (z14) {
                                            str = ", ctts invalid";
                                        } else {
                                            str = str2;
                                        }
                                        sb5.append(str);
                                        ih1.d("AtomParsers", sb5.toString());
                                    } else {
                                        i20 = iP8;
                                        StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                        e73Var3 = e73Var2;
                                        sb6.append(e73Var3.f76959a);
                                        sb6.append(": remainingSynchronizationSamples ");
                                        sb6.append(i13);
                                        sb6.append(", remainingSamplesAtTimestampDelta ");
                                        sb6.append(iP9);
                                        sb6.append(", remainingSamplesInChunk ");
                                        sb6.append(i19);
                                        sb6.append(", remainingTimestampDeltaChanges ");
                                        sb6.append(i6118);
                                        sb6.append(", remainingSamplesAtTimestampOffset ");
                                        sb6.append(i20);
                                        if (z14) {
                                            str = ", ctts invalid";
                                        } else {
                                            str = str2;
                                        }
                                        sb6.append(str);
                                        ih1.d("AtomParsers", sb6.toString());
                                    }
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf2;
                                    jArr4 = jArrCopyOf;
                                    iArr2 = iArrCopyOf;
                                    i21 = i18;
                                }
                                jA = ib3.a(j13, 1000000L, e73Var3.f76961c);
                                jArr5 = e73Var3.f76966h;
                                if (jArr5 == null) {
                                    ib3.a(jArr3, e73Var3.f76961c);
                                    n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, jA);
                                } else if (jArr5.length != 1) {
                                    j14 = 0;
                                    jArr6 = e73Var3.f76966h;
                                    if (jArr6.length == 1) {
                                        i26 = 0;
                                        if (jArr6[0] == j14) {
                                            long[] jArr118 = e73Var3.f76967i;
                                            jArr118.getClass();
                                            j18 = jArr118[0];
                                            while (i41 < jArr3.length) {
                                                jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                            }
                                            n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                        }
                                    } else {
                                        i26 = 0;
                                    }
                                    if (e73Var3.f76960b == 1) {
                                        z15 = 1;
                                    } else {
                                        z15 = i26;
                                    }
                                    iArr3 = new int[jArr6.length];
                                    iArr4 = new int[jArr6.length];
                                    jArr7 = e73Var3.f76967i;
                                    jArr7.getClass();
                                    i27 = i26;
                                    i28 = i27;
                                    i29 = i28;
                                    while (true) {
                                        jArr8 = e73Var3.f76966h;
                                        if (i27 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        int i61110 = iB;
                                        j17 = jArr7[i27];
                                        if (j17 != -1) {
                                            int i7118 = i28;
                                            long jA10 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                            i37 = 1;
                                            iArr3[i27] = ib3.b(jArr3, j17, true);
                                            iArr4[i27] = ib3.a(jArr3, j17 + jA10, z15);
                                            while (true) {
                                                i38 = iArr3[i27];
                                                i39 = iArr4[i27];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i27] = i38 + 1;
                                                i37 = 1;
                                            }
                                            int i7119 = (i39 - i38) + i7118;
                                            if (i26 != i38) {
                                                i40 = 1;
                                            } else {
                                                i40 = 0;
                                            }
                                            i29 |= i40;
                                            i26 = i39;
                                            i28 = i7119;
                                        }
                                        i27++;
                                        iB = i61110;
                                        iArr2 = iArr2;
                                    }
                                    iArr5 = iArr2;
                                    if (i28 != iB) {
                                        i30 = 1;
                                    } else {
                                        i30 = 0;
                                    }
                                    i31 = i29 | i30;
                                    if (i31 != 0) {
                                        jArr9 = new long[i28];
                                    } else {
                                        jArr9 = jArr4;
                                    }
                                    if (i31 != 0) {
                                        iArr6 = new int[i28];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i31 != 0) {
                                        i21 = 0;
                                    }
                                    if (i31 != 0) {
                                        iArr7 = new int[i28];
                                    } else {
                                        iArr7 = iArr;
                                    }
                                    jArr10 = new long[i28];
                                    i32 = i21;
                                    i33 = 0;
                                    i34 = 0;
                                    j15 = 0;
                                    while (i33 < e73Var3.f76966h.length) {
                                        j16 = e73Var3.f76967i[i33];
                                        i35 = iArr3[i33];
                                        int[] iArr113 = iArr3;
                                        i36 = iArr4[i33];
                                        if (i31 != 0) {
                                            int i71110 = i36 - i35;
                                            System.arraycopy(jArr4, i35, jArr9, i34, i71110);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i35, iArr6, i34, i71110);
                                            System.arraycopy(iArr, i35, iArr7, i34, i71110);
                                        } else {
                                            iArr8 = iArr5;
                                        }
                                        int i71111 = i32;
                                        while (i35 < i36) {
                                            long[] jArr119 = jArr9;
                                            int[] iArr114 = iArr7;
                                            long[] jArr24 = jArr3;
                                            long j212 = j15;
                                            int i71112 = i36;
                                            int i71113 = i33;
                                            jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                            if (i31 == 0) {
                                            }
                                            i34++;
                                            i35++;
                                            i33 = i71113;
                                            i36 = i71112;
                                            jArr3 = jArr24;
                                            j15 = j212;
                                            jArr9 = jArr119;
                                            iArr7 = iArr114;
                                        }
                                        int i71114 = i33;
                                        i32 = i71111;
                                        j15 += e73Var3.f76966h[i71114];
                                        i33 = i71114 + 1;
                                        jArr3 = jArr3;
                                        jArr9 = jArr9;
                                        iArr3 = iArr113;
                                        iArr4 = iArr4;
                                        iArr7 = iArr7;
                                        iArr5 = iArr8;
                                        jArr4 = jArr4;
                                    }
                                    n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                                } else {
                                    j14 = 0;
                                    jArr6 = e73Var3.f76966h;
                                    if (jArr6.length == 1) {
                                        i26 = 0;
                                        if (jArr6[0] == j14) {
                                            long[] jArr1110 = e73Var3.f76967i;
                                            jArr1110.getClass();
                                            j18 = jArr1110[0];
                                            while (i41 < jArr3.length) {
                                                jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                            }
                                            n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                        }
                                    } else {
                                        i26 = 0;
                                    }
                                    if (e73Var3.f76960b == 1) {
                                        z15 = 1;
                                    } else {
                                        z15 = i26;
                                    }
                                    iArr3 = new int[jArr6.length];
                                    iArr4 = new int[jArr6.length];
                                    jArr7 = e73Var3.f76967i;
                                    jArr7.getClass();
                                    i27 = i26;
                                    i28 = i27;
                                    i29 = i28;
                                    while (true) {
                                        jArr8 = e73Var3.f76966h;
                                        if (i27 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        int i61111 = iB;
                                        j17 = jArr7[i27];
                                        if (j17 != -1) {
                                            int i71115 = i28;
                                            long jA11 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                            i37 = 1;
                                            iArr3[i27] = ib3.b(jArr3, j17, true);
                                            iArr4[i27] = ib3.a(jArr3, j17 + jA11, z15);
                                            while (true) {
                                                i38 = iArr3[i27];
                                                i39 = iArr4[i27];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i27] = i38 + 1;
                                                i37 = 1;
                                            }
                                            int i71116 = (i39 - i38) + i71115;
                                            if (i26 != i38) {
                                                i40 = 1;
                                            } else {
                                                i40 = 0;
                                            }
                                            i29 |= i40;
                                            i26 = i39;
                                            i28 = i71116;
                                        }
                                        i27++;
                                        iB = i61111;
                                        iArr2 = iArr2;
                                    }
                                    iArr5 = iArr2;
                                    if (i28 != iB) {
                                        i30 = 1;
                                    } else {
                                        i30 = 0;
                                    }
                                    i31 = i29 | i30;
                                    if (i31 != 0) {
                                        jArr9 = new long[i28];
                                    } else {
                                        jArr9 = jArr4;
                                    }
                                    if (i31 != 0) {
                                        iArr6 = new int[i28];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i31 != 0) {
                                        i21 = 0;
                                    }
                                    if (i31 != 0) {
                                        iArr7 = new int[i28];
                                    } else {
                                        iArr7 = iArr;
                                    }
                                    jArr10 = new long[i28];
                                    i32 = i21;
                                    i33 = 0;
                                    i34 = 0;
                                    j15 = 0;
                                    while (i33 < e73Var3.f76966h.length) {
                                        j16 = e73Var3.f76967i[i33];
                                        i35 = iArr3[i33];
                                        int[] iArr115 = iArr3;
                                        i36 = iArr4[i33];
                                        if (i31 != 0) {
                                            int i71117 = i36 - i35;
                                            System.arraycopy(jArr4, i35, jArr9, i34, i71117);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i35, iArr6, i34, i71117);
                                            System.arraycopy(iArr, i35, iArr7, i34, i71117);
                                        } else {
                                            iArr8 = iArr5;
                                        }
                                        int i71118 = i32;
                                        while (i35 < i36) {
                                            long[] jArr1111 = jArr9;
                                            int[] iArr116 = iArr7;
                                            long[] jArr25 = jArr3;
                                            long j213 = j15;
                                            int i71119 = i36;
                                            int i711110 = i33;
                                            jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                            if (i31 == 0) {
                                            }
                                            i34++;
                                            i35++;
                                            i33 = i711110;
                                            i36 = i71119;
                                            jArr3 = jArr25;
                                            j15 = j213;
                                            jArr9 = jArr1111;
                                            iArr7 = iArr116;
                                        }
                                        int i711111 = i33;
                                        i32 = i71118;
                                        j15 += e73Var3.f76966h[i711111];
                                        i33 = i711111 + 1;
                                        jArr3 = jArr3;
                                        jArr9 = jArr9;
                                        iArr3 = iArr115;
                                        iArr4 = iArr4;
                                        iArr7 = iArr7;
                                        iArr5 = iArr8;
                                        jArr4 = jArr4;
                                    }
                                    n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                                }
                            } else {
                                iP5 = 0;
                            }
                            iP6 = -1;
                            iA = dkVar.a();
                            String str6 = e73Var2.f76964f.f80429m;
                            if (iA == -1) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                i42 = yjVar.f85002a;
                                jArr11 = new long[i42];
                                iArr9 = new int[i42];
                                while (yjVar.a()) {
                                    int i516 = yjVar.f85003b;
                                    jArr11[i516] = yjVar.f85005d;
                                    iArr9[i516] = yjVar.f85004c;
                                }
                                j19 = iP3;
                                i43 = 8192 / iA;
                                i45 = 0;
                                while (i44 < i42) {
                                    int i517 = iArr9[i44];
                                    int i518 = ib3.f78556a;
                                    i45 += ((i517 + i43) - 1) / i43;
                                }
                                jArr12 = new long[i45];
                                iArr10 = new int[i45];
                                jArr3 = new long[i45];
                                iArr11 = new int[i45];
                                i46 = 0;
                                i47 = 0;
                                i21 = 0;
                                i48 = 0;
                                while (i46 < i42) {
                                    int i61112 = iArr9[i46];
                                    j20 = jArr11[i46];
                                    int i61113 = i48;
                                    int i61114 = i42;
                                    iMax = i21;
                                    i49 = i61113;
                                    long[] jArr1112 = jArr11;
                                    i50 = i61112;
                                    while (i50 > 0) {
                                        int iMin4 = Math.min(i43, i50);
                                        jArr12[i49] = j20;
                                        int[] iArr117 = iArr9;
                                        int i61115 = iA * iMin4;
                                        iArr10[i49] = i61115;
                                        iMax = Math.max(iMax, i61115);
                                        jArr3[i49] = ((long) i47) * j19;
                                        iArr11[i49] = 1;
                                        j20 += (long) iArr10[i49];
                                        i47 += iMin4;
                                        i50 -= iMin4;
                                        i49++;
                                        i43 = i43;
                                        iArr9 = iArr117;
                                        jArr12 = jArr12;
                                    }
                                    i46++;
                                    jArr11 = jArr1112;
                                    iArr9 = iArr9;
                                    int i61116 = i49;
                                    i21 = iMax;
                                    i42 = i61114;
                                    i48 = i61116;
                                }
                                iArr = iArr11;
                                iArr2 = iArr10;
                                e73Var3 = e73Var2;
                                jArr4 = jArr12;
                                j13 = j19 * ((long) i47);
                            } else {
                                jArrCopyOf = new long[iB];
                                iArrCopyOf = new int[iB];
                                jArrCopyOf2 = new long[iB];
                                int i61117 = iP5;
                                iArrCopyOf2 = new int[iB];
                                int i61118 = iP;
                                iP7 = iP6;
                                i13 = i61117;
                                i14 = 0;
                                i15 = 0;
                                j11 = 0;
                                j12 = 0;
                                i16 = 0;
                                iB2 = 0;
                                iP8 = 0;
                                iB3 = iP3;
                                i17 = iP4;
                                iP9 = iP2;
                                while (true) {
                                    if (i15 < iB) {
                                        i18 = i14;
                                        i19 = i16;
                                        break;
                                    }
                                    zA = true;
                                    while (i16 == 0) {
                                        zA = yjVar.a();
                                        if (zA) {
                                            break;
                                            break;
                                        }
                                        int i61119 = i14;
                                        long j214 = yjVar.f85005d;
                                        i16 = yjVar.f85004c;
                                        j12 = j214;
                                        jb2Var = jb2Var;
                                        i14 = i61119;
                                        iB = iB;
                                    }
                                    i22 = iB;
                                    i23 = i14;
                                    jb2Var3 = jb2Var;
                                    if (!zA) {
                                        ih1.d("AtomParsers", "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                                        iB = i15;
                                        i19 = i16;
                                        i18 = i23;
                                        break;
                                    }
                                    if (jb2Var2 != null) {
                                        while (iP8 == 0) {
                                            iP8 = jb2Var2.p();
                                            iB2 = jb2Var2.b();
                                            i17--;
                                        }
                                        iP8--;
                                    }
                                    int i6121 = iB2;
                                    jArrCopyOf[i15] = j12;
                                    iC = dkVar.c();
                                    iArrCopyOf[i15] = iC;
                                    if (iC > i23) {
                                        i24 = iC;
                                    } else {
                                        i24 = i23;
                                    }
                                    jArrCopyOf2[i15] = j11 + ((long) i6121);
                                    if (jb2Var3 == null) {
                                        i25 = 1;
                                    } else {
                                        i25 = 0;
                                    }
                                    iArrCopyOf2[i15] = i25;
                                    if (i15 == iP7) {
                                        iArrCopyOf2[i15] = 1;
                                        i13--;
                                        if (i13 > 0) {
                                            jb2Var3.getClass();
                                            iP7 = jb2Var3.p() - 1;
                                        }
                                    }
                                    j11 += (long) iB3;
                                    iP9--;
                                    if (iP9 != 0) {
                                    }
                                    j12 += (long) iArrCopyOf[i15];
                                    i16--;
                                    i15++;
                                    iB2 = i6121;
                                    i14 = i24;
                                    jb2Var = jb2Var3;
                                    iB = i22;
                                }
                                j13 = j11 + ((long) iB2);
                                if (jb2Var2 != null) {
                                    z14 = true;
                                    break;
                                }
                                while (true) {
                                    if (i17 > 0) {
                                        z14 = true;
                                        break;
                                    }
                                    if (jb2Var2.p() != 0) {
                                        z14 = false;
                                        break;
                                    }
                                    jb2Var2.b();
                                    i17--;
                                }
                                if (i13 != 0) {
                                    i20 = iP8;
                                    StringBuilder sb7 = new StringBuilder("Inconsistent stbl box for track ");
                                    e73Var3 = e73Var2;
                                    sb7.append(e73Var3.f76959a);
                                    sb7.append(": remainingSynchronizationSamples ");
                                    sb7.append(i13);
                                    sb7.append(", remainingSamplesAtTimestampDelta ");
                                    sb7.append(iP9);
                                    sb7.append(", remainingSamplesInChunk ");
                                    sb7.append(i19);
                                    sb7.append(", remainingTimestampDeltaChanges ");
                                    sb7.append(i61118);
                                    sb7.append(", remainingSamplesAtTimestampOffset ");
                                    sb7.append(i20);
                                    if (z14) {
                                        str = ", ctts invalid";
                                    } else {
                                        str = str2;
                                    }
                                    sb7.append(str);
                                    ih1.d("AtomParsers", sb7.toString());
                                } else {
                                    i20 = iP8;
                                    StringBuilder sb8 = new StringBuilder("Inconsistent stbl box for track ");
                                    e73Var3 = e73Var2;
                                    sb8.append(e73Var3.f76959a);
                                    sb8.append(": remainingSynchronizationSamples ");
                                    sb8.append(i13);
                                    sb8.append(", remainingSamplesAtTimestampDelta ");
                                    sb8.append(iP9);
                                    sb8.append(", remainingSamplesInChunk ");
                                    sb8.append(i19);
                                    sb8.append(", remainingTimestampDeltaChanges ");
                                    sb8.append(i61118);
                                    sb8.append(", remainingSamplesAtTimestampOffset ");
                                    sb8.append(i20);
                                    if (z14) {
                                        str = ", ctts invalid";
                                    } else {
                                        str = str2;
                                    }
                                    sb8.append(str);
                                    ih1.d("AtomParsers", sb8.toString());
                                }
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr2 = iArrCopyOf;
                                i21 = i18;
                            }
                            jA = ib3.a(j13, 1000000L, e73Var3.f76961c);
                            jArr5 = e73Var3.f76966h;
                            if (jArr5 == null) {
                                ib3.a(jArr3, e73Var3.f76961c);
                                n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, jA);
                            } else if (jArr5.length != 1) {
                                j14 = 0;
                                jArr6 = e73Var3.f76966h;
                                if (jArr6.length == 1) {
                                    i26 = 0;
                                    if (jArr6[0] == j14) {
                                        long[] jArr1113 = e73Var3.f76967i;
                                        jArr1113.getClass();
                                        j18 = jArr1113[0];
                                        while (i41 < jArr3.length) {
                                            jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                        }
                                        n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                    }
                                } else {
                                    i26 = 0;
                                }
                                if (e73Var3.f76960b == 1) {
                                    z15 = 1;
                                } else {
                                    z15 = i26;
                                }
                                iArr3 = new int[jArr6.length];
                                iArr4 = new int[jArr6.length];
                                jArr7 = e73Var3.f76967i;
                                jArr7.getClass();
                                i27 = i26;
                                i28 = i27;
                                i29 = i28;
                                while (true) {
                                    jArr8 = e73Var3.f76966h;
                                    if (i27 < jArr8.length) {
                                        break;
                                        break;
                                    }
                                    int i611110 = iB;
                                    j17 = jArr7[i27];
                                    if (j17 != -1) {
                                        int i711112 = i28;
                                        long jA12 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                        i37 = 1;
                                        iArr3[i27] = ib3.b(jArr3, j17, true);
                                        iArr4[i27] = ib3.a(jArr3, j17 + jA12, z15);
                                        while (true) {
                                            i38 = iArr3[i27];
                                            i39 = iArr4[i27];
                                            if (i38 >= i39) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i27] = i38 + 1;
                                            i37 = 1;
                                        }
                                        int i711113 = (i39 - i38) + i711112;
                                        if (i26 != i38) {
                                            i40 = 1;
                                        } else {
                                            i40 = 0;
                                        }
                                        i29 |= i40;
                                        i26 = i39;
                                        i28 = i711113;
                                    }
                                    i27++;
                                    iB = i611110;
                                    iArr2 = iArr2;
                                }
                                iArr5 = iArr2;
                                if (i28 != iB) {
                                    i30 = 1;
                                } else {
                                    i30 = 0;
                                }
                                i31 = i29 | i30;
                                if (i31 != 0) {
                                    jArr9 = new long[i28];
                                } else {
                                    jArr9 = jArr4;
                                }
                                if (i31 != 0) {
                                    iArr6 = new int[i28];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i31 != 0) {
                                    i21 = 0;
                                }
                                if (i31 != 0) {
                                    iArr7 = new int[i28];
                                } else {
                                    iArr7 = iArr;
                                }
                                jArr10 = new long[i28];
                                i32 = i21;
                                i33 = 0;
                                i34 = 0;
                                j15 = 0;
                                while (i33 < e73Var3.f76966h.length) {
                                    j16 = e73Var3.f76967i[i33];
                                    i35 = iArr3[i33];
                                    int[] iArr118 = iArr3;
                                    i36 = iArr4[i33];
                                    if (i31 != 0) {
                                        int i711114 = i36 - i35;
                                        System.arraycopy(jArr4, i35, jArr9, i34, i711114);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i35, iArr6, i34, i711114);
                                        System.arraycopy(iArr, i35, iArr7, i34, i711114);
                                    } else {
                                        iArr8 = iArr5;
                                    }
                                    int i711115 = i32;
                                    while (i35 < i36) {
                                        long[] jArr1114 = jArr9;
                                        int[] iArr119 = iArr7;
                                        long[] jArr26 = jArr3;
                                        long j215 = j15;
                                        int i711116 = i36;
                                        int i711117 = i33;
                                        jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                        if (i31 == 0) {
                                        }
                                        i34++;
                                        i35++;
                                        i33 = i711117;
                                        i36 = i711116;
                                        jArr3 = jArr26;
                                        j15 = j215;
                                        jArr9 = jArr1114;
                                        iArr7 = iArr119;
                                    }
                                    int i711118 = i33;
                                    i32 = i711115;
                                    j15 += e73Var3.f76966h[i711118];
                                    i33 = i711118 + 1;
                                    jArr3 = jArr3;
                                    jArr9 = jArr9;
                                    iArr3 = iArr118;
                                    iArr4 = iArr4;
                                    iArr7 = iArr7;
                                    iArr5 = iArr8;
                                    jArr4 = jArr4;
                                }
                                n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                            } else {
                                j14 = 0;
                                jArr6 = e73Var3.f76966h;
                                if (jArr6.length == 1) {
                                    i26 = 0;
                                    if (jArr6[0] == j14) {
                                        long[] jArr1115 = e73Var3.f76967i;
                                        jArr1115.getClass();
                                        j18 = jArr1115[0];
                                        while (i41 < jArr3.length) {
                                            jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                        }
                                        n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                    }
                                } else {
                                    i26 = 0;
                                }
                                if (e73Var3.f76960b == 1) {
                                    z15 = 1;
                                } else {
                                    z15 = i26;
                                }
                                iArr3 = new int[jArr6.length];
                                iArr4 = new int[jArr6.length];
                                jArr7 = e73Var3.f76967i;
                                jArr7.getClass();
                                i27 = i26;
                                i28 = i27;
                                i29 = i28;
                                while (true) {
                                    jArr8 = e73Var3.f76966h;
                                    if (i27 < jArr8.length) {
                                        break;
                                        break;
                                    }
                                    int i611111 = iB;
                                    j17 = jArr7[i27];
                                    if (j17 != -1) {
                                        int i711119 = i28;
                                        long jA13 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                        i37 = 1;
                                        iArr3[i27] = ib3.b(jArr3, j17, true);
                                        iArr4[i27] = ib3.a(jArr3, j17 + jA13, z15);
                                        while (true) {
                                            i38 = iArr3[i27];
                                            i39 = iArr4[i27];
                                            if (i38 >= i39) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i27] = i38 + 1;
                                            i37 = 1;
                                        }
                                        int i7111110 = (i39 - i38) + i711119;
                                        if (i26 != i38) {
                                            i40 = 1;
                                        } else {
                                            i40 = 0;
                                        }
                                        i29 |= i40;
                                        i26 = i39;
                                        i28 = i7111110;
                                    }
                                    i27++;
                                    iB = i611111;
                                    iArr2 = iArr2;
                                }
                                iArr5 = iArr2;
                                if (i28 != iB) {
                                    i30 = 1;
                                } else {
                                    i30 = 0;
                                }
                                i31 = i29 | i30;
                                if (i31 != 0) {
                                    jArr9 = new long[i28];
                                } else {
                                    jArr9 = jArr4;
                                }
                                if (i31 != 0) {
                                    iArr6 = new int[i28];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i31 != 0) {
                                    i21 = 0;
                                }
                                if (i31 != 0) {
                                    iArr7 = new int[i28];
                                } else {
                                    iArr7 = iArr;
                                }
                                jArr10 = new long[i28];
                                i32 = i21;
                                i33 = 0;
                                i34 = 0;
                                j15 = 0;
                                while (i33 < e73Var3.f76966h.length) {
                                    j16 = e73Var3.f76967i[i33];
                                    i35 = iArr3[i33];
                                    int[] iArr1110 = iArr3;
                                    i36 = iArr4[i33];
                                    if (i31 != 0) {
                                        int i7111111 = i36 - i35;
                                        System.arraycopy(jArr4, i35, jArr9, i34, i7111111);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i35, iArr6, i34, i7111111);
                                        System.arraycopy(iArr, i35, iArr7, i34, i7111111);
                                    } else {
                                        iArr8 = iArr5;
                                    }
                                    int i7111112 = i32;
                                    while (i35 < i36) {
                                        long[] jArr1116 = jArr9;
                                        int[] iArr1111 = iArr7;
                                        long[] jArr27 = jArr3;
                                        long j216 = j15;
                                        int i7111113 = i36;
                                        int i7111114 = i33;
                                        jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                        if (i31 == 0) {
                                        }
                                        i34++;
                                        i35++;
                                        i33 = i7111114;
                                        i36 = i7111113;
                                        jArr3 = jArr27;
                                        j15 = j216;
                                        jArr9 = jArr1116;
                                        iArr7 = iArr1111;
                                    }
                                    int i7111115 = i33;
                                    i32 = i7111112;
                                    j15 += e73Var3.f76966h[i7111115];
                                    i33 = i7111115 + 1;
                                    jArr3 = jArr3;
                                    jArr9 = jArr9;
                                    iArr3 = iArr1110;
                                    iArr4 = iArr4;
                                    iArr7 = iArr7;
                                    iArr5 = iArr8;
                                    jArr4 = jArr4;
                                }
                                n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                            }
                        }
                        arrayList = arrayList2;
                        arrayList.add(n73Var);
                    }
                }
                e73Var = null;
                i12 = 1937007212;
                e73Var2 = (e73) wy0Var.apply(e73Var);
                if (e73Var2 == null) {
                    arrayList = arrayList2;
                } else {
                    vj vjVarB10 = vjVar2.b(1835297121);
                    vjVarB10.getClass();
                    vj vjVarB11 = vjVarB10.b(1835626086);
                    vjVarB11.getClass();
                    vjVarB2 = vjVarB11.b(i12);
                    vjVarB2.getClass();
                    wjVarC = vjVarB2.c(1937011578);
                    if (wjVarC != null) {
                        dkVar = new ck(wjVarC, e73Var2.f76964f);
                    } else {
                        wjVarC2 = vjVarB2.c(1937013298);
                        if (wjVarC2 != null) {
                            dkVar = new dk(wjVarC2);
                        } else {
                            throw new ob2("Track has no sample table size information", null, true, 1);
                        }
                    }
                    iB = dkVar.b();
                    if (iB == 0) {
                        n73Var = new n73(e73Var2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        wjVarC3 = vjVarB2.c(1937007471);
                        if (wjVarC3 == null) {
                            wjVarC3 = vjVarB2.c(1668232756);
                            wjVarC3.getClass();
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        jb2 jb2Var15 = wjVarC3.f84218b;
                        wj wjVarC16 = vjVarB2.c(1937011555);
                        wjVarC16.getClass();
                        jb2 jb2Var16 = wjVarC16.f84218b;
                        wj wjVarC17 = vjVarB2.c(1937011827);
                        wjVarC17.getClass();
                        jb2 jb2Var17 = wjVarC17.f84218b;
                        wjVarC4 = vjVarB2.c(1937011571);
                        if (wjVarC4 != null) {
                            jb2Var = wjVarC4.f84218b;
                        } else {
                            jb2Var = null;
                        }
                        wjVarC5 = vjVarB2.c(1668576371);
                        if (wjVarC5 != null) {
                            jb2Var2 = wjVarC5.f84218b;
                        } else {
                            jb2Var2 = null;
                        }
                        yjVar = new yj(jb2Var16, jb2Var15, z12);
                        jb2Var17.e(12);
                        iP = jb2Var17.p() - 1;
                        iP2 = jb2Var17.p();
                        iP3 = jb2Var17.p();
                        if (jb2Var2 != null) {
                            jb2Var2.e(12);
                            iP4 = jb2Var2.p();
                        } else {
                            iP4 = 0;
                        }
                        if (jb2Var != null) {
                            jb2Var.e(12);
                            iP5 = jb2Var.p();
                            if (iP5 > 0) {
                                iP6 = jb2Var.p() - 1;
                            } else {
                                jb2Var = null;
                            }
                            iA = dkVar.a();
                            String str7 = e73Var2.f76964f.f80429m;
                            if (iA == -1) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                i42 = yjVar.f85002a;
                                jArr11 = new long[i42];
                                iArr9 = new int[i42];
                                while (yjVar.a()) {
                                    int i519 = yjVar.f85003b;
                                    jArr11[i519] = yjVar.f85005d;
                                    iArr9[i519] = yjVar.f85004c;
                                }
                                j19 = iP3;
                                i43 = 8192 / iA;
                                i45 = 0;
                                while (i44 < i42) {
                                    int i5110 = iArr9[i44];
                                    int i5111 = ib3.f78556a;
                                    i45 += ((i5110 + i43) - 1) / i43;
                                }
                                jArr12 = new long[i45];
                                iArr10 = new int[i45];
                                jArr3 = new long[i45];
                                iArr11 = new int[i45];
                                i46 = 0;
                                i47 = 0;
                                i21 = 0;
                                i48 = 0;
                                while (i46 < i42) {
                                    int i611112 = iArr9[i46];
                                    j20 = jArr11[i46];
                                    int i611113 = i48;
                                    int i611114 = i42;
                                    iMax = i21;
                                    i49 = i611113;
                                    long[] jArr1117 = jArr11;
                                    i50 = i611112;
                                    while (i50 > 0) {
                                        int iMin5 = Math.min(i43, i50);
                                        jArr12[i49] = j20;
                                        int[] iArr1112 = iArr9;
                                        int i611115 = iA * iMin5;
                                        iArr10[i49] = i611115;
                                        iMax = Math.max(iMax, i611115);
                                        jArr3[i49] = ((long) i47) * j19;
                                        iArr11[i49] = 1;
                                        j20 += (long) iArr10[i49];
                                        i47 += iMin5;
                                        i50 -= iMin5;
                                        i49++;
                                        i43 = i43;
                                        iArr9 = iArr1112;
                                        jArr12 = jArr12;
                                    }
                                    i46++;
                                    jArr11 = jArr1117;
                                    iArr9 = iArr9;
                                    int i611116 = i49;
                                    i21 = iMax;
                                    i42 = i611114;
                                    i48 = i611116;
                                }
                                iArr = iArr11;
                                iArr2 = iArr10;
                                e73Var3 = e73Var2;
                                jArr4 = jArr12;
                                j13 = j19 * ((long) i47);
                            } else {
                                jArrCopyOf = new long[iB];
                                iArrCopyOf = new int[iB];
                                jArrCopyOf2 = new long[iB];
                                int i611117 = iP5;
                                iArrCopyOf2 = new int[iB];
                                int i611118 = iP;
                                iP7 = iP6;
                                i13 = i611117;
                                i14 = 0;
                                i15 = 0;
                                j11 = 0;
                                j12 = 0;
                                i16 = 0;
                                iB2 = 0;
                                iP8 = 0;
                                iB3 = iP3;
                                i17 = iP4;
                                iP9 = iP2;
                                while (true) {
                                    if (i15 < iB) {
                                        i18 = i14;
                                        i19 = i16;
                                        break;
                                    }
                                    zA = true;
                                    while (i16 == 0) {
                                        zA = yjVar.a();
                                        if (zA) {
                                            break;
                                            break;
                                        }
                                        int i611119 = i14;
                                        long j217 = yjVar.f85005d;
                                        i16 = yjVar.f85004c;
                                        j12 = j217;
                                        jb2Var = jb2Var;
                                        i14 = i611119;
                                        iB = iB;
                                    }
                                    i22 = iB;
                                    i23 = i14;
                                    jb2Var3 = jb2Var;
                                    if (!zA) {
                                        ih1.d("AtomParsers", "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                                        iB = i15;
                                        i19 = i16;
                                        i18 = i23;
                                        break;
                                    }
                                    if (jb2Var2 != null) {
                                        while (iP8 == 0) {
                                            iP8 = jb2Var2.p();
                                            iB2 = jb2Var2.b();
                                            i17--;
                                        }
                                        iP8--;
                                    }
                                    int i6122 = iB2;
                                    jArrCopyOf[i15] = j12;
                                    iC = dkVar.c();
                                    iArrCopyOf[i15] = iC;
                                    if (iC > i23) {
                                        i24 = iC;
                                    } else {
                                        i24 = i23;
                                    }
                                    jArrCopyOf2[i15] = j11 + ((long) i6122);
                                    if (jb2Var3 == null) {
                                        i25 = 1;
                                    } else {
                                        i25 = 0;
                                    }
                                    iArrCopyOf2[i15] = i25;
                                    if (i15 == iP7) {
                                        iArrCopyOf2[i15] = 1;
                                        i13--;
                                        if (i13 > 0) {
                                            jb2Var3.getClass();
                                            iP7 = jb2Var3.p() - 1;
                                        }
                                    }
                                    j11 += (long) iB3;
                                    iP9--;
                                    if (iP9 != 0) {
                                    }
                                    j12 += (long) iArrCopyOf[i15];
                                    i16--;
                                    i15++;
                                    iB2 = i6122;
                                    i14 = i24;
                                    jb2Var = jb2Var3;
                                    iB = i22;
                                }
                                j13 = j11 + ((long) iB2);
                                if (jb2Var2 != null) {
                                    z14 = true;
                                    break;
                                }
                                while (true) {
                                    if (i17 > 0) {
                                        z14 = true;
                                        break;
                                    }
                                    if (jb2Var2.p() != 0) {
                                        z14 = false;
                                        break;
                                    }
                                    jb2Var2.b();
                                    i17--;
                                }
                                if (i13 != 0) {
                                    i20 = iP8;
                                    StringBuilder sb9 = new StringBuilder("Inconsistent stbl box for track ");
                                    e73Var3 = e73Var2;
                                    sb9.append(e73Var3.f76959a);
                                    sb9.append(": remainingSynchronizationSamples ");
                                    sb9.append(i13);
                                    sb9.append(", remainingSamplesAtTimestampDelta ");
                                    sb9.append(iP9);
                                    sb9.append(", remainingSamplesInChunk ");
                                    sb9.append(i19);
                                    sb9.append(", remainingTimestampDeltaChanges ");
                                    sb9.append(i611118);
                                    sb9.append(", remainingSamplesAtTimestampOffset ");
                                    sb9.append(i20);
                                    if (z14) {
                                        str = ", ctts invalid";
                                    } else {
                                        str = str2;
                                    }
                                    sb9.append(str);
                                    ih1.d("AtomParsers", sb9.toString());
                                } else {
                                    i20 = iP8;
                                    StringBuilder sb10 = new StringBuilder("Inconsistent stbl box for track ");
                                    e73Var3 = e73Var2;
                                    sb10.append(e73Var3.f76959a);
                                    sb10.append(": remainingSynchronizationSamples ");
                                    sb10.append(i13);
                                    sb10.append(", remainingSamplesAtTimestampDelta ");
                                    sb10.append(iP9);
                                    sb10.append(", remainingSamplesInChunk ");
                                    sb10.append(i19);
                                    sb10.append(", remainingTimestampDeltaChanges ");
                                    sb10.append(i611118);
                                    sb10.append(", remainingSamplesAtTimestampOffset ");
                                    sb10.append(i20);
                                    if (z14) {
                                        str = ", ctts invalid";
                                    } else {
                                        str = str2;
                                    }
                                    sb10.append(str);
                                    ih1.d("AtomParsers", sb10.toString());
                                }
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr2 = iArrCopyOf;
                                i21 = i18;
                            }
                            jA = ib3.a(j13, 1000000L, e73Var3.f76961c);
                            jArr5 = e73Var3.f76966h;
                            if (jArr5 == null) {
                                ib3.a(jArr3, e73Var3.f76961c);
                                n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, jA);
                            } else if (jArr5.length != 1) {
                                j14 = 0;
                                jArr6 = e73Var3.f76966h;
                                if (jArr6.length == 1) {
                                    i26 = 0;
                                    if (jArr6[0] == j14) {
                                        long[] jArr1118 = e73Var3.f76967i;
                                        jArr1118.getClass();
                                        j18 = jArr1118[0];
                                        while (i41 < jArr3.length) {
                                            jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                        }
                                        n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                    }
                                } else {
                                    i26 = 0;
                                }
                                if (e73Var3.f76960b == 1) {
                                    z15 = 1;
                                } else {
                                    z15 = i26;
                                }
                                iArr3 = new int[jArr6.length];
                                iArr4 = new int[jArr6.length];
                                jArr7 = e73Var3.f76967i;
                                jArr7.getClass();
                                i27 = i26;
                                i28 = i27;
                                i29 = i28;
                                while (true) {
                                    jArr8 = e73Var3.f76966h;
                                    if (i27 < jArr8.length) {
                                        break;
                                        break;
                                    }
                                    int i6111110 = iB;
                                    j17 = jArr7[i27];
                                    if (j17 != -1) {
                                        int i7111116 = i28;
                                        long jA14 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                        i37 = 1;
                                        iArr3[i27] = ib3.b(jArr3, j17, true);
                                        iArr4[i27] = ib3.a(jArr3, j17 + jA14, z15);
                                        while (true) {
                                            i38 = iArr3[i27];
                                            i39 = iArr4[i27];
                                            if (i38 >= i39) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i27] = i38 + 1;
                                            i37 = 1;
                                        }
                                        int i7111117 = (i39 - i38) + i7111116;
                                        if (i26 != i38) {
                                            i40 = 1;
                                        } else {
                                            i40 = 0;
                                        }
                                        i29 |= i40;
                                        i26 = i39;
                                        i28 = i7111117;
                                    }
                                    i27++;
                                    iB = i6111110;
                                    iArr2 = iArr2;
                                }
                                iArr5 = iArr2;
                                if (i28 != iB) {
                                    i30 = 1;
                                } else {
                                    i30 = 0;
                                }
                                i31 = i29 | i30;
                                if (i31 != 0) {
                                    jArr9 = new long[i28];
                                } else {
                                    jArr9 = jArr4;
                                }
                                if (i31 != 0) {
                                    iArr6 = new int[i28];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i31 != 0) {
                                    i21 = 0;
                                }
                                if (i31 != 0) {
                                    iArr7 = new int[i28];
                                } else {
                                    iArr7 = iArr;
                                }
                                jArr10 = new long[i28];
                                i32 = i21;
                                i33 = 0;
                                i34 = 0;
                                j15 = 0;
                                while (i33 < e73Var3.f76966h.length) {
                                    j16 = e73Var3.f76967i[i33];
                                    i35 = iArr3[i33];
                                    int[] iArr1113 = iArr3;
                                    i36 = iArr4[i33];
                                    if (i31 != 0) {
                                        int i7111118 = i36 - i35;
                                        System.arraycopy(jArr4, i35, jArr9, i34, i7111118);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i35, iArr6, i34, i7111118);
                                        System.arraycopy(iArr, i35, iArr7, i34, i7111118);
                                    } else {
                                        iArr8 = iArr5;
                                    }
                                    int i7111119 = i32;
                                    while (i35 < i36) {
                                        long[] jArr1119 = jArr9;
                                        int[] iArr1114 = iArr7;
                                        long[] jArr28 = jArr3;
                                        long j218 = j15;
                                        int i71111110 = i36;
                                        int i71111111 = i33;
                                        jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                        if (i31 == 0) {
                                        }
                                        i34++;
                                        i35++;
                                        i33 = i71111111;
                                        i36 = i71111110;
                                        jArr3 = jArr28;
                                        j15 = j218;
                                        jArr9 = jArr1119;
                                        iArr7 = iArr1114;
                                    }
                                    int i71111112 = i33;
                                    i32 = i7111119;
                                    j15 += e73Var3.f76966h[i71111112];
                                    i33 = i71111112 + 1;
                                    jArr3 = jArr3;
                                    jArr9 = jArr9;
                                    iArr3 = iArr1113;
                                    iArr4 = iArr4;
                                    iArr7 = iArr7;
                                    iArr5 = iArr8;
                                    jArr4 = jArr4;
                                }
                                n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                            } else {
                                j14 = 0;
                                jArr6 = e73Var3.f76966h;
                                if (jArr6.length == 1) {
                                    i26 = 0;
                                    if (jArr6[0] == j14) {
                                        long[] jArr11110 = e73Var3.f76967i;
                                        jArr11110.getClass();
                                        j18 = jArr11110[0];
                                        while (i41 < jArr3.length) {
                                            jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                        }
                                        n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                    }
                                } else {
                                    i26 = 0;
                                }
                                if (e73Var3.f76960b == 1) {
                                    z15 = 1;
                                } else {
                                    z15 = i26;
                                }
                                iArr3 = new int[jArr6.length];
                                iArr4 = new int[jArr6.length];
                                jArr7 = e73Var3.f76967i;
                                jArr7.getClass();
                                i27 = i26;
                                i28 = i27;
                                i29 = i28;
                                while (true) {
                                    jArr8 = e73Var3.f76966h;
                                    if (i27 < jArr8.length) {
                                        break;
                                        break;
                                    }
                                    int i6111111 = iB;
                                    j17 = jArr7[i27];
                                    if (j17 != -1) {
                                        int i71111113 = i28;
                                        long jA15 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                        i37 = 1;
                                        iArr3[i27] = ib3.b(jArr3, j17, true);
                                        iArr4[i27] = ib3.a(jArr3, j17 + jA15, z15);
                                        while (true) {
                                            i38 = iArr3[i27];
                                            i39 = iArr4[i27];
                                            if (i38 >= i39) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i27] = i38 + 1;
                                            i37 = 1;
                                        }
                                        int i71111114 = (i39 - i38) + i71111113;
                                        if (i26 != i38) {
                                            i40 = 1;
                                        } else {
                                            i40 = 0;
                                        }
                                        i29 |= i40;
                                        i26 = i39;
                                        i28 = i71111114;
                                    }
                                    i27++;
                                    iB = i6111111;
                                    iArr2 = iArr2;
                                }
                                iArr5 = iArr2;
                                if (i28 != iB) {
                                    i30 = 1;
                                } else {
                                    i30 = 0;
                                }
                                i31 = i29 | i30;
                                if (i31 != 0) {
                                    jArr9 = new long[i28];
                                } else {
                                    jArr9 = jArr4;
                                }
                                if (i31 != 0) {
                                    iArr6 = new int[i28];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i31 != 0) {
                                    i21 = 0;
                                }
                                if (i31 != 0) {
                                    iArr7 = new int[i28];
                                } else {
                                    iArr7 = iArr;
                                }
                                jArr10 = new long[i28];
                                i32 = i21;
                                i33 = 0;
                                i34 = 0;
                                j15 = 0;
                                while (i33 < e73Var3.f76966h.length) {
                                    j16 = e73Var3.f76967i[i33];
                                    i35 = iArr3[i33];
                                    int[] iArr1115 = iArr3;
                                    i36 = iArr4[i33];
                                    if (i31 != 0) {
                                        int i71111115 = i36 - i35;
                                        System.arraycopy(jArr4, i35, jArr9, i34, i71111115);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i35, iArr6, i34, i71111115);
                                        System.arraycopy(iArr, i35, iArr7, i34, i71111115);
                                    } else {
                                        iArr8 = iArr5;
                                    }
                                    int i71111116 = i32;
                                    while (i35 < i36) {
                                        long[] jArr11111 = jArr9;
                                        int[] iArr1116 = iArr7;
                                        long[] jArr29 = jArr3;
                                        long j219 = j15;
                                        int i71111117 = i36;
                                        int i71111118 = i33;
                                        jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                        if (i31 == 0) {
                                        }
                                        i34++;
                                        i35++;
                                        i33 = i71111118;
                                        i36 = i71111117;
                                        jArr3 = jArr29;
                                        j15 = j219;
                                        jArr9 = jArr11111;
                                        iArr7 = iArr1116;
                                    }
                                    int i71111119 = i33;
                                    i32 = i71111116;
                                    j15 += e73Var3.f76966h[i71111119];
                                    i33 = i71111119 + 1;
                                    jArr3 = jArr3;
                                    jArr9 = jArr9;
                                    iArr3 = iArr1115;
                                    iArr4 = iArr4;
                                    iArr7 = iArr7;
                                    iArr5 = iArr8;
                                    jArr4 = jArr4;
                                }
                                n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                            }
                        } else {
                            iP5 = 0;
                        }
                        iP6 = -1;
                        iA = dkVar.a();
                        String str8 = e73Var2.f76964f.f80429m;
                        if (iA == -1) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            i42 = yjVar.f85002a;
                            jArr11 = new long[i42];
                            iArr9 = new int[i42];
                            while (yjVar.a()) {
                                int i5112 = yjVar.f85003b;
                                jArr11[i5112] = yjVar.f85005d;
                                iArr9[i5112] = yjVar.f85004c;
                            }
                            j19 = iP3;
                            i43 = 8192 / iA;
                            i45 = 0;
                            while (i44 < i42) {
                                int i5113 = iArr9[i44];
                                int i5114 = ib3.f78556a;
                                i45 += ((i5113 + i43) - 1) / i43;
                            }
                            jArr12 = new long[i45];
                            iArr10 = new int[i45];
                            jArr3 = new long[i45];
                            iArr11 = new int[i45];
                            i46 = 0;
                            i47 = 0;
                            i21 = 0;
                            i48 = 0;
                            while (i46 < i42) {
                                int i6111112 = iArr9[i46];
                                j20 = jArr11[i46];
                                int i6111113 = i48;
                                int i6111114 = i42;
                                iMax = i21;
                                i49 = i6111113;
                                long[] jArr11112 = jArr11;
                                i50 = i6111112;
                                while (i50 > 0) {
                                    int iMin6 = Math.min(i43, i50);
                                    jArr12[i49] = j20;
                                    int[] iArr1117 = iArr9;
                                    int i6111115 = iA * iMin6;
                                    iArr10[i49] = i6111115;
                                    iMax = Math.max(iMax, i6111115);
                                    jArr3[i49] = ((long) i47) * j19;
                                    iArr11[i49] = 1;
                                    j20 += (long) iArr10[i49];
                                    i47 += iMin6;
                                    i50 -= iMin6;
                                    i49++;
                                    i43 = i43;
                                    iArr9 = iArr1117;
                                    jArr12 = jArr12;
                                }
                                i46++;
                                jArr11 = jArr11112;
                                iArr9 = iArr9;
                                int i6111116 = i49;
                                i21 = iMax;
                                i42 = i6111114;
                                i48 = i6111116;
                            }
                            iArr = iArr11;
                            iArr2 = iArr10;
                            e73Var3 = e73Var2;
                            jArr4 = jArr12;
                            j13 = j19 * ((long) i47);
                        } else {
                            jArrCopyOf = new long[iB];
                            iArrCopyOf = new int[iB];
                            jArrCopyOf2 = new long[iB];
                            int i6111117 = iP5;
                            iArrCopyOf2 = new int[iB];
                            int i6111118 = iP;
                            iP7 = iP6;
                            i13 = i6111117;
                            i14 = 0;
                            i15 = 0;
                            j11 = 0;
                            j12 = 0;
                            i16 = 0;
                            iB2 = 0;
                            iP8 = 0;
                            iB3 = iP3;
                            i17 = iP4;
                            iP9 = iP2;
                            while (true) {
                                if (i15 < iB) {
                                    i18 = i14;
                                    i19 = i16;
                                    break;
                                }
                                zA = true;
                                while (i16 == 0) {
                                    zA = yjVar.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    int i6111119 = i14;
                                    long j2110 = yjVar.f85005d;
                                    i16 = yjVar.f85004c;
                                    j12 = j2110;
                                    jb2Var = jb2Var;
                                    i14 = i6111119;
                                    iB = iB;
                                }
                                i22 = iB;
                                i23 = i14;
                                jb2Var3 = jb2Var;
                                if (!zA) {
                                    ih1.d("AtomParsers", "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                                    iB = i15;
                                    i19 = i16;
                                    i18 = i23;
                                    break;
                                }
                                if (jb2Var2 != null) {
                                    while (iP8 == 0) {
                                        iP8 = jb2Var2.p();
                                        iB2 = jb2Var2.b();
                                        i17--;
                                    }
                                    iP8--;
                                }
                                int i6123 = iB2;
                                jArrCopyOf[i15] = j12;
                                iC = dkVar.c();
                                iArrCopyOf[i15] = iC;
                                if (iC > i23) {
                                    i24 = iC;
                                } else {
                                    i24 = i23;
                                }
                                jArrCopyOf2[i15] = j11 + ((long) i6123);
                                if (jb2Var3 == null) {
                                    i25 = 1;
                                } else {
                                    i25 = 0;
                                }
                                iArrCopyOf2[i15] = i25;
                                if (i15 == iP7) {
                                    iArrCopyOf2[i15] = 1;
                                    i13--;
                                    if (i13 > 0) {
                                        jb2Var3.getClass();
                                        iP7 = jb2Var3.p() - 1;
                                    }
                                }
                                j11 += (long) iB3;
                                iP9--;
                                if (iP9 != 0) {
                                }
                                j12 += (long) iArrCopyOf[i15];
                                i16--;
                                i15++;
                                iB2 = i6123;
                                i14 = i24;
                                jb2Var = jb2Var3;
                                iB = i22;
                            }
                            j13 = j11 + ((long) iB2);
                            if (jb2Var2 != null) {
                                z14 = true;
                                break;
                            }
                            while (true) {
                                if (i17 > 0) {
                                    z14 = true;
                                    break;
                                }
                                if (jb2Var2.p() != 0) {
                                    z14 = false;
                                    break;
                                }
                                jb2Var2.b();
                                i17--;
                            }
                            if (i13 != 0) {
                                i20 = iP8;
                                StringBuilder sb11 = new StringBuilder("Inconsistent stbl box for track ");
                                e73Var3 = e73Var2;
                                sb11.append(e73Var3.f76959a);
                                sb11.append(": remainingSynchronizationSamples ");
                                sb11.append(i13);
                                sb11.append(", remainingSamplesAtTimestampDelta ");
                                sb11.append(iP9);
                                sb11.append(", remainingSamplesInChunk ");
                                sb11.append(i19);
                                sb11.append(", remainingTimestampDeltaChanges ");
                                sb11.append(i6111118);
                                sb11.append(", remainingSamplesAtTimestampOffset ");
                                sb11.append(i20);
                                if (z14) {
                                    str = ", ctts invalid";
                                } else {
                                    str = str2;
                                }
                                sb11.append(str);
                                ih1.d("AtomParsers", sb11.toString());
                            } else {
                                i20 = iP8;
                                StringBuilder sb12 = new StringBuilder("Inconsistent stbl box for track ");
                                e73Var3 = e73Var2;
                                sb12.append(e73Var3.f76959a);
                                sb12.append(": remainingSynchronizationSamples ");
                                sb12.append(i13);
                                sb12.append(", remainingSamplesAtTimestampDelta ");
                                sb12.append(iP9);
                                sb12.append(", remainingSamplesInChunk ");
                                sb12.append(i19);
                                sb12.append(", remainingTimestampDeltaChanges ");
                                sb12.append(i6111118);
                                sb12.append(", remainingSamplesAtTimestampOffset ");
                                sb12.append(i20);
                                if (z14) {
                                    str = ", ctts invalid";
                                } else {
                                    str = str2;
                                }
                                sb12.append(str);
                                ih1.d("AtomParsers", sb12.toString());
                            }
                            iArr = iArrCopyOf2;
                            jArr3 = jArrCopyOf2;
                            jArr4 = jArrCopyOf;
                            iArr2 = iArrCopyOf;
                            i21 = i18;
                        }
                        jA = ib3.a(j13, 1000000L, e73Var3.f76961c);
                        jArr5 = e73Var3.f76966h;
                        if (jArr5 == null) {
                            ib3.a(jArr3, e73Var3.f76961c);
                            n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, jA);
                        } else if (jArr5.length != 1) {
                            j14 = 0;
                            jArr6 = e73Var3.f76966h;
                            if (jArr6.length == 1) {
                                i26 = 0;
                                if (jArr6[0] == j14) {
                                    long[] jArr11113 = e73Var3.f76967i;
                                    jArr11113.getClass();
                                    j18 = jArr11113[0];
                                    while (i41 < jArr3.length) {
                                        jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                    }
                                    n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                }
                            } else {
                                i26 = 0;
                            }
                            if (e73Var3.f76960b == 1) {
                                z15 = 1;
                            } else {
                                z15 = i26;
                            }
                            iArr3 = new int[jArr6.length];
                            iArr4 = new int[jArr6.length];
                            jArr7 = e73Var3.f76967i;
                            jArr7.getClass();
                            i27 = i26;
                            i28 = i27;
                            i29 = i28;
                            while (true) {
                                jArr8 = e73Var3.f76966h;
                                if (i27 < jArr8.length) {
                                    break;
                                    break;
                                }
                                int i61111110 = iB;
                                j17 = jArr7[i27];
                                if (j17 != -1) {
                                    int i711111110 = i28;
                                    long jA16 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                    i37 = 1;
                                    iArr3[i27] = ib3.b(jArr3, j17, true);
                                    iArr4[i27] = ib3.a(jArr3, j17 + jA16, z15);
                                    while (true) {
                                        i38 = iArr3[i27];
                                        i39 = iArr4[i27];
                                        if (i38 >= i39) {
                                            break;
                                            break;
                                        }
                                        break;
                                        break;
                                        iArr3[i27] = i38 + 1;
                                        i37 = 1;
                                    }
                                    int i711111111 = (i39 - i38) + i711111110;
                                    if (i26 != i38) {
                                        i40 = 1;
                                    } else {
                                        i40 = 0;
                                    }
                                    i29 |= i40;
                                    i26 = i39;
                                    i28 = i711111111;
                                }
                                i27++;
                                iB = i61111110;
                                iArr2 = iArr2;
                            }
                            iArr5 = iArr2;
                            if (i28 != iB) {
                                i30 = 1;
                            } else {
                                i30 = 0;
                            }
                            i31 = i29 | i30;
                            if (i31 != 0) {
                                jArr9 = new long[i28];
                            } else {
                                jArr9 = jArr4;
                            }
                            if (i31 != 0) {
                                iArr6 = new int[i28];
                            } else {
                                iArr6 = iArr5;
                            }
                            if (i31 != 0) {
                                i21 = 0;
                            }
                            if (i31 != 0) {
                                iArr7 = new int[i28];
                            } else {
                                iArr7 = iArr;
                            }
                            jArr10 = new long[i28];
                            i32 = i21;
                            i33 = 0;
                            i34 = 0;
                            j15 = 0;
                            while (i33 < e73Var3.f76966h.length) {
                                j16 = e73Var3.f76967i[i33];
                                i35 = iArr3[i33];
                                int[] iArr1118 = iArr3;
                                i36 = iArr4[i33];
                                if (i31 != 0) {
                                    int i711111112 = i36 - i35;
                                    System.arraycopy(jArr4, i35, jArr9, i34, i711111112);
                                    iArr8 = iArr5;
                                    System.arraycopy(iArr8, i35, iArr6, i34, i711111112);
                                    System.arraycopy(iArr, i35, iArr7, i34, i711111112);
                                } else {
                                    iArr8 = iArr5;
                                }
                                int i711111113 = i32;
                                while (i35 < i36) {
                                    long[] jArr11114 = jArr9;
                                    int[] iArr1119 = iArr7;
                                    long[] jArr210 = jArr3;
                                    long j2111 = j15;
                                    int i711111114 = i36;
                                    int i711111115 = i33;
                                    jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                    if (i31 == 0) {
                                    }
                                    i34++;
                                    i35++;
                                    i33 = i711111115;
                                    i36 = i711111114;
                                    jArr3 = jArr210;
                                    j15 = j2111;
                                    jArr9 = jArr11114;
                                    iArr7 = iArr1119;
                                }
                                int i711111116 = i33;
                                i32 = i711111113;
                                j15 += e73Var3.f76966h[i711111116];
                                i33 = i711111116 + 1;
                                jArr3 = jArr3;
                                jArr9 = jArr9;
                                iArr3 = iArr1118;
                                iArr4 = iArr4;
                                iArr7 = iArr7;
                                iArr5 = iArr8;
                                jArr4 = jArr4;
                            }
                            n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                        } else {
                            j14 = 0;
                            jArr6 = e73Var3.f76966h;
                            if (jArr6.length == 1) {
                                i26 = 0;
                                if (jArr6[0] == j14) {
                                    long[] jArr11115 = e73Var3.f76967i;
                                    jArr11115.getClass();
                                    j18 = jArr11115[0];
                                    while (i41 < jArr3.length) {
                                        jArr3[i41] = ib3.a(jArr3[i41] - j18, 1000000L, e73Var3.f76961c);
                                    }
                                    n73Var = new n73(e73Var3, jArr4, iArr2, i21, jArr3, iArr, ib3.a(j13 - j18, 1000000L, e73Var3.f76961c));
                                }
                            } else {
                                i26 = 0;
                            }
                            if (e73Var3.f76960b == 1) {
                                z15 = 1;
                            } else {
                                z15 = i26;
                            }
                            iArr3 = new int[jArr6.length];
                            iArr4 = new int[jArr6.length];
                            jArr7 = e73Var3.f76967i;
                            jArr7.getClass();
                            i27 = i26;
                            i28 = i27;
                            i29 = i28;
                            while (true) {
                                jArr8 = e73Var3.f76966h;
                                if (i27 < jArr8.length) {
                                    break;
                                    break;
                                }
                                int i61111111 = iB;
                                j17 = jArr7[i27];
                                if (j17 != -1) {
                                    int i711111117 = i28;
                                    long jA17 = ib3.a(jArr8[i27], e73Var3.f76961c, e73Var3.f76962d);
                                    i37 = 1;
                                    iArr3[i27] = ib3.b(jArr3, j17, true);
                                    iArr4[i27] = ib3.a(jArr3, j17 + jA17, z15);
                                    while (true) {
                                        i38 = iArr3[i27];
                                        i39 = iArr4[i27];
                                        if (i38 >= i39) {
                                            break;
                                            break;
                                        }
                                        break;
                                        break;
                                        iArr3[i27] = i38 + 1;
                                        i37 = 1;
                                    }
                                    int i711111118 = (i39 - i38) + i711111117;
                                    if (i26 != i38) {
                                        i40 = 1;
                                    } else {
                                        i40 = 0;
                                    }
                                    i29 |= i40;
                                    i26 = i39;
                                    i28 = i711111118;
                                }
                                i27++;
                                iB = i61111111;
                                iArr2 = iArr2;
                            }
                            iArr5 = iArr2;
                            if (i28 != iB) {
                                i30 = 1;
                            } else {
                                i30 = 0;
                            }
                            i31 = i29 | i30;
                            if (i31 != 0) {
                                jArr9 = new long[i28];
                            } else {
                                jArr9 = jArr4;
                            }
                            if (i31 != 0) {
                                iArr6 = new int[i28];
                            } else {
                                iArr6 = iArr5;
                            }
                            if (i31 != 0) {
                                i21 = 0;
                            }
                            if (i31 != 0) {
                                iArr7 = new int[i28];
                            } else {
                                iArr7 = iArr;
                            }
                            jArr10 = new long[i28];
                            i32 = i21;
                            i33 = 0;
                            i34 = 0;
                            j15 = 0;
                            while (i33 < e73Var3.f76966h.length) {
                                j16 = e73Var3.f76967i[i33];
                                i35 = iArr3[i33];
                                int[] iArr11110 = iArr3;
                                i36 = iArr4[i33];
                                if (i31 != 0) {
                                    int i711111119 = i36 - i35;
                                    System.arraycopy(jArr4, i35, jArr9, i34, i711111119);
                                    iArr8 = iArr5;
                                    System.arraycopy(iArr8, i35, iArr6, i34, i711111119);
                                    System.arraycopy(iArr, i35, iArr7, i34, i711111119);
                                } else {
                                    iArr8 = iArr5;
                                }
                                int i7111111110 = i32;
                                while (i35 < i36) {
                                    long[] jArr11116 = jArr9;
                                    int[] iArr11111 = iArr7;
                                    long[] jArr211 = jArr3;
                                    long j2112 = j15;
                                    int i7111111111 = i36;
                                    int i7111111112 = i33;
                                    jArr10[i34] = ib3.a(j15, 1000000L, e73Var3.f76962d) + ib3.a(Math.max(0L, jArr3[i35] - j16), 1000000L, e73Var3.f76961c);
                                    if (i31 == 0) {
                                    }
                                    i34++;
                                    i35++;
                                    i33 = i7111111112;
                                    i36 = i7111111111;
                                    jArr3 = jArr211;
                                    j15 = j2112;
                                    jArr9 = jArr11116;
                                    iArr7 = iArr11111;
                                }
                                int i7111111113 = i33;
                                i32 = i7111111110;
                                j15 += e73Var3.f76966h[i7111111113];
                                i33 = i7111111113 + 1;
                                jArr3 = jArr3;
                                jArr9 = jArr9;
                                iArr3 = iArr11110;
                                iArr4 = iArr4;
                                iArr7 = iArr7;
                                iArr5 = iArr8;
                                jArr4 = jArr4;
                            }
                            n73Var = new n73(e73Var3, jArr9, iArr6, i32, jArr10, iArr7, ib3.a(j15, 1000000L, e73Var3.f76962d));
                        }
                    }
                    arrayList = arrayList2;
                    arrayList.add(n73Var);
                }
            }
            i51++;
            arrayList2 = arrayList;
        }
        return arrayList2;
    }
}
