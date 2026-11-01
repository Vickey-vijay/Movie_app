package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f17235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17237c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17241g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f17245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17247m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f17242h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f17238d = new r(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f17239e = new r(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f17240f = new r(6);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17248n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f17242h);
        r rVar = this.f17238d;
        rVar.f17295b = false;
        rVar.f17296c = false;
        r rVar2 = this.f17239e;
        rVar2.f17295b = false;
        rVar2.f17296c = false;
        r rVar3 = this.f17240f;
        rVar3.f17295b = false;
        rVar3.f17296c = false;
        l lVar = this.f17245k;
        lVar.f17227k = false;
        lVar.f17231o = false;
        k kVar = lVar.f17230n;
        kVar.f17202b = false;
        kVar.f17201a = false;
        this.f17241g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public m(x xVar, boolean z10, boolean z11) {
        this.f17235a = xVar;
        this.f17236b = z10;
        this.f17237c = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f17243i = e0Var.f17165e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f17164d, 2);
        this.f17244j = gVarA;
        this.f17245k = new l(gVarA, this.f17236b, this.f17237c);
        this.f17235a.a(jVar, e0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f17247m = j10;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0293  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:94:0x024d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0251  */
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
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        boolean z12;
        int i20 = nVar.f17846b;
        int i21 = nVar.f17847c;
        byte[] bArr2 = nVar.f17845a;
        int i22 = i21 - i20;
        this.f17241g += (long) i22;
        this.f17244j.a(i22, nVar);
        while (true) {
            int iA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr2, i20, i21, this.f17242h);
            if (iA == i21) {
                break;
            }
            int i23 = iA + 3;
            int i24 = bArr2[i23] & 31;
            int i25 = iA - i20;
            if (i25 > 0) {
                if (!this.f17246l || this.f17245k.f17219c) {
                    this.f17238d.a(bArr2, i20, iA);
                    this.f17239e.a(bArr2, i20, iA);
                }
                this.f17240f.a(bArr2, i20, iA);
                this.f17245k.a(bArr2, i20, iA);
            }
            int i26 = i21 - iA;
            long j10 = this.f17241g - ((long) i26);
            int i27 = i25 < 0 ? -i25 : 0;
            long j11 = this.f17247m;
            if (!this.f17246l || this.f17245k.f17219c) {
                this.f17238d.a(i27);
                this.f17239e.a(i27);
                if (!this.f17246l) {
                    if (this.f17238d.f17296c && this.f17239e.f17296c) {
                        ArrayList arrayList = new ArrayList();
                        r rVar = this.f17238d;
                        arrayList.add(Arrays.copyOf(rVar.f17297d, rVar.f17298e));
                        r rVar2 = this.f17239e;
                        arrayList.add(Arrays.copyOf(rVar2.f17297d, rVar2.f17298e));
                        r rVar3 = this.f17238d;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVarA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar3.f17297d, 3, rVar3.f17298e);
                        r rVar4 = this.f17239e;
                        i10 = i21;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar4.f17297d, 3, rVar4.f17298e);
                        oVar.d(8);
                        int iD = oVar.d();
                        int iD2 = oVar.d();
                        oVar.f();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(oVar.c(), iD, iD2);
                        bArr = bArr2;
                        i11 = i23;
                        i12 = i24;
                        this.f17244j.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f17243i, "video/avc", -1, kVarA.f17828b, kVarA.f17829c, arrayList, -1, kVarA.f17830d, null, -1, null, null));
                        this.f17246l = true;
                        this.f17245k.f17220d.append(kVarA.f17827a, kVarA);
                        this.f17245k.f17221e.append(iD, jVar);
                        r rVar5 = this.f17238d;
                        rVar5.f17295b = false;
                        rVar5.f17296c = false;
                        r rVar6 = this.f17239e;
                        rVar6.f17295b = false;
                        rVar6.f17296c = false;
                    } else {
                        i10 = i21;
                        bArr = bArr2;
                        i11 = i23;
                        i12 = i24;
                    }
                } else {
                    i10 = i21;
                    bArr = bArr2;
                    i11 = i23;
                    i12 = i24;
                    r rVar7 = this.f17238d;
                    if (rVar7.f17296c) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVarA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar7.f17297d, 3, rVar7.f17298e);
                        this.f17245k.f17220d.append(kVarA2.f17827a, kVarA2);
                        r rVar8 = this.f17238d;
                        rVar8.f17295b = false;
                        rVar8.f17296c = false;
                    } else {
                        r rVar9 = this.f17239e;
                        if (rVar9.f17296c) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar9.f17297d, 3, rVar9.f17298e);
                            oVar2.d(8);
                            int iD3 = oVar2.d();
                            int iD4 = oVar2.d();
                            oVar2.f();
                            this.f17245k.f17221e.append(iD3, new com.fyber.inneractive.sdk.player.exoplayer2.util.j(oVar2.c(), iD3, iD4));
                            r rVar10 = this.f17239e;
                            rVar10.f17295b = false;
                            rVar10.f17296c = false;
                        }
                    }
                }
            } else {
                i10 = i21;
                bArr = bArr2;
                i11 = i23;
                i12 = i24;
            }
            if (this.f17240f.a(i27)) {
                r rVar11 = this.f17240f;
                int iA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar11.f17298e, rVar11.f17297d);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17248n;
                nVar2.f17845a = this.f17240f.f17297d;
                nVar2.f17847c = iA2;
                nVar2.f17846b = 0;
                nVar2.e(4);
                com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j11, this.f17248n, this.f17235a.f17332b);
            }
            l lVar = this.f17245k;
            if (lVar.f17225i != 9) {
                if (lVar.f17219c) {
                    k kVar = lVar.f17230n;
                    k kVar2 = lVar.f17229m;
                    if (kVar.f17201a && (!kVar2.f17201a || kVar.f17206f != kVar2.f17206f || kVar.f17207g != kVar2.f17207g || kVar.f17208h != kVar2.f17208h || ((kVar.f17209i && kVar2.f17209i && kVar.f17210j != kVar2.f17210j) || (((i17 = kVar.f17204d) != (i18 = kVar2.f17204d) && (i17 == 0 || i18 == 0)) || (((i19 = kVar.f17203c.f17834h) == 0 && kVar2.f17203c.f17834h == 0 && (kVar.f17213m != kVar2.f17213m || kVar.f17214n != kVar2.f17214n)) || ((i19 == 1 && kVar2.f17203c.f17834h == 1 && (kVar.f17215o != kVar2.f17215o || kVar.f17216p != kVar2.f17216p)) || (z11 = kVar.f17211k) != (z12 = kVar2.f17211k) || (z11 && z12 && kVar.f17212l != kVar2.f17212l))))))) {
                        if (lVar.f17231o) {
                            long j12 = lVar.f17226j;
                            lVar.f17217a.a(lVar.f17233q, lVar.f17234r ? 1 : 0, (int) (j12 - lVar.f17232p), i26 + ((int) (j10 - j12)), null);
                        }
                        lVar.f17232p = lVar.f17226j;
                        lVar.f17233q = lVar.f17228l;
                        lVar.f17234r = false;
                        i13 = 1;
                        lVar.f17231o = true;
                    }
                }
                i13 = 1;
            } else {
                if (lVar.f17231o) {
                    long j13 = lVar.f17226j;
                    lVar.f17217a.a(lVar.f17233q, lVar.f17234r ? 1 : 0, (int) (j13 - lVar.f17232p), i26 + ((int) (j10 - j13)), null);
                }
                lVar.f17232p = lVar.f17226j;
                lVar.f17233q = lVar.f17228l;
                lVar.f17234r = false;
                i13 = 1;
                lVar.f17231o = true;
            }
            boolean z13 = lVar.f17234r;
            int i28 = lVar.f17225i;
            if (i28 == 5) {
                z10 = true;
            } else {
                if (lVar.f17218b && i28 == i13) {
                    k kVar3 = lVar.f17230n;
                    if (kVar3.f17202b && ((i16 = kVar3.f17205e) == 7 || i16 == 2)) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            lVar.f17234r = z10 | z13;
            long j14 = this.f17247m;
            if (!this.f17246l || this.f17245k.f17219c) {
                i14 = i12;
                this.f17238d.b(i14);
                this.f17239e.b(i14);
            } else {
                i14 = i12;
            }
            this.f17240f.b(i14);
            l lVar2 = this.f17245k;
            lVar2.f17225i = i14;
            lVar2.f17228l = j14;
            lVar2.f17226j = j10;
            if (lVar2.f17218b) {
                i15 = 1;
                if (i14 == 1) {
                    k kVar4 = lVar2.f17229m;
                    lVar2.f17229m = lVar2.f17230n;
                    lVar2.f17230n = kVar4;
                    kVar4.f17202b = false;
                    kVar4.f17201a = false;
                    lVar2.f17224h = 0;
                    lVar2.f17227k = true;
                }
                i21 = i10;
                bArr2 = bArr;
                i20 = i11;
            } else {
                i15 = 1;
            }
            if (lVar2.f17219c && (i14 == 5 || i14 == i15 || i14 == 2)) {
                k kVar5 = lVar2.f17229m;
                lVar2.f17229m = lVar2.f17230n;
                lVar2.f17230n = kVar5;
                kVar5.f17202b = false;
                kVar5.f17201a = false;
                lVar2.f17224h = 0;
                lVar2.f17227k = true;
            }
            i21 = i10;
            bArr2 = bArr;
            i20 = i11;
        }
        if (!this.f17246l || this.f17245k.f17219c) {
            this.f17238d.a(bArr2, i20, i21);
            this.f17239e.a(bArr2, i20, i21);
        }
        this.f17240f.a(bArr2, i20, i21);
        this.f17245k.a(bArr2, i20, i21);
    }
}
