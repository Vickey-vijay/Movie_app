package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4412o4 extends C4078b3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57376b;

    @Override // io.appmetrica.analytics.impl.C4078b3
    public final String toString() {
        return "CollectionTrimInfo{itemsDropped=" + this.f57376b + ", bytesTruncated=" + this.f56400a + '}';
    }

    public C4412o4(int i10, int i11) {
        super(i11);
        this.f57376b = i10;
    }
}
