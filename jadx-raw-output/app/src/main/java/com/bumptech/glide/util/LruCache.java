package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class LruCache<T, Y> {
    private final Map<T, Entry<Y>> cache = new LinkedHashMap(100, 0.75f, true);
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    public synchronized boolean contains(@NonNull T t10) {
        return this.cache.containsKey(t10);
    }

    @Nullable
    public synchronized Y get(@NonNull T t10) {
        Entry<Y> entry;
        entry = this.cache.get(t10);
        return entry != null ? entry.value : null;
    }

    public synchronized int getCount() {
        return this.cache.size();
    }

    public synchronized long getCurrentSize() {
        return this.currentSize;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public int getSize(@Nullable Y y10) {
        return 1;
    }

    public void onItemEvicted(@NonNull T t10, @Nullable Y y10) {
    }

    @Nullable
    public synchronized Y put(@NonNull T t10, @Nullable Y y10) {
        int size = getSize(y10);
        long j10 = size;
        if (j10 >= this.maxSize) {
            onItemEvicted(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.currentSize += j10;
        }
        Entry<Y> entryPut = this.cache.put(t10, y10 == null ? null : new Entry<>(y10, size));
        if (entryPut != null) {
            this.currentSize -= (long) entryPut.size;
            if (!entryPut.value.equals(y10)) {
                onItemEvicted(t10, entryPut.value);
            }
        }
        evict();
        return entryPut != null ? entryPut.value : null;
    }

    @Nullable
    public synchronized Y remove(@NonNull T t10) {
        Entry<Y> entryRemove = this.cache.remove(t10);
        if (entryRemove == null) {
            return null;
        }
        this.currentSize -= (long) entryRemove.size;
        return entryRemove.value;
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

    public synchronized void trimToSize(long j10) {
        while (this.currentSize > j10) {
            Iterator<Map.Entry<T, Entry<Y>>> it = this.cache.entrySet().iterator();
            Map.Entry<T, Entry<Y>> next = it.next();
            Entry<Y> value = next.getValue();
            this.currentSize -= (long) value.size;
            T key = next.getKey();
            it.remove();
            onItemEvicted(key, value.value);
        }
    }

    public static final class Entry<Y> {
        public final int size;
        public final Y value;

        public Entry(Y y10, int i10) {
            this.value = y10;
            this.size = i10;
        }
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public LruCache(long j10) {
        this.initialMaxSize = j10;
        this.maxSize = j10;
    }
}
