package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1722Yb {
    public int A00;
    public XX A01;
    public InterfaceC1726Yf A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C1977dL A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public C1722Yb(C1977dL c1977dL, InterfaceC1726Yf interfaceC1726Yf) {
        this.A0C = c1977dL;
        this.A02 = interfaceC1726Yf;
    }

    public final C1722Yb A0D(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1722Yb A0E(XX xx) {
        this.A01 = xx;
        return this;
    }

    public final C1722Yb A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final C1722Yb A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final C1722Yb A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final C1722Yb A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final C1722Yb A0J(boolean z10) {
        this.A09 = z10;
        return this;
    }

    public final C1722Yb A0K(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final C1722Yb A0L(boolean z10) {
        this.A0B = z10;
        return this;
    }

    public final C1723Yc A0M() {
        return new C1723Yc(this, null);
    }
}
