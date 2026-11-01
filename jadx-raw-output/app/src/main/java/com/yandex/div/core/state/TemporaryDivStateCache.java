package com.yandex.div.core.state;

import androidx.annotation.AnyThread;
import java.util.LinkedHashMap;
import java.util.Map;
import mj.r;

/* JADX INFO: compiled from: TemporaryDivStateCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TemporaryDivStateCache {
    private final Map<String, Map<String, String>> temporaryCache = new LinkedHashMap();

    @AnyThread
    public final String getState(String str, String str2) {
        String str3;
        synchronized (this.temporaryCache) {
            Map<String, String> map = this.temporaryCache.get(str);
            str3 = map != null ? map.get(str2) : null;
        }
        return str3;
    }

    @AnyThread
    public final void putRootState(String str, String str2) {
        putState(str, "/", str2);
    }

    @AnyThread
    public final void putState(String str, String str2, String str3) {
        synchronized (this.temporaryCache) {
            Map<String, Map<String, String>> map = this.temporaryCache;
            Map<String, String> linkedHashMap = map.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(str, linkedHashMap);
            }
            linkedHashMap.put(str2, str3);
            r rVar = r.f64562a;
        }
    }

    @AnyThread
    public final Map<String, String> resetCard(String str) {
        Map<String, String> mapRemove;
        synchronized (this.temporaryCache) {
            mapRemove = this.temporaryCache.remove(str);
        }
        return mapRemove;
    }
}
