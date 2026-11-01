package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: ForwardingSortedSet.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class u1<E> extends s1<E> implements SortedSet<E> {
    @Override // com.google.common.collect.s1, com.google.common.collect.o1, com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public abstract SortedSet<E> g();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o1
    public boolean standardContains(Object obj) {
        try {
            return t1.e(comparator(), tailSet(obj).first(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o1
    public boolean standardRemove(Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (t1.e(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return g().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return g().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e10) {
        return g().headSet(e10);
    }

    @Override // java.util.SortedSet
    public E last() {
        return g().last();
    }

    public SortedSet<E> standardSubSet(E e10, E e11) {
        return tailSet(e10).headSet(e11);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e10, E e11) {
        return g().subSet(e10, e11);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e10) {
        return g().tailSet(e10);
    }
}
