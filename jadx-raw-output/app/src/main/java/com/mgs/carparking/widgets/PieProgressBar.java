package com.mgs.carparking.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.mgs.carparking.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public class PieProgressBar extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f42306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42310f;

    public PieProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PieProgressBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42309e = 0;
        this.f42306b = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PieProgressBar);
        this.f42307c = typedArrayObtainStyledAttributes.getColor(2, Color.parseColor("#ffffff"));
        this.f42308d = typedArrayObtainStyledAttributes.getColor(1, Color.parseColor("#ffffff"));
        this.f42310f = typedArrayObtainStyledAttributes.getInt(0, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getMaxProgress() {
        return this.f42310f;
    }

    public void setMaxProgress(int i10) {
        if (i10 > 0) {
            this.f42310f = i10;
        }
    }

    public void setProgress(int i10) {
        int i11 = this.f42310f;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        this.f42309e = i10;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        this.f42306b.setColor(this.f42308d);
        this.f42306b.setStyle(Paint.Style.STROKE);
        this.f42306b.setStrokeWidth(1.0f);
        canvas.drawCircle(width, width, width, this.f42306b);
        this.f42306b.setStyle(Paint.Style.FILL);
        this.f42306b.setColor(this.f42308d);
        float f10 = (width + width) - 3.0f;
        canvas.drawArc(new RectF(3.0f, 3.0f, f10, f10), -90.0f, (this.f42309e * 360) / this.f42310f, true, this.f42306b);
    }
}
