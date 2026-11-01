package yads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class bl1 extends mk1 {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int[] f75860p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static boolean f75861q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static boolean f75862r1;
    public final Context G0;
    public final uh3 H0;
    public final cj3 I0;
    public final long J0;
    public final int K0;
    public final boolean L0;
    public zk1 M0;
    public boolean N0;
    public boolean O0;
    public Surface P0;
    public hd2 Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public long X0;
    public long Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f75863a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f75864b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f75865c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f75866d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public long f75867e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f75868f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f75869g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f75870h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f75871i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public float f75872j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public oj3 f75873k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f75874l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f75875m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public al1 f75876n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public nh3 f75877o1;

    public bl1(Context context, ee0 ee0Var, ok1 ok1Var, boolean z10, Handler handler, wn0 wn0Var) {
        super(2, ee0Var, ok1Var, z10, 30.0f);
        this.J0 = 5000L;
        this.K0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.H0 = new uh3(applicationContext);
        this.I0 = new cj3(handler, wn0Var);
        this.L0 = B();
        this.X0 = -9223372036854775807L;
        this.f75869g1 = -1;
        this.f75870h1 = -1;
        this.f75872j1 = -1.0f;
        this.S0 = 1;
        this.f75875m1 = 0;
        A();
    }

    public static boolean C() {
        int i10 = ib3.f78556a;
        if (i10 <= 28) {
            cl1 cl1Var = pk2.f81444g;
            String strR = cl1Var.r();
            String str = ib3.f78557b;
            if (strR.equals(str) || cl1Var.I().equals(str) || cl1Var.K().equals(str) || cl1Var.J().equals(str) || cl1Var.Q0().equals(str) || cl1Var.P0().equals(str) || cl1Var.d1().equals(str) || cl1Var.e1().equals(str)) {
                return true;
            }
        }
        if (i10 <= 27 && pk2.f81444g.w0().equals(ib3.f78557b)) {
            return true;
        }
        if (i10 > 26) {
            return false;
        }
        cl1 cl1Var2 = pk2.f81444g;
        String strA = cl1Var2.a();
        String str2 = ib3.f78557b;
        if (!strA.equals(str2) && !cl1Var2.b().equals(str2) && !cl1Var2.c().equals(str2) && !cl1Var2.d().equals(str2) && !cl1Var2.e().equals(str2) && !cl1Var2.f().equals(str2) && !cl1Var2.g().equals(str2) && !cl1Var2.h().equals(str2) && !cl1Var2.i().equals(str2) && !cl1Var2.j().equals(str2) && !cl1Var2.k().equals(str2) && !cl1Var2.l().equals(str2) && !cl1Var2.m().equals(str2) && !cl1Var2.s().equals(str2) && !cl1Var2.t().equals(str2) && !cl1Var2.u().equals(str2) && !cl1Var2.v().equals(str2) && !cl1Var2.w().equals(str2) && !cl1Var2.y().equals(str2) && !cl1Var2.z().equals(str2) && !cl1Var2.A().equals(str2) && !cl1Var2.B().equals(str2) && !cl1Var2.C().equals(str2) && !cl1Var2.D().equals(str2) && !cl1Var2.E().equals(str2) && !cl1Var2.F().equals(str2) && !cl1Var2.G().equals(str2) && !cl1Var2.H().equals(str2) && !cl1Var2.L().equals(str2) && !cl1Var2.M().equals(str2) && !cl1Var2.N().equals(str2) && !cl1Var2.O().equals(str2) && !cl1Var2.P().equals(str2) && !cl1Var2.Q().equals(str2) && !cl1Var2.R().equals(str2) && !cl1Var2.S().equals(str2) && !cl1Var2.T().equals(str2) && !cl1Var2.U().equals(str2) && !cl1Var2.V().equals(str2) && !cl1Var2.W().equals(str2) && !cl1Var2.X().equals(str2) && !cl1Var2.Y().equals(str2) && !cl1Var2.Z().equals(str2) && !cl1Var2.a0().equals(str2) && !cl1Var2.b0().equals(str2) && !cl1Var2.c0().equals(str2) && !cl1Var2.d0().equals(str2) && !cl1Var2.e0().equals(str2) && !cl1Var2.f0().equals(str2) && !cl1Var2.g0().equals(str2) && !cl1Var2.h0().equals(str2) && !cl1Var2.i0().equals(str2) && !cl1Var2.j0().equals(str2) && !cl1Var2.k0().equals(str2) && !cl1Var2.l0().equals(str2) && !cl1Var2.m0().equals(str2) && !cl1Var2.n0().equals(str2) && !cl1Var2.o0().equals(str2) && !cl1Var2.p0().equals(str2) && !cl1Var2.q0().equals(str2) && !cl1Var2.r0().equals(str2) && !cl1Var2.s0().equals(str2) && !cl1Var2.t0().equals(str2) && !cl1Var2.u0().equals(str2) && !cl1Var2.v0().equals(str2) && !cl1Var2.x0().equals(str2) && !cl1Var2.y0().equals(str2) && !cl1Var2.z0().equals(str2) && !cl1Var2.A0().equals(str2) && !cl1Var2.B0().equals(str2) && !cl1Var2.C0().equals(str2) && !cl1Var2.D0().equals(str2) && !cl1Var2.E0().equals(str2) && !cl1Var2.F0().equals(str2) && !cl1Var2.H0().equals(str2) && !cl1Var2.I0().equals(str2) && !cl1Var2.K0().equals(str2) && !cl1Var2.L0().equals(str2) && !cl1Var2.M0().equals(str2) && !cl1Var2.N0().equals(str2) && !cl1Var2.O0().equals(str2) && !cl1Var2.R0().equals(str2) && !cl1Var2.S0().equals(str2) && !cl1Var2.T0().equals(str2) && !cl1Var2.U0().equals(str2) && !cl1Var2.V0().equals(str2) && !cl1Var2.W0().equals(str2) && !cl1Var2.X0().equals(str2) && !cl1Var2.Y0().equals(str2) && !cl1Var2.a1().equals(str2) && !cl1Var2.b1().equals(str2) && !cl1Var2.f1().equals(str2) && !cl1Var2.g1().equals(str2) && !cl1Var2.h1().equals(str2) && !cl1Var2.i1().equals(str2) && !cl1Var2.j1().equals(str2) && !cl1Var2.k1().equals(str2) && !cl1Var2.l1().equals(str2) && !cl1Var2.m1().equals(str2) && !cl1Var2.n1().equals(str2) && !cl1Var2.o1().equals(str2) && !cl1Var2.p1().equals(str2) && !cl1Var2.q1().equals(str2) && !cl1Var2.r1().equals(str2) && !cl1Var2.s1().equals(str2) && !cl1Var2.t1().equals(str2) && !cl1Var2.u1().equals(str2) && !cl1Var2.v1().equals(str2) && !cl1Var2.w1().equals(str2) && !cl1Var2.x1().equals(str2) && !cl1Var2.y1().equals(str2) && !cl1Var2.z1().equals(str2) && !cl1Var2.A1().equals(str2) && !cl1Var2.B1().equals(str2) && !cl1Var2.C1().equals(str2) && !cl1Var2.D1().equals(str2) && !cl1Var2.E1().equals(str2) && !cl1Var2.G1().equals(str2) && !cl1Var2.H1().equals(str2) && !cl1Var2.I1().equals(str2) && !cl1Var2.F1().equals(str2) && !cl1Var2.J1().equals(str2) && !cl1Var2.K1().equals(str2) && !cl1Var2.L1().equals(str2) && !cl1Var2.M1().equals(str2) && !cl1Var2.N1().equals(str2) && !cl1Var2.O1().equals(str2) && !cl1Var2.P1().equals(str2) && !cl1Var2.Q1().equals(str2) && !cl1Var2.R1().equals(str2) && !cl1Var2.S1().equals(str2) && !cl1Var2.T1().equals(str2) && !cl1Var2.U1().equals(str2) && !cl1Var2.V1().equals(str2) && !cl1Var2.W1().equals(str2) && !cl1Var2.X1().equals(str2) && !cl1Var2.Y1().equals(str2) && !cl1Var2.Z1().equals(str2) && !cl1Var2.a2().equals(str2) && !cl1Var2.b2().equals(str2)) {
            String strN = cl1Var2.n();
            String str3 = ib3.f78559d;
            if (!strN.equals(str3) && !cl1Var2.o().equals(str3) && !cl1Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str) {
        if (str.startsWith(pk2.f81444g.c1())) {
            return false;
        }
        synchronized (bl1.class) {
            if (!f75861q1) {
                f75862r1 = C();
                f75861q1 = true;
            }
        }
        return f75862r1;
    }

    public final void A() {
        this.f75873k1 = null;
    }

    @Override // yads.mk1
    public final va0 a(ik1 ik1Var, mx0 mx0Var, mx0 mx0Var2) {
        va0 va0VarA = ik1Var.a(mx0Var, mx0Var2);
        int i10 = va0VarA.f83863e;
        int i11 = mx0Var2.f80434r;
        zk1 zk1Var = this.M0;
        if (i11 > zk1Var.f85464a || mx0Var2.f80435s > zk1Var.f85465b) {
            i10 |= 256;
        }
        if (b(mx0Var2, ik1Var) > this.M0.f85466c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new va0(ik1Var.f78680a, mx0Var, mx0Var2, i12 != 0 ? 0 : va0VarA.f83862d, i12);
    }

    @Override // yads.ro
    public final String d() {
        return "MediaCodecVideoRenderer";
    }

    @Override // yads.ro
    public final void h() {
        this.f75873k1 = null;
        z();
        this.R0 = false;
        this.f75876n1 = null;
        try {
            this.B = null;
            this.C0 = -9223372036854775807L;
            this.D0 = -9223372036854775807L;
            this.E0 = 0;
            p();
        } finally {
            this.I0.a(this.B0);
        }
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
    @Override // yads.ro, yads.af2
    public final void handleMessage(int i10, Object obj) {
        boolean z10;
        int i11;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f75877o1 = (nh3) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f75875m1 != iIntValue) {
                    this.f75875m1 = iIntValue;
                    if (this.f75874l1) {
                        u();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.S0 = iIntValue2;
                dk1 dk1Var = this.K;
                if (dk1Var != null) {
                    dk1Var.setVideoScalingMode(iIntValue2);
                    return;
                }
                return;
            }
            if (i10 != 5) {
                return;
            }
            uh3 uh3Var = this.H0;
            int iIntValue3 = ((Integer) obj).intValue();
            if (uh3Var.f83478j == iIntValue3) {
                return;
            }
            uh3Var.f83478j = iIntValue3;
            uh3Var.a(true);
            return;
        }
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = surface;
        if (surface == null) {
            hd2 hd2Var = this.Q0;
            if (hd2Var != null) {
                surface2 = hd2Var;
            } else {
                ik1 ik1Var = this.R;
                if (ik1Var != null && b(ik1Var)) {
                    Context context = this.G0;
                    boolean z11 = ik1Var.f78685f;
                    int i12 = hd2.f78180e;
                    if (z11) {
                        surface2 = surface;
                        surface2 = surface;
                        synchronized (hd2.class) {
                            if (!hd2.f78181f) {
                                if (sz0.a(context)) {
                                    i11 = sz0.c() ? 1 : 2;
                                } else {
                                    i11 = 0;
                                }
                                hd2.f78180e = i11;
                                hd2.f78181f = true;
                            }
                            z10 = hd2.f78180e != 0;
                        }
                        if (!z10) {
                            throw new IllegalStateException();
                        }
                    }
                    surface2 = surface;
                    surface2 = surface;
                    hd2 hd2VarA = new gd2().a(z11 ? hd2.f78180e : 0);
                    this.Q0 = hd2VarA;
                    surface2 = hd2VarA;
                }
            }
        }
        surface2 = surface;
        surface2 = surface;
        surface2 = surface;
        if (this.P0 == surface2) {
            if (surface2 == null || surface2 == this.Q0) {
                return;
            }
            oj3 oj3Var = this.f75873k1;
            if (oj3Var != null) {
                this.I0.b(oj3Var);
            }
            if (this.R0) {
                this.I0.a(this.P0);
                return;
            }
            return;
        }
        this.P0 = surface2;
        uh3 uh3Var2 = this.H0;
        uh3Var2.getClass();
        Surface surface3 = surface2 instanceof hd2 ? null : surface2;
        Surface surface4 = uh3Var2.f83473e;
        if (surface4 != surface3) {
            if (ib3.f78556a >= 30 && surface4 != null && uh3Var2.f83478j != Integer.MIN_VALUE && uh3Var2.f83476h != 0.0f) {
                uh3Var2.f83476h = 0.0f;
                oh3.a(surface4, 0.0f);
            }
            uh3Var2.f83473e = surface3;
            uh3Var2.a(true);
        }
        this.R0 = false;
        int i13 = this.f82359g;
        dk1 dk1Var2 = this.K;
        if (dk1Var2 != null) {
            if (ib3.f78556a < 23 || surface2 == null || this.N0) {
                u();
                r();
            } else {
                dk1Var2.a(surface2);
            }
        }
        if (surface2 == null || surface2 == this.Q0) {
            this.f75873k1 = null;
            z();
            return;
        }
        oj3 oj3Var2 = this.f75873k1;
        if (oj3Var2 != null) {
            this.I0.b(oj3Var2);
        }
        z();
        if (i13 == 2) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
        }
    }

    @Override // yads.ro
    public final void i() {
        try {
            try {
                this.f80211m0 = false;
                this.f80226u.b();
                this.f80224t.b();
                this.f80210l0 = false;
                this.f80209k0 = false;
                u();
                mk0.a(this.E, null);
                this.E = null;
                hd2 hd2Var = this.Q0;
                if (hd2Var != null) {
                    if (this.P0 == hd2Var) {
                        this.P0 = null;
                    }
                    hd2Var.release();
                    this.Q0 = null;
                }
            } catch (Throwable th2) {
                mk0.a(this.E, null);
                this.E = null;
                throw th2;
            }
        } catch (Throwable th3) {
            hd2 hd2Var2 = this.Q0;
            if (hd2Var2 != null) {
                if (this.P0 == hd2Var2) {
                    this.P0 = null;
                }
                hd2Var2.release();
                this.Q0 = null;
            }
            throw th3;
        }
    }

    @Override // yads.ro
    public final void j() {
        this.Z0 = 0;
        this.Y0 = SystemClock.elapsedRealtime();
        this.f75866d1 = SystemClock.elapsedRealtime() * 1000;
        this.f75867e1 = 0L;
        this.f75868f1 = 0;
        this.H0.a();
    }

    public final void z() {
        dk1 dk1Var;
        this.T0 = false;
        if (ib3.f78556a < 23 || !this.f75874l1 || (dk1Var = this.K) == null) {
            return;
        }
        this.f75876n1 = new al1(this, dk1Var);
    }

    public static boolean B() {
        return pk2.f81444g.Z0().equals(ib3.f78558c);
    }

    public final void D() {
        int i10 = this.f75869g1;
        if (i10 == -1 && this.f75870h1 == -1) {
            return;
        }
        oj3 oj3Var = this.f75873k1;
        if (oj3Var != null && oj3Var.f81057b == i10 && oj3Var.f81058c == this.f75870h1 && oj3Var.f81059d == this.f75871i1 && oj3Var.f81060e == this.f75872j1) {
            return;
        }
        oj3 oj3Var2 = new oj3(this.f75869g1, this.f75870h1, this.f75871i1, this.f75872j1);
        this.f75873k1 = oj3Var2;
        this.I0.b(oj3Var2);
    }

    public final void c(long j10) {
        pa0 pa0Var = this.B0;
        pa0Var.f81329k += j10;
        pa0Var.f81330l++;
        this.f75867e1 += j10;
        this.f75868f1++;
    }

    @Override // yads.mk1
    public final boolean q() {
        return this.f75874l1 && ib3.f78556a < 23;
    }

    @Override // yads.mk1, yads.ro
    public final boolean g() {
        hd2 hd2Var;
        if (super.g() && (this.T0 || (((hd2Var = this.Q0) != null && this.P0 == hd2Var) || this.K == null || this.f75874l1))) {
            this.X0 = -9223372036854775807L;
            return true;
        }
        if (this.X0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.X0) {
            return true;
        }
        this.X0 = -9223372036854775807L;
        return false;
    }

    @Override // yads.mk1
    public final void s() {
        z();
    }

    @Override // yads.mk1
    public final void w() {
        super.w();
        this.f75864b1 = 0;
    }

    @Override // yads.ro
    public final void k() {
        Surface surface;
        this.X0 = -9223372036854775807L;
        if (this.Z0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.a(this.Z0, jElapsedRealtime - this.Y0);
            this.Z0 = 0;
            this.Y0 = jElapsedRealtime;
        }
        int i10 = this.f75868f1;
        if (i10 != 0) {
            this.I0.c(i10, this.f75867e1);
            this.f75867e1 = 0L;
            this.f75868f1 = 0;
        }
        uh3 uh3Var = this.H0;
        uh3Var.f83472d = false;
        qh3 qh3Var = uh3Var.f83470b;
        if (qh3Var != null) {
            qh3Var.a();
            th3 th3Var = uh3Var.f83471c;
            th3Var.getClass();
            th3Var.f83055c.sendEmptyMessage(2);
        }
        if (ib3.f78556a >= 30 && (surface = uh3Var.f83473e) != null && uh3Var.f83478j != Integer.MIN_VALUE && uh3Var.f83476h != 0.0f) {
            uh3Var.f83476h = 0.0f;
            oh3.a(surface, 0.0f);
        }
    }

    public static int a(mx0 mx0Var, ik1 ik1Var) {
        int i10;
        int iIntValue;
        int i11 = mx0Var.f80434r;
        int i12 = mx0Var.f80435s;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        String str = mx0Var.f80429m;
        if ("video/dolby-vision".equals(str)) {
            Pair pairB = wk1.b(mx0Var);
            str = (pairB == null || !((iIntValue = ((Integer) pairB.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        int i13 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i10 = i12 * i11;
                i13 = 2;
                return (i10 * 3) / (i13 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i10 = i12 * i11;
                return (i10 * 3) / (i13 * 2);
            case "video/avc":
                cl1 cl1Var = pk2.f81444g;
                String strX = cl1Var.x();
                String str2 = ib3.f78559d;
                if (strX.equals(str2) || (cl1Var.q().equals(ib3.f78558c) && (cl1Var.J0().equals(str2) || (cl1Var.p().equals(str2) && ik1Var.f78685f)))) {
                    return -1;
                }
                i10 = ((i12 + 15) / 16) * ((i11 + 15) / 16) * 256;
                i13 = 2;
                return (i10 * 3) / (i13 * 2);
            default:
                return -1;
        }
    }

    public static int b(mx0 mx0Var, ik1 ik1Var) {
        if (mx0Var.f80430n != -1) {
            int size = mx0Var.f80431o.size();
            int length = 0;
            for (int i10 = 0; i10 < size; i10++) {
                length += ((byte[]) mx0Var.f80431o.get(i10)).length;
            }
            return mx0Var.f80430n + length;
        }
        return a(mx0Var, ik1Var);
    }

    @Override // yads.mk1
    public final void b(sa0 sa0Var) {
        boolean z10 = this.f75874l1;
        if (!z10) {
            this.f75864b1++;
        }
        if (ib3.f78556a >= 23 || !z10) {
            return;
        }
        long j10 = sa0Var.f82570f;
        b(j10);
        D();
        this.B0.f81323e++;
        this.V0 = true;
        if (!this.T0) {
            this.T0 = true;
            this.I0.a(this.P0);
            this.R0 = true;
        }
        a(j10);
    }

    @Override // yads.mk1
    public final float a(float f10, mx0[] mx0VarArr) {
        float fMax = -1.0f;
        for (mx0 mx0Var : mx0VarArr) {
            float f11 = mx0Var.f80436t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // yads.mk1
    public final ArrayList a(ok1 ok1Var, mx0 mx0Var, boolean z10) {
        return wk1.a(a(ok1Var, mx0Var, z10, this.f75874l1), mx0Var);
    }

    public static p51 a(ok1 ok1Var, mx0 mx0Var, boolean z10, boolean z11) {
        String str = mx0Var.f80429m;
        if (str == null) {
            m51 m51Var = p51.f81258c;
            return sm2.f82697f;
        }
        List decoderInfos = ok1Var.getDecoderInfos(str, z10, z11);
        String strA = wk1.a(mx0Var);
        if (strA == null) {
            return p51.a((Collection) decoderInfos);
        }
        List decoderInfos2 = ok1Var.getDecoderInfos(strA, z10, z11);
        m51 m51Var2 = p51.f81258c;
        return new l51().a(decoderInfos).a(decoderInfos2).a();
    }

    public final boolean b(ik1 ik1Var) {
        boolean z10;
        int i10;
        if (ib3.f78556a < 23 || this.f75874l1 || b(ik1Var.f78680a)) {
            return false;
        }
        if (ik1Var.f78685f) {
            Context context = this.G0;
            synchronized (hd2.class) {
                if (!hd2.f78181f) {
                    if (sz0.a(context)) {
                        i10 = sz0.c() ? 1 : 2;
                    } else {
                        i10 = 0;
                    }
                    hd2.f78180e = i10;
                    hd2.f78181f = true;
                }
                z10 = hd2.f78180e != 0;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // yads.mk1
    public final ak1 a(ik1 ik1Var, mx0 mx0Var, MediaCrypto mediaCrypto, float f10) {
        zk1 zk1Var;
        Point point;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        Pair pairB;
        int iA;
        hd2 hd2Var = this.Q0;
        if (hd2Var != null && hd2Var.f78182b != ik1Var.f78685f) {
            if (this.P0 == hd2Var) {
                this.P0 = null;
            }
            hd2Var.release();
            this.Q0 = null;
        }
        String str = ik1Var.f78682c;
        mx0[] mx0VarArr = this.f82361i;
        mx0VarArr.getClass();
        int iMax = mx0Var.f80434r;
        int iMax2 = mx0Var.f80435s;
        int iB = b(mx0Var, ik1Var);
        if (mx0VarArr.length == 1) {
            if (iB != -1 && (iA = a(mx0Var, ik1Var)) != -1) {
                iB = Math.min((int) (iB * 1.5f), iA);
            }
            zk1Var = new zk1(iMax, iMax2, iB);
        } else {
            int length = mx0VarArr.length;
            boolean z11 = false;
            for (int i14 = 0; i14 < length; i14++) {
                mx0 mx0Var2 = mx0VarArr[i14];
                if (mx0Var.f80441y != null && mx0Var2.f80441y == null) {
                    lx0 lx0Var = new lx0(mx0Var2);
                    lx0Var.f79979w = mx0Var.f80441y;
                    mx0Var2 = new mx0(lx0Var);
                }
                if (ik1Var.a(mx0Var, mx0Var2).f83862d != 0) {
                    int i15 = mx0Var2.f80434r;
                    z11 |= i15 == -1 || mx0Var2.f80435s == -1;
                    iMax = Math.max(iMax, i15);
                    iMax2 = Math.max(iMax2, mx0Var2.f80435s);
                    iB = Math.max(iB, b(mx0Var2, ik1Var));
                }
            }
            if (z11) {
                ih1.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
                int i16 = mx0Var.f80435s;
                int i17 = mx0Var.f80434r;
                boolean z12 = i16 > i17;
                int i18 = z12 ? i16 : i17;
                if (z12) {
                    i16 = i17;
                }
                float f11 = i16 / i18;
                int[] iArr = f75860p1;
                int i19 = 9;
                int i20 = 0;
                while (true) {
                    if (i20 < i19) {
                        int i21 = iArr[i20];
                        int i22 = (int) (i21 * f11);
                        if (i21 > i18 && i22 > i16) {
                            int i23 = i16;
                            float f12 = f11;
                            if (ib3.f78556a >= 21) {
                                int i24 = z12 ? i22 : i21;
                                if (!z12) {
                                    i21 = i22;
                                }
                                point = ik1Var.a(i24, i21);
                                if (ik1Var.a(point.x, point.y, mx0Var.f80436t)) {
                                    break;
                                }
                                i20++;
                                i16 = i23;
                                f11 = f12;
                                i18 = i18;
                                iArr = iArr;
                                i19 = 9;
                            } else {
                                try {
                                    int i25 = ((i21 + 15) / 16) * 16;
                                    int i26 = ((i22 + 15) / 16) * 16;
                                    if (i25 * i26 <= wk1.a()) {
                                        int i27 = z12 ? i26 : i25;
                                        if (!z12) {
                                            i25 = i26;
                                        }
                                        point = new Point(i27, i25);
                                        break;
                                    }
                                    i20++;
                                    i16 = i23;
                                    f11 = f12;
                                    i18 = i18;
                                    iArr = iArr;
                                    i19 = 9;
                                } catch (rk1 unused) {
                                    point = null;
                                    break;
                                }
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    lx0 lx0Var2 = new lx0(mx0Var);
                    lx0Var2.f79972p = iMax;
                    lx0Var2.f79973q = iMax2;
                    iB = Math.max(iB, a(new mx0(lx0Var2), ik1Var));
                    ih1.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
                }
            }
            zk1Var = new zk1(iMax, iMax2, iB);
        }
        this.M0 = zk1Var;
        boolean z13 = this.L0;
        int i28 = this.f75874l1 ? this.f75875m1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", mx0Var.f80434r);
        mediaFormat.setInteger("height", mx0Var.f80435s);
        List list = mx0Var.f80431o;
        for (int i29 = 0; i29 < list.size(); i29++) {
            mediaFormat.setByteBuffer(mg2.a("csd-", i29), ByteBuffer.wrap((byte[]) list.get(i29)));
        }
        float f13 = mx0Var.f80436t;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        ql1.a(mediaFormat, "rotation-degrees", mx0Var.f80437u);
        mx mxVar = mx0Var.f80441y;
        if (mxVar != null) {
            ql1.a(mediaFormat, "color-transfer", mxVar.f80415d);
            ql1.a(mediaFormat, "color-standard", mxVar.f80413b);
            ql1.a(mediaFormat, "color-range", mxVar.f80414c);
            byte[] bArr = mxVar.f80416e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(mx0Var.f80429m) && (pairB = wk1.b(mx0Var)) != null) {
            ql1.a(mediaFormat, Scopes.PROFILE, ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", zk1Var.f85464a);
        mediaFormat.setInteger("max-height", zk1Var.f85465b);
        ql1.a(mediaFormat, "max-input-size", zk1Var.f85466c);
        if (ib3.f78556a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z13) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            i10 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
            i10 = 0;
        }
        if (i28 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i28);
        }
        if (this.P0 == null) {
            if (b(ik1Var)) {
                if (this.Q0 == null) {
                    Context context = this.G0;
                    boolean z14 = ik1Var.f78685f;
                    int i30 = hd2.f78180e;
                    if (z14) {
                        synchronized (hd2.class) {
                            if (hd2.f78181f) {
                                i11 = 1;
                            } else {
                                if (sz0.a(context)) {
                                    i13 = sz0.c() ? 1 : 2;
                                } else {
                                    i13 = i10;
                                }
                                hd2.f78180e = i13;
                                i11 = 1;
                                hd2.f78181f = true;
                            }
                            i12 = hd2.f78180e != 0 ? i11 : i10;
                        }
                        if (i12 == 0) {
                            throw new IllegalStateException();
                        }
                    }
                    this.Q0 = new gd2().a(z14 ? hd2.f78180e : i10);
                }
                this.P0 = this.Q0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new ak1(ik1Var, mediaFormat, mx0Var, this.P0, mediaCrypto);
    }

    @Override // yads.mk1
    public final void a(sa0 sa0Var) {
        if (this.O0) {
            ByteBuffer byteBuffer = sa0Var.f82571g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    dk1 dk1Var = this.K;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    dk1Var.a(bundle);
                }
            }
        }
    }

    @Override // yads.mk1
    public final void a(Exception exc) {
        ih1.b("MediaCodecVideoRenderer", ih1.a("Video codec error", exc));
        this.I0.b(exc);
    }

    @Override // yads.mk1
    public final void a(String str, long j10, long j11) {
        this.I0.a(str, j10, j11);
        this.N0 = b(str);
        ik1 ik1Var = this.R;
        ik1Var.getClass();
        this.O0 = ik1Var.a();
        if (ib3.f78556a < 23 || !this.f75874l1) {
            return;
        }
        dk1 dk1Var = this.K;
        dk1Var.getClass();
        this.f75876n1 = new al1(this, dk1Var);
    }

    @Override // yads.mk1
    public final void a(String str) {
        this.I0.a(str);
    }

    @Override // yads.ro
    public final void a(boolean z10) {
        this.B0 = new pa0();
        mn2 mn2Var = this.f82356d;
        mn2Var.getClass();
        boolean z11 = mn2Var.f80287a;
        if (z11 && this.f75875m1 == 0) {
            throw new IllegalStateException();
        }
        if (this.f75874l1 != z11) {
            this.f75874l1 = z11;
            u();
        }
        this.I0.b(this.B0);
        this.U0 = z10;
        this.V0 = false;
    }

    @Override // yads.mk1
    public final va0 a(nx0 nx0Var) {
        va0 va0VarA = super.a(nx0Var);
        this.I0.a(nx0Var.f80854b, va0VarA);
        return va0VarA;
    }

    @Override // yads.mk1
    public final void a(mx0 mx0Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        dk1 dk1Var = this.K;
        if (dk1Var != null) {
            dk1Var.setVideoScalingMode(this.S0);
        }
        if (this.f75874l1) {
            this.f75869g1 = mx0Var.f80434r;
            this.f75870h1 = mx0Var.f80435s;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f75869g1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f75870h1 = integer2;
        }
        float f10 = mx0Var.f80438v;
        this.f75872j1 = f10;
        if (ib3.f78556a >= 21) {
            int i10 = mx0Var.f80437u;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f75869g1;
                this.f75869g1 = this.f75870h1;
                this.f75870h1 = i11;
                this.f75872j1 = 1.0f / f10;
            }
        } else {
            this.f75871i1 = mx0Var.f80437u;
        }
        uh3 uh3Var = this.H0;
        uh3Var.f83474f = mx0Var.f80436t;
        kv0 kv0Var = uh3Var.f83469a;
        jv0 jv0Var = kv0Var.f79575a;
        jv0Var.f79201d = 0L;
        jv0Var.f79202e = 0L;
        jv0Var.f79203f = 0L;
        jv0Var.f79205h = 0;
        Arrays.fill(jv0Var.f79204g, false);
        jv0 jv0Var2 = kv0Var.f79576b;
        jv0Var2.f79201d = 0L;
        jv0Var2.f79202e = 0L;
        jv0Var2.f79203f = 0L;
        jv0Var2.f79205h = 0;
        Arrays.fill(jv0Var2.f79204g, false);
        kv0Var.f79577c = false;
        kv0Var.f79578d = -9223372036854775807L;
        kv0Var.f79579e = 0;
        uh3Var.b();
    }

    @Override // yads.mk1, yads.ro
    public final void a(long j10, boolean z10) {
        super.a(j10, z10);
        z();
        uh3 uh3Var = this.H0;
        uh3Var.f83481m = 0L;
        uh3Var.f83484p = -1L;
        uh3Var.f83482n = -1L;
        this.f75865c1 = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.f75863a1 = 0;
        if (z10) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
        } else {
            this.X0 = -9223372036854775807L;
        }
    }

    @Override // yads.mk1
    public final void a(long j10) {
        super.a(j10);
        if (this.f75874l1) {
            return;
        }
        this.f75864b1--;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    @Override // yads.mk1
    public final boolean a(long j10, long j11, dk1 dk1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, mx0 mx0Var) {
        int i13;
        int i14;
        boolean z12;
        long j13;
        long j14;
        boolean z13;
        dk1Var.getClass();
        if (this.W0 == -9223372036854775807L) {
            this.W0 = j10;
        }
        if (j12 != this.f75865c1) {
            uh3 uh3Var = this.H0;
            long j15 = uh3Var.f83482n;
            if (j15 != -1) {
                uh3Var.f83484p = j15;
                uh3Var.f83485q = uh3Var.f83483o;
            }
            uh3Var.f83481m++;
            kv0 kv0Var = uh3Var.f83469a;
            long j16 = j12 * 1000;
            kv0Var.f79575a.a(j16);
            if (kv0Var.f79575a.a()) {
                kv0Var.f79577c = false;
            } else if (kv0Var.f79578d != -9223372036854775807L) {
                if (kv0Var.f79577c) {
                    jv0 jv0Var = kv0Var.f79576b;
                    long j17 = jv0Var.f79201d;
                    if (j17 != 0 && jv0Var.f79204g[(int) ((j17 - 1) % 15)]) {
                        jv0 jv0Var2 = kv0Var.f79576b;
                        jv0Var2.f79201d = 0L;
                        jv0Var2.f79202e = 0L;
                        jv0Var2.f79203f = 0L;
                        jv0Var2.f79205h = 0;
                        Arrays.fill(jv0Var2.f79204g, false);
                        kv0Var.f79576b.a(kv0Var.f79578d);
                    }
                } else {
                    jv0 jv0Var3 = kv0Var.f79576b;
                    jv0Var3.f79201d = 0L;
                    jv0Var3.f79202e = 0L;
                    jv0Var3.f79203f = 0L;
                    jv0Var3.f79205h = 0;
                    Arrays.fill(jv0Var3.f79204g, false);
                    kv0Var.f79576b.a(kv0Var.f79578d);
                }
                kv0Var.f79577c = true;
                kv0Var.f79576b.a(j16);
            }
            if (kv0Var.f79577c && kv0Var.f79576b.a()) {
                jv0 jv0Var4 = kv0Var.f79575a;
                kv0Var.f79575a = kv0Var.f79576b;
                kv0Var.f79576b = jv0Var4;
                kv0Var.f79577c = false;
            }
            kv0Var.f79578d = j16;
            kv0Var.f79579e = kv0Var.f79575a.a() ? 0 : kv0Var.f79579e + 1;
            uh3Var.b();
            this.f75865c1 = j12;
        }
        long j18 = this.D0;
        long j19 = j12 - j18;
        if (z10 && !z11) {
            d73.a("skipVideoBuffer");
            dk1Var.a(false, i10);
            d73.a();
            this.B0.f81324f++;
            return true;
        }
        double d10 = this.I;
        boolean z14 = this.f82359g == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j20 = (long) ((j12 - j10) / d10);
        if (z14) {
            j20 -= jElapsedRealtime - j11;
        }
        if (this.P0 == this.Q0) {
            if (j20 >= -30000) {
                return false;
            }
            d73.a("skipVideoBuffer");
            dk1Var.a(false, i10);
            d73.a();
            this.B0.f81324f++;
            c(j20);
            return true;
        }
        long j21 = jElapsedRealtime - this.f75866d1;
        boolean z15 = this.V0 ? !this.T0 : z14 || this.U0;
        if (this.X0 == -9223372036854775807L && j10 >= j18 && (z15 || (z14 && j20 < -30000 && j21 > 100000))) {
            long jNanoTime = System.nanoTime();
            nh3 nh3Var = this.f75877o1;
            if (nh3Var != null) {
                nh3Var.a(j19, jNanoTime, mx0Var, this.M);
            }
            if (ib3.f78556a >= 21) {
                D();
                d73.a("releaseOutputBuffer");
                dk1Var.a(i10, jNanoTime);
                d73.a();
                this.f75866d1 = SystemClock.elapsedRealtime() * 1000;
                z13 = true;
                this.B0.f81323e++;
                this.f75863a1 = 0;
                this.V0 = true;
                if (!this.T0) {
                    this.T0 = true;
                    this.I0.a(this.P0);
                    this.R0 = true;
                }
            } else {
                z13 = true;
                D();
                d73.a("releaseOutputBuffer");
                dk1Var.a(true, i10);
                d73.a();
                this.f75866d1 = SystemClock.elapsedRealtime() * 1000;
                this.B0.f81323e++;
                this.f75863a1 = 0;
                this.V0 = true;
                if (!this.T0) {
                    this.T0 = true;
                    this.I0.a(this.P0);
                    this.R0 = true;
                }
            }
            c(j20);
            return z13;
        }
        if (!z14 || j10 == this.W0) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long j22 = (j20 * 1000) + jNanoTime2;
        uh3 uh3Var2 = this.H0;
        if (uh3Var2.f83484p != -1 && uh3Var2.f83469a.f79575a.a()) {
            kv0 kv0Var2 = uh3Var2.f83469a;
            if (kv0Var2.f79575a.a()) {
                jv0 jv0Var5 = kv0Var2.f79575a;
                long j23 = jv0Var5.f79202e;
                j14 = j23 == 0 ? 0L : jv0Var5.f79203f / j23;
            } else {
                j14 = -9223372036854775807L;
            }
            long j24 = uh3Var2.f83485q + ((long) (((uh3Var2.f83481m - uh3Var2.f83484p) * j14) / uh3Var2.f83477i));
            if (Math.abs(j22 - j24) <= 20000000) {
                j22 = j24;
            } else {
                uh3Var2.f83481m = 0L;
                uh3Var2.f83484p = -1L;
                uh3Var2.f83482n = -1L;
            }
        }
        uh3Var2.f83482n = uh3Var2.f83481m;
        uh3Var2.f83483o = j22;
        th3 th3Var = uh3Var2.f83471c;
        if (th3Var != null && uh3Var2.f83479k != -9223372036854775807L) {
            long j25 = th3Var.f83054b;
            if (j25 != -9223372036854775807L) {
                long j26 = uh3Var2.f83479k;
                long j27 = (((j22 - j25) / j26) * j26) + j25;
                if (j22 <= j27) {
                    j13 = j27 - j26;
                } else {
                    j13 = j27;
                    j27 = j26 + j27;
                }
                if (j27 - j22 >= j22 - j13) {
                    j27 = j13;
                }
                j22 = j27 - uh3Var2.f83480l;
            }
        }
        long j28 = (j22 - jNanoTime2) / 1000;
        boolean z16 = this.X0 != -9223372036854775807L;
        if (j28 < -500000 && !z11) {
            ns2 ns2Var = this.f82360h;
            ns2Var.getClass();
            int iA = ns2Var.a(j10 - this.f82362j);
            if (iA != 0) {
                if (z16) {
                    pa0 pa0Var = this.B0;
                    pa0Var.f81322d += iA;
                    pa0Var.f81324f += this.f75864b1;
                } else {
                    pa0 pa0Var2 = this.B0;
                    pa0Var2.f81328j++;
                    int i15 = this.f75864b1;
                    pa0Var2.f81326h += iA;
                    int i16 = iA + i15;
                    pa0Var2.f81325g += i16;
                    this.Z0 += i16;
                    int i17 = this.f75863a1 + i16;
                    this.f75863a1 = i17;
                    pa0Var2.f81327i = Math.max(i17, pa0Var2.f81327i);
                    int i18 = this.K0;
                    if (i18 > 0 && (i14 = this.Z0) >= i18 && i14 > 0) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        this.I0.a(this.Z0, jElapsedRealtime2 - this.Y0);
                        z12 = false;
                        this.Z0 = 0;
                        this.Y0 = jElapsedRealtime2;
                    }
                    if (p()) {
                        r();
                    }
                    return z12;
                }
                z12 = false;
                if (p()) {
                    r();
                }
                return z12;
            }
        }
        if (j28 < -30000 && !z11) {
            if (z16) {
                d73.a("skipVideoBuffer");
                dk1Var.a(false, i10);
                d73.a();
                this.B0.f81324f++;
            } else {
                d73.a("dropVideoBuffer");
                dk1Var.a(false, i10);
                d73.a();
                pa0 pa0Var3 = this.B0;
                pa0Var3.f81326h = pa0Var3.f81326h;
                pa0Var3.f81325g++;
                this.Z0++;
                int i19 = this.f75863a1 + 1;
                this.f75863a1 = i19;
                pa0Var3.f81327i = Math.max(i19, pa0Var3.f81327i);
                int i20 = this.K0;
                if (i20 > 0 && (i13 = this.Z0) >= i20 && i13 > 0) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    this.I0.a(this.Z0, jElapsedRealtime3 - this.Y0);
                    this.Z0 = 0;
                    this.Y0 = jElapsedRealtime3;
                }
            }
            c(j28);
            return true;
        }
        if (ib3.f78556a >= 21) {
            if (j28 >= ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                return false;
            }
            nh3 nh3Var2 = this.f75877o1;
            if (nh3Var2 != null) {
                nh3Var2.a(j19, j22, mx0Var, this.M);
            }
            D();
            d73.a("releaseOutputBuffer");
            dk1Var.a(i10, j22);
            d73.a();
            this.f75866d1 = SystemClock.elapsedRealtime() * 1000;
            this.B0.f81323e++;
            this.f75863a1 = 0;
            this.V0 = true;
            if (!this.T0) {
                this.T0 = true;
                this.I0.a(this.P0);
                this.R0 = true;
            }
            c(j28);
            return true;
        }
        if (j28 >= 30000) {
            return false;
        }
        if (j28 > 11000) {
            try {
                Thread.sleep((j28 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        nh3 nh3Var3 = this.f75877o1;
        if (nh3Var3 != null) {
            nh3Var3.a(j19, j22, mx0Var, this.M);
        }
        D();
        d73.a("releaseOutputBuffer");
        dk1Var.a(true, i10);
        d73.a();
        this.f75866d1 = SystemClock.elapsedRealtime() * 1000;
        this.B0.f81323e++;
        this.f75863a1 = 0;
        this.V0 = true;
        if (!this.T0) {
            this.T0 = true;
            this.I0.a(this.P0);
            this.R0 = true;
        }
        c(j28);
        return true;
    }

    @Override // yads.mk1, yads.ro
    public final void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        c(this.L);
        uh3 uh3Var = this.H0;
        uh3Var.f83477i = f10;
        uh3Var.f83481m = 0L;
        uh3Var.f83484p = -1L;
        uh3Var.f83482n = -1L;
        uh3Var.a(false);
    }

    @Override // yads.mk1
    public final boolean a(ik1 ik1Var) {
        return this.P0 != null || b(ik1Var);
    }

    @Override // yads.mk1
    public final int a(ok1 ok1Var, mx0 mx0Var) {
        boolean z10;
        int i10 = 0;
        if (!"video".equals(ht1.c(mx0Var.f80429m))) {
            return ro.a(0, 0, 0);
        }
        boolean z11 = mx0Var.f80432p != null;
        p51 p51VarA = a(ok1Var, mx0Var, z11, false);
        if (z11 && p51VarA.isEmpty()) {
            p51VarA = a(ok1Var, mx0Var, false, false);
        }
        if (p51VarA.isEmpty()) {
            return ro.a(1, 0, 0);
        }
        int i11 = mx0Var.F;
        if (i11 != 0 && i11 != 2) {
            return ro.a(2, 0, 0);
        }
        ik1 ik1Var = (ik1) p51VarA.get(0);
        boolean zA = ik1Var.a(mx0Var);
        if (!zA) {
            int i12 = 1;
            while (true) {
                if (i12 >= p51VarA.size()) {
                    z10 = true;
                    break;
                }
                ik1 ik1Var2 = (ik1) p51VarA.get(i12);
                if (ik1Var2.a(mx0Var)) {
                    z10 = false;
                    zA = true;
                    ik1Var = ik1Var2;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            break;
        }
        int i13 = zA ? 4 : 3;
        int i14 = ik1Var.b(mx0Var) ? 16 : 8;
        int i15 = ik1Var.f78686g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (zA) {
            p51 p51VarA2 = a(ok1Var, mx0Var, z11, true);
            if (!p51VarA2.isEmpty()) {
                ik1 ik1Var3 = (ik1) wk1.a(p51VarA2, mx0Var).get(0);
                if (ik1Var3.a(mx0Var) && ik1Var3.b(mx0Var)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // yads.mk1
    public final hk1 a(IllegalStateException illegalStateException, ik1 ik1Var) {
        return new yk1(illegalStateException, ik1Var, this.P0);
    }
}
