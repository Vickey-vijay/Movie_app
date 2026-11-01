package k4;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import java.io.IOException;

/* JADX INFO: compiled from: SampleQueue.java */
/* JADX INFO: loaded from: classes10.dex */
public class h0 implements q3.u {
    public int A;
    public boolean B;
    public Format C;
    public long D;
    public boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f62495a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f62497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f62498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f62499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Format f62500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public DrmSession<?> f62501g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f62510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f62511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f62512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f62513s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f62516v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Format f62519y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Format f62520z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f62496b = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62502h = 1000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f62503i = new int[1000];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f62504j = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f62507m = new long[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f62506l = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f62505k = new int[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q3.u.a[] f62508n = new q3.u.a[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Format[] f62509o = new Format[1000];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f62514t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f62515u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f62518x = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f62517w = true;

    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f62522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q3.u.a f62523c;
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    public interface b {
        void b(Format format);
    }

    public final void C() {
        this.B = true;
    }

    public final synchronized boolean D() {
        return this.f62516v;
    }

    @CallSuper
    public synchronized boolean E(boolean z10) {
        Format format;
        boolean z11 = true;
        if (B()) {
            int iY = y(this.f62513s);
            if (this.f62509o[iY] != this.f62500f) {
                return true;
            }
            return F(iY);
        }
        if (!z10 && !this.f62516v && ((format = this.f62519y) == null || format == this.f62500f)) {
            z11 = false;
        }
        return z11;
    }

    public final synchronized int I() {
        return B() ? this.f62503i[y(this.f62513s)] : this.A;
    }

    public final synchronized int L(k3.f0 f0Var, o3.e eVar, boolean z10, boolean z11, long j10, a aVar) {
        boolean zB;
        eVar.f64970d = false;
        int iY = -1;
        while (true) {
            zB = B();
            if (!zB) {
                break;
            }
            iY = y(this.f62513s);
            if (this.f62507m[iY] >= j10 || !g5.p.a(this.f62509o[iY].f18970j)) {
                break;
            }
            this.f62513s++;
        }
        if (!zB) {
            if (!z11 && !this.f62516v) {
                Format format = this.f62519y;
                if (format == null || (!z10 && format == this.f62500f)) {
                    return -3;
                }
                H((Format) g5.a.e(format), f0Var);
                return -5;
            }
            eVar.setFlags(4);
            return -4;
        }
        if (!z10 && this.f62509o[iY] == this.f62500f) {
            if (!F(iY)) {
                eVar.f64970d = true;
                return -3;
            }
            eVar.setFlags(this.f62506l[iY]);
            long j11 = this.f62507m[iY];
            eVar.f64971e = j11;
            if (j11 < j10) {
                eVar.addFlag(Integer.MIN_VALUE);
            }
            if (eVar.e()) {
                return -4;
            }
            aVar.f62521a = this.f62505k[iY];
            aVar.f62522b = this.f62504j[iY];
            aVar.f62523c = this.f62508n[iY];
            this.f62513s++;
            return -4;
        }
        H(this.f62509o[iY], f0Var);
        return -5;
    }

    @CallSuper
    public void M() {
        P(true);
        N();
    }

    public final void O() {
        P(false);
    }

    public final synchronized void Q() {
        this.f62513s = 0;
        this.f62495a.m();
    }

    public final synchronized boolean R(int i10) {
        Q();
        int i11 = this.f62511q;
        if (i10 >= i11 && i10 <= this.f62510p + i11) {
            this.f62513s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean S(long j10, boolean z10) {
        Q();
        int iY = y(this.f62513s);
        if (B() && j10 >= this.f62507m[iY] && (j10 <= this.f62515u || z10)) {
            int iR = r(iY, this.f62510p - this.f62513s, j10, true);
            if (iR == -1) {
                return false;
            }
            this.f62513s += iR;
            return true;
        }
        return false;
    }

    public final synchronized boolean U(Format format) {
        try {
            if (format == null) {
                this.f62518x = true;
                return false;
            }
            this.f62518x = false;
            if (g5.k0.c(format, this.f62519y)) {
                return false;
            }
            if (g5.k0.c(format, this.f62520z)) {
                this.f62519y = this.f62520z;
                return true;
            }
            this.f62519y = format;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void X() {
        this.E = true;
    }

    @Override // q3.u
    public final void d(long j10, int i10, int i11, int i12, @Nullable q3.u.a aVar) {
        if (this.B) {
            a(this.C);
        }
        long j11 = j10 + this.D;
        if (this.E) {
            if ((i10 & 1) == 0 || !g(j11)) {
                return;
            } else {
                this.E = false;
            }
        }
        h(j11, i10, (this.f62495a.e() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    public final synchronized int e(long j10) {
        int iY = y(this.f62513s);
        if (B() && j10 >= this.f62507m[iY]) {
            int iR = r(iY, this.f62510p - this.f62513s, j10, true);
            if (iR == -1) {
                return 0;
            }
            this.f62513s += iR;
            return iR;
        }
        return 0;
    }

    public final synchronized int f() {
        int i10;
        int i11 = this.f62510p;
        i10 = i11 - this.f62513s;
        this.f62513s = i11;
        return i10;
    }

    public final synchronized boolean g(long j10) {
        if (this.f62510p == 0) {
            return j10 > this.f62514t;
        }
        if (Math.max(this.f62514t, w(this.f62513s)) >= j10) {
            return false;
        }
        int i10 = this.f62510p;
        int iY = y(i10 - 1);
        while (i10 > this.f62513s && this.f62507m[iY] >= j10) {
            i10--;
            iY--;
            if (iY == -1) {
                iY = this.f62502h - 1;
            }
        }
        p(this.f62511q + i10);
        return true;
    }

    public final synchronized void h(long j10, int i10, long j11, int i11, q3.u.a aVar) {
        if (this.f62517w) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f62517w = false;
            }
        }
        g5.a.f(!this.f62518x);
        this.f62516v = (536870912 & i10) != 0;
        this.f62515u = Math.max(this.f62515u, j10);
        int iY = y(this.f62510p);
        this.f62507m[iY] = j10;
        long[] jArr = this.f62504j;
        jArr[iY] = j11;
        this.f62505k[iY] = i11;
        this.f62506l[iY] = i10;
        this.f62508n[iY] = aVar;
        Format[] formatArr = this.f62509o;
        Format format = this.f62519y;
        formatArr[iY] = format;
        this.f62503i[iY] = this.A;
        this.f62520z = format;
        int i12 = this.f62510p + 1;
        this.f62510p = i12;
        int i13 = this.f62502h;
        if (i12 == i13) {
            int i14 = i13 + 1000;
            int[] iArr = new int[i14];
            long[] jArr2 = new long[i14];
            long[] jArr3 = new long[i14];
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            q3.u.a[] aVarArr = new q3.u.a[i14];
            Format[] formatArr2 = new Format[i14];
            int i15 = this.f62512r;
            int i16 = i13 - i15;
            System.arraycopy(jArr, i15, jArr2, 0, i16);
            System.arraycopy(this.f62507m, this.f62512r, jArr3, 0, i16);
            System.arraycopy(this.f62506l, this.f62512r, iArr2, 0, i16);
            System.arraycopy(this.f62505k, this.f62512r, iArr3, 0, i16);
            System.arraycopy(this.f62508n, this.f62512r, aVarArr, 0, i16);
            System.arraycopy(this.f62509o, this.f62512r, formatArr2, 0, i16);
            System.arraycopy(this.f62503i, this.f62512r, iArr, 0, i16);
            int i17 = this.f62512r;
            System.arraycopy(this.f62504j, 0, jArr2, i16, i17);
            System.arraycopy(this.f62507m, 0, jArr3, i16, i17);
            System.arraycopy(this.f62506l, 0, iArr2, i16, i17);
            System.arraycopy(this.f62505k, 0, iArr3, i16, i17);
            System.arraycopy(this.f62508n, 0, aVarArr, i16, i17);
            System.arraycopy(this.f62509o, 0, formatArr2, i16, i17);
            System.arraycopy(this.f62503i, 0, iArr, i16, i17);
            this.f62504j = jArr2;
            this.f62507m = jArr3;
            this.f62506l = iArr2;
            this.f62505k = iArr3;
            this.f62508n = aVarArr;
            this.f62509o = formatArr2;
            this.f62503i = iArr;
            this.f62512r = 0;
            this.f62502h = i14;
        }
    }

    public final synchronized long i(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f62510p;
        if (i11 != 0) {
            long[] jArr = this.f62507m;
            int i12 = this.f62512r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f62513s) != i11) {
                    i11 = i10 + 1;
                }
                int iR = r(i12, i11, j10, z10);
                if (iR == -1) {
                    return -1L;
                }
                return l(iR);
            }
        }
        return -1L;
    }

    public final synchronized long j() {
        int i10 = this.f62510p;
        if (i10 == 0) {
            return -1L;
        }
        return l(i10);
    }

    public synchronized long k() {
        int i10 = this.f62513s;
        if (i10 == 0) {
            return -1L;
        }
        return l(i10);
    }

    public final int r(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11 && this.f62507m[i10] <= j10; i13++) {
            if (!z10 || (this.f62506l[i10] & 1) != 0) {
                i12 = i13;
            }
            i10++;
            if (i10 == this.f62502h) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long u() {
        return this.f62510p == 0 ? Long.MIN_VALUE : this.f62507m[this.f62512r];
    }

    public final synchronized long v() {
        return this.f62515u;
    }

    public final synchronized Format z() {
        return this.f62518x ? null : this.f62519y;
    }

    public final int A() {
        return this.f62511q + this.f62510p;
    }

    public final boolean B() {
        return this.f62513s != this.f62510p;
    }

    public final boolean F(int i10) {
        DrmSession<?> drmSession;
        if (this.f62497c == com.google.android.exoplayer2.drm.a.f19177a || (drmSession = this.f62501g) == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f62506l[i10] & 1073741824) == 0 && this.f62501g.playClearSamplesWithoutKeys();
    }

    @CallSuper
    public void G() throws IOException {
        DrmSession<?> drmSession = this.f62501g;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) g5.a.e(this.f62501g.getError()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Format format, k3.f0 f0Var) {
        f0Var.f62129c = format;
        Format format2 = this.f62500f;
        boolean z10 = format2 == null;
        DrmInitData drmInitData = z10 ? null : format2.f18973m;
        this.f62500f = format;
        if (this.f62497c == com.google.android.exoplayer2.drm.a.f19177a) {
            return;
        }
        DrmInitData drmInitData2 = format.f18973m;
        f0Var.f62127a = true;
        f0Var.f62128b = this.f62501g;
        if (z10 || !g5.k0.c(drmInitData, drmInitData2)) {
            DrmSession<?> drmSession = this.f62501g;
            DrmSession drmSessionE = drmInitData2 != null ? this.f62497c.e(this.f62499e, drmInitData2) : this.f62497c.d(this.f62499e, g5.p.h(format.f18970j));
            this.f62501g = drmSessionE;
            f0Var.f62128b = drmSessionE;
            if (drmSession != null) {
                drmSession.release();
            }
        }
    }

    @CallSuper
    public int K(k3.f0 f0Var, o3.e eVar, boolean z10, boolean z11, long j10) {
        int iL = L(f0Var, eVar, z10, z11, j10, this.f62496b);
        if (iL == -4 && !eVar.isEndOfStream() && !eVar.e()) {
            this.f62495a.k(eVar, this.f62496b);
        }
        return iL;
    }

    public final void N() {
        DrmSession<?> drmSession = this.f62501g;
        if (drmSession != null) {
            drmSession.release();
            this.f62501g = null;
            this.f62500f = null;
        }
    }

    @CallSuper
    public void P(boolean z10) {
        this.f62495a.l();
        this.f62510p = 0;
        this.f62511q = 0;
        this.f62512r = 0;
        this.f62513s = 0;
        this.f62517w = true;
        this.f62514t = Long.MIN_VALUE;
        this.f62515u = Long.MIN_VALUE;
        this.f62516v = false;
        this.f62520z = null;
        if (z10) {
            this.C = null;
            this.f62519y = null;
            this.f62518x = true;
        }
    }

    public final void T(long j10) {
        if (this.D != j10) {
            this.D = j10;
            C();
        }
    }

    public final void V(b bVar) {
        this.f62498d = bVar;
    }

    public final void W(int i10) {
        this.A = i10;
    }

    @Override // q3.u
    public final int b(q3.h hVar, int i10, boolean z10) throws InterruptedException, IOException {
        return this.f62495a.n(hVar, i10, z10);
    }

    @Override // q3.u
    public final void c(g5.t tVar, int i10) {
        this.f62495a.o(tVar, i10);
    }

    public final long l(int i10) {
        this.f62514t = Math.max(this.f62514t, w(i10));
        int i11 = this.f62510p - i10;
        this.f62510p = i11;
        this.f62511q += i10;
        int i12 = this.f62512r + i10;
        this.f62512r = i12;
        int i13 = this.f62502h;
        if (i12 >= i13) {
            this.f62512r = i12 - i13;
        }
        int i14 = this.f62513s - i10;
        this.f62513s = i14;
        if (i14 < 0) {
            this.f62513s = 0;
        }
        if (i11 != 0) {
            return this.f62504j[this.f62512r];
        }
        int i15 = this.f62512r;
        if (i15 != 0) {
            i13 = i15;
        }
        int i16 = i13 - 1;
        return this.f62504j[i16] + ((long) this.f62505k[i16]);
    }

    public final void m(long j10, boolean z10, boolean z11) {
        this.f62495a.c(i(j10, z10, z11));
    }

    public final void n() {
        this.f62495a.c(j());
    }

    public final void o() {
        this.f62495a.c(k());
    }

    public final void q(int i10) {
        this.f62495a.d(p(i10));
    }

    @CallSuper
    public Format s(Format format) {
        long j10 = this.D;
        if (j10 == 0) {
            return format;
        }
        long j11 = format.f18974n;
        return j11 != Long.MAX_VALUE ? format.l(j11 + j10) : format;
    }

    public final int t() {
        return this.f62511q;
    }

    public final long w(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iY = y(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f62507m[iY]);
            if ((this.f62506l[iY] & 1) != 0) {
                break;
            }
            iY--;
            if (iY == -1) {
                iY = this.f62502h - 1;
            }
        }
        return jMax;
    }

    public final int x() {
        return this.f62511q + this.f62513s;
    }

    public final int y(int i10) {
        int i11 = this.f62512r + i10;
        int i12 = this.f62502h;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public h0(e5.b bVar, Looper looper, com.google.android.exoplayer2.drm.a<?> aVar) {
        this.f62495a = new g0(bVar);
        this.f62499e = looper;
        this.f62497c = aVar;
    }

    @CallSuper
    public void J() {
        n();
        N();
    }

    @Override // q3.u
    public final void a(Format format) {
        Format formatS = s(format);
        this.B = false;
        this.C = format;
        boolean zU = U(formatS);
        b bVar = this.f62498d;
        if (bVar != null && zU) {
            bVar.b(formatS);
        }
    }

    public final long p(int i10) {
        boolean z10;
        int iA = A() - i10;
        boolean z11 = false;
        if (iA >= 0 && iA <= this.f62510p - this.f62513s) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.a(z10);
        int i11 = this.f62510p - iA;
        this.f62510p = i11;
        this.f62515u = Math.max(this.f62514t, w(i11));
        if (iA == 0 && this.f62516v) {
            z11 = true;
        }
        this.f62516v = z11;
        int i12 = this.f62510p;
        if (i12 != 0) {
            int iY = y(i12 - 1);
            return this.f62504j[iY] + ((long) this.f62505k[iY]);
        }
        return 0L;
    }
}
