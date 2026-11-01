package com.yandex.div.internal.util;

import ck.i;
import java.lang.Number;
import jk.k;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class PositiveNumberDelegate<T extends Number> {
    private final T fallbackValue;
    private T value;

    public PositiveNumberDelegate(T t10, T t11) {
        this.value = t10;
        this.fallbackValue = t11;
    }

    public final T getValue(Object obj, k<?> kVar) {
        return this.value;
    }

    public final void setValue(Object obj, k<?> kVar, T t10) {
        if (t10.doubleValue() <= 0.0d) {
            t10 = this.fallbackValue;
        }
        this.value = t10;
    }

    public /* synthetic */ PositiveNumberDelegate(Number number, Number number2, int i10, i iVar) {
        this(number, (i10 & 2) != 0 ? 1 : number2);
    }
}
