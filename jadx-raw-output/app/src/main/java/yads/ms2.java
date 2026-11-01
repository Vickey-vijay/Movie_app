package yads;

import android.util.SparseArray;
import java.io.EOFException;
import yads.ks2;

/* JADX INFO: loaded from: classes7.dex */
public final class ms2 implements m73 {
    public mx0 A;
    public mx0 B;
    public boolean C;
    public boolean D;
    public long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2 f80350a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sk0 f80353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ok0 f80354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ls2 f80355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mx0 f80356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public mk0 f80357h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f80365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f80366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f80367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f80368s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f80372w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f80375z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js2 f80351b = new js2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80358i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f80359j = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f80360k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f80363n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f80362m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f80361l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l73[] f80364o = new l73[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f23 f80352c = new f23(new iz() { // from class: cp.p6
        @Override // yads.iz
        public final void accept(Object obj) {
            ((ks2) obj).f79533b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f80369t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f80370u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f80371v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f80374y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f80373x = true;

    /* JADX WARN: Code duplicated, block: B:41:0x00e7 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x001a, B:9:0x001f, B:10:0x0020, B:14:0x0029, B:19:0x0075, B:21:0x0079, B:23:0x0084, B:25:0x009a, B:27:0x00a2, B:28:0x00a5, B:29:0x00aa, B:30:0x00ab, B:32:0x00b3, B:35:0x00c2, B:36:0x00d3, B:37:0x00d8, B:38:0x00d9, B:39:0x00de, B:41:0x00e7, B:22:0x0082, B:17:0x005c), top: B:47:0x0001 }] */
    public final synchronized void a(long j10, int i10, long j11, int i11, l73 l73Var) {
        int i12;
        int i13;
        int i14 = this.f80365p;
        if (i14 > 0) {
            int iE = e(i14 - 1);
            if (this.f80360k[iE] + ((long) this.f80361l[iE]) > j11) {
                throw new IllegalArgumentException();
            }
        }
        this.f80372w = (536870912 & i10) != 0;
        this.f80371v = Math.max(this.f80371v, j10);
        int iE2 = e(this.f80365p);
        this.f80363n[iE2] = j10;
        this.f80360k[iE2] = j11;
        this.f80361l[iE2] = i11;
        this.f80362m[iE2] = i10;
        this.f80364o[iE2] = l73Var;
        this.f80359j[iE2] = 0;
        if (this.f80352c.f77282b.size() != 0) {
            SparseArray sparseArray = this.f80352c.f77282b;
            if (!((ks2) sparseArray.valueAt(sparseArray.size() - 1)).f79532a.equals(this.B)) {
            }
            i12 = this.f80365p + 1;
            this.f80365p = i12;
            i13 = this.f80358i;
            if (i12 == i13) {
                int i15 = i13 + 1000;
                int[] iArr = new int[i15];
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                int[] iArr2 = new int[i15];
                int[] iArr3 = new int[i15];
                l73[] l73VarArr = new l73[i15];
                int i16 = this.f80367r;
                int i17 = i13 - i16;
                System.arraycopy(this.f80360k, i16, jArr, 0, i17);
                System.arraycopy(this.f80363n, this.f80367r, jArr2, 0, i17);
                System.arraycopy(this.f80362m, this.f80367r, iArr2, 0, i17);
                System.arraycopy(this.f80361l, this.f80367r, iArr3, 0, i17);
                System.arraycopy(this.f80364o, this.f80367r, l73VarArr, 0, i17);
                System.arraycopy(this.f80359j, this.f80367r, iArr, 0, i17);
                int i18 = this.f80367r;
                System.arraycopy(this.f80360k, 0, jArr, i17, i18);
                System.arraycopy(this.f80363n, 0, jArr2, i17, i18);
                System.arraycopy(this.f80362m, 0, iArr2, i17, i18);
                System.arraycopy(this.f80361l, 0, iArr3, i17, i18);
                System.arraycopy(this.f80364o, 0, l73VarArr, i17, i18);
                System.arraycopy(this.f80359j, 0, iArr, i17, i18);
                this.f80360k = jArr;
                this.f80363n = jArr2;
                this.f80362m = iArr2;
                this.f80361l = iArr3;
                this.f80364o = l73VarArr;
                this.f80359j = iArr;
                this.f80367r = 0;
                this.f80358i = i15;
            }
        }
        sk0 sk0Var = this.f80353d;
        rk0 rk0VarA = sk0Var != null ? sk0Var.a(this.f80354e, this.B) : rk0.f82292a;
        f23 f23Var = this.f80352c;
        int i19 = this.f80366q + this.f80365p;
        mx0 mx0Var = this.B;
        mx0Var.getClass();
        ks2 ks2Var = new ks2(mx0Var, rk0VarA);
        if (f23Var.f77281a == -1) {
            if (f23Var.f77282b.size() != 0) {
                throw new IllegalStateException();
            }
            f23Var.f77281a = 0;
        }
        if (f23Var.f77282b.size() > 0) {
            SparseArray sparseArray2 = f23Var.f77282b;
            int iKeyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
            if (i19 < iKeyAt) {
                throw new IllegalArgumentException();
            }
            if (iKeyAt == i19) {
                iz izVar = f23Var.f77283c;
                SparseArray sparseArray3 = f23Var.f77282b;
                izVar.accept(sparseArray3.valueAt(sparseArray3.size() - 1));
            }
        }
        f23Var.f77282b.append(i19, ks2Var);
        i12 = this.f80365p + 1;
        this.f80365p = i12;
        i13 = this.f80358i;
        if (i12 == i13) {
            int i110 = i13 + 1000;
            int[] iArr4 = new int[i110];
            long[] jArr3 = new long[i110];
            long[] jArr4 = new long[i110];
            int[] iArr5 = new int[i110];
            int[] iArr6 = new int[i110];
            l73[] l73VarArr2 = new l73[i110];
            int i111 = this.f80367r;
            int i112 = i13 - i111;
            System.arraycopy(this.f80360k, i111, jArr3, 0, i112);
            System.arraycopy(this.f80363n, this.f80367r, jArr4, 0, i112);
            System.arraycopy(this.f80362m, this.f80367r, iArr5, 0, i112);
            System.arraycopy(this.f80361l, this.f80367r, iArr6, 0, i112);
            System.arraycopy(this.f80364o, this.f80367r, l73VarArr2, 0, i112);
            System.arraycopy(this.f80359j, this.f80367r, iArr4, 0, i112);
            int i113 = this.f80367r;
            System.arraycopy(this.f80360k, 0, jArr3, i112, i113);
            System.arraycopy(this.f80363n, 0, jArr4, i112, i113);
            System.arraycopy(this.f80362m, 0, iArr5, i112, i113);
            System.arraycopy(this.f80361l, 0, iArr6, i112, i113);
            System.arraycopy(this.f80364o, 0, l73VarArr2, i112, i113);
            System.arraycopy(this.f80359j, 0, iArr4, i112, i113);
            this.f80360k = jArr3;
            this.f80363n = jArr4;
            this.f80362m = iArr5;
            this.f80361l = iArr6;
            this.f80364o = l73VarArr2;
            this.f80359j = iArr4;
            this.f80367r = 0;
            this.f80358i = i110;
        }
    }

    public final long b(int i10) {
        int i11 = this.f80366q;
        int i12 = this.f80365p;
        int i13 = (i11 + i12) - i10;
        if (i13 < 0 || i13 > i12 - this.f80368s) {
            throw new IllegalArgumentException();
        }
        int i14 = i12 - i13;
        this.f80365p = i14;
        this.f80371v = Math.max(this.f80370u, d(i14));
        this.f80372w = i13 == 0 && this.f80372w;
        this.f80352c.a(i10);
        int i15 = this.f80365p;
        if (i15 == 0) {
            return 0L;
        }
        int iE = e(i15 - 1);
        return this.f80360k[iE] + ((long) this.f80361l[iE]);
    }

    public final void c(int i10) {
        is2 is2Var = this.f80350a;
        long jB = b(i10);
        if (jB > is2Var.f78793g) {
            throw new IllegalArgumentException();
        }
        is2Var.f78793g = jB;
        if (jB != 0) {
            hs2 hs2Var = is2Var.f78790d;
            if (jB != hs2Var.f78346a) {
                while (is2Var.f78793g > hs2Var.f78347b) {
                    hs2Var = hs2Var.f78349d;
                }
                hs2 hs2Var2 = hs2Var.f78349d;
                hs2Var2.getClass();
                is2Var.a(hs2Var2);
                hs2 hs2Var3 = new hs2(is2Var.f78788b, hs2Var.f78347b);
                hs2Var.f78349d = hs2Var3;
                if (is2Var.f78793g == hs2Var.f78347b) {
                    hs2Var = hs2Var3;
                }
                is2Var.f78792f = hs2Var;
                if (is2Var.f78791e == hs2Var2) {
                    is2Var.f78791e = hs2Var3;
                    return;
                }
                return;
            }
        }
        is2Var.a(is2Var.f78790d);
        hs2 hs2Var4 = new hs2(is2Var.f78788b, is2Var.f78793g);
        is2Var.f78790d = hs2Var4;
        is2Var.f78791e = hs2Var4;
        is2Var.f78792f = hs2Var4;
    }

    public final long d(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iE = e(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f80363n[iE]);
            if ((this.f80362m[iE] & 1) != 0) {
                break;
            }
            iE--;
            if (iE == -1) {
                iE = this.f80358i - 1;
            }
        }
        return jMax;
    }

    public final int e(int i10) {
        int i11 = this.f80367r + i10;
        int i12 = this.f80358i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public ms2(qe qeVar, sk0 sk0Var, ok0 ok0Var) {
        this.f80353d = sk0Var;
        this.f80354e = ok0Var;
        this.f80350a = new is2(qeVar);
    }

    public final synchronized void e() {
        this.f80368s = 0;
        is2 is2Var = this.f80350a;
        is2Var.f78791e = is2Var.f78790d;
    }

    public final void d() {
        mk0 mk0Var = this.f80357h;
        if (mk0Var != null) {
            mk0Var.a(this.f80354e);
            this.f80357h = null;
            this.f80356g = null;
        }
    }

    public final synchronized long b() {
        return this.f80371v;
    }

    public final void b(boolean z10) {
        is2 is2Var = this.f80350a;
        is2Var.a(is2Var.f78790d);
        is2Var.f78790d.a(is2Var.f78788b, 0L);
        hs2 hs2Var = is2Var.f78790d;
        is2Var.f78791e = hs2Var;
        is2Var.f78792f = hs2Var;
        is2Var.f78793g = 0L;
        ((ib0) is2Var.f78787a).c();
        this.f80365p = 0;
        this.f80366q = 0;
        this.f80367r = 0;
        this.f80368s = 0;
        this.f80373x = true;
        this.f80369t = Long.MIN_VALUE;
        this.f80370u = Long.MIN_VALUE;
        this.f80371v = Long.MIN_VALUE;
        this.f80372w = false;
        f23 f23Var = this.f80352c;
        for (int i10 = 0; i10 < f23Var.f77282b.size(); i10++) {
            f23Var.f77283c.accept(f23Var.f77282b.valueAt(i10));
        }
        f23Var.f77281a = -1;
        f23Var.f77282b.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f80374y = true;
        }
    }

    public final synchronized mx0 c() {
        return this.f80374y ? null : this.B;
    }

    public final synchronized boolean b(long j10, boolean z10) {
        e();
        int iE = e(this.f80368s);
        int i10 = this.f80368s;
        int i11 = this.f80365p;
        if (i10 != i11 && j10 >= this.f80363n[iE] && (j10 <= this.f80371v || z10)) {
            int iA = a(iE, i11 - i10, j10, true);
            if (iA == -1) {
                return false;
            }
            this.f80369t = j10;
            this.f80368s += iA;
            return true;
        }
        return false;
    }

    public final long a(int i10) {
        this.f80370u = Math.max(this.f80370u, d(i10));
        this.f80365p -= i10;
        int i11 = this.f80366q + i10;
        this.f80366q = i11;
        int i12 = this.f80367r + i10;
        this.f80367r = i12;
        int i13 = this.f80358i;
        if (i12 >= i13) {
            this.f80367r = i12 - i13;
        }
        int i14 = this.f80368s - i10;
        this.f80368s = i14;
        if (i14 < 0) {
            this.f80368s = 0;
        }
        this.f80352c.b(i11);
        if (this.f80365p == 0) {
            int i15 = this.f80367r;
            if (i15 == 0) {
                i15 = this.f80358i;
            }
            int i16 = i15 - 1;
            return this.f80360k[i16] + ((long) this.f80361l[i16]);
        }
        return this.f80360k[this.f80367r];
    }

    public final void a(long j10, boolean z10, boolean z11) {
        long jA;
        int i10;
        is2 is2Var = this.f80350a;
        synchronized (this) {
            int i11 = this.f80365p;
            jA = -1;
            if (i11 != 0) {
                long[] jArr = this.f80363n;
                int i12 = this.f80367r;
                if (j10 >= jArr[i12]) {
                    if (z11 && (i10 = this.f80368s) != i11) {
                        i11 = i10 + 1;
                    }
                    int iA = a(i12, i11, j10, z10);
                    if (iA != -1) {
                        jA = a(iA);
                    }
                }
            }
        }
        is2Var.a(jA);
    }

    public final void a() {
        long jA;
        is2 is2Var = this.f80350a;
        synchronized (this) {
            int i10 = this.f80365p;
            jA = i10 == 0 ? -1L : a(i10);
        }
        is2Var.a(jA);
    }

    public final int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f80363n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f80362m[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f80358i) {
                i10 = 0;
            }
        }
        return i12;
    }

    @Override // yads.m73
    public final void a(mx0 mx0Var) {
        mx0 mx0Var2;
        if (this.E == 0 || mx0Var.f80433q == Long.MAX_VALUE) {
            mx0Var2 = mx0Var;
        } else {
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.f79971o = mx0Var.f80433q + this.E;
            mx0Var2 = new mx0(lx0Var);
        }
        boolean z10 = false;
        this.f80375z = false;
        this.A = mx0Var;
        synchronized (this) {
            this.f80374y = false;
            if (!ib3.a(mx0Var2, this.B)) {
                if (this.f80352c.f77282b.size() != 0) {
                    SparseArray sparseArray = this.f80352c.f77282b;
                    if (((ks2) sparseArray.valueAt(sparseArray.size() - 1)).f79532a.equals(mx0Var2)) {
                        SparseArray sparseArray2 = this.f80352c.f77282b;
                        this.B = ((ks2) sparseArray2.valueAt(sparseArray2.size() - 1)).f79532a;
                    }
                    mx0 mx0Var3 = this.B;
                    this.C = ht1.a(mx0Var3.f80429m, mx0Var3.f80426j);
                    this.D = false;
                    z10 = true;
                }
                this.B = mx0Var2;
                mx0 mx0Var4 = this.B;
                this.C = ht1.a(mx0Var4.f80429m, mx0Var4.f80426j);
                this.D = false;
                z10 = true;
            }
        }
        ls2 ls2Var = this.f80355f;
        if (ls2Var == null || !z10) {
            return;
        }
        ek2 ek2Var = (ek2) ls2Var;
        ek2Var.f77119q.post(ek2Var.f77117o);
    }

    public final synchronized int a(long j10, boolean z10) {
        int iE = e(this.f80368s);
        int i10 = this.f80368s;
        int i11 = this.f80365p;
        if (i10 != i11 && j10 >= this.f80363n[iE]) {
            if (j10 > this.f80371v && z10) {
                return i11 - i10;
            }
            int iA = a(iE, i11 - i10, j10, true);
            if (iA == -1) {
                return 0;
            }
            return iA;
        }
        return 0;
    }

    public final synchronized boolean a(boolean z10) {
        mx0 mx0Var;
        int i10 = this.f80368s;
        boolean z11 = false;
        if (i10 != this.f80365p) {
            if (((ks2) this.f80352c.c(this.f80366q + i10)).f79532a != this.f80356g) {
                return true;
            }
            int iE = e(this.f80368s);
            mk0 mk0Var = this.f80357h;
            if (mk0Var == null || mk0Var.getState() == 4 || ((this.f80362m[iE] & 1073741824) == 0 && this.f80357h.a())) {
                z11 = true;
            }
            return z11;
        }
        if (z10 || this.f80372w || ((mx0Var = this.B) != null && mx0Var != this.f80356g)) {
            z11 = true;
        }
        return z11;
    }

    public final void a(mx0 mx0Var, nx0 nx0Var) {
        mx0 mx0Var2;
        mx0 mx0Var3 = this.f80356g;
        boolean z10 = mx0Var3 == null;
        kk0 kk0Var = z10 ? null : mx0Var3.f80432p;
        this.f80356g = mx0Var;
        kk0 kk0Var2 = mx0Var.f80432p;
        sk0 sk0Var = this.f80353d;
        if (sk0Var != null) {
            int iA = sk0Var.a(mx0Var);
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.D = iA;
            mx0Var2 = new mx0(lx0Var);
        } else {
            mx0Var2 = mx0Var;
        }
        nx0Var.f80854b = mx0Var2;
        nx0Var.f80853a = this.f80357h;
        if (this.f80353d == null) {
            return;
        }
        if (z10 || !ib3.a(kk0Var, kk0Var2)) {
            mk0 mk0Var = this.f80357h;
            mk0 mk0VarB = this.f80353d.b(this.f80354e, mx0Var);
            this.f80357h = mk0VarB;
            nx0Var.f80853a = mk0VarB;
            if (mk0Var != null) {
                mk0Var.a(this.f80354e);
            }
        }
    }

    public final int a(nx0 nx0Var, sa0 sa0Var, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        js2 js2Var = this.f80351b;
        synchronized (this) {
            sa0Var.f82569e = false;
            int i12 = this.f80368s;
            i11 = -5;
            if (i12 != this.f80365p) {
                mx0 mx0Var = ((ks2) this.f80352c.c(this.f80366q + i12)).f79532a;
                if (!z11 && mx0Var == this.f80356g) {
                    int iE = e(this.f80368s);
                    mk0 mk0Var = this.f80357h;
                    if (mk0Var != null && mk0Var.getState() != 4 && ((this.f80362m[iE] & 1073741824) != 0 || !this.f80357h.a())) {
                        sa0Var.f82569e = true;
                        i11 = -3;
                    }
                    int i13 = this.f80362m[iE];
                    sa0Var.f82731b = i13;
                    long j10 = this.f80363n[iE];
                    sa0Var.f82570f = j10;
                    if (j10 < this.f80369t) {
                        sa0Var.f82731b = i13 | Integer.MIN_VALUE;
                    }
                    js2Var.f79164a = this.f80361l[iE];
                    js2Var.f79165b = this.f80360k[iE];
                    js2Var.f79166c = this.f80364o[iE];
                    i11 = -4;
                } else {
                    a(mx0Var, nx0Var);
                }
            } else if (!z10 && !this.f80372w) {
                mx0 mx0Var2 = this.B;
                if (mx0Var2 == null || (!z11 && mx0Var2 == this.f80356g)) {
                    i11 = -3;
                } else {
                    a(mx0Var2, nx0Var);
                }
            } else {
                sa0Var.f82731b = 4;
                i11 = -4;
            }
        }
        if (i11 == -4 && !sa0Var.b(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    is2 is2Var = this.f80350a;
                    is2.a(is2Var.f78791e, sa0Var, this.f80351b, is2Var.f78789c);
                } else {
                    is2 is2Var2 = this.f80350a;
                    is2Var2.f78791e = is2.a(is2Var2.f78791e, sa0Var, this.f80351b, is2Var2.f78789c);
                }
            }
            if (!z12) {
                this.f80368s++;
            }
        }
        return i11;
    }

