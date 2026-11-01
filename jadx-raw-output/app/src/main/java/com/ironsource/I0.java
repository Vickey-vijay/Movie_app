package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26774a;

    public final long a() {
        return this.f26774a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I0) && this.f26774a == ((I0) obj).f26774a;
    }

    public final I0 a(long j10) {
        return new I0(j10);
    }

    public final long b() {
        return this.f26774a;
    }

    public int hashCode() {
        return Long.hashCode(this.f26774a);
    }

    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f26774a + ")";
    }

    public I0(long j10) {
        this.f26774a = j10;
    }

    public static /* synthetic */ I0 a(I0 i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = i10.f26774a;
        }
        return i10.a(j10);
    }
}
