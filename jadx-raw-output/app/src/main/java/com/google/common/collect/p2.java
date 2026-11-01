package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: TransformedIterator.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class p2<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<? extends F> f20637b;

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20637b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f20637b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20637b.remove();
    }

    public p2(Iterator<? extends F> it) {
        this.f20637b = (Iterator) m5.l.m(it);
    }
}
