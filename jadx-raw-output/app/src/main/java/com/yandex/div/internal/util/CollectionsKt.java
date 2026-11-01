package com.yandex.div.internal.util;

import androidx.collection.ArrayMap;
import ck.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CollectionsKt {
    public static final boolean allIsNullOrEmpty(List<?>... listArr) {
        int length = listArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            List<?> list = listArr[i10];
            if (list != null && !list.isEmpty()) {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            i10++;
        }
    }

    public static final <K, V> Map<K, V> arrayMap() {
        return new ArrayMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> immutableCopy(List<? extends T> list) {
        if (x.l(list)) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        return list;
    }
}
