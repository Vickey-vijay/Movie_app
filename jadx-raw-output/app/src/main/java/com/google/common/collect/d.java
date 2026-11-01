package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMultiset.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<E> extends AbstractCollection<E> implements b2<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set<E> f20590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Set<b2.a<E>> f20591c;

    /* JADX INFO: compiled from: AbstractMultiset.java */
    public class a extends Multisets.b<E> {
        public a() {
        }

        @Override // com.google.common.collect.Multisets.b
        public b2<E> c() {
            return d.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return d.this.elementIterator();
        }
    }

    /* JADX INFO: compiled from: AbstractMultiset.java */
    public class b extends Multisets.c<E> {
        public b() {
        }

        @Override // com.google.common.collect.Multisets.c
        public b2<E> c() {
            return d.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<b2.a<E>> iterator() {
            return d.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.distinctElements();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e10) {
        add(e10, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public abstract Iterator<b2.a<E>> entryIterator();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public int setCount(E e10, int i10) {
        return Multisets.k(this, e10, i10);
    }

    public int add(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    public Set<E> createElementSet() {
        return new a();
    }

    public Set<b2.a<E>> createEntrySet() {
        return new b();
    }

    public Set<E> elementSet() {
        Set<E> set = this.f20590b;
        if (set != null) {
            return set;
        }
        Set<E> setCreateElementSet = createElementSet();
        this.f20590b = setCreateElementSet;
        return setCreateElementSet;
    }

    public Set<b2.a<E>> entrySet() {
        Set<b2.a<E>> set = this.f20591c;
        if (set != null) {
            return set;
        }
        Set<b2.a<E>> setCreateEntrySet = createEntrySet();
        this.f20591c = setCreateEntrySet;
        return setCreateEntrySet;
    }

    public int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(E e10, int i10, int i11) {
        return Multisets.l(this, e10, i10, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return Multisets.e(this, obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.i(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.j(this, collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
