package com.yandex.div.core.state;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: TabsStateCache.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TabsStateCache {
    private final Map<String, Map<String, Integer>> temporaryCache = new LinkedHashMap();

    public final Integer getSelectedTab(String str, String str2) {
        Map<String, Integer> map = this.temporaryCache.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final void putSelectedTab(String str, String str2, int i10) {
        Map<String, Map<String, Integer>> map = this.temporaryCache;
        Map<String, Integer> linkedHashMap = map.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, Integer.valueOf(i10));
    }
}
