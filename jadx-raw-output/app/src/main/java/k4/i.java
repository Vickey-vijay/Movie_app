package k4;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.v0;

/* JADX INFO: compiled from: ConcatenatingMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends k4.e<e> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @GuardedBy("this")
    public final List<e> f62524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<d> f62525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public Handler f62526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<e> f62527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<q, e> f62528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map<Object, e> f62529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set<e> f62530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f62531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f62532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f62533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Set<d> f62534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k0 f62535u;

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class b extends k4.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f62536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f62537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int[] f62538g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f62539h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final v0[] f62540i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object[] f62541j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final HashMap<Object, Integer> f62542k;

        @Override // k4.a
        public int A(int i10) {
            return this.f62539h[i10];
        }

        @Override // k4.a
        public v0 D(int i10) {
            return this.f62540i[i10];
        }

        @Override // k3.v0
        public int i() {
            return this.f62537f;
        }

        @Override // k3.v0
        public int p() {
            return this.f62536e;
        }

        @Override // k4.a
        public int s(Object obj) {
            Integer num = this.f62542k.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // k4.a
        public int t(int i10) {
            return g5.k0.g(this.f62538g, i10 + 1, false, false);
        }

        @Override // k4.a
        public int u(int i10) {
            return g5.k0.g(this.f62539h, i10 + 1, false, false);
        }

        @Override // k4.a
        public Object x(int i10) {
            return this.f62541j[i10];
        }

        @Override // k4.a
        public int z(int i10) {
            return this.f62538g[i10];
        }

        public b(Collection<e> collection, k0 k0Var, boolean z10) {
            super(z10, k0Var);
            int size = collection.size();
            this.f62538g = new int[size];
            this.f62539h = new int[size];
            this.f62540i = new v0[size];
            this.f62541j = new Object[size];
            this.f62542k = new HashMap<>();
            int iP = 0;
            int i10 = 0;
            int i11 = 0;
            for (e eVar : collection) {
                this.f62540i[i11] = eVar.f62545a.K();
                this.f62539h[i11] = iP;
                this.f62538g[i11] = i10;
                iP += this.f62540i[i11].p();
                i10 += this.f62540i[i11].i();
                Object[] objArr = this.f62541j;
                Object obj = eVar.f62546b;
                objArr[i11] = obj;
                this.f62542k.put(obj, Integer.valueOf(i11));
                i11++;
            }
            this.f62536e = iP;
            this.f62537f = i10;
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class c extends k4.b {
        public c() {
        }

        @Override // k4.r
        public void c(q qVar) {
        }

        @Override // k4.r
        @Nullable
        public Object getTag() {
            return null;
        }

        @Override // k4.r
        public void maybeThrowSourceInfoRefreshError() throws IOException {
        }

        @Override // k4.b
        public void s(@Nullable e5.q qVar) {
        }

        @Override // k4.b
        public void u() {
        }

        @Override // k4.r
        public q j(r.a aVar, e5.b bVar, long j10) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f62543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f62544b;

        public void a() {
            this.f62543a.post(this.f62544b);
        }

        public d(Handler handler, Runnable runnable) {
            this.f62543a = handler;
            this.f62544b = runnable;
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f62545a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f62548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f62549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f62550f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<r.a> f62547c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f62546b = new Object();

        public void a(int i10, int i11) {
            this.f62548d = i10;
            this.f62549e = i11;
            this.f62550f = false;
            this.f62547c.clear();
        }

        public e(r rVar, boolean z10) {
            this.f62545a = new p(rVar, z10);
        }
    }

    public synchronized void H(int i10, r rVar) {
        L(i10, Collections.singletonList(rVar), null, null);
    }

    public synchronized void I(r rVar) {
        H(this.f62524j.size(), rVar);
    }

    @GuardedBy("this")
    public final void L(int i10, Collection<r> collection, @Nullable Handler handler, @Nullable Runnable runnable) {
        g5.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f62526l;
        Iterator<r> it = collection.iterator();
        while (it.hasNext()) {
            g5.a.e(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<r> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next(), this.f62532r));
        }
        this.f62524j.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i10, arrayList, N(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public final synchronized void P(Set<d> set) {
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f62525k.removeAll(set);
    }

    @Override // k4.e
    @Nullable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public r.a y(e eVar, r.a aVar) {
        for (int i10 = 0; i10 < eVar.f62547c.size(); i10++) {
            if (eVar.f62547c.get(i10).f62605d == aVar.f62605d) {
                return aVar.a(V(eVar, aVar.f62602a));
            }
        }
        return null;
    }

    public synchronized r T(int i10) {
        return this.f62524j.get(i10).f62545a;
    }

    public synchronized int X() {
        return this.f62524j.size();
    }

    public synchronized r d0(int i10) {
        r rVarT;
        rVarT = T(i10);
        f0(i10, i10 + 1, null, null);
        return rVarT;
    }

    @GuardedBy("this")
    public final void f0(int i10, int i11, @Nullable Handler handler, @Nullable Runnable runnable) {
        g5.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f62526l;
        g5.k0.w0(this.f62524j, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(i10, Integer.valueOf(i11), N(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public final void g0() {
        h0(null);
    }

    @Override // k4.r
    @Nullable
    public Object getTag() {
        return null;
    }

    public final void j0() {
        this.f62533s = false;
        Set<d> set = this.f62534t;
        this.f62534t = new HashSet();
        t(new b(this.f62527m, this.f62535u, this.f62531q));
        W().obtainMessage(5, set).sendToTarget();
    }

    @Override // k4.e, k4.b
    public void q() {
    }

    @Override // k4.e, k4.b
    public synchronized void s(@Nullable e5.q qVar) {
        super.s(qVar);
        this.f62526l = new Handler(new Handler.Callback() { // from class: k4.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f62494b.Z(message);
            }
        });
        if (this.f62524j.isEmpty()) {
            j0();
        } else {
            this.f62535u = this.f62535u.cloneAndInsert(0, this.f62524j.size());
            K(0, this.f62524j);
            g0();
        }
    }

    @Override // k4.e, k4.b
    public synchronized void u() {
        super.u();
        this.f62527m.clear();
        this.f62530p.clear();
        this.f62529o.clear();
        this.f62535u = this.f62535u.cloneAndClear();
        Handler handler = this.f62526l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f62526l = null;
        }
        this.f62533s = false;
        this.f62534t.clear();
        P(this.f62525k);
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f62552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final d f62553c;

        public f(int i10, T t10, @Nullable d dVar) {
            this.f62551a = i10;
            this.f62552b = t10;
            this.f62553c = dVar;
        }
    }

    public static Object V(e eVar, Object obj) {
        return k4.a.y(eVar.f62546b, obj);
    }

    public final void J(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = this.f62527m.get(i10 - 1);
            eVar.a(i10, eVar2.f62549e + eVar2.f62545a.K().p());
        } else {
            eVar.a(i10, 0);
        }
        M(i10, 1, eVar.f62545a.K().p());
        this.f62527m.add(i10, eVar);
        this.f62529o.put(eVar.f62546b, eVar);
        D(eVar, eVar.f62545a);
        if (r() && this.f62528n.isEmpty()) {
            this.f62530p.add(eVar);
        } else {
            w(eVar);
        }
    }

    public final void M(int i10, int i11, int i12) {
        while (i10 < this.f62527m.size()) {
            e eVar = this.f62527m.get(i10);
            eVar.f62548d += i11;
            eVar.f62549e += i12;
            i10++;
        }
    }

    @Nullable
    @GuardedBy("this")
    public final d N(@Nullable Handler handler, @Nullable Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.f62525k.add(dVar);
        return dVar;
    }

    public final void O() {
        Iterator<e> it = this.f62530p.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f62547c.isEmpty()) {
                w(next);
                it.remove();
            }
        }
    }

    public final void Q(e eVar) {
        this.f62530p.add(eVar);
        x(eVar);
    }

    public final Handler W() {
        return (Handler) g5.a.e(this.f62526l);
    }

    @Override // k4.e
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public int A(e eVar, int i10) {
        return i10 + eVar.f62549e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Z(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            f fVar = (f) g5.k0.i(message.obj);
            this.f62535u = this.f62535u.cloneAndInsert(fVar.f62551a, ((Collection) fVar.f62552b).size());
            K(fVar.f62551a, (Collection) fVar.f62552b);
            h0(fVar.f62553c);
        } else if (i10 == 1) {
            f fVar2 = (f) g5.k0.i(message.obj);
            int i11 = fVar2.f62551a;
            int iIntValue = ((Integer) fVar2.f62552b).intValue();
            if (i11 == 0 && iIntValue == this.f62535u.getLength()) {
                this.f62535u = this.f62535u.cloneAndClear();
            } else {
                this.f62535u = this.f62535u.cloneAndRemove(i11, iIntValue);
            }
            for (int i12 = iIntValue - 1; i12 >= i11; i12--) {
                e0(i12);
            }
            h0(fVar2.f62553c);
        } else if (i10 == 2) {
            f fVar3 = (f) g5.k0.i(message.obj);
            k0 k0Var = this.f62535u;
            int i13 = fVar3.f62551a;
            k0 k0VarCloneAndRemove = k0Var.cloneAndRemove(i13, i13 + 1);
            this.f62535u = k0VarCloneAndRemove;
            this.f62535u = k0VarCloneAndRemove.cloneAndInsert(((Integer) fVar3.f62552b).intValue(), 1);
            b0(fVar3.f62551a, ((Integer) fVar3.f62552b).intValue());
            h0(fVar3.f62553c);
        } else if (i10 == 3) {
            f fVar4 = (f) g5.k0.i(message.obj);
            this.f62535u = (k0) fVar4.f62552b;
            h0(fVar4.f62553c);
        } else if (i10 == 4) {
            j0();
        } else {
            if (i10 != 5) {
                throw new IllegalStateException();
            }
            P((Set) g5.k0.i(message.obj));
        }
        return true;
    }

    public final void a0(e eVar) {
        if (eVar.f62550f && eVar.f62547c.isEmpty()) {
            this.f62530p.remove(eVar);
            E(eVar);
        }
    }

    @Override // k4.r
    public void c(q qVar) {
        e eVar = (e) g5.a.e(this.f62528n.remove(qVar));
        eVar.f62545a.c(qVar);
        eVar.f62547c.remove(((o) qVar).f62581c);
        if (!this.f62528n.isEmpty()) {
            O();
        }
        a0(eVar);
    }

    public final void e0(int i10) {
        e eVarRemove = this.f62527m.remove(i10);
        this.f62529o.remove(eVarRemove.f62546b);
        M(i10, -1, -eVarRemove.f62545a.K().p());
        eVarRemove.f62550f = true;
        a0(eVarRemove);
    }

    public final void h0(@Nullable d dVar) {
        if (!this.f62533s) {
            W().obtainMessage(4).sendToTarget();
            this.f62533s = true;
        }
        if (dVar != null) {
            this.f62534t.add(dVar);
        }
    }

    public final void i0(e eVar, v0 v0Var) {
        if (eVar == null) {
            throw new IllegalArgumentException();
        }
        if (eVar.f62548d + 1 < this.f62527m.size()) {
            int iP = v0Var.p() - (this.f62527m.get(eVar.f62548d + 1).f62549e - eVar.f62549e);
            if (iP != 0) {
                M(eVar.f62548d + 1, 0, iP);
            }
        }
        g0();
    }

    @Override // k4.r
    public q j(r.a aVar, e5.b bVar, long j10) {
        Object objU = U(aVar.f62602a);
        r.a aVarA = aVar.a(R(aVar.f62602a));
        e eVar = this.f62529o.get(objU);
        if (eVar == null) {
            eVar = new e(new c(), this.f62532r);
            eVar.f62550f = true;
            D(eVar, eVar.f62545a);
        }
        Q(eVar);
        eVar.f62547c.add(aVarA);
        o oVarG = eVar.f62545a.j(aVarA, bVar, j10);
        this.f62528n.put(oVarG, eVar);
        O();
        return oVarG;
    }

    public static Object R(Object obj) {
        return k4.a.v(obj);
    }

    public static Object U(Object obj) {
        return k4.a.w(obj);
    }

    public final void K(int i10, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            J(i10, it.next());
            i10++;
        }
    }

    public final void b0(int i10, int i11) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int iP = this.f62527m.get(iMin).f62549e;
        List<e> list = this.f62527m;
        list.add(i11, list.remove(i10));
        while (iMin <= iMax) {
            e eVar = this.f62527m.get(iMin);
            eVar.f62548d = iMin;
            eVar.f62549e = iP;
            iP += eVar.f62545a.K().p();
            iMin++;
        }
    }

    @Override // k4.e
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void B(e eVar, r rVar, v0 v0Var) {
        i0(eVar, v0Var);
    }

    @Override // k4.e, k4.b
    public void p() {
        super.p();
        this.f62530p.clear();
    }
}
