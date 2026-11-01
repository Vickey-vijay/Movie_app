package dl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: createMapForCache.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 {
    public static final <K, V> Map<K, V> a(int i10) {
        return new ConcurrentHashMap(i10);
    }
}
