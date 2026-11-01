package sk;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sk.n0;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes2.dex */
public class m0<T extends n0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71968b = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f71969a;

    public final T f() {
        T t10;
        synchronized (this) {
            t10 = (T) b();
        }
        return t10;
    }

    public final boolean h(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.c() == null) {
                z10 = false;
            } else {
                i(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    public final T j() {
        T t10;
        synchronized (this) {
            t10 = c() > 0 ? (T) i(0) : null;
        }
        return t10;
    }

    public final T b() {
        T[] tArr = this.f71969a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final T[] g() {
        T[] tArr = this.f71969a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new n0[4];
            this.f71969a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, c() * 2);
        ck.p.i(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((n0[]) objArrCopyOf);
        this.f71969a = tArr3;
        return tArr3;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final T i(int i10) {
        T[] tArr = this.f71969a;
        ck.p.g(tArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                ck.p.g(t10);
                T t11 = tArr[i11];
                ck.p.g(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    n(i10, i11);
                    m(i11);
                } else {
                    l(i10);
                }
            } else {
                l(i10);
            }
        }
        T t12 = tArr[c()];
        ck.p.g(t12);
        t12.d(null);
        t12.setIndex(-1);
        tArr[c()] = null;
        return t12;
    }

    public final void l(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f71969a;
            ck.p.g(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                ck.p.g(t10);
                T t11 = tArr[i11];
                ck.p.g(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            ck.p.g(t12);
            T t13 = tArr[i11];
            ck.p.g(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void m(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f71969a;
            ck.p.g(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            ck.p.g(t10);
            T t11 = tArr[i10];
            ck.p.g(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void n(int i10, int i11) {
        T[] tArr = this.f71969a;
        ck.p.g(tArr);
        T t10 = tArr[i11];
        ck.p.g(t10);
        T t11 = tArr[i10];
        ck.p.g(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    public final void a(T t10) {
        t10.d(this);
        n0[] n0VarArrG = g();
        int iC = c();
        k(iC + 1);
        n0VarArrG[iC] = t10;
        t10.setIndex(iC);
        m(iC);
    }

    public final int c() {
        return f71968b.get(this);
    }

    public final boolean e() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    public final void k(int i10) {
        f71968b.set(this, i10);
    }
}
