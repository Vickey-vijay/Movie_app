package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2833ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24312b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2833ef)) {
            return false;
        }
        C2833ef c2833ef = (C2833ef) obj;
        return ck.p.e(this.f24311a, c2833ef.f24311a) && ck.p.e("i6i", "i6i") && ck.p.e(this.f24312b, c2833ef.f24312b) && ck.p.e("inmobi", "inmobi");
    }

    public C2833ef(String str, String str2) {
        ck.p.j(str, "hyperId");
        ck.p.j("i6i", "sspId");
        ck.p.j(str2, "spHost");
        ck.p.j("inmobi", "pubId");
        this.f24311a = str;
        this.f24312b = str2;
    }

    public final int hashCode() {
        return ((this.f24312b.hashCode() + (((this.f24311a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f24311a + ", sspId=i6i, spHost=" + this.f24312b + ", pubId=inmobi)";
    }
}
