package yads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ek2 implements pm1, pq0, yf1, cg1, ls2 {
    public static final Map N;
    public static final mx0 O;
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f77104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p30 f77105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sk0 f77106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ae0 f77107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn1 f77108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ok0 f77109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ak2 f77110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qe f77111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f77112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f77113k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cr f77115m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public om1 f77120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p21 f77121s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f77124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f77125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f77126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dk2 f77127y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public vw2 f77128z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fg1 f77114l = new fg1("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vy f77116n = new vy();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f77117o = new Runnable() { // from class: cp.m1
        @Override // java.lang.Runnable
        public final void run() {
            this.f51444b.g();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f77118p = new Runnable() { // from class: cp.n1
        @Override // java.lang.Runnable
        public final void run() {
            this.f51463b.e();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f77119q = ib3.a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ck2[] f77123u = new ck2[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ms2[] f77122t = new ms2[0];
    public long I = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public int C = 1;

    @Override // yads.pq0
    public final void a() {
        this.f77124v = true;
        this.f77119q.post(this.f77117o);
    }

    public final void b(vw2 vw2Var) {
        this.f77128z = this.f77121s == null ? vw2Var : new uw2(-9223372036854775807L, 0L);
        this.A = vw2Var.c();
        boolean z10 = !this.G && vw2Var.c() == -9223372036854775807L;
        this.B = z10;
        this.C = z10 ? 7 : 1;
        ak2 ak2Var = this.f77110h;
        long j10 = this.A;
        boolean zB = vw2Var.b();
        boolean z11 = this.B;
        hk2 hk2Var = (hk2) ak2Var;
        if (j10 == -9223372036854775807L) {
            j10 = hk2Var.f78267p;
        }
        if (hk2Var.f78266o || hk2Var.f78267p != j10 || hk2Var.f78268q != zB || hk2Var.f78269r != z11) {
            hk2Var.f78267p = j10;
            hk2Var.f78268q = zB;
            hk2Var.f78269r = z11;
            hk2Var.f78266o = false;
            long j11 = hk2Var.f78267p;
            pz2 pz2Var = new pz2(j11, j11, hk2Var.f78268q, hk2Var.f78269r, hk2Var.f78259h);
            s63 fk2Var = pz2Var;
            if (hk2Var.f78266o) {
                fk2Var = new fk2(pz2Var);
            }
            hk2Var.a(fk2Var);
        }
        if (this.f77125w) {
            return;
        }
        g();
    }

    public final /* synthetic */ void f() {
        this.G = true;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(map);
        lx0 lx0Var = new lx0();
        lx0Var.f79957a = "icy";
        lx0Var.f79967k = "application/x-icy";
        O = new mx0(lx0Var);
    }

    public final void c() {
        if (!this.f77125w) {
            throw new IllegalStateException();
        }
        this.f77127y.getClass();
        this.f77128z.getClass();
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        if (this.L || this.f77114l.f77392c != null || this.J) {
            return false;
        }
        if (this.f77125w && this.F == 0) {
            return false;
        }
        boolean zD = this.f77116n.d();
        if (this.f77114l.b()) {
            return zD;
        }
        i();
        return true;
    }

    public final int d() {
        int i10 = 0;
        for (ms2 ms2Var : this.f77122t) {
            i10 += ms2Var.f80366q + ms2Var.f80365p;
        }
        return i10;
    }

    public final void e() {
        if (this.M) {
            return;
        }
        om1 om1Var = this.f77120r;
        om1Var.getClass();
        om1Var.a((rx2) this);
    }

    public final void g() {
        if (this.M || this.f77125w || !this.f77124v || this.f77128z == null) {
            return;
        }
        for (ms2 ms2Var : this.f77122t) {
            if (ms2Var.c() == null) {
                return;
            }
        }
        vy vyVar = this.f77116n;
        synchronized (vyVar) {
            vyVar.f84041a = false;
        }
        int length = this.f77122t.length;
        h73[] h73VarArr = new h73[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            mx0 mx0VarC = this.f77122t[i10].c();
            mx0VarC.getClass();
            String str = mx0VarC.f80429m;
            boolean zEquals = "audio".equals(ht1.c(str));
            boolean z10 = zEquals || "video".equals(ht1.c(str));
            zArr[i10] = z10;
            this.f77126x = z10 | this.f77126x;
            p21 p21Var = this.f77121s;
            if (p21Var != null) {
                if (zEquals || this.f77123u[i10].f76304b) {
                    ts1 ts1Var = mx0VarC.f80427k;
                    ts1 ts1Var2 = ts1Var == null ? new ts1(p21Var) : new ts1((ss1[]) ib3.a((Object[]) ts1Var.f83163b, (Object[]) new ss1[]{p21Var}));
                    lx0 lx0Var = new lx0(mx0VarC);
                    lx0Var.f79965i = ts1Var2;
                    mx0VarC = new mx0(lx0Var);
                }
                if (zEquals && mx0VarC.f80423g == -1 && mx0VarC.f80424h == -1 && p21Var.f81206b != -1) {
                    lx0 lx0Var2 = new lx0(mx0VarC);
                    lx0Var2.f79962f = p21Var.f81206b;
                    mx0VarC = new mx0(lx0Var2);
                }
            }
            int iA = this.f77106d.a(mx0VarC);
            lx0 lx0Var3 = new lx0(mx0VarC);
            lx0Var3.D = iA;
            h73VarArr[i10] = new h73(Integer.toString(i10), new mx0(lx0Var3));
        }
        this.f77127y = new dk2(new i73(h73VarArr), zArr);
        this.f77125w = true;
        om1 om1Var = this.f77120r;
        om1Var.getClass();
        om1Var.a((pm1) this);
    }

    public final void h() {
        this.f77119q.post(new Runnable() { // from class: cp.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f51420b.f();
            }
        });
    }

    public final void i() {
        zj2 zj2Var = new zj2(this, this.f77104b, this.f77105c, this.f77115m, this, this.f77116n);
        if (this.f77125w) {
            long j10 = this.I;
            if (j10 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j11 = this.A;
            if (j11 != -9223372036854775807L && j10 > j11) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            vw2 vw2Var = this.f77128z;
            vw2Var.getClass();
            long j12 = vw2Var.b(this.I).f83229a.f84728b;
            long j13 = this.I;
            zj2Var.f85448f.f77799a = j12;
            zj2Var.f85451i = j13;
            zj2Var.f85450h = true;
            zj2Var.f85454l = false;
            for (ms2 ms2Var : this.f77122t) {
                ms2Var.f80369t = this.I;
            }
            this.I = -9223372036854775807L;
        }
        this.K = d();
        this.f77114l.a(zj2Var, this, this.f77107e.a(this.C));
        u30 u30Var = zj2Var.f85452j;
        bn1 bn1Var = this.f77108f;
        Uri uri = u30Var.f83341a;
        Collections.emptyMap();
        bn1Var.c(new vf1(), new hm1(1, -1, null, 0, null, bn1Var.a(zj2Var.f85451i), bn1Var.a(this.A)));
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        boolean z10;
        if (this.f77114l.b()) {
            vy vyVar = this.f77116n;
            synchronized (vyVar) {
                z10 = vyVar.f84041a;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() throws IOException {
        this.f77114l.a(this.f77107e.a(this.C));
        if (this.L && !this.f77125w) {
            throw new ob2("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && d() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    public ek2(Uri uri, p30 p30Var, cr crVar, sk0 sk0Var, ok0 ok0Var, ae0 ae0Var, bn1 bn1Var, ak2 ak2Var, qe qeVar, String str, int i10) {
        this.f77104b = uri;
        this.f77105c = p30Var;
        this.f77106d = sk0Var;
        this.f77109g = ok0Var;
        this.f77107e = ae0Var;
        this.f77108f = bn1Var;
        this.f77110h = ak2Var;
        this.f77111i = qeVar;
        this.f77112j = str;
        this.f77113k = i10;
        this.f77115m = crVar;
    }

    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        c();
        if (!this.f77128z.b()) {
            return 0L;
        }
        tw2 tw2VarB = this.f77128z.b(j10);
        return ww2Var.a(j10, tw2VarB.f83229a.f84727a, tw2VarB.f83230b.f84727a);
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        c();
        if (this.I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f77127y.f76710c;
        int length = this.f77122t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f77122t[i10].a(j10, z10, zArr[i10]);
        }
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long jA;
        boolean z10;
        c();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        long j10 = this.I;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (this.f77126x) {
            int length = this.f77122t.length;
            jA = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                dk2 dk2Var = this.f77127y;
                if (dk2Var.f76709b[i10] && dk2Var.f76710c[i10]) {
                    ms2 ms2Var = this.f77122t[i10];
                    synchronized (ms2Var) {
                        z10 = ms2Var.f80372w;
                    }
                    if (!z10) {
                        jA = Math.min(jA, this.f77122t[i10].b());
                    }
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = a(false);
        }
        if (jA == Long.MIN_VALUE) {
            return this.H;
        }
        return jA;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        c();
        return this.f77127y.f76708a;
    }

    @Override // yads.pm1
    public final long seekToUs(long j10) {
        c();
        boolean[] zArr = this.f77127y.f76709b;
        if (!this.f77128z.b()) {
            j10 = 0;
        }
        this.E = false;
        this.H = j10;
        if (this.I != -9223372036854775807L) {
            this.I = j10;
            return j10;
        }
        if (this.C != 7) {
            int length = this.f77122t.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f77122t[i10].b(j10, false) || (!zArr[i10] && this.f77126x)) {
                }
            }
            return j10;
        }
        this.J = false;
        this.I = j10;
        this.L = false;
        if (this.f77114l.b()) {
            for (ms2 ms2Var : this.f77122t) {
                ms2Var.a();
            }
            ag1 ag1Var = this.f77114l.f77391b;
            if (ag1Var != null) {
                ag1Var.a(false);
            } else {
                throw new IllegalStateException();
            }
        } else {
            this.f77114l.f77392c = null;
            for (ms2 ms2Var2 : this.f77122t) {
                ms2Var2.b(false);
            }
        }
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long a(boolean z10) {
        ms2 ms2Var;
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f77122t.length; i10++) {
            if (!z10) {
                dk2 dk2Var = this.f77127y;
                dk2Var.getClass();
                if (dk2Var.f76710c[i10]) {
                    ms2Var = this.f77122t[i10];
                    synchronized (ms2Var) {
                        long j10 = ms2Var.f80371v;
                    }
                    jMax = Math.max(jMax, j10);
                } else {
                    continue;
                }
            } else {
                ms2Var = this.f77122t[i10];
                synchronized (ms2Var) {
                    long j11 = ms2Var.f80371v;
                    jMax = Math.max(jMax, j11);
                }
            }
        }
        return jMax;
    }

    public final void a(int i10) {
        c();
        boolean[] zArr = this.f77127y.f76709b;
        if (this.J && zArr[i10] && !this.f77122t[i10].a(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (ms2 ms2Var : this.f77122t) {
                ms2Var.b(false);
            }
            om1 om1Var = this.f77120r;
            om1Var.getClass();
            om1Var.a((rx2) this);
        }
    }

    @Override // yads.cg1
    public final void b() {
        for (ms2 ms2Var : this.f77122t) {
            ms2Var.b(true);
            ms2Var.d();
        }
        cr crVar = this.f77115m;
        mq0 mq0Var = crVar.f76410b;
        if (mq0Var != null) {
            mq0Var.release();
            crVar.f76410b = null;
        }
        crVar.f76411c = null;
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
        zj2 zj2Var = (zj2) bg1Var;
        Uri uri = zj2Var.f85444b.f82098c;
        vf1 vf1Var = new vf1();
        this.f77107e.getClass();
        bn1 bn1Var = this.f77108f;
        bn1Var.a(vf1Var, new hm1(1, -1, null, 0, null, bn1Var.a(zj2Var.f85451i), bn1Var.a(this.A)));
        if (z10) {
            return;
        }
        for (ms2 ms2Var : this.f77122t) {
            ms2Var.b(false);
        }
        if (this.F > 0) {
            om1 om1Var = this.f77120r;
            om1Var.getClass();
            om1Var.a((rx2) this);
        }
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        vw2 vw2Var;
        zj2 zj2Var = (zj2) bg1Var;
        if (this.A == -9223372036854775807L && (vw2Var = this.f77128z) != null) {
            boolean zB = vw2Var.b();
            long jA = a(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.A = j12;
            ak2 ak2Var = this.f77110h;
            boolean z10 = this.B;
            hk2 hk2Var = (hk2) ak2Var;
            if (j12 == -9223372036854775807L) {
                j12 = hk2Var.f78267p;
            }
            if (hk2Var.f78266o || hk2Var.f78267p != j12 || hk2Var.f78268q != zB || hk2Var.f78269r != z10) {
                hk2Var.f78267p = j12;
                hk2Var.f78268q = zB;
                hk2Var.f78269r = z10;
                hk2Var.f78266o = false;
                long j13 = hk2Var.f78267p;
                pz2 pz2Var = new pz2(j13, j13, hk2Var.f78268q, hk2Var.f78269r, hk2Var.f78259h);
                s63 fk2Var = pz2Var;
                if (hk2Var.f78266o) {
                    fk2Var = new fk2(pz2Var);
                }
                hk2Var.a(fk2Var);
            }
        }
        Uri uri = zj2Var.f85444b.f82098c;
        vf1 vf1Var = new vf1();
        this.f77107e.getClass();
        bn1 bn1Var = this.f77108f;
        bn1Var.b(vf1Var, new hm1(1, -1, null, 0, null, bn1Var.a(zj2Var.f85451i), bn1Var.a(this.A)));
        this.L = true;
        om1 om1Var = this.f77120r;
        om1Var.getClass();
        om1Var.a((rx2) this);
    }

    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zf1 zf1Var;
        vw2 vw2Var;
        zj2 zj2Var = (zj2) bg1Var;
        Uri uri = zj2Var.f85444b.f82098c;
        vf1 vf1Var = new vf1();
        int i11 = ib3.f78556a;
        this.f77107e.getClass();
        if (!(iOException instanceof ob2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof p11) && !(iOException instanceof eg1)) {
            int i12 = q30.f81691c;
            Throwable cause = iOException;
            while (true) {
                if (cause != null) {
                    if ((cause instanceof q30) && ((q30) cause).f81692b == 2008) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    cause = cause.getCause();
                } else {
                    jMin = Math.min((i10 - 1) * 1000, 5000);
                    break;
                }
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        if (jMin == -9223372036854775807L) {
            zf1Var = fg1.f77389e;
        } else {
            int iD = d();
            int i13 = iD > this.K ? 1 : 0;
            if (!this.G && ((vw2Var = this.f77128z) == null || vw2Var.c() == -9223372036854775807L)) {
                boolean z10 = this.f77125w;
                if (z10 && !this.E && this.I == -9223372036854775807L) {
                    this.J = true;
                    zf1Var = fg1.f77388d;
                } else {
                    this.E = z10;
                    this.H = 0L;
                    this.K = 0;
                    for (ms2 ms2Var : this.f77122t) {
                        ms2Var.b(false);
                    }
                    zj2Var.f85448f.f77799a = 0L;
                    zj2Var.f85451i = 0L;
                    zj2Var.f85450h = true;
                    zj2Var.f85454l = false;
                }
            } else {
                this.K = iD;
            }
            zf1Var = new zf1(i13, jMin);
        }
        int i14 = zf1Var.f85378a;
        boolean z11 = !(i14 == 0 || i14 == 1);
        bn1 bn1Var = this.f77108f;
        bn1Var.a(vf1Var, new hm1(1, -1, null, 0, null, bn1Var.a(zj2Var.f85451i), bn1Var.a(this.A)), iOException, z11);
        if (z11) {
            this.f77107e.getClass();
        }
        return zf1Var;
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f77120r = om1Var;
        this.f77116n.d();
        i();
    }

    public final ms2 a(ck2 ck2Var) {
        int length = this.f77122t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (ck2Var.equals(this.f77123u[i10])) {
                return this.f77122t[i10];
            }
        }
        ms2 ms2VarA = ms2.a(this.f77111i, this.f77106d, this.f77109g);
        ms2VarA.f80355f = this;
        int i11 = length + 1;
        ck2[] ck2VarArr = (ck2[]) Arrays.copyOf(this.f77123u, i11);
        ck2VarArr[length] = ck2Var;
        this.f77123u = ck2VarArr;
        ms2[] ms2VarArr = (ms2[]) Arrays.copyOf(this.f77122t, i11);
        ms2VarArr[length] = ms2VarA;
        this.f77122t = ms2VarArr;
        return ms2VarA;
    }

    @Override // yads.pq0
    public final void a(final vw2 vw2Var) {
        this.f77119q.post(new Runnable() { // from class: cp.k1
            @Override // java.lang.Runnable
            public final void run() {
                this.f51402b.b(vw2Var);
            }
        });
    }

    @Override // yads.pm1
    public final long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10) {
        op0 op0Var;
        c();
        dk2 dk2Var = this.f77127y;
        i73 i73Var = dk2Var.f76708a;
        boolean[] zArr3 = dk2Var.f76710c;
        int i10 = this.F;
        for (int i11 = 0; i11 < op0VarArr.length; i11++) {
            ns2 ns2Var = ns2VarArr[i11];
            if (ns2Var != null && (op0VarArr[i11] == null || !zArr[i11])) {
                int i12 = ((bk2) ns2Var).f75856b;
                if (zArr3[i12]) {
                    this.F--;
                    zArr3[i12] = false;
                    ns2VarArr[i11] = null;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        boolean z10 = !this.D ? j10 == 0 : i10 != 0;
        for (int i13 = 0; i13 < op0VarArr.length; i13++) {
            if (ns2VarArr[i13] == null && (op0Var = op0VarArr[i13]) != null) {
                if (op0Var.f() == 1) {
                    if (op0Var.b(0) == 0) {
                        int iIndexOf = i73Var.f78515c.indexOf(op0Var.b());
                        if (iIndexOf < 0) {
                            iIndexOf = -1;
                        }
                        if (!zArr3[iIndexOf]) {
                            this.F++;
                            zArr3[iIndexOf] = true;
                            ns2VarArr[i13] = new bk2(this, iIndexOf);
                            zArr2[i13] = true;
                            if (!z10) {
                                ms2 ms2Var = this.f77122t[iIndexOf];
                                z10 = (ms2Var.b(j10, true) || ms2Var.f80366q + ms2Var.f80368s == 0) ? false : true;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f77114l.b()) {
                for (ms2 ms2Var2 : this.f77122t) {
                    ms2Var2.a();
                }
                ag1 ag1Var = this.f77114l.f77391b;
                if (ag1Var != null) {
                    ag1Var.a(false);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                for (ms2 ms2Var3 : this.f77122t) {
                    ms2Var3.b(false);
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            for (int i14 = 0; i14 < ns2VarArr.length; i14++) {
                if (ns2VarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.D = true;
        return j10;
    }

    @Override // yads.pq0
    public final m73 a(int i10, int i11) {
        return a(new ck2(false, i10));
    }
}
