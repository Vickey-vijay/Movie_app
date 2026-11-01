package com.yalantis.ucrop.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;
import com.yalantis.ucrop.R$styleable;
import gd.d;
import kd.c;
import kd.g;

/* JADX INFO: loaded from: classes11.dex */
public class OverlayView extends View {
    public int A;
    public boolean B;
    public d C;
    public ValueAnimator D;
    public boolean E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f45695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f45696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f45699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f45700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f45703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f45704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Path f45709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint f45710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint f45711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Paint f45712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Paint f45713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f45715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f45716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f45717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f45718y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f45719z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (OverlayView.this.C != null) {
                OverlayView.this.C.b(OverlayView.this.f45695b);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f45721b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f45722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f45723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ RectF f45724e;

        public b(int i10, int i11, RectF rectF) {
            this.f45722c = i10;
            this.f45723d = i11;
            this.f45724e = rectF;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = this.f45722c * ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float fFloatValue2 = this.f45723d * ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RectF rectF = OverlayView.this.f45695b;
            RectF rectF2 = this.f45724e;
            rectF.set(new RectF(rectF2.left + fFloatValue, rectF2.top + fFloatValue2, rectF2.right + fFloatValue, rectF2.bottom + fFloatValue2));
            OverlayView.this.n();
            OverlayView.this.postInvalidate();
            if (OverlayView.this.C != null) {
                OverlayView.this.C.a(this.f45722c * (((Float) valueAnimator.getAnimatedValue()).floatValue() - this.f45721b), this.f45723d * (((Float) valueAnimator.getAnimatedValue()).floatValue() - this.f45721b));
            }
            this.f45721b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g() {
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45695b = new RectF();
        this.f45696c = new RectF();
        this.f45704k = null;
        this.f45709p = new Path();
        this.f45710q = new Paint(1);
        this.f45711r = new Paint(1);
        this.f45712s = new Paint(1);
        this.f45713t = new Paint(1);
        this.f45714u = 0;
        this.f45715v = -1.0f;
        this.f45716w = -1.0f;
        this.f45717x = -1;
        this.f45718y = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.f45719z = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_min_size);
        this.A = getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        g();
    }

    public void d(@NonNull Canvas canvas) {
        if (this.f45706m) {
            if (this.f45704k == null && !this.f45695b.isEmpty()) {
                this.f45704k = new float[(this.f45701h * 4) + (this.f45702i * 4)];
                int i10 = 0;
                for (int i11 = 0; i11 < this.f45701h; i11++) {
                    float[] fArr = this.f45704k;
                    int i12 = i10 + 1;
                    RectF rectF = this.f45695b;
                    fArr[i10] = rectF.left;
                    int i13 = i12 + 1;
                    float f10 = i11 + 1.0f;
                    float fHeight = rectF.height() * (f10 / (this.f45701h + 1));
                    RectF rectF2 = this.f45695b;
                    fArr[i12] = fHeight + rectF2.top;
                    float[] fArr2 = this.f45704k;
                    int i14 = i13 + 1;
                    fArr2[i13] = rectF2.right;
                    i10 = i14 + 1;
                    fArr2[i14] = (rectF2.height() * (f10 / (this.f45701h + 1))) + this.f45695b.top;
                }
                for (int i15 = 0; i15 < this.f45702i; i15++) {
                    float[] fArr3 = this.f45704k;
                    int i16 = i10 + 1;
                    float f11 = i15 + 1.0f;
                    float fWidth = this.f45695b.width() * (f11 / (this.f45702i + 1));
                    RectF rectF3 = this.f45695b;
                    fArr3[i10] = fWidth + rectF3.left;
                    float[] fArr4 = this.f45704k;
                    int i17 = i16 + 1;
                    fArr4[i16] = rectF3.top;
                    int i18 = i17 + 1;
                    float fWidth2 = rectF3.width() * (f11 / (this.f45702i + 1));
                    RectF rectF4 = this.f45695b;
                    fArr4[i17] = fWidth2 + rectF4.left;
                    i10 = i18 + 1;
                    this.f45704k[i18] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f45704k;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f45711r);
            }
        }
        if (this.f45705l) {
            canvas.drawRect(this.f45695b, this.f45712s);
        }
        if (this.f45714u != 0) {
            canvas.save();
            this.f45696c.set(this.f45695b);
            RectF rectF5 = this.f45696c;
            int i19 = this.A;
            rectF5.inset(i19, -i19);
            canvas.clipRect(this.f45696c, Region.Op.DIFFERENCE);
            this.f45696c.set(this.f45695b);
            RectF rectF6 = this.f45696c;
            int i20 = this.A;
            rectF6.inset(-i20, i20);
            canvas.clipRect(this.f45696c, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f45695b, this.f45713t);
            canvas.restore();
        }
    }

    public final int f(float f10, float f11) {
        double d10 = this.f45718y;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f10 - this.f45699f[i11], 2.0d) + Math.pow(f11 - this.f45699f[i11 + 1], 2.0d));
            if (dSqrt < d10) {
                i10 = i11 / 2;
                d10 = dSqrt;
            }
        }
        if (this.f45714u == 1 && i10 < 0 && this.f45695b.contains(f10, f11)) {
            return 4;
        }
        return i10;
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f45695b;
    }

    public int getFreestyleCropMode() {
        return this.f45714u;
    }

    public d getOverlayViewChangeListener() {
        return this.C;
    }

    public final void h(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R$color.ucrop_color_default_crop_frame));
        this.f45712s.setStrokeWidth(dimensionPixelSize);
        this.f45712s.setColor(color);
        this.f45712s.setStyle(Paint.Style.STROKE);
        this.f45713t.setStrokeWidth(dimensionPixelSize * 3);
        this.f45713t.setColor(color);
        this.f45713t.setStyle(Paint.Style.STROKE);
    }

    public final void i(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R$color.ucrop_color_default_crop_grid));
        this.f45711r.setStrokeWidth(dimensionPixelSize);
        this.f45711r.setColor(color);
        this.f45701h = typedArray.getInt(R$styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.f45702i = typedArray.getInt(R$styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    public void j(@NonNull TypedArray typedArray) {
        this.f45707n = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R$styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R$color.ucrop_color_default_dimmed));
        this.f45708o = color;
        this.f45710q.setColor(color);
        this.f45710q.setStyle(Paint.Style.STROKE);
        this.f45710q.setStrokeWidth(c.a(getContext(), 1.0f));
        h(typedArray);
        this.f45705l = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_show_frame, true);
        i(typedArray);
        this.f45706m = typedArray.getBoolean(R$styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    public void k() {
        int i10 = this.f45697d;
        float f10 = this.f45703j;
        int i11 = (int) (i10 / f10);
        int i12 = this.f45698e;
        if (i11 > i12) {
            int i13 = (int) (i12 * f10);
            int i14 = (i10 - i13) / 2;
            this.f45695b.set(getPaddingLeft() + i14, getPaddingTop(), getPaddingLeft() + i13 + i14, getPaddingTop() + this.f45698e);
        } else {
            int i15 = (i12 - i11) / 2;
            this.f45695b.set(getPaddingLeft(), getPaddingTop() + i15, getPaddingLeft() + this.f45697d, getPaddingTop() + i11 + i15);
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.b(this.f45695b);
        }
        n();
    }

    public final void l() {
        Point point = new Point((getRight() + getLeft()) / 2, (getTop() + getBottom()) / 2);
        int iCenterY = (int) (point.y - this.f45695b.centerY());
        int iCenterX = (int) (point.x - this.f45695b.centerX());
        RectF rectF = new RectF(this.f45695b);
        new RectF(this.f45695b).offset(iCenterX, iCenterY);
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.D = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.D.setInterpolator(new OvershootInterpolator(1.0f));
        this.D.addListener(new a());
        this.D.addUpdateListener(new b(iCenterX, iCenterY, rectF));
        this.D.start();
    }

    public final void m(float f10, float f11) {
        this.f45696c.set(this.f45695b);
        int i10 = this.f45717x;
        if (i10 == 0) {
            RectF rectF = this.f45696c;
            RectF rectF2 = this.f45695b;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i10 == 1) {
            RectF rectF3 = this.f45696c;
            RectF rectF4 = this.f45695b;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i10 == 2) {
            RectF rectF5 = this.f45696c;
            RectF rectF6 = this.f45695b;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i10 == 3) {
            RectF rectF7 = this.f45696c;
            RectF rectF8 = this.f45695b;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i10 == 4) {
            this.f45696c.offset(f10 - this.f45715v, f11 - this.f45716w);
            if (this.f45696c.left <= getLeft() || this.f45696c.top <= getTop() || this.f45696c.right >= getRight() || this.f45696c.bottom >= getBottom()) {
                return;
            }
            this.f45695b.set(this.f45696c);
            n();
            postInvalidate();
            return;
        }
        boolean z10 = this.f45696c.height() >= ((float) this.f45719z);
        boolean z11 = this.f45696c.width() >= ((float) this.f45719z);
        RectF rectF9 = this.f45695b;
        rectF9.set(z11 ? this.f45696c.left : rectF9.left, z10 ? this.f45696c.top : rectF9.top, z11 ? this.f45696c.right : rectF9.right, z10 ? this.f45696c.bottom : rectF9.bottom);
        if (z10 || z11) {
            n();
            postInvalidate();
        }
    }

    public final void n() {
        this.f45699f = g.b(this.f45695b);
        this.f45700g = g.a(this.f45695b);
        this.f45704k = null;
        this.f45709p.reset();
        this.f45709p.addCircle(this.f45695b.centerX(), this.f45695b.centerY(), Math.min(this.f45695b.width(), this.f45695b.height()) / 2.0f, Path.Direction.CW);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f45695b.isEmpty() && this.f45714u != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int iF = f(x10, y10);
                this.f45717x = iF;
                boolean z10 = iF != -1;
                if (!z10) {
                    this.f45715v = -1.0f;
                    this.f45716w = -1.0f;
                } else if (this.f45715v < 0.0f) {
                    this.f45715v = x10;
                    this.f45716w = y10;
                }
                return z10;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f45717x != -1) {
                float fMin = Math.min(Math.max(x10, getPaddingLeft()), getWidth() - getPaddingRight());
                float fMin2 = Math.min(Math.max(y10, getPaddingTop()), getHeight() - getPaddingBottom());
                m(fMin, fMin2);
                this.f45715v = fMin;
                this.f45716w = fMin2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.f45715v = -1.0f;
                this.f45716w = -1.0f;
                this.f45717x = -1;
                d dVar = this.C;
                if (dVar != null) {
                    dVar.b(this.f45695b);
                }
                if (this.B) {
                    l();
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.f45707n = z10;
    }

    public void setCircleStrokeColor(@ColorInt int i10) {
        this.f45710q.setColor(i10);
    }

    public void setCropFrameColor(@ColorInt int i10) {
        this.f45712s.setColor(i10);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i10) {
        this.f45712s.setStrokeWidth(i10);
    }

    public void setCropGridColor(@ColorInt int i10) {
        this.f45711r.setColor(i10);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i10) {
        this.f45702i = i10;
        this.f45704k = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i10) {
        this.f45701h = i10;
        this.f45704k = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i10) {
        this.f45711r.setStrokeWidth(i10);
    }

    public void setDimmedColor(@ColorInt int i10) {
        this.f45708o = i10;
    }

    public void setDimmedStrokeWidth(@IntRange(from = 0) int i10) {
        this.f45710q.setStrokeWidth(i10);
    }

    public void setDragSmoothToCenter(boolean z10) {
        this.B = z10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.f45714u = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        this.f45714u = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.C = dVar;
    }

    public void setShowCropFrame(boolean z10) {
        this.f45705l = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.f45706m = z10;
    }

    public void setTargetAspectRatio(float f10) {
        this.f45703j = f10;
        if (this.f45697d <= 0) {
            this.E = true;
        } else {
            k();
            postInvalidate();
        }
    }

    public void e(@NonNull Canvas canvas) {
        canvas.save();
        if (this.f45707n) {
            canvas.clipPath(this.f45709p, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f45695b, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f45708o);
        canvas.restore();
        if (this.f45707n) {
            canvas.drawCircle(this.f45695b.centerX(), this.f45695b.centerY(), Math.min(this.f45695b.width(), this.f45695b.height()) / 2.0f, this.f45710q);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f45697d = width - paddingLeft;
            this.f45698e = height - paddingTop;
            if (this.E) {
                this.E = false;
                setTargetAspectRatio(this.f45703j);
            }
        }
    }
}
