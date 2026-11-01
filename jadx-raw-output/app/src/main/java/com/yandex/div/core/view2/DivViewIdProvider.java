package com.yandex.div.core.view2;

import androidx.core.view.ViewCompat;
import com.yandex.div.internal.util.CollectionsKt;
import java.util.Map;

/* JADX INFO: compiled from: DivViewIdProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivViewIdProvider {
    private final Map<String, Integer> cache = CollectionsKt.arrayMap();

    public final int getViewId(String str) {
        if (str == null) {
            return -1;
        }
        Map<String, Integer> map = this.cache;
        Integer numValueOf = map.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(ViewCompat.generateViewId());
            map.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }
}
