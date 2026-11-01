package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;

/* JADX INFO: compiled from: SparseArrays.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SparseArraysKt {
    public static final <T> Iterable<T> toIterable(SparseArrayCompat<T> sparseArrayCompat) {
        return new SparseArrayIterable(sparseArrayCompat);
    }
}
