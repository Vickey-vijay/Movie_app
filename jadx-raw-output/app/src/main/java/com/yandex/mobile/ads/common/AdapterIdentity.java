package com.yandex.mobile.ads.common;

import ck.p;

/* JADX INFO: loaded from: classes10.dex */
public final class AdapterIdentity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51015b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdapterIdentity)) {
            return false;
        }
        AdapterIdentity adapterIdentity = (AdapterIdentity) obj;
        return p.e(this.f51014a, adapterIdentity.f51014a) && p.e(this.f51015b, adapterIdentity.f51015b);
    }

    public int hashCode() {
        return this.f51015b.hashCode() + (this.f51014a.hashCode() * 31);
    }

    public String toString() {
        return "AdapterIdentity(adapterNetworkName=" + this.f51014a + ", adapterVersion=" + this.f51015b + ")";
    }

    public AdapterIdentity(String str, String str2) {
        this.f51014a = str;
        this.f51015b = str2;
    }
}
