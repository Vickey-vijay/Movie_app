package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4053a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f56318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56319c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4053a4.class != obj.getClass()) {
            return false;
        }
        C4053a4 c4053a4 = (C4053a4) obj;
        if (!this.f56317a.equals(c4053a4.f56317a)) {
            return false;
        }
        Integer num = this.f56318b;
        if (num == null ? c4053a4.f56318b != null : !num.equals(c4053a4.f56318b)) {
            return false;
        }
        String str = this.f56319c;
        String str2 = c4053a4.f56319c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f56317a.hashCode() * 31;
        Integer num = this.f56318b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f56319c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public C4053a4(String str, Integer num, String str2) {
        this.f56317a = str;
        this.f56318b = num;
        this.f56319c = str2;
    }
}
