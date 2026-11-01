package io.reactivex.internal.functions;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class Functions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oi.o<Object, Object> f61029a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f61030b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oi.a f61031c = new n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oi.g<Object> f61032d = new o();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final oi.g<Throwable> f61033e = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final oi.g<Throwable> f61034f = new d0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final oi.p f61035g = new p();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final oi.q<Object> f61036h = new i0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final oi.q<Object> f61037i = new t();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Callable<Object> f61038j = new c0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Comparator<Object> f61039k = new y();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final oi.g<qo.c> f61040l = new x();

    public enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class a<T> implements oi.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.a f61043b;

        @Override // oi.g
        public void accept(T t10) throws Exception {
            this.f61043b.run();
        }

        public a(oi.a aVar) {
            this.f61043b = aVar;
        }
    }

    public static final class a0<T> implements oi.g<Throwable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.g<? super ii.j<T>> f61044b;

        @Override // oi.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f61044b.accept(ii.j.b(th2));
        }

        public a0(oi.g<? super ii.j<T>> gVar) {
            this.f61044b = gVar;
        }
    }

    public static final class b0<T> implements oi.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.g<? super ii.j<T>> f61046b;

        @Override // oi.g
        public void accept(T t10) throws Exception {
            this.f61046b.accept(ii.j.c(t10));
        }

        public b0(oi.g<? super ii.j<T>> gVar) {
            this.f61046b = gVar;
        }
    }

    public static final class c0 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    public static final class d0 implements oi.g<Throwable> {
        @Override // oi.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            ej.a.s(new OnErrorNotImplementedException(th2));
        }
    }

    public static final class e0<T> implements oi.o<T, gj.b<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeUnit f61050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ii.s f61051c;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gj.b<T> apply(T t10) throws Exception {
            return new gj.b<>(t10, this.f61051c.b(this.f61050b), this.f61050b);
        }

        public e0(TimeUnit timeUnit, ii.s sVar) {
            this.f61050b = timeUnit;
            this.f61051c = sVar;
        }
    }

    public static final class f0<K, T> implements oi.b<Map<K, T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oi.o<? super T, ? extends K> f61053a;

        @Override // oi.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> map, T t10) throws Exception {
            map.put(this.f61053a.apply(t10), t10);
        }

        public f0(oi.o<? super T, ? extends K> oVar) {
            this.f61053a = oVar;
        }
    }

    public static final class g0<K, V, T> implements oi.b<Map<K, V>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oi.o<? super T, ? extends V> f61055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.o<? super T, ? extends K> f61056b;

        @Override // oi.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> map, T t10) throws Exception {
            map.put(this.f61056b.apply(t10), this.f61055a.apply(t10));
        }

        public g0(oi.o<? super T, ? extends V> oVar, oi.o<? super T, ? extends K> oVar2) {
            this.f61055a = oVar;
            this.f61056b = oVar2;
        }
    }

    public static final class h0<K, V, T> implements oi.b<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oi.o<? super K, ? extends Collection<? super V>> f61058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.o<? super T, ? extends V> f61059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.o<? super T, ? extends K> f61060c;

        @Override // oi.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> map, T t10) throws Exception {
            K kApply = this.f61060c.apply(t10);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f61058a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f61059b.apply(t10));
        }

        public h0(oi.o<? super K, ? extends Collection<? super V>> oVar, oi.o<? super T, ? extends V> oVar2, oi.o<? super T, ? extends K> oVar3) {
            this.f61058a = oVar;
            this.f61059b = oVar2;
            this.f61060c = oVar3;
        }
    }

    public static final class i0 implements oi.q<Object> {
        @Override // oi.q
        public boolean test(Object obj) {
            return true;
        }
    }

    public static final class j<T> implements Callable<List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61062b;

        @Override // java.util.concurrent.Callable
        public List<T> call() throws Exception {
            return new ArrayList(this.f61062b);
        }

        public j(int i10) {
            this.f61062b = i10;
        }
    }

    public static final class k<T> implements oi.q<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.e f61063b;

        @Override // oi.q
        public boolean test(T t10) throws Exception {
            return !this.f61063b.a();
        }

        public k(oi.e eVar) {
            this.f61063b = eVar;
        }
    }

    public static final class l<T, U> implements oi.o<T, U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<U> f61064b;

        @Override // oi.o
        public U apply(T t10) throws Exception {
            return this.f61064b.cast(t10);
        }

        public l(Class<U> cls) {
            this.f61064b = cls;
        }
    }

    public static final class m<T, U> implements oi.q<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<U> f61065b;

        @Override // oi.q
        public boolean test(T t10) throws Exception {
            return this.f61065b.isInstance(t10);
        }

        public m(Class<U> cls) {
            this.f61065b = cls;
        }
    }

    public static final class n implements oi.a {
        @Override // oi.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class o implements oi.g<Object> {
        @Override // oi.g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class p implements oi.p {
    }

    public static final class q implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class r<T> implements oi.q<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f61066b;

        @Override // oi.q
        public boolean test(T t10) throws Exception {
            return qi.a.c(t10, this.f61066b);
        }

        public r(T t10) {
            this.f61066b = t10;
        }
    }

    public static final class t implements oi.q<Object> {
        @Override // oi.q
        public boolean test(Object obj) {
            return false;
        }
    }

    public static final class u implements oi.o<Object, Object> {
        @Override // oi.o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class v<T, U> implements Callable<U>, oi.o<T, U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final U f61067b;

        @Override // oi.o
        public U apply(T t10) throws Exception {
            return this.f61067b;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f61067b;
        }

        public v(U u10) {
            this.f61067b = u10;
        }
    }

    public static final class w<T> implements oi.o<List<T>, List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Comparator<? super T> f61068b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f61068b);
            return list;
        }

        public w(Comparator<? super T> comparator) {
            this.f61068b = comparator;
        }
    }

    public static final class y implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class z<T> implements oi.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.g<? super ii.j<T>> f61069b;

        @Override // oi.a
        public void run() throws Exception {
            this.f61069b.accept(ii.j.a());
        }

        public z(oi.g<? super ii.j<T>> gVar) {
            this.f61069b = gVar;
        }
    }

    public static final class b<T1, T2, R> implements oi.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.c<? super T1, ? super T2, ? extends R> f61045b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f61045b.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }

        public b(oi.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f61045b = cVar;
        }
    }

    public static final class c<T1, T2, T3, R> implements oi.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.h<T1, T2, T3, R> f61047b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f61047b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }

        public c(oi.h<T1, T2, T3, R> hVar) {
            this.f61047b = hVar;
        }
    }

    public static final class d<T1, T2, T3, T4, R> implements oi.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.i<T1, T2, T3, T4, R> f61048b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f61048b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }

        public d(oi.i<T1, T2, T3, T4, R> iVar) {
            this.f61048b = iVar;
        }
    }

    public static final class e<T1, T2, T3, T4, T5, R> implements oi.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.j<T1, T2, T3, T4, T5, R> f61049b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f61049b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }

        public e(oi.j<T1, T2, T3, T4, T5, R> jVar) {
            this.f61049b = jVar;
        }
    }

    public static final class f<T1, T2, T3, T4, T5, T6, R> implements oi.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.k<T1, T2, T3, T4, T5, T6, R> f61052b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f61052b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }

        public f(oi.k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f61052b = kVar;
        }
    }

    public static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements oi.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.l<T1, T2, T3, T4, T5, T6, T7, R> f61054b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f61054b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }

        public g(oi.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
            this.f61054b = lVar;
        }
    }

    public static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements oi.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f61057b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f61057b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }

        public h(oi.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
            this.f61057b = mVar;
        }
    }

    public static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements oi.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f61061b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f61061b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }

        public i(oi.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
            this.f61061b = nVar;
        }
    }

    public static final class s implements oi.g<Throwable> {
        @Override // oi.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            ej.a.s(th2);
        }
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> oi.o<Object[], R> A(oi.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        qi.a.e(lVar, "f is null");
        return new g(lVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> oi.o<Object[], R> B(oi.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        qi.a.e(mVar, "f is null");
        return new h(mVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> oi.o<Object[], R> C(oi.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        qi.a.e(nVar, "f is null");
        return new i(nVar);
    }

    public static <T, K> oi.b<Map<K, T>, T> D(oi.o<? super T, ? extends K> oVar) {
        return new f0(oVar);
    }

    public static <T, K, V> oi.b<Map<K, V>, T> E(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2) {
        return new g0(oVar2, oVar);
    }

    public static <T, K, V> oi.b<Map<K, Collection<V>>, T> F(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2, oi.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new h0(oVar3, oVar2, oVar);
    }

    public static <T> oi.g<T> a(oi.a aVar) {
        return new a(aVar);
    }

    public static <T> oi.q<T> b() {
        return (oi.q<T>) f61037i;
    }

    public static <T> oi.q<T> c() {
        return (oi.q<T>) f61036h;
    }

    public static <T, U> oi.o<T, U> d(Class<U> cls) {
        return new l(cls);
    }

    public static <T> Callable<List<T>> e(int i10) {
        return new j(i10);
    }

    public static <T> Callable<Set<T>> f() {
        return HashSetCallable.INSTANCE;
    }

    public static <T> oi.g<T> g() {
        return (oi.g<T>) f61032d;
    }

    public static <T> oi.q<T> h(T t10) {
        return new r(t10);
    }

    public static <T> oi.o<T, T> i() {
        return (oi.o<T, T>) f61029a;
    }

    public static <T, U> oi.q<T> j(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<T> k(T t10) {
        return new v(t10);
    }

    public static <T, U> oi.o<T, U> l(U u10) {
        return new v(u10);
    }

    public static <T> oi.o<List<T>, List<T>> m(Comparator<? super T> comparator) {
        return new w(comparator);
    }

    public static <T> Comparator<T> n() {
        return NaturalComparator.INSTANCE;
    }

    public static <T> Comparator<T> o() {
        return (Comparator<T>) f61039k;
    }

    public static <T> oi.a p(oi.g<? super ii.j<T>> gVar) {
        return new z(gVar);
    }

    public static <T> oi.g<Throwable> q(oi.g<? super ii.j<T>> gVar) {
        return new a0(gVar);
    }

    public static <T> oi.g<T> r(oi.g<? super ii.j<T>> gVar) {
        return new b0(gVar);
    }

    public static <T> Callable<T> s() {
        return (Callable<T>) f61038j;
    }

    public static <T> oi.q<T> t(oi.e eVar) {
        return new k(eVar);
    }

    public static <T> oi.o<T, gj.b<T>> u(TimeUnit timeUnit, ii.s sVar) {
        return new e0(timeUnit, sVar);
    }

    public static <T1, T2, R> oi.o<Object[], R> v(oi.c<? super T1, ? super T2, ? extends R> cVar) {
        qi.a.e(cVar, "f is null");
        return new b(cVar);
    }

    public static <T1, T2, T3, R> oi.o<Object[], R> w(oi.h<T1, T2, T3, R> hVar) {
        qi.a.e(hVar, "f is null");
        return new c(hVar);
    }

    public static <T1, T2, T3, T4, R> oi.o<Object[], R> x(oi.i<T1, T2, T3, T4, R> iVar) {
        qi.a.e(iVar, "f is null");
        return new d(iVar);
    }

    public static <T1, T2, T3, T4, T5, R> oi.o<Object[], R> y(oi.j<T1, T2, T3, T4, T5, R> jVar) {
        qi.a.e(jVar, "f is null");
        return new e(jVar);
    }

    public static <T1, T2, T3, T4, T5, T6, R> oi.o<Object[], R> z(oi.k<T1, T2, T3, T4, T5, T6, R> kVar) {
        qi.a.e(kVar, "f is null");
        return new f(kVar);
    }

    public static final class x implements oi.g<qo.c> {
        @Override // oi.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(qo.c cVar) throws Exception {
            cVar.request(Long.MAX_VALUE);
        }
    }
}
