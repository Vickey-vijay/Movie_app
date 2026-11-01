package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;

/* JADX INFO: compiled from: DivTextRangesBackgroundRenderer.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DivTextRangesBackgroundRenderer {
    public abstract void draw(Canvas canvas, Layout layout, int i10, int i11, int i12, int i13, DivTextRangeBorder divTextRangeBorder, DivTextRangeBackground divTextRangeBackground);

    private final int getLineHeight(Layout layout, int i10) {
        return layout.getLineTop(i10 + 1) - layout.getLineTop(i10);
    }

    private final int getLineBottomWithoutSpacing(Layout layout, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int lineBottom = layout.getLineBottom(i10);
        boolean z13 = true;
        if (i10 == layout.getLineCount() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if (spacingAdd == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (spacingMultiplier == 1.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                z13 = false;
            }
        }
        if (z13 && !z10) {
            if (Float.compare(spacingMultiplier, 1.0f) != 0) {
                float lineHeight = getLineHeight(layout, i10);
                spacingAdd = lineHeight - ((lineHeight - spacingAdd) / spacingMultiplier);
            }
            return (int) (lineBottom - spacingAdd);
        }
        return lineBottom;
    }

    public final int getLineBottom(Layout layout, int i10) {
        int lineBottomWithoutSpacing = getLineBottomWithoutSpacing(layout, i10);
        if (i10 == layout.getLineCount() - 1) {
            return lineBottomWithoutSpacing - layout.getBottomPadding();
        }
        return lineBottomWithoutSpacing;
    }

    public final int getLineTop(Layout layout, int i10) {
        int lineTop = layout.getLineTop(i10);
        if (i10 == 0) {
            return lineTop - layout.getTopPadding();
        }
        return lineTop;
    }
}
