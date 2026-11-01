package org.fourthline.cling.support.shared;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class AbstractMap$SimpleEntry<K, V> implements Map.Entry<K, V>, Serializable {
    private static final long serialVersionUID = -8499721149061103585L;
    private final K key;
    private V value;

    public AbstractMap$SimpleEntry(K k10, V v10) {
        this.key = k10;
        this.value = v10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        K k10 = this.key;
        if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
            V v10 = this.value;
            if (v10 == null) {
                if (entry.getValue() == null) {
                    return true;
                }
            } else if (v10.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K k10 = this.key;
        int iHashCode = k10 == null ? 0 : k10.hashCode();
        V v10 = this.value;
        return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        V v11 = this.value;
        this.value = v10;
        return v11;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }

    public AbstractMap$SimpleEntry(Map.Entry<? extends K, ? extends V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }
}
