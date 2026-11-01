package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YX extends View {

    @Nullable
    public YW A00;

    public YX(C1977dL c1977dL, YW yw) {
        super(c1977dL);
        this.A00 = yw;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        YW yw = this.A00;
    }
}
