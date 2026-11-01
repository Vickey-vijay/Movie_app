package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZA extends ImageView {
    public ZA(C1977dL c1977dL, View.OnClickListener onClickListener) {
        super(c1977dL);
        Bitmap bitmap = XY.A01(XX.CREDIT_LINE_PILL);
        setImageBitmap(bitmap);
        setOnClickListener(onClickListener);
    }
}
