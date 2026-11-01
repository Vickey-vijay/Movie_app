package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2745b4 extends AbstractC3098p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24038c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2745b4)) {
            return false;
        }
        C2745b4 c2745b4 = (C2745b4) obj;
        return ck.p.e(this.f24036a, c2745b4.f24036a) && this.f24037b == c2745b4.f24037b && this.f24038c == c2745b4.f24038c;
    }

    public C2745b4(int i10, long j10, String str) {
        ck.p.j(str, "configType");
        this.f24036a = str;
        this.f24037b = i10;
        this.f24038c = j10;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24038c) + AbstractC2862fi.a(this.f24037b, this.f24036a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigFailure(configType=" + this.f24036a + ", errorCode=" + this.f24037b + ", lastUpdatedTimestamp=" + this.f24038c + ")";
    }
}
