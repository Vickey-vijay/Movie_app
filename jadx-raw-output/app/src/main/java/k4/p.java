package k4;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import k3.v0;

/* JADX INFO: compiled from: MaskingMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class p extends e<Void> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f62589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f62590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0.c f62591l = new v0.c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v0.b f62592m = new v0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f62593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public o f62594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public b0.a f62595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f62596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f62597r;

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class a extends v0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Object f62598b;

        @Override // k3.v0
        public v0.b g(int i10, v0.b bVar, boolean z10) {
            return bVar.p(0, b.f62599e, 0, -9223372036854775807L, 0L);
        }

        @Override // k3.v0
        public int i() {
            return 1;
        }

        @Override // k3.v0
        public int p() {
            return 1;
        }

        @Override // k3.v0
        public int b(Object obj) {
            return obj == b.f62599e ? 0 : -1;
        }

        @Override // k3.v0
        public Object m(int i10) {
            return b.f62599e;
        }

        @Override // k3.v0
        public v0.c o(int i10, v0.c cVar, long j10) {
            return cVar.e(v0.c.f62332n, this.f62598b, null, -9223372036854775807L, -9223372036854775807L, false, true, false, 0L, -9223372036854775807L, 0, 0, 0L);
        }

        public a(@Nullable Object obj) {
            this.f62598b = obj;
        }
    }

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class b extends m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Object f62599e = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f62600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f62601d;

        public static b u(@Nullable Object obj) {
            return new b(new a(obj), v0.c.f62332n, f62599e);
        }

        public static b v(v0 v0Var, Object obj, Object obj2) {
            return new b(v0Var, obj, obj2);
        }

        @Override // k3.v0
        public int b(Object obj) {
            v0 v0Var = this.f62574b;
            if (f62599e.equals(obj)) {
                obj = this.f62601d;
            }
            return v0Var.b(obj);
        }

        @Override // k3.v0
        public v0.b g(int i10, v0.b bVar, boolean z10) {
            this.f62574b.g(i10, bVar, z10);
            if (g5.k0.c(bVar.f62327b, this.f62601d)) {
                bVar.f62327b = f62599e;
            }
            return bVar;
        }

        @Override // k3.v0
        public Object m(int i10) {
            Object objM = this.f62574b.m(i10);
            return g5.k0.c(objM, this.f62601d) ? f62599e : objM;
        }

        @Override // k3.v0
        public v0.c o(int i10, v0.c cVar, long j10) {
            this.f62574b.o(i10, cVar, j10);
            if (g5.k0.c(cVar.f62333a, this.f62600c)) {
                cVar.f62333a = v0.c.f62332n;
            }
            return cVar;
        }

        public b t(v0 v0Var) {
            return new b(v0Var, this.f62600c, this.f62601d);
        }

        public b(v0 v0Var, Object obj, Object obj2) {
            super(v0Var);
            this.f62600c = obj;
            this.f62601d = obj2;
        }
    }

    @Override // k4.r
    public void c(q qVar) {
        ((o) qVar).k();
        if (qVar == this.f62594o) {
            ((b0.a) g5.a.e(this.f62595p)).J();
            this.f62595p = null;
            this.f62594o = null;
        }
    }

    @Override // k4.e, k4.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // k4.e, k4.b
    public void u() {
        this.f62597r = false;
        this.f62596q = false;
        super.u();
    }

    @Override // k4.e
    public boolean F(r.a aVar) {
        o oVar = this.f62594o;
        return oVar == null || !aVar.equals(oVar.f62581c);
    }

    @Override // k4.r
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public o j(r.a aVar, e5.b bVar, long j10) {
        o oVar = new o(this.f62589j, aVar, bVar, j10);
        if (this.f62597r) {
            oVar.b(aVar.a(I(aVar.f62602a)));
        } else {
            this.f62594o = oVar;
            b0.a aVarM = m(0, aVar, 0L);
            this.f62595p = aVarM;
            aVarM.I();
            if (!this.f62596q) {
                this.f62596q = true;
                D(null, this.f62589j);
            }
        }
        return oVar;
    }

    public final Object H(Object obj) {
        return this.f62593n.f62601d.equals(obj) ? b.f62599e : obj;
    }

    public final Object I(Object obj) {
        return obj.equals(b.f62599e) ? this.f62593n.f62601d : obj;
    }

    @Override // k4.e
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public r.a y(Void r10, r.a aVar) {
        return aVar.a(H(aVar.f62602a));
    }

    public v0 K() {
        return this.f62593n;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    @Override // k4.e
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void B(Void r10, r rVar, v0 v0Var) {
        long j10;
        if (this.f62597r) {
            this.f62593n = this.f62593n.t(v0Var);
        } else if (v0Var.q()) {
            this.f62593n = b.v(v0Var, v0.c.f62332n, b.f62599e);
        } else {
            v0Var.n(0, this.f62591l);
            long jB = this.f62591l.b();
            o oVar = this.f62594o;
            if (oVar != null) {
                long jG = oVar.g();
                if (jG != 0) {
                    j10 = jG;
                } else {
                    j10 = jB;
                }
            } else {
                j10 = jB;
            }
            v0.c cVar = this.f62591l;
            Object obj = cVar.f62333a;
            Pair<Object, Long> pairJ = v0Var.j(cVar, this.f62592m, 0, j10);
            Object obj2 = pairJ.first;
            long jLongValue = ((Long) pairJ.second).longValue();
            this.f62593n = b.v(v0Var, obj, obj2);
            o oVar2 = this.f62594o;
            if (oVar2 != null) {
                oVar2.j(jLongValue);
                r.a aVar = oVar2.f62581c;
                oVar2.b(aVar.a(I(aVar.f62602a)));
            }
        }
        this.f62597r = true;
        t(this.f62593n);
    }

    @Override // k4.r
    @Nullable
    public Object getTag() {
        return this.f62589j.getTag();
    }

    public p(r rVar, boolean z10) {
        this.f62589j = rVar;
        this.f62590k = z10;
        this.f62593n = b.u(rVar.getTag());
    }

    @Override // k4.e, k4.b
    public void s(@Nullable e5.q qVar) {
        super.s(qVar);
        if (!this.f62590k) {
            this.f62596q = true;
            D(null, this.f62589j);
        }
    }
}
