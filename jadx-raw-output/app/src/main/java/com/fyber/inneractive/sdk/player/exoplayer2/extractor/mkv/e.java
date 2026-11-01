package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements i {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final byte[] f16742a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final UUID f16743b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g B;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public j Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f16746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f16748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f16749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f16750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f16751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f16752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f16753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f16754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f16755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f16756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f16757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f16758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f16761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f16762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f16763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f16766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f16768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f16769z;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        f fVar = new f();
        long j10 = bVar.f16451b;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        bVar.a(fVar.f16770a.f17845a, 0, 4, false);
        fVar.f16771b = 4;
        for (long jK = fVar.f16770a.k(); jK != 440786851; jK = ((jK << 8) & (-256)) | ((long) (fVar.f16770a.f17845a[0] & 255))) {
            int i11 = fVar.f16771b + 1;
            fVar.f16771b = i11;
            if (i11 == i10) {
                return false;
            }
            bVar.a(fVar.f16770a.f17845a, 0, 1, false);
        }
        long jA = fVar.a(bVar);
        long j12 = fVar.f16771b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (j10 != -1 && j12 + jA >= j10) {
            return false;
        }
        while (true) {
            long j13 = fVar.f16771b;
            long j14 = j12 + jA;
            if (j13 >= j14) {
                return j13 == j14;
            }
            if (fVar.a(bVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = fVar.a(bVar);
            if (jA2 < 0 || jA2 > 2147483647L) {
                return false;
            }
            if (jA2 != 0) {
                bVar.a((int) jA2, false);
                fVar.f16771b = (int) (((long) fVar.f16771b) + jA2);
            }
        }
    }

    public e() {
        b bVar = new b();
        this.f16759p = -1L;
        this.f16760q = -9223372036854775807L;
        this.f16761r = -9223372036854775807L;
        this.f16762s = -9223372036854775807L;
        this.f16768y = -1L;
        this.f16769z = -1L;
        this.A = -9223372036854775807L;
        this.f16744a = bVar;
        bVar.f16711d = new c(this);
        this.f16747d = true;
        this.f16745b = new g();
        this.f16746c = new SparseArray();
        this.f16750g = new n(4);
        this.f16751h = new n(ByteBuffer.allocate(4).putInt(-1).array());
        this.f16752i = new n(4);
        this.f16748e = new n(l.f17837a);
        this.f16749f = new n(4);
        this.f16753j = new n();
        this.f16754k = new n();
        this.f16755l = new n(8);
        this.f16756m = new n();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.Y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.A = -9223372036854775807L;
        this.E = 0;
        b bVar = this.f16744a;
        bVar.f16712e = 0;
        bVar.f16709b.clear();
        g gVar = bVar.f16710c;
        gVar.f16774b = 0;
        gVar.f16775c = 0;
        g gVar2 = this.f16745b;
        gVar2.f16774b = 0;
        gVar2.f16775c = 0;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar = this.f16753j;
        nVar.f17846b = 0;
        nVar.f17847c = 0;
    }

    /* JADX WARN: Code duplicated, block: B:302:0x0576  */
    /* JADX WARN: Code duplicated, block: B:303:0x0584  */
    /* JADX WARN: Code duplicated, block: B:305:0x0588  */
    /* JADX WARN: Code duplicated, block: B:308:0x0591  */
    /* JADX WARN: Code duplicated, block: B:312:0x05b2 A[LOOP:7: B:309:0x0595->B:312:0x05b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:314:0x05c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:318:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:320:0x05df  */
    /* JADX WARN: Code duplicated, block: B:322:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:327:0x0606 A[LOOP:10: B:325:0x0603->B:327:0x0606, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x0619  */
    /* JADX WARN: Code duplicated, block: B:331:0x062b A[LOOP:9: B:321:0x05e0->B:331:0x062b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:441:0x0815  */
    /* JADX WARN: Code duplicated, block: B:578:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:582:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:584:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:612:0x06c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0ab0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x0ac6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0acc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0acc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x0acc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0632 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v132 */
    /* JADX WARN: Type inference failed for: r4v89, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v93 */
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
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, r, EOFException {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        long j10;
        long j11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        long j12;
        int i26;
        int i27;
        int i28;
        long j13;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        double dLongBitsToDouble;
        long j14;
        int i37;
        int iA;
        q pVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar;
        int i38;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar2;
        int i39 = 0;
        this.W = false;
        boolean z13 = true;
        while (z13 && !this.W) {
            b bVar2 = this.f16744a;
            if (bVar2.f16711d == null) {
                throw new IllegalStateException();
            }
            while (true) {
                if (bVar2.f16709b.isEmpty()) {
                    z10 = i39;
                } else {
                    if (bVar.f16452c >= ((a) bVar2.f16709b.peek()).f16707b) {
                        c cVar = bVar2.f16711d;
                        int i40 = ((a) bVar2.f16709b.pop()).f16706a;
                        e eVar = cVar.f16715a;
                        if (i40 != 160) {
                            if (i40 == 174) {
                                String str2 = eVar.f16763t.f16716a;
                                if ("V_VP8".equals(str2) || "V_VP9".equals(str2) || "V_MPEG2".equals(str2) || "V_MPEG4/ISO/SP".equals(str2) || "V_MPEG4/ISO/ASP".equals(str2) || "V_MPEG4/ISO/AP".equals(str2) || "V_MPEG4/ISO/AVC".equals(str2) || "V_MPEGH/ISO/HEVC".equals(str2) || "V_MS/VFW/FOURCC".equals(str2) || "V_THEORA".equals(str2) || "A_OPUS".equals(str2) || "A_VORBIS".equals(str2) || "A_AAC".equals(str2) || "A_MPEG/L2".equals(str2) || "A_MPEG/L3".equals(str2) || "A_AC3".equals(str2) || "A_EAC3".equals(str2) || "A_TRUEHD".equals(str2) || "A_DTS".equals(str2) || "A_DTS/EXPRESS".equals(str2) || "A_DTS/LOSSLESS".equals(str2) || "A_FLAC".equals(str2) || "A_MS/ACM".equals(str2) || "A_PCM/INT/LIT".equals(str2) || "S_TEXT/UTF8".equals(str2) || "S_VOBSUB".equals(str2) || "S_HDMV/PGS".equals(str2) || "S_DVBSUB".equals(str2)) {
                                    d dVar = eVar.f16763t;
                                    dVar.a(eVar.Y, dVar.f16717b);
                                    SparseArray sparseArray = eVar.f16746c;
                                    d dVar2 = eVar.f16763t;
                                    sparseArray.put(dVar2.f16717b, dVar2);
                                }
                                eVar.f16763t = null;
                            } else {
                                if (i40 == 19899) {
                                    int i41 = eVar.f16765v;
                                    if (i41 != -1) {
                                        long j15 = eVar.f16766w;
                                        if (j15 != -1) {
                                            if (i41 == 475249515) {
                                                eVar.f16768y = j15;
                                            }
                                        }
                                    }
                                    throw new r("Mandatory element SeekID or SeekPosition not found");
                                }
                                if (i40 == 25152) {
                                    d dVar3 = eVar.f16763t;
                                    if (dVar3.f16720e) {
                                        byte[] bArr = dVar3.f16722g;
                                        if (bArr != null) {
                                            dVar3.f16724i = new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(true, new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(com.fyber.inneractive.sdk.player.exoplayer2.b.f16415b, "video/webm", bArr));
                                        } else {
                                            throw new r("Encrypted Track found but ContentEncKeyID was not found");
                                        }
                                    }
                                } else if (i40 == 28032) {
                                    d dVar4 = eVar.f16763t;
                                    if (dVar4.f16720e && dVar4.f16721f != null) {
                                        throw new r("Combining encryption and compression is not supported");
                                    }
                                } else if (i40 == 357149030) {
                                    if (eVar.f16760q == -9223372036854775807L) {
                                        eVar.f16760q = 1000000L;
                                    }
                                    long j16 = eVar.f16761r;
                                    if (j16 != -9223372036854775807L) {
                                        eVar.f16762s = eVar.a(j16);
                                    }
                                } else if (i40 != 374648427) {
                                    if (i40 != 475249515) {
                                        eVar.getClass();
                                    } else if (!eVar.f16764u) {
                                        j jVar = eVar.Y;
                                        if (eVar.f16759p != -1 && eVar.f16762s != -9223372036854775807L && (gVar = eVar.B) != null && (i38 = gVar.f17823a) != 0 && (gVar2 = eVar.C) != null && gVar2.f17823a == i38) {
                                            int[] iArr2 = new int[i38];
                                            long[] jArr = new long[i38];
                                            long[] jArr2 = new long[i38];
                                            long[] jArr3 = new long[i38];
                                            for (int i42 = 0; i42 < i38; i42++) {
                                                com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar3 = eVar.B;
                                                if (i42 >= 0) {
                                                    if (i42 < gVar3.f17823a) {
                                                        jArr3[i42] = gVar3.f17824b[i42];
                                                        long j17 = eVar.f16759p;
                                                        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar4 = eVar.C;
                                                        if (i42 < 0) {
                                                            gVar4.getClass();
                                                        } else if (i42 < gVar4.f17823a) {
                                                            jArr[i42] = gVar4.f17824b[i42] + j17;
                                                        }
                                                        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i42, ", size is ");
                                                        sbA.append(gVar4.f17823a);
                                                        throw new IndexOutOfBoundsException(sbA.toString());
                                                    }
                                                } else {
                                                    gVar3.getClass();
                                                }
                                                StringBuilder sbA2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i42, ", size is ");
                                                sbA2.append(gVar3.f17823a);
                                                throw new IndexOutOfBoundsException(sbA2.toString());
                                            }
                                            int i43 = 0;
                                            while (true) {
                                                int i44 = i38 - 1;
                                                if (i43 < i44) {
                                                    int i45 = i43 + 1;
                                                    iArr2[i43] = (int) (jArr[i45] - jArr[i43]);
                                                    jArr2[i43] = jArr3[i45] - jArr3[i43];
                                                    i43 = i45;
                                                } else {
                                                    iArr2[i44] = (int) ((eVar.f16759p + eVar.f16758o) - jArr[i44]);
                                                    jArr2[i44] = eVar.f16762s - jArr3[i44];
                                                    eVar.B = null;
                                                    eVar.C = null;
                                                    pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr2, jArr, jArr2, jArr3);
                                                }
                                            }
                                        } else {
                                            eVar.B = null;
                                            eVar.C = null;
                                            pVar = new p(eVar.f16762s);
                                        }
                                        jVar.a(pVar);
                                        eVar.f16764u = true;
                                    }
                                } else if (eVar.f16746c.size() != 0) {
                                    eVar.Y.b();
                                } else {
                                    throw new r("No valid tracks were found");
                                }
                            }
                        } else if (eVar.E == 2) {
                            if (!eVar.X) {
                                eVar.M |= 1;
                            }
                            eVar.a((d) eVar.f16746c.get(eVar.K), eVar.F);
                            i10 = 0;
                            eVar.E = 0;
                        }
                        i10 = 0;
                    } else {
                        z10 = 0;
                    }
                    i11 = i10;
                    z13 = true;
                    z11 = i11;
                    if (z13) {
                        j10 = bVar.f16452c;
                        if (this.f16767x) {
                            this.f16769z = j10;
                            oVar.f17021a = this.f16768y;
                            this.f16767x = z11;
                            return 1;
                        }
                        if (this.f16764u) {
                            j11 = this.f16769z;
                            if (j11 != -1) {
                                oVar.f17021a = j11;
                                this.f16769z = -1L;
                                return 1;
                            }
                        } else {
                            continue;
                        }
                    }
                    i39 = 0;
                }
                int i46 = 8;
                if (bVar2.f16712e == 0) {
                    long jA = bVar2.f16710c.a(bVar, true, z10, 4);
                    if (jA == -2) {
                        bVar.f16454e = z10 ? 1 : 0;
                        ?? r10 = z10;
                        while (true) {
                            bVar.a(bVar2.f16708a, r10, 4, r10);
                            byte b10 = bVar2.f16708a[r10];
                            int i47 = 0;
                            while (true) {
                                long[] jArr4 = g.f16772d;
                                if (i47 >= 8) {
                                    i37 = -1;
                                } else if ((jArr4[i47] & ((long) b10)) != 0) {
                                    i37 = i47 + 1;
                                } else {
                                    i47++;
                                }
                            }
                            if (i37 != -1 && i37 <= 4) {
                                iA = (int) g.a(bVar2.f16708a, i37, false);
                                bVar2.f16711d.f16715a.getClass();
                                if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                }
                            }
                            bVar.a(1);
                            r10 = 0;
                        }
                        bVar.a(i37);
                        j14 = iA;
                        z12 = true;
                    } else {
                        z12 = true;
                        j14 = jA;
                    }
                    if (j14 == -1) {
                        z11 = 0;
                        z13 = false;
                    } else {
                        bVar2.f16713f = (int) j14;
                        bVar2.f16712e = z12 ? 1 : 0;
                    }
                    if (z13) {
                        j10 = bVar.f16452c;
                        if (this.f16767x) {
                            this.f16769z = j10;
                            oVar.f17021a = this.f16768y;
                            this.f16767x = z11;
                            return 1;
                        }
                        if (this.f16764u) {
                            j11 = this.f16769z;
                            if (j11 != -1) {
                                oVar.f17021a = j11;
                                this.f16769z = -1L;
                                return 1;
                            }
                        } else {
                            continue;
                        }
                    }
                    i39 = 0;
                } else {
                    z12 = true;
                }
                if (bVar2.f16712e == z12) {
                    bVar2.f16714g = bVar2.f16710c.a(bVar, false, z12, 8);
                    bVar2.f16712e = 2;
                }
                c cVar2 = bVar2.f16711d;
                int i48 = bVar2.f16713f;
                cVar2.f16715a.getClass();
                switch (i48) {
                    case MRAID_JS_WRITE_FAILED_VALUE:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case AD_RESPONSE_EMPTY_VALUE:
                    case 231:
                    case 241:
                    case 251:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 2352003:
                    case 2807729:
                        i12 = 2;
                        break;
                    case 134:
                    case 17026:
                    case 2274716:
                        i12 = 3;
                        break;
                    case 160:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        i12 = 1;
                        break;
                    case 161:
                    case 163:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        i12 = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                        i12 = 5;
                        break;
                    default:
                        i12 = 0;
                        break;
                }
                if (i12 != 0) {
                    if (i12 == 1) {
                        long j18 = bVar.f16452c;
                        bVar2.f16709b.add(new a(bVar2.f16713f, bVar2.f16714g + j18));
                        c cVar3 = bVar2.f16711d;
                        int i49 = bVar2.f16713f;
                        long j19 = bVar2.f16714g;
                        e eVar2 = cVar3.f16715a;
                        eVar2.getClass();
                        if (i49 == 160) {
                            i13 = 0;
                            eVar2.X = false;
                        } else if (i49 == 174) {
                            i13 = 0;
                            eVar2.f16763t = new d();
                        } else if (i49 != 187) {
                            if (i49 == 19899) {
                                eVar2.f16765v = -1;
                                eVar2.f16766w = -1L;
                            } else if (i49 == 20533) {
                                eVar2.f16763t.f16720e = true;
                            } else if (i49 == 21968) {
                                eVar2.f16763t.f16732q = true;
                            } else if (i49 == 408125543) {
                                long j20 = eVar2.f16759p;
                                if (j20 != -1 && j20 != j18) {
                                    throw new r("Multiple Segment elements not supported");
                                }
                                eVar2.f16759p = j18;
                                eVar2.f16758o = j19;
                            } else if (i49 != 475249515) {
                                if (i49 == 524531317 && !eVar2.f16764u) {
                                    if (eVar2.f16747d && eVar2.f16768y != -1) {
                                        eVar2.f16767x = true;
                                    } else {
                                        eVar2.Y.a(new p(eVar2.f16762s));
                                        eVar2.f16764u = true;
                                    }
                                }
                            } else {
                                eVar2.B = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                                eVar2.C = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                            }
                            i13 = 0;
                        } else {
                            i13 = 0;
                            eVar2.D = false;
                        }
                        bVar2.f16712e = i13 == true ? 1 : 0;
                        i11 = i13;
                    } else if (i12 == 2) {
                        long j21 = bVar2.f16714g;
                        if (j21 <= 8) {
                            c cVar4 = bVar2.f16711d;
                            int i50 = bVar2.f16713f;
                            int i51 = (int) j21;
                            bVar.b(bVar2.f16708a, 0, i51, false);
                            long j22 = 0;
                            for (int i52 = 0; i52 < i51; i52++) {
                                j22 = (j22 << 8) | ((long) (bVar2.f16708a[i52] & 255));
                            }
                            e eVar3 = cVar4.f16715a;
                            eVar3.getClass();
                            if (i50 != 20529) {
                                if (i50 != 20530) {
                                    switch (i50) {
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                            eVar3.f16763t.f16718c = (int) j22;
                                            break;
                                        case 136:
                                            eVar3.f16763t.L = j22 == 1;
                                            break;
                                        case 155:
                                            eVar3.G = eVar3.a(j22);
                                            break;
                                        case 159:
                                            eVar3.f16763t.G = (int) j22;
                                            break;
                                        case 176:
                                            eVar3.f16763t.f16725j = (int) j22;
                                            break;
                                        case 179:
                                            eVar3.B.a(eVar3.a(j22));
                                            break;
                                        case 186:
                                            eVar3.f16763t.f16726k = (int) j22;
                                            break;
                                        case AD_RESPONSE_EMPTY_VALUE:
                                            eVar3.f16763t.f16717b = (int) j22;
                                            break;
                                        case 231:
                                            eVar3.A = eVar3.a(j22);
                                            break;
                                        case 241:
                                            if (!eVar3.D) {
                                                eVar3.C.a(j22);
                                                eVar3.D = true;
                                            }
                                            break;
                                        case 251:
                                            eVar3.X = true;
                                            break;
                                        case 16980:
                                            if (j22 != 3) {
                                                throw new r("ContentCompAlgo " + j22 + " not supported");
                                            }
                                            break;
                                        case 17029:
                                            if (j22 < 1 || j22 > 2) {
                                                throw new r("DocTypeReadVersion " + j22 + " not supported");
                                            }
                                            break;
                                        case 17143:
                                            if (j22 != 1) {
                                                throw new r("EBMLReadVersion " + j22 + " not supported");
                                            }
                                            break;
                                        case 18401:
                                            if (j22 != 5) {
                                                throw new r("ContentEncAlgo " + j22 + " not supported");
                                            }
                                            break;
                                        case 18408:
                                            if (j22 != 1) {
                                                throw new r("AESSettingsCipherMode " + j22 + " not supported");
                                            }
                                            break;
                                        case 21420:
                                            eVar3.f16766w = j22 + eVar3.f16759p;
                                            break;
                                        case 21432:
                                            int i53 = (int) j22;
                                            if (i53 == 0) {
                                                eVar3.f16763t.f16731p = 0;
                                                i14 = 0;
                                            } else if (i53 == 1) {
                                                eVar3.f16763t.f16731p = 2;
                                            } else if (i53 == 3) {
                                                eVar3.f16763t.f16731p = 1;
                                            } else if (i53 == 15) {
                                                eVar3.f16763t.f16731p = 3;
                                            }
                                            bVar2.f16712e = i14 == true ? 1 : 0;
                                            i11 = i14;
                                            break;
                                        case 21680:
                                            eVar3.f16763t.f16727l = (int) j22;
                                            break;
                                        case 21682:
                                            eVar3.f16763t.f16729n = (int) j22;
                                            break;
                                        case 21690:
                                            eVar3.f16763t.f16728m = (int) j22;
                                            break;
                                        case 21930:
                                            eVar3.f16763t.M = j22 == 1;
                                            break;
                                        case 22186:
                                            eVar3.f16763t.J = j22;
                                            break;
                                        case 22203:
                                            eVar3.f16763t.K = j22;
                                            break;
                                        case 25188:
                                            eVar3.f16763t.H = (int) j22;
                                            break;
                                        case 2352003:
                                            eVar3.f16763t.f16719d = (int) j22;
                                            break;
                                        case 2807729:
                                            eVar3.f16760q = j22;
                                            break;
                                        default:
                                            switch (i50) {
                                                case 21945:
                                                    int i54 = (int) j22;
                                                    if (i54 == 1) {
                                                        eVar3.f16763t.f16735t = 2;
                                                    } else if (i54 == 2) {
                                                        eVar3.f16763t.f16735t = 1;
                                                    }
                                                    break;
                                                case 21946:
                                                    int i55 = (int) j22;
                                                    if (i55 == 1) {
                                                        eVar3.f16763t.f16734s = 3;
                                                    } else if (i55 == 16) {
                                                        eVar3.f16763t.f16734s = 6;
                                                    } else if (i55 == 18) {
                                                        eVar3.f16763t.f16734s = 7;
                                                    } else if (i55 == 6 || i55 == 7) {
                                                        eVar3.f16763t.f16734s = 3;
                                                    }
                                                    break;
                                                case 21947:
                                                    d dVar5 = eVar3.f16763t;
                                                    dVar5.f16732q = true;
                                                    int i56 = (int) j22;
                                                    if (i56 == 1) {
                                                        dVar5.f16733r = 1;
                                                    } else if (i56 == 9) {
                                                        dVar5.f16733r = 6;
                                                    } else if (i56 == 4 || i56 == 5 || i56 == 6 || i56 == 7) {
                                                        dVar5.f16733r = 2;
                                                    }
                                                    break;
                                                case 21948:
                                                    eVar3.f16763t.f16736u = (int) j22;
                                                    break;
                                                case 21949:
                                                    eVar3.f16763t.f16737v = (int) j22;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (j22 != 1) {
                                    throw new r("ContentEncodingScope " + j22 + " not supported");
                                }
                            } else if (j22 != 0) {
                                throw new r("ContentEncodingOrder " + j22 + " not supported");
                            }
                            i14 = 0;
                            bVar2.f16712e = i14 == true ? 1 : 0;
                            i11 = i14;
                        } else {
                            throw new r("Invalid integer size: " + bVar2.f16714g);
                        }
                    } else if (i12 == 3) {
                        long j23 = bVar2.f16714g;
                        if (j23 <= 2147483647L) {
                            c cVar5 = bVar2.f16711d;
                            int i57 = bVar2.f16713f;
                            int i58 = (int) j23;
                            if (i58 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i58];
                                bVar.b(bArr2, 0, i58, false);
                                str = new String(bArr2);
                            }
                            e eVar4 = cVar5.f16715a;
                            eVar4.getClass();
                            if (i57 == 134) {
                                eVar4.f16763t.f16716a = str;
                            } else if (i57 != 17026) {
                                if (i57 == 2274716) {
                                    eVar4.f16763t.N = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw new r("DocType " + str + " not supported");
                            }
                            i11 = 0;
                            bVar2.f16712e = 0;
                        } else {
                            throw new r("String element size: " + bVar2.f16714g);
                        }
                    } else if (i12 == 4) {
                        c cVar6 = bVar2.f16711d;
                        int i59 = bVar2.f16713f;
                        int i60 = (int) bVar2.f16714g;
                        e eVar5 = cVar6.f16715a;
                        if (i59 == 161 || i59 == 163) {
                            i15 = 0;
                            if (eVar5.E == 0) {
                                eVar5.K = (int) eVar5.f16745b.a(bVar, false, true, 8);
                                eVar5.L = eVar5.f16745b.f16775c;
                                eVar5.G = -9223372036854775807L;
                                eVar5.E = 1;
                                n nVar = eVar5.f16750g;
                                nVar.f17846b = 0;
                                nVar.f17847c = 0;
                            }
                            d dVar6 = (d) eVar5.f16746c.get(eVar5.K);
                            if (dVar6 == null) {
                                bVar.a(i60 - eVar5.L);
                                eVar5.E = 0;
                            } else {
                                if (eVar5.E == 1) {
                                    eVar5.a(bVar, 3);
                                    int i61 = (eVar5.f16750g.f17845a[2] & 6) >> 1;
                                    if (i61 == 0) {
                                        eVar5.I = 1;
                                        int[] iArr3 = eVar5.J;
                                        if (iArr3 == null) {
                                            iArr3 = new int[1];
                                        } else if (iArr3.length < 1) {
                                            iArr3 = new int[Math.max(iArr3.length * 2, 1)];
                                        }
                                        eVar5.J = iArr3;
                                        iArr3[0] = (i60 - eVar5.L) - 3;
                                    } else if (i59 == 163) {
                                        eVar5.a(bVar, 4);
                                        int i62 = (eVar5.f16750g.f17845a[3] & 255) + 1;
                                        eVar5.I = i62;
                                        int[] iArr4 = eVar5.J;
                                        if (iArr4 == null) {
                                            iArr4 = new int[i62];
                                        } else {
                                            if (iArr4.length < i62) {
                                                int length = iArr4.length;
                                                i17 = 2;
                                                iArr = new int[Math.max(length * 2, i62)];
                                            }
                                            eVar5.J = iArr;
                                            if (i61 == i17) {
                                                int i63 = (i60 - eVar5.L) - 4;
                                                int i64 = eVar5.I;
                                                Arrays.fill(iArr, 0, i64, i63 / i64);
                                            } else {
                                                i18 = 1;
                                                i19 = 0;
                                                if (i61 == 1) {
                                                    i30 = 0;
                                                    i31 = 0;
                                                    i32 = 4;
                                                    while (true) {
                                                        i33 = eVar5.I - i18;
                                                        if (i30 < i33) {
                                                            eVar5.J[i30] = i19;
                                                            while (true) {
                                                                i34 = i32 + 1;
                                                                eVar5.a(bVar, i34);
                                                                i35 = eVar5.f16750g.f17845a[i32] & 255;
                                                                int[] iArr5 = eVar5.J;
                                                                i36 = iArr5[i30] + i35;
                                                                iArr5[i30] = i36;
                                                                if (i35 != 255) {
                                                                    break;
                                                                }
                                                                i32 = i34;
                                                            }
                                                            i31 += i36;
                                                            i30++;
                                                            i32 = i34;
                                                            i18 = 1;
                                                            i19 = 0;
                                                        } else {
                                                            eVar5.J[i33] = ((i60 - eVar5.L) - i32) - i31;
                                                        }
                                                    }
                                                } else {
                                                    if (i61 == 3) {
                                                        throw new r(m.a("Unexpected lacing value: ", i61));
                                                    }
                                                    i20 = 0;
                                                    i21 = 0;
                                                    i22 = 4;
                                                    while (true) {
                                                        i23 = eVar5.I - 1;
                                                        if (i20 < i23) {
                                                            eVar5.J[i20] = 0;
                                                            i24 = i22 + 1;
                                                            eVar5.a(bVar, i24);
                                                            if (eVar5.f16750g.f17845a[i22] == 0) {
                                                                throw new r("No valid varint length mask found");
                                                            }
                                                            i25 = 0;
                                                            while (true) {
                                                                if (i25 < i46) {
                                                                    i26 = 1 << (7 - i25);
                                                                    if ((eVar5.f16750g.f17845a[i22] & i26) != 0) {
                                                                        i27 = i24 + i25;
                                                                        eVar5.a(bVar, i27);
                                                                        int i65 = eVar5.f16750g.f17845a[i22] & 255 & (~i26);
                                                                        i28 = i24;
                                                                        j13 = i65;
                                                                        while (true) {
                                                                            i29 = i28;
                                                                            if (i29 < i27) {
                                                                                i28 = i29 + 1;
                                                                                j13 = (j13 << 8) | ((long) (eVar5.f16750g.f17845a[i29] & 255));
                                                                            } else {
                                                                                if (i20 > 0) {
                                                                                    j13 -= (1 << ((i25 * 7) + 6)) - 1;
                                                                                }
                                                                                long j24 = j13;
                                                                                i22 = i27;
                                                                                j12 = j24;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i25++;
                                                                        i46 = 8;
                                                                    }
                                                                } else {
                                                                    i22 = i24;
                                                                    j12 = 0;
                                                                }
                                                            }
                                                            if (j12 < -2147483648L && j12 <= 2147483647L) {
                                                                int i66 = (int) j12;
                                                                int[] iArr6 = eVar5.J;
                                                                if (i20 != 0) {
                                                                    i66 += iArr6[i20 - 1];
                                                                }
                                                                iArr6[i20] = i66;
                                                                i21 += i66;
                                                                i20++;
                                                                i46 = 8;
                                                            } else {
                                                                throw new r("EBML lacing sample size out of range.");
                                                            }
                                                        } else {
                                                            eVar5.J[i23] = ((i60 - eVar5.L) - i22) - i21;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        iArr = iArr4;
                                        i17 = 2;
                                        eVar5.J = iArr;
                                        if (i61 == i17) {
                                            int i67 = (i60 - eVar5.L) - 4;
                                            int i68 = eVar5.I;
                                            Arrays.fill(iArr, 0, i68, i67 / i68);
                                        } else {
                                            i18 = 1;
                                            i19 = 0;
                                            if (i61 == 1) {
                                                i30 = 0;
                                                i31 = 0;
                                                i32 = 4;
                                                while (true) {
                                                    i33 = eVar5.I - i18;
                                                    if (i30 < i33) {
                                                        eVar5.J[i30] = i19;
                                                        while (true) {
                                                            i34 = i32 + 1;
                                                            eVar5.a(bVar, i34);
                                                            i35 = eVar5.f16750g.f17845a[i32] & 255;
                                                            int[] iArr7 = eVar5.J;
                                                            i36 = iArr7[i30] + i35;
                                                            iArr7[i30] = i36;
                                                            if (i35 != 255) {
                                                                break;
                                                            }
                                                            i32 = i34;
                                                        }
                                                        i31 += i36;
                                                        i30++;
                                                        i32 = i34;
                                                        i18 = 1;
                                                        i19 = 0;
                                                    } else {
                                                        eVar5.J[i33] = ((i60 - eVar5.L) - i32) - i31;
                                                    }
                                                }
                                            } else {
                                                if (i61 == 3) {
                                                    throw new r(m.a("Unexpected lacing value: ", i61));
                                                }
                                                i20 = 0;
                                                i21 = 0;
                                                i22 = 4;
                                                while (true) {
                                                    i23 = eVar5.I - 1;
                                                    if (i20 < i23) {
                                                        eVar5.J[i20] = 0;
                                                        i24 = i22 + 1;
                                                        eVar5.a(bVar, i24);
                                                        if (eVar5.f16750g.f17845a[i22] == 0) {
                                                            i25 = 0;
                                                            while (true) {
                                                                if (i25 < i46) {
                                                                    i26 = 1 << (7 - i25);
                                                                    if ((eVar5.f16750g.f17845a[i22] & i26) != 0) {
                                                                        i27 = i24 + i25;
                                                                        eVar5.a(bVar, i27);
                                                                        int i69 = eVar5.f16750g.f17845a[i22] & 255 & (~i26);
                                                                        i28 = i24;
                                                                        j13 = i69;
                                                                        while (true) {
                                                                            i29 = i28;
                                                                            if (i29 < i27) {
                                                                                i28 = i29 + 1;
                                                                                j13 = (j13 << 8) | ((long) (eVar5.f16750g.f17845a[i29] & 255));
                                                                            } else {
                                                                                if (i20 > 0) {
                                                                                    j13 -= (1 << ((i25 * 7) + 6)) - 1;
                                                                                }
                                                                                long j25 = j13;
                                                                                i22 = i27;
                                                                                j12 = j25;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i25++;
                                                                        i46 = 8;
                                                                    }
                                                                } else {
                                                                    i22 = i24;
                                                                    j12 = 0;
                                                                }
                                                            }
                                                            if (j12 < -2147483648L) {
                                                            }
                                                            throw new r("EBML lacing sample size out of range.");
                                                        }
                                                        throw new r("No valid varint length mask found");
                                                    }
                                                    eVar5.J[i23] = ((i60 - eVar5.L) - i22) - i21;
                                                    iArr6[i20] = i66;
                                                    i21 += i66;
                                                    i20++;
                                                    i46 = 8;
                                                }
                                            }
                                        }
                                    } else {
                                        throw new r("Lacing only supported in SimpleBlocks.");
                                    }
                                    byte[] bArr3 = eVar5.f16750g.f17845a;
                                    eVar5.F = eVar5.a((bArr3[1] & 255) | (bArr3[0] << 8)) + eVar5.A;
                                    byte b11 = eVar5.f16750g.f17845a[2];
                                    eVar5.M = ((dVar6.f16718c == 2 || (i59 == 163 && (b11 & 128) == 128)) ? 1 : 0) | ((b11 & 8) == 8 ? Integer.MIN_VALUE : 0);
                                    eVar5.E = 2;
                                    eVar5.H = 0;
                                    i16 = 163;
                                } else {
                                    i16 = 163;
                                }
                                if (i59 == i16) {
                                    while (true) {
                                        int i70 = eVar5.H;
                                        if (i70 < eVar5.I) {
                                            eVar5.a(bVar, dVar6, eVar5.J[i70]);
                                            eVar5.a(dVar6, eVar5.F + ((long) ((eVar5.H * dVar6.f16719d) / 1000)));
                                            eVar5.H++;
                                        } else {
                                            i10 = 0;
                                            eVar5.E = 0;
                                        }
                                    }
                                } else {
                                    i10 = 0;
                                    eVar5.a(bVar, dVar6, eVar5.J[0]);
                                }
                            }
                            bVar2.f16712e = i10;
                            i11 = i10;
                        } else if (i59 == 16981) {
                            i15 = 0;
                            byte[] bArr4 = new byte[i60];
                            eVar5.f16763t.f16721f = bArr4;
                            bVar.b(bArr4, 0, i60, false);
                        } else if (i59 == 18402) {
                            i15 = 0;
                            byte[] bArr5 = new byte[i60];
                            eVar5.f16763t.f16722g = bArr5;
                            bVar.b(bArr5, 0, i60, false);
                        } else if (i59 == 21419) {
                            i15 = 0;
                            Arrays.fill(eVar5.f16752i.f17845a, (byte) 0);
                            bVar.b(eVar5.f16752i.f17845a, 4 - i60, i60, false);
                            eVar5.f16752i.e(0);
                            eVar5.f16765v = (int) eVar5.f16752i.k();
                        } else if (i59 == 25506) {
                            i15 = 0;
                            byte[] bArr6 = new byte[i60];
                            eVar5.f16763t.f16723h = bArr6;
                            bVar.b(bArr6, 0, i60, false);
                        } else if (i59 == 30322) {
                            byte[] bArr7 = new byte[i60];
                            eVar5.f16763t.f16730o = bArr7;
                            i15 = 0;
                            bVar.b(bArr7, 0, i60, false);
                        } else {
                            eVar5.getClass();
                            throw new r(m.a("Unexpected id: ", i59));
                        }
                        i10 = i15;
                        bVar2.f16712e = i10;
                        i11 = i10;
                    } else if (i12 == 5) {
                        long j26 = bVar2.f16714g;
                        if (j26 != 4 && j26 != 8) {
                            throw new r("Invalid float size: " + bVar2.f16714g);
                        }
                        c cVar7 = bVar2.f16711d;
                        int i71 = bVar2.f16713f;
                        int i72 = (int) j26;
                        bVar.b(bVar2.f16708a, 0, i72, false);
                        long j27 = 0;
                        for (int i73 = 0; i73 < i72; i73++) {
                            j27 = (j27 << 8) | ((long) (bVar2.f16708a[i73] & 255));
                        }
                        if (i72 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) j27);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(j27);
                        }
                        e eVar6 = cVar7.f16715a;
                        if (i71 == 181) {
                            eVar6.f16763t.I = (int) dLongBitsToDouble;
                        } else if (i71 != 17545) {
                            switch (i71) {
                                case 21969:
                                    eVar6.f16763t.f16738w = (float) dLongBitsToDouble;
                                    break;
                                case 21970:
                                    eVar6.f16763t.f16739x = (float) dLongBitsToDouble;
                                    break;
                                case 21971:
                                    eVar6.f16763t.f16740y = (float) dLongBitsToDouble;
                                    break;
                                case 21972:
                                    eVar6.f16763t.f16741z = (float) dLongBitsToDouble;
                                    break;
                                case 21973:
                                    eVar6.f16763t.A = (float) dLongBitsToDouble;
                                    break;
                                case 21974:
                                    eVar6.f16763t.B = (float) dLongBitsToDouble;
                                    break;
                                case 21975:
                                    eVar6.f16763t.C = (float) dLongBitsToDouble;
                                    break;
                                case 21976:
                                    eVar6.f16763t.D = (float) dLongBitsToDouble;
                                    break;
                                case 21977:
                                    eVar6.f16763t.E = (float) dLongBitsToDouble;
                                    break;
                                case 21978:
                                    eVar6.f16763t.F = (float) dLongBitsToDouble;
                                    break;
                                default:
                                    eVar6.getClass();
                                    break;
                            }
                        } else {
                            eVar6.f16761r = (long) dLongBitsToDouble;
                        }
                        i11 = 0;
                        bVar2.f16712e = 0;
                    } else {
                        throw new r(m.a("Invalid element type ", i12));
                    }
                    z13 = true;
                    z11 = i11;
                    if (z13) {
                        j10 = bVar.f16452c;
                        if (this.f16767x) {
                            this.f16769z = j10;
                            oVar.f17021a = this.f16768y;
                            this.f16767x = z11;
                            return 1;
                        }
                        if (this.f16764u) {
                            j11 = this.f16769z;
                            if (j11 != -1) {
                                oVar.f17021a = j11;
                                this.f16769z = -1L;
                                return 1;
                            }
                        } else {
                            continue;
                        }
                    }
                    i39 = 0;
                } else {
                    bVar.a((int) bVar2.f16714g);
                    bVar2.f16712e = 0;
                    i39 = 0;
                }
            }
        }
        int i74 = i39;
        if (z13) {
            return i74;
        }
        return -1;
    }

    public final void a(d dVar, long j10) {
        byte[] bArrB;
        if ("S_TEXT/UTF8".equals(dVar.f16716a)) {
            byte[] bArr = this.f16754k.f17845a;
            long j11 = this.G;
            if (j11 == -9223372036854775807L) {
                bArrB = f16742a0;
            } else {
                int i10 = (int) (j11 / 3600000000L);
                long j12 = j11 - (((long) i10) * 3600000000L);
                int i11 = (int) (j12 / 60000000);
                long j13 = j12 - ((long) (60000000 * i11));
                int i12 = (int) (j13 / 1000000);
                bArrB = z.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - ((long) (1000000 * i12))) / 1000))));
            }
            System.arraycopy(bArrB, 0, bArr, 19, 12);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
            n nVar = this.f16754k;
            rVar.a(nVar.f17847c, nVar);
            this.V += this.f16754k.f17847c;
        }
        dVar.O.a(j10, this.M, this.V, 0, dVar.f16722g);
        this.W = true;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar2 = this.f16753j;
        nVar2.f17846b = 0;
        nVar2.f17847c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i10) throws InterruptedException, EOFException {
        n nVar = this.f16750g;
        if (nVar.f17847c >= i10) {
            return;
        }
        if (nVar.a() < i10) {
            n nVar2 = this.f16750g;
            byte[] bArr = nVar2.f17845a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10));
            int i11 = this.f16750g.f17847c;
            nVar2.f17845a = bArrCopyOf;
            nVar2.f17847c = i11;
            nVar2.f17846b = 0;
        }
        n nVar3 = this.f16750g;
        byte[] bArr2 = nVar3.f17845a;
        int i12 = nVar3.f17847c;
        bVar.b(bArr2, i12, i10 - i12, false);
        this.f16750g.d(i10);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, d dVar, int i10) throws InterruptedException, r, EOFException {
        int iA;
        int iA2;
        int i11;
        if ("S_TEXT/UTF8".equals(dVar.f16716a)) {
            byte[] bArr = Z;
            int i12 = i10 + 32;
            if (this.f16754k.a() < i12) {
                this.f16754k.f17845a = Arrays.copyOf(bArr, i12 + i10);
            }
            bVar.b(this.f16754k.f17845a, 32, i10, false);
            this.f16754k.e(0);
            this.f16754k.d(i12);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
        if (!this.O) {
            if (dVar.f16720e) {
                this.M &= -1073741825;
                if (!this.P) {
                    bVar.b(this.f16750g.f17845a, 0, 1, false);
                    this.N++;
                    byte b10 = this.f16750g.f17845a[0];
                    if ((b10 & 128) != 128) {
                        this.S = b10;
                        this.P = true;
                    } else {
                        throw new r("Extension bit is set in signal byte");
                    }
                }
                byte b11 = this.S;
                if ((b11 & 1) == 1) {
                    boolean z10 = (b11 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        bVar.b(this.f16755l.f17845a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        n nVar = this.f16750g;
                        nVar.f17845a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.f16750g);
                        this.V++;
                        this.f16755l.e(0);
                        rVar.a(8, this.f16755l);
                        this.V += 8;
                    }
                    if (z10) {
                        if (!this.R) {
                            bVar.b(this.f16750g.f17845a, 0, 1, false);
                            this.N++;
                            this.f16750g.e(0);
                            this.T = this.f16750g.j();
                            this.R = true;
                        }
                        int i13 = this.T * 4;
                        this.f16750g.c(i13);
                        bVar.b(this.f16750g.f17845a, 0, i13, false);
                        this.N += i13;
                        short s10 = (short) ((this.T / 2) + 1);
                        int i14 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f16757n;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f16757n = ByteBuffer.allocate(i14);
                        }
                        this.f16757n.position(0);
                        this.f16757n.putShort(s10);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i11 = this.T;
                            if (i15 >= i11) {
                                break;
                            }
                            int iM = this.f16750g.m();
                            if (i15 % 2 == 0) {
                                this.f16757n.putShort((short) (iM - i16));
                            } else {
                                this.f16757n.putInt(iM - i16);
                            }
                            i15++;
                            i16 = iM;
                        }
                        int i17 = (i10 - this.N) - i16;
                        if (i11 % 2 == 1) {
                            this.f16757n.putInt(i17);
                        } else {
                            this.f16757n.putShort((short) i17);
                            this.f16757n.putInt(0);
                        }
                        n nVar2 = this.f16756m;
                        nVar2.f17845a = this.f16757n.array();
                        nVar2.f17847c = i14;
                        nVar2.f17846b = 0;
                        rVar.a(i14, this.f16756m);
                        this.V += i14;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f16721f;
                if (bArr2 != null) {
                    n nVar3 = this.f16753j;
                    int length = bArr2.length;
                    nVar3.f17845a = bArr2;
                    nVar3.f17847c = length;
                    nVar3.f17846b = 0;
                }
            }
            this.O = true;
        }
        int i18 = i10 + this.f16753j.f17847c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f16716a) && !"V_MPEGH/ISO/HEVC".equals(dVar.f16716a)) {
            while (true) {
                int i19 = this.N;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                n nVar4 = this.f16753j;
                int i21 = nVar4.f17847c - nVar4.f17846b;
                if (i21 > 0) {
                    iA2 = Math.min(i20, i21);
                    rVar.a(iA2, this.f16753j);
                } else {
                    iA2 = rVar.a(bVar, i20, false);
                }
                this.N += iA2;
                this.V += iA2;
            }
        } else {
            byte[] bArr3 = this.f16749f.f17845a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i22 = dVar.P;
            int i23 = 4 - i22;
            while (this.N < i18) {
                int i24 = this.U;
                if (i24 == 0) {
                    n nVar5 = this.f16753j;
                    int iMin = Math.min(i22, nVar5.f17847c - nVar5.f17846b);
                    bVar.b(bArr3, i23 + iMin, i22 - iMin, false);
                    if (iMin > 0) {
                        this.f16753j.a(bArr3, i23, iMin);
                    }
                    this.N += i22;
                    this.f16749f.e(0);
                    this.U = this.f16749f.m();
                    this.f16748e.e(0);
                    rVar.a(4, this.f16748e);
                    this.V += 4;
                } else {
                    n nVar6 = this.f16753j;
                    int i25 = nVar6.f17847c - nVar6.f17846b;
                    if (i25 > 0) {
                        iA = Math.min(i24, i25);
                        rVar.a(iA, this.f16753j);
                    } else {
                        iA = rVar.a(bVar, i24, false);
                    }
                    this.N += iA;
                    this.V += iA;
                    this.U = i24 - iA;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f16716a)) {
            this.f16751h.e(0);
            rVar.a(4, this.f16751h);
            this.V += 4;
        }
    }

    public final long a(long j10) throws r {
        long j11 = this.f16760q;
        if (j11 != -9223372036854775807L) {
            return z.a(j10, j11, 1000L);
        }
        throw new r("Can't scale timecode prior to timecodeScale being set.");
    }
}
