package yads;

import android.util.Pair;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import yads.e73;
import yads.mq0;
import yads.sx0;

/* JADX INFO: loaded from: classes8.dex */
public final class sx0 implements mq0 {
    public static final byte[] G;
    public static final mx0 H;
    public int A;
    public boolean B;
    public pq0 C;
    public m73[] D;
    public m73[] E;
    public boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f82800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f82801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f82802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jb2 f82803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f82804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f82805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jb2 f82806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ym0 f82807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jb2 f82808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayDeque f82809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f82810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m73 f82811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f82812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f82813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f82814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f82815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jb2 f82816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f82817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f82818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f82819u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f82820v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f82821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public rx0 f82822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f82823y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f82824z;

    public sx0() {
        this(0);
    }

    public static kk0 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            wj wjVar = (wj) arrayList.get(i10);
            if (wjVar.f84603a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = wjVar.f84218b.f78966a;
                dl2 dl2VarA = el2.a(bArr);
                UUID uuid = dl2VarA == null ? null : dl2VarA.f76721a;
                if (uuid == null) {
                    ih1.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new jk0(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new kk0(null, false, (jk0[]) arrayList2.toArray(new jk0[0]));
    }

    public final e73 a(e73 e73Var) {
        return e73Var;
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.aa
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return sx0.a();
            }
        };
        G = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        lx0 lx0Var = new lx0();
        lx0Var.f79967k = "application/x-emsg";
        H = new mx0(lx0Var);
    }

