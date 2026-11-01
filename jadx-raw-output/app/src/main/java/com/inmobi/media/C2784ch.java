package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2784ch extends AbstractC2835eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24138b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2784ch)) {
            return false;
        }
        C2784ch c2784ch = (C2784ch) obj;
        return this.f24137a == c2784ch.f24137a && ck.p.e(this.f24138b, c2784ch.f24138b);
    }

    public C2784ch(String str, int i10) {
        ck.p.j(str, "message");
        this.f24137a = i10;
        this.f24138b = str;
    }

    public final int hashCode() {
        return this.f24138b.hashCode() + (Integer.hashCode(this.f24137a) * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.f24137a + ", message=" + this.f24138b + ")";
    }
}
