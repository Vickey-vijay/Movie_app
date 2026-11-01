package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1798aR {
    public static final int A00 = XP.A00();

    public static void A00(C1977dL c1977dL, ViewGroup viewGroup, String str) {
        new KZ(viewGroup, c1977dL).A07(str);
        View view = new View(c1977dL);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        XP.A0P(view, c1977dL);
        viewGroup.addView(view, 0);
    }
}
