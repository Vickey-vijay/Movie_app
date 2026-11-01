package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public final class Mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23175c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mi)) {
            return false;
        }
        Mi mi2 = (Mi) obj;
        return this.f23173a == mi2.f23173a && this.f23174b == mi2.f23174b && this.f23175c == mi2.f23175c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23175c) + AbstractC2862fi.a(this.f23174b, Integer.hashCode(this.f23173a) * 31, 31);
    }

    public final String toString() {
        return "SemVer(major=" + this.f23173a + ", minor=" + this.f23174b + ", patch=" + this.f23175c + ")";
    }

    public Mi(int i10, int i11, int i12) {
        this.f23173a = i10;
        this.f23174b = i11;
        this.f23175c = i12;
    }
}
