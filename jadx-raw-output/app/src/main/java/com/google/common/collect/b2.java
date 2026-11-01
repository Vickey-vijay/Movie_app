package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: Multiset.java */
/* JADX INFO: loaded from: classes5.dex */
public interface b2<E> extends Collection<E> {

    /* JADX INFO: compiled from: Multiset.java */
    public interface a<E> {
        int getCount();

        E getElement();
    }

    int add(E e10, int i10);

    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<a<E>> entrySet();

    int remove(Object obj, int i10);

    @Override // java.util.Collection
    boolean remove(Object obj);

    int setCount(E e10, int i10);

    boolean setCount(E e10, int i10, int i11);

    int size();
}
