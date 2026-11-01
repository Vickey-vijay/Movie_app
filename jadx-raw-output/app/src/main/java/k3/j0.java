package k3;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f62179c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f62182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public h0 f62183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public h0 f62184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public h0 f62185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f62186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Object f62187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f62188l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.b f62177a = new v0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0.c f62178b = new v0.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v0 f62180d = v0.f62325a;

    public final boolean c(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public h0 f(q0[] q0VarArr, c5.d dVar, e5.b bVar, k4.r rVar, i0 i0Var, c5.e eVar) {
        long jL;
        h0 h0Var = this.f62185i;
        if (h0Var != null) {
            jL = (h0Var.l() + this.f62185i.f62148f.f62167e) - i0Var.f62164b;
        } else if (i0Var.f62163a.b()) {
            jL = i0Var.f62165c;
            if (jL == -9223372036854775807L) {
                jL = 0;
            }
        } else {
            jL = 0;
        }
        h0 h0Var2 = new h0(q0VarArr, jL, dVar, bVar, rVar, i0Var, eVar);
        h0 h0Var3 = this.f62185i;
        if (h0Var3 != null) {
            h0Var3.w(h0Var2);
        } else {
            this.f62183g = h0Var2;
            this.f62184h = h0Var2;
        }
        this.f62187k = null;
        this.f62185i = h0Var2;
        this.f62186j++;
        return h0Var2;
    }

    public final i0 l(Object obj, long j10, long j11) {
        int iD = this.f62177a.d(j10);
        k4.r.a aVar = new k4.r.a(obj, j11, iD);
        boolean zQ = q(aVar);
        boolean zR = r(aVar, zQ);
        long jF = iD != -1 ? this.f62177a.f(iD) : -9223372036854775807L;
        return new i0(aVar, j10, -9223372036854775807L, jF, (jF == -9223372036854775807L || jF == Long.MIN_VALUE) ? this.f62177a.f62329d : jF, zQ, zR);
    }

    public boolean u(h0 h0Var) {
        boolean z10 = false;
        g5.a.f(h0Var != null);
        this.f62185i = h0Var;
        while (h0Var.j() != null) {
            h0Var = h0Var.j();
            if (h0Var == this.f62184h) {
                this.f62184h = this.f62183g;
                z10 = true;
            }
            h0Var.t();
            this.f62186j--;
        }
        this.f62185i.w(null);
        return z10;
    }

    public final boolean A() {
        h0 h0VarJ = this.f62183g;
        if (h0VarJ == null) {
            return true;
        }
        int iB = this.f62180d.b(h0VarJ.f62144b);
        while (true) {
            iB = this.f62180d.d(iB, this.f62177a, this.f62178b, this.f62181e, this.f62182f);
            while (h0VarJ.j() != null && !h0VarJ.f62148f.f62168f) {
                h0VarJ = h0VarJ.j();
            }
            h0 h0VarJ2 = h0VarJ.j();
            if (iB == -1 || h0VarJ2 == null || this.f62180d.b(h0VarJ2.f62144b) != iB) {
                break;
            }
            h0VarJ = h0VarJ2;
        }
        boolean zU = u(h0VarJ);
        h0VarJ.f62148f = p(h0VarJ.f62148f);
        return !zU;
    }

    public boolean B(long j10, long j11) {
        i0 i0VarP;
        h0 h0VarJ = this.f62183g;
        h0 h0Var = null;
        while (h0VarJ != null) {
            i0 i0Var = h0VarJ.f62148f;
            if (h0Var == null) {
                i0VarP = p(i0Var);
            } else {
                i0 i0VarH = h(h0Var, j10);
                if (i0VarH == null) {
                    return !u(h0Var);
                }
                if (!d(i0Var, i0VarH)) {
                    return !u(h0Var);
                }
                i0VarP = i0VarH;
            }
            h0VarJ.f62148f = i0VarP.a(i0Var.f62165c);
            if (!c(i0Var.f62167e, i0VarP.f62167e)) {
                long j12 = i0VarP.f62167e;
                return (u(h0VarJ) || (h0VarJ == this.f62184h && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : h0VarJ.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : h0VarJ.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            h0Var = h0VarJ;
            h0VarJ = h0VarJ.j();
        }
        return true;
    }

    public boolean C(int i10) {
        this.f62181e = i10;
        return A();
    }

    public boolean D(boolean z10) {
        this.f62182f = z10;
        return A();
    }

    @Nullable
    public h0 a() {
        h0 h0Var = this.f62183g;
        if (h0Var == null) {
            return null;
        }
        if (h0Var == this.f62184h) {
            this.f62184h = h0Var.j();
        }
        this.f62183g.t();
        int i10 = this.f62186j - 1;
        this.f62186j = i10;
        if (i10 == 0) {
            this.f62185i = null;
            h0 h0Var2 = this.f62183g;
            this.f62187k = h0Var2.f62144b;
            this.f62188l = h0Var2.f62148f.f62163a.f62605d;
        }
        h0 h0VarJ = this.f62183g.j();
        this.f62183g = h0VarJ;
        return h0VarJ;
    }

    public h0 b() {
        h0 h0Var = this.f62184h;
        g5.a.f((h0Var == null || h0Var.j() == null) ? false : true);
        h0 h0VarJ = this.f62184h.j();
        this.f62184h = h0VarJ;
        return h0VarJ;
    }

    public final boolean d(i0 i0Var, i0 i0Var2) {
        return i0Var.f62164b == i0Var2.f62164b && i0Var.f62163a.equals(i0Var2.f62163a);
    }

    public void e(boolean z10) {
        h0 h0Var = this.f62183g;
        if (h0Var != null) {
            this.f62187k = z10 ? h0Var.f62144b : null;
            this.f62188l = h0Var.f62148f.f62163a.f62605d;
            u(h0Var);
            h0Var.t();
        } else if (!z10) {
            this.f62187k = null;
        }
        this.f62183g = null;
        this.f62185i = null;
        this.f62184h = null;
        this.f62186j = 0;
    }

    public final i0 g(k0 k0Var) {
        return j(k0Var.f62196b, k0Var.f62198d, k0Var.f62197c);
    }

    @Nullable
    public final i0 h(h0 h0Var, long j10) {
        long jLongValue;
        Object obj;
        long j11;
        long j12;
        long j13;
        i0 i0Var = h0Var.f62148f;
        long jL = (h0Var.l() + i0Var.f62167e) - j10;
        long j14 = 0;
        if (i0Var.f62168f) {
            int iD = this.f62180d.d(this.f62180d.b(i0Var.f62163a.f62602a), this.f62177a, this.f62178b, this.f62181e, this.f62182f);
            if (iD == -1) {
                return null;
            }
            int i10 = this.f62180d.g(iD, this.f62177a, true).f62328c;
            Object obj2 = this.f62177a.f62327b;
            long j15 = i0Var.f62163a.f62605d;
            if (this.f62180d.n(i10, this.f62178b).f62341i == iD) {
                Pair<Object, Long> pairK = this.f62180d.k(this.f62178b, this.f62177a, i10, -9223372036854775807L, Math.max(0L, jL));
                if (pairK == null) {
                    return null;
                }
                Object obj3 = pairK.first;
                long jLongValue2 = ((Long) pairK.second).longValue();
                h0 h0VarJ = h0Var.j();
                if (h0VarJ == null || !h0VarJ.f62144b.equals(obj3)) {
                    j13 = this.f62179c;
                    this.f62179c = 1 + j13;
                } else {
                    j13 = h0VarJ.f62148f.f62163a.f62605d;
                }
                j12 = jLongValue2;
                j14 = -9223372036854775807L;
                j11 = j13;
                obj = obj3;
            } else {
                obj = obj2;
                j11 = j15;
                j12 = 0;
            }
            return j(w(obj, j12, j11), j14, j12);
        }
        k4.r.a aVar = i0Var.f62163a;
        this.f62180d.h(aVar.f62602a, this.f62177a);
        if (!aVar.b()) {
            int iE = this.f62177a.e(i0Var.f62166d);
            if (iE == -1) {
                return l(aVar.f62602a, i0Var.f62167e, aVar.f62605d);
            }
            int iJ = this.f62177a.j(iE);
            if (this.f62177a.o(iE, iJ)) {
                return k(aVar.f62602a, iE, iJ, i0Var.f62167e, aVar.f62605d);
            }
            return null;
        }
        int i11 = aVar.f62603b;
        int iA = this.f62177a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iK = this.f62177a.k(i11, aVar.f62604c);
        if (iK < iA) {
            if (this.f62177a.o(i11, iK)) {
                return k(aVar.f62602a, i11, iK, i0Var.f62165c, aVar.f62605d);
            }
            return null;
        }
        long j16 = i0Var.f62165c;
        if (j16 == -9223372036854775807L) {
            v0 v0Var = this.f62180d;
            v0.c cVar = this.f62178b;
            v0.b bVar = this.f62177a;
            Pair<Object, Long> pairK2 = v0Var.k(cVar, bVar, bVar.f62328c, -9223372036854775807L, Math.max(0L, jL));
            if (pairK2 == null) {
                return null;
            }
            jLongValue = ((Long) pairK2.second).longValue();
        } else {
            jLongValue = j16;
        }
        return l(aVar.f62602a, jLongValue, aVar.f62605d);
    }

    @Nullable
    public h0 i() {
        return this.f62185i;
    }

    public final i0 j(k4.r.a aVar, long j10, long j11) {
        this.f62180d.h(aVar.f62602a, this.f62177a);
        if (!aVar.b()) {
            return l(aVar.f62602a, j11, aVar.f62605d);
        }
        if (this.f62177a.o(aVar.f62603b, aVar.f62604c)) {
            return k(aVar.f62602a, aVar.f62603b, aVar.f62604c, j10, aVar.f62605d);
        }
        return null;
    }

    public final i0 k(Object obj, int i10, int i11, long j10, long j11) {
        k4.r.a aVar = new k4.r.a(obj, i10, i11, j11);
        return new i0(aVar, i11 == this.f62177a.j(i10) ? this.f62177a.g() : 0L, j10, -9223372036854775807L, this.f62180d.h(aVar.f62602a, this.f62177a).b(aVar.f62603b, aVar.f62604c), false, false);
    }

    @Nullable
    public i0 m(long j10, k0 k0Var) {
        h0 h0Var = this.f62185i;
        return h0Var == null ? g(k0Var) : h(h0Var, j10);
    }

    @Nullable
    public h0 n() {
        return this.f62183g;
    }

    @Nullable
    public h0 o() {
        return this.f62184h;
    }

    public i0 p(i0 i0Var) {
        long jI;
        k4.r.a aVar = i0Var.f62163a;
        boolean zQ = q(aVar);
        boolean zR = r(aVar, zQ);
        this.f62180d.h(i0Var.f62163a.f62602a, this.f62177a);
        if (aVar.b()) {
            jI = this.f62177a.b(aVar.f62603b, aVar.f62604c);
        } else {
            jI = i0Var.f62166d;
            if (jI == -9223372036854775807L || jI == Long.MIN_VALUE) {
                jI = this.f62177a.i();
            }
        }
        return new i0(aVar, i0Var.f62164b, i0Var.f62165c, i0Var.f62166d, jI, zQ, zR);
    }

    public final boolean r(k4.r.a aVar, boolean z10) {
        int iB = this.f62180d.b(aVar.f62602a);
        return !this.f62180d.n(this.f62180d.f(iB, this.f62177a).f62328c, this.f62178b).f62339g && this.f62180d.r(iB, this.f62177a, this.f62178b, this.f62181e, this.f62182f) && z10;
    }

    public boolean s(k4.q qVar) {
        h0 h0Var = this.f62185i;
        return h0Var != null && h0Var.f62143a == qVar;
    }

    public void t(long j10) {
        h0 h0Var = this.f62185i;
        if (h0Var != null) {
            h0Var.s(j10);
        }
    }

    public final k4.r.a w(Object obj, long j10, long j11) {
        this.f62180d.h(obj, this.f62177a);
        int iE = this.f62177a.e(j10);
        return iE == -1 ? new k4.r.a(obj, j11, this.f62177a.d(j10)) : new k4.r.a(obj, iE, this.f62177a.j(iE), j11);
    }

    public final long x(Object obj) {
        int iB;
        int i10 = this.f62180d.h(obj, this.f62177a).f62328c;
        Object obj2 = this.f62187k;
        if (obj2 != null && (iB = this.f62180d.b(obj2)) != -1 && this.f62180d.f(iB, this.f62177a).f62328c == i10) {
            return this.f62188l;
        }
        for (h0 h0VarJ = this.f62183g; h0VarJ != null; h0VarJ = h0VarJ.j()) {
            if (h0VarJ.f62144b.equals(obj)) {
                return h0VarJ.f62148f.f62163a.f62605d;
            }
        }
        for (h0 h0VarJ2 = this.f62183g; h0VarJ2 != null; h0VarJ2 = h0VarJ2.j()) {
            int iB2 = this.f62180d.b(h0VarJ2.f62144b);
            if (iB2 != -1 && this.f62180d.f(iB2, this.f62177a).f62328c == i10) {
                return h0VarJ2.f62148f.f62163a.f62605d;
            }
        }
        long j10 = this.f62179c;
        this.f62179c = 1 + j10;
        if (this.f62183g == null) {
            this.f62187k = obj;
            this.f62188l = j10;
        }
        return j10;
    }

    public void y(v0 v0Var) {
        this.f62180d = v0Var;
    }

    public boolean z() {
        h0 h0Var = this.f62185i;
        return h0Var == null || (!h0Var.f62148f.f62169g && h0Var.q() && this.f62185i.f62148f.f62167e != -9223372036854775807L && this.f62186j < 100);
    }

    public final boolean q(k4.r.a aVar) {
        if (!aVar.b() && aVar.f62606e == -1) {
            return true;
        }
        return false;
    }

    public k4.r.a v(Object obj, long j10) {
        return w(obj, j10, x(obj));
    }
}
