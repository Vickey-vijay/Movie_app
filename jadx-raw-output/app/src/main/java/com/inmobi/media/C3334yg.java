package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3334yg extends Tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25798a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3334yg) && this.f25798a == ((C3334yg) obj).f25798a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25798a);
    }

    public final String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.f25798a + ")";
    }

    public C3334yg(int i10) {
        this.f25798a = i10;
    }
}
