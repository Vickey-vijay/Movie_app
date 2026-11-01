package com.mbridge.msdk.click.retry;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: WaitRetryLruMemoryCache.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f32939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32941c;

    private int b(String str, b bVar) {
        return 1;
    }

    public final b a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            b bVar = this.f32939a.get(str);
            if (bVar != null) {
                return bVar;
            }
            return null;
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f32940b));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            b bVarRemove = this.f32939a.remove(str);
            if (bVarRemove != null) {
                this.f32941c -= b(str, bVarRemove);
            }
        }
    }

    public c(int i10) {
        if (i10 > 0) {
            this.f32940b = i10;
            this.f32939a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                this.f32941c += b(str, bVar);
                b bVarPut = this.f32939a.put(str, bVar);
                if (bVarPut != null) {
                    this.f32941c -= b(str, bVarPut);
                }
            }
            a(this.f32940b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i10) {
        while (true) {
            synchronized (this) {
                if (this.f32941c < 0 || (this.f32939a.isEmpty() && this.f32941c != 0)) {
                    break;
                }
                if (this.f32941c > i10 && !this.f32939a.isEmpty()) {
                    Map.Entry<String, b> next = this.f32939a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    try {
                        int iB = b(key, next.getValue());
                        this.f32939a.remove(key);
                        this.f32941c -= iB;
                    } catch (Throwable unused) {
                    }
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f32939a.keySet());
        }
        return hashSet;
    }
}
