package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: compiled from: ObjectCountHashMap.java */
/* JADX INFO: loaded from: classes10.dex */
public class e2<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object[] f20596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f20597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f20598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f20599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int[] f20600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient long[] f20601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient float f20602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f20603h;

    /* JADX INFO: compiled from: ObjectCountHashMap.java */
    public class a extends Multisets.a<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f20604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20605c;

        public a(int i10) {
            this.f20604b = (K) e2.this.f20596a[i10];
            this.f20605c = i10;
        }

        public void d() {
            int i10 = this.f20605c;
            if (i10 == -1 || i10 >= e2.this.C() || !m5.i.a(this.f20604b, e2.this.f20596a[this.f20605c])) {
                this.f20605c = e2.this.m(this.f20604b);
            }
        }

        @Override // com.google.common.collect.b2.a
        public K getElement() {
            return this.f20604b;
        }

        @Override // com.google.common.collect.b2.a
        public int getCount() {
            d();
            int i10 = this.f20605c;
            if (i10 == -1) {
                return 0;
            }
            return e2.this.f20597b[i10];
        }
    }

    public e2() {
        n(3, 1.0f);
    }

    public static long D(long j10, int i10) {
        return (j10 & (-4294967296L)) | (((long) i10) & 4294967295L);
    }

    public static int h(long j10) {
        return (int) (j10 >>> 32);
    }

    public static int j(long j10) {
        return (int) j10;
    }

    public void n(int i10, float f10) {
        m5.l.e(i10 >= 0, "Initial capacity must be non-negative");
        m5.l.e(f10 > 0.0f, "Illegal load factor");
        int iA = v1.a(i10, f10);
        this.f20600e = r(iA);
        this.f20602g = f10;
        this.f20596a = new Object[i10];
        this.f20597b = new int[i10];
        this.f20601f = q(i10);
        this.f20603h = Math.max(1, (int) (iA * f10));
    }

    public int t(int i10, int i11) {
        return i10 - 1;
    }

    public static <K> e2<K> b() {
        return new e2<>();
    }

    public static <K> e2<K> c(int i10) {
        return new e2<>(i10);
    }

    public static long[] q(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] r(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final void A(int i10) {
        if (this.f20600e.length >= 1073741824) {
            this.f20603h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f20602g)) + 1;
        int[] iArrR = r(i10);
        long[] jArr = this.f20601f;
        int length = iArrR.length - 1;
        for (int i12 = 0; i12 < this.f20598c; i12++) {
            int iH = h(jArr[i12]);
            int i13 = iH & length;
            int i14 = iArrR[i13];
            iArrR[i13] = i12;
            jArr[i12] = (((long) iH) << 32) | (((long) i14) & 4294967295L);
        }
        this.f20603h = i11;
        this.f20600e = iArrR;
    }

    public void B(int i10, int i11) {
        m5.l.k(i10, this.f20598c);
        this.f20597b[i10] = i11;
    }

    public int C() {
        return this.f20598c;
    }

    public void a() {
        this.f20599d++;
        Arrays.fill(this.f20596a, 0, this.f20598c, (Object) null);
        Arrays.fill(this.f20597b, 0, this.f20598c, 0);
        Arrays.fill(this.f20600e, -1);
        Arrays.fill(this.f20601f, -1L);
        this.f20598c = 0;
    }

    public void d(int i10) {
        if (i10 > this.f20601f.length) {
            y(i10);
        }
        if (i10 >= this.f20603h) {
            A(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    public int e() {
        return this.f20598c == 0 ? -1 : 0;
    }

    public b2.a<K> g(int i10) {
        m5.l.k(i10, this.f20598c);
        return new a(i10);
    }

    public K i(int i10) {
        m5.l.k(i10, this.f20598c);
        return (K) this.f20596a[i10];
    }

    public int k(int i10) {
        m5.l.k(i10, this.f20598c);
        return this.f20597b[i10];
    }

    public final int l() {
        return this.f20600e.length - 1;
    }

    public void o(int i10, K k10, int i11, int i12) {
        this.f20601f[i10] = (((long) i12) << 32) | 4294967295L;
        this.f20596a[i10] = k10;
        this.f20597b[i10] = i11;
    }

    public int s(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f20598c) {
            return i11;
        }
        return -1;
    }

    public int u(K k10, int i10) {
        j1.d(i10, "count");
        long[] jArr = this.f20601f;
        Object[] objArr = this.f20596a;
        int[] iArr = this.f20597b;
        int iC = v1.c(k10);
        int iL = l() & iC;
        int i11 = this.f20598c;
        int[] iArr2 = this.f20600e;
        int i12 = iArr2[iL];
        if (i12 == -1) {
            iArr2[iL] = i11;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (h(j10) == iC && m5.i.a(k10, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = i10;
                    return i13;
                }
                int iJ = j(j10);
                if (iJ == -1) {
                    jArr[i12] = D(j10, i11);
                    break;
                }
                i12 = iJ;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i14 = i11 + 1;
        z(i14);
        o(i11, k10, i10, iC);
        this.f20598c = i14;
        if (i11 >= this.f20603h) {
            A(this.f20600e.length * 2);
        }
        this.f20599d++;
        return 0;
    }

    public int x(int i10) {
        return w(this.f20596a[i10], h(this.f20601f[i10]));
    }

    public void y(int i10) {
        this.f20596a = Arrays.copyOf(this.f20596a, i10);
        this.f20597b = Arrays.copyOf(this.f20597b, i10);
        long[] jArr = this.f20601f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f20601f = jArrCopyOf;
    }

    public final void z(int i10) {
        int length = this.f20601f.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                y(iMax);
            }
        }
    }

    public e2(e2<? extends K> e2Var) {
        n(e2Var.C(), 1.0f);
        int iE = e2Var.e();
        while (iE != -1) {
            u(e2Var.i(iE), e2Var.k(iE));
            iE = e2Var.s(iE);
        }
    }

    public int f(Object obj) {
        int iM = m(obj);
        if (iM == -1) {
            return 0;
        }
        return this.f20597b[iM];
    }

    public int m(Object obj) {
        int iC = v1.c(obj);
        int iJ = this.f20600e[l() & iC];
        while (iJ != -1) {
            long j10 = this.f20601f[iJ];
            if (h(j10) == iC && m5.i.a(obj, this.f20596a[iJ])) {
                return iJ;
            }
            iJ = j(j10);
        }
        return -1;
    }

    public void p(int i10) {
        int iC = C() - 1;
        if (i10 < iC) {
            Object[] objArr = this.f20596a;
            objArr[i10] = objArr[iC];
            int[] iArr = this.f20597b;
            iArr[i10] = iArr[iC];
            objArr[iC] = null;
            iArr[iC] = 0;
            long[] jArr = this.f20601f;
            long j10 = jArr[iC];
            jArr[i10] = j10;
            jArr[iC] = -1;
            int iH = h(j10) & l();
            int[] iArr2 = this.f20600e;
            int i11 = iArr2[iH];
            if (i11 == iC) {
                iArr2[iH] = i10;
                return;
            }
            while (true) {
                long j11 = this.f20601f[i11];
                int iJ = j(j11);
                if (iJ == iC) {
                    this.f20601f[i11] = D(j11, i10);
                    return;
                }
                i11 = iJ;
            }
        } else {
            this.f20596a[i10] = null;
            this.f20597b[i10] = 0;
            this.f20601f[i10] = -1;
        }
    }

    public int v(Object obj) {
        return w(obj, v1.c(obj));
    }

    public final int w(Object obj, int i10) {
        int iL = l() & i10;
        int i11 = this.f20600e[iL];
        if (i11 == -1) {
            return 0;
        }
        int i12 = -1;
        while (true) {
            if (h(this.f20601f[i11]) == i10 && m5.i.a(obj, this.f20596a[i11])) {
                int i13 = this.f20597b[i11];
                if (i12 == -1) {
                    this.f20600e[iL] = j(this.f20601f[i11]);
                } else {
                    long[] jArr = this.f20601f;
                    jArr[i12] = D(jArr[i12], j(jArr[i11]));
                }
                p(i11);
                this.f20598c--;
                this.f20599d++;
                return i13;
            }
            int iJ = j(this.f20601f[i11]);
            if (iJ == -1) {
                return 0;
            }
            i12 = i11;
            i11 = iJ;
        }
    }

    public e2(int i10) {
        this(i10, 1.0f);
    }

    public e2(int i10, float f10) {
        n(i10, f10);
    }
}
