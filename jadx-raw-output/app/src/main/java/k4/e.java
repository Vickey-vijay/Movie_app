package k4;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import k3.v0;

/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e<T> extends k4.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<T, b> f62402g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Handler f62403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public e5.q f62404i;

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public final class a implements b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f62405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0.a f62406c;

        public a(T t10) {
            this.f62406c = e.this.n(null);
            this.f62405b = t10;
        }

        public final boolean a(int i10, @Nullable r.a aVar) {
            r.a aVarY;
            if (aVar != null) {
                aVarY = e.this.y(this.f62405b, aVar);
                if (aVarY == null) {
                    return false;
                }
            } else {
                aVarY = null;
            }
            int iA = e.this.A(this.f62405b, i10);
            b0.a aVar2 = this.f62406c;
            if (aVar2.f62370a == iA && g5.k0.c(aVar2.f62371b, aVarY)) {
                return true;
            }
            this.f62406c = e.this.m(iA, aVarY, 0L);
            return true;
        }

        public final b0.c b(b0.c cVar) {
            long jZ = e.this.z(this.f62405b, cVar.f62387f);
            long jZ2 = e.this.z(this.f62405b, cVar.f62388g);
            return (jZ == cVar.f62387f && jZ2 == cVar.f62388g) ? cVar : new b0.c(cVar.f62382a, cVar.f62383b, cVar.f62384c, cVar.f62385d, cVar.f62386e, jZ, jZ2);
        }

        @Override // k4.b0
        public void d(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f62406c.B(bVar, b(cVar));
            }
        }

        @Override // k4.b0
        public void e(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f62406c.H(bVar, b(cVar));
            }
        }

        @Override // k4.b0
        public void f(int i10, r.a aVar) {
            if (a(i10, aVar) && e.this.F((r.a) g5.a.e(this.f62406c.f62371b))) {
                this.f62406c.I();
            }
        }

        @Override // k4.b0
        public void h(int i10, @Nullable r.a aVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f62406c.O(b(cVar));
            }
        }

        @Override // k4.b0
        public void j(int i10, @Nullable r.a aVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f62406c.m(b(cVar));
            }
        }

        @Override // k4.b0
        public void l(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
            if (a(i10, aVar)) {
                this.f62406c.y(bVar, b(cVar));
            }
        }

        @Override // k4.b0
        public void n(int i10, r.a aVar) {
            if (a(i10, aVar)) {
                this.f62406c.L();
            }
        }

        @Override // k4.b0
        public void u(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f62406c.E(bVar, b(cVar), iOException, z10);
            }
        }

        @Override // k4.b0
        public void w(int i10, r.a aVar) {
            if (a(i10, aVar) && e.this.F((r.a) g5.a.e(this.f62406c.f62371b))) {
                this.f62406c.J();
            }
        }
    }

    public int A(T t10, int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public abstract void B(T t10, r rVar, v0 v0Var);

    public boolean F(r.a aVar) {
        return true;
    }

    @Nullable
    public r.a y(T t10, r.a aVar) {
        return aVar;
    }

    public long z(@Nullable T t10, long j10) {
        return j10;
    }

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f62408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.b f62409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f62410c;

        public b(r rVar, r.b bVar, b0 b0Var) {
            this.f62408a = rVar;
            this.f62409b = bVar;
            this.f62410c = b0Var;
        }
    }

    public final void D(final T t10, r rVar) {
        g5.a.a(!this.f62402g.containsKey(t10));
        r.b bVar = new r.b() { // from class: k4.d
            @Override // k4.r.b
            public final void c(r rVar2, v0 v0Var) {
                this.f62399b.B(t10, rVar2, v0Var);
            }
        };
        a aVar = new a(t10);
        this.f62402g.put(t10, new b(rVar, bVar, aVar));
        rVar.i((Handler) g5.a.e(this.f62403h), aVar);
        rVar.e(bVar, this.f62404i);
        if (r()) {
            return;
        }
        rVar.a(bVar);
    }

    public final void E(T t10) {
        b bVar = (b) g5.a.e(this.f62402g.remove(t10));
        bVar.f62408a.b(bVar.f62409b);
        bVar.f62408a.d(bVar.f62410c);
    }

    @Override // k4.r
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b> it = this.f62402g.values().iterator();
        while (it.hasNext()) {
            it.next().f62408a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // k4.b
    @CallSuper
    public void p() {
        for (b bVar : this.f62402g.values()) {
            bVar.f62408a.a(bVar.f62409b);
        }
    }

    @Override // k4.b
    @CallSuper
    public void q() {
        for (b bVar : this.f62402g.values()) {
            bVar.f62408a.l(bVar.f62409b);
        }
    }

    @Override // k4.b
    @CallSuper
    public void s(@Nullable e5.q qVar) {
        this.f62404i = qVar;
        this.f62403h = new Handler();
    }

    @Override // k4.b
    @CallSuper
    public void u() {
        for (b bVar : this.f62402g.values()) {
            bVar.f62408a.b(bVar.f62409b);
            bVar.f62408a.d(bVar.f62410c);
        }
        this.f62402g.clear();
    }

    public final void w(T t10) {
        b bVar = (b) g5.a.e(this.f62402g.get(t10));
        bVar.f62408a.a(bVar.f62409b);
    }

    public final void x(T t10) {
        b bVar = (b) g5.a.e(this.f62402g.get(t10));
        bVar.f62408a.l(bVar.f62409b);
    }
}
