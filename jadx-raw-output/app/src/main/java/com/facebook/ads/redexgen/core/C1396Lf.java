package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1396Lf implements InterfaceC1706Xl {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ C1393Lc A00;

    public C1396Lf(C1393Lc c1393Lc) {
        this.A00 = c1393Lc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1706Xl
    public final void ACC(AbstractC1707Xm abstractC1707Xm) {
        if (this.A00.A0W() && !this.A00.A0V.get()) {
            this.A00.A0T.A07(this.A00);
            return;
        }
        C1393Lc c1393Lc = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            if (!c1393Lc.A0X || this.A00.A0V.get() || !this.A00.A0V()) {
                this.A00.A0N.A04(UZ.A07, null);
                if (this.A00.A0J.A0P()) {
                    this.A00.A0L.A0F().ADk();
                }
                InterfaceC1708Xn interfaceC1708Xn = this.A00.A0Q;
                C1393Lc c1393Lc2 = this.A00;
                if (A01[2].length() == 9) {
                    A01[6] = "SsRiNY9tvP3hEWy4eyTF9NsffnrPtCfL";
                    interfaceC1708Xn.A4b(c1393Lc2.A0R.A7o());
                    return;
                }
            } else {
                this.A00.A0a.setToolbarActionMode(0);
                this.A00.A0L();
                return;
            }
        }
        throw new RuntimeException();
    }
}
