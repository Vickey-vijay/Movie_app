package com.yandex.div.internal.util;

import jj.a;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: DoubleCheckProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DoubleCheckProvider<T> implements a<T> {
    private final g value$delegate;

    private final T getValue() {
        return (T) this.value$delegate.getValue();
    }

    public DoubleCheckProvider(bk.a<? extends T> aVar) {
        this.value$delegate = b.a(aVar);
    }

    @Override // jj.a
    public T get() {
        return getValue();
    }
}
