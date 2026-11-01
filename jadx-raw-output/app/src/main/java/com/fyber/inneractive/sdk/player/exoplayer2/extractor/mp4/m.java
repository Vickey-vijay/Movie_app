package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int A = z.a("seig");
    public static final byte[] B = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f16902f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16909m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f16911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16913q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f16916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f16921y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16922z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16903g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16898b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f17837a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16899c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16900d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16901e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f16904h = new byte[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Stack f16905i = new Stack();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedList f16906j = new LinkedList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f16897a = new SparseArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f16914r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f16915s = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16907k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16910n = 0;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f16921y = jVar;
    }

    public m(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f16902f = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int size = this.f16897a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.f16897a.valueAt(i10)).a();
        }
        this.f16906j.clear();
        this.f16913q = 0;
        this.f16905i.clear();
        this.f16907k = 0;
        this.f16910n = 0;
    }

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
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        byte[] bArr;
        int i10;
        byte[] bArr2;
        int iA;
        int i11;
        long jN;
        long jN2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = bVar;
        while (true) {
            int i12 = this.f16907k;
            int i13 = 1;
            boolean z10 = false;
            if (i12 == 0) {
                if (this.f16910n == 0) {
                    if (!bVar2.b(this.f16903g.f17845a, 0, 8, true)) {
                        return -1;
                    }
                    this.f16910n = 8;
                    this.f16903g.e(0);
                    this.f16909m = this.f16903g.k();
                    this.f16908l = this.f16903g.b();
                }
                if (this.f16909m == 1) {
                    bVar2.b(this.f16903g.f17845a, 8, 8, false);
                    this.f16910n += 8;
                    this.f16909m = this.f16903g.n();
                }
                long j10 = this.f16909m;
                long j11 = this.f16910n;
                if (j10 >= j11) {
                    long j12 = bVar2.f16452c - j11;
                    if (this.f16908l == c.L) {
                        int size = this.f16897a.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            u uVar = ((l) this.f16897a.valueAt(i14)).f16890a;
                            uVar.getClass();
                            uVar.f16985c = j12;
                            uVar.f16984b = j12;
                        }
                    }
                    int i15 = this.f16908l;
                    if (i15 == c.f16818i) {
                        this.f16916t = null;
                        this.f16912p = j12 + this.f16909m;
                        if (!this.f16922z) {
                            this.f16921y.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(this.f16914r));
                            this.f16922z = true;
                        }
                        this.f16907k = 2;
                    } else if (i15 != c.C && i15 != c.E && i15 != c.F && i15 != c.G && i15 != c.H && i15 != c.L && i15 != c.M && i15 != c.N && i15 != c.Q) {
                        if (i15 == c.T || i15 == c.S || i15 == c.D || i15 == c.B || i15 == c.U || i15 == c.f16848x || i15 == c.f16850y || i15 == c.P || i15 == c.f16852z || i15 == c.A || i15 == c.V || i15 == c.f16809d0 || i15 == c.f16811e0 || i15 == c.f16819i0 || i15 == c.f16817h0 || i15 == c.f16813f0 || i15 == c.f16815g0 || i15 == c.R || i15 == c.O || i15 == c.G0) {
                            if (this.f16910n == 8) {
                                long j13 = this.f16909m;
                                if (j13 <= 2147483647L) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j13);
                                    this.f16911o = nVar;
                                    System.arraycopy(this.f16903g.f17845a, 0, nVar.f17845a, 0, 8);
                                    this.f16907k = 1;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.f16909m <= 2147483647L) {
                            this.f16911o = null;
                            this.f16907k = 1;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        long j14 = (bVar2.f16452c + this.f16909m) - 8;
                        this.f16905i.add(new a(this.f16908l, j14));
                        if (this.f16909m == this.f16910n) {
                            a(j14);
                        } else {
                            this.f16907k = 0;
                            this.f16910n = 0;
                        }
                    }
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Atom size less than header length (unsupported).");
                }
            } else if (i12 != 1) {
                long j15 = Long.MAX_VALUE;
                if (i12 != 2) {
                    if (i12 == 3) {
                        if (this.f16916t == null) {
                            SparseArray sparseArray = this.f16897a;
                            int size2 = sparseArray.size();
                            l lVar = null;
                            for (int i16 = 0; i16 < size2; i16++) {
                                l lVar2 = (l) sparseArray.valueAt(i16);
                                int i17 = lVar2.f16896g;
                                u uVar2 = lVar2.f16890a;
                                if (i17 != uVar2.f16986d) {
                                    long j16 = uVar2.f16988f[i17];
                                    if (j16 < j15) {
                                        lVar = lVar2;
                                        j15 = j16;
                                    }
                                }
                            }
                            if (lVar == null) {
                                int i18 = (int) (this.f16912p - bVar2.f16452c);
                                if (i18 >= 0) {
                                    bVar2.a(i18);
                                    this.f16907k = 0;
                                    this.f16910n = 0;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Offset to end of mdat was negative.");
                                }
                            } else {
                                int i19 = (int) (lVar.f16890a.f16988f[lVar.f16896g] - bVar2.f16452c);
                                if (i19 < 0) {
                                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i19 = 0;
                                }
                                bVar2.a(i19);
                                this.f16916t = lVar;
                            }
                        }
                        l lVar3 = this.f16916t;
                        u uVar3 = lVar3.f16890a;
                        int[] iArr = uVar3.f16990h;
                        int i20 = lVar3.f16894e;
                        this.f16917u = iArr[i20];
                        if (uVar3.f16994l) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar3.f16998p;
                            int i21 = uVar3.f16983a.f16884a;
                            t tVar = uVar3.f16996n;
                            if (tVar == null) {
                                tVar = lVar3.f16892c.f16977h[i21];
                            }
                            int i22 = tVar.f16981a;
                            boolean z11 = uVar3.f16995m[i20];
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f16901e;
                            nVar3.f17845a[0] = (byte) ((z11 ? 128 : 0) | i22);
                            nVar3.e(0);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = lVar3.f16891b;
                            rVar.a(1, this.f16901e);
                            rVar.a(i22, nVar2);
                            if (z11) {
                                int iO = nVar2.o();
                                nVar2.e(nVar2.f17846b - 2);
                                int i23 = (iO * 6) + 2;
                                rVar.a(i23, nVar2);
                                i11 = i22 + 1 + i23;
                            } else {
                                i11 = i22 + 1;
                            }
                            this.f16918v = i11;
                            this.f16917u += i11;
                        } else {
                            this.f16918v = 0;
                        }
                        if (this.f16916t.f16892c.f16976g == 1) {
                            this.f16917u -= 8;
                            bVar2.a(8);
                        }
                        this.f16907k = 4;
                        this.f16919w = 0;
                    }
                    l lVar4 = this.f16916t;
                    u uVar4 = lVar4.f16890a;
                    s sVar = lVar4.f16892c;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = lVar4.f16891b;
                    int i24 = lVar4.f16894e;
                    int i25 = sVar.f16980k;
                    if (i25 == 0) {
                        while (true) {
                            int i26 = this.f16918v;
                            int i27 = this.f16917u;
                            if (i26 >= i27) {
                                break;
                            }
                            this.f16918v += rVar2.a(bVar2, i27 - i26, false);
                        }
                    } else {
                        byte[] bArr3 = this.f16899c.f17845a;
                        bArr3[0] = 0;
                        bArr3[1] = 0;
                        bArr3[2] = 0;
                        int i28 = i25 + 1;
                        int i29 = 4 - i25;
                        while (this.f16918v < this.f16917u) {
                            int i30 = this.f16919w;
                            if (i30 == 0) {
                                bVar2.b(bArr3, i29, i28, z10);
                                this.f16899c.e(z10 ? 1 : 0);
                                this.f16919w = this.f16899c.m() - i13;
                                this.f16898b.e(z10 ? 1 : 0);
                                rVar2.a(4, this.f16898b);
                                rVar2.a(i13, this.f16899c);
                                this.f16920x = z10;
                                this.f16918v += 5;
                                this.f16917u += i29;
                            } else {
                                if (this.f16920x) {
                                    this.f16900d.c(i30);
                                    bVar2.b(this.f16900d.f17845a, z10 ? 1 : 0, this.f16919w, z10);
                                    rVar2.a(this.f16919w, this.f16900d);
                                    iA = this.f16919w;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f16900d;
                                    int iA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(nVar4.f17847c, nVar4.f17845a);
                                    this.f16900d.e("video/hevc".equals(sVar.f16975f.f17504f) ? 1 : 0);
                                    this.f16900d.d(iA2);
                                    com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a((uVar4.f16992j[i24] + ((long) uVar4.f16991i[i24])) * 1000, this.f16900d, null);
                                } else {
                                    iA = rVar2.a(bVar2, i30, z10 ? 1 : 0);
                                }
                                this.f16918v += iA;
                                this.f16919w -= iA;
                                i13 = 1;
                                z10 = false;
                            }
                        }
                    }
                    long j17 = (uVar4.f16992j[i24] + ((long) uVar4.f16991i[i24])) * 1000;
                    boolean z12 = uVar4.f16994l;
                    int i31 = (z12 ? 1073741824 : 0) | (uVar4.f16993k[i24] ? 1 : 0);
                    int i32 = uVar4.f16983a.f16884a;
                    if (z12) {
                        t tVar2 = uVar4.f16996n;
                        if (tVar2 != null) {
                            bArr2 = tVar2.f16982b;
                        } else {
                            bArr2 = sVar.f16977h[i32].f16982b;
                        }
                        bArr = bArr2;
                    } else {
                        bArr = null;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = this.f16902f;
                    rVar2.a(vVar != null ? vVar.a(j17) : j17, i31, this.f16917u, 0, bArr);
                    if (this.f16906j.isEmpty()) {
                        l lVar5 = this.f16916t;
                        lVar5.f16894e++;
                        int i33 = lVar5.f16895f + 1;
                        lVar5.f16895f = i33;
                        int[] iArr2 = uVar4.f16989g;
                        int i34 = lVar5.f16896g;
                        if (i33 == iArr2[i34]) {
                            lVar5.f16896g = i34 + 1;
                            i10 = 0;
                            lVar5.f16895f = 0;
                            this.f16916t = null;
                        } else {
                            i10 = 0;
                        }
                        this.f16907k = 3;
                        return i10;
                    }
                    this.f16913q -= ((k) this.f16906j.removeFirst()).f16889b;
                    throw null;
                }
                int size3 = this.f16897a.size();
                l lVar6 = null;
                for (int i35 = 0; i35 < size3; i35++) {
                    u uVar5 = ((l) this.f16897a.valueAt(i35)).f16890a;
                    if (uVar5.f16999q) {
                        long j18 = uVar5.f16985c;
                        if (j18 < j15) {
                            lVar6 = (l) this.f16897a.valueAt(i35);
                            j15 = j18;
                        }
                    }
                }
                if (lVar6 == null) {
                    this.f16907k = 3;
                } else {
                    int i36 = (int) (j15 - bVar2.f16452c);
                    if (i36 >= 0) {
                        bVar2.a(i36);
                        u uVar6 = lVar6.f16890a;
                        bVar2.b(uVar6.f16998p.f17845a, 0, uVar6.f16997o, false);
                        uVar6.f16998p.e(0);
                        uVar6.f16999q = false;
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Offset to encryption data was negative.");
                    }
                }
            } else {
                int i37 = ((int) this.f16909m) - this.f16910n;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = this.f16911o;
                if (nVar5 != null) {
                    bVar2.b(nVar5.f17845a, 8, i37, false);
                    int i38 = this.f16908l;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = this.f16911o;
                    b bVar3 = new b(i38, nVar6);
                    long j19 = bVar2.f16452c;
                    if (!this.f16905i.isEmpty()) {
                        ((a) this.f16905i.peek()).Q0.add(bVar3);
                    } else {
                        if (i38 == c.B) {
                            nVar6.e(8);
                            int iB = (nVar6.b() >> 24) & 255;
                            nVar6.e(nVar6.f17846b + 4);
                            long jK = nVar6.k();
                            if (iB == 0) {
                                jN = nVar6.k();
                                jN2 = nVar6.k();
                            } else {
                                jN = nVar6.n();
                                jN2 = nVar6.n();
                            }
                            long j20 = jN2 + j19;
                            long j21 = jN;
                            long j22 = j20;
                            long jA = z.a(j21, 1000000L, jK);
                            nVar6.e(nVar6.f17846b + 2);
                            int iO2 = nVar6.o();
                            int[] iArr3 = new int[iO2];
                            long[] jArr = new long[iO2];
                            long[] jArr2 = new long[iO2];
                            long[] jArr3 = new long[iO2];
                            long j23 = j21;
                            long j24 = jA;
                            int i39 = 0;
                            while (i39 < iO2) {
                                int iB2 = nVar6.b();
                                if ((Integer.MIN_VALUE & iB2) == 0) {
                                    long jK2 = nVar6.k();
                                    iArr3[i39] = iB2 & Integer.MAX_VALUE;
                                    jArr[i39] = j22;
                                    jArr3[i39] = j24;
                                    long j25 = j23 + jK2;
                                    long[] jArr4 = jArr3;
                                    long[] jArr5 = jArr2;
                                    long jA2 = z.a(j25, 1000000L, jK);
                                    jArr5[i39] = jA2 - jArr4[i39];
                                    nVar6.e(nVar6.f17846b + 4);
                                    j22 += (long) iArr3[i39];
                                    i39++;
                                    jArr2 = jArr5;
                                    jArr = jArr;
                                    jArr3 = jArr4;
                                    iO2 = iO2;
                                    j23 = j25;
                                    j24 = jA2;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unhandled indirect reference");
                                }
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jA), new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr3, jArr, jArr2, jArr3));
                            this.f16915s = ((Long) pairCreate.first).longValue();
                            this.f16921y.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.q) pairCreate.second);
                            this.f16922z = true;
                        }
                        bVar2 = bVar;
                    }
                } else {
                    bVar2.a(i37);
                }
                a(bVar2.f16452c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x036e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0372  */
    /* JADX WARN: Code duplicated, block: B:144:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0379  */
    /* JADX WARN: Code duplicated, block: B:146:0x0382  */
    /* JADX WARN: Code duplicated, block: B:148:0x0388  */
    /* JADX WARN: Code duplicated, block: B:149:0x0391  */
    /* JADX WARN: Code duplicated, block: B:153:0x039e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03af  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:244:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:256:0x0605  */
    public final void a(long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        m mVar;
        s sVarA;
        m mVar2;
        a aVar;
        SparseArray sparseArray;
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        u uVar;
        byte[] bArr2;
        int i14;
        byte[] bArr3;
        long jA;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        int i15;
        long j11;
        long j12;
        long j13;
        int iM;
        int iM2;
        int iB;
        boolean z10;
        loop0: while (true) {
            mVar = this;
            while (true) {
                if (mVar.f16905i.isEmpty() || ((a) mVar.f16905i.peek()).P0 != j10) {
                    break loop0;
                }
                a aVar2 = (a) mVar.f16905i.pop();
                int i16 = aVar2.f16854a;
                int i17 = 12;
                int i18 = 8;
                int i19 = 1;
                if (i16 == c.C) {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVarA = a(aVar2.Q0);
                    a aVarB = aVar2.b(c.N);
                    SparseArray sparseArray2 = new SparseArray();
                    int size = aVarB.Q0.size();
                    long jK = -9223372036854775807L;
                    int i20 = 0;
                    while (i20 < size) {
                        b bVar = (b) aVarB.Q0.get(i20);
                        int i21 = bVar.f16854a;
                        if (i21 == c.f16852z) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
                            nVar.e(i17);
                            Pair pairCreate = Pair.create(Integer.valueOf(nVar.b()), new j(nVar.m() - 1, nVar.m(), nVar.m(), nVar.b()));
                            sparseArray2.put(((Integer) pairCreate.first).intValue(), (j) pairCreate.second);
                        } else if (i21 == c.O) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = bVar.P0;
                            nVar2.e(8);
                            jK = ((nVar2.b() >> 24) & 255) == 0 ? nVar2.k() : nVar2.n();
                        }
                        i20++;
                        i17 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size2 = aVar2.R0.size();
                    for (int i22 = 0; i22 < size2; i22++) {
                        a aVar3 = (a) aVar2.R0.get(i22);
                        if (aVar3.f16854a == c.E && (sVarA = i.a(aVar3, aVar2.c(c.D), jK, dVarA, false)) != null) {
                            sparseArray3.put(sVarA.f16970a, sVarA);
                        }
                    }
                    int size3 = sparseArray3.size();
                    if (mVar.f16897a.size() == 0) {
                        for (int i23 = 0; i23 < size3; i23++) {
                            s sVar = (s) sparseArray3.valueAt(i23);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = mVar.f16921y.a(i23, sVar.f16971b);
                            l lVar = new l(gVarA);
                            j jVar = (j) sparseArray2.get(sVar.f16970a);
                            lVar.f16892c = sVar;
                            jVar.getClass();
                            lVar.f16893d = jVar;
                            gVarA.a(sVar.f16975f);
                            lVar.a();
                            mVar.f16897a.put(sVar.f16970a, lVar);
                            mVar.f16914r = Math.max(mVar.f16914r, sVar.f16974e);
                        }
                        mVar.f16921y.b();
                    } else {
                        if (mVar.f16897a.size() != size3) {
                            throw new IllegalStateException();
                        }
                        for (int i24 = 0; i24 < size3; i24++) {
                            s sVar2 = (s) sparseArray3.valueAt(i24);
                            l lVar2 = (l) mVar.f16897a.get(sVar2.f16970a);
                            j jVar2 = (j) sparseArray2.get(sVar2.f16970a);
                            lVar2.getClass();
                            lVar2.f16892c = sVar2;
                            jVar2.getClass();
                            lVar2.f16893d = jVar2;
                            lVar2.f16891b.a(sVar2.f16975f);
                            lVar2.a();
                        }
                    }
                } else {
                    if (i16 == c.L) {
                        SparseArray sparseArray4 = mVar.f16897a;
                        byte[] bArr4 = mVar.f16904h;
                        int size4 = aVar2.R0.size();
                        int i25 = 0;
                        while (i25 < size4) {
                            a aVar4 = (a) aVar2.R0.get(i25);
                            if (aVar4.f16854a == c.M) {
                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = aVar4.c(c.f16850y).P0;
                                nVar3.e(i18);
                                int iB2 = nVar3.b();
                                l lVar3 = (l) sparseArray4.get(nVar3.b());
                                if (lVar3 == null) {
                                    lVar3 = null;
                                } else {
                                    if ((iB2 & 1) != 0) {
                                        long jN = nVar3.n();
                                        u uVar2 = lVar3.f16890a;
                                        uVar2.f16984b = jN;
                                        uVar2.f16985c = jN;
                                    }
                                    j jVar3 = lVar3.f16893d;
                                    lVar3.f16890a.f16983a = new j((iB2 & 2) != 0 ? nVar3.m() - i19 : jVar3.f16884a, (iB2 & 8) != 0 ? nVar3.m() : jVar3.f16885b, (iB2 & 16) != 0 ? nVar3.m() : jVar3.f16886c, (iB2 & 32) != 0 ? nVar3.m() : jVar3.f16887d);
                                }
                                if (lVar3 == null) {
                                    aVar = aVar2;
                                    sparseArray = sparseArray4;
                                    i10 = size4;
                                    i11 = i25;
                                    i12 = i18;
                                    bArr = bArr4;
                                    i13 = i19;
                                } else {
                                    u uVar3 = lVar3.f16890a;
                                    long jN2 = uVar3.f17000r;
                                    lVar3.a();
                                    int i26 = c.f16848x;
                                    if (aVar4.c(i26) != null) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVar4.c(i26).P0;
                                        nVar4.e(i18);
                                        jN2 = ((nVar4.b() >> 24) & 255) == i19 ? nVar4.n() : nVar4.k();
                                    }
                                    ArrayList arrayList = aVar4.Q0;
                                    int size5 = arrayList.size();
                                    int i27 = 0;
                                    int i28 = 0;
                                    int i29 = 0;
                                    while (i29 < size5) {
                                        SparseArray sparseArray5 = sparseArray4;
                                        b bVar2 = (b) arrayList.get(i29);
                                        int i30 = size4;
                                        long j14 = jN2;
                                        if (bVar2.f16854a == c.A) {
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = bVar2.P0;
                                            nVar5.e(12);
                                            int iM3 = nVar5.m();
                                            if (iM3 > 0) {
                                                i27 += iM3;
                                                i28++;
                                            }
                                        }
                                        i29++;
                                        size4 = i30;
                                        sparseArray4 = sparseArray5;
                                        jN2 = j14;
                                    }
                                    sparseArray = sparseArray4;
                                    i10 = size4;
                                    long j15 = jN2;
                                    lVar3.f16896g = 0;
                                    lVar3.f16895f = 0;
                                    lVar3.f16894e = 0;
                                    u uVar4 = lVar3.f16890a;
                                    uVar4.f16986d = i28;
                                    uVar4.f16987e = i27;
                                    int[] iArr3 = uVar4.f16989g;
                                    if (iArr3 == null || iArr3.length < i28) {
                                        uVar4.f16988f = new long[i28];
                                        uVar4.f16989g = new int[i28];
                                    }
                                    int[] iArr4 = uVar4.f16990h;
                                    if (iArr4 == null || iArr4.length < i27) {
                                        int i31 = (i27 * 125) / 100;
                                        uVar4.f16990h = new int[i31];
                                        uVar4.f16991i = new int[i31];
                                        uVar4.f16992j = new long[i31];
                                        uVar4.f16993k = new boolean[i31];
                                        uVar4.f16995m = new boolean[i31];
                                    }
                                    int i32 = 0;
                                    int i33 = 0;
                                    int i34 = 0;
                                    while (i32 < size5) {
                                        b bVar3 = (b) arrayList.get(i32);
                                        if (bVar3.f16854a == c.A) {
                                            int i35 = i33 + 1;
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVar3.P0;
                                            nVar6.e(8);
                                            int iB3 = nVar6.b();
                                            s sVar3 = lVar3.f16892c;
                                            u uVar5 = lVar3.f16890a;
                                            j jVar4 = uVar5.f16983a;
                                            uVar5.f16989g[i33] = nVar6.m();
                                            long[] jArr2 = uVar5.f16988f;
                                            long j16 = uVar5.f16984b;
                                            jArr2[i33] = j16;
                                            if ((iB3 & 1) != 0) {
                                                jArr2[i33] = j16 + ((long) nVar6.b());
                                            }
                                            boolean z11 = (iB3 & 4) != 0;
                                            int iM4 = jVar4.f16887d;
                                            if (z11) {
                                                iM4 = nVar6.m();
                                            }
                                            boolean z12 = (iB3 & 256) != 0;
                                            boolean z13 = (iB3 & 512) != 0;
                                            boolean z14 = (iB3 & 1024) != 0;
                                            boolean z15 = (iB3 & 2048) != 0;
                                            long[] jArr3 = sVar3.f16978i;
                                            int i36 = iM4;
                                            if (jArr3 != null) {
                                                bArr3 = bArr4;
                                                if (jArr3.length == 1 && jArr3[0] == 0) {
                                                    jA = z.a(sVar3.f16979j[0], 1000L, sVar3.f16972c);
                                                }
                                                iArr = uVar5.f16990h;
                                                iArr2 = uVar5.f16991i;
                                                jArr = uVar5.f16992j;
                                                zArr = uVar5.f16993k;
                                                i15 = uVar5.f16989g[i33] + i34;
                                                j11 = jA;
                                                j12 = sVar3.f16972c;
                                                if (i33 > 0) {
                                                    j13 = uVar5.f17000r;
                                                } else {
                                                    j13 = j15;
                                                }
                                                while (i34 < i15) {
                                                    if (z12) {
                                                        iM = nVar6.m();
                                                    } else {
                                                        iM = jVar4.f16885b;
                                                    }
                                                    if (z13) {
                                                        iM2 = nVar6.m();
                                                    } else {
                                                        iM2 = jVar4.f16886c;
                                                    }
                                                    if (i34 != 0 && z11) {
                                                        iB = i36;
                                                    } else if (z14) {
                                                        iB = nVar6.b();
                                                    } else {
                                                        iB = jVar4.f16887d;
                                                    }
                                                    if (z15) {
                                                        iArr2[i34] = (int) (((long) (nVar6.b() * 1000)) / j12);
                                                    } else {
                                                        iArr2[i34] = 0;
                                                    }
                                                    jArr[i34] = z.a(j13, 1000L, j12) - j11;
                                                    iArr[i34] = iM2;
                                                    if (((iB >> 16) & 1) == 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    zArr[i34] = z10;
                                                    j13 += (long) iM;
                                                    i34++;
                                                    z12 = z12;
                                                    z13 = z13;
                                                    z11 = z11;
                                                    z14 = z14;
                                                    jVar4 = jVar4;
                                                    z15 = z15;
                                                }
                                                uVar5.f17000r = j13;
                                                i34 = i15;
                                                i33 = i35;
                                            } else {
                                                bArr3 = bArr4;
                                            }
                                            jA = 0;
                                            iArr = uVar5.f16990h;
                                            iArr2 = uVar5.f16991i;
                                            jArr = uVar5.f16992j;
                                            zArr = uVar5.f16993k;
                                            i15 = uVar5.f16989g[i33] + i34;
                                            j11 = jA;
                                            j12 = sVar3.f16972c;
                                            if (i33 > 0) {
                                                j13 = uVar5.f17000r;
                                            } else {
                                                j13 = j15;
                                            }
                                            while (i34 < i15) {
                                                if (z12) {
                                                    iM = nVar6.m();
                                                } else {
                                                    iM = jVar4.f16885b;
                                                }
                                                if (z13) {
                                                    iM2 = nVar6.m();
                                                } else {
                                                    iM2 = jVar4.f16886c;
                                                }
                                                if (i34 != 0) {
                                                    if (z14) {
                                                        iB = nVar6.b();
                                                    } else {
                                                        iB = jVar4.f16887d;
                                                    }
                                                } else if (z14) {
                                                    iB = nVar6.b();
                                                } else {
                                                    iB = jVar4.f16887d;
                                                }
                                                if (z15) {
                                                    iArr2[i34] = (int) (((long) (nVar6.b() * 1000)) / j12);
                                                } else {
                                                    iArr2[i34] = 0;
                                                }
                                                jArr[i34] = z.a(j13, 1000L, j12) - j11;
                                                iArr[i34] = iM2;
                                                if (((iB >> 16) & 1) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                zArr[i34] = z10;
                                                j13 += (long) iM;
                                                i34++;
                                                z12 = z12;
                                                z13 = z13;
                                                z11 = z11;
                                                z14 = z14;
                                                jVar4 = jVar4;
                                                z15 = z15;
                                            }
                                            uVar5.f17000r = j13;
                                            i34 = i15;
                                            i33 = i35;
                                        } else {
                                            bArr3 = bArr4;
                                            i25 = i25;
                                            aVar4 = aVar4;
                                            uVar3 = uVar3;
                                        }
                                        i32++;
                                        arrayList = arrayList;
                                        size5 = size5;
                                        aVar2 = aVar2;
                                        i25 = i25;
                                        aVar4 = aVar4;
                                        uVar3 = uVar3;
                                        bArr4 = bArr3;
                                        lVar3 = lVar3;
                                    }
                                    aVar = aVar2;
                                    byte[] bArr5 = bArr4;
                                    i11 = i25;
                                    u uVar6 = uVar3;
                                    l lVar4 = lVar3;
                                    b bVarC = aVar4.c(c.f16809d0);
                                    if (bVarC != null) {
                                        uVar = uVar6;
                                        t tVar = lVar4.f16892c.f16977h[uVar.f16983a.f16884a];
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = bVarC.P0;
                                        int i37 = tVar.f16981a;
                                        nVar7.e(8);
                                        if ((nVar7.b() & 1) == 1) {
                                            nVar7.e(nVar7.f17846b + 8);
                                        }
                                        int iJ = nVar7.j();
                                        int iM5 = nVar7.m();
                                        if (iM5 == uVar.f16987e) {
                                            if (iJ == 0) {
                                                boolean[] zArr2 = uVar.f16995m;
                                                i14 = 0;
                                                for (int i38 = 0; i38 < iM5; i38++) {
                                                    int iJ2 = nVar7.j();
                                                    i14 += iJ2;
                                                    zArr2[i38] = iJ2 > i37;
                                                }
                                            } else {
                                                i14 = iJ * iM5;
                                                Arrays.fill(uVar.f16995m, 0, iM5, iJ > i37);
                                            }
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = uVar.f16998p;
                                            if (nVar8 == null || nVar8.f17847c < i14) {
                                                uVar.f16998p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i14);
                                            }
                                            uVar.f16997o = i14;
                                            uVar.f16994l = true;
                                            uVar.f16999q = true;
                                        } else {
                                            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", iM5, ", ");
                                            sbA.append(uVar.f16987e);
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(sbA.toString());
                                        }
                                    } else {
                                        uVar = uVar6;
                                    }
                                    b bVarC2 = aVar4.c(c.f16811e0);
                                    if (bVarC2 != null) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = bVarC2.P0;
                                        nVar9.e(8);
                                        int iB4 = nVar9.b();
                                        if ((iB4 & 1) == 1) {
                                            nVar9.e(nVar9.f17846b + 8);
                                        }
                                        int iM6 = nVar9.m();
                                        if (iM6 != 1) {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected saio entry count: ", iM6));
                                        }
                                        uVar.f16985c += ((iB4 >> 24) & 255) == 0 ? nVar9.k() : nVar9.n();
                                    }
                                    b bVarC3 = aVar4.c(c.f16819i0);
                                    if (bVarC3 != null) {
                                        a(bVarC3.P0, 0, uVar);
                                    }
                                    b bVarC4 = aVar4.c(c.f16813f0);
                                    b bVarC5 = aVar4.c(c.f16815g0);
                                    if (bVarC4 == null || bVarC5 == null) {
                                        i13 = 1;
                                    } else {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar10 = bVarC4.P0;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar11 = bVarC5.P0;
                                        nVar10.e(8);
                                        int iB5 = nVar10.b();
                                        int iB6 = nVar10.b();
                                        int i39 = A;
                                        if (iB6 != i39) {
                                            i13 = 1;
                                        } else {
                                            if (((iB5 >> 24) & 255) == 1) {
                                                nVar10.e(nVar10.f17846b + 4);
                                            }
                                            if (nVar10.b() == 1) {
                                                nVar11.e(8);
                                                int iB7 = nVar11.b();
                                                if (nVar11.b() != i39) {
                                                    i13 = 1;
                                                } else {
                                                    int i40 = (iB7 >> 24) & 255;
                                                    if (i40 == 1) {
                                                        if (nVar11.k() == 0) {
                                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Variable length decription in sgpd found (unsupported)");
                                                        }
                                                    } else if (i40 >= 2) {
                                                        nVar11.e(nVar11.f17846b + 4);
                                                    }
                                                    if (nVar11.k() == 1) {
                                                        nVar11.e(nVar11.f17846b + 2);
                                                        i13 = 1;
                                                        if (nVar11.j() == 1) {
                                                            int iJ3 = nVar11.j();
                                                            byte[] bArr6 = new byte[16];
                                                            nVar11.a(bArr6, 0, 16);
                                                            uVar.f16994l = true;
                                                            uVar.f16996n = new t(iJ3, bArr6);
                                                        }
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Entry count in sgpd != 1 (unsupported).");
                                                    }
                                                }
                                            } else {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Entry count in sbgp != 1 (unsupported).");
                                            }
                                        }
                                    }
                                    int size6 = aVar4.Q0.size();
                                    int i41 = 0;
                                    while (i41 < size6) {
                                        b bVar4 = (b) aVar4.Q0.get(i41);
                                        if (bVar4.f16854a == c.f16817h0) {
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar12 = bVar4.P0;
                                            nVar12.e(8);
                                            bArr2 = bArr5;
                                            nVar12.a(bArr2, 0, 16);
                                            if (Arrays.equals(bArr2, B)) {
                                                a(nVar12, 16, uVar);
                                            }
                                        } else {
                                            bArr2 = bArr5;
                                        }
                                        i41++;
                                        bArr5 = bArr2;
                                    }
                                    bArr = bArr5;
                                    i12 = 8;
                                }
                            } else {
                                aVar = aVar2;
                                sparseArray = sparseArray4;
                                i10 = size4;
                                i11 = i25;
                                i12 = i18;
                                bArr = bArr4;
                                i13 = i19;
                            }
                            i19 = i13;
                            bArr4 = bArr;
                            size4 = i10;
                            sparseArray4 = sparseArray;
                            aVar2 = aVar;
                            i18 = i12;
                            i25 = i11 + 1;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVarA2 = a(aVar2.Q0);
                        if (dVarA2 != null) {
                            mVar2 = this;
                            int size7 = mVar2.f16897a.size();
                            for (int i42 = 0; i42 < size7; i42++) {
                                l lVar5 = (l) mVar2.f16897a.valueAt(i42);
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = lVar5.f16891b;
                                com.fyber.inneractive.sdk.player.exoplayer2.o oVar = lVar5.f16892c.f16975f;
                                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f17499a, oVar.f17503e, oVar.f17504f, oVar.f17501c, oVar.f17500b, oVar.f17505g, oVar.f17508j, oVar.f17509k, oVar.f17510l, oVar.f17511m, oVar.f17512n, oVar.f17514p, oVar.f17513o, oVar.f17515q, oVar.f17516r, oVar.f17517s, oVar.f17518t, oVar.f17519u, oVar.f17520v, oVar.f17522x, oVar.f17523y, oVar.f17524z, oVar.f17521w, oVar.f17506h, dVarA2, oVar.f17502d));
                            }
                        }
                    } else {
                        mVar2 = mVar;
                        if (!mVar2.f16905i.isEmpty()) {
                            ((a) mVar2.f16905i.peek()).R0.add(aVar2);
                        }
                    }
                    mVar = mVar2;
                }
            }
        }
        m mVar3 = mVar;
        mVar3.f16907k = 0;
        mVar3.f16910n = 0;
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, u uVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        nVar.e(i10 + 8);
        int iB = nVar.b();
        int i11 = c.f16804b;
        if ((iB & 1) == 0) {
            boolean z10 = (iB & 2) != 0;
            int iM = nVar.m();
            if (iM == uVar.f16987e) {
                Arrays.fill(uVar.f16995m, 0, iM, z10);
                int i12 = nVar.f17847c - nVar.f17846b;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar.f16998p;
                if (nVar2 == null || nVar2.f17847c < i12) {
                    uVar.f16998p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i12);
                }
                uVar.f16997o = i12;
                uVar.f16994l = true;
                uVar.f16999q = true;
                nVar.a(uVar.f16998p.f17845a, 0, i12);
                uVar.f16998p.e(0);
                uVar.f16999q = false;
                return;
            }
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", iM, ", ");
            sbA.append(uVar.f16987e);
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(sbA.toString());
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.d a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f16854a == c.V) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.P0.f17845a;
                UUID uuidA = q.a(bArr);
                if (uuidA == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(uuidA, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(false, (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) arrayList2.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c[arrayList2.size()]));
    }
}
