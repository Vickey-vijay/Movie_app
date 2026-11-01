package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractSequentialIterator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class g<T> extends r2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f20612b;

    public abstract T a(T t10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20612b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t10 = this.f20612b;
        if (t10 == null) {
            throw new NoSuchElementException();
        }
        this.f20612b = a(t10);
        return t10;
    }

    public g(T t10) {
        this.f20612b = t10;
    }
}
