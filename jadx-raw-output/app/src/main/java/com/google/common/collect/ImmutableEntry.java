package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
class ImmutableEntry<K, V> extends b<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final K key;
    public final V value;

    @Override // com.google.common.collect.b, java.util.Map.Entry
    public final K getKey() {
        return this.key;
    }

    @Override // com.google.common.collect.b, java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // com.google.common.collect.b, java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }

    public ImmutableEntry(K k10, V v10) {
        this.key = k10;
        this.value = v10;
    }
}
