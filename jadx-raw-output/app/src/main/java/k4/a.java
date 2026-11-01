package k4;

import android.util.Pair;
import k3.v0;

/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f62359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f62360d;

    public abstract int A(int i10);

    public abstract v0 D(int i10);

    public abstract int s(Object obj);

    public abstract int t(int i10);

    public abstract int u(int i10);

    public abstract Object x(int i10);

    public abstract int z(int i10);

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public final int B(int i10, boolean z10) {
        if (z10) {
            return this.f62359c.getNextIndex(i10);
        }
        if (i10 < this.f62358b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int C(int i10, boolean z10) {
        if (z10) {
            return this.f62359c.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // k3.v0
    public int a(boolean z10) {
        if (this.f62358b == 0) {
            return -1;
        }
        if (this.f62360d) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f62359c.getFirstIndex() : 0;
        while (D(firstIndex).q()) {
            firstIndex = B(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return A(firstIndex) + D(firstIndex).a(z10);
    }

    @Override // k3.v0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // k3.v0
    public int c(boolean z10) {
        int i10 = this.f62358b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f62360d) {
            z10 = false;
        }
        int lastIndex = z10 ? this.f62359c.getLastIndex() : i10 - 1;
        while (D(lastIndex).q()) {
            lastIndex = C(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return A(lastIndex) + D(lastIndex).c(z10);
    }

    @Override // k3.v0
    public int e(int i10, int i11, boolean z10) {
        if (this.f62360d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iE = D(iU).e(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z10);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z10);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // k3.v0
    public int l(int i10, int i11, boolean z10) {
        if (this.f62360d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iL = D(iU).l(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z10);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z10);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    public a(boolean z10, k0 k0Var) {
        this.f62360d = z10;
        this.f62359c = k0Var;
        this.f62358b = k0Var.getLength();
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    @Override // k3.v0
    public final v0.b g(int i10, v0.b bVar, boolean z10) {
        int iT = t(i10);
        int iA = A(iT);
        D(iT).g(i10 - z(iT), bVar, z10);
        bVar.f62328c += iA;
        if (z10) {
            bVar.f62327b = y(x(iT), g5.a.e(bVar.f62327b));
        }
        return bVar;
    }

    @Override // k3.v0
    public final v0.b h(Object obj, v0.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f62328c += iA;
        bVar.f62327b = obj;
        return bVar;
    }

    @Override // k3.v0
    public final Object m(int i10) {
        int iT = t(i10);
        return y(x(iT), D(iT).m(i10 - z(iT)));
    }

    @Override // k3.v0
    public final v0.c o(int i10, v0.c cVar, long j10) {
        int iU = u(i10);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i10 - iA, cVar, j10);
        Object objX = x(iU);
        if (!v0.c.f62332n.equals(cVar.f62333a)) {
            objX = y(objX, cVar.f62333a);
        }
        cVar.f62333a = objX;
        cVar.f62341i += iZ;
        cVar.f62342j += iZ;
        return cVar;
    }
}
