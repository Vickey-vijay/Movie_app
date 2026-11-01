package com.yandex.div.core.widget;

import bk.a;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: GridContainer.kt */
/* JADX INFO: loaded from: classes5.dex */
final class Resettable<T> {
    private final a<T> initializer;
    private T value;

    public final void reset() {
        this.value = null;
    }

    public final T get() {
        if (this.value == null) {
            this.value = this.initializer.invoke();
        }
        T t10 = this.value;
        if (t10 != null) {
            return t10;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    public final boolean getInitialized() {
        return this.value != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resettable(a<? extends T> aVar) {
        this.initializer = aVar;
    }
}
