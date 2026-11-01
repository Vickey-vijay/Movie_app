package z3;

import com.google.android.exoplayer2.Format;
import java.util.Collections;

/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f86144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f86145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q3.u f86146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f86147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86148e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f86155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f86156m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f86149f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f86150g = new t(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f86151h = new t(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f86152i = new t(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f86153j = new t(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f86154k = new t(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g5.t f86157n = new g5.t();

    /* JADX INFO: compiled from: H265Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q3.u f86158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f86159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f86161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f86162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f86163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f86164g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f86165h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f86166i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f86167j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f86168k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f86169l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f86170m;

        public static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        public static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        public void f() {
            this.f86163f = false;
            this.f86164g = false;
            this.f86165h = false;
            this.f86166i = false;
            this.f86167j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f86164g = false;
            this.f86165h = false;
            this.f86162e = j11;
            this.f86161d = 0;
            this.f86159b = j10;
            if (!c(i11)) {
                if (this.f86166i && !this.f86167j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f86166i = false;
                }
                if (b(i11)) {
                    this.f86165h = !this.f86167j;
                    this.f86167j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f86160c = z11;
            this.f86163f = z11 || i11 <= 9;
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f86167j && this.f86164g) {
                this.f86170m = this.f86160c;
                this.f86167j = false;
            } else if (this.f86165h || this.f86164g) {
                if (z10 && this.f86166i) {
                    d(i10 + ((int) (j10 - this.f86159b)));
                }
                this.f86168k = this.f86159b;
                this.f86169l = this.f86162e;
                this.f86170m = this.f86160c;
                this.f86166i = true;
            }
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
            boolean z10 = this.f86170m;
            this.f86158a.d(this.f86169l, z10 ? 1 : 0, (int) (this.f86159b - this.f86168k), i10, null);
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f86163f) {
                int i12 = this.f86161d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f86161d = i12 + (i11 - i10);
                } else {
                    this.f86164g = (bArr[i13] & 128) != 0;
                    this.f86163f = false;
                }
            }
        }

        public a(q3.u uVar) {
            this.f86158a = uVar;
        }
    }

    public static void f(g5.u uVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (uVar.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        uVar.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        uVar.g();
                    }
                } else {
                    uVar.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    @Override // z3.m
    public void packetFinished() {
    }

    public static Format e(String str, t tVar, t tVar2, t tVar3) {
        float f10;
        int i10 = tVar.f86213e;
        byte[] bArr = new byte[tVar2.f86213e + i10 + tVar3.f86213e];
        System.arraycopy(tVar.f86212d, 0, bArr, 0, i10);
        System.arraycopy(tVar2.f86212d, 0, bArr, tVar.f86213e, tVar2.f86213e);
        System.arraycopy(tVar3.f86212d, 0, bArr, tVar.f86213e + tVar2.f86213e, tVar3.f86213e);
        g5.u uVar = new g5.u(tVar2.f86212d, 0, tVar2.f86213e);
        uVar.l(44);
        int iE = uVar.e(3);
        uVar.k();
        uVar.l(88);
        uVar.l(8);
        int i11 = 0;
        for (int i12 = 0; i12 < iE; i12++) {
            if (uVar.d()) {
                i11 += 89;
            }
            if (uVar.d()) {
                i11 += 8;
            }
        }
        uVar.l(i11);
        if (iE > 0) {
            uVar.l((8 - iE) * 2);
        }
        uVar.h();
        int iH = uVar.h();
        if (iH == 3) {
            uVar.k();
        }
        int iH2 = uVar.h();
        int iH3 = uVar.h();
        if (uVar.d()) {
            int iH4 = uVar.h();
            int iH5 = uVar.h();
            int iH6 = uVar.h();
            int iH7 = uVar.h();
            iH2 -= ((iH == 1 || iH == 2) ? 2 : 1) * (iH4 + iH5);
            iH3 -= (iH == 1 ? 2 : 1) * (iH6 + iH7);
        }
        int i13 = iH2;
        int i14 = iH3;
        uVar.h();
        uVar.h();
        int iH8 = uVar.h();
        for (int i15 = uVar.d() ? 0 : iE; i15 <= iE; i15++) {
            uVar.h();
            uVar.h();
            uVar.h();
        }
        uVar.h();
        uVar.h();
        uVar.h();
        uVar.h();
        uVar.h();
        uVar.h();
        if (uVar.d() && uVar.d()) {
            f(uVar);
        }
        uVar.l(2);
        if (uVar.d()) {
            uVar.l(8);
            uVar.h();
            uVar.h();
            uVar.k();
        }
        g(uVar);
        if (uVar.d()) {
            for (int i16 = 0; i16 < uVar.h(); i16++) {
                uVar.l(iH8 + 4 + 1);
            }
        }
        uVar.l(2);
        float f11 = 1.0f;
        if (uVar.d() && uVar.d()) {
            int iE2 = uVar.e(8);
            if (iE2 == 255) {
                int iE3 = uVar.e(16);
                int iE4 = uVar.e(16);
                if (iE3 != 0 && iE4 != 0) {
                    f11 = iE3 / iE4;
                }
            } else {
                float[] fArr = g5.q.f53131b;
                if (iE2 < fArr.length) {
                    f10 = fArr[iE2];
                } else {
                    g5.m.h("H265Reader", "Unexpected aspect_ratio_idc value: " + iE2);
                }
            }
            f10 = f11;
        } else {
            f10 = f11;
        }
        return Format.B(str, "video/hevc", null, -1, -1, i13, i14, -1.0f, Collections.singletonList(bArr), -1, f10, null);
    }

    public final void a(long j10, int i10, int i11, long j11) {
        this.f86147d.a(j10, i10, this.f86148e);
        if (!this.f86148e) {
            this.f86150g.b(i11);
            this.f86151h.b(i11);
            this.f86152i.b(i11);
            if (this.f86150g.c() && this.f86151h.c() && this.f86152i.c()) {
                this.f86146c.a(e(this.f86145b, this.f86150g, this.f86151h, this.f86152i));
                this.f86148e = true;
            }
        }
        if (this.f86153j.b(i11)) {
            t tVar = this.f86153j;
            this.f86157n.J(this.f86153j.f86212d, g5.q.k(tVar.f86212d, tVar.f86213e));
            this.f86157n.M(5);
            this.f86144a.a(j11, this.f86157n);
        }
        if (this.f86154k.b(i11)) {
            t tVar2 = this.f86154k;
            this.f86157n.J(this.f86154k.f86212d, g5.q.k(tVar2.f86212d, tVar2.f86213e));
            this.f86157n.M(5);
            this.f86144a.a(j11, this.f86157n);
        }
    }

    @Override // z3.m
    public void b(g5.t tVar) {
        while (tVar.a() > 0) {
            int iC = tVar.c();
            int iD = tVar.d();
            byte[] bArr = tVar.f53154a;
            this.f86155l += (long) tVar.a();
            this.f86146c.c(tVar, tVar.a());
            while (iC < iD) {
                int iC2 = g5.q.c(bArr, iC, iD, this.f86149f);
                if (iC2 == iD) {
                    d(bArr, iC, iD);
                    return;
                }
                int iE = g5.q.e(bArr, iC2);
                int i10 = iC2 - iC;
                if (i10 > 0) {
                    d(bArr, iC, iC2);
                }
                int i11 = iD - iC2;
                long j10 = this.f86155l - ((long) i11);
                a(j10, i11, i10 < 0 ? -i10 : 0, this.f86156m);
                h(j10, i11, iE, this.f86156m);
                iC = iC2 + 3;
            }
        }
    }

    public final void d(byte[] bArr, int i10, int i11) {
        this.f86147d.e(bArr, i10, i11);
        if (!this.f86148e) {
            this.f86150g.a(bArr, i10, i11);
            this.f86151h.a(bArr, i10, i11);
            this.f86152i.a(bArr, i10, i11);
        }
        this.f86153j.a(bArr, i10, i11);
        this.f86154k.a(bArr, i10, i11);
    }

    public final void h(long j10, int i10, int i11, long j11) {
        this.f86147d.g(j10, i10, i11, j11, this.f86148e);
        if (!this.f86148e) {
            this.f86150g.e(i11);
            this.f86151h.e(i11);
            this.f86152i.e(i11);
        }
        this.f86153j.e(i11);
        this.f86154k.e(i11);
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f86156m = j10;
    }

    @Override // z3.m
    public void seek() {
        g5.q.a(this.f86149f);
        this.f86150g.d();
        this.f86151h.d();
        this.f86152i.d();
        this.f86153j.d();
        this.f86154k.d();
        this.f86147d.f();
        this.f86155l = 0L;
    }

    public p(b0 b0Var) {
        this.f86144a = b0Var;
    }

    public static void g(g5.u uVar) {
        int iH = uVar.h();
        boolean zD = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            if (i11 != 0) {
                zD = uVar.d();
            }
            if (zD) {
                uVar.k();
                uVar.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (uVar.d()) {
                        uVar.k();
                    }
                }
            } else {
                int iH2 = uVar.h();
                int iH3 = uVar.h();
                int i13 = iH2 + iH3;
                for (int i14 = 0; i14 < iH2; i14++) {
                    uVar.h();
                    uVar.k();
                }
                for (int i15 = 0; i15 < iH3; i15++) {
                    uVar.h();
                    uVar.k();
                }
                i10 = i13;
            }
        }
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f86145b = dVar.b();
        q3.u uVarTrack = iVar.track(dVar.c(), 2);
        this.f86146c = uVarTrack;
        this.f86147d = new a(uVarTrack);
        this.f86144a.b(iVar, dVar);
    }
}
