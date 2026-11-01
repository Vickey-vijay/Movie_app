package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f34121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f34122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f34131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f34132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f34135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f34136p;

    public MBRotationView(Context context) {
        super(context);
        this.f34125e = 40;
        this.f34126f = 20;
        this.f34127g = 0;
        this.f34128h = 0;
        this.f34130j = 0;
        this.f34131k = 0.5f;
        this.f34132l = 0.9f;
        this.f34133m = true;
        this.f34134n = false;
        this.f34135o = false;
        this.f34136p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f34127g * this.f34123c) / 2) / this.f34125e;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f34127g) > this.f34125e / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            i11 = this.f34135o ? this.f34128h - 2 : this.f34128h + 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : this.f34128h;
            } else if (this.f34135o) {
                i12 = this.f34128h;
                i11 = i12 - 1;
            } else {
                i13 = this.f34128h;
                i11 = i13 + 1;
            }
        } else if (this.f34135o) {
            i13 = this.f34128h;
            i11 = i13 + 1;
        } else {
            i12 = this.f34128h;
            i11 = i12 - 1;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f34131k;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.f34132l;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f34123c = (int) (f12 * f13);
        this.f34124d = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f34124d;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f34123c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void a() {
        this.f34121a = new Camera();
        this.f34122b = new Matrix();
        setWillNotDraw(false);
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f34136p, 1000 / this.f34126f);
        }
        this.f34133m = z10;
    }

    public void setHeightRatio(float f10) {
        this.f34132l = f10;
    }

    public void setRotateV(boolean z10) {
        this.f34134n = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f34131k = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f34134n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f34127g * this.f34124d) / 2) / this.f34125e;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f34127g) > this.f34125e / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void b(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f34121a.translate(0.0f, f10, 0.0f);
            float f11 = -i11;
            this.f34121a.rotateX(f11);
            this.f34121a.translate(0.0f, f10, 0.0f);
            this.f34121a.translate(0.0f, f10, 0.0f);
            this.f34121a.rotateX(f11);
            this.f34121a.translate(0.0f, f10, 0.0f);
            return;
        }
        if (i12 == 1) {
            this.f34121a.translate(0.0f, f10, 0.0f);
            this.f34121a.rotateX(i11);
            this.f34121a.translate(0.0f, f10, 0.0f);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f34121a.rotateX(0.0f);
        } else {
            this.f34121a.translate(0.0f, f10, 0.0f);
            this.f34121a.rotateX(-i11);
            this.f34121a.translate(0.0f, f10, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34125e = 40;
        this.f34126f = 20;
        this.f34127g = 0;
        this.f34128h = 0;
        this.f34130j = 0;
        this.f34131k = 0.5f;
        this.f34132l = 0.9f;
        this.f34133m = true;
        this.f34134n = false;
        this.f34135o = false;
        this.f34136p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f34121a.save();
        this.f34122b.reset();
        float f10 = i10;
        this.f34121a.translate(0.0f, f10, 0.0f);
        this.f34121a.rotateX(this.f34127g);
        this.f34121a.translate(0.0f, f10, 0.0f);
        if (i10 == 0) {
            if (this.f34135o) {
                b(this.f34123c, this.f34125e, i12);
            } else {
                b(-this.f34123c, -this.f34125e, i12);
            }
        } else if (i10 > 0) {
            b(this.f34123c, this.f34125e, i12);
        } else if (i10 < 0) {
            b(-this.f34123c, -this.f34125e, i12);
        }
        this.f34121a.getMatrix(this.f34122b);
        this.f34121a.restore();
        this.f34122b.preTranslate((-getWidth()) / 2, -i11);
        this.f34122b.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f34122b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f34127g - 1;
        this.f34127g = i10;
        this.f34129i = this.f34128h;
        a(i10);
        if (this.f34133m) {
            postDelayed(this.f34136p, 1000 / this.f34126f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34125e = 40;
        this.f34126f = 20;
        this.f34127g = 0;
        this.f34128h = 0;
        this.f34130j = 0;
        this.f34131k = 0.5f;
        this.f34132l = 0.9f;
        this.f34133m = true;
        this.f34134n = false;
        this.f34135o = false;
        this.f34136p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f34121a.save();
        this.f34122b.reset();
        float f10 = i10;
        this.f34121a.translate(f10, 0.0f, 0.0f);
        this.f34121a.rotateY(this.f34127g);
        this.f34121a.translate(f10, 0.0f, 0.0f);
        if (i10 == 0) {
            if (this.f34135o) {
                a(this.f34124d, this.f34125e, i12);
            } else {
                a(-this.f34124d, -this.f34125e, i12);
            }
        } else if (i10 > 0) {
            a(this.f34124d, this.f34125e, i12);
        } else if (i10 < 0) {
            a(-this.f34124d, -this.f34125e, i12);
        }
        this.f34121a.getMatrix(this.f34122b);
        this.f34121a.restore();
        this.f34122b.preTranslate(-i11, (-getHeight()) / 2);
        this.f34122b.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f34122b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int i10) {
        int i11 = this.f34125e;
        int i12 = this.f34129i - (i10 / i11);
        this.f34127g = i10 % i11;
        b(i12);
        invalidate();
    }

    private void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f34121a.translate(f10, 0.0f, 0.0f);
            float f11 = -i11;
            this.f34121a.rotateY(f11);
            this.f34121a.translate(f10, 0.0f, 0.0f);
            this.f34121a.translate(f10, 0.0f, 0.0f);
            this.f34121a.rotateY(f11);
            this.f34121a.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f34121a.translate(f12, 0.0f, 0.0f);
            this.f34121a.rotateY(i11);
            this.f34121a.translate(f12, 0.0f, 0.0f);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f34121a.rotateY(0.0f);
        } else {
            float f13 = (-i10) / 2;
            this.f34121a.translate(f13, 0.0f, 0.0f);
            this.f34121a.rotateY(-i11);
            this.f34121a.translate(f13, 0.0f, 0.0f);
        }
    }

    private void b(int i10) {
        int iC;
        this.f34128h = i10;
        if (Math.abs(this.f34127g) > this.f34125e / 2) {
            iC = c(2);
        } else {
            iC = c(3);
        }
        if (this.f34130j != iC) {
            this.f34130j = iC;
        }
    }
}
