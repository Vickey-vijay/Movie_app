package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes10.dex */
public class RoundedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f70133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f70134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f70135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f70136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f70137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f70138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f70139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f70140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f70141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f70142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f70143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f70144l;

    public RoundedFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f70138f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedFrameLayout);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_radius, 0.0f);
            this.f70133a = dimension;
            this.f70134b = dimension;
            this.f70135c = dimension;
            this.f70136d = dimension;
            if (dimension == 0.0f) {
                this.f70133a = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topLeftRadius, 0.0f);
                this.f70134b = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topRightRadius, 0.0f);
                this.f70135c = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomLeftRadius, 0.0f);
                this.f70136d = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomRightRadius, 0.0f);
            }
            this.f70141i = typedArrayObtainStyledAttributes.getColor(R.styleable.RoundedFrameLayout_bigo_ad_shadowColor, Color.parseColor("#00FFFFFF"));
            this.f70142j = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_shadowRadius, -1.0f);
            a();
        } catch (Exception unused) {
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void a() {
        if (this.f70142j > 0.0f) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.f70143k = paint;
            paint.setShadowLayer(this.f70142j, 0.0f, 0.0f, this.f70141i);
        }
    }

    private Path getPath() {
        Path path = new Path();
        float f10 = this.f70133a;
        float f11 = this.f70134b;
        float f12 = this.f70136d;
        float f13 = this.f70135c;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        RectF rectF = this.f70144l;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.f70133a = f10;
        this.f70134b = f11;
        this.f70135c = f12;
        this.f70136d = f13;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f70143k != null) {
            float f10 = this.f70142j;
            RectF rectF = new RectF(f10, f10, getWidth() - this.f70142j, getHeight() - this.f70142j);
            this.f70144l = rectF;
            float f11 = this.f70133a;
            canvas.drawRoundRect(rectF, f11, f11, this.f70143k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.f70139g;
        float f12 = this.f70137e;
        RectF rectF2 = this.f70140h;
        if (paint != null && rectF2 != null && f12 > 0.0f) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                paint.setColor(this.f70138f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f12);
                paint.setAntiAlias(true);
                rectF2.set(0.0f, 0.0f, width, height);
                float f13 = this.f70133a;
                canvas.drawRoundRect(rectF2, f13, f13, paint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadiusBottomLeft() {
        return this.f70135c;
    }

    public float getCornerRadiusBottomRight() {
        return this.f70136d;
    }

    public float getCornerRadiusTopLeft() {
        return this.f70133a;
    }

    public float getCornerRadiusTopRight() {
        return this.f70134b;
    }

    public void setCornerRadius(float f10) {
        a(f10, f10, f10, f10);
    }

    public void setShadowColor(@ColorInt int i10) {
        this.f70141i = i10;
        invalidate();
    }

    public void setShadowRadius(float f10) {
        boolean z10 = this.f70143k == null;
        this.f70142j = f10;
        if (z10) {
            a();
        }
        invalidate();
    }

    public void setStrokeColor(@ColorInt int i10) {
        this.f70138f = i10;
        if (this.f70139g == null) {
            this.f70139g = new Paint();
        }
        if (this.f70140h == null) {
            this.f70140h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f70137e = f10;
        if (this.f70139g == null) {
            this.f70139g = new Paint();
        }
        if (this.f70140h == null) {
            this.f70140h = new RectF();
        }
        invalidate();
    }
}
