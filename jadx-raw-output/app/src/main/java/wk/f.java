package wk;

import bk.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import mj.r;
import nk.h0;
import nk.l;
import nk.m0;
import nk.o;
import nk.q2;
import sk.a0;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes4.dex */
public class f extends SemaphoreAndMutexImpl implements wk.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f74138i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q<vk.f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> f74139h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: Mutex.kt */
    public final class a implements l<r>, q2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kotlinx.coroutines.c<r> f74140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f74141c;

        @Override // nk.l
        public Object D(Throwable th2) {
            return this.f74140b.D(th2);
        }

        @Override // nk.q2
        public void c(a0<?> a0Var, int i10) {
            this.f74140b.c(a0Var, i10);
        }

        @Override // nk.l
        public boolean d() {
            return this.f74140b.d();
        }

        @Override // nk.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void K(r rVar, bk.l<? super Throwable, r> lVar) {
            this.f74140b.K(rVar, lVar);
        }

        @Override // nk.l, rj.c
        public kotlin.coroutines.d getContext() {
            return this.f74140b.getContext();
        }

        @Override // nk.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void z(h0 h0Var, r rVar) {
            this.f74140b.z(h0Var, rVar);
        }

        @Override // nk.l
        public boolean isActive() {
            return this.f74140b.isActive();
        }

        @Override // nk.l
        public boolean j(Throwable th2) {
            return this.f74140b.j(th2);
        }

        @Override // nk.l
        public void p(bk.l<? super Throwable, r> lVar) {
            this.f74140b.p(lVar);
        }

        @Override // rj.c
        public void resumeWith(Object obj) {
            this.f74140b.resumeWith(obj);
        }

        @Override // nk.l
        public void x(Object obj) {
            this.f74140b.x(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.c<? super r> cVar, Object obj) {
            this.f74140b = cVar;
            this.f74141c = obj;
        }

        public static final r g(f fVar, a aVar, Throwable th2) {
            fVar.b(aVar.f74141c);
            return r.f64562a;
        }

        @Override // nk.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public <R extends r> Object r(R r10, Object obj, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
            final f fVar = f.this;
            Object objR = this.f74140b.r(r10, obj, new q() { // from class: wk.e
                @Override // bk.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return f.a.k(fVar, this, (Throwable) obj2, (r) obj3, (kotlin.coroutines.d) obj4);
                }
            });
            if (objR != null) {
                f.v().set(f.this, this.f74141c);
            }
            return objR;
        }

        public static final r k(f fVar, a aVar, Throwable th2, r rVar, kotlin.coroutines.d dVar) {
            f.v().set(fVar, aVar.f74141c);
            fVar.b(aVar.f74141c);
            return r.f64562a;
        }

        @Override // nk.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public <R extends r> void M(R r10, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
            f.v().set(f.this, this.f74141c);
            kotlinx.coroutines.c<r> cVar = this.f74140b;
            final f fVar = f.this;
            cVar.K(r10, new bk.l() { // from class: wk.d
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return f.a.g(fVar, this, (Throwable) obj);
                }
            });
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f74143a;
        this.f74139h = new q() { // from class: wk.b
            @Override // bk.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f.A(this.f74131b, (vk.f) obj, obj2, obj3);
            }
        };
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater v() {
        return f74138i;
    }

    @Override // wk.a
    public Object a(Object obj, rj.c<? super r> cVar) {
        return y(this, obj, cVar);
    }

    public static final q A(final f fVar, vk.f fVar2, final Object obj, Object obj2) {
        return new q() { // from class: wk.c
            @Override // bk.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.B(this.f74132b, obj, (Throwable) obj3, obj4, (kotlin.coroutines.d) obj5);
            }
        };
    }

    public String toString() {
        return "Mutex@" + m0.b(this) + "[isLocked=" + x() + ",owner=" + f74138i.get(this) + ']';
    }

    public static final r B(f fVar, Object obj, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        fVar.b(obj);
        return r.f64562a;
    }

    public static /* synthetic */ Object y(f fVar, Object obj, rj.c<? super r> cVar) {
        if (fVar.C(obj)) {
            return r.f64562a;
        }
        Object objZ = fVar.z(obj, cVar);
        if (objZ == sj.a.f()) {
            return objZ;
        }
        return r.f64562a;
    }

    public boolean C(Object obj) {
        int iD = D(obj);
        if (iD == 0) {
            return true;
        }
        if (iD != 1) {
            if (iD != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    public final int D(Object obj) {
        while (!p()) {
            if (obj == null) {
                return 1;
            }
            int iW = w(obj);
            if (iW == 1) {
                return 2;
            }
            if (iW == 2) {
                return 1;
            }
        }
        f74138i.set(this, obj);
        return 0;
    }

    @Override // wk.a
    public void b(Object obj) {
        boolean z10;
        while (x()) {
            Object obj2 = f74138i.get(this);
            if (obj2 != g.f74143a) {
                if (obj2 != obj && obj != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (androidx.concurrent.futures.a.a(f74138i, this, obj2, g.f74143a)) {
                        o();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final int w(Object obj) {
        while (x()) {
            Object obj2 = f74138i.get(this);
            if (obj2 != g.f74143a) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    public boolean x() {
        if (h() == 0) {
            return true;
        }
        return false;
    }

    public final Object z(Object obj, rj.c<? super r> cVar) {
        kotlinx.coroutines.c cVarB = o.b(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        try {
            d(new a(cVarB, obj));
            Object objB = cVarB.B();
            if (objB == sj.a.f()) {
                tj.f.c(cVar);
            }
            if (objB == sj.a.f()) {
                return objB;
            }
            return r.f64562a;
        } catch (Throwable th2) {
            cVarB.T();
            throw th2;
        }
    }
}
