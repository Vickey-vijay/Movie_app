package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import dk.a;
import java.util.Iterator;

/* JADX INFO: compiled from: SparseArrays.kt */
/* JADX INFO: loaded from: classes8.dex */
final class SparseArrayIterator<T> implements Iterator<T>, a {
    private final SparseArrayCompat<T> array;
    private int index;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.array.size() > this.index;
    }

    @Override // java.util.Iterator
    public T next() {
        SparseArrayCompat<T> sparseArrayCompat = this.array;
        int i10 = this.index;
        this.index = i10 + 1;
        return sparseArrayCompat.valueAt(i10);
    }

    public SparseArrayIterator(SparseArrayCompat<T> sparseArrayCompat) {
        this.array = sparseArrayCompat;
    }
}
