package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;

/* JADX INFO: loaded from: classes4.dex */
public class HorizontalProgressWheelView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f45759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f45760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f45762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f45763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f45768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45769l;

    public interface a {
        void a();

        void b();

        void c(float f10, float f11);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45759b = new Rect();
        a();
    }

    public final void b(MotionEvent motionEvent, float f10) {
        this.f45768k -= f10;
        postInvalidate();
        this.f45761d = motionEvent.getX();
        a aVar = this.f45760c;
        if (aVar != null) {
            aVar.c(-f10, this.f45768k);
        }
    }

    public void setMiddleLineColor(@ColorInt int i10) {
        this.f45769l = i10;
        this.f45763f.setColor(i10);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f45760c = aVar;
    }

    public final void a() {
        this.f45769l = ContextCompat.getColor(getContext(), R$color.ucrop_color_widget_rotate_mid_line);
        this.f45764g = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_width_horizontal_wheel_progress_line);
        this.f45765h = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_height_horizontal_wheel_progress_line);
        this.f45766i = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f45762e = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f45762e.setStrokeWidth(this.f45764g);
        this.f45762e.setColor(getResources().getColor(R$color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f45762e);
        this.f45763f = paint2;
        paint2.setColor(this.f45769l);
        this.f45763f.setStrokeCap(Paint.Cap.ROUND);
        this.f45763f.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_width_middle_wheel_progress_line));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f45759b);
        int iWidth = this.f45759b.width();
        int i10 = this.f45764g;
        int i11 = this.f45766i;
        int i12 = iWidth / (i10 + i11);
        float f10 = this.f45768k % (i11 + i10);
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i12 / 4;
            if (i13 < i14) {
                this.f45762e.setAlpha((int) ((i13 / i14) * 255.0f));
            } else if (i13 > (i12 * 3) / 4) {
                this.f45762e.setAlpha((int) (((i12 - i13) / i14) * 255.0f));
            } else {
                this.f45762e.setAlpha(255);
            }
            float f11 = -f10;
            Rect rect = this.f45759b;
            float f12 = rect.left + f11 + ((this.f45764g + this.f45766i) * i13);
            float fCenterY = rect.centerY() - (this.f45765h / 4.0f);
            Rect rect2 = this.f45759b;
            canvas.drawLine(f12, fCenterY, f11 + rect2.left + ((this.f45764g + this.f45766i) * i13), rect2.centerY() + (this.f45765h / 4.0f), this.f45762e);
        }
        canvas.drawLine(this.f45759b.centerX(), this.f45759b.centerY() - (this.f45765h / 2.0f), this.f45759b.centerX(), (this.f45765h / 2.0f) + this.f45759b.centerY(), this.f45763f);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x10 = motionEvent.getX() - this.f45761d;
                    if (x10 != 0.0f) {
                        if (!this.f45767j) {
                            this.f45767j = true;
                            a aVar = this.f45760c;
                            if (aVar != null) {
                                aVar.b();
                            }
                        }
                        b(motionEvent, x10);
                    }
                }
            } else {
                a aVar2 = this.f45760c;
                if (aVar2 != null) {
                    this.f45767j = false;
                    aVar2.a();
                }
            }
        } else {
            this.f45761d = motionEvent.getX();
        }
        return true;
    }
}
