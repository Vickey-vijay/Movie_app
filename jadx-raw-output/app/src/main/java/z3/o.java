package z3;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: H264Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f86095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86097c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f86101g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f86103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q3.u f86104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f86105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f86106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f86107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f86108n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f86102h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f86098d = new t(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f86099e = new t(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f86100f = new t(6, 128);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g5.t f86109o = new g5.t();

    /* JADX INFO: compiled from: H264Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q3.u f86110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<g5.q.b> f86113d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<g5.q.a> f86114e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final g5.u f86115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f86116g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f86117h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f86118i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f86119j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f86120k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f86121l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a f86122m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a f86123n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f86124o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f86125p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f86126q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f86127r;

        /* JADX INFO: compiled from: H264Reader.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f86128a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f86129b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public g5.q.b f86130c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f86131d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f86132e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f86133f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f86134g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f86135h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f86136i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f86137j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f86138k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f86139l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f86140m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f86141n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f86142o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f86143p;

            public a() {
            }

            public void b() {
                this.f86129b = false;
                this.f86128a = false;
            }

            public final boolean c(a aVar) {
                boolean z10;
                boolean z11;
                if (this.f86128a) {
                    if (!aVar.f86128a || this.f86133f != aVar.f86133f || this.f86134g != aVar.f86134g || this.f86135h != aVar.f86135h) {
                        return true;
                    }
                    if (this.f86136i && aVar.f86136i && this.f86137j != aVar.f86137j) {
                        return true;
                    }
                    int i10 = this.f86131d;
                    int i11 = aVar.f86131d;
                    if (i10 != i11 && (i10 == 0 || i11 == 0)) {
                        return true;
                    }
                    int i12 = this.f86130c.f53147k;
                    if (i12 == 0 && aVar.f86130c.f53147k == 0 && (this.f86140m != aVar.f86140m || this.f86141n != aVar.f86141n)) {
                        return true;
                    }
                    if ((i12 == 1 && aVar.f86130c.f53147k == 1 && (this.f86142o != aVar.f86142o || this.f86143p != aVar.f86143p)) || (z10 = this.f86138k) != (z11 = aVar.f86138k)) {
                        return true;
                    }
                    if (z10 && z11 && this.f86139l != aVar.f86139l) {
                        return true;
                    }
                }
                return false;
            }

            public boolean d() {
                int i10;
                return this.f86129b && ((i10 = this.f86132e) == 7 || i10 == 2);
            }

            public void e(g5.q.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f86130c = bVar;
                this.f86131d = i10;
                this.f86132e = i11;
                this.f86133f = i12;
                this.f86134g = i13;
                this.f86135h = z10;
                this.f86136i = z11;
                this.f86137j = z12;
                this.f86138k = z13;
                this.f86139l = i14;
                this.f86140m = i15;
                this.f86141n = i16;
                this.f86142o = i17;
                this.f86143p = i18;
                this.f86128a = true;
                this.f86129b = true;
            }

            public void f(int i10) {
                this.f86132e = i10;
                this.f86129b = true;
            }
        }

        public void g() {
            this.f86120k = false;
            this.f86124o = false;
            this.f86123n.b();
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:54:0x0102  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106  */
        /* JADX WARN: Code duplicated, block: B:58:0x010e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x010f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0118  */
        /* JADX WARN: Code duplicated, block: B:63:0x011e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0128 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0129  */
        /* JADX WARN: Code duplicated, block: B:74:0x0152  */
        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean zD;
            boolean z12;
            int iH;
            int i12;
            int i13;
            int iG;
            int i14;
            int iG2;
            int iE;
            if (this.f86120k) {
                int i15 = i11 - i10;
                byte[] bArr2 = this.f86116g;
                int length = bArr2.length;
                int i16 = this.f86117h;
                if (length < i16 + i15) {
                    this.f86116g = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                }
                System.arraycopy(bArr, i10, this.f86116g, this.f86117h, i15);
                int i17 = this.f86117h + i15;
                this.f86117h = i17;
                this.f86115f.i(this.f86116g, 0, i17);
                if (this.f86115f.b(8)) {
                    this.f86115f.k();
                    int iE2 = this.f86115f.e(2);
                    this.f86115f.l(5);
                    if (this.f86115f.c()) {
                        this.f86115f.h();
                        if (this.f86115f.c()) {
                            int iH2 = this.f86115f.h();
                            if (!this.f86112c) {
                                this.f86120k = false;
                                this.f86123n.f(iH2);
                                return;
                            }
                            if (this.f86115f.c()) {
                                int iH3 = this.f86115f.h();
                                if (this.f86114e.indexOfKey(iH3) < 0) {
                                    this.f86120k = false;
                                    return;
                                }
                                g5.q.a aVar = this.f86114e.get(iH3);
                                g5.q.b bVar = this.f86113d.get(aVar.f53135b);
                                if (bVar.f53144h) {
                                    if (!this.f86115f.b(2)) {
                                        return;
                                    } else {
                                        this.f86115f.l(2);
                                    }
                                }
                                if (this.f86115f.b(bVar.f53146j)) {
                                    int iE3 = this.f86115f.e(bVar.f53146j);
                                    if (!bVar.f53145i) {
                                        if (this.f86115f.b(1)) {
                                            boolean zD2 = this.f86115f.d();
                                            if (!zD2) {
                                                z10 = zD2;
                                                z11 = false;
                                            } else {
                                                if (!this.f86115f.b(1)) {
                                                    return;
                                                }
                                                z10 = zD2;
                                                z11 = true;
                                                zD = this.f86115f.d();
                                            }
                                            if (this.f86118i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                iH = 0;
                                            } else if (!this.f86115f.c()) {
                                                return;
                                            } else {
                                                iH = this.f86115f.h();
                                            }
                                            i12 = bVar.f53147k;
                                            if (i12 != 0) {
                                                if (this.f86115f.b(bVar.f53148l)) {
                                                    iE = this.f86115f.e(bVar.f53148l);
                                                    if (aVar.f53136c || z10) {
                                                        i13 = iE;
                                                        iG = 0;
                                                    } else {
                                                        if (!this.f86115f.c()) {
                                                            return;
                                                        }
                                                        iG = this.f86115f.g();
                                                        i13 = iE;
                                                        i14 = 0;
                                                    }
                                                    iG2 = i14;
                                                    this.f86123n.e(bVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                                    this.f86120k = false;
                                                }
                                                return;
                                            }
                                            if (i12 == 1 || bVar.f53149m) {
                                                i13 = 0;
                                                iG = 0;
                                            } else {
                                                if (!this.f86115f.c()) {
                                                    return;
                                                }
                                                int iG3 = this.f86115f.g();
                                                if (!aVar.f53136c || z10) {
                                                    i14 = iG3;
                                                    i13 = 0;
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!this.f86115f.c()) {
                                                        return;
                                                    }
                                                    iG2 = this.f86115f.g();
                                                    i14 = iG3;
                                                    i13 = 0;
                                                    iG = 0;
                                                }
                                            }
                                            this.f86123n.e(bVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                            this.f86120k = false;
                                            i14 = iG;
                                            iG2 = i14;
                                            this.f86123n.e(bVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                            this.f86120k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zD = z11;
                                    if (this.f86118i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        iH = 0;
                                    } else if (!this.f86115f.c()) {
                                        return;
                                    } else {
                                        iH = this.f86115f.h();
                                    }
                                    i12 = bVar.f53147k;
                                    if (i12 != 0) {
                                        if (i12 == 1) {
                                        }
                                        i13 = 0;
                                        iG = 0;
                                    } else {
                                        if (this.f86115f.b(bVar.f53148l)) {
                                            return;
                                        }
                                        iE = this.f86115f.e(bVar.f53148l);
                                        if (aVar.f53136c) {
                                        }
                                        i13 = iE;
                                        iG = 0;
                                    }
                                    i14 = iG;
                                    iG2 = i14;
                                    this.f86123n.e(bVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                    this.f86120k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f86118i == 9 || (this.f86112c && this.f86123n.c(this.f86122m))) {
                if (z10 && this.f86124o) {
                    d(i10 + ((int) (j10 - this.f86119j)));
                }
                this.f86125p = this.f86119j;
                this.f86126q = this.f86121l;
                this.f86127r = false;
                this.f86124o = true;
            }
            if (this.f86111b) {
                z11 = this.f86123n.d();
            }
            boolean z13 = this.f86127r;
            int i11 = this.f86118i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f86127r = z14;
            return z14;
        }

        public boolean c() {
            return this.f86112c;
        }

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
        public final void d(int i10) {
            boolean z10 = this.f86127r;
            this.f86110a.d(this.f86126q, z10 ? 1 : 0, (int) (this.f86119j - this.f86125p), i10, null);
        }

        public void e(g5.q.a aVar) {
            this.f86114e.append(aVar.f53134a, aVar);
        }

        public void f(g5.q.b bVar) {
            this.f86113d.append(bVar.f53140d, bVar);
        }

        public void h(long j10, int i10, long j11) {
            this.f86118i = i10;
            this.f86121l = j11;
            this.f86119j = j10;
            if (!this.f86111b || i10 != 1) {
                if (!this.f86112c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f86122m;
            this.f86122m = this.f86123n;
            this.f86123n = aVar;
            aVar.b();
            this.f86117h = 0;
            this.f86120k = true;
        }

        public b(q3.u uVar, boolean z10, boolean z11) {
            this.f86110a = uVar;
            this.f86111b = z10;
            this.f86112c = z11;
            this.f86122m = new a();
            this.f86123n = new a();
            byte[] bArr = new byte[128];
            this.f86116g = bArr;
            this.f86115f = new g5.u(bArr, 0, 0);
            g();
        }
    }

    @Override // z3.m
    public void packetFinished() {
    }

    public final void a(long j10, int i10, int i11, long j11) {
        if (!this.f86106l || this.f86105k.c()) {
            this.f86098d.b(i11);
            this.f86099e.b(i11);
            if (this.f86106l) {
                if (this.f86098d.c()) {
                    t tVar = this.f86098d;
                    this.f86105k.f(g5.q.i(tVar.f86212d, 3, tVar.f86213e));
                    this.f86098d.d();
                } else if (this.f86099e.c()) {
                    t tVar2 = this.f86099e;
                    this.f86105k.e(g5.q.h(tVar2.f86212d, 3, tVar2.f86213e));
                    this.f86099e.d();
                }
            } else if (this.f86098d.c() && this.f86099e.c()) {
                ArrayList arrayList = new ArrayList();
                t tVar3 = this.f86098d;
                arrayList.add(Arrays.copyOf(tVar3.f86212d, tVar3.f86213e));
                t tVar4 = this.f86099e;
                arrayList.add(Arrays.copyOf(tVar4.f86212d, tVar4.f86213e));
                t tVar5 = this.f86098d;
                g5.q.b bVarI = g5.q.i(tVar5.f86212d, 3, tVar5.f86213e);
                t tVar6 = this.f86099e;
                g5.q.a aVarH = g5.q.h(tVar6.f86212d, 3, tVar6.f86213e);
                this.f86104j.a(Format.B(this.f86103i, "video/avc", g5.d.c(bVarI.f53137a, bVarI.f53138b, bVarI.f53139c), -1, -1, bVarI.f53141e, bVarI.f53142f, -1.0f, arrayList, -1, bVarI.f53143g, null));
                this.f86106l = true;
                this.f86105k.f(bVarI);
                this.f86105k.e(aVarH);
                this.f86098d.d();
                this.f86099e.d();
            }
        }
        if (this.f86100f.b(i11)) {
            t tVar7 = this.f86100f;
            this.f86109o.J(this.f86100f.f86212d, g5.q.k(tVar7.f86212d, tVar7.f86213e));
            this.f86109o.L(4);
            this.f86095a.a(j11, this.f86109o);
        }
        if (this.f86105k.b(j10, i10, this.f86106l, this.f86108n)) {
            this.f86108n = false;
        }
    }

    public final void d(byte[] bArr, int i10, int i11) {
        if (!this.f86106l || this.f86105k.c()) {
            this.f86098d.a(bArr, i10, i11);
            this.f86099e.a(bArr, i10, i11);
        }
        this.f86100f.a(bArr, i10, i11);
        this.f86105k.a(bArr, i10, i11);
    }

    public final void e(long j10, int i10, long j11) {
        if (!this.f86106l || this.f86105k.c()) {
            this.f86098d.e(i10);
            this.f86099e.e(i10);
        }
        this.f86100f.e(i10);
        this.f86105k.h(j10, i10, j11);
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f86107m = j10;
        this.f86108n |= (i10 & 2) != 0;
    }

    @Override // z3.m
    public void seek() {
        g5.q.a(this.f86102h);
        this.f86098d.d();
        this.f86099e.d();
        this.f86100f.d();
        this.f86105k.g();
        this.f86101g = 0L;
        this.f86108n = false;
    }

    public o(b0 b0Var, boolean z10, boolean z11) {
        this.f86095a = b0Var;
        this.f86096b = z10;
        this.f86097c = z11;
    }

    @Override // z3.m
    public void b(g5.t tVar) {
        int i10;
        int iC = tVar.c();
        int iD = tVar.d();
        byte[] bArr = tVar.f53154a;
        this.f86101g += (long) tVar.a();
        this.f86104j.c(tVar, tVar.a());
        while (true) {
            int iC2 = g5.q.c(bArr, iC, iD, this.f86102h);
            if (iC2 == iD) {
                d(bArr, iC, iD);
                return;
            }
            int iF = g5.q.f(bArr, iC2);
            int i11 = iC2 - iC;
            if (i11 > 0) {
                d(bArr, iC, iC2);
            }
            int i12 = iD - iC2;
            long j10 = this.f86101g - ((long) i12);
            if (i11 < 0) {
                i10 = -i11;
            } else {
                i10 = 0;
            }
            a(j10, i12, i10, this.f86107m);
            e(j10, iF, this.f86107m);
            iC = iC2 + 3;
        }
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f86103i = dVar.b();
        q3.u uVarTrack = iVar.track(dVar.c(), 2);
        this.f86104j = uVarTrack;
        this.f86105k = new b(uVarTrack, this.f86096b, this.f86097c);
        this.f86095a.b(iVar, dVar);
    }
}
