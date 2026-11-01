package m6;

import y5.j;

/* JADX INFO: compiled from: FinderPattern.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f64153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j[] f64154c;

    public j[] a() {
        return this.f64154c;
    }

    public int[] b() {
        return this.f64153b;
    }

    public int c() {
        return this.f64152a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f64152a == ((c) obj).f64152a;
    }

    public int hashCode() {
        return this.f64152a;
    }

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f64152a = i10;
        this.f64153b = iArr;
        float f10 = i13;
        this.f64154c = new j[]{new j(i11, f10), new j(i12, f10)};
    }
}
