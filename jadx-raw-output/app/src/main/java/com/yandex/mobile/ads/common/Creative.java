package com.yandex.mobile.ads.common;

import ck.i;
import ck.p;

/* JADX INFO: loaded from: classes2.dex */
public final class Creative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51035b;

    /* JADX WARN: Multi-variable type inference failed */
    public Creative() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Creative)) {
            return false;
        }
        Creative creative = (Creative) obj;
        return p.e(this.f51034a, creative.f51034a) && p.e(this.f51035b, creative.f51035b);
    }

    public int hashCode() {
        String str = this.f51034a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51035b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Creative(creativeId=" + this.f51034a + ", campaignId=" + this.f51035b + ")";
    }

    public Creative(String str, String str2) {
        this.f51034a = str;
        this.f51035b = str2;
    }

    public /* synthetic */ Creative(String str, String str2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
