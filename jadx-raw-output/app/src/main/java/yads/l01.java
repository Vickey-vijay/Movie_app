package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class l01 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx2 f79636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79638c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f79642g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f79644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m73 f79645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k01 f79646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f79647l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f79649n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f79643h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zx1 f79639d = new zx1(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zx1 f79640e = new zx1(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zx1 f79641f = new zx1(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f79648m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jb2 f79650o = new jb2();

    /* JADX WARN: Code duplicated, block: B:104:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x027b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0292  */
    /* JADX WARN: Code duplicated, block: B:150:0x0319  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
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
        byte[] bArr;
        long j10;
        int i12;
        long j11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        m73 m73Var = this.f79645j;
        if (m73Var == null) {
            throw new IllegalStateException();
        }
        int i18 = ib3.f78556a;
        int i19 = jb2Var.f78967b;
        int i20 = jb2Var.f78968c;
        byte[] bArr2 = jb2Var.f78966a;
        int i21 = i20 - i19;
        this.f79642g += (long) i21;
        m73Var.a(i21, jb2Var);
        while (true) {
            int iA = dy1.a(bArr2, i19, i20, this.f79643h);
            if (iA == i20) {
                if (!this.f79647l || this.f79646k.f79260c) {
                    this.f79639d.a(bArr2, i19, i20);
                    this.f79640e.a(bArr2, i19, i20);
                }
                this.f79641f.a(bArr2, i19, i20);
                this.f79646k.a(bArr2, i19, i20);
                return;
            }
            int i22 = iA + 3;
            int i23 = bArr2[i22] & 31;
            int i24 = iA - i19;
            if (i24 > 0) {
                if (!this.f79647l || this.f79646k.f79260c) {
                    this.f79639d.a(bArr2, i19, iA);
                    this.f79640e.a(bArr2, i19, iA);
                }
                this.f79641f.a(bArr2, i19, iA);
                this.f79646k.a(bArr2, i19, iA);
            }
            int i25 = i20 - iA;
            long j12 = this.f79642g - ((long) i25);
            int i26 = i24 < 0 ? -i24 : 0;
            long j13 = this.f79648m;
            if (!this.f79647l || this.f79646k.f79260c) {
                this.f79639d.a(i26);
                this.f79640e.a(i26);
                if (this.f79647l) {
                    i10 = i22;
                    i11 = i20;
                    bArr = bArr2;
                    zx1 zx1Var = this.f79639d;
                    if (zx1Var.f85643c) {
                        cy1 cy1VarB = dy1.b(zx1Var.f85644d, 3, zx1Var.f85645e);
                        this.f79646k.f79261d.append(cy1VarB.f76475d, cy1VarB);
                        zx1 zx1Var2 = this.f79639d;
                        zx1Var2.f85642b = false;
                        zx1Var2.f85643c = false;
                    } else {
                        zx1 zx1Var3 = this.f79640e;
                        if (zx1Var3.f85643c) {
                            kb2 kb2Var = new kb2(zx1Var3.f85644d, 4, zx1Var3.f85645e);
                            int iD = kb2Var.d();
                            int iD2 = kb2Var.d();
                            kb2Var.f();
                            this.f79646k.f79262e.append(iD, new by1(iD, iD2, kb2Var.c()));
                            zx1 zx1Var4 = this.f79640e;
                            zx1Var4.f85642b = false;
                            zx1Var4.f85643c = false;
                        }
                    }
                } else if (this.f79639d.f85643c && this.f79640e.f85643c) {
                    ArrayList arrayList = new ArrayList();
                    zx1 zx1Var5 = this.f79639d;
                    arrayList.add(Arrays.copyOf(zx1Var5.f85644d, zx1Var5.f85645e));
                    zx1 zx1Var6 = this.f79640e;
                    arrayList.add(Arrays.copyOf(zx1Var6.f85644d, zx1Var6.f85645e));
                    zx1 zx1Var7 = this.f79639d;
                    cy1 cy1VarB2 = dy1.b(zx1Var7.f85644d, 3, zx1Var7.f85645e);
                    zx1 zx1Var8 = this.f79640e;
                    i10 = i22;
                    kb2 kb2Var2 = new kb2(zx1Var8.f85644d, 4, zx1Var8.f85645e);
                    int iD3 = kb2Var2.d();
                    int iD4 = kb2Var2.d();
                    kb2Var2.f();
                    by1 by1Var = new by1(iD3, iD4, kb2Var2.c());
                    i11 = i20;
                    bArr = bArr2;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(cy1VarB2.f76472a), Integer.valueOf(cy1VarB2.f76473b), Integer.valueOf(cy1VarB2.f76474c));
                    m73 m73Var2 = this.f79645j;
                    lx0 lx0Var = new lx0();
                    lx0Var.f79957a = this.f79644i;
                    lx0Var.f79967k = "video/avc";
                    lx0Var.f79964h = str;
                    lx0Var.f79972p = cy1VarB2.f76476e;
                    lx0Var.f79973q = cy1VarB2.f76477f;
                    lx0Var.f79976t = cy1VarB2.f76478g;
                    lx0Var.f79969m = arrayList;
                    m73Var2.a(new mx0(lx0Var));
                    this.f79647l = true;
                    this.f79646k.f79261d.append(cy1VarB2.f76475d, cy1VarB2);
                    this.f79646k.f79262e.append(iD3, by1Var);
                    zx1 zx1Var9 = this.f79639d;
                    zx1Var9.f85642b = false;
                    zx1Var9.f85643c = false;
                    zx1 zx1Var10 = this.f79640e;
                    zx1Var10.f85642b = false;
                    zx1Var10.f85643c = false;
                } else {
                    i10 = i22;
                    i11 = i20;
                    bArr = bArr2;
                }
            } else {
                i10 = i22;
                i11 = i20;
                bArr = bArr2;
            }
            if (this.f79641f.a(i26)) {
                zx1 zx1Var11 = this.f79641f;
                int iA2 = dy1.a(zx1Var11.f85645e, zx1Var11.f85644d);
                jb2 jb2Var2 = this.f79650o;
                jb2Var2.f78966a = this.f79641f.f85644d;
                jb2Var2.f78968c = iA2;
                jb2Var2.f78967b = 0;
                jb2Var2.e(4);
                rt.a(j13, this.f79650o, this.f79636a.f80857b);
            }
            k01 k01Var = this.f79646k;
            boolean z11 = this.f79647l;
            boolean z12 = this.f79649n;
            if (k01Var.f79266i == 9) {
                if (z11 && k01Var.f79272o) {
                    j10 = k01Var.f79267j;
                    i12 = i25 + ((int) (j12 - j10));
                    j11 = k01Var.f79274q;
                    if (j11 != -9223372036854775807L) {
                        k01Var.f79258a.a(j11, k01Var.f79275r ? 1 : 0, (int) (j10 - k01Var.f79273p), i12, null);
                    }
                }
                k01Var.f79273p = k01Var.f79267j;
                k01Var.f79274q = k01Var.f79269l;
                k01Var.f79275r = false;
                k01Var.f79272o = true;
            } else if (k01Var.f79260c) {
                j01 j01Var = k01Var.f79271n;
                j01 j01Var2 = k01Var.f79270m;
                if (j01Var.f78870a) {
                    if (j01Var2.f78870a) {
                        cy1 cy1Var = j01Var.f78872c;
                        if (cy1Var == null) {
                            throw new IllegalStateException();
                        }
                        cy1 cy1Var2 = j01Var2.f78872c;
                        if (cy1Var2 == null) {
                            throw new IllegalStateException();
                        }
                        if (j01Var.f78875f != j01Var2.f78875f || j01Var.f78876g != j01Var2.f78876g || j01Var.f78877h != j01Var2.f78877h || ((j01Var.f78878i && j01Var2.f78878i && j01Var.f78879j != j01Var2.f78879j) || (((i15 = j01Var.f78873d) != (i16 = j01Var2.f78873d) && (i15 == 0 || i16 == 0)) || (((i17 = cy1Var.f76482k) == 0 && cy1Var2.f76482k == 0 && (j01Var.f78882m != j01Var2.f78882m || j01Var.f78883n != j01Var2.f78883n)) || ((i17 == 1 && cy1Var2.f76482k == 1 && (j01Var.f78884o != j01Var2.f78884o || j01Var.f78885p != j01Var2.f78885p)) || (z10 = j01Var.f78880k) != j01Var2.f78880k || (z10 && j01Var.f78881l != j01Var2.f78881l)))))) {
                            if (z11) {
                                j10 = k01Var.f79267j;
                                i12 = i25 + ((int) (j12 - j10));
                                j11 = k01Var.f79274q;
                                if (j11 != -9223372036854775807L) {
                                    k01Var.f79258a.a(j11, k01Var.f79275r ? 1 : 0, (int) (j10 - k01Var.f79273p), i12, null);
                                }
                            }
                            k01Var.f79273p = k01Var.f79267j;
                            k01Var.f79274q = k01Var.f79269l;
                            k01Var.f79275r = false;
                            k01Var.f79272o = true;
                        }
                    } else {
                        if (z11) {
                            j10 = k01Var.f79267j;
                            i12 = i25 + ((int) (j12 - j10));
                            j11 = k01Var.f79274q;
                            if (j11 != -9223372036854775807L) {
                                k01Var.f79258a.a(j11, k01Var.f79275r ? 1 : 0, (int) (j10 - k01Var.f79273p), i12, null);
                            }
                        }
                        k01Var.f79273p = k01Var.f79267j;
                        k01Var.f79274q = k01Var.f79269l;
                        k01Var.f79275r = false;
                        k01Var.f79272o = true;
                    }
                }
            }
            if (k01Var.f79259b) {
                j01 j01Var3 = k01Var.f79271n;
                z12 = j01Var3.f78871b && ((i14 = j01Var3.f78874e) == 7 || i14 == 2);
            }
            boolean z13 = k01Var.f79275r;
            int i27 = k01Var.f79266i;
            boolean z14 = z13 | (i27 == 5 || (z12 && i27 == 1));
            k01Var.f79275r = z14;
            if (z14) {
                this.f79649n = false;
            }
            long j14 = this.f79648m;
            if (!this.f79647l || this.f79646k.f79260c) {
                this.f79639d.b(i23);
                this.f79640e.b(i23);
            }
            this.f79641f.b(i23);
            k01 k01Var2 = this.f79646k;
            k01Var2.f79266i = i23;
            k01Var2.f79269l = j14;
            k01Var2.f79267j = j12;
            if (k01Var2.f79259b) {
                i13 = 1;
                if (i23 == 1) {
                    j01 j01Var4 = k01Var2.f79270m;
                    k01Var2.f79270m = k01Var2.f79271n;
                    k01Var2.f79271n = j01Var4;
                    j01Var4.f78871b = false;
                    j01Var4.f78870a = false;
                    k01Var2.f79265h = 0;
                    k01Var2.f79268k = true;
                }
                i19 = i10;
                i20 = i11;
                bArr2 = bArr;
            } else {
                i13 = 1;
            }
            if (k01Var2.f79260c && (i23 == 5 || i23 == i13 || i23 == 2)) {
                j01 j01Var5 = k01Var2.f79270m;
                k01Var2.f79270m = k01Var2.f79271n;
                k01Var2.f79271n = j01Var5;
                j01Var5.f78871b = false;
                j01Var5.f78870a = false;
                k01Var2.f79265h = 0;
                k01Var2.f79268k = true;
            }
            i19 = i10;
            i20 = i11;
            bArr2 = bArr;
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public l01(nx2 nx2Var, boolean z10, boolean z11) {
        this.f79636a = nx2Var;
        this.f79637b = z10;
        this.f79638c = z11;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f79644i = l93Var.f79734e;
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f79733d, 2);
        this.f79645j = m73VarA;
        this.f79646k = new k01(m73VarA, this.f79637b, this.f79638c);
        this.f79636a.a(pq0Var, l93Var);
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f79648m = j10;
        }
        this.f79649n = ((i10 & 2) != 0) | this.f79649n;
    }

    @Override // yads.ul0
    public final void a() {
        this.f79642g = 0L;
        this.f79649n = false;
        this.f79648m = -9223372036854775807L;
        dy1.a(this.f79643h);
        zx1 zx1Var = this.f79639d;
        zx1Var.f85642b = false;
        zx1Var.f85643c = false;
        zx1 zx1Var2 = this.f79640e;
        zx1Var2.f85642b = false;
        zx1Var2.f85643c = false;
        zx1 zx1Var3 = this.f79641f;
        zx1Var3.f85642b = false;
        zx1Var3.f85643c = false;
        k01 k01Var = this.f79646k;
        if (k01Var != null) {
            k01Var.a();
        }
    }
}
