package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;

/* JADX INFO: compiled from: SingleIndicatorDrawer.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface SingleIndicatorDrawer {
    void draw(Canvas canvas, float f10, float f11, IndicatorParams$ItemSize indicatorParams$ItemSize, int i10, float f12, int i11);

    void drawSelected(Canvas canvas, RectF rectF);
}
