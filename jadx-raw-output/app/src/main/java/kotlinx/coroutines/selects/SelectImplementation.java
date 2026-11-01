package kotlinx.coroutines.selects;

import bk.l;
import bk.q;
import ck.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.b;
import mj.r;
import nj.b0;
import nk.o;
import nk.y0;
import rj.c;
import sk.a0;
import vk.f;
import vk.g;
import vk.h;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
public class SelectImplementation<R> implements b, g<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63199g = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f63200b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f63202d;
    private volatile /* synthetic */ Object state$volatile = h.f73186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<SelectImplementation<R>.a> f63201c = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63203e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f63204f = h.f73189e;

    /* JADX INFO: compiled from: Select.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f63205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<Object, f<?>, Object, r> f63206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<Object, Object, Object, Object> f63207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f63208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f63209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q<f<?>, Object, Object, q<Throwable, Object, d, r>> f63210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f63211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f63212h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, q<Object, ? super f<?>, Object, r> qVar, q<Object, Object, Object, ? extends Object> qVar2, Object obj2, Object obj3, q<? super f<?>, Object, Object, ? extends q<? super Throwable, Object, ? super d, r>> qVar3) {
            this.f63205a = obj;
            this.f63206b = qVar;
            this.f63207c = qVar2;
            this.f63208d = obj2;
            this.f63209e = obj3;
            this.f63210f = qVar3;
        }

        public final q<Throwable, Object, d, r> a(f<?> fVar, Object obj) {
            q<f<?>, Object, Object, q<Throwable, Object, d, r>> qVar = this.f63210f;
            if (qVar != null) {
                return qVar.invoke(fVar, this.f63208d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f63211g;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof a0) {
                ((a0) obj).s(this.f63212h, null, selectImplementation.getContext());
                return;
            }
            y0 y0Var = obj instanceof y0 ? (y0) obj : null;
            if (y0Var != null) {
                y0Var.dispose();
            }
        }

        public final Object c(Object obj, c<? super R> cVar) {
            Object obj2 = this.f63209e;
            if (this.f63208d == h.i()) {
                p.h(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((l) obj2).invoke(cVar);
            }
            p.h(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((bk.p) obj2).mo1invoke(obj, cVar);
        }

        public final Object d(Object obj) {
            return this.f63207c.invoke(this.f63205a, this.f63208d, obj);
        }

        public final boolean e(SelectImplementation<R> selectImplementation) {
            this.f63206b.invoke(this.f63205a, selectImplementation, this.f63208d);
            return selectImplementation.f63204f == h.f73189e;
        }
    }

    public Object m(c<? super R> cVar) {
        return n(this, cVar);
    }

    public static /* synthetic */ void v(SelectImplementation selectImplementation, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        selectImplementation.u(aVar, z10);
    }

    @Override // vk.f
    public void b(y0 y0Var) {
        this.f63202d = y0Var;
    }

    @Override // nk.q2
    public void c(a0<?> a0Var, int i10) {
        this.f63202d = a0Var;
        this.f63203e = i10;
    }

    @Override // vk.f
    public void d(Object obj) {
        this.f63204f = obj;
    }

    @Override // vk.g, vk.f
    public d getContext() {
        return this.f63200b;
    }

    public final void j(Object obj) {
        List<SelectImplementation<R>.a> list = this.f63201c;
        p.g(list);
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
            } while (!(((a) it.next()).f63205a == obj));
        } else {
            z10 = true;
            break;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
    }

    public final void k(SelectImplementation<R>.a aVar) {
        List<SelectImplementation<R>.a> list = this.f63201c;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        f63199g.set(this, h.f73187c);
        this.f63204f = h.f73189e;
        this.f63201c = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(c<? super R> cVar) throws Throwable {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        SelectImplementation selectImplementation;
        if (cVar instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) cVar;
            int i10 = selectImplementation$doSelectSuspend$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.label = i10 - Integer.MIN_VALUE;
            } else {
                selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, cVar);
            }
        } else {
            selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, cVar);
        }
        Object objL = selectImplementation$doSelectSuspend$1.result;
        Object objF = sj.a.f();
        int i11 = selectImplementation$doSelectSuspend$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                SelectImplementation selectImplementation2 = (SelectImplementation) selectImplementation$doSelectSuspend$1.L$0;
                kotlin.c.b(objL);
                selectImplementation = selectImplementation2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objL);
            }
        }
        kotlin.c.b(objL);
        selectImplementation$doSelectSuspend$1.L$0 = this;
        selectImplementation$doSelectSuspend$1.label = 1;
        if (z(selectImplementation$doSelectSuspend$1) == objF) {
            return objF;
        }
        selectImplementation = this;
        selectImplementation$doSelectSuspend$1.L$0 = null;
        selectImplementation$doSelectSuspend$1.label = 2;
        objL = selectImplementation.l(selectImplementation$doSelectSuspend$1);
        return objL == objF ? objF : objL;
    }

    public final SelectImplementation<R>.a p(Object obj) {
        List<SelectImplementation<R>.a> list = this.f63201c;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((a) obj3).f63205a == obj) {
                obj2 = obj3;
                break;
            }
        }
        SelectImplementation<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public void r(vk.a aVar, l<? super c<? super R>, ? extends Object> lVar) {
        v(this, new a(aVar.d(), aVar.c(), aVar.b(), h.i(), lVar, aVar.a()), false, 1, null);
    }

    public <Q> void s(vk.c<? extends Q> cVar, bk.p<? super Q, ? super c<? super R>, ? extends Object> pVar) {
        v(this, new a(cVar.d(), cVar.c(), cVar.b(), null, pVar, cVar.a()), false, 1, null);
    }

    public final Object z(c<? super r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63199g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f73186b) {
                if (androidx.concurrent.futures.a.a(f63199g, this, obj, cVar2)) {
                    o.c(cVar2, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof a) {
                        cVar2.M(r.f64562a, ((a) obj).a(this, this.f63204f));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (androidx.concurrent.futures.a.a(f63199g, this, obj, h.f73186b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        w(it.next());
                    }
                }
            }
        }
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB == sj.a.f() ? objB : r.f64562a;
    }

    public SelectImplementation(d dVar) {
        this.f63200b = dVar;
    }

    public static /* synthetic */ <R> Object n(SelectImplementation<R> selectImplementation, c<? super R> cVar) {
        if (selectImplementation.t()) {
            return selectImplementation.l(cVar);
        }
        return selectImplementation.o(cVar);
    }

    @Override // kotlinx.coroutines.b
    public void a(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63199g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f73187c) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, h.f73188d));
        List<SelectImplementation<R>.a> list = this.f63201c;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.f63204f = h.f73189e;
        this.f63201c = null;
    }

    @Override // vk.f
    public boolean e(Object obj, Object obj2) {
        if (y(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    public final Object l(c<? super R> cVar) {
        Object obj = f63199g.get(this);
        p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.a aVar = (a) obj;
        Object obj2 = this.f63204f;
        k(aVar);
        return aVar.c(aVar.d(obj2), cVar);
    }

    public final boolean t() {
        return f63199g.get(this) instanceof a;
    }

    public final void u(SelectImplementation<R>.a aVar, boolean z10) {
        if (f63199g.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            j(aVar.f63205a);
        }
        if (aVar.e(this)) {
            if (!z10) {
                List<SelectImplementation<R>.a> list = this.f63201c;
                p.g(list);
                list.add(aVar);
            }
            aVar.f63211g = this.f63202d;
            aVar.f63212h = this.f63203e;
            this.f63202d = null;
            this.f63203e = -1;
            return;
        }
        f63199g.set(this, aVar);
    }

    public final void w(Object obj) {
        SelectImplementation<R>.a aVarP = p(obj);
        p.g(aVarP);
        aVarP.f63211g = null;
        aVarP.f63212h = -1;
        u(aVarP, true);
    }

    public final TrySelectDetailedResult x(Object obj, Object obj2) {
        return h.a(y(obj, obj2));
    }

    public final int y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f63199g.get(this);
            if (obj3 instanceof nk.l) {
                SelectImplementation<R>.a aVarP = p(obj);
                if (aVarP == null) {
                    continue;
                } else {
                    q<Throwable, Object, d, r> qVarA = aVarP.a(this, obj2);
                    if (androidx.concurrent.futures.a.a(f63199g, this, obj3, aVarP)) {
                        this.f63204f = obj2;
                        if (h.j((nk.l) obj3, qVarA)) {
                            return 0;
                        }
                        this.f63204f = h.f73189e;
                        return 2;
                    }
                }
            } else if (!p.e(obj3, h.f73187c) && !(obj3 instanceof a)) {
                if (p.e(obj3, h.f73188d)) {
                    return 2;
                }
                if (p.e(obj3, h.f73186b)) {
                    if (androidx.concurrent.futures.a.a(f63199g, this, obj3, nj.r.e(obj))) {
                        return 1;
                    }
                } else if (obj3 instanceof List) {
                    if (androidx.concurrent.futures.a.a(f63199g, this, obj3, b0.z0((Collection) obj3, obj))) {
                        return 1;
                    }
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
            } else {
                return 3;
            }
        }
    }
}
