package yads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class f01 implements ul0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f77239q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f77241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gb3 f77242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f77243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zx1 f77244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f77245f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01 f77246g = new e01();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f77247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f77248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f77249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f77250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f77251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f77252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f77253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f77254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f77255p;

    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
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
        boolean z10;
        boolean z11;
        int i11;
        float f10;
        int i12;
        float f11;
        long j10;
        int i13;
        double[] dArr;
        double d10;
        int i14;
        int i15;
        m73 m73Var = this.f77241b;
        if (m73Var == null) {
            throw new IllegalStateException();
        }
        int i16 = jb2Var.f78967b;
        int i17 = jb2Var.f78968c;
        byte[] bArr = jb2Var.f78966a;
        int i18 = i17 - i16;
        this.f77247h += (long) i18;
        m73Var.a(i18, jb2Var);
        while (true) {
            int iA = dy1.a(bArr, i16, i17, this.f77245f);
            if (iA == i17) {
                break;
            }
            int i19 = iA + 3;
            int i20 = jb2Var.f78966a[i19] & 255;
            int i21 = iA - i16;
            if (this.f77249j) {
                i10 = i19;
            } else {
                if (i21 > 0) {
                    this.f77246g.a(bArr, i16, iA);
                }
                int i22 = i21 < 0 ? -i21 : 0;
                e01 e01Var = this.f77246g;
                if (e01Var.f76870a) {
                    int i23 = e01Var.f76871b - i22;
                    e01Var.f76871b = i23;
                    if (e01Var.f76872c == 0 && i20 == 181) {
                        e01Var.f76872c = i23;
                        i10 = i19;
                    } else {
                        e01Var.f76870a = false;
                        String str = this.f77240a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(e01Var.f76873d, e01Var.f76871b);
                        int i24 = bArrCopyOf[4] & 255;
                        byte b10 = bArrCopyOf[5];
                        i10 = i19;
                        int i25 = (i24 << 4) | ((b10 & 255) >> 4);
                        int i26 = (bArrCopyOf[6] & 255) | ((b10 & 15) << 8);
                        int i27 = (bArrCopyOf[7] & 240) >> 4;
                        if (i27 == 2) {
                            f10 = i26 * 4;
                            i12 = i25 * 3;
                        } else if (i27 != 3) {
                            if (i27 != 4) {
                                f11 = 1.0f;
                            } else {
                                f10 = i26 * 121;
                                i12 = i25 * 100;
                            }
                            lx0 lx0Var = new lx0();
                            lx0Var.f79957a = str;
                            lx0Var.f79967k = "video/mpeg2";
                            lx0Var.f79972p = i25;
                            lx0Var.f79973q = i26;
                            lx0Var.f79976t = f11;
                            lx0Var.f79969m = Collections.singletonList(bArrCopyOf);
                            mx0 mx0Var = new mx0(lx0Var);
                            j10 = 0;
                            i13 = (bArrCopyOf[7] & 15) - 1;
                            if (i13 >= 0) {
                                dArr = f77239q;
                                if (i13 < 8) {
                                    d10 = dArr[i13];
                                    byte b11 = bArrCopyOf[e01Var.f76872c + 9];
                                    i14 = (b11 & 96) >> 5;
                                    i15 = b11 & 31;
                                    if (i14 != i15) {
                                        d10 *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                                    }
                                    j10 = (long) (1000000.0d / d10);
                                }
                            }
                            Pair pairCreate = Pair.create(mx0Var, Long.valueOf(j10));
                            this.f77241b.a((mx0) pairCreate.first);
                            this.f77250k = ((Long) pairCreate.second).longValue();
                            this.f77249j = true;
                        } else {
                            f10 = i26 * 16;
                            i12 = i25 * 9;
                        }
                        f11 = f10 / i12;
                        lx0 lx0Var2 = new lx0();
                        lx0Var2.f79957a = str;
                        lx0Var2.f79967k = "video/mpeg2";
                        lx0Var2.f79972p = i25;
                        lx0Var2.f79973q = i26;
                        lx0Var2.f79976t = f11;
                        lx0Var2.f79969m = Collections.singletonList(bArrCopyOf);
                        mx0 mx0Var2 = new mx0(lx0Var2);
                        j10 = 0;
                        i13 = (bArrCopyOf[7] & 15) - 1;
                        if (i13 >= 0) {
                            dArr = f77239q;
                            if (i13 < 8) {
                                d10 = dArr[i13];
                                byte b12 = bArrCopyOf[e01Var.f76872c + 9];
                                i14 = (b12 & 96) >> 5;
                                i15 = b12 & 31;
                                if (i14 != i15) {
                                    d10 *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                                }
                                j10 = (long) (1000000.0d / d10);
                            }
                        }
                        Pair pairCreate2 = Pair.create(mx0Var2, Long.valueOf(j10));
                        this.f77241b.a((mx0) pairCreate2.first);
                        this.f77250k = ((Long) pairCreate2.second).longValue();
                        this.f77249j = true;
                    }
                } else {
                    i10 = i19;
                    if (i20 == 179) {
                        e01Var.f76870a = true;
                    }
                }
                e01Var.a(e01.f76869e, 0, 3);
            }
            zx1 zx1Var = this.f77244e;
            if (zx1Var != null) {
                if (i21 > 0) {
                    zx1Var.a(bArr, i16, iA);
                    i11 = 0;
                } else {
                    i11 = -i21;
                }
                if (this.f77244e.a(i11)) {
                    zx1 zx1Var2 = this.f77244e;
                    int iA2 = dy1.a(zx1Var2.f85645e, zx1Var2.f85644d);
                    jb2 jb2Var2 = this.f77243d;
                    int i28 = ib3.f78556a;
                    jb2Var2.f78966a = this.f77244e.f85644d;
                    jb2Var2.f78968c = iA2;
                    jb2Var2.f78967b = 0;
                    gb3 gb3Var = this.f77242c;
                    long j11 = this.f77253n;
                    gb3Var.getClass();
                    if (jb2Var2.f78968c - jb2Var2.f78967b >= 9) {
                        int iB = jb2Var2.b();
                        int iB2 = jb2Var2.b();
                        int iM = jb2Var2.m();
                        if (iB == 434 && iB2 == 1195456820 && iM == 3) {
                            rt.b(j11, jb2Var2, gb3Var.f77725b);
                        }
                    }
                }
                if (i20 == 178 && jb2Var.f78966a[iA + 2] == 1) {
                    this.f77244e.b(i20);
                }
            }
            if (i20 == 0 || i20 == 179) {
                int i29 = i17 - iA;
                if (this.f77255p && this.f77249j) {
                    long j12 = this.f77253n;
                    if (j12 != -9223372036854775807L) {
                        this.f77241b.a(j12, this.f77254o ? 1 : 0, ((int) (this.f77247h - this.f77252m)) - i29, i29, null);
                    }
                }
                if (!this.f77248i || this.f77255p) {
                    this.f77252m = this.f77247h - ((long) i29);
                    long j13 = this.f77251l;
                    if (j13 == -9223372036854775807L) {
                        long j14 = this.f77253n;
                        j13 = j14 != -9223372036854775807L ? j14 + this.f77250k : -9223372036854775807L;
                    }
                    this.f77253n = j13;
                    z10 = false;
                    this.f77254o = false;
                    this.f77251l = -9223372036854775807L;
                    z11 = true;
                    this.f77248i = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                this.f77255p = i20 == 0 ? z11 : z10;
            } else if (i20 == 184) {
                this.f77254o = true;
            }
            i16 = i10;
        }
        if (!this.f77249j) {
            this.f77246g.a(bArr, i16, i17);
        }
        zx1 zx1Var3 = this.f77244e;
        if (zx1Var3 != null) {
            zx1Var3.a(bArr, i16, i17);
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public f01(gb3 gb3Var) {
        this.f77242c = gb3Var;
        if (gb3Var != null) {
            this.f77244e = new zx1(178);
            this.f77243d = new jb2();
        } else {
            this.f77244e = null;
            this.f77243d = null;
        }
        this.f77251l = -9223372036854775807L;
        this.f77253n = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f77240a = l93Var.f79734e;
        l93Var.b();
        this.f77241b = pq0Var.a(l93Var.f79733d, 2);
        gb3 gb3Var = this.f77242c;
        if (gb3Var != null) {
            gb3Var.a(pq0Var, l93Var);
        }
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        this.f77251l = j10;
    }

    @Override // yads.ul0
    public final void a() {
        dy1.a(this.f77245f);
        e01 e01Var = this.f77246g;
        e01Var.f76870a = false;
        e01Var.f76871b = 0;
        e01Var.f76872c = 0;
        zx1 zx1Var = this.f77244e;
        if (zx1Var != null) {
            zx1Var.f85642b = false;
            zx1Var.f85643c = false;
        }
        this.f77247h = 0L;
        this.f77248i = false;
        this.f77251l = -9223372036854775807L;
        this.f77253n = -9223372036854775807L;
    }
}
