package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yu extends View {
    private List<Integer> bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private Paint f11551cf;
    private float fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f11552jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11553le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private float f11554lh;
    private float mwh;
    private int ouw;
    private List<Integer> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f11555ra;
    private float ryl;
    private Paint tlj;
    private int vt;
    private int yu;

    public yu(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void ouw() {
        this.f11555ra = true;
        invalidate();
    }

    public final void setCoreRadius(int i10) {
        this.f11554lh = i10;
    }

    public final void setMaxWidth(int i10) {
        this.fkw = i10;
    }

    public final void vt() {
        this.f11555ra = false;
        this.bly.clear();
        this.pno.clear();
        this.pno.add(255);
        this.bly.add(0);
        invalidate();
    }

    private yu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.tlj.setShader(new LinearGradient(this.ryl, 0.0f, this.mwh, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            if (i10 >= this.pno.size()) {
                break;
            }
            Integer num = this.pno.get(i10);
            this.tlj.setAlpha(num.intValue());
            Integer num2 = this.bly.get(i10);
            if (this.f11554lh + num2.intValue() < this.fkw) {
                canvas.drawCircle(this.ryl, this.mwh, this.f11554lh + num2.intValue(), this.tlj);
            }
            if (num.intValue() > 0 && num2.intValue() < this.fkw) {
                this.pno.set(i10, Integer.valueOf(num.intValue() - this.f11553le > 0 ? num.intValue() - (this.f11553le * 3) : 1));
                this.bly.set(i10, Integer.valueOf(num2.intValue() + this.f11553le));
            }
            i10++;
        }
        List<Integer> list = this.bly;
        if (list.get(list.size() - 1).intValue() >= this.fkw / this.yu) {
            this.pno.add(255);
            this.bly.add(0);
        }
        if (this.bly.size() >= 3) {
            this.bly.remove(0);
            this.pno.remove(0);
        }
        this.tlj.setAlpha(255);
        this.tlj.setColor(this.vt);
        canvas.drawCircle(this.ryl, this.mwh, this.f11554lh, this.f11551cf);
        if (this.f11555ra) {
            invalidate();
        }
    }

    public final void setColor(int i10) {
        this.ouw = i10;
    }

    public final void setCoreColor(int i10) {
        this.vt = i10;
    }

    public final void setDiffuseSpeed(int i10) {
        this.f11553le = i10;
    }

    public final void setDiffuseWidth(int i10) {
        this.yu = i10;
    }

    private yu(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, -1);
        this.ouw = -1;
        this.vt = SupportMenu.CATEGORY_MASK;
        this.f11554lh = 18.0f;
        this.yu = 3;
        this.fkw = 50.0f;
        this.f11553le = 2;
        this.f11555ra = false;
        this.pno = new ArrayList();
        this.bly = new ArrayList();
        this.f11552jg = 24;
        Paint paint = new Paint();
        this.tlj = paint;
        paint.setAntiAlias(true);
        this.tlj.setStrokeWidth(this.f11552jg);
        this.pno.add(255);
        this.bly.add(0);
        Paint paint2 = new Paint();
        this.f11551cf = paint2;
        paint2.setAntiAlias(true);
        this.f11551cf.setColor(Color.parseColor("#0FFFFFFF"));
        this.f11551cf.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        this.ryl = f10;
        this.mwh = i11 / 2.0f;
        float f11 = f10 - (this.f11552jg / 2.0f);
        this.fkw = f11;
        this.f11554lh = f11 / 4.0f;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }
}
