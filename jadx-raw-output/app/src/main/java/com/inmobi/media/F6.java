package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22622d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F6)) {
            return false;
        }
        F6 f10 = (F6) obj;
        return Float.compare(this.f22619a, f10.f22619a) == 0 && Float.compare(this.f22620b, f10.f22620b) == 0 && this.f22621c == f10.f22621c && this.f22622d == f10.f22622d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22622d) + AbstractC2862fi.a(this.f22621c, (Float.hashCode(this.f22620b) + (Float.hashCode(this.f22619a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureRectangle(x=" + this.f22619a + ", y=" + this.f22620b + ", width=" + this.f22621c + ", height=" + this.f22622d + ")";
    }

    public F6(float f10, float f11, int i10, int i11) {
        this.f22619a = f10;
        this.f22620b = f11;
        this.f22621c = i10;
        this.f22622d = i11;
    }
}
