package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIndexedListIterator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<E> extends s2<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20579c;

    public a(int i10) {
        this(i10, 0);
    }

    public abstract E a(int i10);

    public a(int i10, int i11) {
        m5.l.o(i11, i10);
        this.f20578b = i10;
        this.f20579c = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20579c < this.f20578b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20579c > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20579c;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20579c - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f20579c;
            this.f20579c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f20579c - 1;
            this.f20579c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
