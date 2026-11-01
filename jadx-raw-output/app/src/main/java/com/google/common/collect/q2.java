package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: TransformedListIterator.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class q2<F, T> extends p2<F, T> implements ListIterator<T> {
    @Override // java.util.ListIterator
    public void add(T t10) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<? extends F> b() {
        return (ListIterator) this.f20637b;
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        throw new UnsupportedOperationException();
    }

    public q2(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }
}
