package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1724Yd extends FrameLayout {
    public static String[] A0C = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public O4 A01;
    public O5 A02;
    public O6 A03;
    public final O2 A04;
    public final C1977dL A05;
    public final US A06;
    public final InterfaceC1708Xn A07;
    public final InterfaceC1709Xo A08;
    public final String A09;
    public final N9 A0A;
    public final InterfaceC1726Yf A0B;

    public abstract void A0N();

    public abstract void A0O();

    public abstract void A0P(O6 o10, O4 o11);

    public abstract void A0Q(O6 o10, O4 o11);

    public abstract boolean A0R();

    public AbstractC1724Yd(C1977dL c1977dL, US us, String str) {
        this(c1977dL, us, str, null, null, null);
    }

    public AbstractC1724Yd(C1977dL c1977dL, US us, String str, N9 n10, InterfaceC1709Xo interfaceC1709Xo, InterfaceC1708Xn interfaceC1708Xn) {
        super(c1977dL);
        this.A00 = 0;
        this.A01 = O4.A05;
        this.A03 = null;
        this.A0B = new LW(this);
        this.A05 = c1977dL;
        this.A06 = us;
        this.A08 = interfaceC1709Xo;
        this.A07 = interfaceC1708Xn;
        this.A09 = str;
        this.A0A = n10;
        this.A04 = O3.A00(this.A05.A02());
    }

    public static /* synthetic */ int A02(AbstractC1724Yd abstractC1724Yd) {
        int i10 = abstractC1724Yd.A00;
        abstractC1724Yd.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A03(AbstractC1724Yd abstractC1724Yd) {
        int i10 = abstractC1724Yd.A00;
        abstractC1724Yd.A00 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        if (this.A02.A0A()) {
            this.A06.AAp(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        this.A03 = null;
        this.A02.A05();
        A0N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(O6 o10) {
        this.A02.A08(this.A01);
        A0P(o10, this.A01);
        MW.A01(this.A05).A0L();
        if (A0R()) {
            A0D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(O6 o10) {
        this.A03 = o10;
        this.A02.A09(this.A01, this.A00);
        A0Q(o10, this.A01);
    }

    public final void A0L() {
        A0D();
    }

    public final void A0M() {
        this.A02 = new O5(new C1620Ua(this.A09, this.A06));
        if (this.A08 != null) {
            InterfaceC1709Xo interfaceC1709Xo = this.A08;
            if (A0C[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0C[7] = "FLAi4P2";
            interfaceC1709Xo.AEV(true);
        }
        A0E();
    }
}
