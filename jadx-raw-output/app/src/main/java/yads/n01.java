package yads;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class n01 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx2 f80491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f80492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m73 f80493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m01 f80494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f80495e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f80502l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f80496f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zx1 f80497g = new zx1(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zx1 f80498h = new zx1(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zx1 f80499i = new zx1(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zx1 f80500j = new zx1(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zx1 f80501k = new zx1(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f80503m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jb2 f80504n = new jb2();

    /* JADX WARN: Code duplicated, block: B:100:0x0212  */
    /* JADX WARN: Code duplicated, block: B:102:0x0218  */
    /* JADX WARN: Code duplicated, block: B:104:0x021f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0232  */
    /* JADX WARN: Code duplicated, block: B:109:0x0238 A[LOOP:8: B:108:0x0236->B:109:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0240  */
    /* JADX WARN: Code duplicated, block: B:112:0x0242  */
    /* JADX WARN: Code duplicated, block: B:117:0x025d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0276  */
    /* JADX WARN: Code duplicated, block: B:123:0x027c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0285  */
    /* JADX WARN: Code duplicated, block: B:127:0x028b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0294  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a3 A[LOOP:11: B:131:0x02a1->B:132:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x02af A[LOOP:12: B:134:0x02ad->B:135:0x02af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02cc A[LOOP:13: B:141:0x02c6->B:143:0x02cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:154:0x0303  */
    /* JADX WARN: Code duplicated, block: B:156:0x0309  */
    /* JADX WARN: Code duplicated, block: B:157:0x030c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0319  */
    /* JADX WARN: Code duplicated, block: B:163:0x0322  */
    /* JADX WARN: Code duplicated, block: B:165:0x032c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0337  */
    /* JADX WARN: Code duplicated, block: B:171:0x0346  */
    /* JADX WARN: Code duplicated, block: B:173:0x0375  */
    /* JADX WARN: Code duplicated, block: B:176:0x0383  */
    /* JADX WARN: Code duplicated, block: B:179:0x03af  */
    /* JADX WARN: Code duplicated, block: B:180:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:185:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:194:0x0406  */
    /* JADX WARN: Code duplicated, block: B:203:0x042c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0437  */
    /* JADX WARN: Code duplicated, block: B:216:0x0443  */
    /* JADX WARN: Code duplicated, block: B:219:0x044a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x013b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x0155 A[LOOP:3: B:55:0x0151->B:57:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01be  */
    /* JADX WARN: Code duplicated, block: B:87:0x01db  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e0 A[LOOP:5: B:89:0x01de->B:90:0x01e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x020e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        int i10;
        int i11;
        long j10;
        ?? r10;
        m01 m01Var;
        boolean z10;
        long j11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        long j12;
        zx1 zx1Var;
        zx1 zx1Var2;
        zx1 zx1Var3;
        kb2 kb2Var;
        int iB;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        int i19;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int i20;
        int i21;
        int iD5;
        int i22;
        boolean zC;
        int i23;
        float f10;
        int iB2;
        float[] fArr;
        int iB3;
        int iB4;
        int i24;
        int iD6;
        int iD7;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int iMin;
        int i30;
        int i31;
        int i32;
        int i33;
        if (this.f80493c == null) {
            throw new IllegalStateException();
        }
        int i34 = ib3.f78556a;
        while (true) {
            int i35 = jb2Var.f78968c;
            int i36 = jb2Var.f78967b;
            int i37 = i35 - i36;
            if (i37 <= 0) {
                return;
            }
            byte[] bArr = jb2Var.f78966a;
            this.f80502l += (long) i37;
            this.f80493c.a(i37, jb2Var);
            while (i36 < i35) {
                int iA = dy1.a(bArr, i36, i35, this.f80496f);
                if (iA == i35) {
                    a(bArr, i36, i35);
                    return;
                }
                int i38 = iA + 3;
                int i39 = (bArr[i38] & 126) >> 1;
                int i40 = iA - i36;
                if (i40 > 0) {
                    a(bArr, i36, iA);
                }
                int i41 = i35 - iA;
                long j13 = this.f80502l - ((long) i41);
                int i42 = i40 < 0 ? -i40 : 0;
                long j14 = this.f80503m;
                m01 m01Var2 = this.f80494d;
                boolean z14 = this.f80495e;
                if (m01Var2.f80015j && m01Var2.f80012g) {
                    m01Var2.f80018m = m01Var2.f80008c;
                    m01Var2.f80015j = false;
                } else {
                    if (m01Var2.f80013h || m01Var2.f80012g) {
                        if (z14 && m01Var2.f80014i) {
                            i11 = i41;
                            long j15 = m01Var2.f80007b;
                            i10 = i35;
                            int i43 = i11 + ((int) (j13 - j15));
                            long j16 = m01Var2.f80017l;
                            if (j16 != -9223372036854775807L) {
                                m01Var2.f80006a.a(j16, m01Var2.f80018m ? 1 : 0, (int) (j15 - m01Var2.f80016k), i43, null);
                            }
                        } else {
                            i10 = i35;
                            i11 = i41;
                        }
                        m01Var2.f80016k = m01Var2.f80007b;
                        m01Var2.f80017l = m01Var2.f80010e;
                        m01Var2.f80018m = m01Var2.f80008c;
                        m01Var2.f80014i = true;
                    }
                    if (this.f80495e) {
                        j10 = j13;
                    } else {
                        this.f80497g.a(i42);
                        this.f80498h.a(i42);
                        this.f80499i.a(i42);
                        zx1Var = this.f80497g;
                        if (zx1Var.f85643c) {
                            zx1Var2 = this.f80498h;
                            if (zx1Var2.f85643c) {
                                zx1Var3 = this.f80499i;
                                if (zx1Var3.f85643c) {
                                    m73 m73Var = this.f80493c;
                                    String str = this.f80492b;
                                    int i44 = zx1Var.f85645e;
                                    byte[] bArr2 = new byte[zx1Var2.f85645e + i44 + zx1Var3.f85645e];
                                    System.arraycopy(zx1Var.f85644d, 0, bArr2, 0, i44);
                                    System.arraycopy(zx1Var2.f85644d, 0, bArr2, zx1Var.f85645e, zx1Var2.f85645e);
                                    System.arraycopy(zx1Var3.f85644d, 0, bArr2, zx1Var.f85645e + zx1Var2.f85645e, zx1Var3.f85645e);
                                    kb2Var = new kb2(zx1Var2.f85644d, 0, zx1Var2.f85645e);
                                    kb2Var.d(44);
                                    iB = kb2Var.b(3);
                                    kb2Var.f();
                                    i13 = 2;
                                    int iB5 = kb2Var.b(2);
                                    boolean zC2 = kb2Var.c();
                                    int iB6 = kb2Var.b(5);
                                    i14 = 0;
                                    i16 = 0;
                                    for (i15 = 32; i14 < i15; i15 = 32) {
                                        if (kb2Var.c()) {
                                            i16 |= 1 << i14;
                                        }
                                        i14++;
                                    }
                                    iArr = new int[6];
                                    for (i17 = 0; i17 < 6; i17++) {
                                        iArr[i17] = kb2Var.b(8);
                                    }
                                    int iB7 = kb2Var.b(8);
                                    i18 = 0;
                                    for (i19 = 0; i19 < iB; i19++) {
                                        if (kb2Var.c()) {
                                            i18 += 89;
                                        }
                                        if (kb2Var.c()) {
                                            i18 += 8;
                                        }
                                    }
                                    kb2Var.d(i18);
                                    if (iB > 0) {
                                        kb2Var.d((8 - iB) * 2);
                                    }
                                    kb2Var.d();
                                    iD = kb2Var.d();
                                    if (iD == 3) {
                                        kb2Var.f();
                                    }
                                    iD2 = kb2Var.d();
                                    iD3 = kb2Var.d();
                                    if (kb2Var.c()) {
                                        int iD8 = kb2Var.d();
                                        int iD9 = kb2Var.d();
                                        int iD10 = kb2Var.d();
                                        int iD11 = kb2Var.d();
                                        if (iD != 1 || iD == 2) {
                                            i32 = 2;
                                        } else {
                                            i32 = 1;
                                        }
                                        if (iD == 1) {
                                            i33 = 2;
                                        } else {
                                            i33 = 1;
                                        }
                                        iD2 -= (iD8 + iD9) * i32;
                                        iD3 -= (iD10 + iD11) * i33;
                                    }
                                    kb2Var.d();
                                    kb2Var.d();
                                    iD4 = kb2Var.d();
                                    if (kb2Var.c()) {
                                        i20 = 0;
                                    } else {
                                        i20 = iB;
                                    }
                                    while (i20 <= iB) {
                                        kb2Var.d();
                                        kb2Var.d();
                                        kb2Var.d();
                                        i20++;
                                    }
                                    kb2Var.d();
                                    kb2Var.d();
                                    kb2Var.d();
                                    kb2Var.d();
                                    kb2Var.d();
                                    kb2Var.d();
                                    if (kb2Var.c() && kb2Var.c()) {
                                        i28 = 0;
                                        for (i21 = 4; i28 < i21; i21 = 4) {
                                            i29 = 0;
                                            while (i29 < 6) {
                                                if (kb2Var.c()) {
                                                    iMin = Math.min(64, 1 << ((i28 << 1) + 4));
                                                    if (i28 > 1) {
                                                        kb2Var.e();
                                                    }
                                                    for (i30 = 0; i30 < iMin; i30++) {
                                                        kb2Var.e();
                                                    }
                                                } else {
                                                    kb2Var.d();
                                                }
                                                if (i28 == 3) {
                                                    i31 = 3;
                                                } else {
                                                    i31 = 1;
                                                }
                                                i29 += i31;
                                                j13 = j13;
                                            }
                                            i28++;
                                            j13 = j13;
                                            i13 = 2;
                                        }
                                    }
                                    j10 = j13;
                                    kb2Var.d(i13);
                                    if (kb2Var.c()) {
                                        kb2Var.d(8);
                                        kb2Var.d();
                                        kb2Var.d();
                                        kb2Var.f();
                                    }
                                    i22 = 0;
                                    zC = false;
                                    i23 = 0;
                                    for (iD5 = kb2Var.d(); i22 < iD5; iD5 = iD5) {
                                        if (i22 != 0) {
                                            zC = kb2Var.c();
                                        }
                                        if (zC) {
                                            kb2Var.f();
                                            kb2Var.d();
                                            for (i27 = 0; i27 <= i23; i27++) {
                                                if (kb2Var.c()) {
                                                    kb2Var.f();
                                                }
                                            }
                                        } else {
                                            iD6 = kb2Var.d();
                                            iD7 = kb2Var.d();
                                            int i45 = iD6 + iD7;
                                            for (i25 = 0; i25 < iD6; i25++) {
                                                kb2Var.d();
                                                kb2Var.f();
                                            }
                                            for (i26 = 0; i26 < iD7; i26++) {
                                                kb2Var.d();
                                                kb2Var.f();
                                            }
                                            i23 = i45;
                                        }
                                        i22++;
                                    }
                                    if (kb2Var.c()) {
                                        for (i24 = 0; i24 < kb2Var.d(); i24++) {
                                            kb2Var.d(iD4 + 5);
                                        }
                                    }
                                    kb2Var.d(2);
                                    f10 = 1.0f;
                                    if (kb2Var.c()) {
                                        if (kb2Var.c()) {
                                            iB2 = kb2Var.b(8);
                                            if (iB2 == 255) {
                                                iB3 = kb2Var.b(16);
                                                iB4 = kb2Var.b(16);
                                                if (iB3 != 0 && iB4 != 0) {
                                                    f10 = iB3 / iB4;
                                                }
                                            } else {
                                                fArr = dy1.f76844b;
                                                if (iB2 < 17) {
                                                    f10 = fArr[iB2];
                                                } else {
                                                    kf1.a("Unexpected aspect_ratio_idc value: ", iB2, "H265Reader");
                                                }
                                            }
                                        }
                                        if (kb2Var.c()) {
                                            kb2Var.f();
                                        }
                                        if (kb2Var.c()) {
                                            kb2Var.d(4);
                                            if (kb2Var.c()) {
                                                kb2Var.d(24);
                                            }
                                        }
                                        if (kb2Var.c()) {
                                            kb2Var.d();
                                            kb2Var.d();
                                        }
                                        kb2Var.f();
                                        if (kb2Var.c()) {
                                            iD3 *= 2;
                                        }
                                    }
                                    String strA = jx.a(iB5, zC2, iB6, i16, iArr, iB7);
                                    lx0 lx0Var = new lx0();
                                    lx0Var.f79957a = str;
                                    lx0Var.f79967k = "video/hevc";
                                    lx0Var.f79964h = strA;
                                    lx0Var.f79972p = iD2;
                                    lx0Var.f79973q = iD3;
                                    lx0Var.f79976t = f10;
                                    lx0Var.f79969m = Collections.singletonList(bArr2);
                                    m73Var.a(new mx0(lx0Var));
                                    this.f80495e = true;
                                } else {
                                    j10 = j13;
                                }
                            } else {
                                j10 = j13;
                            }
                        } else {
                            j10 = j13;
                        }
                    }
                    if (this.f80500j.a(i42)) {
                        zx1 zx1Var4 = this.f80500j;
                        int iA2 = dy1.a(zx1Var4.f85645e, zx1Var4.f85644d);
                        jb2 jb2Var2 = this.f80504n;
                        jb2Var2.f78966a = this.f80500j.f85644d;
                        jb2Var2.f78968c = iA2;
                        jb2Var2.f78967b = 0;
                        jb2Var2.e(5);
                        rt.a(j14, this.f80504n, this.f80491a.f80857b);
                    }
                    if (this.f80501k.a(i42)) {
                        zx1 zx1Var5 = this.f80501k;
                        int iA3 = dy1.a(zx1Var5.f85645e, zx1Var5.f85644d);
                        jb2 jb2Var3 = this.f80504n;
                        jb2Var3.f78966a = this.f80501k.f85644d;
                        jb2Var3.f78968c = iA3;
                        r10 = 0;
                        jb2Var3.f78967b = 0;
                        jb2Var3.e(5);
                        rt.a(j14, this.f80504n, this.f80491a.f80857b);
                    } else {
                        r10 = 0;
                    }
                    long j17 = this.f80503m;
                    m01Var = this.f80494d;
                    z10 = this.f80495e;
                    m01Var.f80012g = r10;
                    m01Var.f80013h = r10;
                    m01Var.f80010e = j17;
                    m01Var.f80009d = r10;
                    j11 = j10;
                    m01Var.f80007b = j11;
                    if (i39 < 32) {
                        z11 = true;
                        i12 = 16;
                    } else if (i39 == 40) {
                        i12 = 16;
                        z11 = true;
                    } else {
                        if (m01Var.f80014i && !m01Var.f80015j) {
                            if (z10) {
                                j12 = m01Var.f80017l;
                                if (j12 != -9223372036854775807L) {
                                    m01Var.f80006a.a(j12, m01Var.f80018m ? 1 : 0, (int) (j11 - m01Var.f80016k), i11, null);
                                }
                            }
                            m01Var.f80014i = r10;
                        }
                        if ((32 <= i39 || i39 > 35) && i39 != 39) {
                            z11 = true;
                        } else {
                            z11 = true;
                            m01Var.f80013h = !m01Var.f80015j;
                            m01Var.f80015j = true;
                        }
                        i12 = 16;
                    }
                    if (i39 >= i12 || i39 > 21) {
                        z12 = r10;
                    } else {
                        z12 = z11;
                    }
                    m01Var.f80008c = z12;
                    if (z12 == 0 || i39 <= 9) {
                        z13 = z11;
                    } else {
                        z13 = r10;
                    }
                    m01Var.f80011f = z13;
                    if (!this.f80495e) {
                        this.f80497g.b(i39);
                        this.f80498h.b(i39);
                        this.f80499i.b(i39);
                    }
                    this.f80500j.b(i39);
                    this.f80501k.b(i39);
                    i35 = i10;
                    bArr = bArr;
                    i36 = i38;
                }
                i10 = i35;
                bArr = bArr;
                i38 = i38;
                i11 = i41;
                if (this.f80495e) {
                    this.f80497g.a(i42);
                    this.f80498h.a(i42);
                    this.f80499i.a(i42);
                    zx1Var = this.f80497g;
                    if (zx1Var.f85643c) {
                        zx1Var2 = this.f80498h;
                        if (zx1Var2.f85643c) {
                            zx1Var3 = this.f80499i;
                            if (zx1Var3.f85643c) {
                                m73 m73Var2 = this.f80493c;
                                String str2 = this.f80492b;
                                int i46 = zx1Var.f85645e;
                                byte[] bArr3 = new byte[zx1Var2.f85645e + i46 + zx1Var3.f85645e];
                                System.arraycopy(zx1Var.f85644d, 0, bArr3, 0, i46);
                                System.arraycopy(zx1Var2.f85644d, 0, bArr3, zx1Var.f85645e, zx1Var2.f85645e);
                                System.arraycopy(zx1Var3.f85644d, 0, bArr3, zx1Var.f85645e + zx1Var2.f85645e, zx1Var3.f85645e);
                                kb2Var = new kb2(zx1Var2.f85644d, 0, zx1Var2.f85645e);
                                kb2Var.d(44);
                                iB = kb2Var.b(3);
                                kb2Var.f();
                                i13 = 2;
                                int iB8 = kb2Var.b(2);
                                boolean zC3 = kb2Var.c();
                                int iB9 = kb2Var.b(5);
                                i14 = 0;
                                i16 = 0;
                                while (i14 < i15) {
                                    if (kb2Var.c()) {
                                        i16 |= 1 << i14;
                                    }
                                    i14++;
                                }
                                iArr = new int[6];
                                while (i17 < 6) {
                                    iArr[i17] = kb2Var.b(8);
                                }
                                int iB10 = kb2Var.b(8);
                                i18 = 0;
                                while (i19 < iB) {
                                    if (kb2Var.c()) {
                                        i18 += 89;
                                    }
                                    if (kb2Var.c()) {
                                        i18 += 8;
                                    }
                                }
                                kb2Var.d(i18);
                                if (iB > 0) {
                                    kb2Var.d((8 - iB) * 2);
                                }
                                kb2Var.d();
                                iD = kb2Var.d();
                                if (iD == 3) {
                                    kb2Var.f();
                                }
                                iD2 = kb2Var.d();
                                iD3 = kb2Var.d();
                                if (kb2Var.c()) {
                                    int iD12 = kb2Var.d();
                                    int iD13 = kb2Var.d();
                                    int iD14 = kb2Var.d();
                                    int iD15 = kb2Var.d();
                                    if (iD != 1) {
                                        i32 = 2;
                                    } else {
                                        i32 = 2;
                                    }
                                    if (iD == 1) {
                                        i33 = 2;
                                    } else {
                                        i33 = 1;
                                    }
                                    iD2 -= (iD12 + iD13) * i32;
                                    iD3 -= (iD14 + iD15) * i33;
                                }
                                kb2Var.d();
                                kb2Var.d();
                                iD4 = kb2Var.d();
                                if (kb2Var.c()) {
                                    i20 = 0;
                                } else {
                                    i20 = iB;
                                }
                                while (i20 <= iB) {
                                    kb2Var.d();
                                    kb2Var.d();
                                    kb2Var.d();
                                    i20++;
                                }
                                kb2Var.d();
                                kb2Var.d();
                                kb2Var.d();
                                kb2Var.d();
                                kb2Var.d();
                                kb2Var.d();
                                if (kb2Var.c()) {
                                    i28 = 0;
                                    while (i28 < i21) {
                                        i29 = 0;
                                        while (i29 < 6) {
                                            if (kb2Var.c()) {
                                                kb2Var.d();
                                            } else {
                                                iMin = Math.min(64, 1 << ((i28 << 1) + 4));
                                                if (i28 > 1) {
                                                    kb2Var.e();
                                                }
                                                while (i30 < iMin) {
                                                    kb2Var.e();
                                                }
                                            }
                                            if (i28 == 3) {
                                                i31 = 3;
                                            } else {
                                                i31 = 1;
                                            }
                                            i29 += i31;
                                            j13 = j13;
                                        }
                                        i28++;
                                        j13 = j13;
                                        i13 = 2;
                                    }
                                }
                                j10 = j13;
                                kb2Var.d(i13);
                                if (kb2Var.c()) {
                                    kb2Var.d(8);
                                    kb2Var.d();
                                    kb2Var.d();
                                    kb2Var.f();
                                }
                                i22 = 0;
                                zC = false;
                                i23 = 0;
                                while (i22 < iD5) {
                                    if (i22 != 0) {
                                        zC = kb2Var.c();
                                    }
                                    if (zC) {
                                        kb2Var.f();
                                        kb2Var.d();
                                        while (i27 <= i23) {
                                            if (kb2Var.c()) {
                                                kb2Var.f();
                                            }
                                        }
                                    } else {
                                        iD6 = kb2Var.d();
                                        iD7 = kb2Var.d();
                                        int i47 = iD6 + iD7;
                                        while (i25 < iD6) {
                                            kb2Var.d();
                                            kb2Var.f();
                                        }
                                        while (i26 < iD7) {
                                            kb2Var.d();
                                            kb2Var.f();
                                        }
                                        i23 = i47;
                                    }
                                    i22++;
                                }
                                if (kb2Var.c()) {
                                    while (i24 < kb2Var.d()) {
                                        kb2Var.d(iD4 + 5);
                                    }
                                }
                                kb2Var.d(2);
                                f10 = 1.0f;
                                if (kb2Var.c()) {
                                    if (kb2Var.c()) {
                                        iB2 = kb2Var.b(8);
                                        if (iB2 == 255) {
                                            iB3 = kb2Var.b(16);
                                            iB4 = kb2Var.b(16);
                                            if (iB3 != 0) {
                                                f10 = iB3 / iB4;
                                            }
                                        } else {
                                            fArr = dy1.f76844b;
                                            if (iB2 < 17) {
                                                f10 = fArr[iB2];
                                            } else {
                                                kf1.a("Unexpected aspect_ratio_idc value: ", iB2, "H265Reader");
                                            }
                                        }
                                    }
                                    if (kb2Var.c()) {
                                        kb2Var.f();
                                    }
                                    if (kb2Var.c()) {
                                        kb2Var.d(4);
                                        if (kb2Var.c()) {
                                            kb2Var.d(24);
                                        }
                                    }
                                    if (kb2Var.c()) {
                                        kb2Var.d();
                                        kb2Var.d();
                                    }
                                    kb2Var.f();
                                    if (kb2Var.c()) {
                                        iD3 *= 2;
                                    }
                                }
                                String strA2 = jx.a(iB8, zC3, iB9, i16, iArr, iB10);
                                lx0 lx0Var2 = new lx0();
                                lx0Var2.f79957a = str2;
                                lx0Var2.f79967k = "video/hevc";
                                lx0Var2.f79964h = strA2;
                                lx0Var2.f79972p = iD2;
                                lx0Var2.f79973q = iD3;
                                lx0Var2.f79976t = f10;
                                lx0Var2.f79969m = Collections.singletonList(bArr3);
                                m73Var2.a(new mx0(lx0Var2));
                                this.f80495e = true;
                            } else {
                                j10 = j13;
                            }
                        } else {
                            j10 = j13;
                        }
                    } else {
                        j10 = j13;
                    }
                } else {
                    j10 = j13;
                }
                if (this.f80500j.a(i42)) {
                    zx1 zx1Var6 = this.f80500j;
                    int iA4 = dy1.a(zx1Var6.f85645e, zx1Var6.f85644d);
                    jb2 jb2Var4 = this.f80504n;
                    jb2Var4.f78966a = this.f80500j.f85644d;
                    jb2Var4.f78968c = iA4;
                    jb2Var4.f78967b = 0;
                    jb2Var4.e(5);
                    rt.a(j14, this.f80504n, this.f80491a.f80857b);
                }
                if (this.f80501k.a(i42)) {
                    zx1 zx1Var7 = this.f80501k;
                    int iA5 = dy1.a(zx1Var7.f85645e, zx1Var7.f85644d);
                    jb2 jb2Var5 = this.f80504n;
                    jb2Var5.f78966a = this.f80501k.f85644d;
                    jb2Var5.f78968c = iA5;
                    r10 = 0;
                    jb2Var5.f78967b = 0;
                    jb2Var5.e(5);
                    rt.a(j14, this.f80504n, this.f80491a.f80857b);
                } else {
                    r10 = 0;
                }
                long j18 = this.f80503m;
                m01Var = this.f80494d;
                z10 = this.f80495e;
                m01Var.f80012g = r10;
                m01Var.f80013h = r10;
                m01Var.f80010e = j18;
                m01Var.f80009d = r10;
                j11 = j10;
                m01Var.f80007b = j11;
                if (i39 < 32) {
                    z11 = true;
                    i12 = 16;
                } else if (i39 == 40) {
                    i12 = 16;
                    z11 = true;
                } else {
                    if (m01Var.f80014i) {
                        if (z10) {
                            j12 = m01Var.f80017l;
                            if (j12 != -9223372036854775807L) {
                                m01Var.f80006a.a(j12, m01Var.f80018m ? 1 : 0, (int) (j11 - m01Var.f80016k), i11, null);
                            }
                        }
                        m01Var.f80014i = r10;
                    }
                    if (32 <= i39) {
                        z11 = true;
                        i12 = 16;
                    } else {
                        z11 = true;
                        i12 = 16;
                    }
                    z11 = true;
                    m01Var.f80013h = !m01Var.f80015j;
                    m01Var.f80015j = true;
                    i12 = 16;
                }
                if (i39 >= i12) {
                    z12 = r10;
                } else {
                    z12 = r10;
                }
                m01Var.f80008c = z12;
                if (z12 == 0) {
                    z13 = z11;
                } else {
                    z13 = z11;
                }
                m01Var.f80011f = z13;
                if (!this.f80495e) {
                    this.f80497g.b(i39);
                    this.f80498h.b(i39);
                    this.f80499i.b(i39);
                }
                this.f80500j.b(i39);
                this.f80501k.b(i39);
                i35 = i10;
                bArr = bArr;
                i36 = i38;
            }
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public n01(nx2 nx2Var) {
        this.f80491a = nx2Var;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f80492b = l93Var.f79734e;
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f79733d, 2);
        this.f80493c = m73VarA;
        this.f80494d = new m01(m73VarA);
        this.f80491a.a(pq0Var, l93Var);
    }

    public final void a(byte[] bArr, int i10, int i11) {
        m01 m01Var = this.f80494d;
        if (m01Var.f80011f) {
            int i12 = m01Var.f80009d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                m01Var.f80012g = (bArr[i13] & 128) != 0;
                m01Var.f80011f = false;
            } else {
                m01Var.f80009d = (i11 - i10) + i12;
            }
        }
        if (!this.f80495e) {
            this.f80497g.a(bArr, i10, i11);
            this.f80498h.a(bArr, i10, i11);
            this.f80499i.a(bArr, i10, i11);
        }
        this.f80500j.a(bArr, i10, i11);
        this.f80501k.a(bArr, i10, i11);
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f80503m = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        this.f80502l = 0L;
        this.f80503m = -9223372036854775807L;
        dy1.a(this.f80496f);
        zx1 zx1Var = this.f80497g;
        zx1Var.f85642b = false;
        zx1Var.f85643c = false;
        zx1 zx1Var2 = this.f80498h;
        zx1Var2.f85642b = false;
        zx1Var2.f85643c = false;
        zx1 zx1Var3 = this.f80499i;
        zx1Var3.f85642b = false;
        zx1Var3.f85643c = false;
        zx1 zx1Var4 = this.f80500j;
        zx1Var4.f85642b = false;
        zx1Var4.f85643c = false;
        zx1 zx1Var5 = this.f80501k;
        zx1Var5.f85642b = false;
        zx1Var5.f85643c = false;
        m01 m01Var = this.f80494d;
        if (m01Var != null) {
            m01Var.f80011f = false;
            m01Var.f80012g = false;
            m01Var.f80013h = false;
            m01Var.f80014i = false;
            m01Var.f80015j = false;
        }
    }
}
