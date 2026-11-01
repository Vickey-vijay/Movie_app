package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f17262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f17265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17266e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17274m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f17267f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f17268g = new r(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f17269h = new r(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f17270i = new r(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f17271j = new r(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f17272k = new r(40);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17275n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f17267f);
        r rVar = this.f17268g;
        rVar.f17295b = false;
        rVar.f17296c = false;
        r rVar2 = this.f17269h;
        rVar2.f17295b = false;
        rVar2.f17296c = false;
        r rVar3 = this.f17270i;
        rVar3.f17295b = false;
        rVar3.f17296c = false;
        r rVar4 = this.f17271j;
        rVar4.f17295b = false;
        rVar4.f17296c = false;
        r rVar5 = this.f17272k;
        rVar5.f17295b = false;
        rVar5.f17296c = false;
        n nVar = this.f17265d;
        nVar.f17254f = false;
        nVar.f17255g = false;
        nVar.f17256h = false;
        nVar.f17257i = false;
        nVar.f17258j = false;
        this.f17273l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public o(x xVar) {
        this.f17262a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f17263b = e0Var.f17165e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f17164d, 2);
        this.f17264c = gVarA;
        this.f17265d = new n(gVarA);
        this.f17262a.a(jVar, e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x030c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0338  */
    /* JADX WARN: Code duplicated, block: B:156:0x0362  */
    /* JADX WARN: Code duplicated, block: B:158:0x0375  */
    /* JADX WARN: Code duplicated, block: B:160:0x0379  */
    /* JADX WARN: Code duplicated, block: B:163:0x0393  */
    /* JADX WARN: Code duplicated, block: B:166:0x0399  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:182:0x03bd  */
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
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        int i11;
        float f10;
        long j10;
        int i12;
        n nVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        while (true) {
            int i13 = nVar.f17847c;
            int i14 = nVar.f17846b;
            int i15 = i13 - i14;
            if (i15 <= 0) {
                return;
            }
            byte[] bArr = nVar.f17845a;
            this.f17273l += (long) i15;
            this.f17264c.a(i15, nVar);
            while (i14 < i13) {
                int iA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr, i14, i13, this.f17267f);
                if (iA == i13) {
                    a(bArr, i14, i13);
                    return;
                }
                int i16 = iA + 3;
                int i17 = (bArr[i16] & 126) >> 1;
                int i18 = iA - i14;
                if (i18 > 0) {
                    a(bArr, i14, iA);
                }
                int i19 = i13 - iA;
                long j11 = this.f17273l - ((long) i19);
                int i20 = i18 < 0 ? -i18 : 0;
                long j12 = this.f17274m;
                if (this.f17266e) {
                    n nVar3 = this.f17265d;
                    if (nVar3.f17258j && nVar3.f17255g) {
                        nVar3.f17261m = nVar3.f17251c;
                        nVar3.f17258j = false;
                    } else {
                        if (nVar3.f17256h || nVar3.f17255g) {
                            if (nVar3.f17257i) {
                                long j13 = nVar3.f17250b;
                                nVar3.f17249a.a(nVar3.f17260l, nVar3.f17261m ? 1 : 0, (int) (j13 - nVar3.f17259k), i19 + ((int) (j11 - j13)), null);
                            }
                            nVar3.f17259k = nVar3.f17250b;
                            nVar3.f17260l = nVar3.f17253e;
                            nVar3.f17257i = true;
                            nVar3.f17261m = nVar3.f17251c;
                        }
                        i11 = 16;
                        if (this.f17271j.a(i20)) {
                            r rVar = this.f17271j;
                            int iA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar.f17298e, rVar.f17297d);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f17275n;
                            nVar4.f17845a = this.f17271j.f17297d;
                            nVar4.f17847c = iA2;
                            nVar4.f17846b = 0;
                            nVar4.e(5);
                            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j12, this.f17275n, this.f17262a.f17332b);
                        }
                        if (this.f17272k.a(i20)) {
                            r rVar2 = this.f17272k;
                            int iA3 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar2.f17298e, rVar2.f17297d);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = this.f17275n;
                            nVar5.f17845a = this.f17272k.f17297d;
                            nVar5.f17847c = iA3;
                            nVar5.f17846b = 0;
                            nVar5.e(5);
                            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j12, this.f17275n, this.f17262a.f17332b);
                        }
                        j10 = this.f17274m;
                        if (this.f17266e) {
                            nVar2 = this.f17265d;
                            nVar2.f17255g = false;
                            nVar2.f17256h = false;
                            nVar2.f17253e = j10;
                            nVar2.f17252d = 0;
                            nVar2.f17250b = j11;
                            i12 = i17;
                            if (i12 >= 32) {
                                if (nVar2.f17258j && nVar2.f17257i) {
                                    boolean z14 = nVar2.f17261m;
                                    int i21 = (int) (j11 - nVar2.f17259k);
                                    z10 = false;
                                    nVar2.f17249a.a(nVar2.f17260l, z14 ? 1 : 0, i21, i10, null);
                                    nVar2.f17257i = false;
                                } else {
                                    z10 = false;
                                }
                                if (i12 <= 34) {
                                    z11 = true;
                                    nVar2.f17256h = !nVar2.f17258j;
                                    nVar2.f17258j = true;
                                }
                                if (i12 >= i11 || i12 > 21) {
                                    z12 = z10;
                                } else {
                                    z12 = z11;
                                }
                                nVar2.f17251c = z12;
                                if (!z12 || i12 <= 9) {
                                    z13 = z11;
                                } else {
                                    z13 = z10;
                                }
                                nVar2.f17254f = z13;
                            } else {
                                z10 = false;
                                i11 = i11;
                            }
                            z11 = true;
                            if (i12 >= i11) {
                                z12 = z10;
                            } else {
                                z12 = z10;
                            }
                            nVar2.f17251c = z12;
                            if (z12) {
                                z13 = z11;
                            } else {
                                z13 = z11;
                            }
                            nVar2.f17254f = z13;
                        } else {
                            i12 = i17;
                            this.f17268g.b(i12);
                            this.f17269h.b(i12);
                            this.f17270i.b(i12);
                        }
                        this.f17271j.b(i12);
                        this.f17272k.b(i12);
                        i13 = i13;
                        bArr = bArr;
                        i14 = i16;
                    }
                    i13 = i13;
                    i20 = i20;
                    i10 = i19;
                    i11 = 16;
                    if (this.f17271j.a(i20)) {
                        r rVar3 = this.f17271j;
                        int iA4 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar3.f17298e, rVar3.f17297d);
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = this.f17275n;
                        nVar6.f17845a = this.f17271j.f17297d;
                        nVar6.f17847c = iA4;
                        nVar6.f17846b = 0;
                        nVar6.e(5);
                        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j12, this.f17275n, this.f17262a.f17332b);
                    }
                    if (this.f17272k.a(i20)) {
                        r rVar4 = this.f17272k;
                        int iA5 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar4.f17298e, rVar4.f17297d);
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = this.f17275n;
                        nVar7.f17845a = this.f17272k.f17297d;
                        nVar7.f17847c = iA5;
                        nVar7.f17846b = 0;
                        nVar7.e(5);
                        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j12, this.f17275n, this.f17262a.f17332b);
                    }
                    j10 = this.f17274m;
                    if (this.f17266e) {
                        nVar2 = this.f17265d;
                        nVar2.f17255g = false;
                        nVar2.f17256h = false;
                        nVar2.f17253e = j10;
                        nVar2.f17252d = 0;
                        nVar2.f17250b = j11;
                        i12 = i17;
                        if (i12 >= 32) {
                            if (nVar2.f17258j) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (i12 <= 34) {
                                z11 = true;
                                nVar2.f17256h = !nVar2.f17258j;
                                nVar2.f17258j = true;
                            }
                            if (i12 >= i11) {
                                z12 = z10;
                            } else {
                                z12 = z10;
                            }
                            nVar2.f17251c = z12;
                            if (z12) {
                                z13 = z11;
                            } else {
                                z13 = z11;
                            }
                            nVar2.f17254f = z13;
                        } else {
                            z10 = false;
                            i11 = i11;
                        }
                        z11 = true;
                        if (i12 >= i11) {
                            z12 = z10;
                        } else {
                            z12 = z10;
                        }
                        nVar2.f17251c = z12;
                        if (z12) {
                            z13 = z11;
                        } else {
                            z13 = z11;
                        }
                        nVar2.f17254f = z13;
                    } else {
                        i12 = i17;
                        this.f17268g.b(i12);
                        this.f17269h.b(i12);
                        this.f17270i.b(i12);
                    }
                    this.f17271j.b(i12);
                    this.f17272k.b(i12);
                    i13 = i13;
                    bArr = bArr;
                    i14 = i16;
                } else {
                    i13 = i13;
                    i20 = i20;
                    i19 = i19;
                    this.f17268g.a(i20);
                    this.f17269h.a(i20);
                    this.f17270i.a(i20);
                    r rVar5 = this.f17268g;
                    if (rVar5.f17296c) {
                        r rVar6 = this.f17269h;
                        if (rVar6.f17296c) {
                            r rVar7 = this.f17270i;
                            if (rVar7.f17296c) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar8 = this.f17264c;
                                String str = this.f17263b;
                                int i22 = rVar5.f17298e;
                                bArr = bArr;
                                i16 = i16;
                                byte[] bArr2 = new byte[rVar6.f17298e + i22 + rVar7.f17298e];
                                i10 = i19;
                                System.arraycopy(rVar5.f17297d, 0, bArr2, 0, i22);
                                i17 = i17;
                                System.arraycopy(rVar6.f17297d, 0, bArr2, rVar5.f17298e, rVar6.f17298e);
                                System.arraycopy(rVar7.f17297d, 0, bArr2, rVar5.f17298e + rVar6.f17298e, rVar7.f17298e);
                                com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar6.f17297d, 0, rVar6.f17298e);
                                oVar.d(44);
                                int i23 = 3;
                                int iB = oVar.b(3);
                                oVar.f();
                                oVar.d(88);
                                oVar.d(8);
                                int i24 = 0;
                                for (int i25 = 0; i25 < iB; i25++) {
                                    if (oVar.c()) {
                                        i24 += 89;
                                    }
                                    if (oVar.c()) {
                                        i24 += 8;
                                    }
                                }
                                oVar.d(i24);
                                int i26 = 2;
                                if (iB > 0) {
                                    oVar.d((8 - iB) * 2);
                                }
                                oVar.d();
                                int iD = oVar.d();
                                if (iD == 3) {
                                    oVar.f();
                                }
                                int iD2 = oVar.d();
                                int iD3 = oVar.d();
                                if (oVar.c()) {
                                    int iD4 = oVar.d();
                                    int iD5 = oVar.d();
                                    int iD6 = oVar.d();
                                    int iD7 = oVar.d();
                                    iD2 -= (iD4 + iD5) * ((iD == 1 || iD == 2) ? 2 : 1);
                                    iD3 -= (iD6 + iD7) * (iD == 1 ? 2 : 1);
                                }
                                int i27 = iD2;
                                int i28 = iD3;
                                oVar.d();
                                oVar.d();
                                int iD8 = oVar.d();
                                for (int i29 = oVar.c() ? 0 : iB; i29 <= iB; i29++) {
                                    oVar.d();
                                    oVar.d();
                                    oVar.d();
                                }
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                if (oVar.c() && oVar.c()) {
                                    int i30 = 0;
                                    while (true) {
                                        int i31 = 4;
                                        if (i30 >= 4) {
                                            break;
                                        }
                                        int i32 = 0;
                                        while (i32 < 6) {
                                            if (!oVar.c()) {
                                                oVar.d();
                                            } else {
                                                int iMin = Math.min(64, 1 << ((i30 << 1) + i31));
                                                if (i30 > 1) {
                                                    oVar.e();
                                                }
                                                for (int i33 = 0; i33 < iMin; i33++) {
                                                    oVar.e();
                                                }
                                                i23 = 3;
                                            }
                                            i32 += i30 == i23 ? i23 : 1;
                                            i31 = 4;
                                        }
                                        i30++;
                                        i26 = 2;
                                    }
                                }
                                oVar.d(i26);
                                if (oVar.c()) {
                                    oVar.d(8);
                                    oVar.d();
                                    oVar.d();
                                    oVar.f();
                                }
                                int i34 = 0;
                                boolean zC = false;
                                int i35 = 0;
                                for (int iD9 = oVar.d(); i34 < iD9; iD9 = iD9) {
                                    if (i34 != 0) {
                                        zC = oVar.c();
                                    }
                                    if (zC) {
                                        oVar.f();
                                        oVar.d();
                                        for (int i36 = 0; i36 <= i35; i36++) {
                                            if (oVar.c()) {
                                                oVar.f();
                                            }
                                        }
                                    } else {
                                        int iD10 = oVar.d();
                                        int iD11 = oVar.d();
                                        int i37 = iD10 + iD11;
                                        for (int i38 = 0; i38 < iD10; i38++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        for (int i39 = 0; i39 < iD11; i39++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        i35 = i37;
                                    }
                                    i34++;
                                }
                                if (oVar.c()) {
                                    for (int i40 = 0; i40 < oVar.d(); i40++) {
                                        oVar.d(iD8 + 5);
                                    }
                                }
                                oVar.d(2);
                                float f11 = 1.0f;
                                if (oVar.c() && oVar.c()) {
                                    int iB2 = oVar.b(8);
                                    if (iB2 == 255) {
                                        i11 = 16;
                                        int iB3 = oVar.b(16);
                                        int iB4 = oVar.b(16);
                                        if (iB3 != 0 && iB4 != 0) {
                                            f11 = iB3 / iB4;
                                        }
                                    } else {
                                        i11 = 16;
                                        float[] fArr = com.fyber.inneractive.sdk.player.exoplayer2.util.l.f17838b;
                                        if (iB2 < 17) {
                                            f10 = fArr[iB2];
                                        } else {
                                            Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + iB2);
                                        }
                                        rVar8.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i27, i28, Collections.singletonList(bArr2), -1, f10, null, -1, null, null));
                                        this.f17266e = true;
                                    }
                                } else {
                                    i11 = 16;
                                }
                                f10 = f11;
                                rVar8.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i27, i28, Collections.singletonList(bArr2), -1, f10, null, -1, null, null));
                                this.f17266e = true;
                            }
                            if (this.f17271j.a(i20)) {
                                r rVar9 = this.f17271j;
                                int iA6 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar9.f17298e, rVar9.f17297d);
                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = this.f17275n;
                                nVar8.f17845a = this.f17271j.f17297d;
                                nVar8.f17847c = iA6;
                                nVar8.f17846b = 0;
                                nVar8.e(5);
                                com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j12, this.f17275n, this.f17262a.f17332b);
                            }
                            if (this.f17272k.a(i20)) {
                                r rVar10 = this.f17272k;
                                int iA7 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar10.f17298e, rVar10.f17297d);
                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = this.f17275n;
                                nVar9.f17845a = this.f17272k.f17297d;
                                nVar9.f17847c = iA7;
                                nVar9.f17846b = 0;
                                nVar9.e(5);
                                com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j12, this.f17275n, this.f17262a.f17332b);
                            }
                            j10 = this.f17274m;
                            if (this.f17266e) {
                                nVar2 = this.f17265d;
                                nVar2.f17255g = false;
                                nVar2.f17256h = false;
                                nVar2.f17253e = j10;
                                nVar2.f17252d = 0;
                                nVar2.f17250b = j11;
                                i12 = i17;
                                if (i12 >= 32) {
                                    if (nVar2.f17258j) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (i12 <= 34) {
                                        z11 = true;
                                        nVar2.f17256h = !nVar2.f17258j;
                                        nVar2.f17258j = true;
                                    }
                                    if (i12 >= i11) {
                                        z12 = z10;
                                    } else {
                                        z12 = z10;
                                    }
                                    nVar2.f17251c = z12;
                                    if (z12) {
                                        z13 = z11;
                                    } else {
                                        z13 = z11;
                                    }
                                    nVar2.f17254f = z13;
                                } else {
                                    z10 = false;
                                    i11 = i11;
                                }
                                z11 = true;
                                if (i12 >= i11) {
                                    z12 = z10;
                                } else {
                                    z12 = z10;
                                }
                                nVar2.f17251c = z12;
                                if (z12) {
                                    z13 = z11;
                                } else {
                                    z13 = z11;
                                }
                                nVar2.f17254f = z13;
                            } else {
                                i12 = i17;
                                this.f17268g.b(i12);
                                this.f17269h.b(i12);
                                this.f17270i.b(i12);
                            }
                            this.f17271j.b(i12);
                            this.f17272k.b(i12);
                            i13 = i13;
                            bArr = bArr;
                            i14 = i16;
                        }
                    }
                }
                i10 = i19;
                i11 = 16;
                if (this.f17271j.a(i20)) {
                    r rVar11 = this.f17271j;
                    int iA8 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar11.f17298e, rVar11.f17297d);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar10 = this.f17275n;
                    nVar10.f17845a = this.f17271j.f17297d;
                    nVar10.f17847c = iA8;
                    nVar10.f17846b = 0;
                    nVar10.e(5);
                    com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j12, this.f17275n, this.f17262a.f17332b);
                }
                if (this.f17272k.a(i20)) {
                    r rVar12 = this.f17272k;
                    int iA9 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar12.f17298e, rVar12.f17297d);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar11 = this.f17275n;
                    nVar11.f17845a = this.f17272k.f17297d;
                    nVar11.f17847c = iA9;
                    nVar11.f17846b = 0;
                    nVar11.e(5);
                    com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j12, this.f17275n, this.f17262a.f17332b);
                }
                j10 = this.f17274m;
                if (this.f17266e) {
                    nVar2 = this.f17265d;
                    nVar2.f17255g = false;
                    nVar2.f17256h = false;
                    nVar2.f17253e = j10;
                    nVar2.f17252d = 0;
                    nVar2.f17250b = j11;
                    i12 = i17;
                    if (i12 >= 32) {
                        if (nVar2.f17258j) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (i12 <= 34) {
                            z11 = true;
                            nVar2.f17256h = !nVar2.f17258j;
                            nVar2.f17258j = true;
                        }
                        if (i12 >= i11) {
                            z12 = z10;
                        } else {
                            z12 = z10;
                        }
                        nVar2.f17251c = z12;
                        if (z12) {
                            z13 = z11;
                        } else {
                            z13 = z11;
                        }
                        nVar2.f17254f = z13;
                    } else {
                        z10 = false;
                        i11 = i11;
                    }
                    z11 = true;
                    if (i12 >= i11) {
                        z12 = z10;
                    } else {
                        z12 = z10;
                    }
                    nVar2.f17251c = z12;
                    if (z12) {
                        z13 = z11;
                    } else {
                        z13 = z11;
                    }
                    nVar2.f17254f = z13;
                } else {
                    i12 = i17;
                    this.f17268g.b(i12);
                    this.f17269h.b(i12);
                    this.f17270i.b(i12);
                }
                this.f17271j.b(i12);
                this.f17272k.b(i12);
                i13 = i13;
                bArr = bArr;
                i14 = i16;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f17274m = j10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f17266e) {
            n nVar = this.f17265d;
            if (nVar.f17254f) {
                int i12 = nVar.f17252d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    nVar.f17255g = (bArr[i13] & 128) != 0;
                    nVar.f17254f = false;
                } else {
                    nVar.f17252d = (i11 - i10) + i12;
                }
            }
        } else {
            this.f17268g.a(bArr, i10, i11);
            this.f17269h.a(bArr, i10, i11);
            this.f17270i.a(bArr, i10, i11);
        }
        this.f17271j.a(bArr, i10, i11);
        this.f17272k.a(bArr, i10, i11);
    }
}
