package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1790aJ extends LinearLayout {
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C1790aJ(C1977dL c1977dL, C1440My c1440My, int i10) {
        super(c1977dL);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f10 = AbstractC1680Wl.A02;
        int i11 = (int) (8.0f * f10);
        int i12 = (int) (6.0f * f10);
        this.A02 = (int) (1.0f * f10);
        this.A04 = c1440My.A05(false);
        this.A03 = OP.A02(this.A04, 128);
        this.A01 = new ArrayList();
        for (int margin = 0; margin < i10; margin++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i11, i11);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c1977dL);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i12, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i10) {
        int i11;
        int borderColor;
        if (this.A00 == i10) {
            return;
        }
        this.A00 = i10;
        for (int i12 = 0; i12 < i; i12++) {
            if (i12 == i10) {
                i11 = this.A04;
                borderColor = this.A04;
            } else {
                i11 = this.A03;
                borderColor = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i12);
            int i13 = this.A02;
            gradientDrawable.setStroke(i13, borderColor);
            this.A01.get(i12).setColor(i11);
            this.A01.get(i12).invalidateSelf();
        }
    }
}
