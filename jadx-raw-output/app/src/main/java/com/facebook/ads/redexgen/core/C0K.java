package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0K extends C08710h {
    public C10105s A00;
    public List<C1944cn> A01;

    public C0K(C1977dL c1977dL) {
        super(c1977dL);
        this.A00 = new C10105s(this, 1, null, null, null);
    }

    public final void A20(C2050eX c2050eX) {
        if (this.A00 != null) {
            this.A00.A0c(c2050eX);
        }
    }

    public C10105s getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
