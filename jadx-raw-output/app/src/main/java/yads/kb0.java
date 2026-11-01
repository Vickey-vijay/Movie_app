package yads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import yads.af;
import yads.be2;
import yads.dw0;
import yads.ee2;
import yads.fm1;
import yads.hm1;
import yads.ig0;
import yads.jm1;
import yads.kb0;
import yads.le2;
import yads.mx0;
import yads.o83;
import yads.pa0;
import yads.q20;
import yads.ts1;
import yads.va0;
import yads.vf1;
import yads.ye;

/* JADX INFO: loaded from: classes8.dex */
public final class kb0 implements se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv f79350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p63 f79351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r63 f79352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb0 f79353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f79354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pf1 f79355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public oe2 f79356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i53 f79357h;

    public static /* synthetic */ void a(af afVar, dw0 dw0Var) {
    }

    public final ye a() {
        return a(this.f79353d.f78963d);
    }

    public final ye b() {
        return a(this.f79353d.f78965f);
    }

    public final ye e(int i10, ym1 ym1Var) {
        this.f79356g.getClass();
        if (ym1Var != null) {
            return ((s63) this.f79353d.f78962c.get(ym1Var)) != null ? a(ym1Var) : a(s63.f82545b, i10, ym1Var);
        }
        zn0 zn0Var = (zn0) this.f79356g;
        zn0Var.r();
        s63 s63Var = zn0Var.Z.f76249a;
        if (i10 >= s63Var.b()) {
            s63Var = s63.f82545b;
        }
        return a(s63Var, i10, (ym1) null);
    }

    @Override // yads.me2
    public final void onRenderedFirstFrame() {
    }

    public kb0(xv xvVar) {
        this.f79350a = (xv) ni.a(xvVar);
        this.f79355f = new pf1(ib3.c(), xvVar, new nf1() { // from class: cp.x4
            @Override // yads.nf1
            public final void a(Object obj, dw0 dw0Var) {
                kb0.a((af) obj, dw0Var);
            }
        });
        p63 p63Var = new p63();
        this.f79351b = p63Var;
        this.f79352c = new r63();
        this.f79353d = new jb0(p63Var);
        this.f79354e = new SparseArray();
    }

    @Override // yads.me2
    public final void onCues(final List list) {
        final ye yeVarA = a();
        a(yeVarA, 27, new mf1() { // from class: cp.f5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                List list2 = list;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onIsLoadingChanged(final boolean z10) {
        final ye yeVarA = a();
        a(yeVarA, 3, new mf1() { // from class: cp.a5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                boolean z11 = z10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onIsPlayingChanged(final boolean z10) {
        final ye yeVarA = a();
        a(yeVarA, 7, new mf1() { // from class: cp.o4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                boolean z11 = z10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 5, new mf1() { // from class: cp.n4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                boolean z11 = z10;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onPlaybackStateChanged(final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 4, new mf1() { // from class: cp.b4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 6, new mf1() { // from class: cp.c5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final ye yeVarA = a();
        a(yeVarA, -1, new mf1() { // from class: cp.r4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                boolean z11 = z10;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final ye yeVarB = b();
        a(yeVarB, 23, new mf1() { // from class: cp.u5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                boolean z11 = z10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final ye yeVarB = b();
        a(yeVarB, 24, new mf1() { // from class: cp.m4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                int i12 = i10;
                int i13 = i11;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onVolumeChanged(final float f10) {
        final ye yeVarB = b();
        a(yeVarB, 22, new mf1() { // from class: cp.i4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                float f11 = f10;
                ((af) obj).getClass();
            }
        });
    }

    public final ye a(ym1 ym1Var) {
        this.f79356g.getClass();
        s63 s63Var = ym1Var == null ? null : (s63) this.f79353d.f78962c.get(ym1Var);
        if (ym1Var != null && s63Var != null) {
            return a(s63Var, s63Var.a(ym1Var.f82311a, this.f79351b).f81268d, ym1Var);
        }
        int iE = ((zn0) this.f79356g).e();
        zn0 zn0Var = (zn0) this.f79356g;
        zn0Var.r();
        s63 s63Var2 = zn0Var.Z.f76249a;
        if (iE >= s63Var2.b()) {
            s63Var2 = s63.f82545b;
        }
        return a(s63Var2, iE, (ym1) null);
    }

    @Override // yads.pk0
    public final void d(int i10, ym1 ym1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1026, new mf1() { // from class: cp.o5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                ((af) obj).getClass();
            }
        });
    }

    public static void b(ye yeVar, int i10, long j10, long j11, af afVar) {
        String str;
        mm1 mm1Var = (mm1) afVar;
        mm1Var.getClass();
        ym1 ym1Var = yeVar.f84912d;
        if (ym1Var != null) {
            oe0 oe0Var = mm1Var.f80260b;
            s63 s63Var = yeVar.f84910b;
            synchronized (oe0Var) {
                str = oe0Var.a(s63Var.a(ym1Var.f82311a, oe0Var.f81015b).f81268d, ym1Var).f80651a;
            }
            Long l10 = (Long) mm1Var.f80266h.get(str);
            Long l11 = (Long) mm1Var.f80265g.get(str);
            mm1Var.f80266h.put(str, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            mm1Var.f80265g.put(str, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    public static void c(ye yeVar, pa0 pa0Var, af afVar) {
        mm1 mm1Var = (mm1) afVar;
        mm1Var.f80282x += pa0Var.f81325g;
        mm1Var.f80283y += pa0Var.f81323e;
    }

    public final void d(final pa0 pa0Var) {
        final ye yeVarB = b();
        a(yeVarB, 1015, new mf1() { // from class: cp.h5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                pa0 pa0Var2 = pa0Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void d() {
        final ye yeVarA = a();
        a(yeVarA, 1028, new mf1() { // from class: cp.p5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                ((af) obj).getClass();
            }
        });
        pf1 pf1Var = this.f79355f;
        for (of1 of1Var : pf1Var.f81397d) {
            nf1 nf1Var = pf1Var.f81396c;
            of1Var.f81029d = true;
            if (of1Var.f81028c) {
                nf1Var.a(of1Var.f81026a, of1Var.f81027b.a());
            }
        }
        pf1Var.f81397d.clear();
        pf1Var.f81400g = true;
    }

    @Override // yads.pk0
    public final void c(int i10, ym1 ym1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1025, new mf1() { // from class: cp.l4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void c(int i10, ym1 ym1Var, final vf1 vf1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1002, new mf1() { // from class: cp.w3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                vf1 vf1Var2 = vf1Var;
                hm1 hm1Var2 = hm1Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void c(final Exception exc) {
        final ye yeVarB = b();
        a(yeVarB, 1030, new mf1() { // from class: cp.q5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                Exception exc2 = exc;
                ((af) obj).getClass();
            }
        });
    }

    public final void c(final pa0 pa0Var) {
        final ye yeVarA = a(this.f79353d.f78964e);
        a(yeVarA, 1020, new mf1() { // from class: cp.w4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.c(yeVarA, pa0Var, (af) obj);
            }
        });
    }

    public final ye a(s63 s63Var, int i10, ym1 ym1Var) {
        ym1 ym1Var2 = s63Var.c() ? null : ym1Var;
        ((f53) this.f79350a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zn0 zn0Var = (zn0) this.f79356g;
        zn0Var.r();
        boolean z10 = s63Var.equals(zn0Var.Z.f76249a) && i10 == ((zn0) this.f79356g).e();
        long jB = 0;
        if (ym1Var2 == null || !ym1Var2.a()) {
            if (z10) {
                jB = ((zn0) this.f79356g).b();
            } else if (!s63Var.c()) {
                jB = ib3.b(s63Var.a(i10, this.f79352c, 0L).f82130n);
            }
        } else if (z10 && ((zn0) this.f79356g).c() == ym1Var2.f82312b && ((zn0) this.f79356g).d() == ym1Var2.f82313c) {
            zn0 zn0Var2 = (zn0) this.f79356g;
            zn0Var2.r();
            jB = ib3.b(zn0Var2.a(zn0Var2.Z));
        }
        ym1 ym1Var3 = this.f79353d.f78963d;
        zn0 zn0Var3 = (zn0) this.f79356g;
        zn0Var3.r();
        s63 s63Var2 = zn0Var3.Z.f76249a;
        int iE = ((zn0) this.f79356g).e();
        zn0 zn0Var4 = (zn0) this.f79356g;
        zn0Var4.r();
        long jB2 = ib3.b(zn0Var4.a(zn0Var4.Z));
        zn0 zn0Var5 = (zn0) this.f79356g;
        zn0Var5.r();
        return new ye(jElapsedRealtime, s63Var, i10, ym1Var2, jB, s63Var2, iE, ym1Var3, jB2, ib3.b(zn0Var5.Z.f76265q));
    }

    public final void c() {
        i53 i53Var = this.f79357h;
        if (i53Var != null) {
            i53Var.f78499a.post(new Runnable() { // from class: cp.a6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51229b.d();
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public final void b(final pa0 pa0Var) {
        final ye yeVarB = b();
        a(yeVarB, 1007, new mf1() { // from class: cp.k4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                pa0 pa0Var2 = pa0Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final Exception exc) {
        final ye yeVarB = b();
        a(yeVarB, 1014, new mf1() { // from class: cp.v4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                Exception exc2 = exc;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final int i10, final long j10, final long j11) {
        jb0 jb0Var = this.f79353d;
        final ye yeVarA = a(jb0Var.f78961b.isEmpty() ? null : (ym1) vd1.a(jb0Var.f78961b));
        a(yeVarA, 1006, new mf1() { // from class: cp.v5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.b(yeVarA, i10, j10, j11, (af) obj);
            }
        });
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1004, new mf1() { // from class: cp.q4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarE, hm1Var, (af) obj);
            }
        });
    }

    @Override // yads.pk0
    public final void b(int i10, ym1 ym1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1027, new mf1() { // from class: cp.m5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, final vf1 vf1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1000, new mf1() { // from class: cp.b5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                vf1 vf1Var2 = vf1Var;
                hm1 hm1Var2 = hm1Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void b(final pn0 pn0Var) {
        final ye yeVarA;
        rm1 rm1Var;
        if ((pn0Var instanceof pn0) && (rm1Var = pn0Var.f81465i) != null) {
            yeVarA = a(new ym1(rm1Var));
        } else {
            yeVarA = a();
        }
        a(yeVarA, 10, new mf1() { // from class: cp.t4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                be2 be2Var = pn0Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final String str, final long j10, final long j11) {
        final ye yeVarB = b();
        a(yeVarB, 1016, new mf1() { // from class: cp.z3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                String str2 = str;
                long j12 = j11;
                long j13 = j10;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final String str) {
        final ye yeVarB = b();
        a(yeVarB, 1019, new mf1() { // from class: cp.c4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                String str2 = str;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final int i10, final long j10) {
        final ye yeVarA = a(this.f79353d.f78964e);
        a(yeVarA, 1021, new mf1() { // from class: cp.s4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                long j11 = j10;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final mx0 mx0Var, final va0 va0Var) {
        final ye yeVarB = b();
        a(yeVarB, 1017, new mf1() { // from class: cp.n5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                mx0 mx0Var2 = mx0Var;
                va0 va0Var2 = va0Var;
                ((af) obj).getClass();
            }
        });
    }

    public static void a(ye yeVar, hm1 hm1Var, af afVar) {
        String str;
        mm1 mm1Var = (mm1) afVar;
        mm1Var.getClass();
        if (yeVar.f84912d == null) {
            return;
        }
        mx0 mx0Var = hm1Var.f78279c;
        mx0Var.getClass();
        int i10 = hm1Var.f78280d;
        oe0 oe0Var = mm1Var.f80260b;
        s63 s63Var = yeVar.f84910b;
        ym1 ym1Var = yeVar.f84912d;
        ym1Var.getClass();
        synchronized (oe0Var) {
            str = oe0Var.a(s63Var.a(ym1Var.f82311a, oe0Var.f81015b).f81268d, ym1Var).f80651a;
        }
        lm1 lm1Var = new lm1(mx0Var, i10, str);
        int i11 = hm1Var.f78278b;
        if (i11 != 0) {
            if (i11 == 1) {
                mm1Var.f80274p = lm1Var;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                mm1Var.f80275q = lm1Var;
                return;
            }
        }
        mm1Var.f80273o = lm1Var;
    }

    public static void a(ye yeVar, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10, af afVar) {
        mm1 mm1Var = (mm1) afVar;
        mm1Var.getClass();
        mm1Var.f80280v = hm1Var.f78277a;
    }

    public static void a(ye yeVar, be2 be2Var, af afVar) {
        ((mm1) afVar).f80272n = be2Var;
    }

    public static void a(ye yeVar, int i10, ne2 ne2Var, ne2 ne2Var2, af afVar) {
        afVar.getClass();
        mm1 mm1Var = (mm1) afVar;
        if (i10 == 1) {
            mm1Var.f80279u = true;
        }
        mm1Var.f80269k = i10;
    }

    public static void a(ye yeVar, oj3 oj3Var, af afVar) {
        mm1 mm1Var = (mm1) afVar;
        lm1 lm1Var = mm1Var.f80273o;
        if (lm1Var != null) {
            mx0 mx0Var = lm1Var.f79851a;
            if (mx0Var.f80435s == -1) {
                lx0 lx0Var = new lx0(mx0Var);
                lx0Var.f79972p = oj3Var.f81057b;
                lx0Var.f79973q = oj3Var.f81058c;
                mm1Var.f80273o = new lm1(new mx0(lx0Var), lm1Var.f79852b, lm1Var.f79853c);
            }
        }
        int i10 = oj3Var.f81057b;
    }

    public final /* synthetic */ void a(oe2 oe2Var, af afVar, dw0 dw0Var) {
        ((mm1) afVar).a(oe2Var, new ze(dw0Var, this.f79354e));
    }

    public final void a(final Exception exc) {
        final ye yeVarB = b();
        a(yeVarB, 1029, new mf1() { // from class: cp.j5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                Exception exc2 = exc;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final String str, final long j10, final long j11) {
        final ye yeVarB = b();
        a(yeVarB, 1008, new mf1() { // from class: cp.e4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                String str2 = str;
                long j12 = j11;
                long j13 = j10;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final String str) {
        final ye yeVarB = b();
        a(yeVarB, 1012, new mf1() { // from class: cp.z4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                String str2 = str;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final pa0 pa0Var) {
        final ye yeVarA = a(this.f79353d.f78964e);
        a(yeVarA, 1013, new mf1() { // from class: cp.i5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                pa0 pa0Var2 = pa0Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final mx0 mx0Var, final va0 va0Var) {
        final ye yeVarB = b();
        a(yeVarB, 1009, new mf1() { // from class: cp.g4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                mx0 mx0Var2 = mx0Var;
                va0 va0Var2 = va0Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final long j10) {
        final ye yeVarB = b();
        a(yeVarB, 1010, new mf1() { // from class: cp.y3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                long j11 = j10;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final int i10, final long j10, final long j11) {
        final ye yeVarB = b();
        a(yeVarB, 1011, new mf1() { // from class: cp.x3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                int i11 = i10;
                long j12 = j10;
                long j13 = j11;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final le2 le2Var) {
        final ye yeVarA = a();
        a(yeVarA, 13, new mf1() { // from class: cp.j4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                le2 le2Var2 = le2Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final q20 q20Var) {
        final ye yeVarA = a();
        a(yeVarA, 27, new mf1() { // from class: cp.h4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                q20 q20Var2 = q20Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final ig0 ig0Var) {
        final ye yeVarA = a();
        a(yeVarA, 29, new mf1() { // from class: cp.d4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                ig0 ig0Var2 = ig0Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final boolean z10, final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 30, new mf1() { // from class: cp.l5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                boolean z11 = z10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1023, new mf1() { // from class: cp.p4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, final int i11) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1022, new mf1() { // from class: cp.f4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                int i12 = i11;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, final Exception exc) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1024, new mf1() { // from class: cp.y5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                Exception exc2 = exc;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final int i10, final long j10) {
        final ye yeVarA = a(this.f79353d.f78964e);
        a(yeVarA, 1018, new mf1() { // from class: cp.d5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                long j11 = j10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, final vf1 vf1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1001, new mf1() { // from class: cp.w5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                vf1 vf1Var2 = vf1Var;
                hm1 hm1Var2 = hm1Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, final vf1 vf1Var, final hm1 hm1Var, final IOException iOException, final boolean z10) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1003, new mf1() { // from class: cp.u3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarE, vf1Var, hm1Var, iOException, z10, (af) obj);
            }
        });
    }

    @Override // yads.me2
    public final void a(final fm1 fm1Var, final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 1, new mf1() { // from class: cp.g5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                fm1 fm1Var2 = fm1Var;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final jm1 jm1Var) {
        final ye yeVarA = a();
        a(yeVarA, 14, new mf1() { // from class: cp.y4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                jm1 jm1Var2 = jm1Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final ts1 ts1Var) {
        final ye yeVarA = a();
        a(yeVarA, 28, new mf1() { // from class: cp.k5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                ts1 ts1Var2 = ts1Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final ee2 ee2Var) {
        final ye yeVarA = a();
        a(yeVarA, 12, new mf1() { // from class: cp.e5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                ee2 ee2Var2 = ee2Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final pn0 pn0Var) {
        final ye yeVarA;
        rm1 rm1Var;
        if ((pn0Var instanceof pn0) && (rm1Var = pn0Var.f81465i) != null) {
            yeVarA = a(new ym1(rm1Var));
        } else {
            yeVarA = a();
        }
        a(yeVarA, 10, new mf1() { // from class: cp.v3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarA, pn0Var, (af) obj);
            }
        });
    }

    @Override // yads.me2
    public final void a(final ne2 ne2Var, final ne2 ne2Var2, final int i10) {
        jb0 jb0Var = this.f79353d;
        oe2 oe2Var = this.f79356g;
        oe2Var.getClass();
        jb0Var.f78963d = jb0.a(oe2Var, jb0Var.f78961b, jb0Var.f78964e, jb0Var.f78960a);
        final ye yeVarA = a();
        a(yeVarA, 11, new mf1() { // from class: cp.a4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarA, i10, ne2Var, ne2Var2, (af) obj);
            }
        });
    }

    public final void a(final Object obj, final long j10) {
        final ye yeVarB = b();
        a(yeVarB, 26, new mf1() { // from class: cp.t5
            @Override // yads.mf1
            public final void invoke(Object obj2) {
                ye yeVar = yeVarB;
                Object obj3 = obj;
                long j11 = j10;
                ((af) obj2).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final int i10) {
        jb0 jb0Var = this.f79353d;
        oe2 oe2Var = this.f79356g;
        oe2Var.getClass();
        jb0Var.f78963d = jb0.a(oe2Var, jb0Var.f78961b, jb0Var.f78964e, jb0Var.f78960a);
        zn0 zn0Var = (zn0) oe2Var;
        zn0Var.r();
        jb0Var.a(zn0Var.Z.f76249a);
        final ye yeVarA = a();
        a(yeVarA, 0, new mf1() { // from class: cp.r5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final o83 o83Var) {
        final ye yeVarA = a();
        a(yeVarA, 2, new mf1() { // from class: cp.u4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                o83 o83Var2 = o83Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1005, new mf1() { // from class: cp.z5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                hm1 hm1Var2 = hm1Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final oj3 oj3Var) {
        final ye yeVarB = b();
        a(yeVarB, 25, new mf1() { // from class: cp.s5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarB, oj3Var, (af) obj);
            }
        });
    }

    public final void a(ye yeVar, int i10, mf1 mf1Var) {
        this.f79354e.put(i10, yeVar);
        pf1 pf1Var = this.f79355f;
        pf1Var.a(i10, mf1Var);
        pf1Var.a();
    }

    public final void a(final oe2 oe2Var, Looper looper) {
        if (this.f79356g != null && !this.f79353d.f78961b.isEmpty()) {
            throw new IllegalStateException();
        }
        this.f79356g = oe2Var;
        this.f79357h = ((f53) this.f79350a).a(looper, null);
        pf1 pf1Var = this.f79355f;
        nf1 nf1Var = new nf1() { // from class: cp.x5
            @Override // yads.nf1
            public final void a(Object obj, dw0 dw0Var) {
                this.f51688a.a(oe2Var, (af) obj, dw0Var);
            }
        };
        this.f79355f = new pf1(pf1Var.f81397d, looper, pf1Var.f81394a, nf1Var);
    }
}
