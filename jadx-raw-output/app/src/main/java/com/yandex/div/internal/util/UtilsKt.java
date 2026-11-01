package com.yandex.div.internal.util;

import fk.d;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UtilsKt {
    public static /* synthetic */ Object getOrThrow$default(Map map, Object obj, String str, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return getOrThrow(map, obj, str);
    }

    public static final <T> d<Object, T> weak(T t10) {
        return new WeakRef(t10);
    }

    public static final <K, V> V getOrThrow(Map<? extends K, ? extends V> map, K k10, String str) {
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        throw new NoSuchElementException(str);
    }
}