    @Override // yads.m73
    public final int a(l30 l30Var, int i10, boolean z10) throws EOFException {
        is2 is2Var = this.f80350a;
        hs2 hs2Var = is2Var.f78792f;
        if (hs2Var.f78348c == null) {
            pe peVarA = ((ib0) is2Var.f78787a).a();
            hs2 hs2Var2 = new hs2(is2Var.f78788b, is2Var.f78792f.f78347b);
            hs2Var.f78348c = peVarA;
            hs2Var.f78349d = hs2Var2;
        }
        int iMin = Math.min(i10, (int) (is2Var.f78792f.f78347b - is2Var.f78793g));
        hs2 hs2Var3 = is2Var.f78792f;
        pe peVar = hs2Var3.f78348c;
        int i11 = l30Var.read(peVar.f81379a, ((int) (is2Var.f78793g - hs2Var3.f78346a)) + peVar.f81380b, iMin);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = is2Var.f78793g + ((long) i11);
        is2Var.f78793g = j10;
        hs2 hs2Var4 = is2Var.f78792f;
        if (j10 != hs2Var4.f78347b) {
            return i11;
        }
        is2Var.f78792f = hs2Var4.f78349d;
        return i11;
    }

    @Override // yads.m73
    public final void a(int i10, jb2 jb2Var) {
        is2 is2Var = this.f80350a;
        while (i10 > 0) {
            hs2 hs2Var = is2Var.f78792f;
            if (hs2Var.f78348c == null) {
                pe peVarA = ((ib0) is2Var.f78787a).a();
                hs2 hs2Var2 = new hs2(is2Var.f78788b, is2Var.f78792f.f78347b);
                hs2Var.f78348c = peVarA;
                hs2Var.f78349d = hs2Var2;
            }
            int iMin = Math.min(i10, (int) (is2Var.f78792f.f78347b - is2Var.f78793g));
            hs2 hs2Var3 = is2Var.f78792f;
            pe peVar = hs2Var3.f78348c;
            jb2Var.a(peVar.f81379a, ((int) (is2Var.f78793g - hs2Var3.f78346a)) + peVar.f81380b, iMin);
            i10 -= iMin;
            long j10 = is2Var.f78793g + ((long) iMin);
            is2Var.f78793g = j10;
            hs2 hs2Var4 = is2Var.f78792f;
            if (j10 == hs2Var4.f78347b) {
                is2Var.f78792f = hs2Var4.f78349d;
            }
        }
        is2Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // yads.m73
    public final void a(long j10, int i10, int i11, int i12, l73 l73Var) {
        int i13;
        if (this.f80375z) {
            mx0 mx0Var = this.A;
            if (mx0Var != null) {
                a(mx0Var);
            } else {
                throw new IllegalStateException();
            }
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.f80373x) {
            if (!z10) {
                return;
            } else {
                this.f80373x = false;
            }
        }
        long j11 = this.E + j10;
        if (!this.C) {
            i13 = i10;
        } else {
            if (j11 < this.f80369t) {
                return;
            }
            if (i14 == 0) {
                if (!this.D) {
                    ih1.d("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.D = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        a(j11, i13, (this.f80350a.f78793g - ((long) i11)) - ((long) i12), i11, l73Var);
    }

    public static ms2 a(qe qeVar) {
        return new ms2(qeVar, null, null);
    }

    public static ms2 a(qe qeVar, sk0 sk0Var, ok0 ok0Var) {
        sk0Var.getClass();
        ok0Var.getClass();
        return new ms2(qeVar, sk0Var, ok0Var);
    }
}
