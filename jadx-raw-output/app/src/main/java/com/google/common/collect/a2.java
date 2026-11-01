package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Multimap.java */
/* JADX INFO: loaded from: classes10.dex */
public interface a2<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k10);

    boolean isEmpty();

    Set<K> keySet();

    boolean put(K k10, V v10);

    boolean putAll(a2<? extends K, ? extends V> a2Var);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    int size();

    Collection<V> values();
}
