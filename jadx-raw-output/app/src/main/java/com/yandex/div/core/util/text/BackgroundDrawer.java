package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import ck.p;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawerKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSolidBackground;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;

/* JADX INFO: compiled from: DivTextRangesBackgroundRenderer.kt */
/* JADX INFO: loaded from: classes5.dex */
final class BackgroundDrawer {
    private final DivTextRangeBackground background;
    private final DivTextRangeBorder border;
    private final Paint borerPaint;
    private final Canvas canvas;
    private final DisplayMetrics metrics;
    private final float[] radii;
    private final ExpressionResolver resolver;

    public final void drawBackground(float f10, float f11, float f12, float f13) {
        drawBackground(this.radii, f10, f11, f12, f13);
    }

    private final void drawBackground(float[] fArr, float f10, float f11, float f12, float f13) {
        RectF rectF = new RectF();
        rectF.set(f10, f11, f12, f13);
        DivTextRangeBackground divTextRangeBackground = this.background;
        Object objB = divTextRangeBackground != null ? divTextRangeBackground.b() : null;
        if (objB instanceof DivSolidBackground) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(((DivSolidBackground) objB).f49006a.evaluate(this.resolver).intValue());
            this.canvas.drawPath(getPath(fArr, rectF), paint);
        }
        drawBorder(fArr, f10, f11, f12, f13);
    }

    private final void drawBorder(float[] fArr, float f10, float f11, float f12, float f13) {
        DivTextRangeBorder divTextRangeBorder = this.border;
        if ((divTextRangeBorder != null ? divTextRangeBorder.f49631b : null) == null) {
            return;
        }
        RectF rectF = new RectF();
        DivStroke divStroke = this.border.f49631b;
        p.g(divStroke);
        float fWidthPx = DivBorderDrawerKt.widthPx(divStroke, this.resolver, this.metrics) / 2.0f;
        rectF.set(Math.max(0.0f, f10 + fWidthPx), Math.max(0.0f, f11 + fWidthPx), Math.max(0.0f, f12 - fWidthPx), Math.max(0.0f, f13 - fWidthPx));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                fArr2[i10] = Math.max(0.0f, fArr[i10] - fWidthPx);
            }
        }
        this.canvas.drawPath(getPath(fArr2, rectF), this.borerPaint);
    }

    private final Path getPath(float[] fArr, RectF rectF) {
        Path path = new Path();
        path.reset();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        path.close();
        return path;
    }

    public final void drawBackgroundEnd(float f10, float f11, float f12, float f13) {
        float[] fArr = new float[8];
        float[] fArr2 = this.radii;
        if (fArr2 != null) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        drawBackground(fArr, f10, f11, f12, f13);
    }

    public final void drawBackgroundMiddle(float f10, float f11, float f12, float f13) {
        drawBackground(new float[8], f10, f11, f12, f13);
    }

    public final void drawBackgroundStart(float f10, float f11, float f12, float f13) {
        float[] fArr = new float[8];
        float[] fArr2 = this.radii;
        if (fArr2 != null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
        }
        drawBackground(fArr, f10, f11, f12, f13);
    }

    public BackgroundDrawer(DisplayMetrics displayMetrics, DivTextRangeBorder divTextRangeBorder, DivTextRangeBackground divTextRangeBackground, Canvas canvas, ExpressionResolver expressionResolver) {
        Expression<Integer> expression;
        this.metrics = displayMetrics;
        this.border = divTextRangeBorder;
        this.background = divTextRangeBackground;
        this.canvas = canvas;
        this.resolver = expressionResolver;
        Paint paint = new Paint();
        this.borerPaint = paint;
        if (divTextRangeBorder != null) {
            this.radii = DivTextRangesBackgroundRendererKt.getCornerRadii(divTextRangeBorder, displayMetrics, expressionResolver);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(DivBorderDrawerKt.widthPx(divTextRangeBorder.f49631b, expressionResolver, displayMetrics));
            DivStroke divStroke = divTextRangeBorder.f49631b;
            if (divStroke != null && (expression = divStroke.f49131a) != null) {
                paint.setColor(expression.evaluate(expressionResolver).intValue());
                return;
            }
            return;
        }
        this.radii = null;
    }
}
