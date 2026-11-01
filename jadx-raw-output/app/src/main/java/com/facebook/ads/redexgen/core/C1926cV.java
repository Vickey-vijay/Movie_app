package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1926cV {
    public String A02;
    public String A03;
    public String A04;
    public final C1438Mw A06;
    public final N9 A07;
    public final C1977dL A08;
    public C1440My A01 = C1440My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C1926cV(C1977dL c1977dL, C1438Mw c1438Mw, N9 n10) {
        this.A08 = c1977dL;
        this.A06 = c1438Mw;
        this.A07 = n10;
    }

    public final C1926cV A09(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1926cV A0A(C1440My c1440My) {
        this.A01 = c1440My;
        return this;
    }

    public final C1926cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C1926cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C1926cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C1926cV A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C1928cX A0F() {
        return new C1928cX(this, null);
    }
}
