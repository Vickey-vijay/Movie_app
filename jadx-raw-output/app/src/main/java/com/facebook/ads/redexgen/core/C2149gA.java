package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2149gA implements InterfaceC1531Qn {
    public final /* synthetic */ C10246g A00;

    public C2149gA(C10246g c10246g) {
        this.A00 = c10246g;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1531Qn
    public final void AGP(AbstractC1524Qg abstractC1524Qg, QJ qj2, QJ qj3) {
        this.A00.A1l(abstractC1524Qg, qj2, qj3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1531Qn
    public final void AGR(AbstractC1524Qg abstractC1524Qg, QJ qj2, QJ qj3) {
        this.A00.A0r.A0Y(abstractC1524Qg);
        this.A00.A1m(abstractC1524Qg, qj2, qj3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1531Qn
    public final void AGT(AbstractC1524Qg abstractC1524Qg, QJ qj2, QJ qj3) {
        abstractC1524Qg.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC1524Qg, abstractC1524Qg, qj2, qj3)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC1524Qg, qj2, qj3)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1531Qn
    public final void AJo(AbstractC1524Qg abstractC1524Qg) {
        this.A00.A06.A1F(abstractC1524Qg.A0H, this.A00.A0r);
    }
}
