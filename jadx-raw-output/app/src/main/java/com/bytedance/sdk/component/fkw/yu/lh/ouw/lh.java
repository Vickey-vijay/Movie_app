package com.bytedance.sdk.component.fkw.yu.lh.ouw;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class lh<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> ouw = new LinkedHashMap<>(0, 0.75f, true);
    private int vt;

    public final synchronized V ouw(K k10) {
        V v10 = null;
        if (k10 == null) {
            return null;
        }
        if (this.vt <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.ouw.get(k10);
        if (softReference != null) {
            v10 = softReference.get();
            if (v10 != null) {
                return v10;
            }
            this.ouw.remove(k10);
        }
        return v10;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.vt), Integer.valueOf(this.ouw.size()));
    }

    public lh(int i10) {
        this.vt = i10;
    }

    public final synchronized void ouw(K k10, V v10) {
        if (this.vt <= 0) {
            return;
        }
        if (k10 == null || v10 == null) {
            return;
        }
        this.ouw.put(k10, new SoftReference<>(v10));
        int size = this.ouw.size();
        int i10 = this.vt;
        if (size > i10) {
            ouw((int) (((double) i10) * 0.7d));
        }
    }

    private synchronized void ouw(int i10) {
        int size = this.ouw.size() - i10;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.ouw.entrySet().iterator();
            for (int i11 = 0; i11 < size; i11++) {
                it.next();
                it.remove();
            }
        }
        if (i10 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.ouw.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}
