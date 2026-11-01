package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1184Da extends RelativeLayout implements InterfaceC1994dc {
    public E1 A00;

    public AbstractC1184Da(C1977dL c1977dL) {
        super(c1977dL);
    }

    public AbstractC1184Da(C1977dL c1977dL, AttributeSet attributeSet, int i10) {
        super(c1977dL, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1994dc
    public final void AAm(E1 e10) {
        this.A00 = e10;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1994dc
    public final void AJk(E1 e10) {
        A08();
        this.A00 = null;
    }

    public E1 getVideoView() {
        return this.A00;
    }
}
