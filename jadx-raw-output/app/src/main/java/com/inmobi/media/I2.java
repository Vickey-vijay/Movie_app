package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f22841c;

    public I2(int i10, int i11, String str) {
        str = (i11 & 2) != 0 ? null : str;
        this.f22839a = i10;
        this.f22840b = str;
        this.f22841c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2)) {
            return false;
        }
        I2 i10 = (I2) obj;
        return this.f22839a == i10.f22839a && ck.p.e(this.f22840b, i10.f22840b) && ck.p.e(this.f22841c, i10.f22841c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f22839a) * 31;
        String str = this.f22840b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f22841c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f22839a + ", eventMessage=" + this.f22840b + ", eventData=" + this.f22841c + ")";
    }

    public I2(int i10, String str, Map map) {
        this.f22839a = i10;
        this.f22840b = str;
        this.f22841c = map;
    }
}
