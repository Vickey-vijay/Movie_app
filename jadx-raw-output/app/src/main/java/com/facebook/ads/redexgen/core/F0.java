package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F0 implements R6 {
    public final /* synthetic */ R0 A00;
    public final /* synthetic */ C09563q A01;

    public F0(C09563q c09563q, R0 r10) {
        this.A01 = c09563q;
        this.A00 = r10;
    }

    @Override // com.facebook.ads.redexgen.core.R6
    public final boolean AAA() {
        if (!this.A01.A0b()) {
            if (this.A01.A0c()) {
                return true;
            }
            return this.A01.A0d();
        }
        this.A01.A0a(this.A00);
        return true;
    }
}
