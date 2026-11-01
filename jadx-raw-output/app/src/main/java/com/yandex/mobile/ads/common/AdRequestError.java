package com.yandex.mobile.ads.common;

import ck.p;

/* JADX INFO: loaded from: classes2.dex */
public final class AdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51006c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(AdRequestError.class, obj.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f51004a == adRequestError.f51004a && p.e(this.f51006c, adRequestError.f51006c)) {
            return p.e(this.f51005b, adRequestError.f51005b);
        }
        return false;
    }

    public final int getCode() {
        return this.f51004a;
    }

    public final String getDescription() {
        return this.f51005b;
    }

    public int hashCode() {
        int iHashCode = ((this.f51005b.hashCode() * 31) + this.f51004a) * 31;
        String str = this.f51006c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i10 = this.f51004a;
        String str = this.f51005b;
        String str2 = this.f51006c;
        if (str2 == null) {
            str2 = "";
        }
        return "AdRequestError (code: " + i10 + ", description: " + str + ", adUnitId: " + str2 + ")";
    }

    public AdRequestError(int i10, String str, String str2) {
        this.f51004a = i10;
        this.f51005b = str;
        this.f51006c = str2;
    }
}
