package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1559Rp {
    public final long A00;
    public final EnumC1558Ro A01;
    public final String A02;
    public final boolean A03;

    public C1559Rp(String str, boolean z10, EnumC1558Ro enumC1558Ro) {
        this(str, z10, enumC1558Ro, System.currentTimeMillis());
    }

    public C1559Rp(String str, boolean z10, EnumC1558Ro enumC1558Ro, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC1558Ro;
        this.A00 = j10;
    }

    public static C1559Rp A00() {
        return new C1559Rp("", true, EnumC1558Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC1558Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
