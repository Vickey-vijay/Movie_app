package sk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sk.b;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b<N extends b<N>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71937b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71938c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean k();

    public b(N n10) {
        this._prev$volatile = n10;
    }

    public final void c() {
        f71938c.set(this, null);
    }

    public final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.k()) {
            n10 = (N) f71938c.get(n10);
        }
        return n10;
    }

    public final N e() {
        b bVarF;
        N n10 = (N) f();
        ck.p.g(n10);
        while (n10.k() && (bVarF = n10.f()) != null) {
            n10 = (N) bVarF;
        }
        return n10;
    }

    public final N f() {
        Object objG = g();
        if (objG == a.f71934a) {
            return null;
        }
        return (N) objG;
    }

    public final Object g() {
        return f71937b.get(this);
    }

    public final N h() {
        return (N) f71938c.get(this);
    }

    public final boolean l() {
        if (f() == null) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        return androidx.concurrent.futures.a.a(f71937b, this, null, a.f71934a);
    }

    public final void n() {
        Object obj;
        b bVar;
        if (l()) {
            return;
        }
        while (true) {
            b bVarD = d();
            b bVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71938c;
            do {
                obj = atomicReferenceFieldUpdater.get(bVarE);
                if (((b) obj) == null) {
                    bVar = null;
                } else {
                    bVar = bVarD;
                }
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, bVarE, obj, bVar));
            if (bVarD != null) {
                f71937b.set(bVarD, bVarE);
            }
            if (!bVarE.k() || bVarE.l()) {
                if (bVarD == null || !bVarD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(N n10) {
        return androidx.concurrent.futures.a.a(f71937b, this, null, n10);
    }
}
