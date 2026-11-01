package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class h<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, V> f70010a = new HashMap<>();

    @Nullable
    public final V a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f70010a.get(str.toLowerCase());
    }

    public final void a(@NonNull Map<? extends String, ? extends V> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            String key = entry.getKey();
            V value = entry.getValue();
            if (key != null && value != null) {
                this.f70010a.put(key.toLowerCase(), value);
            }
        }
    }

    @Nullable
    public final V b(@Nullable String str) {
        return this.f70010a.remove(str.toLowerCase());
    }
}
