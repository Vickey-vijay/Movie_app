package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes9.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private float adjustedRadius;
    private int arcDirectionFactor;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    private void drawRoundedEnd(Canvas canvas, Paint paint, float f10, float f11, float f12, boolean z10, RectF rectF) {
        float f13 = z10 ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f12);
        float f14 = f10 / 2.0f;
        float f15 = f13 * f11;
        canvas.drawRect((this.adjustedRadius - f14) + f11, Math.min(0.0f, this.arcDirectionFactor * f15), (this.adjustedRadius + f14) - f11, Math.max(0.0f, f15 * this.arcDirectionFactor), paint);
        canvas.translate((this.adjustedRadius - f14) + f11, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f13) * 90.0f * this.arcDirectionFactor, true, paint);
        canvas.translate(f10 - (f11 * 2.0f), 0.0f);
        canvas.drawArc(rectF, 0.0f, f13 * 90.0f * this.arcDirectionFactor, true, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @ColorInt int i10) {
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.displayedTrackThickness);
        int i11 = this.arcDirectionFactor;
        float f12 = f10 * 360.0f * i11;
        float f13 = (f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10) * 360.0f * i11;
        float f14 = this.adjustedRadius;
        canvas.drawArc(new RectF(-f14, -f14, f14, f14), f12, f13, false, paint);
        if (this.displayedCornerRadius <= 0.0f || Math.abs(f13) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        float f15 = this.displayedCornerRadius;
        RectF rectF = new RectF(-f15, -f15, f15, f15);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f12, true, rectF);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f12 + f13, false, rectF);
    }

    private int getSize() {
        S s10 = this.spec;
        return ((CircularProgressIndicatorSpec) s10).indicatorSize + (((CircularProgressIndicatorSpec) s10).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        S s10 = this.spec;
        float f11 = (((CircularProgressIndicatorSpec) s10).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s10).indicatorInset;
        canvas.translate(f11, f11);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s11 = this.spec;
        this.arcDirectionFactor = ((CircularProgressIndicatorSpec) s11).indicatorDirection == 0 ? 1 : -1;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s11).trackThickness * f10;
        this.displayedCornerRadius = ((CircularProgressIndicatorSpec) s11).trackCornerRadius * f10;
        this.adjustedRadius = (((CircularProgressIndicatorSpec) s11).indicatorSize - ((CircularProgressIndicatorSpec) s11).trackThickness) / 2.0f;
        if ((this.drawable.isShowing() && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (this.drawable.isHiding() && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
            this.adjustedRadius += ((1.0f - f10) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        } else if ((this.drawable.isShowing() && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            this.adjustedRadius -= ((1.0f - f10) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((CircularProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iCompositeARGBWithAlpha);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f10 = this.adjustedRadius;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.arcDirectionFactor = 1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }
}
