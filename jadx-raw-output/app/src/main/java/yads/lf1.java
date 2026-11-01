package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class lf1 implements vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p51 f79775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79776b;

    public final vl a(Class cls) {
        m51 m51VarListIterator = this.f79775a.listIterator(0);
        while (m51VarListIterator.hasNext()) {
            vl vlVar = (vl) m51VarListIterator.next();
            if (vlVar.getClass() == cls) {
                return vlVar;
            }
        }
        return null;
    }

    @Override // yads.vl
    public final int getType() {
        return this.f79776b;
    }

    public lf1(int i10, sm2 sm2Var) {
        this.f79776b = i10;
        this.f79775a = sm2Var;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x01c6, please report this as an issue */
    public static lf1 a(int i10, jb2 jb2Var) {
        int i11;
        String str;
        String str2;
        String str3;
        int i12;
        am amVar;
        int i13;
        int i14 = 4;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i15 = jb2Var.f78968c;
        int i16 = 0;
        int i17 = -2;
        int i18 = 0;
        while (jb2Var.f78968c - jb2Var.f78967b > 8) {
            int iD = jb2Var.d();
            int iD2 = jb2Var.f78967b + jb2Var.d();
            jb2Var.d(iD2);
            vl t33Var = null;
            if (iD == 1414744396) {
                t33Var = a(jb2Var.d(), jb2Var);
            } else if (iD != 1718776947) {
                if (iD == 1751742049) {
                    int iD3 = jb2Var.d();
                    jb2Var.e(jb2Var.f78967b + 8);
                    int iD4 = jb2Var.d();
                    int iD5 = jb2Var.d();
                    jb2Var.e(jb2Var.f78967b + i14);
                    jb2Var.d();
                    jb2Var.e(jb2Var.f78967b + 12);
                    t33Var = new zl(iD3, iD4, iD5);
                } else if (iD == 1752331379) {
                    int iD6 = jb2Var.d();
                    jb2Var.e(jb2Var.f78967b + 12);
                    jb2Var.d();
                    int iD7 = jb2Var.d();
                    int iD8 = jb2Var.d();
                    jb2Var.e(jb2Var.f78967b + i14);
                    int iD9 = jb2Var.d();
                    int iD10 = jb2Var.d();
                    jb2Var.e(jb2Var.f78967b + 8);
                    t33Var = new am(iD6, iD7, iD8, iD9, iD10);
                } else if (iD == 1852994675) {
                    t33Var = new w33(jb2Var.a(jb2Var.f78968c - jb2Var.f78967b, bu.f75964c));
                }
            } else if (i17 == 2) {
                jb2Var.e(jb2Var.f78967b + i14);
                int iD11 = jb2Var.d();
                int iD12 = jb2Var.d();
                jb2Var.e(jb2Var.f78967b + i14);
                int iD13 = jb2Var.d();
                switch (iD13) {
                    case 808802372:
                    case 877677894:
                    case 1145656883:
                    case 1145656920:
                    case 1482049860:
                    case 1684633208:
                    case 2021026148:
                        str2 = "video/mp4v-es";
                        str3 = str2;
                        break;
                    case 826496577:
                    case 828601953:
                    case 875967048:
                        str2 = "video/avc";
                        str3 = str2;
                        break;
                    case 842289229:
                        str2 = "video/mp42";
                        str3 = str2;
                        break;
                    case 859066445:
                        str2 = "video/mp43";
                        str3 = str2;
                        break;
                    case 1196444237:
                    case 1735420525:
                        str2 = "video/mjpeg";
                        str3 = str2;
                        break;
                    default:
                        str3 = null;
                        break;
                }
                if (str3 == null) {
                    kf1.a("Ignoring track with unsupported compression ", iD13, "StreamFormatChunk");
                } else {
                    lx0 lx0Var = new lx0();
                    lx0Var.f79972p = iD11;
                    lx0Var.f79973q = iD12;
                    lx0Var.f79967k = str3;
                    t33Var = new t33(new mx0(lx0Var));
                }
            } else {
                if (i17 == 1) {
                    int iH = jb2Var.h();
                    if (iH == 1) {
                        str = "audio/raw";
                    } else if (iH == 85) {
                        str = "audio/mpeg";
                    } else if (iH == 255) {
                        str = "audio/mp4a-latm";
                    } else if (iH != 8192) {
                        str = iH != 8193 ? null : "audio/vnd.dts";
                    } else {
                        str = "audio/ac3";
                    }
                    if (str == null) {
                        kf1.a("Ignoring track with unsupported format tag ", iH, "StreamFormatChunk");
                    } else {
                        int iH2 = jb2Var.h();
                        int iD14 = jb2Var.d();
                        jb2Var.e(jb2Var.f78967b + 6);
                        int iB = ib3.b(jb2Var.r());
                        int iH3 = jb2Var.h();
                        byte[] bArr = new byte[iH3];
                        jb2Var.a(bArr, i16, iH3);
                        lx0 lx0Var2 = new lx0();
                        lx0Var2.f79967k = str;
                        lx0Var2.f79980x = iH2;
                        lx0Var2.f79981y = iD14;
                        if ("audio/raw".equals(str) && iB != 0) {
                            lx0Var2.f79982z = iB;
                        }
                        if (!"audio/mp4a-latm".equals(str) || iH3 <= 0) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            lx0Var2.f79969m = p51.a(bArr);
                        }
                        t33Var = new t33(new mx0(lx0Var2));
                    }
                } else {
                    i11 = i16;
                    ih1.d("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + ib3.d(i17));
                }
                if (t33Var == null) {
                    if (t33Var.getType() == 1752331379) {
                        amVar = (am) t33Var;
                        i13 = amVar.f75562a;
                        if (i13 != 1935960438) {
                            i17 = 2;
                        } else if (i13 != 1935963489) {
                            i17 = 1;
                        } else if (i13 != 1937012852) {
                            ih1.d("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(amVar.f75562a));
                            i17 = -1;
                        } else {
                            i17 = 3;
                        }
                    }
                    i12 = i18 + 1;
                    if (objArrCopyOf.length < i12) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i12));
                    }
                    objArrCopyOf[i18] = t33Var;
                    i18 = i12;
                }
                jb2Var.e(iD2);
                jb2Var.d(i15);
                i16 = i11;
                i14 = 4;
            }
            i11 = i16;
            if (t33Var == null) {
                if (t33Var.getType() == 1752331379) {
                    amVar = (am) t33Var;
                    i13 = amVar.f75562a;
                    if (i13 != 1935960438) {
                        i17 = 2;
                    } else if (i13 != 1935963489) {
                        i17 = 1;
                    } else if (i13 != 1937012852) {
                        ih1.d("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(amVar.f75562a));
                        i17 = -1;
                    } else {
                        i17 = 3;
                    }
                }
                i12 = i18 + 1;
                if (objArrCopyOf.length < i12) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i12));
                }
                objArrCopyOf[i18] = t33Var;
                i18 = i12;
            }
            jb2Var.e(iD2);
            jb2Var.d(i15);
            i16 = i11;
            i14 = 4;
        }
        return new lf1(i10, p51.b(i18, objArrCopyOf));
    }
}
