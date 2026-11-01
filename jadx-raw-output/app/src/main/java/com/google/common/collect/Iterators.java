package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public final class Iterators {

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            j1.e(false);
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends r2<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f20427b;

        public a(Iterator it) {
            this.f20427b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20427b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f20427b.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends AbstractIterator<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Iterator f20428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m5.m f20429e;

        public b(Iterator it, m5.m mVar) {
            this.f20428d = it;
            this.f20429e = mVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.AbstractIterator
        public T a() {
            while (this.f20428d.hasNext()) {
                T t10 = (T) this.f20428d.next();
                if (this.f20429e.apply(t10)) {
                    return t10;
                }
            }
            return b();
        }
    }

    public static final class c<T> extends com.google.common.collect.a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final s2<Object> f20430e = new c(new Object[0], 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final T[] f20431d;

        public c(T[] tArr, int i10) {
            super(tArr.length, i10);
            this.f20431d = tArr;
        }

        @Override // com.google.common.collect.a
        public T a(int i10) {
            return this.f20431d[i10];
        }
    }

    public static class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<? extends T> f20432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<? extends T> f20433c = Iterators.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<? extends Iterator<? extends T>> f20434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Deque<Iterator<? extends Iterator<? extends T>>> f20435e;

        public final Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f20434d;
                if (it != null && it.hasNext()) {
                    return this.f20434d;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f20435e;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f20434d = this.f20435e.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) m5.l.m(this.f20433c)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itA = a();
                this.f20434d = itA;
                if (itA == null) {
                    return false;
                }
                Iterator<? extends T> next = itA.next();
                this.f20433c = next;
                if (next instanceof d) {
                    d dVar = (d) next;
                    this.f20433c = dVar.f20433c;
                    if (this.f20435e == null) {
                        this.f20435e = new ArrayDeque();
                    }
                    this.f20435e.addFirst(this.f20434d);
                    if (dVar.f20435e != null) {
                        while (!dVar.f20435e.isEmpty()) {
                            this.f20435e.addFirst(dVar.f20435e.removeLast());
                        }
                    }
                    this.f20434d = dVar.f20434d;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f20432b;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f20432b = null;
        }

        public d(Iterator<? extends Iterator<? extends T>> it) {
            this.f20434d = (Iterator) m5.l.m(it);
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f20433c;
                this.f20432b = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }
    }

    public static class e<E> implements g2<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<? extends E> f20436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public E f20438d;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20437c || this.f20436b.hasNext();
        }

        @Override // com.google.common.collect.g2, java.util.Iterator
        public E next() {
            if (!this.f20437c) {
                return this.f20436b.next();
            }
            E e10 = (E) c2.a(this.f20438d);
            this.f20437c = false;
            this.f20438d = null;
            return e10;
        }

        @Override // com.google.common.collect.g2
        public E peek() {
            if (!this.f20437c) {
                this.f20438d = this.f20436b.next();
                this.f20437c = true;
            }
            return (E) c2.a(this.f20438d);
        }

        @Override // java.util.Iterator
        public void remove() {
            m5.l.s(!this.f20437c, "Can't remove after you've peeked at next");
            this.f20436b.remove();
        }

        public e(Iterator<? extends E> it) {
            this.f20436b = (Iterator) m5.l.m(it);
        }
    }

    public static final class f<T> extends r2<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Object f20439c = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20440b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20440b != f20439c;
        }

        @Override // java.util.Iterator
        public T next() {
            T t10 = (T) this.f20440b;
            Object obj = f20439c;
            if (t10 == obj) {
                throw new NoSuchElementException();
            }
            this.f20440b = obj;
            return t10;
        }

        public f(T t10) {
            this.f20440b = t10;
        }
    }

    public static boolean e(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> d(Iterator<? extends Iterator<? extends T>> it) {
        return new d(it);
    }

    public static <T> s2<T> h() {
        return (s2<T>) c.f20430e;
    }

    public static <T> Iterator<T> i() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> int p(Iterator<T> it, m5.m<? super T> mVar) {
        m5.l.n(mVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> g2<T> q(Iterator<? extends T> it) {
        return it instanceof e ? (e) it : new e(it);
    }

    public static <T> r2<T> v(T t10) {
        return new f(t10);
    }

    public static int w(Iterator<?> it) {
        long j10 = 0;
        while (it.hasNext()) {
            it.next();
            j10++;
        }
        return Ints.m(j10);
    }

    public static String x(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(it.next());
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        m5.l.m(collection);
        m5.l.m(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> boolean b(Iterator<T> it, m5.m<? super T> mVar) {
        if (p(it, mVar) != -1) {
            return true;
        }
        return false;
    }

    public static void c(Iterator<?> it) {
        m5.l.m(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean f(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !m5.i.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> r2<T> g() {
        return h();
    }

    public static <T> r2<T> j(Iterator<T> it, m5.m<? super T> mVar) {
        m5.l.m(it);
        m5.l.m(mVar);
        return new b(it, mVar);
    }

    public static <T> T k(Iterator<T> it, m5.m<? super T> mVar) {
        m5.l.m(it);
        m5.l.m(mVar);
        while (it.hasNext()) {
            T next = it.next();
            if (mVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T l(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T m(Iterator<? extends T> it, T t10) {
        if (it.hasNext()) {
            return (T) l(it);
        }
        return t10;
    }

    public static <T> T n(Iterator<? extends T> it, T t10) {
        if (it.hasNext()) {
            return it.next();
        }
        return t10;
    }

    public static <T> T o(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> T r(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static boolean s(Iterator<?> it, Collection<?> collection) {
        m5.l.m(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean t(Iterator<T> it, m5.m<? super T> mVar) {
        m5.l.m(mVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean u(Iterator<?> it, Collection<?> collection) {
        m5.l.m(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> r2<T> y(Iterator<? extends T> it) {
        m5.l.m(it);
        if (it instanceof r2) {
            return (r2) it;
        }
        return new a(it);
    }
}
