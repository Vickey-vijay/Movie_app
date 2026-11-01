package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class RoundedImageView extends ImageView implements sg.bigo.ads.common.view.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f70145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f70146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f70147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f70148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f70149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f70150f;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    public RoundedImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f70145a = Float.NaN;
        this.f70146b = Float.NaN;
        this.f70147c = Float.NaN;
        this.f70148d = Float.NaN;
        this.f70150f = -1;
    }

    private void a() {
        if (getOutlineProvider() instanceof sg.bigo.ads.common.view.b.b) {
            return;
        }
        super.setOutlineProvider(new sg.bigo.ads.common.view.b.b());
    }

    private RectF getImageRectF() {
        float fMin;
        float fMin2;
        float fMax;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = getDrawable();
        float f10 = 0.0f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float[] fArr = new float[9];
            Matrix imageMatrix = getImageMatrix();
            if (imageMatrix != null && !imageMatrix.isIdentity()) {
                imageMatrix.getValues(fArr);
            }
            float f11 = fArr[2];
            float f12 = fArr[5];
            float f13 = fArr[0];
            float f14 = fArr[4];
            float fMax2 = Float.isNaN(f11) ? 0.0f : Math.max(0.0f, f11);
            fMax = Float.isNaN(f12) ? 0.0f : Math.max(0.0f, f12);
            fMin = Math.min(((Float.isNaN(f13) || f13 <= 0.0f) ? intrinsicWidth : intrinsicWidth * f13) + fMax2, measuredWidth);
            fMin2 = Math.min(((Float.isNaN(f14) || f14 <= 0.0f) ? intrinsicHeight : intrinsicHeight * f14) + fMax, measuredHeight);
            f10 = fMax2;
        } else {
            fMin = measuredWidth;
            fMin2 = measuredHeight;
            fMax = 0.0f;
        }
        return new RectF(f10, fMax, fMin, fMin2);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.f70145a = f10;
        this.f70146b = f11;
        this.f70147c = f12;
        this.f70148d = f13;
        invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Path clipPath = getClipPath();
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        super.draw(canvas);
        RectF imageRectF = getImageRectF();
        if (this.f70149e > 0.0f && !imageRectF.isEmpty()) {
            Paint paint = new Paint();
            paint.setColor(this.f70150f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f70149e);
            paint.setAntiAlias(true);
            float f10 = this.f70145a;
            canvas.drawRoundRect(imageRectF, f10, f10, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // sg.bigo.ads.common.view.b.a
    public Path getClipPath() {
        RectF imageRectF = getImageRectF();
        if (Float.isNaN(this.f70145a) || Float.isNaN(this.f70146b) || Float.isNaN(this.f70148d) || Float.isNaN(this.f70147c) || imageRectF == null || imageRectF.isEmpty()) {
            return null;
        }
        Path path = new Path();
        float[] fArr = new float[8];
        float f10 = Float.isNaN(this.f70145a) ? 0.0f : this.f70145a;
        fArr[0] = f10;
        fArr[1] = f10;
        float f11 = Float.isNaN(this.f70146b) ? 0.0f : this.f70146b;
        fArr[2] = f11;
        fArr[3] = f11;
        float f12 = Float.isNaN(this.f70148d) ? 0.0f : this.f70148d;
        fArr[4] = f12;
        fArr[5] = f12;
        float f13 = Float.isNaN(this.f70147c) ? 0.0f : this.f70147c;
        fArr[6] = f13;
        fArr[7] = f13;
        path.addRoundRect(imageRectF, fArr, Path.Direction.CW);
        return path;
    }

    public void setCornerRadius(float f10) {
        a(f10, f10, f10, f10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        a();
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
    }

    public void setStrokeColor(@ColorInt int i10) {
        this.f70150f = i10;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f70149e = f10;
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        a();
    }
}
