package com.yandex.div.storage.util;

import jj.a;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: LazyProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyProvider<T> implements a<T> {
    private final g value$delegate;

    private final T getValue() {
        return (T) this.value$delegate.getValue();
    }

    public LazyProvider(bk.a<? extends T> aVar) {
        this.value$delegate = b.a(aVar);
    }

    @Override // jj.a
    public T get() {
        return getValue();
    }
}
