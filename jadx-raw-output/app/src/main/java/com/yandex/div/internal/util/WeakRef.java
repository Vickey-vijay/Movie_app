package com.yandex.div.internal.util;

import fk.d;
import java.lang.ref.WeakReference;
import jk.k;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes2.dex */
final class WeakRef<T> implements d<Object, T> {
    private WeakReference<T> weakReference;

    @Override // fk.d
    public T getValue(Object obj, k<?> kVar) {
        WeakReference<T> weakReference = this.weakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // fk.d
    public void setValue(Object obj, k<?> kVar, T t10) {
        this.weakReference = t10 != null ? new WeakReference<>(t10) : null;
    }

    public WeakRef(T t10) {
        WeakReference<T> weakReference;
        if (t10 != null) {
            weakReference = new WeakReference<>(t10);
        } else {
            weakReference = null;
        }
        this.weakReference = weakReference;
    }
}
