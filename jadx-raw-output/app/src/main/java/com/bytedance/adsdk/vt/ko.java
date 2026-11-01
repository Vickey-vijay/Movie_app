package com.bytedance.adsdk.vt;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ko<K, V> {
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11099le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11100lh = 20;
    private final LinkedHashMap<K, V> ouw = new LinkedHashMap<>(0, 0.75f, true);
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f11101ra;
    private int vt;
    private int yu;

    public final V ouw(K k10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v10 = this.ouw.get(k10);
            if (v10 != null) {
                this.f11101ra++;
                return v10;
            }
            this.pno++;
            return null;
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f11101ra;
        i11 = this.pno + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f11100lh), Integer.valueOf(this.f11101ra), Integer.valueOf(this.pno), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public final V ouw(K k10, V v10) {
        V vPut;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                this.yu++;
                this.vt++;
                vPut = this.ouw.put(k10, v10);
                if (vPut != null) {
                    this.vt--;
                }
            }
            ouw(this.f11100lh);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void ouw(int i10) {
        while (true) {
            synchronized (this) {
                if (this.vt < 0 || (this.ouw.isEmpty() && this.vt != 0)) {
                    break;
                }
                if (this.vt > i10 && !this.ouw.isEmpty()) {
                    Map.Entry<K, V> next = this.ouw.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.ouw.remove(key);
                    this.vt--;
                    this.f11099le++;
                }
                return;
            }
        }
        throw new IllegalStateException(ko.class.getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
