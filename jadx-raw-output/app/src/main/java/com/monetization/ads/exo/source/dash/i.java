package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yads.a30;
import yads.ae0;
import yads.an0;
import yads.bn1;
import yads.c30;
import yads.cg1;
import yads.f30;
import yads.fc2;
import yads.fg1;
import yads.fm1;
import yads.gg1;
import yads.h30;
import yads.hc0;
import yads.hm1;
import yads.ho0;
import yads.i30;
import yads.ib3;
import yads.ih1;
import yads.lc0;
import yads.lh1;
import yads.lo2;
import yads.lu;
import yads.mo;
import yads.ms2;
import yads.nc0;
import yads.ni;
import yads.o30;
import yads.ok0;
import yads.p30;
import yads.pb2;
import yads.pm1;
import yads.qb2;
import yads.qe;
import yads.r83;
import yads.rx2;
import yads.sk0;
import yads.ue2;
import yads.v13;
import yads.vf1;
import yads.vo;
import yads.w13;
import yads.x13;
import yads.ye2;
import yads.yl1;
import yads.ym1;
import yads.zb;
import yads.zl1;
import yads.zm0;
import yads.zo;
import yads.zx2;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends mo {
    public fg1 A;
    public r83 B;
    public f30 C;
    public Handler D;
    public yl1 E;
    public Uri F;
    public final Uri G;
    public boolean I;
    public long J;
    public long K;
    public int M;
    public int O;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fm1 f42931h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o30 f42933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a30 f42934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hc0 f42935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sk0 f42936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ae0 f42937n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f42939p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pb2 f42941r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p30 f42949z;
    public c30 H = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vo f42938o = new vo();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f42932i = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bn1 f42940q = b((ym1) null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f42943t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f42944u = new SparseArray();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f42947x = new c(this);
    public long N = -9223372036854775807L;
    public long L = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f42942s = new e(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gg1 f42948y = new f(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Runnable f42945v = new Runnable() { // from class: mb.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f64389b.h();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f42946w = new Runnable() { // from class: mb.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f64390b.f();
        }
    };

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        int iIntValue = ((Integer) ym1Var.f82311a).intValue() - this.O;
        bn1 bn1Var = new bn1(this.f80295c.f75912c, 0, ym1Var, ((fc2) this.H.f76137m.get(iIntValue)).f77350b);
        ok0 ok0VarA = a(ym1Var);
        int i10 = this.O + iIntValue;
        c30 c30Var = this.H;
        vo voVar = this.f42938o;
        a30 a30Var = this.f42934k;
        r83 r83Var = this.B;
        sk0 sk0Var = this.f42936m;
        ae0 ae0Var = this.f42937n;
        long j11 = this.L;
        gg1 gg1Var = this.f42948y;
        hc0 hc0Var = this.f42935l;
        c cVar = this.f42947x;
        ye2 ye2Var = this.f80299g;
        if (ye2Var == null) {
            throw new IllegalStateException();
        }
        h30 h30Var = new h30(i10, c30Var, voVar, iIntValue, a30Var, r83Var, sk0Var, ok0VarA, ae0Var, bn1Var, j11, gg1Var, qeVar, hc0Var, cVar, ye2Var);
        this.f42944u.put(i10, h30Var);
        return h30Var;
    }

    @Override // yads.mo
    public final void e() {
        this.I = false;
        this.f42949z = null;
        fg1 fg1Var = this.A;
        if (fg1Var != null) {
            fg1Var.a((cg1) null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.f42932i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.f42944u.clear();
        vo voVar = this.f42938o;
        voVar.f83966a.clear();
        voVar.f83967b.clear();
        voVar.f83968c.clear();
        this.f42936m.release();
    }

    public final /* synthetic */ void f() {
        a(false);
    }

    static {
        ho0.a("goog.exo.dash");
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f42931h;
    }

    @Override // yads.mo
    public final void d() {
        this.f42948y.a();
    }

    public final void g() {
        boolean z10;
        fg1 fg1Var = this.A;
        a aVar = new a(this);
        synchronized (x13.f84421b) {
            z10 = x13.f84422c;
        }
        if (z10) {
            aVar.a();
            return;
        }
        if (fg1Var == null) {
            fg1Var = new fg1("SntpClient");
        }
        fg1Var.a(new w13(), new v13(aVar), 1);
    }

    public final void h() {
        Uri uri;
        this.D.removeCallbacks(this.f42945v);
        fg1 fg1Var = this.A;
        if (fg1Var.f77392c != null) {
            return;
        }
        if (fg1Var.b()) {
            this.I = true;
            return;
        }
        synchronized (this.f42943t) {
            uri = this.F;
        }
        this.I = false;
        qb2 qb2Var = new qb2(this.f42949z, uri, 4, this.f42941r);
        this.A.a(qb2Var, this.f42942s, this.f42937n.a(4));
        bn1 bn1Var = this.f42940q;
        Uri uri2 = qb2Var.f81793b.f83341a;
        Collections.emptyMap();
        bn1Var.c(new vf1(), new hm1(qb2Var.f81794c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)));
    }

    public i(fm1 fm1Var, o30 o30Var, pb2 pb2Var, a30 a30Var, hc0 hc0Var, sk0 sk0Var, ae0 ae0Var, long j10) {
        this.f42931h = fm1Var;
        this.E = fm1Var.f77445d;
        this.F = ((zl1) ni.a(fm1Var.f77444c)).f85472a;
        this.G = fm1Var.f77444c.f85472a;
        this.f42933j = o30Var;
        this.f42941r = pb2Var;
        this.f42934k = a30Var;
        this.f42936m = sk0Var;
        this.f42937n = ae0Var;
        this.f42939p = j10;
        this.f42935l = hc0Var;
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.B = r83Var;
        this.f42936m.prepare();
        sk0 sk0Var = this.f42936m;
        Looper looperMyLooper = Looper.myLooper();
        ye2 ye2Var = this.f80299g;
        if (ye2Var != null) {
            sk0Var.a(looperMyLooper, ye2Var);
            if (this.f42932i) {
                a(false);
                return;
            }
            this.f42949z = this.f42933j.createDataSource();
            this.A = new fg1("DashMediaSource");
            this.D = ib3.a((Handler.Callback) null);
            h();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        h30 h30Var = (h30) pm1Var;
        ue2 ue2Var = h30Var.f78038n;
        ue2Var.f83452j = true;
        ue2Var.f83447e.removeCallbacksAndMessages(null);
        for (lu luVar : h30Var.f78044t) {
            luVar.f79928s = h30Var;
            ms2 ms2Var = luVar.f79923n;
            ms2Var.a();
            ms2Var.d();
            for (ms2 ms2Var2 : luVar.f79924o) {
                ms2Var2.a();
                ms2Var2.d();
            }
            luVar.f79919j.a(luVar);
        }
        h30Var.f78043s = null;
        this.f42944u.remove(h30Var.f78026b);
    }

    public final void a(IOException iOException) {
        ih1.b("DashMediaSource", ih1.a("Failed to resolve time offset.", iOException));
        a(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:137:0x0309  */
    /* JADX WARN: Code duplicated, block: B:165:0x037a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0381  */
    /* JADX WARN: Code duplicated, block: B:262:0x056c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25, types: [int] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33, types: [int] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r15v9, types: [yads.op0] */
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
    public final void a(boolean z10) {
        long jElapsedRealtime;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        long j11;
        long j12;
        long jElapsedRealtime2;
        i30 i30VarD;
        long jMin;
        float f10;
        float f11;
        zx2 zx2Var;
        long j13;
        boolean z14 = false;
        int i10 = 0;
        while (i10 < this.f42944u.size()) {
            int iKeyAt = this.f42944u.keyAt(i10);
            if (iKeyAt >= this.O) {
                h30 h30Var = (h30) this.f42944u.valueAt(i10);
                c30 c30Var = this.H;
                int i11 = iKeyAt - this.O;
                h30Var.f78047w = c30Var;
                h30Var.f78048x = i11;
                ue2 ue2Var = h30Var.f78038n;
                ue2Var.f83451i = z14;
                ue2Var.f83449g = c30Var;
                Iterator it = ue2Var.f83448f.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < ue2Var.f83449g.f76132h) {
                        it.remove();
                    }
                }
                lu[] luVarArr = h30Var.f78044t;
                if (luVarArr != null) {
                    int length = luVarArr.length;
                    for (?? r10 = z14; r10 < length; r10++) {
                        nc0 nc0Var = (nc0) luVarArr[r10].f79915f;
                        nc0Var.getClass();
                        try {
                            nc0Var.f80631j = c30Var;
                            nc0Var.f80632k = i11;
                            long jA = ib3.a(c30Var.b(i11));
                            ArrayList arrayListA = nc0Var.a();
                            for (?? r14 = z14; r14 < nc0Var.f80629h.length; r14++) {
                                lo2 lo2Var = (lo2) arrayListA.get(nc0Var.f80630i.b(r14));
                                lc0[] lc0VarArr = nc0Var.f80629h;
                                lc0VarArr[r14] = lc0VarArr[r14].a(jA, lo2Var);
                            }
                        } catch (zo e10) {
                            nc0Var.f80633l = e10;
                        }
                        z14 = false;
                    }
                    h30Var.f78043s.a((rx2) h30Var);
                }
                h30Var.f78049y = ((fc2) c30Var.f76137m.get(i11)).f77352d;
                for (zm0 zm0Var : h30Var.f78045u) {
                    for (an0 an0Var : h30Var.f78049y) {
                        String str = an0Var.f75573c + "/" + an0Var.f75574d;
                        an0 an0Var2 = zm0Var.f85483f;
                        if (str.equals(an0Var2.f75573c + "/" + an0Var2.f75574d)) {
                            zm0Var.a(an0Var, c30Var.f76128d && i11 == c30Var.f76137m.size() - 1);
                            break;
                        }
                    }
                }
            }
            i10++;
            z14 = false;
        }
        fc2 fc2Var = (fc2) this.H.f76137m.get(0);
        int size = this.H.f76137m.size() - 1;
        fc2 fc2Var2 = (fc2) this.H.f76137m.get(size);
        long jA2 = ib3.a(this.H.b(size));
        long j14 = this.L;
        if (j14 == -9223372036854775807L) {
            jElapsedRealtime = System.currentTimeMillis();
        } else {
            jElapsedRealtime = j14 + SystemClock.elapsedRealtime();
        }
        long jA3 = ib3.a(jElapsedRealtime);
        long jA4 = ib3.a(this.H.b(0));
        long jA5 = ib3.a(fc2Var.f77350b);
        int i12 = 0;
        while (true) {
            if (i12 >= fc2Var.f77351c.size()) {
                z11 = false;
                break;
            }
            int i13 = ((zb) fc2Var.f77351c.get(i12)).f85266b;
            if (i13 == 1 || i13 == 2) {
                z11 = true;
                break;
            }
            i12++;
        }
        long j15 = jA2;
        long jMax = jA5;
        int i14 = 0;
        while (true) {
            if (i14 >= fc2Var.f77351c.size()) {
                jA5 = jMax;
                break;
            }
            zb zbVar = (zb) fc2Var.f77351c.get(i14);
            List list = zbVar.f85267c;
            if ((!z11 || zbVar.f85266b != 3) && !list.isEmpty()) {
                i30 i30VarD2 = ((lo2) list.get(0)).d();
                if (i30VarD2 == null || i30VarD2.e(jA4, jA3) == 0) {
                    break;
                } else {
                    jMax = Math.max(jMax, i30VarD2.a(i30VarD2.c(jA4, jA3)) + jA5);
                }
            }
            i14++;
        }
        long jA6 = ib3.a(fc2Var2.f77350b);
        long jMin2 = Long.MAX_VALUE;
        int i15 = 0;
        while (true) {
            if (i15 >= fc2Var2.f77351c.size()) {
                z12 = false;
                break;
            }
            int i16 = ((zb) fc2Var2.f77351c.get(i15)).f85266b;
            if (i16 == 1 || i16 == 2) {
                z12 = true;
                break;
            }
            i15++;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= fc2Var2.f77351c.size()) {
                jA6 = jMin2;
                break;
            }
            zb zbVar2 = (zb) fc2Var2.f77351c.get(i17);
            List list2 = zbVar2.f85267c;
            if (z12 && zbVar2.f85266b == 3) {
                j13 = j15;
            } else {
                if (!list2.isEmpty()) {
                    i30 i30VarD3 = ((lo2) list2.get(0)).d();
                    if (i30VarD3 == null) {
                        jA6 += j15;
                    } else {
                        j13 = j15;
                        long jE = i30VarD3.e(j13, jA3);
                        if (jE != 0) {
                            long jC = (i30VarD3.c(j13, jA3) + jE) - 1;
                            jMin2 = Math.min(jMin2, i30VarD3.b(jC, j13) + i30VarD3.a(jC) + jA6);
                        }
                    }
                    break;
                }
                j13 = j15;
            }
            i17++;
            j15 = j13;
            jA3 = jA3;
        }
        if (!this.H.f76128d) {
            z13 = false;
            break;
        }
        int i18 = 0;
        while (true) {
            if (i18 >= fc2Var2.f77351c.size()) {
                z13 = true;
                break;
            }
            i30 i30VarD4 = ((lo2) ((zb) fc2Var2.f77351c.get(i18)).f85267c.get(0)).d();
            if (i30VarD4 == null || i30VarD4.a()) {
                z13 = false;
                break;
            }
            i18++;
        }
        if (z13) {
            long j16 = this.H.f76130f;
            if (j16 != -9223372036854775807L) {
                jA5 = Math.max(jA5, jA6 - ib3.a(j16));
            }
        }
        long j17 = jA6 - jA5;
        c30 c30Var2 = this.H;
        if (c30Var2.f76128d) {
            long j18 = c30Var2.f76125a;
            if (j18 != -9223372036854775807L) {
                long jA7 = (jA3 - ib3.a(j18)) - jA5;
                long jB = ib3.b(jA7);
                long j19 = this.f42931h.f77445d.f85041d;
                if (j19 != -9223372036854775807L) {
                    jMin = Math.min(jB, j19);
                } else {
                    zx2 zx2Var2 = this.H.f76134j;
                    if (zx2Var2 != null) {
                        long j20 = zx2Var2.f85648c;
                        if (j20 != -9223372036854775807L) {
                            jMin = Math.min(jB, j20);
                        } else {
                            jMin = jB;
                        }
                    } else {
                        jMin = jB;
                    }
                }
                long jB2 = ib3.b(jA7 - j17);
                if (jB2 < 0 && jMin > 0) {
                    jB2 = 0;
                }
                long j21 = this.H.f76127c;
                if (j21 != -9223372036854775807L) {
                    jB2 = Math.min(jB2 + j21, jB);
                }
                long j22 = this.f42931h.f77445d.f85040c;
                if (j22 != -9223372036854775807L) {
                    jB2 = Math.max(jB2, Math.min(j22, jB));
                } else {
                    zx2 zx2Var3 = this.H.f76134j;
                    if (zx2Var3 != null) {
                        long j23 = zx2Var3.f85647b;
                        if (j23 != -9223372036854775807L) {
                            jB2 = Math.max(jB2, Math.min(j23, jB));
                        }
                    }
                }
                if (jB2 > jMin) {
                    jMin = jB2;
                }
                long jMax2 = this.E.f85039b;
                if (jMax2 != -9223372036854775807L) {
                    j10 = jA5;
                } else {
                    c30 c30Var3 = this.H;
                    zx2 zx2Var4 = c30Var3.f76134j;
                    j10 = jA5;
                    if (zx2Var4 != null) {
                        long j24 = zx2Var4.f85646a;
                        if (j24 != -9223372036854775807L) {
                            jMax2 = j24;
                        } else {
                            jMax2 = c30Var3.f76131g;
                            if (jMax2 == -9223372036854775807L) {
                                jMax2 = this.f42939p;
                            }
                        }
                    } else {
                        jMax2 = c30Var3.f76131g;
                        if (jMax2 == -9223372036854775807L) {
                            jMax2 = this.f42939p;
                        }
                    }
                }
                if (jMax2 < jB2) {
                    jMax2 = jB2;
                }
                if (jMax2 > jMin) {
                    jMax2 = Math.max(jB2, Math.min(ib3.b(jA7 - Math.min(5000000L, j17 / 2)), jMin));
                }
                long j25 = jMax2;
                yl1 yl1Var = this.f42931h.f77445d;
                float f12 = yl1Var.f85042e;
                if (f12 == -3.4028235E38f) {
                    zx2 zx2Var5 = this.H.f76134j;
                    f12 = zx2Var5 != null ? zx2Var5.f85649d : -3.4028235E38f;
                }
                float f13 = yl1Var.f85043f;
                if (f13 == -3.4028235E38f) {
                    zx2 zx2Var6 = this.H.f76134j;
                    f13 = zx2Var6 != null ? zx2Var6.f85650e : -3.4028235E38f;
                }
                if (f12 == -3.4028235E38f && f13 == -3.4028235E38f && ((zx2Var = this.H.f76134j) == null || zx2Var.f85646a == -9223372036854775807L)) {
                    f11 = 1.0f;
                    f10 = 1.0f;
                } else {
                    f10 = f13;
                    f11 = f12;
                }
                this.E = new yl1(j25, jB2, jMin, f11, f10);
                long jB3 = this.H.f76125a + ib3.b(j10);
                long jA8 = jA7 - ib3.a(this.E.f85039b);
                long jMin3 = Math.min(5000000L, j17 / 2);
                if (jA8 < jMin3) {
                    j11 = jB3;
                    j12 = jMin3;
                } else {
                    j12 = jA8;
                    j11 = jB3;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            j10 = jA5;
            j11 = -9223372036854775807L;
            j12 = 0;
        }
        long jA9 = j10 - ib3.a(fc2Var.f77350b);
        c30 c30Var4 = this.H;
        a(new b(c30Var4.f76125a, j11, this.L, this.O, jA9, j17, j12, c30Var4, this.f42931h, c30Var4.f76128d ? this.E : null));
        if (this.f42932i) {
            return;
        }
        this.D.removeCallbacks(this.f42946w);
        if (z13) {
            Handler handler = this.D;
            Runnable runnable = this.f42946w;
            c30 c30Var5 = this.H;
            long j26 = this.L;
            if (j26 == -9223372036854775807L) {
                jElapsedRealtime2 = System.currentTimeMillis();
            } else {
                jElapsedRealtime2 = j26 + SystemClock.elapsedRealtime();
            }
            int size2 = c30Var5.f76137m.size() - 1;
            fc2 fc2Var3 = (fc2) c30Var5.f76137m.get(size2);
            long jA10 = ib3.a(fc2Var3.f77350b);
            long jA11 = ib3.a(c30Var5.b(size2));
            long jA12 = ib3.a(jElapsedRealtime2);
            long jA13 = ib3.a(c30Var5.f76125a);
            long jA14 = ib3.a(5000L);
            for (int i19 = 0; i19 < fc2Var3.f77351c.size(); i19++) {
                List list3 = ((zb) fc2Var3.f77351c.get(i19)).f85267c;
                if (!list3.isEmpty() && (i30VarD = ((lo2) list3.get(0)).d()) != null) {
                    long jD = (i30VarD.d(jA11, jA12) + (jA13 + jA10)) - jA12;
                    if (jD < jA14 - 100000 || (jD > jA14 && jD < jA14 + 100000)) {
                        jA14 = jD;
                    }
                }
            }
            RoundingMode roundingMode = RoundingMode.CEILING;
            roundingMode.getClass();
            long j27 = jA14 / 1000;
            long j28 = jA14 - (j27 * 1000);
            if (j28 != 0) {
                int i20 = ((int) ((jA14 ^ 1000) >> 63)) | 1;
                switch (lh1.f79783a[roundingMode.ordinal()]) {
                    case 1:
                        if (j28 != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        if (i20 < 0) {
                            j27 += (long) i20;
                        }
                        break;
                    case 4:
                        j27 += (long) i20;
                        break;
                    case 5:
                        if (i20 > 0) {
                            j27 += (long) i20;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        long jAbs = Math.abs(j28);
                        long jAbs2 = jAbs - (Math.abs(1000L) - jAbs);
                        if (jAbs2 == 0) {
                            if ((((1 & j27) != 0) & (roundingMode == RoundingMode.HALF_EVEN)) | (roundingMode == RoundingMode.HALF_UP)) {
                                j27 += (long) i20;
                            }
                        } else if (jAbs2 > 0) {
                            j27 += (long) i20;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            handler.postDelayed(runnable, j27);
        }
        if (this.I) {
            h();
            return;
        }
        if (z10) {
            c30 c30Var6 = this.H;
            if (c30Var6.f76128d) {
                long j29 = c30Var6.f76129e;
                if (j29 != -9223372036854775807L) {
                    if (j29 == 0) {
                        j29 = 5000;
                    }
                    this.D.postDelayed(this.f42945v, Math.max(0L, (this.J + j29) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }
}
