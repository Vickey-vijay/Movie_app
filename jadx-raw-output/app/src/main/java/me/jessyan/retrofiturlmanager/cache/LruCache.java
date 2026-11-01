package me.jessyan.retrofiturlmanager.cache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class LruCache<K, V> implements Cache<K, V> {
    private final LinkedHashMap<K, V> cache = new LinkedHashMap<>(100, 0.75f, true);
    private int currentSize = 0;
    private final int initialMaxSize;
    private int maxSize;

    @Override // me.jessyan.retrofiturlmanager.cache.Cache
    public void clear() {
        trimToSize(0);
    }

    @Override // me.jessyan.retrofiturlmanager.cache.Cache
    public synchronized boolean containsKey(K k10) {
        return this.cache.containsKey(k10);
    }

    @Override // me.jessyan.retrofiturlmanager.cache.Cache
    public synchronized V get(K k10) {
        return this.cache.get(k10);
    }

    public int getItemSize(V v10) {
        return 1;
    }

    @Override // me.jessyan.retrofiturlmanager.cache.Cache
    public synchronized int getMaxSize() {
        return this.maxSize;
    }

    @Override // me.jessyan.retrofiturlmanager.cache.Cache
    public synchronized Set<K> keySet() {
        return this.cache.keySet();
    }

    public void onItemEvicted(K k10, V v10) {
    }

    @Override // me.jessyan.retrofiturlmanager.cache.Cache
    public synchronized V put(K k10, V v10) {
        if (getItemSize(v10) >= this.maxSize) {
            onItemEvicted(k10, v10);
            return null;
        }
        V vPut = this.cache.put(k10, v10);
        if (v10 != null) {
            this.currentSize += getItemSize(v10);
        }
        if (vPut != null) {
            this.currentSize -= getItemSize(vPut);
        }
        evict();
        return vPut;
    }

    @Override // me.jessyan.retrofiturlmanager.cache.Cache
    public synchronized V remove(K k10) {
        V vRemove;
        vRemove = this.cache.remove(k10);
        if (vRemove != null) {
            this.currentSize -= getItemSize(vRemove);
        }
        return vRemove;
    }

    public synchronized void setSizeMultiplier(float f10) {
        try {
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.maxSize = Math.round(this.initialMaxSize * f10);
            evict();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // me.jessyan.retrofiturlmanager.cache.Cache
    public synchronized int size() {
        return this.currentSize;
    }

    public synchronized void trimToSize(int i10) {
        while (this.currentSize > i10) {
            Map.Entry<K, V> next = this.cache.entrySet().iterator().next();
            V value = next.getValue();
            this.currentSize -= getItemSize(value);
            K key = next.getKey();
            this.cache.remove(key);
            onItemEvicted(key, value);
        }
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    public LruCache(int i10) {
        this.initialMaxSize = i10;
        this.maxSize = i10;
    }
}
