package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements b2<E> {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient ImmutableList<E> f20389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient ImmutableSet<b2.a<E>> f20390d;

    public final class EntrySet extends IndexedImmutableSet<b2.a<E>> {
        private static final long serialVersionUID = 0;

        public EntrySet() {
        }

        public /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, a aVar) {
            this();
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof b2.a)) {
                return false;
            }
            b2.a aVar = (b2.a) obj;
            return aVar.getCount() > 0 && ImmutableMultiset.this.count(aVar.getElement()) == aVar.getCount();
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public b2.a<E> get(int i10) {
            return ImmutableMultiset.this.getEntry(i10);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    public static class EntrySetSerializedForm<E> implements Serializable {
        public final ImmutableMultiset<E> multiset;

        public Object readResolve() {
            return this.multiset.entrySet();
        }

        public EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }
    }

    public class a extends r2<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public E f20392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Iterator f20393d;

        public a(ImmutableMultiset immutableMultiset, Iterator it) {
            this.f20393d = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20391b > 0 || this.f20393d.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f20391b <= 0) {
                b2.a aVar = (b2.a) this.f20393d.next();
                this.f20392c = (E) aVar.getElement();
                this.f20391b = aVar.getCount();
            }
            this.f20391b--;
            E e10 = this.f20392c;
            Objects.requireNonNull(e10);
            return e10;
        }
    }

    public static class b<E> extends ImmutableCollection.b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e2<E> f20394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f20395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20396c;

        public b() {
            this(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b<E> a(E e10) {
            return j(e10, 1);
        }

        public b(int i10) {
            this.f20395b = false;
            this.f20396c = false;
            this.f20394a = e2.c(i10);
        }

        public static <T> e2<T> l(Iterable<T> iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).contents;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<E> h(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f20394a);
            if (iterable instanceof b2) {
                b2 b2VarD = Multisets.d(iterable);
                e2 e2VarL = l(b2VarD);
                if (e2VarL != null) {
                    e2<E> e2Var = this.f20394a;
                    e2Var.d(Math.max(e2Var.C(), e2VarL.C()));
                    for (int iE = e2VarL.e(); iE >= 0; iE = e2VarL.s(iE)) {
                        j(e2VarL.i(iE), e2VarL.k(iE));
                    }
                } else {
                    Set<b2.a<E>> setEntrySet = b2VarD.entrySet();
                    e2<E> e2Var2 = this.f20394a;
                    e2Var2.d(Math.max(e2Var2.C(), setEntrySet.size()));
                    for (b2.a<E> aVar : b2VarD.entrySet()) {
                        j(aVar.getElement(), aVar.getCount());
                    }
                }
            } else {
                super.c(iterable);
            }
            return this;
        }

        public b<E> j(E e10, int i10) {
            Objects.requireNonNull(this.f20394a);
            if (i10 == 0) {
                return this;
            }
            if (this.f20395b) {
                this.f20394a = new e2<>(this.f20394a);
                this.f20396c = false;
            }
            this.f20395b = false;
            m5.l.m(e10);
            e2<E> e2Var = this.f20394a;
            e2Var.u(e10, i10 + e2Var.f(e10));
            return this;
        }

        public ImmutableMultiset<E> k() {
            Objects.requireNonNull(this.f20394a);
            if (this.f20394a.C() == 0) {
                return ImmutableMultiset.of();
            }
            if (this.f20396c) {
                this.f20394a = new e2<>(this.f20394a);
                this.f20396c = false;
            }
            this.f20395b = true;
            return new RegularImmutableMultiset(this.f20394a);
        }

        public b<E> g(E... eArr) {
            super.b(eArr);
            return this;
        }

        public b<E> i(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return e(eArr);
    }

    public static /* synthetic */ int h(Object obj) {
        return 1;
    }

    public static <E> ImmutableMultiset<E> of() {
        return RegularImmutableMultiset.EMPTY;
    }

    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        return i1.N(Function.identity(), new ToIntFunction() { // from class: com.google.common.collect.w1
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ImmutableMultiset.h(obj);
            }
        });
    }

    public abstract /* synthetic */ int count(Object obj);

    public abstract ImmutableSet<E> elementSet();

    public abstract b2.a<E> getEntry(int i10);

    @Override // com.google.common.collect.b2
    @Deprecated
    public final int setCount(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    abstract Object writeReplace();

    public static <E> b<E> builder() {
        return new b<>();
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends b2.a<? extends E>> collection) {
        b bVar = new b(collection.size());
        for (b2.a<? extends E> aVar : collection) {
            bVar.j(aVar.getElement(), aVar.getCount());
        }
        return bVar.k();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        b bVar = new b(Multisets.g(iterable));
        bVar.h(iterable);
        return bVar.k();
    }

    public static <E> ImmutableMultiset<E> e(E... eArr) {
        return new b().g(eArr).k();
    }

    public static <E> ImmutableMultiset<E> of(E e10) {
        return e(e10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        return i1.N(function, toIntFunction);
    }

    @Override // com.google.common.collect.b2
    @Deprecated
    public final int add(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f20389c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListAsList = super.asList();
        this.f20389c = immutableListAsList;
        return immutableListAsList;
    }

    @Override // com.google.common.collect.b2
    public ImmutableSet<b2.a<E>> entrySet() {
        ImmutableSet<b2.a<E>> immutableSet = this.f20390d;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<b2.a<E>> immutableSetG = g();
        this.f20390d = immutableSetG;
        return immutableSetG;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public r2<E> iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.b2
    @Deprecated
    public final int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2
    @Deprecated
    public final boolean setCount(E e10, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    private ImmutableSet<b2.a<E>> g() {
        if (isEmpty()) {
            return ImmutableSet.of();
        }
        return new EntrySet(this, null);
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11) {
        return e(e10, e11);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i10) {
        r2<b2.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            b2.a<E> next = it.next();
            Arrays.fill(objArr, i10, next.getCount() + i10, next.getElement());
            i10 += next.getCount();
        }
        return i10;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return Multisets.e(this, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Sets.d(entrySet());
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11, E e12) {
        return e(e10, e11, e12);
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11, E e12, E e13) {
        return e(e10, e11, e12, e13);
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11, E e12, E e13, E e14) {
        return e(e10, e11, e12, e13, e14);
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        return new b().a(e10).a(e11).a(e12).a(e13).a(e14).a(e15).g(eArr).k();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new b().i(it).k();
    }
}
