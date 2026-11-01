package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm1 f81888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ns2[] f81890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sm1 f81893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f81895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ro[] f81896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s73 f81897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final in1 f81898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qm1 f81899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i73 f81900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t73 f81901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f81902o;

    public final long a(t73 t73Var, long j10, boolean z10, boolean[] zArr) {
        t73 t73Var2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= t73Var.f82907a) {
                break;
            }
            boolean[] zArr2 = this.f81895h;
            if (z10 || (t73Var2 = this.f81901n) == null || !ib3.a(t73Var.f82908b[i11], t73Var2.f82908b[i11]) || !ib3.a(t73Var.f82909c[i11], t73Var2.f82909c[i11])) {
                z11 = false;
            }
            zArr2[i11] = z11;
            i11++;
        }
        ns2[] ns2VarArr = this.f81890c;
        int i12 = 0;
        while (true) {
            ro[] roVarArr = this.f81896i;
            if (i12 >= roVarArr.length) {
                break;
            }
            if (roVarArr[i12].f82354b == -2) {
                ns2VarArr[i12] = null;
            }
            i12++;
        }
        a();
        this.f81901n = t73Var;
        if (this.f81899l == null) {
            int i13 = 0;
            while (true) {
                t73 t73Var3 = this.f81901n;
                if (i13 >= t73Var3.f82907a) {
                    break;
                }
                boolean zA = t73Var3.a(i13);
                op0 op0Var = this.f81901n.f82909c[i13];
                if (zA && op0Var != null) {
                    op0Var.a();
                }
                i13++;
            }
        }
        long jA = this.f81888a.a(t73Var.f82909c, this.f81895h, this.f81890c, zArr, j10);
        ns2[] ns2VarArr2 = this.f81890c;
        int i14 = 0;
        while (true) {
            ro[] roVarArr2 = this.f81896i;
            if (i14 >= roVarArr2.length) {
                break;
            }
            if (roVarArr2[i14].f82354b == -2 && this.f81901n.a(i14)) {
                ns2VarArr2[i14] = new wl0();
            }
            i14++;
        }
        this.f81892e = false;
        while (true) {
            ns2[] ns2VarArr3 = this.f81890c;
            if (i10 >= ns2VarArr3.length) {
                return jA;
            }
            if (ns2VarArr3[i10] != null) {
                if (!t73Var.a(i10)) {
                    throw new IllegalStateException();
                }
                if (this.f81896i[i10].f82354b != -2) {
                    this.f81892e = true;
                }
            } else if (t73Var.f82909c[i10] != null) {
                throw new IllegalStateException();
            }
            i10++;
        }
    }

    public qm1(ro[] roVarArr, long j10, s73 s73Var, ib0 ib0Var, in1 in1Var, sm1 sm1Var, t73 t73Var) {
        this.f81896i = roVarArr;
        this.f81902o = j10;
        this.f81897j = s73Var;
        this.f81898k = in1Var;
        ym1 ym1Var = sm1Var.f82688a;
        this.f81889b = ym1Var.f82311a;
        this.f81893f = sm1Var;
        this.f81900m = i73.f78512e;
        this.f81901n = t73Var;
        this.f81890c = new ns2[roVarArr.length];
        this.f81895h = new boolean[roVarArr.length];
        this.f81888a = a(ym1Var, in1Var, ib0Var, sm1Var.f82689b, sm1Var.f82691d);
    }

    public final void b() {
        a();
        in1 in1Var = this.f81898k;
        pm1 pm1Var = this.f81888a;
        try {
            if (pm1Var instanceof tv) {
                pm1 pm1Var2 = ((tv) pm1Var).f83181b;
                gn1 gn1Var = (gn1) in1Var.f78728c.remove(pm1Var2);
                gn1Var.getClass();
                gn1Var.f77860a.a(pm1Var2);
                gn1Var.f77862c.remove(((si1) pm1Var2).f82654b);
                if (!in1Var.f78728c.isEmpty()) {
                    Iterator it = in1Var.f78734i.iterator();
                    while (it.hasNext()) {
                        gn1 gn1Var2 = (gn1) it.next();
                        if (gn1Var2.f77862c.isEmpty()) {
                            fn1 fn1Var = (fn1) in1Var.f78733h.get(gn1Var2);
                            if (fn1Var != null) {
                                fn1Var.f77457a.a(fn1Var.f77458b);
                            }
                            it.remove();
                        }
                    }
                }
                if (gn1Var.f77864e && gn1Var.f77862c.isEmpty()) {
                    fn1 fn1Var2 = (fn1) in1Var.f78733h.remove(gn1Var);
                    fn1Var2.getClass();
                    fn1Var2.f77457a.c(fn1Var2.f77458b);
                    fn1Var2.f77457a.a((cn1) fn1Var2.f77459c);
                    fn1Var2.f77457a.a((pk0) fn1Var2.f77459c);
                    in1Var.f78734i.remove(gn1Var);
                    return;
                }
                return;
            }
            gn1 gn1Var3 = (gn1) in1Var.f78728c.remove(pm1Var);
            gn1Var3.getClass();
            gn1Var3.f77860a.a(pm1Var);
            gn1Var3.f77862c.remove(((si1) pm1Var).f82654b);
            if (!in1Var.f78728c.isEmpty()) {
                Iterator it2 = in1Var.f78734i.iterator();
                while (it2.hasNext()) {
                    gn1 gn1Var4 = (gn1) it2.next();
                    if (gn1Var4.f77862c.isEmpty()) {
                        fn1 fn1Var3 = (fn1) in1Var.f78733h.get(gn1Var4);
                        if (fn1Var3 != null) {
                            fn1Var3.f77457a.a(fn1Var3.f77458b);
                        }
                        it2.remove();
                    }
                }
            }
            if (gn1Var3.f77864e && gn1Var3.f77862c.isEmpty()) {
                fn1 fn1Var4 = (fn1) in1Var.f78733h.remove(gn1Var3);
                fn1Var4.getClass();
                fn1Var4.f77457a.c(fn1Var4.f77458b);
                fn1Var4.f77457a.a((cn1) fn1Var4.f77459c);
                fn1Var4.f77457a.a((pk0) fn1Var4.f77459c);
                in1Var.f78734i.remove(gn1Var3);
            }
        } catch (RuntimeException e10) {
            ih1.b("MediaPeriodHolder", ih1.a("Period release failed.", e10));
        }
    }

    public static pm1 a(ym1 ym1Var, in1 in1Var, ib0 ib0Var, long j10, long j11) {
        in1Var.getClass();
        Object objC = e.c(ym1Var.f82311a);
        ym1 ym1VarA = ym1Var.a(e.b(ym1Var.f82311a));
        gn1 gn1Var = (gn1) in1Var.f78729d.get(objC);
        gn1Var.getClass();
        in1Var.f78734i.add(gn1Var);
        fn1 fn1Var = (fn1) in1Var.f78733h.get(gn1Var);
        if (fn1Var != null) {
            fn1Var.f77457a.b(fn1Var.f77458b);
        }
        gn1Var.f77862c.add(ym1VarA);
        vi1 vi1Var = gn1Var.f77860a;
        vi1Var.getClass();
        si1 si1Var = new si1(ym1VarA, ib0Var, j10);
        mo moVar = vi1Var.f83926k;
        if (si1Var.f82657e == null) {
            si1Var.f82657e = moVar;
            if (vi1Var.f83933r) {
                Object obj = ym1VarA.f82311a;
                if (vi1Var.f83930o.f83061e != null && obj.equals(ti1.f83059f)) {
                    obj = vi1Var.f83930o.f83061e;
                }
                si1Var.a(ym1VarA.a(obj));
            } else {
                vi1Var.f83931p = si1Var;
                if (!vi1Var.f83932q) {
                    vi1Var.f83932q = true;
                    vi1Var.a((Object) null, moVar);
                }
            }
            in1Var.f78728c.put(si1Var, gn1Var);
            Iterator it = in1Var.f78734i.iterator();
            while (it.hasNext()) {
                gn1 gn1Var2 = (gn1) it.next();
                if (gn1Var2.f77862c.isEmpty()) {
                    fn1 fn1Var2 = (fn1) in1Var.f78733h.get(gn1Var2);
                    if (fn1Var2 != null) {
                        fn1Var2.f77457a.a(fn1Var2.f77458b);
                    }
                    it.remove();
                }
            }
            return j11 != -9223372036854775807L ? new tv(si1Var, true, 0L, j11) : si1Var;
        }
        throw new IllegalStateException();
    }

    public final void a() {
        if (this.f81899l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            t73 t73Var = this.f81901n;
            if (i10 >= t73Var.f82907a) {
                return;
            }
            boolean zA = t73Var.a(i10);
            op0 op0Var = this.f81901n.f82909c[i10];
            if (zA && op0Var != null) {
                op0Var.disable();
            }
            i10++;
        }
    }
}
