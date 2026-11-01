package com.mbridge.msdk.foundation.same.buffer;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: LruReplaceTempCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f34919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34921c;

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f34921c += b(str, jSONObject);
            JSONObject jSONObjectPut = this.f34919a.put(str, jSONObject);
            if (jSONObjectPut != null) {
                this.f34921c -= b(str, jSONObjectPut);
            }
        }
        a(this.f34920b);
        return true;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f34920b));
    }

    public a(int i10) {
        if (i10 > 0) {
            this.f34920b = i10;
            this.f34919a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f34919a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f34919a.keySet());
        }
        return hashSet;
    }

    private void a(int i10) {
        while (true) {
            synchronized (this) {
                if (this.f34921c < 0 || (this.f34919a.isEmpty() && this.f34921c != 0)) {
                    break;
                }
                if (this.f34921c > i10 && !this.f34919a.isEmpty()) {
                    Map.Entry<String, JSONObject> next = this.f34919a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    try {
                        int iB = b(key, next.getValue());
                        this.f34919a.remove(key);
                        this.f34921c -= iB;
                    } catch (Throwable unused) {
                    }
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
