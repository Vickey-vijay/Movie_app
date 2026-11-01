package com.bytedance.sdk.component.fkw.lh.ouw;

import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lh<K, V> {
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11698le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11699lh;
    private final LinkedHashMap<K, SoftReference<V>> ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f11700ra;
    private int vt;
    private int yu;

    public final V ouw(K k10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            SoftReference<V> softReference = this.ouw.get(k10);
            if (softReference != null) {
                V v10 = softReference.get();
                if (v10 != null) {
                    this.f11700ra++;
                    return v10;
                }
                this.ouw.remove(k10);
            }
            this.pno++;
            return null;
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f11700ra;
        i11 = this.pno + i10;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f11699lh), Integer.valueOf(this.f11700ra), Integer.valueOf(this.pno), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public int vt(V v10) {
        return 1;
    }

    public lh(int i10) {
        if (i10 > 0) {
            this.f11699lh = i10;
            this.ouw = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int vt(K k10, V v10) {
        int iVt = vt(v10);
        if (iVt >= 0) {
            return iVt;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public final V ouw(K k10, V v10) {
        if (k10 != null && v10 != null) {
            V v11 = null;
            synchronized (this) {
                this.yu++;
                this.vt += vt(k10, v10);
                SoftReference<V> softReferencePut = this.ouw.put(k10, new SoftReference<>(v10));
                if (softReferencePut != null && (v11 = softReferencePut.get()) != null) {
                    this.vt -= vt(k10, v11);
                }
            }
            ouw(this.f11699lh);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void ouw(int i10) {
        while (true) {
            synchronized (this) {
                if (this.vt < 0 || (this.ouw.isEmpty() && this.vt != 0)) {
                    break;
                    break;
                }
                if (this.vt <= i10) {
                    return;
                }
                Map.Entry<K, SoftReference<V>> next = this.ouw.entrySet().iterator().next();
                if (next == null) {
                    return;
                }
                K key = next.getKey();
                SoftReference<V> value = next.getValue();
                this.ouw.remove(key);
                if (value != null) {
                    this.vt -= vt(key, value.get());
                }
                this.f11698le++;
            }
        }
        Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.vt + ", maxSize: " + i10);
        this.vt = 0;
        this.ouw.clear();
    }
}
