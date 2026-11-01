package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final class Y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27939b;

    public final int a() {
        return this.f27938a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y7)) {
            return false;
        }
        Y7 y10 = (Y7) obj;
        return this.f27938a == y10.f27938a && this.f27939b == y10.f27939b;
    }

    public final Y7 a(int i10, int i11) {
        return new Y7(i10, i11);
    }

    public final int b() {
        return this.f27939b;
    }

    public final int c() {
        return this.f27939b;
    }

    public final int d() {
        return this.f27938a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f27938a) * 31) + Integer.hashCode(this.f27939b);
    }

    public String toString() {
        return "ISContainerParams(width=" + this.f27938a + ", height=" + this.f27939b + ")";
    }

    public Y7(int i10, int i11) {
        this.f27938a = i10;
        this.f27939b = i11;
    }

    public static /* synthetic */ Y7 a(Y7 y10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = y10.f27938a;
        }
        if ((i12 & 2) != 0) {
            i11 = y10.f27939b;
        }
        return y10.a(i10, i11);
    }
}
