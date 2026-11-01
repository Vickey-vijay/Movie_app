package yads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class i01 implements ul0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f78421l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb3 f78422a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h01 f78427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f78429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m73 f78430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f78431j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f78424c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g01 f78425d = new g01();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f78432k = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zx1 f78426e = new zx1(178);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f78423b = new jb2();

    /* JADX WARN: Code duplicated, block: B:129:0x0298  */
    /* JADX WARN: Multi-variable type inference failed */
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
        boolean z10;
        int i12;
        int i13;
        float f10;
        if (this.f78427f == null) {
            throw new IllegalStateException();
        }
        m73 m73Var = this.f78430i;
        if (m73Var == null) {
            throw new IllegalStateException();
        }
        int i14 = jb2Var.f78967b;
        int i15 = jb2Var.f78968c;
        byte[] bArr = jb2Var.f78966a;
        int i16 = i15 - i14;
        this.f78428g += (long) i16;
        m73Var.a(i16, jb2Var);
        while (true) {
            int iA = dy1.a(bArr, i14, i15, this.f78424c);
            if (iA == i15) {
                if (!this.f78431j) {
                    this.f78425d.a(bArr, i14, i15);
                }
                h01 h01Var = this.f78427f;
                if (h01Var.f77999c) {
                    int i17 = h01Var.f78002f;
                    int i18 = (i14 + 1) - i17;
                    if (i18 < i15) {
                        h01Var.f78000d = ((bArr[i18] & 192) >> 6) == 0;
                        h01Var.f77999c = false;
                    } else {
                        h01Var.f78002f = (i15 - i14) + i17;
                    }
                }
                zx1 zx1Var = this.f78426e;
                if (zx1Var != null) {
                    zx1Var.a(bArr, i14, i15);
                    return;
                }
                return;
            }
            int i19 = iA + 3;
            byte b10 = jb2Var.f78966a[i19];
            int i20 = b10 & 255;
            int i21 = iA - i14;
            if (this.f78431j) {
                i10 = i15;
                i11 = i19;
            } else {
                if (i21 > 0) {
                    this.f78425d.a(bArr, i14, iA);
                }
                int i22 = i21 < 0 ? -i21 : 0;
                g01 g01Var = this.f78425d;
                int i23 = g01Var.f77576b;
                if (i23 != 0) {
                    i11 = i19;
                    if (i23 == 1) {
                        i10 = i15;
                        i13 = 0;
                        if (i20 != 181) {
                            ih1.d("H263Reader", "Unexpected start code value");
                            g01Var.f77575a = false;
                            g01Var.f77577c = 0;
                            g01Var.f77576b = 0;
                        } else {
                            g01Var.f77576b = 2;
                        }
                    } else if (i23 == 2) {
                        i10 = i15;
                        i13 = 0;
                        if (i20 > 31) {
                            ih1.d("H263Reader", "Unexpected start code value");
                            g01Var.f77575a = false;
                            g01Var.f77577c = 0;
                            g01Var.f77576b = 0;
                        } else {
                            g01Var.f77576b = 3;
                        }
                    } else if (i23 == 3) {
                        i10 = i15;
                        if ((b10 & 240) != 32) {
                            ih1.d("H263Reader", "Unexpected start code value");
                            i13 = 0;
                            g01Var.f77575a = false;
                            g01Var.f77577c = 0;
                            g01Var.f77576b = 0;
                        } else {
                            i13 = 0;
                            g01Var.f77578d = g01Var.f77577c;
                            g01Var.f77576b = 4;
                        }
                    } else {
                        if (i23 != 4) {
                            throw new IllegalStateException();
                        }
                        if (i20 == 179 || i20 == 181) {
                            g01Var.f77577c -= i22;
                            g01Var.f77575a = false;
                            m73 m73Var2 = this.f78430i;
                            int i24 = g01Var.f77578d;
                            String str = this.f78429h;
                            str.getClass();
                            byte[] bArrCopyOf = Arrays.copyOf(g01Var.f77579e, g01Var.f77577c);
                            ib2 ib2Var = new ib2(bArrCopyOf.length, bArrCopyOf);
                            ib2Var.d(i24);
                            ib2Var.d(4);
                            ib2Var.g();
                            ib2Var.c(8);
                            if (ib2Var.e()) {
                                ib2Var.c(4);
                                ib2Var.c(3);
                            }
                            int iA2 = ib2Var.a(4);
                            i10 = i15;
                            if (iA2 == 15) {
                                int iA3 = ib2Var.a(8);
                                int iA4 = ib2Var.a(8);
                                if (iA4 == 0) {
                                    ih1.d("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                } else {
                                    f10 = iA3 / iA4;
                                }
                            } else {
                                float[] fArr = f78421l;
                                if (iA2 < 7) {
                                    f10 = fArr[iA2];
                                } else {
                                    ih1.d("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                }
                            }
                            if (ib2Var.e()) {
                                ib2Var.c(2);
                                ib2Var.c(1);
                                if (ib2Var.e()) {
                                    ib2Var.c(15);
                                    ib2Var.g();
                                    ib2Var.c(15);
                                    ib2Var.g();
                                    ib2Var.c(15);
                                    ib2Var.g();
                                    ib2Var.c(3);
                                    ib2Var.c(11);
                                    ib2Var.g();
                                    ib2Var.c(15);
                                    ib2Var.g();
                                }
                            }
                            if (ib2Var.a(2) != 0) {
                                ih1.d("H263Reader", "Unhandled video object layer shape");
                            }
                            ib2Var.g();
                            int iA5 = ib2Var.a(16);
                            ib2Var.g();
                            if (ib2Var.e()) {
                                if (iA5 == 0) {
                                    ih1.d("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i25 = 0;
                                    for (int i26 = iA5 - 1; i26 > 0; i26 >>= 1) {
                                        i25++;
                                    }
                                    ib2Var.c(i25);
                                }
                            }
                            ib2Var.g();
                            int iA6 = ib2Var.a(13);
                            ib2Var.g();
                            int iA7 = ib2Var.a(13);
                            ib2Var.g();
                            ib2Var.g();
                            lx0 lx0Var = new lx0();
                            lx0Var.f79957a = str;
                            lx0Var.f79967k = "video/mp4v-es";
                            lx0Var.f79972p = iA6;
                            lx0Var.f79973q = iA7;
                            lx0Var.f79976t = f10;
                            lx0Var.f79969m = Collections.singletonList(bArrCopyOf);
                            m73Var2.a(new mx0(lx0Var));
                            this.f78431j = true;
                        } else {
                            i10 = i15;
                            i13 = 0;
                        }
                    }
                } else {
                    i10 = i15;
                    i11 = i19;
                    i13 = 0;
                    if (i20 == 176) {
                        g01Var.f77576b = 1;
                        g01Var.f77575a = true;
                    }
                }
                g01Var.a(g01.f77574f, i13, 3);
            }
            h01 h01Var2 = this.f78427f;
            if (h01Var2.f77999c) {
                int i27 = h01Var2.f78002f;
                int i28 = (i14 + 1) - i27;
                if (i28 < iA) {
                    h01Var2.f78000d = ((bArr[i28] & 192) >> 6) == 0;
                    h01Var2.f77999c = false;
                } else {
                    h01Var2.f78002f = i27 + i21;
                }
            }
            zx1 zx1Var2 = this.f78426e;
            if (zx1Var2 == null) {
                z10 = true;
            } else {
                if (i21 > 0) {
                    zx1Var2.a(bArr, i14, iA);
                    i12 = 0;
                } else {
                    i12 = -i21;
                }
                if (this.f78426e.a(i12)) {
                    zx1 zx1Var3 = this.f78426e;
                    int iA8 = dy1.a(zx1Var3.f85645e, zx1Var3.f85644d);
                    jb2 jb2Var2 = this.f78423b;
                    int i29 = ib3.f78556a;
                    jb2Var2.f78966a = this.f78426e.f85644d;
                    jb2Var2.f78968c = iA8;
                    jb2Var2.f78967b = 0;
                    gb3 gb3Var = this.f78422a;
                    long j10 = this.f78432k;
                    gb3Var.getClass();
                    if (jb2Var2.f78968c - jb2Var2.f78967b >= 9) {
                        int iB = jb2Var2.b();
                        int iB2 = jb2Var2.b();
                        int iM = jb2Var2.m();
                        if (iB == 434 && iB2 == 1195456820 && iM == 3) {
                            rt.b(j10, jb2Var2, gb3Var.f77725b);
                        }
                    }
                }
                if (i20 == 178) {
                    z10 = true;
                    if (jb2Var.f78966a[iA + 2] == 1) {
                        this.f78426e.b(i20);
                    }
                } else {
                    z10 = true;
                }
            }
            int i30 = i10 - iA;
            long j11 = this.f78428g - ((long) i30);
            h01 h01Var3 = this.f78427f;
            boolean z11 = this.f78431j;
            if (h01Var3.f78001e == 182 && z11 && h01Var3.f77998b) {
                long j12 = h01Var3.f78004h;
                if (j12 != -9223372036854775807L) {
                    h01Var3.f77997a.a(j12, h01Var3.f78000d ? 1 : 0, (int) (j11 - h01Var3.f78003g), i30, null);
                }
            }
            if (h01Var3.f78001e != 179) {
                h01Var3.f78003g = j11;
            }
            h01 h01Var4 = this.f78427f;
            long j13 = this.f78432k;
            h01Var4.f78001e = i20;
            h01Var4.f78000d = false;
            h01Var4.f77998b = (i20 == 182 || i20 == 179) ? z10 : false;
            h01Var4.f77999c = i20 == 182 ? z10 : false;
            h01Var4.f78002f = 0;
            h01Var4.f78004h = j13;
            i14 = i11;
            i15 = i10;
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    public i01(gb3 gb3Var) {
        this.f78422a = gb3Var;
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f78429h = l93Var.f79734e;
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f79733d, 2);
        this.f78430i = m73VarA;
        this.f78427f = new h01(m73VarA);
        gb3 gb3Var = this.f78422a;
        if (gb3Var != null) {
            gb3Var.a(pq0Var, l93Var);
        }
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f78432k = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        dy1.a(this.f78424c);
        g01 g01Var = this.f78425d;
        g01Var.f77575a = false;
        g01Var.f77577c = 0;
        g01Var.f77576b = 0;
        h01 h01Var = this.f78427f;
        if (h01Var != null) {
            h01Var.f77998b = false;
            h01Var.f77999c = false;
            h01Var.f78000d = false;
            h01Var.f78001e = -1;
        }
        zx1 zx1Var = this.f78426e;
        if (zx1Var != null) {
            zx1Var.f85642b = false;
            zx1Var.f85643c = false;
        }
        this.f78428g = 0L;
        this.f78432k = -9223372036854775807L;
    }
}
