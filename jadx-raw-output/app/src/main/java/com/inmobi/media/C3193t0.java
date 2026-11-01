package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3193t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3144r1 f25359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f25361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f25363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25364f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3193t0)) {
            return false;
        }
        C3193t0 c3193t0 = (C3193t0) obj;
        return ck.p.e(this.f25359a, c3193t0.f25359a) && ck.p.e(this.f25360b, c3193t0.f25360b) && ck.p.e(this.f25361c, c3193t0.f25361c) && ck.p.e(this.f25362d, c3193t0.f25362d) && this.f25363e == c3193t0.f25363e && ck.p.e(this.f25364f, c3193t0.f25364f);
    }

    public C3193t0(C3144r1 c3144r1, String str, Boolean bool, String str2, byte b10, String str3) {
        ck.p.j(c3144r1, "adUnitTelemetry");
        this.f25359a = c3144r1;
        this.f25360b = str;
        this.f25361c = bool;
        this.f25362d = str2;
        this.f25363e = b10;
        this.f25364f = str3;
    }

    public final int hashCode() {
        int iHashCode = this.f25359a.hashCode() * 31;
        String str = this.f25360b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f25361c;
        int iHashCode3 = (Byte.hashCode(this.f25363e) + ((this.f25362d.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f25364f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C3144r1 c3144r1 = this.f25359a;
        String str = this.f25360b;
        Boolean bool = this.f25361c;
        String str2 = this.f25362d;
        byte b10 = this.f25363e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c3144r1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b10) + ", impressionId=" + this.f25364f + ")";
    }
}
