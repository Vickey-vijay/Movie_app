package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class L5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23061c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5)) {
            return false;
        }
        L5 l10 = (L5) obj;
        return this.f23059a == l10.f23059a && this.f23060b == l10.f23060b && Float.compare(this.f23061c, l10.f23061c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23061c) + AbstractC2862fi.a(this.f23060b, Integer.hashCode(this.f23059a) * 31, 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f23059a + ", height=" + this.f23060b + ", density=" + this.f23061c + ")";
    }

    public L5(int i10, int i11, float f10) {
        this.f23059a = i10;
        this.f23060b = i11;
        this.f23061c = f10;
    }
}
