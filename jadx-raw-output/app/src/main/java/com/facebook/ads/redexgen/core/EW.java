package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EW extends C1792aL {
    public final ImageView A00;
    public final C1977dL A01;

    public EW(C1977dL c1977dL) {
        super(c1977dL);
        this.A01 = c1977dL;
        setRadius(30);
        this.A00 = new ImageView(c1977dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C1760Zn c1760Zn) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        KZ kz = new KZ(this.A00, this.A01);
        kz.A04();
        kz.A07(str);
        kz.A06(new InterfaceC1761Zo() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // com.facebook.ads.redexgen.core.InterfaceC1761Zo
            public final void ADT(C1760Zn c1760Zn) {
                this.A00.A00(c1760Zn);
            }
        });
    }
}
