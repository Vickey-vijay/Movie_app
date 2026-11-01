package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class Lg implements RemoteConfigMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55520b;

    public final Lg a(long j10, long j11) {
        return new Lg(j10, j11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lg)) {
            return false;
        }
        Lg lg2 = (Lg) obj;
        return this.f55519a == lg2.f55519a && this.f55520b == lg2.f55520b;
    }

    public final long a() {
        return this.f55519a;
    }

    public final long b() {
        return this.f55520b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f55519a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f55520b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55520b) + (Long.hashCode(this.f55519a) * 31);
    }

    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f55519a + ", lastUpdateTime=" + this.f55520b + ')';
    }

    public Lg(long j10, long j11) {
        this.f55519a = j10;
        this.f55520b = j11;
    }

    public static Lg a(Lg lg2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = lg2.f55519a;
        }
        if ((i10 & 2) != 0) {
            j11 = lg2.f55520b;
        }
        lg2.getClass();
        return new Lg(j10, j11);
    }
}
