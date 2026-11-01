package com.yandex.div.core.expression.local;

import java.util.ArrayList;

/* JADX INFO: compiled from: ChildPathUnitCache.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ChildPathUnitCache {
    public static final ChildPathUnitCache INSTANCE = new ChildPathUnitCache();
    private static ArrayList<String> cache = new ArrayList<>();

    private ChildPathUnitCache() {
    }

    private final void ensureGenerated(int i10) {
        if (cache.size() > i10) {
            return;
        }
        cache.ensureCapacity(i10 + 1);
        int size = cache.size();
        if (size > i10) {
            return;
        }
        while (true) {
            cache.add(size, "child#" + size);
            if (size == i10) {
                return;
            } else {
                size++;
            }
        }
    }

    public final String getValue$div_release(int i10) {
        ensureGenerated(i10);
        return cache.get(i10);
    }
}
