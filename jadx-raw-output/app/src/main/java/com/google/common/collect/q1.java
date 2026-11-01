package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ForwardingMap.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class q1<K, V> extends r1 implements Map<K, V> {
    @Override // com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public abstract Map<K, V> g();

    public boolean equals(Object obj) {
        return obj == this || g().equals(obj);
    }

    @Override // java.util.Map
    public void clear() {
        g().clear();
    }

    public boolean containsKey(Object obj) {
        return g().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return g().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return g().entrySet();
    }

    public V get(Object obj) {
        return g().get(obj);
    }

    public int hashCode() {
        return g().hashCode();
    }

    public boolean isEmpty() {
        return g().isEmpty();
    }

    public Set<K> keySet() {
        return g().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return g().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        g().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return g().remove(obj);
    }

    public int size() {
        return g().size();
    }

    public void standardClear() {
        Iterators.c(entrySet().iterator());
    }

    public boolean standardContainsKey(Object obj) {
        return Maps.b(this, obj);
    }

    public boolean standardContainsValue(Object obj) {
        return Maps.c(this, obj);
    }

    public boolean standardEquals(Object obj) {
        return Maps.d(this, obj);
    }

    public int standardHashCode() {
        return Sets.d(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.l(this, map);
    }

    public V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (m5.i.a(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return Maps.p(this);
    }

    public Collection<V> values() {
        return g().values();
    }
}
