package com.safedk.android.utils;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LimitedConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44882a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44883b = "LimitedConcurrentHashMap";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<K> f44885d;

    public LimitedConcurrentHashMap() {
        this(15);
    }

    public LimitedConcurrentHashMap(int maxSize) {
        this.f44884c = -1;
        this.f44885d = new ArrayDeque<>();
        if (maxSize > 0) {
            this.f44884c = maxSize;
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K key, V value) {
        if (containsKey(key)) {
            this.f44885d.remove(key);
            this.f44885d.addLast(key);
            super.put(key, value);
        } else {
            if (this.f44884c > 0 && this.f44885d.size() > 0 && size() == this.f44884c) {
                super.remove(this.f44885d.removeFirst());
            }
            this.f44885d.addLast(key);
            super.put(key, value);
        }
        return value;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        this.f44885d.remove(obj);
        return (V) super.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        this.f44885d.remove(key);
        return super.remove(key, value);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public String toString() {
        return "LimitedConcurrentHashMap size=" + size() + " map is: " + super.toString();
    }

    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LimitedConcurrentHashMap<K, V> clone() {
        LimitedConcurrentHashMap<K, V> limitedConcurrentHashMap = new LimitedConcurrentHashMap<>(this.f44884c);
        limitedConcurrentHashMap.putAll(this);
        return limitedConcurrentHashMap;
    }
}
