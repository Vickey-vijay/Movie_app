package com.inmobi.media;

import android.graphics.Point;
import android.graphics.RectF;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes8.dex */
public final class T extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f23543a;

    public T(U u10) {
        this.f23543a = u10;
    }

    @Override // com.inmobi.media.uo
    public final void a(WindowInsets windowInsets) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        ck.p.j(windowInsets, "insets");
        C3298x5.f25687a.getClass();
        if (C3298x5.s()) {
            RoundedCorner roundedCorner = windowInsets.getRoundedCorner(0);
            int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
            RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(1);
            int radius2 = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
            RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(2);
            int radius3 = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
            RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(3);
            int radius4 = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
            RoundedCorner roundedCorner5 = windowInsets.getRoundedCorner(0);
            RectF rectF4 = null;
            Point center = roundedCorner5 != null ? roundedCorner5.getCenter() : null;
            RoundedCorner roundedCorner6 = windowInsets.getRoundedCorner(1);
            Point center2 = roundedCorner6 != null ? roundedCorner6.getCenter() : null;
            RoundedCorner roundedCorner7 = windowInsets.getRoundedCorner(2);
            Point center3 = roundedCorner7 != null ? roundedCorner7.getCenter() : null;
            RoundedCorner roundedCorner8 = windowInsets.getRoundedCorner(3);
            Point center4 = roundedCorner8 != null ? roundedCorner8.getCenter() : null;
            if (radius <= 0 || center == null) {
                rectF = null;
            } else {
                int i10 = center.x;
                int i11 = center.y;
                rectF = new RectF(i10 - radius, i11 - radius, i10, i11);
            }
            if (radius2 <= 0 || center2 == null) {
                rectF2 = null;
            } else {
                int i12 = center2.x;
                int i13 = center2.y;
                rectF2 = new RectF(i12, i13 - radius, i12 + radius2, i13);
            }
            if (radius4 <= 0 || center4 == null) {
                rectF3 = null;
            } else {
                int i14 = center4.x;
                int i15 = center4.y;
                rectF3 = new RectF(i14 - radius4, i15, i14, i15 + radius4);
            }
            if (radius3 > 0 && center3 != null) {
                int i16 = center3.x;
                int i17 = center3.y;
                rectF4 = new RectF(i16, i17, i16 + radius3, i17 + radius3);
            }
            this.f23543a.f23599g = new L(rectF, rectF2, rectF3, rectF4);
        }
    }
}
