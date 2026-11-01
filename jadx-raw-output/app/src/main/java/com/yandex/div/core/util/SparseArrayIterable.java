package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import dk.a;
import java.util.Iterator;

/* JADX INFO: compiled from: SparseArrays.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SparseArrayIterable<T> implements Iterable<T>, a {
    private final SparseArrayCompat<T> array;

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new SparseArrayIterator(this.array);
    }

    public SparseArrayIterable(SparseArrayCompat<T> sparseArrayCompat) {
        this.array = sparseArrayCompat;
    }
}
