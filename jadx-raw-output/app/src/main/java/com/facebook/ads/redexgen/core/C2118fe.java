package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2118fe extends PH {
    public int A00;

    public C2118fe(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.PH, android.view.View
    public final void onMeasure(int i10, int i11) {
        int h10 = this.A00;
        for (int i12 = 0; i12 < height; i12++) {
            View childAt = getChildAt(i12);
            int height = View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(i10, height);
            int height2 = childAt.getMeasuredHeight();
            if (height2 > h10) {
                h10 = height2;
            }
        }
        int height3 = View.MeasureSpec.makeMeasureSpec(h10, 1073741824);
        super.onMeasure(i10, height3);
    }
}
