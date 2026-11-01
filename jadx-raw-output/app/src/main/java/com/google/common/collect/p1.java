package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: ForwardingConcurrentMap.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class p1<K, V> extends q1<K, V> implements ConcurrentMap<K, V> {
    @Override // com.google.common.collect.q1, com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public abstract ConcurrentMap<K, V> g();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        return g().replace(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        return g().replace(k10, v10, v11);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        return g().putIfAbsent(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return g().remove(obj, obj2);
    }
}
