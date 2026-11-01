package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes9.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float trackLength;

    private static void drawRoundedEnd(Canvas canvas, Paint paint, float f10, float f11, float f12, boolean z10, RectF rectF) {
        canvas.save();
        canvas.translate(f12, 0.0f);
        if (!z10) {
            canvas.rotate(180.0f);
        }
        float f13 = ((-f10) / 2.0f) + f11;
        float f14 = (f10 / 2.0f) - f11;
        canvas.drawRect(-f11, f13, 0.0f, f14, paint);
        canvas.save();
        canvas.translate(0.0f, f13);
        canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        canvas.restore();
        canvas.translate(0.0f, f14);
        canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @ColorInt int i10) {
        if (f10 == f11) {
            return;
        }
        float f12 = this.trackLength;
        float f13 = this.displayedCornerRadius;
        float f14 = ((-f12) / 2.0f) + f13 + ((f12 - (f13 * 2.0f)) * f10);
        float f15 = ((-f12) / 2.0f) + f13 + ((f12 - (f13 * 2.0f)) * f11);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        float f16 = this.displayedTrackThickness;
        canvas.drawRect(f14, (-f16) / 2.0f, f15, f16 / 2.0f, paint);
        float f17 = this.displayedCornerRadius;
        RectF rectF = new RectF(-f17, -f17, f17, f17);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f14, true, rectF);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f15, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        float f10 = ((-this.trackLength) / 2.0f) + this.displayedCornerRadius;
        float f11 = -f10;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iCompositeARGBWithAlpha);
        float f12 = this.displayedTrackThickness;
        canvas.drawRect(f10, (-f12) / 2.0f, f11, f12 / 2.0f, paint);
        float f13 = this.displayedCornerRadius;
        RectF rectF = new RectF(-f13, -f13, f13, f13);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f10, true, rectF);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f11, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        Rect clipBounds = canvas.getClipBounds();
        this.trackLength = clipBounds.width();
        float f11 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.drawable.isShowing() && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.drawable.isShowing() || this.drawable.isHiding()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (f10 - 1.0f)) / 2.0f);
        }
        float f12 = this.trackLength;
        canvas.clipRect((-f12) / 2.0f, (-f11) / 2.0f, f12 / 2.0f, f11 / 2.0f);
        S s10 = this.spec;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s10).trackThickness * f10;
        this.displayedCornerRadius = ((LinearProgressIndicatorSpec) s10).trackCornerRadius * f10;
    }
}
