package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationFilter f58101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheArguments f58102b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f58101a = locationFilter;
        this.f58102b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        i iVar = (i) obj;
        return ck.p.e(this.f58101a, iVar.f58101a) && ck.p.e(this.f58102b, iVar.f58102b);
    }

    public final int hashCode() {
        return this.f58102b.hashCode() + (this.f58101a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f58101a + ", cacheArguments=" + this.f58102b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
