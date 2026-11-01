package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4605vn implements TempCacheStorage.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f57853d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(C4605vn.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C4605vn c4605vn = (C4605vn) obj;
        if (this.f57850a == c4605vn.f57850a && ck.p.e(this.f57851b, c4605vn.f57851b) && this.f57852c == c4605vn.f57852c) {
            return Arrays.equals(this.f57853d, c4605vn.f57853d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f57853d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f57850a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f57851b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f57852c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f57853d) + ((Long.hashCode(this.f57852c) + ((this.f57851b.hashCode() + (Long.hashCode(this.f57850a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f57850a + ", scope='" + this.f57851b + "', timestamp=" + this.f57852c + ", data=array[" + this.f57853d.length + "])";
    }

    public C4605vn(long j10, String str, long j11, byte[] bArr) {
        this.f57850a = j10;
        this.f57851b = str;
        this.f57852c = j11;
        this.f57853d = bArr;
    }
}
