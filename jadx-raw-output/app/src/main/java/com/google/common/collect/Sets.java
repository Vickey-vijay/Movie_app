package com.google.common.collect;

import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes6.dex */
public final class Sets {

    public static final class UnmodifiableNavigableSet<E> extends u1<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient UnmodifiableNavigableSet<E> f20541c;
        private final NavigableSet<E> delegate;
        private final SortedSet<E> unmodifiableDelegate;

        @Override // java.util.NavigableSet
        public E ceiling(E e10) {
            return this.delegate.ceiling(e10);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.y(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.f20541c;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.f20541c = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f20541c = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public E floor(E e10) {
            return this.delegate.floor(e10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e10, boolean z10) {
            return Sets.k(this.delegate.headSet(e10, z10));
        }

        @Override // java.util.NavigableSet
        public E higher(E e10) {
            return this.delegate.higher(e10);
        }

        @Override // java.util.NavigableSet
        public E lower(E e10) {
            return this.delegate.lower(e10);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            return Sets.k(this.delegate.subSet(e10, z10, e11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e10, boolean z10) {
            return Sets.k(this.delegate.tailSet(e10, z10));
        }

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) m5.l.m(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // com.google.common.collect.u1, com.google.common.collect.s1, com.google.common.collect.o1, com.google.common.collect.r1
        /* JADX INFO: renamed from: delegate */
        public SortedSet<E> g() {
            return this.unmodifiableDelegate;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class a<E> extends e<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f20542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set f20543c;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$a$a, reason: collision with other inner class name */
        public class C0200a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator<E> f20544d;

            public C0200a() {
                this.f20544d = a.this.f20542b.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            public E a() {
                while (this.f20544d.hasNext()) {
                    E next = this.f20544d.next();
                    if (a.this.f20543c.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f20542b = set;
            this.f20543c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public r2<E> iterator() {
            return new C0200a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f20542b.contains(obj) && this.f20543c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f20542b.containsAll(collection) && this.f20543c.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f20543c, this.f20542b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f20542b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f20543c.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    public static class c<E> extends b<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f20622b).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) Iterators.k(this.f20622b.iterator(), this.f20623c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f20622b).headSet(e10), this.f20623c);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f20622b;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f20623c.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f20622b).subSet(e10, e11), this.f20623c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f20622b).tailSet(e10), this.f20623c);
        }

        public c(SortedSet<E> sortedSet, m5.m<? super E> mVar) {
            super(sortedSet, mVar);
        }
    }

    public static abstract class e<E> extends AbstractSet<E> {
        public /* synthetic */ e(l2 l2Var) {
            this();
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean j(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static class b<E> extends k1.a<E> implements Set<E> {
        public b(Set<E> set, m5.m<? super E> mVar) {
            super(set, mVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.d(this);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) m5.l.m(collection));
        }
    }

    public static <E> Set<E> b(Set<E> set, m5.m<? super E> mVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, mVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) m5.l.m(set), (m5.m) m5.l.m(mVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f20622b, Predicates.b(bVar.f20623c, mVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, m5.m<? super E> mVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) m5.l.m(sortedSet), (m5.m) m5.l.m(mVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f20622b, Predicates.b(bVar.f20623c, mVar));
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        m5.l.n(set, "set1");
        m5.l.n(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(Maps.a(i10));
    }

    public static <E> NavigableSet<E> k(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    public static int d(Set<?> set) {
        int iHashCode;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i10 = ~(~(i10 + iHashCode));
        }
        return i10;
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(Maps.k());
    }

    public static boolean i(Set<?> set, Collection<?> collection) {
        m5.l.m(collection);
        if (collection instanceof b2) {
            collection = ((b2) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return Iterators.s(set.iterator(), collection);
        }
        return j(set, collection.iterator());
    }
}
