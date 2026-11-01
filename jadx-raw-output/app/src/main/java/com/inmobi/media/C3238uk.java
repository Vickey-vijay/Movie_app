package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3238uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25489b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3238uk)) {
            return false;
        }
        C3238uk c3238uk = (C3238uk) obj;
        return ck.p.e(this.f25488a, c3238uk.f25488a) && ck.p.e(this.f25489b, c3238uk.f25489b);
    }

    public final int hashCode() {
        String str = this.f25488a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.f25489b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.f25488a + ", extras=" + this.f25489b + ")";
    }

    public C3238uk(String str, Map map) {
        this.f25488a = str;
        this.f25489b = map;
    }
}
