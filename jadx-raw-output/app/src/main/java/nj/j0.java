package nj;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class j0<K, V> implements i0<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, V> f64745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.l<K, V> f64746c;

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(Map<K, ? extends V> map, bk.l<? super K, ? extends V> lVar) {
        ck.p.j(map, "map");
        ck.p.j(lVar, "default");
        this.f64745b = map;
        this.f64746c = lVar;
    }

    @Override // nj.i0
    public Map<K, V> i() {
        return this.f64745b;
    }

    public Set<Map.Entry<K, V>> a() {
        return i().entrySet();
    }

    public Set<K> b() {
        return i().keySet();
    }

    @Override // nj.i0
    public V c(K k10) {
        Map<K, V> mapI = i();
        V v10 = mapI.get(k10);
        if (v10 == null && !mapI.containsKey(k10)) {
            return this.f64746c.invoke(k10);
        }
        return v10;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return i().containsValue(obj);
    }

    public int d() {
        return i().size();
    }

    public Collection<V> e() {
        return i().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return i().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return i().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return i().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return i().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    public String toString() {
        return i().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return e();
    }
}
