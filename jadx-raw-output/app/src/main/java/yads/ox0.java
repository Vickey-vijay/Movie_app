package yads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ox0 implements Map {
    @Override // java.util.Map
    public final void clear() {
        ((rd0) this).f82199b.clear();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return ((rd0) this).f82199b.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((rd0) this).f82199b.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return ((rd0) this).f82199b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((rd0) this).f82199b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((rd0) this).f82199b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((rd0) this).f82199b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((rd0) this).f82199b.size();
    }

    public final String toString() {
        return ((rd0) this).f82199b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((rd0) this).f82199b.values();
    }
}
