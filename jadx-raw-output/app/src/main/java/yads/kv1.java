package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yads.e73;
import yads.kv1;
import yads.mq0;

/* JADX INFO: loaded from: classes11.dex */
public final class kv1 implements mq0, vw2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f79589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f79590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public jb2 f79591l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f79593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f79594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f79595p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[][] f79598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f79599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f79600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f79601v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79587h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bx2 f79585f = new bx2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f79586g = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f79583d = new jb2(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f79584e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f79580a = new jb2(dy1.f76843a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f79581b = new jb2(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f79582c = new jb2();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f79592m = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pq0 f79596q = pq0.f81537a;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jv1[] f79597r = new jv1[0];

    public static /* synthetic */ e73 a(e73 e73Var) {
        return e73Var;
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f79596q = pq0Var;
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f79600u;
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.c6
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return kv1.d();
            }
        };
    }

    public static mq0[] d() {
        return new mq0[]{new kv1()};
    }

    /* JADX WARN: Code duplicated, block: B:128:0x023a A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #0 {all -> 0x01c6, blocks: (B:31:0x00a7, B:33:0x00b7, B:36:0x00cc, B:38:0x00d2, B:41:0x00da, B:42:0x00e2, B:34:0x00c4, B:45:0x00f1, B:48:0x00fd, B:51:0x0109, B:55:0x011a, B:58:0x0128, B:61:0x0133, B:64:0x013f, B:67:0x014b, B:70:0x0157, B:73:0x0163, B:76:0x016f, B:79:0x017b, B:82:0x0189, B:85:0x0196, B:88:0x01a3, B:91:0x01b0, B:128:0x023a, B:92:0x01b6, B:94:0x01c0, B:109:0x01e6, B:112:0x01f3, B:115:0x0200, B:118:0x020d, B:121:0x021a, B:124:0x0227, B:127:0x0232, B:130:0x0252, B:131:0x025a), top: B:299:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x041b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x023a, please report this as an issue */
    public final void a(vj vjVar) {
        int i10;
        ts1 ts1Var;
        ts1 ts1Var2;
        ts1 ts1Var3;
        long j10;
        int i11;
        int i12;
        int i13;
        int i14;
        gj1 gj1Var;
        v21 v21VarB;
        v21 v21VarA;
        int iM;
        String str;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f79601v == 1;
        zy0 zy0Var = new zy0();
        wj wjVarC = vjVar.c(1969517665);
        int i15 = 1768715124;
        int i16 = 1751411826;
        int i17 = 1835365473;
        int i18 = 8;
        if (wjVarC != null) {
            byte[] bArr = ek.f77101a;
            jb2 jb2Var = wjVarC.f84218b;
            jb2Var.e(8);
            ts1 ts1Var4 = null;
            ts1 ts1Var5 = null;
            while (true) {
                int i19 = jb2Var.f78968c;
                int i20 = jb2Var.f78967b;
                if (i19 - i20 < i18) {
                    break;
                }
                int iB = jb2Var.b();
                int iB2 = jb2Var.b();
                if (iB2 == i17) {
                    jb2Var.e(i20);
                    int i21 = i20 + iB;
                    jb2Var.e(jb2Var.f78967b + i18);
                    int i22 = jb2Var.f78967b;
                    int i23 = i22 + 4;
                    jb2Var.e(i23);
                    if (jb2Var.b() != i16) {
                        i22 = i23;
                    }
                    jb2Var.e(i22);
                    while (true) {
                        int i24 = jb2Var.f78967b;
                        if (i24 < i21) {
                            int iB3 = jb2Var.b();
                            if (jb2Var.b() == i15) {
                                jb2Var.e(i24);
                                int i25 = i24 + iB3;
                                jb2Var.e(jb2Var.f78967b + i18);
                                ArrayList arrayList2 = new ArrayList();
                                while (true) {
                                    int i26 = jb2Var.f78967b;
                                    if (i26 >= i25) {
                                        break;
                                    }
                                    int iB4 = jb2Var.b() + i26;
                                    int iB5 = jb2Var.b();
                                    int i27 = (iB5 >> 24) & 255;
                                    int i28 = i25;
                                    if (i27 == 169 || i27 == 253) {
                                        int i29 = 16777215 & iB5;
                                        if (i29 == 6516084) {
                                            v21VarA = zs1.a(iB5, jb2Var);
                                        } else {
                                            if (i29 == 7233901 || i29 == 7631467) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TIT2");
                                            } else if (i29 == 6516589 || i29 == 7828084) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TCOM");
                                            } else if (i29 == 6578553) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TDRC");
                                            } else if (i29 == 4280916) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TPE1");
                                            } else if (i29 == 7630703) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TSSE");
                                            } else if (i29 == 6384738) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TALB");
                                            } else if (i29 == 7108978) {
                                                v21VarB = zs1.b(iB5, jb2Var, "USLT");
                                            } else if (i29 == 6776174) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TCON");
                                            } else if (i29 == 6779504) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TIT1");
                                            } else {
                                                ih1.a("MetadataUtil", "Skipped unknown metadata entry: " + xj.a(iB5));
                                                jb2Var.e(iB4);
                                                v21VarA = null;
                                            }
                                            v21VarA = v21VarB;
                                        }
                                        jb2Var.e(iB4);
                                    } else {
                                        if (iB5 == 1735291493) {
                                            try {
                                                jb2Var.e(jb2Var.f78967b + 4);
                                                if (jb2Var.b() == 1684108385) {
                                                    jb2Var.e(jb2Var.f78967b + 8);
                                                    iM = jb2Var.m();
                                                } else {
                                                    ih1.d("MetadataUtil", "Failed to parse uint8 attribute value");
                                                    iM = -1;
                                                }
                                                if (iM > 0) {
                                                    String[] strArr = zs1.f85578a;
                                                    if (iM <= 192) {
                                                        str = strArr[iM - 1];
                                                    } else {
                                                        str = null;
                                                    }
                                                } else {
                                                    str = null;
                                                }
                                                if (str != null) {
                                                    v21VarA = new y53("TCON", null, str);
                                                } else {
                                                    ih1.d("MetadataUtil", "Failed to parse standard genre code");
                                                    v21VarA = null;
                                                }
                                            } catch (Throwable th2) {
                                                jb2Var.e(iB4);
                                                throw th2;
                                            }
                                        } else {
                                            if (iB5 == 1684632427) {
                                                v21VarB = zs1.a(iB5, jb2Var, "TPOS");
                                            } else if (iB5 == 1953655662) {
                                                v21VarB = zs1.a(iB5, jb2Var, "TRCK");
                                            } else if (iB5 == 1953329263) {
                                                v21VarB = zs1.a(iB5, "TBPM", jb2Var, true, false);
                                            } else if (iB5 == 1668311404) {
                                                v21VarA = zs1.a(iB5, "TCMP", jb2Var, true, true);
                                            } else if (iB5 == 1668249202) {
                                                v21VarA = zs1.a(jb2Var);
                                            } else if (iB5 == 1631670868) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TPE2");
                                            } else if (iB5 == 1936682605) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TSOT");
                                            } else if (iB5 == 1936679276) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TSO2");
                                            } else if (iB5 == 1936679282) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TSOA");
                                            } else if (iB5 == 1936679265) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TSOP");
                                            } else if (iB5 == 1936679791) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TSOC");
                                            } else if (iB5 == 1920233063) {
                                                v21VarB = zs1.a(iB5, "ITUNESADVISORY", jb2Var, false, false);
                                            } else if (iB5 == 1885823344) {
                                                v21VarB = zs1.a(iB5, "ITUNESGAPLESS", jb2Var, false, true);
                                            } else if (iB5 == 1936683886) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TVSHOWSORT");
                                            } else if (iB5 == 1953919848) {
                                                v21VarB = zs1.b(iB5, jb2Var, "TVSHOW");
                                            } else if (iB5 == 757935405) {
                                                v21VarA = zs1.b(iB4, jb2Var);
                                            } else {
                                                ih1.a("MetadataUtil", "Skipped unknown metadata entry: " + xj.a(iB5));
                                                jb2Var.e(iB4);
                                                v21VarA = null;
                                            }
                                            v21VarA = v21VarB;
                                        }
                                        jb2Var.e(iB4);
                                    }
                                    if (v21VarA != null) {
                                        arrayList2.add(v21VarA);
                                    }
                                    i25 = i28;
                                }
                                if (!arrayList2.isEmpty()) {
                                    ts1Var4 = new ts1(arrayList2);
                                    break;
                                }
                            } else {
                                jb2Var.e(i24 + iB3);
                                i15 = 1768715124;
                                i18 = 8;
                            }
                        }
                        ts1Var4 = null;
                        break;
                    }
                } else if (iB2 == 1936553057) {
                    jb2Var.e(i20);
                    int i30 = i20 + iB;
                    jb2Var.e(jb2Var.f78967b + 12);
                    while (true) {
                        int i31 = jb2Var.f78967b;
                        if (i31 < i30) {
                            int iB6 = jb2Var.b();
                            if (jb2Var.b() != 1935766900) {
                                jb2Var.e(i31 + iB6);
                            } else if (iB6 >= 14) {
                                jb2Var.e(jb2Var.f78967b + 5);
                                int iM2 = jb2Var.m();
                                if (iM2 == 12 || iM2 == 13) {
                                    float f10 = iM2 == 12 ? 240.0f : 120.0f;
                                    jb2Var.e(jb2Var.f78967b + 1);
                                    ts1Var5 = new ts1(new r13(jb2Var.m(), f10));
                                    break;
                                }
                            }
                        }
                        ts1Var5 = null;
                        break;
                    }
                }
                jb2Var.e(i20 + iB);
                i15 = 1768715124;
                i16 = 1751411826;
                i17 = 1835365473;
                i18 = 8;
            }
            Pair pairCreate = Pair.create(ts1Var4, ts1Var5);
            ts1 ts1Var6 = (ts1) pairCreate.first;
            ts1 ts1Var7 = (ts1) pairCreate.second;
            if (ts1Var6 != null) {
                zy0Var.a(ts1Var6);
            }
            ts1Var = ts1Var7;
            ts1Var2 = ts1Var6;
            i10 = 1835365473;
        } else {
            i10 = 1835365473;
            ts1Var = null;
            ts1Var2 = null;
        }
        vj vjVarB = vjVar.b(i10);
        if (vjVarB != null) {
            byte[] bArr2 = ek.f77101a;
            wj wjVarC2 = vjVarB.c(1751411826);
            wj wjVarC3 = vjVarB.c(1801812339);
            wj wjVarC4 = vjVarB.c(1768715124);
            if (wjVarC2 == null || wjVarC3 == null || wjVarC4 == null) {
                ts1Var3 = null;
            } else {
                jb2 jb2Var2 = wjVarC2.f84218b;
                jb2Var2.e(16);
                if (jb2Var2.b() != 1835299937) {
                    ts1Var3 = null;
                } else {
                    jb2 jb2Var3 = wjVarC3.f84218b;
                    jb2Var3.e(12);
                    int iB7 = jb2Var3.b();
                    String[] strArr2 = new String[iB7];
                    for (int i32 = 0; i32 < iB7; i32++) {
                        int iB8 = jb2Var3.b();
                        jb2Var3.e(jb2Var3.f78967b + 4);
                        strArr2[i32] = jb2Var3.a(iB8 - 8, bu.f75964c);
                    }
                    int i33 = 8;
                    jb2 jb2Var4 = wjVarC4.f84218b;
                    jb2Var4.e(8);
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        int i34 = jb2Var4.f78968c;
                        int i35 = jb2Var4.f78967b;
                        if (i34 - i35 <= i33) {
                            break;
                        }
                        int iB9 = jb2Var4.b();
                        int iB10 = jb2Var4.b() - 1;
                        if (iB10 < 0 || iB10 >= iB7) {
                            i14 = iB7;
                            strArr2 = strArr2;
                            kf1.a("Skipped metadata with unknown key index: ", iB10, "AtomParsers");
                        } else {
                            String str2 = strArr2[iB10];
                            int i36 = i35 + iB9;
                            while (true) {
                                int i37 = jb2Var4.f78967b;
                                if (i37 >= i36) {
                                    i14 = iB7;
                                    gj1Var = null;
                                    break;
                                }
                                int iB11 = jb2Var4.b();
                                i14 = iB7;
                                if (jb2Var4.b() == 1684108385) {
                                    int iB12 = jb2Var4.b();
                                    int iB13 = jb2Var4.b();
                                    int i38 = iB11 - 16;
                                    byte[] bArr3 = new byte[i38];
                                    jb2Var4.a(bArr3, 0, i38);
                                    gj1Var = new gj1(iB13, iB12, str2, bArr3);
                                    break;
                                }
                                jb2Var4.e(i37 + iB11);
                                iB7 = i14;
                            }
                            if (gj1Var != null) {
                                arrayList3.add(gj1Var);
                            }
                        }
                        jb2Var4.e(i35 + iB9);
                        iB7 = i14;
                        strArr2 = strArr2;
                        i33 = 8;
                    }
                    if (arrayList3.isEmpty()) {
                        ts1Var3 = null;
                    } else {
                        ts1Var3 = new ts1(arrayList3);
                    }
                }
            }
        } else {
            ts1Var3 = null;
        }
        long j11 = -9223372036854775807L;
        ArrayList arrayListA = ek.a(vjVar, zy0Var, -9223372036854775807L, null, false, z10, new wy0() { // from class: cp.b6
            @Override // yads.wy0
            public final Object apply(Object obj) {
                return kv1.a((e73) obj);
            }
        });
        int size = arrayListA.size();
        long j12 = -9223372036854775807L;
        int i39 = 0;
        int size2 = -1;
        while (true) {
            j10 = 0;
            if (i39 >= size) {
                break;
            }
            n73 n73Var = (n73) arrayListA.get(i39);
            if (n73Var.f80584b != 0) {
                e73 e73Var = n73Var.f80583a;
                long j13 = e73Var.f76963e;
                if (j13 == j11) {
                    j13 = n73Var.f80590h;
                }
                long jMax = Math.max(j12, j13);
                jv1 jv1Var = new jv1(e73Var, n73Var, this.f79596q.a(i39, e73Var.f76960b));
                int i40 = "audio/true-hd".equals(e73Var.f76964f.f80429m) ? n73Var.f80587e * 16 : n73Var.f80587e + 30;
                mx0 mx0Var = e73Var.f76964f;
                mx0Var.getClass();
                lx0 lx0Var = new lx0(mx0Var);
                lx0Var.f79968l = i40;
                int i41 = e73Var.f76960b;
                if (i41 != 2 || j13 <= 0) {
                    i11 = 1;
                } else {
                    int i42 = n73Var.f80584b;
                    i11 = 1;
                    if (i42 > 1) {
                        lx0Var.f79974r = i42 / (j13 / 1000000.0f);
                    }
                }
                if (i41 == i11 && (i12 = zy0Var.f85653a) != -1 && (i13 = zy0Var.f85654b) != -1) {
                    lx0Var.A = i12;
                    lx0Var.B = i13;
                }
                ts1[] ts1VarArr = new ts1[2];
                ts1VarArr[0] = ts1Var;
                ts1VarArr[1] = this.f79586g.isEmpty() ? null : new ts1(this.f79586g);
                ts1 ts1Var8 = new ts1(new ss1[0]);
                if (i41 != 1) {
                    if (i41 == 2 && ts1Var3 != null) {
                        int i43 = 0;
                        while (true) {
                            ss1[] ss1VarArr = ts1Var3.f83163b;
                            if (i43 >= ss1VarArr.length) {
                                break;
                            }
                            ss1 ss1Var = ss1VarArr[i43];
                            if (ss1Var instanceof gj1) {
                                gj1 gj1Var2 = (gj1) ss1Var;
                                if ("com.android.capture.fps".equals(gj1Var2.f77824b)) {
                                    ts1Var8 = new ts1(gj1Var2);
                                    break;
                                }
                            }
                            i43++;
                        }
                    }
                } else if (ts1Var2 != null) {
                    ts1Var8 = ts1Var2;
                }
                for (int i44 = 0; i44 < 2; i44++) {
                    ts1 ts1Var9 = ts1VarArr[i44];
                    if (ts1Var9 != null) {
                        ss1[] ss1VarArr2 = ts1Var9.f83163b;
                        ts1Var8.getClass();
                        if (ss1VarArr2.length != 0) {
                            ts1Var8 = new ts1((ss1[]) ib3.a((Object[]) ts1Var8.f83163b, (Object[]) ss1VarArr2));
                        }
                    }
                }
                if (ts1Var8.f83163b.length > 0) {
                    lx0Var.f79965i = ts1Var8;
                }
                jv1Var.f79208c.a(new mx0(lx0Var));
                if (e73Var.f76960b == 2 && size2 == -1) {
                    size2 = arrayList.size();
                }
                arrayList.add(jv1Var);
                j12 = jMax;
            }
            i39++;
            arrayListA = arrayListA;
            size = size;
            ts1Var = ts1Var;
            j11 = -9223372036854775807L;
        }
        this.f79599t = size2;
        this.f79600u = j12;
        jv1[] jv1VarArr = (jv1[]) arrayList.toArray(new jv1[0]);
        this.f79597r = jv1VarArr;
        long[][] jArr = new long[jv1VarArr.length][];
        int[] iArr = new int[jv1VarArr.length];
        long[] jArr2 = new long[jv1VarArr.length];
        boolean[] zArr = new boolean[jv1VarArr.length];
        for (int i45 = 0; i45 < jv1VarArr.length; i45++) {
            jArr[i45] = new long[jv1VarArr[i45].f79207b.f80584b];
            jArr2[i45] = jv1VarArr[i45].f79207b.f80588f[0];
        }
        int i46 = 0;
        while (i46 < jv1VarArr.length) {
            int i47 = -1;
            long j14 = Long.MAX_VALUE;
            for (int i48 = 0; i48 < jv1VarArr.length; i48++) {
                if (!zArr[i48]) {
                    long j15 = jArr2[i48];
                    if (j15 <= j14) {
                        i47 = i48;
                        j14 = j15;
                    }
                }
            }
            int i49 = iArr[i47];
            long[] jArr3 = jArr[i47];
            jArr3[i49] = j10;
            n73 n73Var2 = jv1VarArr[i47].f79207b;
            j10 += (long) n73Var2.f80586d[i49];
            int i50 = i49 + 1;
            iArr[i47] = i50;
            if (i50 < jArr3.length) {
                jArr2[i47] = n73Var2.f80588f[i50];
            } else {
                zArr[i47] = true;
                i46++;
            }
        }
        this.f79598s = jArr;
        this.f79596q.a();
        this.f79596q.a(this);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long jMin;
        long jMin2;
        long j11;
        long j12;
        int iA;
        long j13 = j10;
        jv1[] jv1VarArr = this.f79597r;
        if (jv1VarArr.length == 0) {
            xw2 xw2Var = xw2.f84726c;
            return new tw2(xw2Var, xw2Var);
        }
        int i10 = this.f79599t;
        boolean z10 = false;
        int i11 = -1;
        if (i10 != -1) {
            n73 n73Var = jv1VarArr[i10].f79207b;
            int iB = ib3.b(n73Var.f80588f, j13, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                }
                if ((n73Var.f80589g[iB] & 1) != 0) {
                    break;
                }
                iB--;
            }
            if (iB == -1) {
                iB = n73Var.a(j13);
            }
            if (iB == -1) {
                xw2 xw2Var2 = xw2.f84726c;
                return new tw2(xw2Var2, xw2Var2);
            }
            long j14 = n73Var.f80588f[iB];
            jMin = n73Var.f80585c[iB];
            if (j14 >= j13 || iB >= n73Var.f80584b - 1 || (iA = n73Var.a(j13)) == -1 || iA == iB) {
                j12 = -1;
                j11 = -9223372036854775807L;
            } else {
                j11 = n73Var.f80588f[iA];
                j12 = n73Var.f80585c[iA];
            }
            long j15 = j12;
            j13 = j14;
            jMin2 = j15;
        } else {
            jMin = Long.MAX_VALUE;
            jMin2 = -1;
            j11 = -9223372036854775807L;
        }
        int i12 = 0;
        while (true) {
            jv1[] jv1VarArr2 = this.f79597r;
            if (i12 >= jv1VarArr2.length) {
                break;
            }
            if (i12 != this.f79599t) {
                n73 n73Var2 = jv1VarArr2[i12].f79207b;
                int iB2 = ib3.b(n73Var2.f80588f, j13, z10);
                while (true) {
                    if (iB2 < 0) {
                        iB2 = i11;
                        break;
                    }
                    if ((n73Var2.f80589g[iB2] & 1) != 0) {
                        break;
                    }
                    iB2--;
                }
                if (iB2 == i11) {
                    iB2 = n73Var2.a(j13);
                }
                if (iB2 != i11) {
                    jMin = Math.min(n73Var2.f80585c[iB2], jMin);
                }
                if (j11 != -9223372036854775807L) {
                    int iB3 = ib3.b(n73Var2.f80588f, j11, false);
                    while (true) {
                        if (iB3 < 0) {
                            iB3 = -1;
                            break;
                        }
                        if ((n73Var2.f80589g[iB3] & 1) != 0) {
                            break;
                        }
                        iB3--;
                    }
                    if (iB3 == -1) {
                        iB3 = n73Var2.a(j11);
                    }
                    if (iB3 != -1) {
                        jMin2 = Math.min(n73Var2.f80585c[iB3], jMin2);
                    }
                    i12++;
                    z10 = false;
                    i11 = -1;
                }
            }
            jMin2 = jMin2;
            i12++;
            z10 = false;
            i11 = -1;
        }
        long j16 = jMin2;
        xw2 xw2Var3 = new xw2(j13, jMin);
        return j11 == -9223372036854775807L ? new tw2(xw2Var3, xw2Var3) : new tw2(xw2Var3, new xw2(j11, j16));
    }

    public final void c(long j10) {
        while (!this.f79584e.isEmpty() && ((vj) this.f79584e.peek()).f83937b == j10) {
            vj vjVar = (vj) this.f79584e.pop();
            if (vjVar.f84603a == 1836019574) {
                a(vjVar);
                this.f79584e.clear();
                this.f79587h = 2;
            } else if (!this.f79584e.isEmpty()) {
                ((vj) this.f79584e.peek()).f83939d.add(vjVar);
            }
        }
        if (this.f79587h != 2) {
            this.f79587h = 0;
            this.f79590k = 0;
        }
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f79584e.clear();
        this.f79590k = 0;
        this.f79592m = -1;
        this.f79593n = 0;
        this.f79594o = 0;
        this.f79595p = 0;
        if (j10 == 0) {
            if (this.f79587h != 3) {
                this.f79587h = 0;
                this.f79590k = 0;
                return;
            } else {
                bx2 bx2Var = this.f79585f;
                bx2Var.f76009a.clear();
                bx2Var.f76010b = 0;
                this.f79586g.clear();
                return;
            }
        }
        for (jv1 jv1Var : this.f79597r) {
            n73 n73Var = jv1Var.f79207b;
            int iB = ib3.b(n73Var.f80588f, j11, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                } else if ((n73Var.f80589g[iB] & 1) != 0) {
                    break;
                } else {
                    iB--;
                }
            }
            if (iB == -1) {
                iB = n73Var.a(j11);
            }
            jv1Var.f79210e = iB;
            z83 z83Var = jv1Var.f79209d;
            if (z83Var != null) {
                z83Var.f85245b = false;
                z83Var.f85246c = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) {
        char c10;
        ArrayList arrayList;
        boolean z10;
        vj vjVar;
        while (true) {
            int i10 = this.f79587h;
            int i11 = 8;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        long jA = nq0Var.a();
                        if (this.f79592m == -1) {
                            boolean z11 = true;
                            boolean z12 = true;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = 0;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            long j12 = Long.MAX_VALUE;
                            while (true) {
                                jv1[] jv1VarArr = this.f79597r;
                                if (i14 >= jv1VarArr.length) {
                                    break;
                                }
                                jv1 jv1Var = jv1VarArr[i14];
                                int i15 = jv1Var.f79210e;
                                n73 n73Var = jv1Var.f79207b;
                                if (i15 != n73Var.f80584b) {
                                    long j13 = n73Var.f80585c[i15];
                                    long[][] jArr = this.f79598s;
                                    int i16 = ib3.f78556a;
                                    long j14 = jArr[i14][i15];
                                    long j15 = j13 - jA;
                                    boolean z13 = j15 < 0 || j15 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                    if ((!z13 && z12) || (z13 == z12 && j15 < j12)) {
                                        z12 = z13;
                                        j12 = j15;
                                        i13 = i14;
                                        j11 = j14;
                                    }
                                    if (j14 < j10) {
                                        z11 = z13;
                                        i12 = i14;
                                        j10 = j14;
                                    }
                                }
                                i14++;
                            }
                            if (j10 == Long.MAX_VALUE || !z11 || j11 < j10 + 10485760) {
                                i12 = i13;
                            }
                            this.f79592m = i12;
                            if (i12 == -1) {
                                return -1;
                            }
                        }
                        jv1 jv1Var2 = this.f79597r[this.f79592m];
                        m73 m73Var = jv1Var2.f79208c;
                        int i17 = jv1Var2.f79210e;
                        n73 n73Var2 = jv1Var2.f79207b;
                        long j16 = n73Var2.f80585c[i17];
                        int i18 = n73Var2.f80586d[i17];
                        z83 z83Var = jv1Var2.f79209d;
                        long j17 = (j16 - jA) + ((long) this.f79593n);
                        if (j17 >= 0 && j17 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            if (jv1Var2.f79206a.f76965g == 1) {
                                j17 += 8;
                                i18 -= 8;
                            }
                            nq0Var.a((int) j17);
                            e73 e73Var = jv1Var2.f79206a;
                            int i19 = e73Var.f76968j;
                            if (i19 != 0) {
                                byte[] bArr = this.f79581b.f78966a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i20 = 4 - i19;
                                while (this.f79594o < i18) {
                                    int i21 = this.f79595p;
                                    if (i21 == 0) {
                                        nq0Var.readFully(bArr, i20, i19);
                                        this.f79593n += i19;
                                        this.f79581b.e(0);
                                        int iB = this.f79581b.b();
                                        if (iB >= 0) {
                                            this.f79595p = iB;
                                            this.f79580a.e(0);
                                            m73Var.a(4, this.f79580a);
                                            this.f79594o += 4;
                                            i18 += i20;
                                        } else {
                                            throw new ob2("Invalid NAL length", null, true, 1);
                                        }
                                    } else {
                                        int iA = m73Var.a(nq0Var, i21, false);
                                        this.f79593n += iA;
                                        this.f79594o += iA;
                                        this.f79595p -= iA;
                                    }
                                }
                            } else {
                                if ("audio/ac4".equals(e73Var.f76964f.f80429m)) {
                                    if (this.f79594o == 0) {
                                        l0.a(i18, this.f79582c);
                                        m73Var.a(7, this.f79582c);
                                        this.f79594o += 7;
                                    }
                                    i18 += 7;
                                } else if (z83Var != null) {
                                    z83Var.a(nq0Var);
                                }
                                while (true) {
                                    int i22 = this.f79594o;
                                    if (i22 >= i18) {
                                        break;
                                    }
                                    int iA2 = m73Var.a(nq0Var, i18 - i22, false);
                                    this.f79593n += iA2;
                                    this.f79594o += iA2;
                                    this.f79595p -= iA2;
                                }
                            }
                            int i23 = i18;
                            n73 n73Var3 = jv1Var2.f79207b;
                            long j18 = n73Var3.f80588f[i17];
                            int i24 = n73Var3.f80589g[i17];
                            if (z83Var != null) {
                                z83Var.a(m73Var, j18, i24, i23, 0, null);
                                if (i17 + 1 == jv1Var2.f79207b.f80584b && z83Var.f85246c > 0) {
                                    m73Var.a(z83Var.f85247d, z83Var.f85248e, z83Var.f85249f, z83Var.f85250g, null);
                                    z83Var.f85246c = 0;
                                }
                            } else {
                                m73Var.a(j18, i24, i23, 0, null);
                            }
                            jv1Var2.f79210e++;
                            this.f79592m = -1;
                            this.f79593n = 0;
                            this.f79594o = 0;
                            this.f79595p = 0;
                            return 0;
                        }
                        gg2Var.f77799a = j16;
                        return 1;
                    }
                    if (i10 == 3) {
                        bx2 bx2Var = this.f79585f;
                        ArrayList arrayList2 = this.f79586g;
                        int i25 = bx2Var.f76010b;
                        if (i25 == 0) {
                            long length = nq0Var.getLength();
                            gg2Var.f77799a = (length == -1 || length < 8) ? 0L : length - 8;
                            bx2Var.f76010b = 1;
                        } else if (i25 != 1) {
                            char c11 = 2819;
                            short s10 = 2192;
                            if (i25 == 2) {
                                long length2 = nq0Var.getLength();
                                int i26 = bx2Var.f76011c - 20;
                                jb2 jb2Var = new jb2(i26);
                                nq0Var.readFully(jb2Var.f78966a, 0, i26);
                                int i27 = 0;
                                while (i27 < i26 / 12) {
                                    jb2Var.e(jb2Var.f78967b + 2);
                                    short sF = jb2Var.f();
                                    if (sF != s10 && sF != 2816) {
                                        if (sF != 2817) {
                                            if (sF != 2819 && sF != 2820) {
                                                jb2Var.e(jb2Var.f78967b + 8);
                                            }
                                            i27++;
                                            length2 = length2;
                                            s10 = 2192;
                                        }
                                        bx2Var.f76009a.add(new ax2(jb2Var.d(), (length2 - ((long) bx2Var.f76011c)) - ((long) jb2Var.d())));
                                        i27++;
                                        length2 = length2;
                                        s10 = 2192;
                                    }
                                    bx2Var.f76009a.add(new ax2(jb2Var.d(), (length2 - ((long) bx2Var.f76011c)) - ((long) jb2Var.d())));
                                    i27++;
                                    length2 = length2;
                                    s10 = 2192;
                                }
                                if (bx2Var.f76009a.isEmpty()) {
                                    gg2Var.f77799a = 0L;
                                } else {
                                    bx2Var.f76010b = 3;
                                    gg2Var.f77799a = ((ax2) bx2Var.f76009a.get(0)).f75652a;
                                }
                            } else if (i25 == 3) {
                                long jA2 = nq0Var.a();
                                ArrayList arrayList3 = arrayList2;
                                int length3 = (int) ((nq0Var.getLength() - nq0Var.a()) - ((long) bx2Var.f76011c));
                                byte[] bArr2 = new byte[length3];
                                nq0Var.readFully(bArr2, 0, length3);
                                int i28 = 0;
                                while (i28 < bx2Var.f76009a.size()) {
                                    ax2 ax2Var = (ax2) bx2Var.f76009a.get(i28);
                                    int i29 = (int) (ax2Var.f75652a - jA2);
                                    if (i29 < 0 || i29 > length3) {
                                        throw new IllegalArgumentException();
                                    }
                                    int i30 = i29 + 4;
                                    if (i30 >= 0 && i30 <= length3) {
                                        int i31 = ((bArr2[i29 + 5] & 255) << i11) | (bArr2[i30] & 255);
                                        int i32 = i29 + 7;
                                        int i33 = i31 | ((bArr2[i29 + 6] & 255) << 16);
                                        int i34 = i29 + 8;
                                        int i35 = i33 | ((bArr2[i32] & 255) << 24);
                                        Charset charset = bu.f75964c;
                                        String str = new String(bArr2, i34, i35, charset);
                                        int i36 = i34 + i35;
                                        switch (str) {
                                            case "SlowMotion_Data":
                                                c10 = 2192;
                                                break;
                                            case "Super_SlowMotion_Edit_Data":
                                                c10 = c11;
                                                break;
                                            case "Super_SlowMotion_Data":
                                                c10 = 2816;
                                                break;
                                            case "Super_SlowMotion_Deflickering_On":
                                                c10 = 2820;
                                                break;
                                            case "Super_SlowMotion_BGM":
                                                c10 = 2817;
                                                break;
                                            default:
                                                throw new ob2("Invalid SEF name", null, true, 1);
                                        }
                                        int i37 = ax2Var.f75653b - (i35 + 8);
                                        if (c10 == 2192) {
                                            ArrayList arrayList4 = new ArrayList();
                                            String str2 = new String(bArr2, i36, i37, charset);
                                            w23 w23Var = bx2.f76008e;
                                            w23Var.getClass();
                                            v23 v23Var = w23Var.f84080b;
                                            v23Var.getClass();
                                            u23 u23Var = new u23(v23Var, w23Var, str2);
                                            ArrayList arrayList5 = new ArrayList();
                                            while (u23Var.hasNext()) {
                                                arrayList5.add((String) u23Var.next());
                                            }
                                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                            for (int i38 = 0; i38 < listUnmodifiableList.size(); i38++) {
                                                w23 w23Var2 = bx2.f76007d;
                                                CharSequence charSequence = (CharSequence) listUnmodifiableList.get(i38);
                                                w23Var2.getClass();
                                                charSequence.getClass();
                                                v23 v23Var2 = w23Var2.f84080b;
                                                v23Var2.getClass();
                                                u23 u23Var2 = new u23(v23Var2, w23Var2, charSequence);
                                                ArrayList arrayList6 = new ArrayList();
                                                while (u23Var2.hasNext()) {
                                                    arrayList6.add((String) u23Var2.next());
                                                }
                                                List listUnmodifiableList2 = Collections.unmodifiableList(arrayList6);
                                                if (listUnmodifiableList2.size() == 3) {
                                                    try {
                                                        arrayList4.add(new e13(1 << (Integer.parseInt((String) listUnmodifiableList2.get(2)) - 1), Long.parseLong((String) listUnmodifiableList2.get(0)), Long.parseLong((String) listUnmodifiableList2.get(1))));
                                                    } catch (NumberFormatException e10) {
                                                        throw new ob2(null, e10, true, 1);
                                                    }
                                                } else {
                                                    throw new ob2(null, null, true, 1);
                                                }
                                            }
                                            f13 f13Var = new f13(arrayList4);
                                            arrayList = arrayList3;
                                            arrayList.add(f13Var);
                                        } else {
                                            if (c10 != 2816 && c10 != 2817 && c10 != c11 && c10 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            arrayList = arrayList3;
                                        }
                                        i28++;
                                        arrayList3 = arrayList;
                                        c11 = 2819;
                                        i11 = 8;
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                }
                                gg2Var.f77799a = 0L;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            jb2 jb2Var2 = new jb2(8);
                            nq0Var.readFully(jb2Var2.f78966a, 0, 8);
                            bx2Var.f76011c = jb2Var2.d() + 8;
                            if (jb2Var2.b() != 1397048916) {
                                gg2Var.f77799a = 0L;
                            } else {
                                gg2Var.f77799a = nq0Var.a() - ((long) (bx2Var.f76011c - 12));
                                bx2Var.f76010b = 2;
                            }
                        }
                        if (gg2Var.f77799a == 0) {
                            this.f79587h = 0;
                            this.f79590k = 0;
                        }
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                long j19 = this.f79589j - ((long) this.f79590k);
                long jA3 = nq0Var.a() + j19;
                jb2 jb2Var3 = this.f79591l;
                if (jb2Var3 != null) {
                    nq0Var.readFully(jb2Var3.f78966a, this.f79590k, (int) j19);
                    if (this.f79588i == 1718909296) {
                        jb2Var3.e(8);
                        int iB2 = jb2Var3.b();
                        int i39 = iB2 != 1751476579 ? iB2 != 1903435808 ? 0 : 1 : 2;
                        if (i39 == 0) {
                            jb2Var3.e(jb2Var3.f78967b + 4);
                            do {
                                if (jb2Var3.f78968c - jb2Var3.f78967b <= 0) {
                                    i39 = 0;
                                    break;
                                }
                                int iB3 = jb2Var3.b();
                                i39 = iB3 != 1751476579 ? iB3 != 1903435808 ? 0 : 1 : 2;
                            } while (i39 == 0);
                        }
                        this.f79601v = i39;
                    } else if (!this.f79584e.isEmpty()) {
                        ((vj) this.f79584e.peek()).f83938c.add(new wj(this.f79588i, jb2Var3));
                    }
                } else {
                    if (j19 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        nq0Var.a((int) j19);
                    } else {
                        gg2Var.f77799a = nq0Var.a() + j19;
                        z10 = true;
                    }
                    c(jA3);
                    if (z10 && this.f79587h != 2) {
                        return 1;
                    }
                }
                z10 = false;
                c(jA3);
                if (z10) {
                    continue;
                }
            } else {
                if (this.f79590k == 0) {
                    if (!nq0Var.a(this.f79583d.f78966a, 0, 8, true)) {
                        return -1;
                    }
                    this.f79590k = 8;
                    this.f79583d.e(0);
                    this.f79589j = this.f79583d.n();
                    this.f79588i = this.f79583d.b();
                }
                long j20 = this.f79589j;
                if (j20 == 1) {
                    nq0Var.readFully(this.f79583d.f78966a, 8, 8);
                    this.f79590k += 8;
                    this.f79589j = this.f79583d.q();
                } else if (j20 == 0) {
                    long length4 = nq0Var.getLength();
                    if (length4 == -1 && (vjVar = (vj) this.f79584e.peek()) != null) {
                        length4 = vjVar.f83937b;
                    }
                    if (length4 != -1) {
                        this.f79589j = (length4 - nq0Var.a()) + ((long) this.f79590k);
                    }
                }
                long j21 = this.f79589j;
                int i40 = this.f79590k;
                if (j21 >= i40) {
                    int i41 = this.f79588i;
                    if (i41 == 1836019574 || i41 == 1953653099 || i41 == 1835297121 || i41 == 1835626086 || i41 == 1937007212 || i41 == 1701082227 || i41 == 1835365473) {
                        long jA4 = nq0Var.a();
                        long j22 = this.f79589j;
                        long j23 = this.f79590k;
                        long j24 = (jA4 + j22) - j23;
                        if (j22 != j23 && this.f79588i == 1835365473) {
                            this.f79582c.c(8);
                            nq0Var.a(this.f79582c.f78966a, 0, 8);
                            jb2 jb2Var4 = this.f79582c;
                            byte[] bArr3 = ek.f77101a;
                            int i42 = jb2Var4.f78967b;
                            int i43 = i42 + 4;
                            jb2Var4.e(i43);
                            if (jb2Var4.b() != 1751411826) {
                                i42 = i43;
                            }
                            jb2Var4.e(i42);
                            nq0Var.a(this.f79582c.f78967b);
                            nq0Var.b();
                        }
                        this.f79584e.push(new vj(this.f79588i, j24));
                        if (this.f79589j == this.f79590k) {
                            c(j24);
                        } else {
                            this.f79587h = 0;
                            this.f79590k = 0;
                        }
                    } else if (i41 == 1835296868 || i41 == 1836476516 || i41 == 1751411826 || i41 == 1937011556 || i41 == 1937011827 || i41 == 1937011571 || i41 == 1668576371 || i41 == 1701606260 || i41 == 1937011555 || i41 == 1937011578 || i41 == 1937013298 || i41 == 1937007471 || i41 == 1668232756 || i41 == 1953196132 || i41 == 1718909296 || i41 == 1969517665 || i41 == 1801812339 || i41 == 1768715124) {
                        if (i40 != 8) {
                            throw new IllegalStateException();
                        }
                        if (j21 <= 2147483647L) {
                            jb2 jb2Var5 = new jb2((int) j21);
                            System.arraycopy(this.f79583d.f78966a, 0, jb2Var5.f78966a, 0, 8);
                            this.f79591l = jb2Var5;
                            this.f79587h = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        nq0Var.a();
                        this.f79591l = null;
                        this.f79587h = 1;
                    }
                } else {
                    throw ob2.b("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        return s13.a(nq0Var, false, false);
    }
}
