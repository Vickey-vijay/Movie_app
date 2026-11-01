package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J3 implements InterfaceC1761Zo {
    public final /* synthetic */ C1331Is A00;

    public J3(C1331Is c1331Is) {
        this.A00 = c1331Is;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1761Zo
    public final void ADT(C1760Zn c1760Zn) {
        if (this.A00.A02 != null && c1760Zn.A00() != null) {
            this.A00.A02.setImageBitmap(c1760Zn.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