    public sx0(int i10) {
        this(Collections.emptyList());
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        int size = this.f82801c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((rx0) this.f82801c.valueAt(i10)).b();
        }
        this.f82810l.clear();
        this.f82818t = 0;
        this.f82819u = j11;
        this.f82809k.clear();
        this.f82812n = 0;
        this.f82815q = 0;
    }

    public sx0(int i10, List list, m73 m73Var) {
        this.f82799a = i10;
        this.f82800b = Collections.unmodifiableList(list);
        this.f82811m = m73Var;
        this.f82807i = new ym0();
        this.f82808j = new jb2(16);
        this.f82802d = new jb2(dy1.f76843a);
        this.f82803e = new jb2(5);
        this.f82804f = new jb2();
        byte[] bArr = new byte[16];
        this.f82805g = bArr;
        this.f82806h = new jb2(bArr);
        this.f82809k = new ArrayDeque();
        this.f82810l = new ArrayDeque();
        this.f82801c = new SparseArray();
        this.f82820v = -9223372036854775807L;
        this.f82819u = -9223372036854775807L;
        this.f82821w = -9223372036854775807L;
        this.C = pq0.f81537a;
        this.D = new m73[0];
        this.E = new m73[0];
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        int i10;
        this.C = pq0Var;
        int i11 = 0;
        this.f82812n = 0;
        this.f82815q = 0;
        m73[] m73VarArr = new m73[2];
        this.D = m73VarArr;
        m73 m73Var = this.f82811m;
        if (m73Var != null) {
            m73VarArr[0] = m73Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f82799a & 4) != 0) {
            m73VarArr[i10] = pq0Var.a(100, 5);
            i10++;
            i12 = 101;
        }
        m73[] m73VarArr2 = (m73[]) ib3.a(i10, this.D);
        this.D = m73VarArr2;
        for (m73 m73Var2 : m73VarArr2) {
            m73Var2.a(H);
        }
        this.E = new m73[this.f82800b.size()];
        while (i11 < this.E.length) {
            m73 m73VarA = this.C.a(i12, 3);
            m73VarA.a((mx0) this.f82800b.get(i11));
            this.E[i11] = m73VarA;
            i11++;
            i12++;
        }
    }

    public sx0(List list) {
        this(0, list, null);
    }

    public final void a(vj vjVar) {
        re0 re0Var;
        re0 re0Var2;
        kk0 kk0VarA = a(vjVar.f83938c);
        vj vjVarB = vjVar.b(1836475768);
        vjVarB.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = vjVarB.f83938c.size();
        long jN = -9223372036854775807L;
        for (int i10 = 0; i10 < size; i10++) {
            wj wjVar = (wj) vjVarB.f83938c.get(i10);
            int i11 = wjVar.f84603a;
            if (i11 == 1953654136) {
                jb2 jb2Var = wjVar.f84218b;
                jb2Var.e(12);
                Pair pairCreate = Pair.create(Integer.valueOf(jb2Var.b()), new re0(jb2Var.b() - 1, jb2Var.b(), jb2Var.b(), jb2Var.b()));
                sparseArray.put(((Integer) pairCreate.first).intValue(), (re0) pairCreate.second);
            } else if (i11 == 1835362404) {
                jb2 jb2Var2 = wjVar.f84218b;
                jb2Var2.e(8);
                jN = ((jb2Var2.b() >> 24) & 255) == 0 ? jb2Var2.n() : jb2Var2.q();
            }
        }
        ArrayList arrayListA = ek.a(vjVar, new zy0(), jN, kk0VarA, (this.f82799a & 16) != 0, false, new wy0() { // from class: cp.z9
            @Override // yads.wy0
            public final Object apply(Object obj) {
                return this.f51738a.a((e73) obj);
            }
        });
        int size2 = arrayListA.size();
        if (this.f82801c.size() == 0) {
            for (int i12 = 0; i12 < size2; i12++) {
                n73 n73Var = (n73) arrayListA.get(i12);
                e73 e73Var = n73Var.f80583a;
                m73 m73VarA = this.C.a(i12, e73Var.f76960b);
                int i13 = e73Var.f76959a;
                if (sparseArray.size() == 1) {
                    re0Var2 = (re0) sparseArray.valueAt(0);
                } else {
                    re0Var2 = (re0) sparseArray.get(i13);
                    re0Var2.getClass();
                }
                this.f82801c.put(e73Var.f76959a, new rx0(m73VarA, n73Var, re0Var2));
                this.f82820v = Math.max(this.f82820v, e73Var.f76963e);
            }
            this.C.a();
            return;
        }
        if (this.f82801c.size() != size2) {
            throw new IllegalStateException();
        }
        for (int i14 = 0; i14 < size2; i14++) {
            n73 n73Var2 = (n73) arrayListA.get(i14);
            e73 e73Var2 = n73Var2.f80583a;
            rx0 rx0Var = (rx0) this.f82801c.get(e73Var2.f76959a);
            int i15 = e73Var2.f76959a;
            if (sparseArray.size() == 1) {
                re0Var = (re0) sparseArray.valueAt(0);
            } else {
                re0Var = (re0) sparseArray.get(i15);
                re0Var.getClass();
            }
            rx0Var.a(n73Var2, re0Var);
        }
    }

    public static void a(jb2 jb2Var, int i10, g73 g73Var) throws ob2 {
        jb2Var.e(i10 + 8);
        int iB = jb2Var.b();
        if ((iB & 1) == 0) {
            boolean z10 = (iB & 2) != 0;
            int iP = jb2Var.p();
            if (iP == 0) {
                Arrays.fill(g73Var.f77678l, 0, g73Var.f77671e, false);
                return;
            }
            if (iP == g73Var.f77671e) {
                Arrays.fill(g73Var.f77678l, 0, iP, z10);
                g73Var.f77680n.c(jb2Var.f78968c - jb2Var.f78967b);
                g73Var.f77677k = true;
                g73Var.f77681o = true;
                jb2 jb2Var2 = g73Var.f77680n;
                jb2Var.a(jb2Var2.f78966a, 0, jb2Var2.f78968c);
                g73Var.f77680n.e(0);
                g73Var.f77681o = false;
                return;
            }
            throw new ob2("Senc sample count " + iP + " is different from fragment sample count" + g73Var.f77671e, null, true, 1);
        }
        throw ob2.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code duplicated, block: B:179:0x03bd  */
    public final void a(long j10) throws ob2 {
        sx0 sx0Var;
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int i13;
        int i14;
        byte[] bArr2;
        byte[] bArr3;
        int i15;
        boolean z10;
        vj vjVar;
        int iB5;
        sx0 sx0Var2 = this;
        while (!sx0Var2.f82809k.isEmpty() && ((vj) sx0Var2.f82809k.peek()).f83937b == j10) {
            vj vjVar2 = (vj) sx0Var2.f82809k.pop();
            int i16 = vjVar2.f84603a;
            if (i16 == 1836019574) {
                sx0Var2.a(vjVar2);
            } else {
                if (i16 == 1836019558) {
                    SparseArray sparseArray = sx0Var2.f82801c;
                    int i17 = sx0Var2.f82799a;
                    byte[] bArr4 = sx0Var2.f82805g;
                    int size = vjVar2.f83939d.size();
                    int i18 = 0;
                    while (i18 < size) {
                        vj vjVar3 = (vj) vjVar2.f83939d.get(i18);
                        if (vjVar3.f84603a == 1953653094) {
                            wj wjVarC = vjVar3.c(1952868452);
                            wjVarC.getClass();
                            jb2 jb2Var = wjVarC.f84218b;
                            jb2Var.e(8);
                            int iB6 = jb2Var.b();
                            rx0 rx0Var = (rx0) sparseArray.get(jb2Var.b());
                            if (rx0Var == null) {
                                rx0Var = null;
                            } else {
                                if ((iB6 & 1) != 0) {
                                    long jQ = jb2Var.q();
                                    g73 g73Var = rx0Var.f82451b;
                                    g73Var.f77668b = jQ;
                                    g73Var.f77669c = jQ;
                                }
                                re0 re0Var = rx0Var.f82454e;
                                if ((iB6 & 2) != 0) {
                                    iB = jb2Var.b() - 1;
                                } else {
                                    iB = re0Var.f82221a;
                                }
                                if ((iB6 & 8) != 0) {
                                    iB2 = jb2Var.b();
                                } else {
                                    iB2 = re0Var.f82222b;
                                }
                                if ((iB6 & 16) != 0) {
                                    iB3 = jb2Var.b();
                                } else {
                                    iB3 = re0Var.f82223c;
                                }
                                if ((iB6 & 32) != 0) {
                                    iB4 = jb2Var.b();
                                } else {
                                    iB4 = re0Var.f82224d;
                                }
                                rx0Var.f82451b.f77667a = new re0(iB, iB2, iB3, iB4);
                            }
                            if (rx0Var != null) {
                                g73 g73Var2 = rx0Var.f82451b;
                                long j11 = g73Var2.f77682p;
                                boolean z11 = g73Var2.f77683q;
                                rx0Var.b();
                                rx0Var.f82461l = true;
                                wj wjVarC2 = vjVar3.c(1952867444);
                                if (wjVarC2 != null && (i17 & 2) == 0) {
                                    jb2 jb2Var2 = wjVarC2.f84218b;
                                    jb2Var2.e(8);
                                    g73Var2.f77682p = ((jb2Var2.b() >> 24) & 255) == 1 ? jb2Var2.q() : jb2Var2.n();
                                    g73Var2.f77683q = true;
                                } else {
                                    g73Var2.f77682p = j11;
                                    g73Var2.f77683q = z11;
                                }
                                ArrayList arrayList = vjVar3.f83938c;
                                int size2 = arrayList.size();
                                int i19 = 0;
                                int i20 = 0;
                                int i21 = 0;
                                while (true) {
                                    i13 = 1953658222;
                                    if (i21 >= size2) {
                                        break;
                                    }
                                    wj wjVar = (wj) arrayList.get(i21);
                                    int i22 = size;
                                    if (wjVar.f84603a == 1953658222) {
                                        jb2 jb2Var3 = wjVar.f84218b;
                                        jb2Var3.e(12);
                                        int iP = jb2Var3.p();
                                        if (iP > 0) {
                                            i19 += iP;
                                            i20++;
                                        }
                                    }
                                    i21++;
                                    size = i22;
                                }
                                i12 = size;
                                rx0Var.f82457h = 0;
                                rx0Var.f82456g = 0;
                                rx0Var.f82455f = 0;
                                g73 g73Var3 = rx0Var.f82451b;
                                g73Var3.f77670d = i20;
                                g73Var3.f77671e = i19;
                                if (g73Var3.f77673g.length < i20) {
                                    g73Var3.f77672f = new long[i20];
                                    g73Var3.f77673g = new int[i20];
                                }
                                if (g73Var3.f77674h.length < i19) {
                                    int i23 = (i19 * 125) / 100;
                                    g73Var3.f77674h = new int[i23];
                                    g73Var3.f77675i = new long[i23];
                                    g73Var3.f77676j = new boolean[i23];
                                    g73Var3.f77678l = new boolean[i23];
                                }
                                int i24 = 0;
                                int i25 = 0;
                                int i26 = 0;
                                while (true) {
                                    long j12 = 0;
                                    if (i24 < size2) {
                                        wj wjVar2 = (wj) arrayList.get(i24);
                                        if (wjVar2.f84603a == i13) {
                                            int i27 = i25 + 1;
                                            jb2 jb2Var4 = wjVar2.f84218b;
                                            jb2Var4.e(8);
                                            int iB7 = jb2Var4.b();
                                            e73 e73Var = rx0Var.f82453d.f80583a;
                                            g73 g73Var4 = rx0Var.f82451b;
                                            re0 re0Var2 = g73Var4.f77667a;
                                            int i28 = ib3.f78556a;
                                            g73Var4.f77673g[i25] = jb2Var4.p();
                                            long[] jArr = g73Var4.f77672f;
                                            long j13 = g73Var4.f77668b;
                                            jArr[i25] = j13;
                                            if ((iB7 & 1) != 0) {
                                                jArr[i25] = j13 + ((long) jb2Var4.b());
                                            }
                                            boolean z12 = (iB7 & 4) != 0;
                                            int iB8 = re0Var2.f82224d;
                                            if (z12) {
                                                iB8 = jb2Var4.b();
                                            }
                                            boolean z13 = (iB7 & 256) != 0;
                                            boolean z14 = (iB7 & 512) != 0;
                                            boolean z15 = (iB7 & 1024) != 0;
                                            boolean z16 = (iB7 & 2048) != 0;
                                            long[] jArr2 = e73Var.f76966h;
                                            int i29 = iB8;
                                            if (jArr2 != null) {
                                                vjVar = vjVar3;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    j12 = e73Var.f76967i[0];
                                                }
                                            } else {
                                                vjVar = vjVar3;
                                            }
                                            int[] iArr = g73Var4.f77674h;
                                            long[] jArr3 = g73Var4.f77675i;
                                            boolean[] zArr = g73Var4.f77676j;
                                            boolean z17 = e73Var.f76960b == 2 && (i17 & 1) != 0;
                                            int i30 = g73Var4.f77673g[i25] + i26;
                                            long j14 = e73Var.f76961c;
                                            long j15 = g73Var4.f77682p;
                                            int i31 = i26;
                                            while (i31 < i30) {
                                                int iB9 = z13 ? jb2Var4.b() : re0Var2.f82222b;
                                                if (iB9 >= 0) {
                                                    int iB10 = z14 ? jb2Var4.b() : re0Var2.f82223c;
                                                    if (iB10 >= 0) {
                                                        if (z15) {
                                                            iB5 = jb2Var4.b();
                                                        } else {
                                                            iB5 = (i31 == 0 && z12) ? i29 : re0Var2.f82224d;
                                                        }
                                                        long jA = ib3.a((((long) (z16 ? jb2Var4.b() : 0)) + j15) - j12, 1000000L, j14);
                                                        jArr3[i31] = jA;
                                                        if (!g73Var4.f77683q) {
                                                            jArr3[i31] = jA + rx0Var.f82453d.f80590h;
                                                        }
                                                        iArr[i31] = iB10;
                                                        zArr[i31] = ((iB5 >> 16) & 1) == 0 && (!z17 || i31 == 0);
                                                        j15 += (long) iB9;
                                                        i31++;
                                                        j14 = j14;
                                                        z13 = z13;
                                                        i30 = i30;
                                                        z14 = z14;
                                                        z12 = z12;
                                                        jb2Var4 = jb2Var4;
                                                        re0Var2 = re0Var2;
                                                    } else {
                                                        throw new ob2(mg2.a("Unexpected negative value: ", iB10), null, true, 1);
                                                    }
                                                } else {
                                                    throw new ob2(mg2.a("Unexpected negative value: ", iB9), null, true, 1);
                                                }
                                            }
                                            g73Var4.f77682p = j15;
                                            i25 = i27;
                                            i26 = i30;
                                        } else {
                                            bArr4 = bArr4;
                                            i24 = i24;
                                            i18 = i18;
                                            vjVar = vjVar3;
                                        }
                                        i24++;
                                        arrayList = arrayList;
                                        size2 = size2;
                                        vjVar2 = vjVar2;
                                        g73Var2 = g73Var2;
                                        i18 = i18;
                                        bArr4 = bArr4;
                                        vjVar3 = vjVar;
                                        i17 = i17;
                                        i13 = 1953658222;
                                    } else {
                                        vjVar2 = vjVar2;
                                        g73 g73Var5 = g73Var2;
                                        i10 = i17;
                                        byte[] bArr5 = bArr4;
                                        i11 = i18;
                                        vj vjVar4 = vjVar3;
                                        e73 e73Var2 = rx0Var.f82453d.f80583a;
                                        re0 re0Var3 = g73Var5.f77667a;
                                        re0Var3.getClass();
                                        int i32 = re0Var3.f82221a;
                                        f73[] f73VarArr = e73Var2.f76969k;
                                        f73 f73Var = f73VarArr == null ? null : f73VarArr[i32];
                                        wj wjVarC3 = vjVar4.c(1935763834);
                                        if (wjVarC3 != null) {
                                            f73Var.getClass();
                                            jb2 jb2Var5 = wjVarC3.f84218b;
                                            int i33 = f73Var.f77323d;
                                            jb2Var5.e(8);
                                            if ((jb2Var5.b() & 1) == 1) {
                                                jb2Var5.e(jb2Var5.f78967b + 8);
                                            }
                                            int iM = jb2Var5.m();
                                            int iP2 = jb2Var5.p();
                                            if (iP2 <= g73Var5.f77671e) {
                                                if (iM == 0) {
                                                    boolean[] zArr2 = g73Var5.f77678l;
                                                    i15 = 0;
                                                    for (int i34 = 0; i34 < iP2; i34++) {
                                                        int iM2 = jb2Var5.m();
                                                        i15 += iM2;
                                                        zArr2[i34] = iM2 > i33;
                                                    }
                                                    z10 = false;
                                                } else {
                                                    boolean z18 = iM > i33;
                                                    i15 = iM * iP2;
                                                    z10 = false;
                                                    Arrays.fill(g73Var5.f77678l, 0, iP2, z18);
                                                }
                                                Arrays.fill(g73Var5.f77678l, iP2, g73Var5.f77671e, z10);
                                                if (i15 > 0) {
                                                    g73Var5.f77680n.c(i15);
                                                    i14 = 1;
                                                    g73Var5.f77677k = true;
                                                    g73Var5.f77681o = true;
                                                } else {
                                                    i14 = 1;
                                                }
                                            } else {
                                                throw new ob2("Saiz sample count " + iP2 + " is greater than fragment sample count" + g73Var5.f77671e, null, true, 1);
                                            }
                                        } else {
                                            i14 = 1;
                                        }
                                        wj wjVarC4 = vjVar4.c(1935763823);
                                        if (wjVarC4 != null) {
                                            jb2 jb2Var6 = wjVarC4.f84218b;
                                            jb2Var6.e(8);
                                            int iB11 = jb2Var6.b();
                                            if ((iB11 & 1) == i14) {
                                                jb2Var6.e(jb2Var6.f78967b + 8);
                                            }
                                            int iP3 = jb2Var6.p();
                                            if (iP3 != i14) {
                                                throw new ob2(mg2.a("Unexpected saio entry count: ", iP3), null, true, 1);
                                            }
                                            g73Var5.f77669c += ((iB11 >> 24) & 255) == 0 ? jb2Var6.n() : jb2Var6.q();
                                        }
                                        wj wjVarC5 = vjVar4.c(1936027235);
                                        if (wjVarC5 != null) {
                                            a(wjVarC5.f84218b, 0, g73Var5);
                                        }
                                        String str = f73Var != null ? f73Var.f77321b : null;
                                        jb2 jb2Var7 = null;
                                        jb2 jb2Var8 = null;
                                        for (int i35 = 0; i35 < vjVar4.f83938c.size(); i35++) {
                                            wj wjVar3 = (wj) vjVar4.f83938c.get(i35);
                                            jb2 jb2Var9 = wjVar3.f84218b;
                                            int i36 = wjVar3.f84603a;
                                            if (i36 == 1935828848) {
                                                jb2Var9.e(12);
                                                if (jb2Var9.b() == 1936025959) {
                                                    jb2Var7 = jb2Var9;
                                                }
                                            } else if (i36 == 1936158820) {
                                                jb2Var9.e(12);
                                                if (jb2Var9.b() == 1936025959) {
                                                    jb2Var8 = jb2Var9;
                                                }
                                            }
                                        }
                                        if (jb2Var7 != null && jb2Var8 != null) {
                                            jb2Var7.e(8);
                                            int iB12 = (jb2Var7.b() >> 24) & 255;
                                            jb2Var7.e(jb2Var7.f78967b + 4);
                                            if (iB12 == 1) {
                                                jb2Var7.e(jb2Var7.f78967b + 4);
                                            }
                                            if (jb2Var7.b() == 1) {
                                                jb2Var8.e(8);
                                                int iB13 = (jb2Var8.b() >> 24) & 255;
                                                jb2Var8.e(jb2Var8.f78967b + 4);
                                                if (iB13 == 1) {
                                                    if (jb2Var8.n() == 0) {
                                                        throw ob2.b("Variable length description in sgpd found (unsupported)");
                                                    }
                                                } else if (iB13 >= 2) {
                                                    jb2Var8.e(jb2Var8.f78967b + 4);
                                                }
                                                if (jb2Var8.n() == 1) {
                                                    jb2Var8.e(jb2Var8.f78967b + 1);
                                                    int iM3 = jb2Var8.m();
                                                    int i37 = (iM3 & 240) >> 4;
                                                    int i38 = iM3 & 15;
                                                    boolean z19 = jb2Var8.m() == 1;
                                                    if (z19) {
                                                        int iM4 = jb2Var8.m();
                                                        byte[] bArr6 = new byte[16];
                                                        jb2Var8.a(bArr6, 0, 16);
                                                        if (iM4 == 0) {
                                                            int iM5 = jb2Var8.m();
                                                            byte[] bArr7 = new byte[iM5];
                                                            jb2Var8.a(bArr7, 0, iM5);
                                                            bArr3 = bArr7;
                                                        } else {
                                                            bArr3 = null;
                                                        }
                                                        g73Var5.f77677k = true;
                                                        g73Var5.f77679m = new f73(z19, str, iM4, bArr6, i37, i38, bArr3);
                                                    }
                                                } else {
                                                    throw ob2.b("Entry count in sgpd != 1 (unsupported).");
                                                }
                                            } else {
                                                throw ob2.b("Entry count in sbgp != 1 (unsupported).");
                                            }
                                        }
                                        int size3 = vjVar4.f83938c.size();
                                        int i39 = 0;
                                        while (i39 < size3) {
                                            wj wjVar4 = (wj) vjVar4.f83938c.get(i39);
                                            if (wjVar4.f84603a == 1970628964) {
                                                jb2 jb2Var10 = wjVar4.f84218b;
                                                jb2Var10.e(8);
                                                bArr2 = bArr5;
                                                jb2Var10.a(bArr2, 0, 16);
                                                if (Arrays.equals(bArr2, G)) {
                                                    a(jb2Var10, 16, g73Var5);
                                                }
                                            } else {
                                                bArr2 = bArr5;
                                            }
                                            i39++;
                                            bArr5 = bArr2;
                                        }
                                        bArr = bArr5;
                                        break;
                                    }
                                }
                            }
                            i18 = i11 + 1;
                            bArr4 = bArr;
                            sparseArray = sparseArray;
                            size = i12;
                            vjVar2 = vjVar2;
                            i17 = i10;
                        } else {
                            sparseArray = sparseArray;
                        }
                        i10 = i17;
                        bArr = bArr4;
                        i12 = size;
                        i11 = i18;
                        i18 = i11 + 1;
                        bArr4 = bArr;
                        sparseArray = sparseArray;
                        size = i12;
                        vjVar2 = vjVar2;
                        i17 = i10;
                    }
                    kk0 kk0VarA = a(vjVar2.f83938c);
                    sx0Var = this;
                    if (kk0VarA != null) {
                        int size4 = sx0Var.f82801c.size();
                        for (int i40 = 0; i40 < size4; i40++) {
                            rx0 rx0Var2 = (rx0) sx0Var.f82801c.valueAt(i40);
                            e73 e73Var3 = rx0Var2.f82453d.f80583a;
                            re0 re0Var4 = rx0Var2.f82451b.f77667a;
                            int i41 = ib3.f78556a;
                            int i42 = re0Var4.f82221a;
                            f73[] f73VarArr2 = e73Var3.f76969k;
                            f73 f73Var2 = f73VarArr2 == null ? null : f73VarArr2[i42];
                            String str2 = f73Var2 != null ? f73Var2.f77321b : null;
                            kk0 kk0Var = ib3.a(kk0VarA.f79437d, str2) ? kk0VarA : new kk0(str2, false, kk0VarA.f79435b);
                            mx0 mx0Var = rx0Var2.f82453d.f80583a.f76964f;
                            mx0Var.getClass();
                            lx0 lx0Var = new lx0(mx0Var);
                            lx0Var.f79970n = kk0Var;
                            rx0Var2.f82450a.a(new mx0(lx0Var));
                        }
                    }
                    if (sx0Var.f82819u != -9223372036854775807L) {
                        int size5 = sx0Var.f82801c.size();
                        for (int i43 = 0; i43 < size5; i43++) {
                            rx0 rx0Var3 = (rx0) sx0Var.f82801c.valueAt(i43);
                            long j16 = sx0Var.f82819u;
                            int i44 = rx0Var3.f82455f;
                            while (true) {
                                g73 g73Var6 = rx0Var3.f82451b;
                                if (i44 >= g73Var6.f77671e || g73Var6.f77675i[i44] >= j16) {
                                    break;
                                }
                                if (g73Var6.f77676j[i44]) {
                                    rx0Var3.f82458i = i44;
                                }
                                i44++;
                            }
                        }
                        sx0Var.f82819u = -9223372036854775807L;
                    }
                } else {
                    sx0Var = sx0Var2;
                    if (!sx0Var.f82809k.isEmpty()) {
                        ((vj) sx0Var.f82809k.peek()).f83939d.add(vjVar2);
                    }
                }
                sx0Var2 = sx0Var;
            }
        }
        sx0 sx0Var3 = sx0Var2;
        sx0Var3.f82812n = 0;
        sx0Var3.f82815q = 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0207  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        Exception exc;
        ?? r10;
        rx0 rx0Var;
        long j10;
        int i10;
        int i11;
        int iA;
        boolean z10;
        int i12;
        long j11;
        long j12;
        String str;
        long jA;
        long jN;
        String str2;
        long j13;
        long j14;
        long jQ;
        long jQ2;
        while (true) {
            int i13 = this.f82812n;
            exc = null;
            r10 = 0;
            if (i13 == 0) {
                if (this.f82815q == 0) {
                    if (!((ld0) nq0Var).a(this.f82808j.f78966a, 0, 8, true)) {
                        return -1;
                    }
                    this.f82815q = 8;
                    this.f82808j.e(0);
                    this.f82814p = this.f82808j.n();
                    this.f82813o = this.f82808j.b();
                }
                long j15 = this.f82814p;
                if (j15 == 1) {
                    ((ld0) nq0Var).a(this.f82808j.f78966a, 8, 8, false);
                    this.f82815q += 8;
                    this.f82814p = this.f82808j.q();
                } else if (j15 == 0) {
                    ld0 ld0Var = (ld0) nq0Var;
                    long j16 = ld0Var.f79756c;
                    if (j16 == -1 && !this.f82809k.isEmpty()) {
                        j16 = ((vj) this.f82809k.peek()).f83937b;
                    }
                    if (j16 != -1) {
                        this.f82814p = (j16 - ld0Var.f79757d) + ((long) this.f82815q);
                    }
                }
                long j17 = this.f82814p;
                long j18 = this.f82815q;
                if (j17 >= j18) {
                    ld0 ld0Var2 = (ld0) nq0Var;
                    long j19 = ld0Var2.f79757d - j18;
                    int i14 = this.f82813o;
                    if ((i14 == 1836019558 || i14 == 1835295092) && !this.F) {
                        this.C.a(new uw2(this.f82820v, j19));
                        this.F = true;
                    }
                    if (this.f82813o == 1836019558) {
                        int size = this.f82801c.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            g73 g73Var = ((rx0) this.f82801c.valueAt(i15)).f82451b;
                            g73Var.getClass();
                            g73Var.f77669c = j19;
                            g73Var.f77668b = j19;
                        }
                    }
                    int i16 = this.f82813o;
                    if (i16 == 1835295092) {
                        this.f82822x = null;
                        this.f82817s = j19 + this.f82814p;
                        this.f82812n = 2;
                    } else if (i16 == 1836019574 || i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086 || i16 == 1937007212 || i16 == 1836019558 || i16 == 1953653094 || i16 == 1836475768 || i16 == 1701082227) {
                        long j20 = (ld0Var2.f79757d + this.f82814p) - 8;
                        this.f82809k.push(new vj(i16, j20));
                        if (this.f82814p == this.f82815q) {
                            a(j20);
                        } else {
                            this.f82812n = 0;
                            this.f82815q = 0;
                        }
                    } else if (i16 == 1751411826 || i16 == 1835296868 || i16 == 1836476516 || i16 == 1936286840 || i16 == 1937011556 || i16 == 1937011827 || i16 == 1668576371 || i16 == 1937011555 || i16 == 1937011578 || i16 == 1937013298 || i16 == 1937007471 || i16 == 1668232756 || i16 == 1937011571 || i16 == 1952867444 || i16 == 1952868452 || i16 == 1953196132 || i16 == 1953654136 || i16 == 1953658222 || i16 == 1886614376 || i16 == 1935763834 || i16 == 1935763823 || i16 == 1936027235 || i16 == 1970628964 || i16 == 1935828848 || i16 == 1936158820 || i16 == 1701606260 || i16 == 1835362404 || i16 == 1701671783) {
                        if (this.f82815q == 8) {
                            long j21 = this.f82814p;
                            if (j21 <= 2147483647L) {
                                jb2 jb2Var = new jb2((int) j21);
                                System.arraycopy(this.f82808j.f78966a, 0, jb2Var.f78966a, 0, 8);
                                this.f82816r = jb2Var;
                                this.f82812n = 1;
                            } else {
                                throw ob2.b("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw ob2.b("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else if (this.f82814p <= 2147483647L) {
                        this.f82816r = null;
                        this.f82812n = 1;
                    } else {
                        throw ob2.b("Skipping atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw ob2.b("Atom size less than header length (unsupported).");
                }
            } else if (i13 != 1) {
                long j22 = Long.MAX_VALUE;
                if (i13 != 2) {
                    rx0Var = this.f82822x;
                    if (rx0Var != null) {
                        break;
                    }
                    SparseArray sparseArray = this.f82801c;
                    int size2 = sparseArray.size();
                    long j23 = Long.MAX_VALUE;
                    rx0 rx0Var2 = null;
                    for (int i17 = 0; i17 < size2; i17++) {
                        rx0 rx0Var3 = (rx0) sparseArray.valueAt(i17);
                        boolean z11 = rx0Var3.f82461l;
                        if ((z11 || rx0Var3.f82455f != rx0Var3.f82453d.f80584b) && (!z11 || rx0Var3.f82457h != rx0Var3.f82451b.f77670d)) {
                            if (!z11) {
                                j12 = rx0Var3.f82453d.f80585c[rx0Var3.f82455f];
                            } else {
                                j12 = rx0Var3.f82451b.f77672f[rx0Var3.f82457h];
                            }
                            if (j12 < j23) {
                                rx0Var2 = rx0Var3;
                                j23 = j12;
                            }
                        }
                    }
                    if (rx0Var2 == null) {
                        ld0 ld0Var3 = (ld0) nq0Var;
                        int i18 = (int) (this.f82817s - ld0Var3.f79757d);
                        if (i18 >= 0) {
                            ld0Var3.a(i18);
                            this.f82812n = 0;
                            this.f82815q = 0;
                        } else {
                            throw new ob2("Offset to end of mdat was negative.", null, true, 1);
                        }
                    } else {
                        if (!rx0Var2.f82461l) {
                            j11 = rx0Var2.f82453d.f80585c[rx0Var2.f82455f];
                        } else {
                            j11 = rx0Var2.f82451b.f77672f[rx0Var2.f82457h];
                        }
                        ld0 ld0Var4 = (ld0) nq0Var;
                        int i19 = (int) (j11 - ld0Var4.f79757d);
                        if (i19 < 0) {
                            ih1.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i19 = 0;
                        }
                        ld0Var4.a(i19);
                        this.f82822x = rx0Var2;
                        rx0Var = rx0Var2;
                        break;
                    }
                } else {
                    int size3 = this.f82801c.size();
                    rx0 rx0Var4 = null;
                    for (int i20 = 0; i20 < size3; i20++) {
                        g73 g73Var2 = ((rx0) this.f82801c.valueAt(i20)).f82451b;
                        if (g73Var2.f77681o) {
                            long j24 = g73Var2.f77669c;
                            if (j24 < j22) {
                                rx0Var4 = (rx0) this.f82801c.valueAt(i20);
                                j22 = j24;
                            }
                        }
                    }
                    if (rx0Var4 == null) {
                        this.f82812n = 3;
                    } else {
                        ld0 ld0Var5 = (ld0) nq0Var;
                        int i21 = (int) (j22 - ld0Var5.f79757d);
                        if (i21 >= 0) {
                            ld0Var5.a(i21);
                            g73 g73Var3 = rx0Var4.f82451b;
                            jb2 jb2Var2 = g73Var3.f77680n;
                            ld0Var5.a(jb2Var2.f78966a, 0, jb2Var2.f78968c, false);
                            g73Var3.f77680n.e(0);
                            g73Var3.f77681o = false;
                        } else {
                            throw new ob2("Offset to encryption data was negative.", null, true, 1);
                        }
                    }
                }
            } else {
                int i22 = ((int) this.f82814p) - this.f82815q;
                jb2 jb2Var3 = this.f82816r;
                if (jb2Var3 != null) {
                    ld0 ld0Var6 = (ld0) nq0Var;
                    ld0Var6.a(jb2Var3.f78966a, 8, i22, false);
                    int i23 = this.f82813o;
                    wj wjVar = new wj(i23, jb2Var3);
                    long j25 = ld0Var6.f79757d;
                    if (!this.f82809k.isEmpty()) {
                        ((vj) this.f82809k.peek()).f83938c.add(wjVar);
                    } else if (i23 == 1936286840) {
                        jb2Var3.e(8);
                        int iB = (jb2Var3.b() >> 24) & 255;
                        jb2Var3.e(jb2Var3.f78967b + 4);
                        long jN2 = jb2Var3.n();
                        if (iB == 0) {
                            jQ = jb2Var3.n();
                            jQ2 = jb2Var3.n();
                        } else {
                            jQ = jb2Var3.q();
                            jQ2 = jb2Var3.q();
                        }
                        long j26 = jQ2 + j25;
                        long jA2 = ib3.a(jQ, 1000000L, jN2);
                        jb2Var3.e(jb2Var3.f78967b + 2);
                        int iR = jb2Var3.r();
                        int[] iArr = new int[iR];
                        long[] jArr = new long[iR];
                        long[] jArr2 = new long[iR];
                        long[] jArr3 = new long[iR];
                        long j27 = j26;
                        long jA3 = jA2;
                        int i24 = 0;
                        while (i24 < iR) {
                            int iB2 = jb2Var3.b();
                            if ((iB2 & Integer.MIN_VALUE) == 0) {
                                long jN3 = jb2Var3.n();
                                iArr[i24] = iB2 & Integer.MAX_VALUE;
                                jArr[i24] = j27;
                                jArr3[i24] = jA3;
                                jQ += jN3;
                                jA3 = ib3.a(jQ, 1000000L, jN2);
                                jArr2[i24] = jA3 - jArr3[i24];
                                jb2Var3.e(jb2Var3.f78967b + 4);
                                j27 += (long) iArr[i24];
                                i24++;
                                iR = iR;
                                jN2 = jN2;
                            } else {
                                throw new ob2("Unhandled indirect reference", null, true, 1);
                            }
                        }
                        Pair pairCreate = Pair.create(Long.valueOf(jA2), new hu(iArr, jArr, jArr2, jArr3));
                        this.f82821w = ((Long) pairCreate.first).longValue();
                        this.C.a((vw2) pairCreate.second);
                        this.F = true;
                    } else if (i23 == 1701671783 && this.D.length != 0) {
                        jb2Var3.e(8);
                        int iB3 = (jb2Var3.b() >> 24) & 255;
                        if (iB3 == 0) {
                            String strJ = jb2Var3.j();
                            strJ.getClass();
                            String strJ2 = jb2Var3.j();
                            strJ2.getClass();
                            long jN4 = jb2Var3.n();
                            long jA4 = ib3.a(jb2Var3.n(), 1000000L, jN4);
                            long j28 = this.f82821w;
                            long j29 = j28 != -9223372036854775807L ? j28 + jA4 : -9223372036854775807L;
                            str = strJ;
                            jA = ib3.a(jb2Var3.n(), 1000L, jN4);
                            jN = jb2Var3.n();
                            str2 = strJ2;
                            j13 = jA4;
                            j14 = j29;
                        } else if (iB3 != 1) {
                            kf1.a("Skipping unsupported emsg version: ", iB3, "FragmentedMp4Extractor");
                        } else {
                            long jN5 = jb2Var3.n();
                            long jA5 = ib3.a(jb2Var3.q(), 1000000L, jN5);
                            long jA6 = ib3.a(jb2Var3.n(), 1000L, jN5);
                            long jN6 = jb2Var3.n();
                            String strJ3 = jb2Var3.j();
                            strJ3.getClass();
                            String strJ4 = jb2Var3.j();
                            strJ4.getClass();
                            str = strJ3;
                            jA = jA6;
                            j14 = jA5;
                            jN = jN6;
                            str2 = strJ4;
                            j13 = -9223372036854775807L;
                        }
                        int i25 = jb2Var3.f78968c - jb2Var3.f78967b;
                        byte[] bArr = new byte[i25];
                        jb2Var3.a(bArr, 0, i25);
                        jb2 jb2Var4 = new jb2(this.f82807i.a(new wm0(str, str2, jA, jN, bArr)));
                        int i26 = jb2Var4.f78968c - jb2Var4.f78967b;
                        for (m73 m73Var : this.D) {
                            jb2Var4.e(0);
                            m73Var.a(i26, jb2Var4);
                        }
                        if (j14 == -9223372036854775807L) {
                            this.f82810l.addLast(new qx0(i26, j13, true));
                            this.f82818t += i26;
                        } else if (!this.f82810l.isEmpty()) {
                            this.f82810l.addLast(new qx0(i26, j14, false));
                            this.f82818t += i26;
                        } else {
                            for (m73 m73Var2 : this.D) {
                                m73Var2.a(j14, 1, i26, 0, null);
                            }
                        }
                    }
                } else {
                    ((ld0) nq0Var).a(i22);
                }
                a(((ld0) nq0Var).f79757d);
            }
        }
        char c10 = 6;
        if (this.f82812n == 3) {
            if (!rx0Var.f82461l) {
                i12 = rx0Var.f82453d.f80586d[rx0Var.f82455f];
            } else {
                i12 = rx0Var.f82451b.f77674h[rx0Var.f82455f];
            }
            this.f82823y = i12;
            if (rx0Var.f82455f < rx0Var.f82458i) {
                ((ld0) nq0Var).a(i12);
                f73 f73VarA = rx0Var.a();
                if (f73VarA != null) {
                    jb2 jb2Var5 = rx0Var.f82451b.f77680n;
                    int i27 = f73VarA.f77323d;
                    if (i27 != 0) {
                        jb2Var5.e(jb2Var5.f78967b + i27);
                    }
                    g73 g73Var4 = rx0Var.f82451b;
                    int i28 = rx0Var.f82455f;
                    if (g73Var4.f77677k && g73Var4.f77678l[i28]) {
                        jb2Var5.e(jb2Var5.f78967b + (jb2Var5.r() * 6));
                    }
                }
                rx0Var.f82455f++;
                if (rx0Var.f82461l) {
                    int i29 = rx0Var.f82456g + 1;
                    rx0Var.f82456g = i29;
                    int[] iArr2 = rx0Var.f82451b.f77673g;
                    int i30 = rx0Var.f82457h;
                    if (i29 == iArr2[i30]) {
                        rx0Var.f82457h = i30 + 1;
                        rx0Var.f82456g = 0;
                        this.f82822x = null;
                    }
                } else {
                    this.f82822x = null;
                }
                this.f82812n = 3;
                return 0;
            }
            if (rx0Var.f82453d.f80583a.f76965g == 1) {
                this.f82823y = i12 - 8;
                ((ld0) nq0Var).a(8);
            }
            if ("audio/ac4".equals(rx0Var.f82453d.f80583a.f76964f.f80429m)) {
                this.f82824z = rx0Var.a(this.f82823y, 7);
                l0.a(this.f82823y, this.f82806h);
                rx0Var.f82450a.a(7, this.f82806h);
                this.f82824z += 7;
            } else {
                this.f82824z = rx0Var.a(this.f82823y, 0);
            }
            this.f82823y += this.f82824z;
            this.f82812n = 4;
            this.A = 0;
        }
        n73 n73Var = rx0Var.f82453d;
        e73 e73Var = n73Var.f80583a;
        m73 m73Var3 = rx0Var.f82450a;
        if (!rx0Var.f82461l) {
            j10 = n73Var.f80588f[rx0Var.f82455f];
        } else {
            j10 = rx0Var.f82451b.f77675i[rx0Var.f82455f];
        }
        int i31 = e73Var.f76968j;
        if (i31 == 0) {
            while (true) {
                int i32 = this.f82824z;
                int i33 = this.f82823y;
                if (i32 >= i33) {
                    break;
                }
                this.f82824z += m73Var3.a(nq0Var, i33 - i32, false);
            }
        } else {
            byte[] bArr2 = this.f82803e.f78966a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i34 = i31 + 1;
            int i35 = 4 - i31;
            while (this.f82824z < this.f82823y) {
                int i36 = this.A;
                if (i36 == 0) {
                    ((ld0) nq0Var).a(bArr2, i35, i34, r10);
                    this.f82803e.e(r10);
                    int iB4 = this.f82803e.b();
                    if (iB4 >= 1) {
                        this.A = iB4 - 1;
                        this.f82802d.e(r10);
                        m73Var3.a(4, this.f82802d);
                        m73Var3.a(1, this.f82803e);
                        if (this.E.length > 0) {
                            String str3 = e73Var.f76964f.f80429m;
                            byte b10 = bArr2[4];
                            byte[] bArr3 = dy1.f76843a;
                            if (("video/avc".equals(str3) && (b10 & 31) == c10) || ("video/hevc".equals(str3) && ((b10 & 126) >> 1) == 39)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        this.B = z10;
                        this.f82824z += 5;
                        this.f82823y += i35;
                    } else {
                        throw new ob2("Invalid NAL length", exc, true, 1);
                    }
                } else {
                    if (this.B) {
                        this.f82804f.c(i36);
                        ((ld0) nq0Var).a(this.f82804f.f78966a, 0, this.A, false);
                        m73Var3.a(this.A, this.f82804f);
                        iA = this.A;
                        jb2 jb2Var6 = this.f82804f;
                        int iA2 = dy1.a(jb2Var6.f78968c, jb2Var6.f78966a);
                        this.f82804f.e("video/hevc".equals(e73Var.f76964f.f80429m) ? 1 : 0);
                        this.f82804f.d(iA2);
                        rt.a(j10, this.f82804f, this.E);
                    } else {
                        iA = m73Var3.a(nq0Var, i36, false);
                    }
                    this.f82824z += iA;
                    this.A -= iA;
                    c10 = 6;
                    exc = null;
                }
                r10 = 0;
            }
        }
        if (!rx0Var.f82461l) {
            i10 = rx0Var.f82453d.f80589g[rx0Var.f82455f];
        } else {
            i10 = rx0Var.f82451b.f77676j[rx0Var.f82455f] ? 1 : 0;
        }
        if (rx0Var.a() != null) {
            i10 |= 1073741824;
        }
        int i37 = i10;
        f73 f73VarA2 = rx0Var.a();
        m73Var3.a(j10, i37, this.f82823y, 0, f73VarA2 != null ? f73VarA2.f77322c : null);
        while (!this.f82810l.isEmpty()) {
            qx0 qx0Var = (qx0) this.f82810l.removeFirst();
            this.f82818t -= qx0Var.f82021c;
            long j30 = qx0Var.f82019a;
            if (qx0Var.f82020b) {
                j30 += j10;
            }
            for (m73 m73Var4 : this.D) {
                m73Var4.a(j30, 1, qx0Var.f82021c, this.f82818t, null);
            }
        }
        rx0Var.f82455f++;
        if (rx0Var.f82461l) {
            int i38 = rx0Var.f82456g + 1;
            rx0Var.f82456g = i38;
            int[] iArr3 = rx0Var.f82451b.f77673g;
            int i39 = rx0Var.f82457h;
            if (i38 == iArr3[i39]) {
                rx0Var.f82457h = i39 + 1;
                i11 = 0;
                rx0Var.f82456g = 0;
            } else {
                i11 = 0;
            }
            this.f82812n = 3;
            return i11;
        }
        i11 = 0;
        this.f82822x = null;
        this.f82812n = 3;
        return i11;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        return s13.a(nq0Var, true, false);
    }

    public static mq0[] a() {
        return new mq0[]{new sx0(0)};
    }
}
