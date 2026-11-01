package com.mgs.carparking.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.mgs.carparking.R$styleable;

/* JADX INFO: loaded from: classes11.dex */
public class MaxLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f42299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f42300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f42301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f42303f;

    public MaxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42300c = -1.0f;
        this.f42301d = -1.0f;
        this.f42299b = context;
        c(attributeSet);
    }

    public final int a(int i10) {
        float f10 = this.f42300c;
        return (f10 > -1.0f && ((float) i10) > f10) ? (int) f10 : i10;
    }

    public final int b(int i10) {
        float f10 = this.f42301d;
        return (f10 > -1.0f && ((float) i10) > f10) ? (int) f10 : i10;
    }

    public final void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f42299b.obtainStyledAttributes(attributeSet, R$styleable.MaxLayout);
        this.f42300c = typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        this.f42301d = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        this.f42302e = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.f42303f = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean d() {
        int i10;
        return this.f42303f > 0.0f && ((i10 = this.f42302e) == 1 || i10 == 2);
    }

    public float getMaxHeight() {
        return this.f42300c;
    }

    public float getMaxWidth() {
        return this.f42301d;
    }

    public float getRatio() {
        return this.f42303f;
    }

    public int getRatioStandrad() {
        return this.f42302e;
    }

    public void setMaxHeight(float f10) {
        this.f42300c = f10;
    }

    public void setMaxWidth(float f10) {
        this.f42301d = f10;
    }

    public void setRatio(float f10) {
        this.f42303f = f10;
    }

    public void setRatioStandrad(int i10) {
        this.f42302e = i10;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iB;
        int iA;
        boolean zD = d();
        if (this.f42301d <= -1.0f && this.f42300c <= -1.0f && !zD) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        Log.d("MaxLayout", "origin onMeasure: widthSize =" + size2 + "heightSize = " + size);
        int i12 = this.f42302e;
        if (i12 == 1) {
            iB = b(size2);
            float f10 = this.f42303f;
            if (f10 >= 0.0f) {
                size = (int) (iB * f10);
            }
            iA = a(size);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iB, mode2), View.MeasureSpec.makeMeasureSpec(iA, 1073741824));
        } else if (i12 == 2) {
            iA = a(size);
            float f11 = this.f42303f;
            if (f11 >= 0.0f) {
                size2 = (int) (iA * f11);
            }
            iB = b(size2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iB, 1073741824), View.MeasureSpec.makeMeasureSpec(iA, mode));
        } else {
            iB = b(size2);
            iA = a(size);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iB, mode2), View.MeasureSpec.makeMeasureSpec(iA, mode));
        }
        Log.d("MaxLayout", "adjust onMeasure: widthSize =" + iB + "heightSize = " + iA);
    }
}
