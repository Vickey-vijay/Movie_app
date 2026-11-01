package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: ForwardingCollection.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class o1<E> extends r1 implements Collection<E> {
    @Override // com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public abstract Collection<E> g();

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return g().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) g().toArray(tArr);
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        return g().add(e10);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return g().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        g().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return g().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return g().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return g().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return g().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return g().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return g().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return g().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return g().size();
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return Iterators.a(this, collection.iterator());
    }

    public void standardClear() {
        Iterators.c(iterator());
    }

    public boolean standardContains(Object obj) {
        return Iterators.e(iterator(), obj);
    }

    public boolean standardContainsAll(Collection<?> collection) {
        return k1.a(this, collection);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRemove(Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (m5.i.a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        return Iterators.s(iterator(), collection);
    }

    public boolean standardRetainAll(Collection<?> collection) {
        return Iterators.u(iterator(), collection);
    }

    public <T> T[] standardToArray(T[] tArr) {
        return (T[]) d2.g(this, tArr);
    }

    public String standardToString() {
        return k1.d(this);
    }
}
