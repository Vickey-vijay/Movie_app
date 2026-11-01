package com.yandex.mobile.ads.common;

import ck.p;

/* JADX INFO: loaded from: classes2.dex */
public final class AdSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51008b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(AdSize.class, obj.getClass())) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f51007a == adSize.f51007a && this.f51008b == adSize.f51008b;
    }

    public int hashCode() {
        return (this.f51007a * 31) + this.f51008b;
    }

    public String toString() {
        return "AdSize (width=" + this.f51007a + ", height=" + this.f51008b + ")";
    }

    public AdSize(int i10, int i11) {
        this.f51007a = i10;
        this.f51008b = i11;
    }
}
