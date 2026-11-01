package com.google.common.collect;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TopKSelector.java */
/* JADX INFO: loaded from: classes11.dex */
public final class o2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator<? super T> f20633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T[] f20634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f20636e;

    public static <T> o2<T> a(int i10, Comparator<? super T> comparator) {
        return new o2<>(comparator, i10);
    }

    public void b(T t10) {
        int i10 = this.f20632a;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f20635d;
        if (i11 == 0) {
            this.f20634c[0] = t10;
            this.f20636e = t10;
            this.f20635d = 1;
            return;
        }
        if (i11 < i10) {
            T[] tArr = this.f20634c;
            this.f20635d = i11 + 1;
            tArr[i11] = t10;
            if (this.f20633b.compare(t10, (Object) c2.a(this.f20636e)) > 0) {
                this.f20636e = t10;
                return;
            }
            return;
        }
        if (this.f20633b.compare(t10, (Object) c2.a(this.f20636e)) < 0) {
            T[] tArr2 = this.f20634c;
            int i12 = this.f20635d;
            int i13 = i12 + 1;
            this.f20635d = i13;
            tArr2[i12] = t10;
            if (i13 == this.f20632a * 2) {
                g();
            }
        }
    }

    public final int d(int i10, int i11, int i12) {
        Object objA = c2.a(this.f20634c[i12]);
        T[] tArr = this.f20634c;
        tArr[i12] = tArr[i11];
        int i13 = i10;
        while (i10 < i11) {
            if (this.f20633b.compare((Object) c2.a(this.f20634c[i10]), objA) < 0) {
                e(i13, i10);
                i13++;
            }
            i10++;
        }
        T[] tArr2 = this.f20634c;
        tArr2[i11] = tArr2[i13];
        tArr2[i13] = objA;
        return i13;
    }

    public final void e(int i10, int i11) {
        T[] tArr = this.f20634c;
        T t10 = tArr[i10];
        tArr[i10] = tArr[i11];
        tArr[i11] = t10;
    }

    public List<T> f() {
        T[] tArr = this.f20634c;
        Arrays.sort(tArr, 0, this.f20635d, this.f20633b);
        int i10 = this.f20635d;
        int i11 = this.f20632a;
        if (i10 > i11) {
            T[] tArr2 = this.f20634c;
            Arrays.fill(tArr2, i11, tArr2.length, (Object) null);
            int i12 = this.f20632a;
            this.f20635d = i12;
            this.f20636e = this.f20634c[i12 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.f20635d)));
    }

    public final void g() {
        int i10 = (this.f20632a * 2) - 1;
        int iF = o5.d.f(i10 + 0, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        while (iMax < i10) {
            int iD = d(iMax, i10, ((iMax + i10) + 1) >>> 1);
            int i13 = this.f20632a;
            if (iD <= i13) {
                if (iD >= i13) {
                    break;
                }
                iMax = Math.max(iD, iMax + 1);
                i12 = iD;
            } else {
                i10 = iD - 1;
            }
            i11++;
            if (i11 >= iF) {
                Arrays.sort(this.f20634c, iMax, i10 + 1, this.f20633b);
                break;
            }
        }
        this.f20635d = this.f20632a;
        this.f20636e = (T) c2.a(this.f20634c[i12]);
        while (true) {
            i12++;
            if (i12 >= this.f20632a) {
                return;
            }
            if (this.f20633b.compare((Object) c2.a(this.f20634c[i12]), (Object) c2.a(this.f20636e)) > 0) {
                this.f20636e = this.f20634c[i12];
            }
        }
    }

    public o2(Comparator<? super T> comparator, int i10) {
        boolean z10;
        this.f20633b = (Comparator) m5.l.n(comparator, "comparator");
        this.f20632a = i10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m5.l.f(z10, "k (%s) must be >= 0", i10);
        m5.l.f(i10 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i10);
        this.f20634c = (T[]) new Object[o5.d.b(i10, 2)];
        this.f20635d = 0;
        this.f20636e = null;
    }

    public void c(Iterator<? extends T> it) {
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
