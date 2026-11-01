package m4;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.Loader;
import g5.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k3.f0;
import k3.t0;
import k4.b0;
import k4.h0;
import k4.i0;
import k4.j0;
import m4.h;

/* JADX INFO: compiled from: ChunkSampleStream.java */
/* JADX INFO: loaded from: classes6.dex */
public class g<T extends h> implements i0, j0, Loader.b<d>, Loader.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final int[] f64068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Format[] f64069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f64070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T f64071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0.a<g<T>> f64072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0.a f64073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e5.m f64074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Loader f64075j = new Loader("Loader:ChunkSampleStream");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f64076k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<m4.a> f64077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<m4.a> f64078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f64079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h0[] f64080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f64081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Format f64082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public b<T> f64083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f64084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f64085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f64086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f64087v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f64088w;

    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public final class a implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g<T> f64089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h0 f64090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f64091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f64092e;

        @Override // k4.i0
        public void maybeThrowError() throws IOException {
        }

        public a(g<T> gVar, h0 h0Var, int i10) {
            this.f64089b = gVar;
            this.f64090c = h0Var;
            this.f64091d = i10;
        }

        public final void a() {
            if (this.f64092e) {
                return;
            }
            g.this.f64073h.l(g.this.f64068c[this.f64091d], g.this.f64069d[this.f64091d], 0, null, g.this.f64085t);
            this.f64092e = true;
        }

        @Override // k4.i0
        public int b(f0 f0Var, o3.e eVar, boolean z10) {
            if (g.this.s()) {
                return -3;
            }
            a();
            h0 h0Var = this.f64090c;
            g gVar = g.this;
            return h0Var.K(f0Var, eVar, z10, gVar.f64088w, gVar.f64087v);
        }

        public void c() {
            g5.a.f(g.this.f64070e[this.f64091d]);
            g.this.f64070e[this.f64091d] = false;
        }

        @Override // k4.i0
        public boolean isReady() {
            return !g.this.s() && this.f64090c.E(g.this.f64088w);
        }

        @Override // k4.i0
        public int skipData(long j10) {
            if (g.this.s()) {
                return 0;
            }
            a();
            return (!g.this.f64088w || j10 <= this.f64090c.v()) ? this.f64090c.e(j10) : this.f64090c.f();
        }
    }

    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public interface b<T extends h> {
        void b(g<T> gVar);
    }

    public g<T>.a C(long j10, int i10) {
        for (int i11 = 0; i11 < this.f64080o.length; i11++) {
            if (this.f64068c[i11] == i10) {
                g5.a.f(!this.f64070e[i11]);
                this.f64070e[i11] = true;
                this.f64080o[i11].S(j10, true);
                return new a(this, this.f64080o[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    public final void m(int i10) {
        int iMin = Math.min(y(i10, 0), this.f64086u);
        if (iMin > 0) {
            k0.w0(this.f64077l, 0, iMin);
            this.f64086u -= iMin;
        }
    }

    public void z() {
        A(null);
    }

    public void A(@Nullable b<T> bVar) {
        this.f64083r = bVar;
        this.f64079n.J();
        for (h0 h0Var : this.f64080o) {
            h0Var.J();
        }
        this.f64075j.l(this);
    }

    public void B(long j10) {
        boolean zS;
        this.f64085t = j10;
        if (s()) {
            this.f64084s = j10;
            return;
        }
        m4.a aVar = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f64077l.size(); i11++) {
            m4.a aVar2 = this.f64077l.get(i11);
            long j11 = aVar2.f64046f;
            if (j11 == j10 && aVar2.f64032j == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        if (aVar != null) {
            zS = this.f64079n.R(aVar.g(0));
            this.f64087v = 0L;
        } else {
            zS = this.f64079n.S(j10, j10 < getNextLoadPositionUs());
            this.f64087v = this.f64085t;
        }
        if (zS) {
            this.f64086u = y(this.f64079n.x(), 0);
            h0[] h0VarArr = this.f64080o;
            int length = h0VarArr.length;
            while (i10 < length) {
                h0VarArr[i10].S(j10, true);
                i10++;
            }
            return;
        }
        this.f64084s = j10;
        this.f64088w = false;
        this.f64077l.clear();
        this.f64086u = 0;
        if (this.f64075j.i()) {
            this.f64075j.e();
            return;
        }
        this.f64075j.f();
        this.f64079n.O();
        h0[] h0VarArr2 = this.f64080o;
        int length2 = h0VarArr2.length;
        while (i10 < length2) {
            h0VarArr2[i10].O();
            i10++;
        }
    }

    public long a(long j10, t0 t0Var) {
        return this.f64071f.a(j10, t0Var);
    }

    @Override // k4.j0
    public boolean continueLoading(long j10) {
        List<m4.a> listEmptyList;
        long j11;
        if (this.f64088w || this.f64075j.i() || this.f64075j.h()) {
            return false;
        }
        boolean zS = s();
        if (zS) {
            listEmptyList = Collections.emptyList();
            j11 = this.f64084s;
        } else {
            listEmptyList = this.f64078m;
            j11 = p().f64047g;
        }
        this.f64071f.f(j10, j11, listEmptyList, this.f64076k);
        f fVar = this.f64076k;
        boolean z10 = fVar.f64066b;
        d dVar = fVar.f64065a;
        fVar.a();
        if (z10) {
            this.f64084s = -9223372036854775807L;
            this.f64088w = true;
            return true;
        }
        if (dVar == null) {
            return false;
        }
        if (r(dVar)) {
            m4.a aVar = (m4.a) dVar;
            if (zS) {
                long j12 = aVar.f64046f;
                long j13 = this.f64084s;
                if (j12 == j13) {
                    j13 = 0;
                }
                this.f64087v = j13;
                this.f64084s = -9223372036854775807L;
            }
            aVar.i(this.f64081p);
            this.f64077l.add(aVar);
        } else if (dVar instanceof k) {
            ((k) dVar).e(this.f64081p);
        }
        this.f64073h.F(dVar.f64041a, dVar.f64042b, this.f64067b, dVar.f64043c, dVar.f64044d, dVar.f64045e, dVar.f64046f, dVar.f64047g, this.f64075j.m(dVar, this, this.f64074i.getMinimumLoadableRetryCount(dVar.f64042b)));
        return true;
    }

    @Override // k4.j0
    public long getBufferedPositionUs() {
        if (this.f64088w) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.f64084s;
        }
        long jMax = this.f64085t;
        m4.a aVarP = p();
        if (!aVarP.f()) {
            if (this.f64077l.size() > 1) {
                ArrayList<m4.a> arrayList = this.f64077l;
                aVarP = arrayList.get(arrayList.size() - 2);
            } else {
                aVarP = null;
            }
        }
        if (aVarP != null) {
            jMax = Math.max(jMax, aVarP.f64047g);
        }
        return Math.max(jMax, this.f64079n.v());
    }

    @Override // k4.j0
    public boolean isLoading() {
        return this.f64075j.i();
    }

    @Override // k4.i0
    public void maybeThrowError() throws IOException {
        this.f64075j.maybeThrowError();
        this.f64079n.G();
        if (this.f64075j.i()) {
            return;
        }
        this.f64071f.maybeThrowError();
    }

    public final m4.a n(int i10) {
        m4.a aVar = this.f64077l.get(i10);
        ArrayList<m4.a> arrayList = this.f64077l;
        k0.w0(arrayList, i10, arrayList.size());
        this.f64086u = Math.max(this.f64086u, this.f64077l.size());
        int i11 = 0;
        this.f64079n.q(aVar.g(0));
        while (true) {
            h0[] h0VarArr = this.f64080o;
            if (i11 >= h0VarArr.length) {
                return aVar;
            }
            h0 h0Var = h0VarArr[i11];
            i11++;
            h0Var.q(aVar.g(i11));
        }
    }

    public T o() {
        return this.f64071f;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void onLoaderReleased() {
        this.f64079n.M();
        for (h0 h0Var : this.f64080o) {
            h0Var.M();
        }
        b<T> bVar = this.f64083r;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    public final m4.a p() {
        ArrayList<m4.a> arrayList = this.f64077l;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean q(int i10) {
        int iX;
        m4.a aVar = this.f64077l.get(i10);
        if (this.f64079n.x() > aVar.g(0)) {
            return true;
        }
        int i11 = 0;
        do {
            h0[] h0VarArr = this.f64080o;
            if (i11 >= h0VarArr.length) {
                return false;
            }
            iX = h0VarArr[i11].x();
            i11++;
        } while (iX <= aVar.g(i11));
        return true;
    }

    public final boolean r(d dVar) {
        return dVar instanceof m4.a;
    }

    @Override // k4.j0
    public void reevaluateBuffer(long j10) {
        int size;
        int preferredQueueSize;
        if (this.f64075j.i() || this.f64075j.h() || s() || (size = this.f64077l.size()) <= (preferredQueueSize = this.f64071f.getPreferredQueueSize(j10, this.f64078m))) {
            return;
        }
        while (true) {
            if (preferredQueueSize >= size) {
                preferredQueueSize = size;
                break;
            } else if (!q(preferredQueueSize)) {
                break;
            } else {
                preferredQueueSize++;
            }
        }
        if (preferredQueueSize == size) {
            return;
        }
        long j11 = p().f64047g;
        m4.a aVarN = n(preferredQueueSize);
        if (this.f64077l.isEmpty()) {
            this.f64084s = this.f64085t;
        }
        this.f64088w = false;
        this.f64073h.N(this.f64067b, aVarN.f64046f, j11);
    }

    public boolean s() {
        return this.f64084s != -9223372036854775807L;
    }

    public final void t() {
        int iY = y(this.f64079n.x(), this.f64086u - 1);
        while (true) {
            int i10 = this.f64086u;
            if (i10 > iY) {
                return;
            }
            this.f64086u = i10 + 1;
            u(i10);
        }
    }

    public final void u(int i10) {
        m4.a aVar = this.f64077l.get(i10);
        Format format = aVar.f64043c;
        if (!format.equals(this.f64082q)) {
            this.f64073h.l(this.f64067b, format, aVar.f64044d, aVar.f64045e, aVar.f64046f);
        }
        this.f64082q = format;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void f(d dVar, long j10, long j11, boolean z10) {
        this.f64073h.w(dVar.f64041a, dVar.d(), dVar.c(), dVar.f64042b, this.f64067b, dVar.f64043c, dVar.f64044d, dVar.f64045e, dVar.f64046f, dVar.f64047g, j10, j11, dVar.a());
        if (z10) {
            return;
        }
        this.f64079n.O();
        for (h0 h0Var : this.f64080o) {
            h0Var.O();
        }
        this.f64072g.e(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void h(d dVar, long j10, long j11) {
        this.f64071f.g(dVar);
        this.f64073h.z(dVar.f64041a, dVar.d(), dVar.c(), dVar.f64042b, this.f64067b, dVar.f64043c, dVar.f64044d, dVar.f64045e, dVar.f64046f, dVar.f64047g, j10, j11, dVar.a());
        this.f64072g.e(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Loader.c k(d dVar, long j10, long j11, IOException iOException, int i10) {
        long jA = dVar.a();
        boolean zR = r(dVar);
        int size = this.f64077l.size() - 1;
        boolean z10 = (jA != 0 && zR && q(size)) ? false : true;
        Loader.c cVarG = null;
        if (this.f64071f.c(dVar, z10, iOException, z10 ? this.f64074i.a(dVar.f64042b, j11, iOException, i10) : -9223372036854775807L)) {
            if (z10) {
                cVarG = Loader.f20061f;
                if (zR) {
                    g5.a.f(n(size) == dVar);
                    if (this.f64077l.isEmpty()) {
                        this.f64084s = this.f64085t;
                    }
                }
            } else {
                g5.m.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (cVarG == null) {
            long jB = this.f64074i.b(dVar.f64042b, j11, iOException, i10);
            cVarG = jB != -9223372036854775807L ? Loader.g(false, jB) : Loader.f20062g;
        }
        Loader.c cVar = cVarG;
        boolean z11 = !cVar.c();
        this.f64073h.C(dVar.f64041a, dVar.d(), dVar.c(), dVar.f64042b, this.f64067b, dVar.f64043c, dVar.f64044d, dVar.f64045e, dVar.f64046f, dVar.f64047g, j10, j11, jA, iOException, z11);
        if (z11) {
            this.f64072g.e(this);
        }
        return cVar;
    }

    public final int y(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f64077l.size()) {
                return this.f64077l.size() - 1;
            }
        } while (this.f64077l.get(i11).g(0) <= i10);
        return i11 - 1;
    }

    public g(int i10, @Nullable int[] iArr, @Nullable Format[] formatArr, T t10, j0.a<g<T>> aVar, e5.b bVar, long j10, com.google.android.exoplayer2.drm.a<?> aVar2, e5.m mVar, b0.a aVar3) {
        int length;
        this.f64067b = i10;
        this.f64068c = iArr;
        this.f64069d = formatArr;
        this.f64071f = t10;
        this.f64072g = aVar;
        this.f64073h = aVar3;
        this.f64074i = mVar;
        ArrayList<m4.a> arrayList = new ArrayList<>();
        this.f64077l = arrayList;
        this.f64078m = Collections.unmodifiableList(arrayList);
        int i11 = 0;
        if (iArr == null) {
            length = 0;
        } else {
            length = iArr.length;
        }
        this.f64080o = new h0[length];
        this.f64070e = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        h0[] h0VarArr = new h0[i12];
        h0 h0Var = new h0(bVar, (Looper) g5.a.e(Looper.myLooper()), aVar2);
        this.f64079n = h0Var;
        iArr2[0] = i10;
        h0VarArr[0] = h0Var;
        while (i11 < length) {
            h0 h0Var2 = new h0(bVar, (Looper) g5.a.e(Looper.myLooper()), com.google.android.exoplayer2.drm.a.a());
            this.f64080o[i11] = h0Var2;
            int i13 = i11 + 1;
            h0VarArr[i13] = h0Var2;
            iArr2[i13] = iArr[i11];
            i11 = i13;
        }
        this.f64081p = new c(iArr2, h0VarArr);
        this.f64084s = j10;
        this.f64085t = j10;
    }

    @Override // k4.i0
    public int b(f0 f0Var, o3.e eVar, boolean z10) {
        if (s()) {
            return -3;
        }
        t();
        return this.f64079n.K(f0Var, eVar, z10, this.f64088w, this.f64087v);
    }

    public void discardBuffer(long j10, boolean z10) {
        if (s()) {
            return;
        }
        int iT = this.f64079n.t();
        this.f64079n.m(j10, z10, true);
        int iT2 = this.f64079n.t();
        if (iT2 > iT) {
            long jU = this.f64079n.u();
            int i10 = 0;
            while (true) {
                h0[] h0VarArr = this.f64080o;
                if (i10 >= h0VarArr.length) {
                    break;
                }
                h0VarArr[i10].m(jU, z10, this.f64070e[i10]);
                i10++;
            }
        }
        m(iT2);
    }

    @Override // k4.j0
    public long getNextLoadPositionUs() {
        if (s()) {
            return this.f64084s;
        }
        if (this.f64088w) {
            return Long.MIN_VALUE;
        }
        return p().f64047g;
    }

    @Override // k4.i0
    public boolean isReady() {
        if (!s() && this.f64079n.E(this.f64088w)) {
            return true;
        }
        return false;
    }

    @Override // k4.i0
    public int skipData(long j10) {
        int iE;
        if (s()) {
            return 0;
        }
        if (this.f64088w && j10 > this.f64079n.v()) {
            iE = this.f64079n.f();
        } else {
            iE = this.f64079n.e(j10);
        }
        t();
        return iE;
    }
}
